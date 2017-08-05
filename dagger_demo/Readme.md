# Dagger2 学习
## 使用方法(Demo代码)
```java
//Component
/*
* 中间人，注入器
* 处理依赖提供（目标类依赖实力）和依赖需求者（目标类）
* 可以是抽象类或者是个接口
*/
@Component(modules = CarMoudle.class)
public interface CarComponent {
    void inject(Car car);

}

// Module
/*
* 依赖提供者，
* 管理依赖，
* 如果以后构造函数或依赖变化，就只需改动这里就行
* 类似工厂方法，创建依赖类实例
* 可以使用其他第三方库作为依赖提供
* */
@Module
public class CarMoudle {
    @Provides
    public Engine provideEngine(){
        return new Engine();
    }
    @Provides
    public Seat provideSeat(){
        return new Seat();
    }
    @Provides
    public Wheel provideWheel(){
        return new Wheel();
    }

}
// 使用 （@Inject）
/*
        * 利用Dagger2生成的类来传入依赖对象
        **/
public class Car {

    @Inject
    Engine engine;
    @Inject
    Wheel wheel;
    @Inject
    Seat seat;

    public Car() {
        DaggerCarComponent
            .builder()
            .carMoudle(new CarMoudle())  //初始化carmoudle
            .build()
            .inject(this);
        Log.d(Config.TAG, "new Car() Dagger");
    }
```
## 基本注解说明
### @Inject  can apply to at most one constructor per class。一个类中最多对应一个构造函数

代表需要依赖的地方

> 如果要对应多个构造函数（带参数的构造函数），使用Qualifier 注解来实现这个需求 

### @Module

依赖提供者

- 包含其他module
  @Module(includes = {})
#### @Provides
在Module中使用，构造对象并提供依赖
### @Component 注入器
- 使用方法
    @Component(Modules = {xx.class,xxx.class,....})
## 其他注解(高级)
### @Qualifier  修饰器
### @Scope
### @Singleton

> 参考文章链接
> http://www.jianshu.com/p/cd2c1c9f68d4 系列文章
>
> http://www.jianshu.com/p/c673e6e73c8b 系列文章
>
> https://google.github.io/dagger//users-guide.html 官方文档
>
> [dagger2 sample](https://insight.io/github.com/google/dagger/tree/master/examples/simple/src/main/java/coffee/)
>
> [官方项目GitHub地址](https://github.com/google/dagger)

## Dagger2背后的设计原则: 依赖注入、控制反转

### 控制反转  [Inversion of Control](https://en.wikipedia.org/wiki/Inversion_of_control)

> Rather than low level code calling up to high level code, high level code can receive lower level code that it can call down to.

监听用户的操作来执行自定义代码，功能。框架监听用户的操作，执行自定义代码 => 按需调用

#### 实现例子

- 依赖注入
- 事件循环
- 回调
- 调用

### 依赖注入 [Dependency injection](https://en.wikipedia.org/wiki/Dependency_injection#Assembling_examples)

将依赖关系传递给使用它的依赖对象，客户端根据需要更改成不同的对象(其他的依赖对象，来减少客户端的代码变化)

- 分离对象初始化和使用
- 让注入器(第三方)负责引用客户端和其依赖关系

## 相关知识，下一步了解知识

### 需要增强的知识(还不理解的地方)

- dagger2在项目应用
- dagger2实现原理

###  需要复习的知识

- 设计模式: 工厂模式，代理模式
- java反射
- 类加载机制

> todo(要看，要学习的)
>
> - [ ] [dagger2详细介绍](http://www.jcodecraeer.com/a/anzhuokaifa/androidkaifa/2015/0519/2892.html)
> - [ ] [官方视频资源](https://google.github.io/dagger//resources.html)
> - [ ] [Dagger2 中的Android应用官方文档](https://google.github.io/dagger//android.html)
> - [ ] [相关实例App](https://github.com/android10/Android-CleanArchitecture/tree/master)
> - [ ] java注解
> - [ ] dagger2 高级功能

