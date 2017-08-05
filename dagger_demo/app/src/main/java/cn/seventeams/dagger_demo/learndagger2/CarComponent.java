package cn.seventeams.dagger_demo.learndagger2;



import dagger.Component;

/**
 * Created by seven on 2017/8/2.
 */

/*
* 中间人，注入器
* 处理依赖提供（目标类依赖实力）和依赖需求者（目标类）
* 可以是抽象类或者是个接口*/
@Component(modules = CarMoudle.class)
public interface CarComponent {
    void inject(Car car);

}
