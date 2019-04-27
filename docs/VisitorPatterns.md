# Visitor Patterns

## 我的理解

面向对象的一个重要概念是“封装”，而“封装”就是将一些“字段”和一些“方法”放到一个“类”里面，让这个“类”作为一个“整体”，向“外部”提供“服务”。换句话说，一个“类”，就是对“数据”和“算法”的封装。

这个Visitor Pattern我是这样理解的：假设有一个“类”，它里面有一些“字段”和另一些“方法”；这个时候，从这个最初的“类”中，将所有的“字段”抽离出来，成为一个只包含“数据”的“类”，这些“数据”就是这个“类”的财富，这个类被称为“富翁”；同时，从那个最初的“类”中，将所有的“方法”抽离出来，成为一个只包含“算法”的“类”，这些“算法”就是这个“类”的工作技能（比如，种花、种树、理发等等），这个类被称为“长工”。这两种角色的关系就是，富翁会请长工来提供服务，不同类型的长工提供的服务也是不同的，这些长工被称为“来访者（Visitor）”。

谈到富翁与长工的“合作方式”，我觉得又分为两种，当然这两种方式是从富翁的角度出发的。一种方式是，富翁非常有自己的想法，告诉长工第一要做什么，第二要做什么，第三要做什么，等等等等；另一种方式，富翁是一个“思想的自由主义者”，他可能认为自己的想法可能未必是最好的，把更多的主动权交给长工，认为长工是一个值得尊重的“艺术家”，让长工去规划要做什么比较好，而富翁自己则提供资源就好了。

## GoF Definition

GoF Definition: Represent an operation to be performed on the elements of an object structure. The visitor pattern lets you define a new operation without changing the classes of the elements on which it operates.

## Concept

This pattern helps us to add new functionalities to an existing object structure in such a way that the old structure remains unaffected by these changes. So, we can follow the **open/close principle** here (i.e., extension allowed but modification disallowed for entities like class, function, modules, etc.).
