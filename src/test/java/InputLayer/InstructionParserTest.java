package InputLayer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InstructionParserTest {

    InstructionParser instructionParser;

    @BeforeEach
    void beforeEach() {

        instructionParser = new InstructionParser();
    }

    @Test
    @DisplayName("should return a exception message when passed invalid Empty String input")
    void testInstructionParserWithInvalidEmptyStringInput() throws Exception {
        Exception exception = assertThrows(Exception.class, ()-> {
            instructionParser.parseRoverInstructions("");
        });

        String expectedMessage = "Invalid Input, input cannot be empty or null";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));

    }

    @Test
    @DisplayName("should return a exception message when passed invalid null input")
    void testInstructionParserWithInvalidNullInput() throws Exception {

        Exception exception = assertThrows(Exception.class, ()-> {
            instructionParser.parseRoverInstructions(null);
        });

        String expectedMessage = "Invalid Input, input cannot be empty or null";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));

    }

    @Test
    @DisplayName("should return a exception message when passed invalid String input")
    void testInstructionParserWithInvalidStringInput() throws Exception {

        Exception exception = assertThrows(Exception.class, ()-> {
            instructionParser.parseRoverInstructions("abc");
        });

        String expectedMessage = "Invalid Input please enter enter either: 'l' - to rotate rover left 90 degrees, "+
        "'r' - rotate rover right 90 degrees "+"or 'm' to move rover forward one space in its current facing direction";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));

    }


    @Test
    @DisplayName("should return a collection of InstructionEnum when passed valid single letter String input")
    void testInstructionParserWithValidSingleLetterStringInput() throws Exception {
        //Arrange
        String input = "L";
        String input2 = "M";
        List<InstructionEnum> expectedResult = List.of(new InstructionEnum[]{InstructionEnum.L});
        List<InstructionEnum> expectedResult2 = List.of(new InstructionEnum[]{InstructionEnum.M});
        //Act
        List<InstructionEnum> actualResult = instructionParser.parseRoverInstructions(input);
        List<InstructionEnum> actualResult2 = instructionParser.parseRoverInstructions(input2);
        //Assert
        assertAll(
                ()-> assertEquals(expectedResult, actualResult),
                ()-> assertEquals(expectedResult2, actualResult2)
        );
    }

    @Test
    @DisplayName("should return a collection of InstructionEnum when passed valid multiple letter string input")
    void testInstructionParserWithValidMultipleLetterStringInput() throws Exception {
        //Arrange
        String input = "LMLM";
        String input2 = "LLLL";
        String input3 = "MMMM";
        List<InstructionEnum> expectedResult = List.of(new InstructionEnum[]{InstructionEnum.L, InstructionEnum.M, InstructionEnum.L, InstructionEnum.M});
        List<InstructionEnum> expectedResult2 = List.of(new InstructionEnum[]{InstructionEnum.L, InstructionEnum.L, InstructionEnum.L, InstructionEnum.L});
        List<InstructionEnum>expectedResult3 = List.of(new InstructionEnum[]{InstructionEnum.M, InstructionEnum.M, InstructionEnum.M, InstructionEnum.M});
        //Act
        List<InstructionEnum> actualResult = instructionParser.parseRoverInstructions(input);
        List<InstructionEnum> actualResult2 = instructionParser.parseRoverInstructions(input2);
        List<InstructionEnum> actualResult3 = instructionParser.parseRoverInstructions(input3);
        //Assert
        assertAll(
                ()-> assertEquals(expectedResult, actualResult),
                ()-> assertEquals(expectedResult2, actualResult2),
                ()-> assertEquals(expectedResult3, actualResult3)
        );
    }
}