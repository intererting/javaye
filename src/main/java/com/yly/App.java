package com.yly;

import com.yly.adapter.Bark;
import com.yly.adapter.BarkAdapter;
import com.yly.adapter.Bird;
import com.yly.adapter.Dog;
import com.yly.decoration.Esprosso;
import com.yly.decoration.Mocha;
import com.yly.facade.HomeFacade;
import com.yly.facade.TV;
import com.yly.facade.Video;
import com.yly.factory.Factory;
import com.yly.factory.Product;
import com.yly.factory.SichuanFactory;
import com.yly.observer.DisplayElement;
import com.yly.observer.Subject;
import com.yly.observer.ValueData;
import com.yly.observer.ValueDisplay;
import com.yly.starter.FlyDuck;
import com.yly.starter.FlyWithWings;

/**
 * 设计原则
 * <p>
 * 1:多用组合,少用继承（策略模式）
 * 2:为了交互对象的松耦合而努力
 * 3:多扩展开放,对修改关闭（装饰模式）
 * 4:要依赖抽象,不要依赖具体类（工厂模式）
 * 5:对象之间认识的越少越好（门面模式）
 * 6:一个类应该只有一个引起变化的原因
 * <p>
 * <p>
 * <p>
 * 依赖倒置原则
 * 1:变量不可以持有具体类的应用(工厂)
 * 2:不要让类派生自具体类(抽象)
 * 3:不要覆盖基类中已实现的方法
 */
public class App {
    public static void main(String[] args) {
//        ***********策略模式*************
//        FlyDuck flyDuck = new FlyDuck(new FlyWithWings());
//        flyDuck.performFly();
//        flyDuck.eat();

//        **************观察者模式**************
//        ValueData valueData = new ValueData();
//        DisplayElement display = new ValueDisplay(valueData);
//        valueData.setValue("haha update");

//        ***************装饰模式***************
//        Mocha mocha = new Mocha(new Esprosso());
//        System.out.println(mocha.cost());
//        System.out.println(mocha.getDescription());

//        ************工厂模式*************
//        Factory factory = new SichuanFactory();
//        Product product = factory.produce();
//        product.getDescription();

//        ***************适配器模式(对象适配器)****************
//        Bark bark = new Dog();
//        bark.bark();
//        bark = new BarkAdapter(new Bird());
//        bark.bark();

//        *************门面模式(将对象进行封装，使对象见知道的越少越好)***************
//        HomeFacade facade = new HomeFacade(new TV(), new Video());
//        facade.play();

    }
}
