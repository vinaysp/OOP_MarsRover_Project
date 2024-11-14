package InputLayer;

import java.util.ArrayList;
import java.util.List;

class InstructionParser {

    List<InstructionEnum> parseRoverInstructions(String input) throws Exception {

        if( input == null || input.isEmpty()){
            throw new IllegalArgumentException("Invalid Input, input cannot be empty or null");
        }

        List<InstructionEnum> listOfParsedRoverInstructions = new ArrayList<>();
        String lowercaseInput = input.toLowerCase();

        for (int i =0; i < lowercaseInput.length();i++){
            if (lowercaseInput.charAt(i) == 'l') {
                listOfParsedRoverInstructions.add(InstructionEnum.L);
            } else if (lowercaseInput.charAt(i) == 'r') {
                listOfParsedRoverInstructions.add(InstructionEnum.R);
            } else if (lowercaseInput.charAt(i) == 'm') {
                listOfParsedRoverInstructions.add(InstructionEnum.M);
            } else {
                throw new IllegalArgumentException("Invalid Input please enter enter either: 'l' - to rotate rover left 90 degrees, "+
                "'r' - rotate rover right 90 degrees "+"or 'm' to move rover forward one space in its current facing direction");
            }
        }
        return listOfParsedRoverInstructions;
    }

}
