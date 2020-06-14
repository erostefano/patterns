# Basic
The basic patterns are used within the advanced patterns.

## Inheritance
When you need to extend an existing class. It is recommended for situations like: a student IS A person.

* Upcasting: Up the inheritance tree
* Downcasting: Down the inheritance tree

## Interface
When similar classes need a different logic.

> An interface does nothing until logic has been implemented.

## Delegation
When you want to pass some functionality from another class.

* From the inside: by instantiation of class
* From the outside: by the constructor or method param

## Strategy
When depending on the context a different object needs to be instantiated.

## Immutable
When an object must not be changed. It makes sense when you have some fields which should be set at program start and should not be changed later.

## Marker
When you need to add information at class level. You can implement the empty interface Serializable to tell the class using your object that it can be serialized.

The implementation can be checked by `if(someObj instanceof Serializable)`.
 
> Serializable means the object can be represented as a sequence of bytes.

> For study purposes the interface Punchable has been used.

## Annotation
When you need to add information to classes, members or methods. Annotations should replace marker interfaces.

* @Deprecated: the class is backward compatible and should not be used for new code
* @Override: checks if the super class has actually the method which should be overridden

The example shows the use of annotations with Java Reflection API.

> Reflection means the object know its structure.

# Creation
When you need to create some objects.

## Singleton
When a single instance is enough.

* Logging. 

## Factory
When the creation of an object is quite complex and depends on many other objects.

# Structure
When the actual structure is not suitable and needs to be customized.

## Facade
When an API offers you many methods but actually you need just a few.

## Adapter
When a library does not suit with your current code so you wrap the library inside an adapter to make it suitable.

## Proxy
When you do not want to access directly a service.

* Getting the data costs a lot: You build up a cache for the following requests.
* Getting the data is restricted: You check the user authorisations.

## Data Access Object
When you need to divide business and persistence logic.

> Dividing the logic is called Separation of Concern.

## Generic DAO
When you need to persist multiple domain objects you can use a generic data access object to avoid duplicate code.

# Behavior
When the is complex.

## Observer
When an object needs to be notifieds when another one changes. To achieve this you need to register an observer to the observable. As soon the observable changes it will notify the registered observers.

> The example registers multiple observers

## Decorator
When you need an enhanced interface to the original object to add implementations dynamically.

## Interceptor
When some events require specific pre-processing or post-processing.

* Intercepting an incoming request to verify the authorization.
* Intercepting an outgoing request to add authorisation.
