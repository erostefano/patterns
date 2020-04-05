# Basic
The basic patterns are used within the advanced pattern.

## Inheritance
A new class is created by extending another one. It is recommended for situations like: a student IS A person.

* Upcasting: Up the inheritance tree
* Downcasting: Down the inheritance tree

## Interface
An interface defines methods which a class must implement. Those implementations can be passed back to the interface for better abstraction.

## Delegation
The delegation adds some functionality from another class.

* From the inside: by instantiation of class
* From the outside: by the constructor or method param

## Strategy
Depending on a condition in the Context-Class (in this case StrategyExample) a specific class is instantiated and passed to the interface.

## Immutable
Creating an object which cannot be changed. This makes sense when you have some fields which should be set at program start and should not be changed later.

## Marker
It is used to mark information at class level. For example you can implement the empty interface Serializable to tell the class using your object that it can be serialized.

The implementation can be checked by `if(someObj instanceof Serializable)`.
 
> Serializable means the object can be represented as a sequence of bytes.

> For study purposes the interface Punchable has been used.

## Annotation
Annotations give the chance to mark and also to add metadata to the code.

* @Deprecated: the class is backward compatible and should not be used for new code
* @Override: checks if the super class has actually the method which should be overridden

The example shows the use of annotations with Java Reflection API.

> Reflection means the object know its structure.

# Creation
The creation patterns handle the creation of objects.

## Singleton
The singleton pattern is used when you just need one instance of a class: E. g. when communicating with a printer or logging. 

## Factory
The factory pattern is used when the creation of an object might be difficult or take pretty much lines of code. For those cases there are helpers like factories which create the object.

# Structure
The structures pattern are used when the actual structure is not suitable and needs to be customized.

## Facade
An API may offer you many methods to handle things. But often you do not need them all, you just need a few customized methods for your specific use case. For those cases you can create a Facade class which uses the APIs methods and offers some public methods to simplify things for you.

## Adapter
Libraries offer functions which you can use in your own code. But sometimes they just do not fit out of the box in your code. For those cases you can create an adapter class which wraps those functions. 

## Proxy
The proxy pattern is used when for some reasons you do not want to access directly a service. Instead you go over a proxy which then passes your request to the actual service.

* Getting the data costs a lot: You build up a cache for the following requests.
* Getting the data is restricted: You check the user authorisations.

## Data Access Object
The idea is to divide business logic and persistence logic by using the DAO pattern.

> Dividing the logic is called Separation of Concern.

## Generic DAO
To persist multiple domain objects you can use a generic data access object to avoid duplicate code. To achieve this you have to use Generics.

# Behavior
The behavior patterns are used when the behavior is complex.

## Observer
Sometimes when an object changes you need to notify other objects so they can react. To achieve this you need to register an observer to the observable. As soon the observable gets changed it will notify registered observer.

> The example registers multiple observers

## Decorator
A decorator provides an enhanced interface to the original object to add implementations dynamically.
