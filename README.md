# Patterns
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
