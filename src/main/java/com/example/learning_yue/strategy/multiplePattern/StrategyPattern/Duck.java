package com.design.pattern.strategy.multiplePattern.StrategyPattern;

/**
 * @author yueyz
 * @date 2021-12-04-09:47
 */
public abstract class Duck {
    /**
     * 将实例变量声明为接口类型，每个鸭子对象都会动态地设置这些变量已在运行时引用正确的行为类型
     * 每只鸭子都会引用实现quackBehavior接口的对象
     */
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    DuckCall duckCall;

    public void setDuckCall(DuckCall duckCall) {
        this.duckCall = duckCall;
    }

    /**
     * 动态的设定行为
     *
     * @param flyBehavior
     */
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    //鸭子对象不亲自处理呱呱叫行为而是委托给quackBehavior引用的对象
    public void performQuack() {
        quackBehavior.quack();
    }

    public void perFormFly() {
        flyBehavior.fly();
    }
    public void perDuckCall(){
        duckCall.duckCall();
    }
    public Duck() {
    }

    /**
     * 所有的鸭子都会游泳
     */
    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    ;

    /**
     * 因为每个鸭子外观都不同所以我们需要一个抽象方法
     * display
     */
    abstract void display();
}
