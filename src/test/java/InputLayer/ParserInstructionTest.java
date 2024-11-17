package InputLayer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ParserInstructionTest {

    ParserInstruction parserInstruction;

    @BeforeEach
    void beforeEach() {
        parserInstruction = new ParserInstruction();
    }

    @Test
    @DisplayName("should return a exception message when passed invalid Empty String input")
    void testInstructionParserWithInvalidEmptyStringInput() throws Exception {
        Exception exception = assertThrows(Exception.class, ()-> {
            parserInstruction.parseRoverInstructions("");
        });

        String expectedMessage = "Invalid Input, input cannot be empty or null";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));

    }

    @Test
    @DisplayName("should return a exception message when passed invalid null input")
    void testInstructionParserWithInvalidNullInput() throws Exception {

        Exception exception = assertThrows(Exception.class, ()-> {
            parserInstruction.parseRoverInstructions(null);
        });

        String expectedMessage = "Invalid Input, input cannot be empty or null";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));

    }

    @Test
    @DisplayName("should return a exception message when passed invalid String input")
    void testInstructionParserWithInvalidStringInput() throws Exception {

        Exception exception = assertThrows(Exception.class, ()-> {
            parserInstruction.parseRoverInstructions("abc");
        });

        String expectedMessage = "Invalid Input please enter enter either: 'l' - to rotate rover left 90 degrees, "+
        "'r' - rotate rover right 90 degrees "+"or 'm' to move rover forward one space in its current facing direction";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));

    }


    @Test
    @DisplayName("should return a List of EnumInstruction when passed valid single letter String input")
    void testInstructionParserWithValidSingleLetterStringInput() throws Exception {
        //Arrange
        String input = "L";
        String input2 = "M";
        List<EnumInstruction> expectedResult = List.of(new EnumInstruction[]{EnumInstruction.L});
        List<EnumInstruction> expectedResult2 = List.of(new EnumInstruction[]{EnumInstruction.M});
        //Act
        List<EnumInstruction> actualResult = parserInstruction.parseRoverInstructions(input);
        List<EnumInstruction> actualResult2 = parserInstruction.parseRoverInstructions(input2);
        //Assert
        assertAll(
                ()-> assertEquals(expectedResult, actualResult),
                ()-> assertEquals(expectedResult2, actualResult2)
        );
    }

    @Test
    @DisplayName("should return a List of EnumInstruction when passed valid multiple letter string input")
    void testInstructionParserWithValidMultipleLetterStringInput() throws Exception {
        //Arrange
        String input = "LMLM";
        String input2 = "LLLL";
        String input3 = "MMMM";
        List<EnumInstruction> expectedResult = List.of(new EnumInstruction[]{EnumInstruction.L, EnumInstruction.M, EnumInstruction.L, EnumInstruction.M});
        List<EnumInstruction> expectedResult2 = List.of(new EnumInstruction[]{EnumInstruction.L, EnumInstruction.L, EnumInstruction.L, EnumInstruction.L});
        List<EnumInstruction>expectedResult3 = List.of(new EnumInstruction[]{EnumInstruction.M, EnumInstruction.M, EnumInstruction.M, EnumInstruction.M});
        //Act
        List<EnumInstruction> actualResult = parserInstruction.parseRoverInstructions(input);
        List<EnumInstruction> actualResult2 = parserInstruction.parseRoverInstructions(input2);
        List<EnumInstruction> actualResult3 = parserInstruction.parseRoverInstructions(input3);
        //Assert
        assertAll(
                ()-> assertEquals(expectedResult, actualResult),
                ()-> assertEquals(expectedResult2, actualResult2),
                ()-> assertEquals(expectedResult3, actualResult3)
        );
    }
}