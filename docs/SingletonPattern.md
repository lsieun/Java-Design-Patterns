# Singleton Pattern

Singleton pattern is one of the **simplest design patterns** in Java. This type of design pattern comes under **creational pattern** as this pattern provides one of the best ways to create an object.

This pattern involves a single class which is responsible to create an object while **making sure that only single object** gets created. This class provides a way to access its only object which can be accessed directly without need to instantiate the object of the class.

> 它的关键点在于保证创建的Object Instance的唯一性，而妨碍“唯一性”的两个关键问题：第一个问题，就是在这个Class的外部不能通过new来创建对象；第二个问题，就是在这个Class的内部要面对“并发”的挑战。
