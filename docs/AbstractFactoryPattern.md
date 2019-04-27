# Abstract Factory Pattern

Abstract Factory patterns work around **a super-factory** which creates other factories. This factory is also called as **factory of factories**. This type of design pattern comes under **creational pattern** as this pattern provides one of the best ways to create an object.

In Abstract Factory pattern an interface is responsible for creating a factory of related objects without explicitly specifying their classes. Each generated factory can give the objects as per the **Factory pattern**.

> 其实我对于Abstract Factory Pattern的理解就是在Factory Pattern的基础上再进行一次“抽象”。换句话说，在Factory Pattern中，用一个Factory来创建各个Instance；在Abstract Factory Pattern中，分两步，第一步是先选择创建哪个Factory，第二步是由Factory来创建Object Instance。其实吧，我觉得，Abstract Factory Pattern，只要你愿意，可以抽象更多层。
