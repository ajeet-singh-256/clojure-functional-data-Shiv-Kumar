# Task 1 – Overview & Setup  
**ENSP415 – New Age Programming Languages**  
**Assignment 03 – Introduction to Clojure**

---

## 1. Introduction to Clojure

Clojure is a modern, functional programming language that runs on the **Java Virtual Machine (JVM)**. It is a Lisp dialect that focuses on **immutability**, **functional programming**, and a simple, uniform syntax. Because Clojure runs on the JVM, it can directly use Java libraries, making it suitable for real-world applications such as data processing, backend systems, and concurrency.

Clojure supports REPL-driven development, which makes experimenting and testing code extremely fast and interactive.

---

## 2. Key Features of Clojure

### ✔ Functional-first Language  
Encourages pure functions, expressions over statements, and recursion.

### ✔ Immutable Data Structures  
Lists, vectors, maps, and sets are immutable by default, making code predictable and safe.

### ✔ JVM Interoperability  
Clojure can call Java methods and use Java classes directly.

### ✔ Simple Lisp Syntax  
A minimal, parenthesis-based syntax that is easy to understand and transform.

### ✔ REPL-driven Development  
Code can be evaluated instantly without restarting the entire program.

### ✔ Strong Data Manipulation Tools  
Functions like `map`, `reduce`, and `filter`, as well as transducers, provide powerful ways to process data.

---

## 3. Development Environment Setup

### **Step 1: Install Java (JDK 17)**  
Clojure requires Java to run.

**Verify Installation**

📸 *Screenshot:*  
`/screenshots/setup/java-version.png`

---

### **Step 2: Install Clojure CLI Tools**  
Installed using the official script from:  
https://clojure.org/guides/install_clojure

**Verify Installation**

📸 *Screenshot:*  
`/screenshots/setup/clojure-install.png`

---

### **Step 3: Install Calva (VS Code Extension)**  
Used for syntax highlighting, formatting, and REPL support.

📸 *Screenshot:*  
`/screenshots/setup/calva-installed.png`

---

## 4. Hello World Program

**File:**  
`src/task1_overview_setup/hello.clj`

**Code:**
```clojure
(println "Hello, World from Clojure!")
