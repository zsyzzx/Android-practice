package cn.seventeams.dagger_demo.learndagger2;

import dagger.Module;
import dagger.Provides;

/**
 * Created by seven on 2017/8/2.
 */
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
