# LinearCongruenceGenerator

A Linear Congruence Generator implementation in Java.

[![Build status](https://ci.appveyor.com/api/projects/status/8f9ch2va9f6qdc1d?svg=true)](https://ci.appveyor.com/project/SeppPenner/linearcongruencegenerator)
[![GitHub issues](https://img.shields.io/github/issues/SeppPenner/LinearCongruenceGenerator.svg)](https://github.com/SeppPenner/LinearCongruenceGenerator/issues)
[![GitHub forks](https://img.shields.io/github/forks/SeppPenner/LinearCongruenceGenerator.svg)](https://github.com/SeppPenner/LinearCongruenceGenerator/network)
[![GitHub stars](https://img.shields.io/github/stars/SeppPenner/LinearCongruenceGenerator.svg)](https://github.com/SeppPenner/LinearCongruenceGenerator/stargazers)
[![License: MIT](https://img.shields.io/badge/License-MIT-blue.svg)](https://raw.githubusercontent.com/SeppPenner/LinearCongruenceGenerator/master/License.txt)

Link to the Linear Congruence Generator implementation in C#: https://github.com/SeppPenner/LinearCongruenceGeneratorC-/blob/master/README.md

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

See the [Changelog](https://github.com/SeppPenner/LinearCongruenceGenerator/blob/master/Changelog.md).
