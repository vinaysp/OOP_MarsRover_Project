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