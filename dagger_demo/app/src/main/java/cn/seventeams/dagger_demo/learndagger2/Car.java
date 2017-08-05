package cn.seventeams.dagger_demo.learndagger2;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by seven on 2017/8/2.
 */

public class Car {
    //    private Engine engine;
//    private Seat seat;
//    private Wheel wheel;
    /*
    * @Inject 说明依赖类*/
    @Inject
    Engine engine;
    @Inject
    Wheel wheel;
    @Inject
    Seat seat;

    public Car() {
//        engine = new Engine();
//        seat = new Seat();
//        wheel = new Wheel();
//        DaggerCarComponent.builder().build().inject(this);
        /*
        * 利用Dagger2生成的类来传入依赖对象
        **/
        DaggerCarComponent.builder().carMoudle(new CarMoudle()).build().inject(this);

        Log.d(Config.TAG, "new Car() Dagger");
    }

//    public class CarWithDagger2 {
//        @Inject
//        Engine engine;
//        @Inject
//        Wheel wheel;
//        @Inject
//        Seat seat;
//
//        public CarWithDagger2() {
//            DaggerCarComponent.builder().carMoudle(new CarMoudle()).build().inject(this);
//            Log.d(Config.TAG, "new CarWithDagger2");
//        }
//    }
}

