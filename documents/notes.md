#### Abstract Classes vs Interface

1. Interfaces are good substitue for multiple inheritance as Java class can only extend one class whether it's abstract or not.
2. Abstract classes are meant to be inherited from.
3. An interface cannot define any method definition. So, the class implementing it HAS TO provide the method definitions.
4. Abstract methods cannot provide method definitions.
5. Abstract class can have non-abstract methods, which can provide method definitions.
6. Classes extending an abstract class HAS TO provide method definitions for the abstract methods or make the subclass abstract.
7. In an interface, all methods need to be public. So, if you need non-public members or methods use abstract class.