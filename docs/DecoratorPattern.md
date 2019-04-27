# Decorator Pattern

Decorator pattern allows a user to **add new functionality** to an existing object without altering its structure. This type of design pattern comes under **structural pattern** as this pattern acts as a **wrapper** to existing class.

This pattern creates **a decorator class** which wraps the **original class** and provides additional functionality **keeping class methods signature intact**.

## GoF Definition

GoF Definition: Attach additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.

## Concept

This main principle of this pattern says that we cannot modify existing functionalities but we can extend them. In other words, this pattern is **open for extension but closed for modification**. The core concept applies when we want to add some specific functionalities to some specific object instead of to the whole class.

## Note

What are the **main advantages** of using **decorator patterns**?

1. Without disturbing existing objects in the system, we can add new functionality to a particular object.

> 作者有话说：这句意思就是讲open for extension but closed for modification

2. We can code incrementally. For example, we’ll make a simple class first and then one by one we can add decorator objects to them as needed. As a result, we do not need to take care of each and every possible scenario in the beginning. On the other hand, we must acknowledge that making a complex class first and then extending its functionality is a much more complex procedure.

What is the **major disadvantage** of using this pattern?

First of all, if we are careful enough, there is no significant disadvantage. But if we create too many decorators in the system, the system will be hard to maintain and debug. At the same time, the decorators can create unnecessary confusion.
