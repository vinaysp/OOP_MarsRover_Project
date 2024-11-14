package InputLayer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlateauSizeParserTest {

    PlateauSizeParser plateauSizeParser;

    @BeforeEach
    void setUp() {
        plateauSizeParser = new PlateauSizeParser();
    }


    @Test
    @DisplayName("parsedPlateauSize: should return exception message when input is a invalid empty string")
    void testInvalidEmptyStringInput(){
        Exception exception = assertThrows(Exception.class, ()-> {
            plateauSizeParser.parsedPlateauSize("");
        });

        String expectedMessage = "Invalid input, input cannot be empty or null";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));

    }

    @Test
    @DisplayName("parsedPlateauSize: should return exception message when input is a invalid null input")
    void testInvalidNullInput(){
        Exception exception = assertThrows(Exception.class, ()-> {
            plateauSizeParser.parsedPlateauSize(null);
        });

        String expectedMessage = "Invalid input, input cannot be empty or null";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));

    }

    @Test
    @DisplayName("parsedPlateauSize: should return exception message when input is a invalid string input")
    void testInvalidTwoCharacterStringInput(){
        Exception exception = assertThrows(Exception.class, ()-> {
            plateauSizeParser.parsedPlateauSize("ab");
        });

        String expectedMessage = "Invalid input, please provide only two numbers between 1 and 9";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));

    }

    @Test
    @DisplayName("parsedPlateauSize:should return exception message when string input is more than two number characters")
    void testInvalidStringInputMoreThanTwoNumbers(){
        Exception exception = assertThrows(Exception.class, ()-> {
            plateauSizeParser.parsedPlateauSize("100");
        });

        String expectedMessage = "Invalid input, please provide only two numbers between 1 and 9";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));

    }

    @Test
    @DisplayName("parsedPlateauSize: should return exception message when string input is more than two number characters")
    void testInvalidStringInputMixOfNumberAndLetterCharacters(){
        Exception exception = assertThrows(Exception.class, ()-> {
            plateauSizeParser.parsedPlateauSize("ab1");
        });

        String expectedMessage = "Invalid input, please provide only two numbers between 1 and 9";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));

    }



    @Test
    @DisplayName("parsedPlateauSize: should return integer array with 2 numbers when inputting a valid string")
    void testValidStringInput() throws Exception {
        //Arrange
        String input = "22";
        int[] expectedResult = {2,2};

        //Act
        int [] actualResult = plateauSizeParser.parsedPlateauSize(input);

        //Assert
        assertArrayEquals(expectedResult,actualResult);

    }


}