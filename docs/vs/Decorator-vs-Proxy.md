# Decorator VS Proxy

## 世界起源

四元素说是古希腊关于世界的物质组成的学说。这四种元素是土、气、水、火。

暂且称之为“四元论”，其中“元”就是“头、首、始、大”的意思，例如，元首、元旦、元年、元帅、状元（科举考试第一名）。

## 道、法、术、器

- 道，宇宙的运行规律。
- 法，人制定的规则，符合道，则属于“善法”，不符合法，则属于“恶法”
- 术，人做事的方式、方法，例如，要连接两个点，可以画直线，可以画曲线，可以画直线。又比如，人渴了，可以喝水，可以吃西瓜，可以假装不渴。
- 器，人做事时采用的工具，例如，要连接两个点，可以用铅笔，可以用钢笔，可以用粉笔。又比如，人渴了，可以用水杯，可以用勺子，可以靠想象。

## 设计模式的二元论

Decorator Pattern和Proxy Pattern有一定的相似性，它们都是二元论。这种相似性，可以**抽象描述**成这样：A类是一个较为“高级”的类，而B类是一个较为“基础”的类，两者的关系是A类依赖于B类。

**具体来说**，在Decorator Pattern中，有两个概念：“装饰者”和“被装饰者”，“装饰者”是一个较为“高级”的类，而“被装饰者”是一个相对“基础”的类，“装饰者”要依赖于“被装饰者”。

**具体来说**，在Proxy Pattern中，也有两个概念：“代理对象”和“被代理对象”，“代理对象”是一个较为“高级”的类，而“被代理对象”是一个相对“基础”的类，“代理对象”要依赖于“被代理对象”。这里是讲述了两种设计模式的相似性，两者也是“二元论”。

## 设计模式之“道”

坦白的说，我不知道是什么。因为觉得，我们能够观察到的只是“现象”而已，并不能明白真正的“道”是什么。

A design pattern is not invented - it's discovered as a repeated solution to a commonly recurring problem.

不过，有人这样说：

- （等待精彩的说法。。。。。。）

## 设计模式之“法”

我觉得，解决问题最好的方式，就是使用设计模式之“道”，“道”是能够最好、最优的解决问题的途径。但我们终究不知道“道”是什么。

GoF这四个人发现了“设计模式”的“存在”。换句话说，虽然他们也没有找到解决所有问题的“道”，但他们总结了一些特定的问题和处理问题的方法。

我理解，设计模式是一些经常出现的现象及其相应的处理方案，设计模式并不是只包括处理方案，而是同时也包括了问题的描述。

**Decorator Pattern** focuses on dynamically adding functions to an object, while **Proxy Pattern** focuses on controlling access to an object.

> 作者有话说（一）：我觉得这里是在讲两者的“动机”，Decorator Pattern的动机是为某个类（在不修改已有代码的情况下）动态的添加功能，而Proxy Pattern的动机是保护，保护某个类的实例。  
> 作者有话说（二）：当一个设计模式，适合当前需要解决的问题时，就是一个好的选择；如果不适合当前需要解决的问题，就是一个差的选择。

## 设计模式之“术”

装饰器模式关注于在一个对象上动态的添加方法，然而代理模式关注于控制对对象的访问。换句话 说，用代理模式，代理类（proxy class）可以对它的客户隐藏一个对象的具体信息。因此，当使用代理模式的时候，我们常常在一个代理类中创建一个对象的实例。并且，当我们使用装饰器模 式的时候，我们通常的做法是将原始对象作为一个参数传给装饰者的构造器。

Relationship between a **Proxy** and **the real subject** is typically set at **compile time**, Proxy instantiates it in some way, whereas **Decorator** is assigned to **the subject** at **runtime**, knowing only subject's interface.

我们可以用另外一句话来总结这些差别：使用代理模式，代理和真实对象之间的的关系通常在编译时就已经确定了，而装饰者能够在运行时递归地被构造。

代理模式：

```java
//代理模式
public class Proxy implements Subject{

       private Subject subject;
       public Proxy(){
             //关系在编译时确定
            subject = new RealSubject();
       }
       public void doAction(){
             ….
             subject.doAction();
             ….
       }
}

//代理的客户
public class Client{
        public static void main(String[] args){
             //客户不知道代理委托了另一个对象
             Subject subject = new Proxy();
             …
        }
}
```

装饰模式：

```java
//装饰器模式
public class Decorator implements Component{
        private Component component;
        public Decorator(Component component){
            this.component = component
        }
       public void operation(){
            ….
            component.operation();
            ….
       }
}

//装饰器的客户
public class Client{
        public static void main(String[] args){
            //客户指定了装饰者需要装饰的是哪一个类
            Component component = new Decorator(new ConcreteComponent());
            …
        }
}
```
