# StringBuilder Operations

**Course:** Programming in Java  
**Topic:** StringBuilder Mutability (append(), insert(), delete())  
**Assignment Type:** Individual Assignment (Q6 – StringBuilder Operations)  
**GitHub Account:** Shashi12899

---

# 📌 Problem Statement

Write a Java program that demonstrates the mutability of the **StringBuilder** class.

The program should:

- Create a StringBuilder object with an initial string.
- Append additional text using `append()`.
- Insert text at a specified position using `insert()`.
- Delete a portion of the text using `delete()`.
- Display the contents of the StringBuilder after every operation to show how the same object is modified.

---

# 💡 Theoretical Background

## What is StringBuilder?

`StringBuilder` is a mutable class available in the `java.lang` package. Unlike the `String` class, it allows modifications without creating new objects.

### String vs StringBuilder

| String | StringBuilder |
|---------|---------------|
| Immutable | Mutable |
| Creates a new object after every modification | Modifies the existing object |
| Slower for repeated modifications | Faster and memory efficient |
| Suitable for fixed text | Suitable for frequently changing text |

---

# 🔬 StringBuilder Methods Demonstrated

| Method | Description | Example |
|---------|-------------|---------|
| `append()` | Adds text to the end | `sb.append(" Language");` |
| `insert()` | Inserts text at a specific position | `sb.insert(5, " Core");` |
| `delete()` | Removes characters between indexes | `sb.delete(5, 10);` |

---

# 📁 Folder Structure

```
Assignments/
└── Q6_StringBuilderOperations/
    ├── bin/
    │   └── StringBuilderOperationsDemo.class
    ├── src/
    │   └── StringBuilderOperationsDemo.java
    ├── README.md
    └── PRESENTATION.md
```

---

# 🚀 Execution Guide

## 1. Compile the Program

```bash
javac -d bin src/StringBuilderOperationsDemo.java
```

## 2. Run the Program

```bash
java -cp bin StringBuilderOperationsDemo
```

---

# 📊 Sample Output

```
Initial StringBuilder:
Java Programming

After append():
Java Programming Language

After insert():
Java Core Programming Language

After delete():
Java Programming Language
```

---

# 📖 Concepts Covered

- StringBuilder Mutability
- append()
- insert()
- delete()
- Efficient String Manipulation
- Mutable Objects in Java

---

# Learning Outcomes

After completing this assignment, students will be able to:

- Understand the difference between String and StringBuilder.
- Perform string manipulation using StringBuilder methods.
- Demonstrate mutable object behavior in Java.
- Write clean and efficient Java programs.

---

# 👨‍💻 Submission Information

**Course:** Programming in Java

**Assignment:** Q6 – StringBuilder Operations

**GitHub Repository Owner:** Shashi12899

**Presentation:** Refer to `PRESENTATION.md` for presentation slides and viva script.
