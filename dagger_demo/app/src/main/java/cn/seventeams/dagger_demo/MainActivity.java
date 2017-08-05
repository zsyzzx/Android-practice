package cn.seventeams.dagger_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import cn.seventeams.dagger_demo.learndagger2.Car;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Car car = new Car();
//        Car.CarWithDagger2 carWithDagger2 = new Car.CarWithDagger2();
    }
}
