# ASCII & Binary Input Processor (Java)

A Java programming task demonstrating **static methods**, **string manipulation**, and **binary data processing** through the implementation of an `InputProcessor` class. The program converts **ASCII text to binary**, **binary to ASCII**, and determines whether a string is a **palindrome**.

This task demonstrates string processing, binary manipulation, loops, conditional logic and method decomposition in Java.

---

## Overview

The program provides three independent utility methods within the `InputProcessor` class.

The class can:

- Convert ASCII text into its binary representation using 8-bit ASCII encoding.
- Convert binary data back into readable ASCII text.
- Determine whether a supplied string is a palindrome.

Each method is implemented as a **static method**, allowing them to be called directly without creating an `InputProcessor` object.

---

## Features

- Convert ASCII text into 8-bit binary.
- Convert binary strings back into ASCII text.
- Process strings containing letters, numbers and spaces.
- Determine whether a string is a palindrome.
- Demonstrate binary manipulation using bitwise operations.
- Demonstrate string processing using loops and conditional logic.

---

## ASCII to Binary Conversion

Each ASCII character is represented using an **8-bit binary value**.

Example:

```text
Input:
Hi
```

Character conversions:

```text
H = 01001000
i = 01101001
```

Result:

```text
0100100001101001
```

---

## Binary to ASCII Conversion

Binary input is processed in groups of eight bits.

Example:

```text
Input:
0100100001101001
```

Binary groups:

```text
01001000
01101001
```

Result:

```text
Hi
```

---

## Palindrome Detection

A palindrome reads the same forwards and backwards.

### Palindrome

```text
Input:
abba

Result:
true
```

---

### Not a Palindrome

```text
Input:
rob

Result:
false
```

---

## Technologies

- Java
- Eclipse IDE
- Object-Oriented Programming (OOP)

---

### Files

| File | Description |
|------|-------------|
| InputProcessor.java | Converts ASCII to binary, binary to ASCII, and checks for palindromes |
| InputProcessorTest.java | Custom test program demonstrating and validating the functionality |

---

## Example Output

```text
InputProcessor Test Program
===========================

ASCII-to-Binary Test
---------------------

Test: Convert a single uppercase letter
Result: PASSED

Binary-to-ASCII Test
---------------------

Test: Convert binary to uppercase letter
Result: PASSED

Palindrome Test
----------------

Test: Check an even-length palindrome
Result: PASSED


All tests completed.
```

---

## Concepts Demonstrated

- Classes
- Static Methods
- String Manipulation
- Bitwise Operations
- Binary Number Representation
- Loops
- Conditional Logic
- Boolean Methods
- Method Decomposition
- Test-Driven Validation

---

## Author

Sean Dixon
