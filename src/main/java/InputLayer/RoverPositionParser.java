package InputLayer;

class RoverPositionParser {


       RoverPosition instructionsToSetRoverPosition(String input) {

           RoverPosition setRoverPosition = new RoverPosition(
                   Character.getNumericValue(input.charAt(0)),
                   Character.getNumericValue(input.charAt(1)),
                   CompassDirectionEnum.valueOf(String.valueOf(input.charAt(2))));

           return setRoverPosition;
    }


}
