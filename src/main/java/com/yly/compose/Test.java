package com.yly.compose;

public class Test {

    public static void main(String[] args) {

        QuackableFactory normalQuackableFactory = new NormalQuackableFactory();
        QuackableFactory countQuackableFactory = new CountQuackableFactory();
        Quackable whiteDuck = countQuackableFactory.createWhiteDuck();
        Quackable blackDuck = countQuackableFactory.createBlackDuck();

        QuackableFacade facade = new QuackableFacade();
        facade.addQuackable(whiteDuck);
        facade.addQuackable(blackDuck);

        Quackable goose = new GooseAdapter(new Goose());

        facade.addQuackable(goose);

        facade.addObserver(new DuckObserver());

        facade.quack();
        System.out.println(CounterDecoQuackable.getCount());
    }
}
