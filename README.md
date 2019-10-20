# Basic Patterns
Short examples to the famous patterns in Software Engineering

## Inheritance
A new class is created by extending another one. It is recommended for situations like: a student IS A person.

* Upcasting: Up the inheritance tree
* Downcasting: Down the inheritance tree

## Interface
An interface defines methods which a class must implement. Later those implementations can be passed back to the interface for better abstraction.

## Delegation
Adding some functionality from another class.

* From the inside: by instantiation of class
* From the outside: over the constructor or a method param

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
* @Override: checks if the super has actually the method which should be overridden

The example shows the use of annotations with Java Reflection API.

> Reflection means the objects know his structure.
