package InputLayer.InputParsers;

import InputLayer.CompassDirectionEnum;
import InputLayer.RoverPosition;

public class RoverPositionParser {


       public RoverPosition instructionsToSetRoverPosition(String input) {

           if (input == null || input.isEmpty()) {
               throw new IllegalArgumentException(
                       "Invalid input, instruction must be given as follows : PositionX of rover(number) PositionY of rover(number) CompassDirection of Rover (N,S,E,W)"
               );
           } else if (input.length() > 3){
               throw new IllegalArgumentException(
                       "Invalid input, input cannot be more than three characters"
               );
           } else if (!Character.isDigit(input.charAt(0)) || !Character.isDigit(input.charAt(1))){
               throw new IllegalArgumentException(
                       "Invalid input, first two characters of input must be digits"
               );
           } else if (String.valueOf(input.charAt(2)).matches("[^NWSE]")){
               throw new IllegalArgumentException(
                       "Invalid input, third character in input must be a compass point written in capitals as either: N,S,W,E"
               );
           }

           RoverPosition setRoverPosition = new RoverPosition(
                   Character.getNumericValue(input.charAt(0)),
                   Character.getNumericValue(input.charAt(1)),
                   CompassDirectionEnum.valueOf(String.valueOf(input.charAt(2))));

           return setRoverPosition;
    }


}
