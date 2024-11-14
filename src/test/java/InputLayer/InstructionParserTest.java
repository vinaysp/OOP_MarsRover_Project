package InputLayer;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InstructionParserTest {

    InstructionParser instructionParser;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        InstructionParser instructionParser = new InstructionParser();
    }


    @Test
    @DisplayName("should return a collection of InstructionEnum when passed valid string input")
    void testInstructionParserWithValidStringInput(){
        //Arrange
        String input = "LMLM";
        String input2 = "L";
        String input3 = "M";
        String input4 = "LLLL";
        String input5 = "MMMM";

        InstructionEnum[] expectedResult = {InstructionEnum.L, InstructionEnum.M, InstructionEnum.L, InstructionEnum.M};
        InstructionEnum[] expectedResult2 = {InstructionEnum.L};
        InstructionEnum[] expectedResult3 = {InstructionEnum.M};
        InstructionEnum[] expectedResult4 = {InstructionEnum.L,InstructionEnum.L,InstructionEnum.L,InstructionEnum.L};
        InstructionEnum[] expectedResult5 = {InstructionEnum.M, InstructionEnum.M, InstructionEnum.M, InstructionEnum.M};

        //Act

        InstructionEnum[] actualResult = instructionParser.roverInstruction(input);
        InstructionEnum[] actualResult2 = instructionParser.roverInstruction(input2);
        InstructionEnum[] actualResult3 = instructionParser.roverInstruction(input3);
        InstructionEnum[] actualResult4 = instructionParser.roverInstruction(input4);
        InstructionEnum[] actualResult5 = instructionParser.roverInstruction(input5);

        //Assert

        assertAll(
                ()-> assertEquals(expectedResult, actualResult),
                ()-> assertEquals(expectedResult2, actualResult2),
                ()-> assertEquals(expectedResult3, actualResult3),
                ()-> assertEquals(expectedResult4, actualResult4),
                ()-> assertEquals(expectedResult5, actualResult5)
        );

    }





}