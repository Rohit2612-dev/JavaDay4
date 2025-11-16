# ☕ Java Learning - Day 4 Summary

This repository contains the Java code and summarizes the key concepts covered on Day 4, focusing on Object-Oriented Programming (OOP) principles, Interfaces, String handling, and Wrapper Classes.

---

## 1. Object-Oriented Programming (OOP)

The files related to the `geometryapp` package demonstrate core OOP principles through a class hierarchy for shapes (`Shape`, `Circle`, `Rectangle`).

| Concept | Description | Files |
| :--- | :--- | :--- |
| **Inheritance** | `Circle` and `Rectangle` **extend** `Shape`. The base class constructor is called using `super(color)`. Common logic in `draw()` is reused via `super.draw()`. | `Shape.java`, `Circle.java`, `Rectangle.java` |
| **Polymorphism** | **Method Overriding** is used for `draw()`, `calculateArea()`, and `calculatePerimeter()` to provide specific logic for each shape. The `@Override` annotation is recommended. | `Circle.java`, `Rectangle.java` |
| **Encapsulation** | Fields like `radius`, `length`, and `breadth` are private, accessed and controlled via public **getter and setter methods**. | `Circle.java`, `Rectangle.java` |
| **Application** | Serves as the driver program, demonstrating the creation and use of the shape objects. | `GeometryApplication.java` |

---

## 2. Interfaces

The `Drawable.java` file explores how to define and implement interfaces.

* **Interface Definition:** Two interfaces, `Printable` and `Drawable`, are defined.
* **Members:**
    * **Fields:** Variables (e.g., `int PX=1`) are implicitly `public static final`.
    * **Abstract Methods:** Methods like `draw()` and `print()` are implicitly `public abstract`.
    * **Default Methods:** `printFormat()` in `Printable` provides a default implementation.
    * **Static Methods:** `of()` in `Printable` is a static utility method.
* **Implementation:** A `Circle` class implements `Drawable`, providing concrete implementations for its abstract methods.

---

## 3. String, StringBuffer, and StringBuilder

This section compares the three main classes used for handling text in Java.

| Class | Mutability | Key Characteristics | Demonstrations |
| :--- | :--- | :--- | :--- |
| **`String`** | **Immutable** | Content cannot be changed after creation. All modification methods (like `replace()`) return a **new** String object. | Methods like `length()`, `equals()`, `substring()`. Shows literal pooling (`s3 == s4` is **true**) vs. `new` operator (`s1 == s2` is **false**). |
| **`StringBuffer`** | **Mutable** | Content can be modified in-place. **Thread-safe** (synchronized). | Methods like `insert()`, `reverse()`. |
| **`StringBuilder`** | **Mutable** | Content can be modified in-place. **Faster** than `StringBuffer` but **not thread-safe**. | Methods like `insert()`, `reverse()`. |

---

## 4. Wrapper Classes

The `Demowrapper.java` file covers the use of Wrapper classes to bridge the gap between primitive types and objects.

The focus was on converting between data types:

* **Primitive to Wrapper (Boxing):** `int i` to `Integer iObj`.
* **Wrapper to Primitive (Unboxing):** `iObj` to `int j` using `intValue()`.
* **String to Primitive:** Achieved using parsing methods like `Integer.parseInt("888")`.
* **String to Wrapper:** Achieved using factory methods like `Integer.valueOf("777")`.
