# Java-Design-Patterns

:leaves: Java设计模式

A design pattern is not invented - it's discovered as a repeated solution to a commonly recurring problem.

Design patterns represent **the best practices** used by experienced object-oriented software developers. **Design patterns are solutions to general problems** that software developers faced during software development. These solutions were obtained by trial and error by numerous software developers over quite a substantial period of time.

## 网址

- [Software design pattern](https://en.wikipedia.org/wiki/Software_design_pattern)
- [Design Patterns](https://en.wikipedia.org/wiki/Design_Patterns)
- [SOLID](https://en.wikipedia.org/wiki/SOLID)
- [KISS principle](https://en.wikipedia.org/wiki/KISS_principle)
- [Design Patterns in Java Tutorial](https://www.tutorialspoint.com/design_pattern/index.htm)这个网站，列了许多Design Patter，有一些我没有见过的，例如Service Locator Pattern，例子也相对简单，可以学习一下

## What is Gang of Four (GOF)?

In 1994, four authors **Erich Gamma**, **Richard Helm**, **Ralph Johnson** and **John Vlissides** published a book titled **Design Patterns - Elements of Reusable Object-Oriented Software** which initiated the concept of Design Pattern in Software development.

These authors are collectively known as **Gang of Four (GOF)**. According to these authors design patterns are primarily based on the following principles of object orientated design.

- Program to an interface not an implementation
- Favor object composition over inheritance

## Types of Design Patterns

As per the design pattern reference book **Design Patterns - Elements of Reusable Object-Oriented Software** , there are 23 design patterns which can be classified in three categories: **Creational**, **Structural** and **Behavioral patterns**. We'll also discuss another category of design pattern: **J2EE design patterns**.

> as per 按照；根据

| 序号 | Pattern                 | Description                                                  |
| ---- | ----------------------- | ------------------------------------------------------------ |
| 1    | **Creational Patterns** | These design patterns provide a way to create objects while hiding the creation logic, rather than instantiating objects directly using new operator. This gives program more flexibility in deciding which objects need to be created for a given use case. |
| 2    | **Structural Patterns** | These design patterns concern class and object composition. Concept of inheritance is used to compose interfaces and define ways to compose objects to obtain new functionalities. |
| 3    | **Behavioral Patterns** | These design patterns are specifically concerned with communication between objects. |
| 4    | **J2EE Patterns**       | These design patterns are specifically concerned with the presentation tier. These patterns are identified by Sun Java Center. |

分类如下：

- creational pattern
  - Factory Pattern
  - Abstract Factory Pattern
  - Singleton Pattern
  - Builder Pattern，由简单对象组合成复杂对象
  - Prototype Pattern，与Sigleton是相对的，是多个对象，通过复制降低执行成本
- structural pattern
  - Bridge Pattern
  - Filter Pattern
  - Composite Pattern，树状结构
  - Decorator Pattern，就是一层层的外包装
  - Facade Pattern，画繁为简
  - Flyweight Pattern，减少对象创建，提高运行效率，与Singleton和Prototype有某些方面是相同的，Singleton是减少了对象实例的数量为1个，而Prototype是通过clone降低了执行的开销，Flyweight是通过尽量减少实例数量，来提高执行效率
  - Proxy Pattern
- behavioral pattern
  - Chain of Responsibility Pattern，如果自己解决不了，那就交给别人
  - Command Pattern，不理解
  - Interpreter Pattern，不理解
  - Iterator Pattern，不明白数据结构的情况下，能够进行遍历
  - Mediator Pattern，把两个类之间进行沟通的部分，分离到另一个类中
  - Memento Pattern，把自己的当前状态记录下来，以便后来的时间再恢复
  - Observer Pattern，我感觉就是发布者和订阅者的样子
  - State Pattern
  - Strategy Pattern
  - Template Pattern
  - Visitor Pattern

## 关于《设计模式》

下面的内容来自[知乎](https://www.zhihu.com/question/23757906)：

其实GoF的《设计模式》一书，一共有三个层面的内容:

- (1)指出编程开发活动中**存在**模式，提出总结设计模式需要关注的四要素：“名称-问题-解决方案-效果”，并给出描述一套模式的格式模板。
- (2)提出了面向对象开发中”针对接口编程优于针对实现编程”，”组合优于继承”的总体设计思路
- (3)选取了现实开发中基于上述设计思路所形成的23种常见设计模式作为例子详细描述

> 作者有话说：在第(1)中，指出了“存在性”

虽然第3点包括的多个具体的设计模式实例占据了最多的篇幅，但事实上第1,2点才是纲。实际上《设计模式》一书最划时代的意义，在于第1点。在此之后，出现了以设计模式的格式来组织内容的《分析模式》，《企业架构模式》，《企业集成模式》，《xUnit测试模式》，《重构》等等质量颇高的书籍。

在书中有一段我认为非常重要但很容易被忽略的话

> 本书中涉及的设计模式**并不描述新的或未经证实的设计**，我们**只收录那些在不同系统中多次使用过的成功设计**。这些设计的**绝大部分以往并无文本记录**，它们或是来源于面向对象设计者圈子里的非正式交流，或是来源于某些成功的面向对象系统的某些部分，但对设计新手来说，这些东西是很难学得到的。尽管这些设计**不包括新的思路**，但我们**用一种新的、便于理解的方式将其展现给读者**，即：具有统一格式的、已分类编目的若干组设计模式。

这段话的关键是：

1. 书中的模式不是作者的发明创造或独门秘籍，而是早已存在并已经广泛使用的做法，只不过没有被系统地加以记录。换而言之，只要遵循某些原则，这些所谓模式完全可能在无意识的状态下自发出现在产品代码中。

2. 这些模式在各种系统被多次使用。换而言之，你只要接触足够多的代码，必然会大量接触到这些模式的实际应用。只不过在看过《设计模式》一书之前，你可能意识不到这是一个成体系的设计手段。

3. 作者认为《设计模式》这本书的价值在于对设计模式进行了有效的组织和便于理解的描述。换而言之，这本书的写作出发点是“便于理解”，并且是面向“设计新手”的。而不少初学者却恰恰觉得这本书难以理解，这说明，作者已经在保证准确性的前提下，选用了他们所认为最便于理解的描述。比本书描述更为显浅的描述，很可能会牺牲准确性（不准确的描述对于新手来说是显然是害处大于好处）。当然某些人认为是作者表达能力有限，这种事情无法求证，但我倾向于前者。

## 有待验证的想法

第一个想法

```txt
世界上就两种模式
1 DONT REPEAT YOURSELF
2 MAKE THINGS AS LOCAL AS POSSIBLE
所有设计模式本质上都在表达这两条原则。
```

第二个想法：

```txt
如果你真的是要学习设计模式，而不是《设计模式》
那么正确的学习方式就是不断地看优秀的代码。

所有代码中重复出现的东西，都是Pattern，仔细体会这些Pattern所解决的问题，这些Pattern有些可能类似，仔细品味他们之间的区别。最后，你就精通了设计模式。
```

第三个想法：

```txt
我的理解，设计模式是程序局部模块设计的一些惯用法。一般来说惯用法结构的粒度大于编程语言语法元素的粒度，换句话说，语法元素是砖和水泥的话，惯用法就是预制板、通用件。

使用这些经过提炼和巧妙构建的惯用结构来构建你的程序，好处至少有两点：
1.可以减少很多代码细节上的复杂度，提高局部代码的可重用性。
2.对于使用同样的设计模式语言交流的人来说，代码更易读。
```
