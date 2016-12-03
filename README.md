# LinearCongruenceGenerator
Linear Congruence Generator implementation in Java

Link to Linear Congruence Generator implementation in C#: https://github.com/SeppPenner/LinearCongruenceGeneratorC-/blob/master/README.md

## Basic usage:
```java
public class ExampleUsage {
    private LinearCongruenceGenerator random = new LinearCongruenceGenerator(
            (long) Math.pow(2,32), 1664525, 1013904223, 0);
}
```

See https://en.wikipedia.org/wiki/Linear_congruential_generator for good parameters.

Change history
--------------

* **Version 1.0.0 (2016-12-03)** : Added basic usage to Readme.
* **Version 1.0.0 (2016-07-13)** : 1.0 release.
