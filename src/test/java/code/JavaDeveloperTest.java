package code;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;

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

// Additional test methods for other skills
}