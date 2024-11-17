package InputLayer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParserPlateauSizeTest {

    ParserPlateauSize parserPlateauSize;

    @BeforeEach
    void setUp() {
        parserPlateauSize = new ParserPlateauSize();
    }


    @Test
    @DisplayName("parsedPlateauSize: should return exception message when input is a invalid empty string")
    void testInvalidEmptyStringInput(){
        Exception exception = assertThrows(Exception.class, ()-> {
            parserPlateauSize.parsedPlateauSize("");
        });

        String expectedMessage = "Invalid input, input cannot be empty or null";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));

    }

    @Test
    @DisplayName("parsedPlateauSize: should return exception message when input is a invalid null input")
    void testInvalidNullInput(){
        Exception exception = assertThrows(Exception.class, ()-> {
            parserPlateauSize.parsedPlateauSize(null);
        });

        String expectedMessage = "Invalid input, input cannot be empty or null";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));

    }

    @Test
    @DisplayName("parsedPlateauSize: should return exception message when input is a invalid string input")
    void testInvalidTwoCharacterStringInput(){
        Exception exception = assertThrows(Exception.class, ()-> {
            parserPlateauSize.parsedPlateauSize("ab");
        });

        String expectedMessage = "Invalid input, please provide only two numbers between 1 and 9";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));

    }

    @Test
    @DisplayName("parsedPlateauSize:should return exception message when string input is more than two number characters")
    void testInvalidStringInputMoreThanTwoNumbers(){
        Exception exception = assertThrows(Exception.class, ()-> {
            parserPlateauSize.parsedPlateauSize("100");
        });

        String expectedMessage = "Invalid input, please provide only two numbers between 1 and 9";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));

    }

    @Test
    @DisplayName("parsedPlateauSize: should return exception message when string input is more than two number characters and mix of numbers and letters")
    void testInvalidStringInputMixOfNumberAndLetterCharacters(){
        Exception exception = assertThrows(Exception.class, ()-> {
            parserPlateauSize.parsedPlateauSize("ab1");
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
        int [] actualResult = parserPlateauSize.parsedPlateauSize(input);

        //Assert
        assertArrayEquals(expectedResult,actualResult);

    }


}