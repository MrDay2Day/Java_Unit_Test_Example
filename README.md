# Java Unit Testing Examples

This repository serves as a reference implementation of unit testing best practices in Java applications.

## Overview

This project demonstrates how to implement robust unit tests for Java applications using industry-standard frameworks and methodologies.

### 🧪 Testing Approach

The examples in this repository showcase:

- **JUnit 5 Implementation** - Utilizing the latest features of JUnit Jupiter for comprehensive test coverage
- **Test-Driven Development (TDD)** - Demonstrating how to write tests before implementation
- **Clean Test Architecture** - Following the Arrange-Act-Assert pattern for readable and maintainable tests

### 🛠️ Example Test Structure

### 🧮 Calculator Example

```java
public class CalculatorTest {

    @Test
    @DisplayName("Simple addition")
    public void testAdd() {
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 3);
        assertEquals(5, result);
    }

    @Test
    @DisplayName("Division by zero")
    public void testDivideByZero() {
        Calculator calculator = new Calculator();
        assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
    }
}
```

### 🧑‍💻 Java Developer Example

```java
public class JavaDeveloperTest {
    @Test
    @DisplayName("Should demonstrate core skills")
    public void testDemonstrateSkills() {
        // Arrange
        JavaDeveloper developer = new JavaDeveloper();

        // Act
        List<String> skills = developer.getTestingSkills();

        // Assert
        assertAll(
                () -> assertTrue(skills.contains("JUnit")),
                () -> assertTrue(skills.contains("TestNG")),
                () -> assertTrue(skills.contains("Mockito")),
                () -> assertTrue(skills.contains("Spring")),
                () -> assertTrue(skills.contains("TDD"))
        );
    }

    @Test
    @DisplayName("Should know JUnit")
    public void testKnowsJUnit() {
        assertTrue(new JavaDeveloper().getTestingSkills().contains("JUnit"));
    }

    @Test
    @DisplayName("Should know TestNG")
    public void testKnowsTestNG() {
        assertTrue(new JavaDeveloper().getTestingSkills().contains("TestNG"));
    }
}
```

### 🔍 Frameworks & Tools Demonstrated

- **JUnit 5** - The foundation of the testing strategy in this repository
- - **Maven/~~Gradle~~** - For build automation and test execution

### 📋 Additional Frameworks For Further Exploration
- **TestNG** - For more complex testing scenarios requiring advanced features
- **Mockito** - For mocking external dependencies and isolating units under test
- **Continuous Integration** - Automated testing pipelines with Jenkins/GitHub Actions

### 📊 Best Practices Demonstrated

1. **Independent Tests** - Each test runs in isolation without dependencies on other tests
2. **Edge Case Coverage** - Testing boundary conditions and error scenarios
3. **Descriptive Test Names** - Using `@DisplayName` for human-readable test documentation
4. **High Code Coverage** - Aiming for comprehensive coverage of all code paths
5. **Mock External Dependencies** - Isolating units from external resources for true unit testing

### 🏗️ Project Structure

```
src/
├── main/java/
│   └── code/
│       ├── JavaDeveloper.java
│       └── Calculator.java
└── test/java/
    └── code/
        ├── JavaDeveloperTest.java
        └── CalculatorTest.java
```

### 📚 Further Learning Topics

Advanced testing concepts demonstrated in different branches:
- Parameterized tests using JUnit 5
- Test lifecycle hooks
- Exception testing techniques
- Custom test extensions
- Test suites organization

---

*"Code without tests is bad code. It doesn't matter how well written it is; it doesn't matter how pretty or object-oriented or well-encapsulated it is. With tests, we can change the behavior of our code quickly and verifiably. Without them, we really don't know if our code is getting better or worse." — Michael Feathers*