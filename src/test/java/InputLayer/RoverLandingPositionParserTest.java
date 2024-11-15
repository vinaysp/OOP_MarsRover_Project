package InputLayer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoverLandingPositionParserTest {

    RoverLandingPositionParser roverLandingPositionParser;

    @BeforeEach
    void setUp() {
        roverLandingPositionParser = new RoverLandingPositionParser();
    }

    @Test
    @DisplayName("RoverLandingPositionParser: should take a valid string input and store the input in the correct fields in RoverPosition class")
    void testWithValidStringInput(){
        //Arrange
        String input = "12N";
        int[] expectedResult = new int[]{1,2};

        //Act
        int[] actualResult = roverLandingPositionParser.instructionsToSetRoverPosition(input);

        //Assert
        assertArrayEquals(expectedResult,actualResult);

    }

    @Test
    @DisplayName("RoverLandingPositionParser: should return error for an empty or null input string")
    void testWithInvalidEmptyStringInput() {
        Exception exception = assertThrows(Exception.class, ()-> {
            roverLandingPositionParser.instructionsToSetRoverPosition("");
        });

        String expectedMessage = "Invalid input, instruction must be given as follows : PositionX of rover(number) PositionY of rover(number) CompassDirection (N,S,E,W) rover is facing";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    @DisplayName("RoverLandingPositionParser: should return error for an empty or null input string")
    void testWithInvalidNullStringInput() {
        Exception exception = assertThrows(Exception.class, () -> {
            roverLandingPositionParser.instructionsToSetRoverPosition(null);
        });

        String expectedMessage = "Invalid input, instruction must be given as follows : PositionX of rover(number) PositionY of rover(number) CompassDirection (N,S,E,W) rover is facing";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    @DisplayName("RoverLandingPositionParser: should return error for an input string of length greater than 3")
    void testWithInvalidStringInputGreaterThanLengthThree() {
        Exception exception = assertThrows(Exception.class, () -> {
            roverLandingPositionParser.instructionsToSetRoverPosition("1234");
        });

        String expectedMessage = "Invalid input, input cannot be more than three characters";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    @DisplayName("RoverLandingPositionParser: should return error for an input string where first two characters are not digits")
    void testWithInvalidStringInputFirstTwoCharactersNotDigits() {
        Exception exception = assertThrows(Exception.class, () -> {
            roverLandingPositionParser.instructionsToSetRoverPosition("abN");
        });

        String expectedMessage = "Invalid input, first two characters of input must be digits";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    @DisplayName("RoverLandingPositionParser: should return error for an input string where last character is not a compass point")
    void testWithInvalidStringInputLastCharacterNotCompassPoint() {
        Exception exception = assertThrows(Exception.class, () -> {
            roverLandingPositionParser.instructionsToSetRoverPosition("12c");
        });

        String expectedMessage = "Invalid input, third character in input must be a compass point written in capitals as either: N,S,W,E";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    @DisplayName("RoverLandingPositionParser: should return error for an input string where last character is a compass point written in lowercase")
    void testWithLowerCaseCompassPoint() {
        Exception exception = assertThrows(Exception.class, () -> {
            roverLandingPositionParser.instructionsToSetRoverPosition("12n");
        });

        String expectedMessage = "Invalid input, third character in input must be a compass point written in capitals as either: N,S,W,E";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    @DisplayName("RoverLandingPositionParser: should return error for an input string where either first or second character in input is not a number")
    void testInvalidInputWhereFirstOrSecondCharacterIsNotNumber() {
        Exception exception = assertThrows(Exception.class, () -> {
            roverLandingPositionParser.instructionsToSetRoverPosition("1aN");
        });

        String expectedMessage = "Invalid input, first two characters of input must be digits";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }


}