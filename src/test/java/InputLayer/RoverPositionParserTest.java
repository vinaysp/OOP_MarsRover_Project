package InputLayer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoverPositionParserTest {

    RoverPositionParser roverPositionParser;

    @BeforeEach
    void setUp() {
        roverPositionParser = new RoverPositionParser();
    }

    @Test
    @DisplayName("RoverPositionParser: should take a valid string input and store the input in the correct fields in RoverPosition class")
    void testWithValidStringInput(){
        //Arrange
        String input = "12N";
        RoverPosition expectedResult = new RoverPosition(1,2,CompassDirectionEnum.N);

        //Act
        RoverPosition actualResult = roverPositionParser.instructionsToSetRoverPosition(input);

        //Assert
        assertAll(
                () -> assertEquals(expectedResult.getRoverPositionX(),actualResult.getRoverPositionX()),
                () -> assertEquals(expectedResult.getRoverPositionY(),actualResult.getRoverPositionY()),
                () -> assertEquals(expectedResult.getFacing(),actualResult.getFacing())
        );

    }

    @Test
    @DisplayName("RoverPositionParser: should return error for an empty or null input string")
    void testWithInvalidEmptyStringInput() {
        Exception exception = assertThrows(Exception.class, ()-> {
            roverPositionParser.instructionsToSetRoverPosition("");
        });

        String expectedMessage = "Invalid input, instruction must be given as follows : PositionX of rover(number) PositionY of rover(number) CompassDirection of Rover (N,S,E,W)";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    @DisplayName("RoverPositionParser: should return error for an empty or null input string")
    void testWithInvalidNullStringInput() {
        Exception exception = assertThrows(Exception.class, () -> {
            roverPositionParser.instructionsToSetRoverPosition(null);
        });

        String expectedMessage = "Invalid input, instruction must be given as follows : PositionX of rover(number) PositionY of rover(number) CompassDirection of Rover (N,S,E,W)";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    @DisplayName("RoverPositionParser: should return error for an input string of length greater than 3")
    void testWithInvalidStringInputGreaterThanLengthThree() {
        Exception exception = assertThrows(Exception.class, () -> {
            roverPositionParser.instructionsToSetRoverPosition("1234");
        });

        String expectedMessage = "Invalid input, input cannot be more than three characters";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    @DisplayName("RoverPositionParser: should return error for an input string where first two characters are not digits")
    void testWithInvalidStringInputFirstTwoCharactersNotDigits() {
        Exception exception = assertThrows(Exception.class, () -> {
            roverPositionParser.instructionsToSetRoverPosition("abN");
        });

        String expectedMessage = "Invalid input, first two characters of input must be digits";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    @DisplayName("RoverPositionParser: should return error for an input string where last character is not a compass point")
    void testWithInvalidStringInputLastCharacterNotCompassPoint() {
        Exception exception = assertThrows(Exception.class, () -> {
            roverPositionParser.instructionsToSetRoverPosition("12c");
        });

        String expectedMessage = "Invalid input, third character in input must be a compass point written in capitals as either: N,S,W,E";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    @DisplayName("RoverPositionParser: should return error for an input string where last character is a compass point written in lowercase")
    void testWithLowerCaseCompassPoint() {
        Exception exception = assertThrows(Exception.class, () -> {
            roverPositionParser.instructionsToSetRoverPosition("12n");
        });

        String expectedMessage = "Invalid input, third character in input must be a compass point written in capitals as either: N,S,W,E";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    @DisplayName("RoverPositionParser: should return error for an input string where either first or second character in input is not a number")
    void testInvalidInputWhereFirstOrSecondCharacterIsNotNumber() {
        Exception exception = assertThrows(Exception.class, () -> {
            roverPositionParser.instructionsToSetRoverPosition("1aN");
        });

        String expectedMessage = "Invalid input, first two characters of input must be digits";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }





}