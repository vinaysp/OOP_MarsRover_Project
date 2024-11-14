package InputLayer;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class InstructionParser {

    List<InstructionEnum> roverInstruction(String input) throws Exception {

        if( input == null || input.isEmpty()){
            throw new Exception("Invalid Input please enter enter either: 'l' - to rotate left 90 degrees, " +" "+
                    "'r' - rotate right 90 degrees"+" "+"or 'm' to move forward one space in your current direction" );
        }

        List<InstructionEnum> convertInputToEnum = new ArrayList<>();
        String lowercaseInput = input.toLowerCase();

        for (int i =0; i < lowercaseInput.length();i++){
            if (lowercaseInput.charAt(i) == 'l') {
                convertInputToEnum.add(InstructionEnum.L);
            } else if (lowercaseInput.charAt(i) == 'r') {
                convertInputToEnum.add(InstructionEnum.R);
            } else if (lowercaseInput.charAt(i) == 'm') {
                convertInputToEnum.add(InstructionEnum.M);
            } else {
                System.out.println("invalid rover instruction input please try again and enter only: 'l', 'r' or 'm' ");
            }
        }
        return convertInputToEnum;
    }

}
