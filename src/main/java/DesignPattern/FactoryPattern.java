package DesignPattern;

/**
 * 工厂模式
 * http://blog.csdn.net/lemon_tree12138/article/details/46225213
 */
public class FactoryPattern {

    /*
    工厂模式的目的在于程序的可扩展性。

    1. 简单工厂
    简单工厂模式的工厂类一般是使用静态方法，通过接收的参数的不同来返回不同的对象实例。
    对于简单工厂模式来说，它是为了让程序有一个更好地封装，降低程序模块之间的耦合程度。
    对于简单的工厂模式，其实也可以将其理解成为一个创建对象的工具类。

    2.工厂方法
    理解

    工厂方法是针 对每一种产品提供一个工厂类 。通过不同的工厂实例来创建不同的产品实例。
    在同一等级结构中， 支持增加任意产品 。

    3.抽象工厂
    理解

    抽象工厂是应对产品族概念的。比如说，每个汽车公司可能要同时生产轿车，货车，客车，那么每一个工厂都要有创建轿车，货车和客车的方法。
    应对产品族概念而生，增加新的产品线很容易，但是无法增加新的产品。
    和工厂方法的区别是，抽象工厂往往有多种方法，可以生产多种产品，即产品簇。


    */
}
