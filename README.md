# Design Pattern Studies

It's based on https://refactoring.guru/pt-br/design-patterns/catalog

## Patterns Types

### Creationals

| Name | Popularity | Description | Implemented |
|------|------------|-------------|-------------|
**Abstract Factory** | *MAX* | It allows you to produce families of related objects without specify your concrete classes. | *NO* |
**Builder** | *MAX* | It allows you to build complexy objects step by step. The pattern allows you to build different types of an object using the same build code. | *NO* |
**Factory Method** | *MAX* | It produces an interface to build objects in a superclass, but also allows that the subclasses change the type of the objects that will be made | *NO* |
**Prototype** | *MED* | It allows you to copy existing objects without making the code being depedent of its classes | *NO* |
**Singleton** | *MED* | It allows you to garantee that a class will have only one instance, while it supplies an global access point to this instance  | *NO* |

### Behavioral

| Name | Popularity | Description | Implemented |
|------|------------|-------------|-------------|
**Command** | *MAX* | It turns a request into a independent object that have all the information about this request. This transformation allows you to parameterize methods with differents requests, delay or put the request execution in a line, and suport operations that may not be done. | *NO* |
**Strategy** | *MAX* | It allows you to define a algorithm family and place them into separeted classes and then make their objects interchangeable  | *NO* |
**Iterator** | *MAX* | It allows you to pass through elements in a collection without show the strucutural representation of it (lists, stacks, trees, etc) | *NO* |
**Observer** | *MAX* | It allows you to define a subscripition mechanism to notify multiple events when they happen to a object that is being observed  | *NO* |
**Mediator** | *MED* | It allows you to reduce the caothics dependencies between objects. The pattern restricts the direct comunication between the objects and forces them to colaborate through the mediator object | *NO* |
**State** | *MED* | It allows an object to change its behavior when its internal state changes. Like it have changed its class | *NO* | v'
**Template Method** | *MED* | Defines a skeleton of an algorithm in the superclass but it let the subclasses to overwrite specifics steps of the algorithm without changing it structure | *NO* |
**Chain of Responsibility** | *MIN* | It allows you to pass requisitions through a handlers chain. When it recives a request, each handle will decide if it process the request or pass it to the next handler in the chain | *NO* |
**Memento** | *MIN* | It allows you to save and restore a previous state of an object without reveailing the implementation details  | *NO* |
**Visitor** | *MIN* | It allows you to split algorithms of the objects which they operate on | *NO* |

### Structural 

| Name | Popularity | Description | Implemented |
|------|------------|-------------|-------------|
**Adapter** | *MAX* | It allows the colaboration between objects of incompatible interfaces | *NO* |
**Composite** | *MED* | It allows you to compose objects in tree structures and then work with this structure as it were individuals objects  | *NO* |
**Decorator** | *MED* | It allows you to add new behaviors to objects placing them inside a wrapper of objects which have the behaviors  | *NO* |
**Facade** | *MED* | It supplies an simplifed interface to a lib, a framework, or any other complex group of classes   | *NO* |
**Bridge** | *MIN* | It allows you to divide a big class or a group of classes heavly bound in two separeted hierarchy - abstraction and implementation - that may be developed apartly from each other  | *NO* |
**Flyweight** | *MIN* | It allows you to create more objects using less RAM memory just sharing parts of the state between objects instead of keeping all objects data  | *NO* |
**Proxy** | *MIN* | It allows you to provide a replacement or a reserved space to other object. A proxy controls the access to the original object, allowing you to do something before or after the original request get to the original object | *NO* |



