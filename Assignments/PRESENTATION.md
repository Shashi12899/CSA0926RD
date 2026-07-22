
# Individual Presentation Guide: Q6 – StringBuilder Operations

**Course:** Programming in Java

**Topic:** StringBuilder Class Operations

**Presenter / Student GitHub:** Shashi12899

---

# 🎤 Presentation Slides Overview

## Slide 1: Title & Student Introduction

**Title:** StringBuilder Operations in Java

**Presenter:** Shashi12899

**Objective:**
Demonstrating how the Java `StringBuilder` class performs efficient string manipulation using operations like `append()`, `insert()`, `delete()`, `replace()`, `reverse()`, and `capacity()`.

---

## Slide 2: What is StringBuilder?

**Definition:**

`StringBuilder` is a mutable class in Java that allows modification of strings without creating new objects.

### Key Characteristics

* Mutable (contents can be changed).
* Faster than `String` for repeated modifications.
* Located in the `java.lang` package.
* Used for efficient string manipulation.

---

## Slide 3: Append & Insert Operations

### append()

Adds text at the end of an existing string.

Example:

```java
sb.append(" Language");
```

Output:

```
Java Programming Language
```

### insert()

Inserts text at a specified position.

Example:

```java
sb.insert(5, " Core");
```

Output:

```
Java Core Programming Language
```

---

## Slide 4: Delete & Replace Operations

### delete()

Removes characters between two indexes.

Example:

```java
sb.delete(5,10);
```

Output:

```
Java Programming Language
```

### replace()

Replaces characters between two indexes.

Example:

```java
sb.replace(5,16,"Advanced");
```

Output:

```
Java Advanced Language
```

---

## Slide 5: Reverse & Capacity Operations

### reverse()

Reverses the entire string.

Example:

```java
sb.reverse();
```

### capacity()

Returns the current storage capacity of the StringBuilder.

Example:

```java
System.out.println(sb.capacity());
```

Initially the default capacity is

```
16 + length of initial string
```

---

## Slide 6: Summary & Best Practices

### Best Practices

* Use **StringBuilder** when modifying strings repeatedly.
* It provides better performance than the `String` class.
* Useful for loops and large text processing.
* Common methods include:

  * append()
  * insert()
  * delete()
  * replace()
  * reverse()
  * capacity()

---

# 💬 Presenter Verbal Script for Teacher Viva

> "Good day Teacher. My name is **Shashi12899**, and today I am presenting **Question 10: StringBuilder Operations in Java**.
>
> The StringBuilder class is a mutable class provided by Java for efficient string manipulation. Unlike the String class, it allows us to modify the contents without creating new objects, making it faster and more memory efficient.
>
> In my assignment, I demonstrated several important StringBuilder methods:
>
> **Append:** Adds new text at the end of the existing string.
>
> **Insert:** Inserts text at a specific position in the string.
>
> **Delete:** Removes characters between specified indexes.
>
> **Replace:** Replaces a portion of the string with new text.
>
> **Reverse:** Reverses the entire string.
>
> **Capacity:** Displays the current storage capacity of the StringBuilder object.
>
> Each operation is demonstrated separately with clear outputs so that the behavior of every method can be easily understood.
>
> StringBuilder is widely used in Java applications whenever frequent string modifications are required because it provides better performance than the immutable String class.
>
> Thank you!"