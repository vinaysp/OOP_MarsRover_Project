package InputLayer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import javax.swing.text.Position;

import static org.junit.jupiter.api.Assertions.*;

class RoverPositionParserTest {

    RoverPositionParser roverPositionParser;

    @BeforeEach
    void setUp() {
        roverPositionParser = new RoverPositionParser();
    }

    @Test
    @DisplayName("RoverPositionParser: should take a valid string input and store the input in the correct fields in RoverPosition class  ")
    void testWithValidStringInput(){
        //Arrange
        String input = "12N";
        RoverPosition expectedResult = new RoverPosition(1,2,CompassDirectionEnum.N);

        //Act
        RoverPosition actualResult = roverPositionParser.setRoverPosition(input);

        //Assert
        assertEquals(expectedResult,actualResult);


    }




}