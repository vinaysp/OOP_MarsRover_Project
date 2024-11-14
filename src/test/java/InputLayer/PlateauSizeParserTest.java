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
    @DisplayName("should return exception message when input is a invalid empty String")
    void testPlateauSizParserWithInvalidEmptyStringInput(){
        Exception exception = assertThrows(Exception.class, ()-> {
            plateauSizeParser.parsedPlateauSize("");
        });

        String expectedMessage = "Invalid Input, input cannot be empty or null";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));

    }

    @Test
    @DisplayName("should return exception message when input is a invalid null input")
    void testPlateauSizParserWithInvalidNullInput(){
        Exception exception = assertThrows(Exception.class, ()-> {
            plateauSizeParser.parsedPlateauSize(null);
        });

        String expectedMessage = "Invalid Input, input cannot be empty or null";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));

    }

    @Test
    @DisplayName("should return exception message when input is a invalid String input")
    void testPlateauSizParserWithInvalidCharStringInput(){
        Exception exception = assertThrows(Exception.class, ()-> {
            plateauSizeParser.parsedPlateauSize("ab");
        });

        String expectedMessage = "Invalid Input, please provide only two numbers between 1 and 9";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));

    }

    @Test
    @DisplayName("should return exception message when String input is more than two number characters")
    void testPlateauSizParserWithInvalidStringInputMoreThanTwoCharacters(){
        Exception exception = assertThrows(Exception.class, ()-> {
            plateauSizeParser.parsedPlateauSize("100");
        });

        String expectedMessage = "Invalid Input, please provide two numbers between 1 and 9";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));

    }

    @Test
    @DisplayName("should return integer array with 2 numbers when inputting a valid String")
    void testPlateauSizParserWithValidStringInput(){
        //Arrange
        String input = "22";
        int[] expectedResult = {2,2};

        //Act
        int [] actualResult = plateauSizeParser.parsedPlateauSize(input);

        //Assert
        assertEquals(expectedResult, actualResult);

    }


}