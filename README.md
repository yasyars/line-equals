# Line Cartesian

## Problem Description

Program can model a line based on points consisting of (x, y) coordinates using the cartesian system and program can calculate its length.

## Requirements

The project needs these dependencies:

- [Java JDK 12](https://www.oracle.com/java/technologies/javase/jdk12-archive-downloads.html)
- [JUnit 5](https://junit.org/junit5/)

## How to Run the Test

Run this following command on terminal in your root project file

```bash
./gradlew test
```

## How to Build

- Run this following command on terminal in your root project file

```bash
./gradlew build
```

## How to Use

- Import the library into your program
- Create a line (x1, x2, y1, y2) using Line class like this:

```java
int x1 = 1;
int y1 = 2;
int x2 = 3;
int y2 = 4;
Line line = new Line(x1, y1, x2, y2);

double length = line.getLength();
```
