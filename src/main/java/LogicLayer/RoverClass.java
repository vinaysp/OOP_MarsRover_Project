package LogicLayer;


import InputLayer.CompassDirectionEnum;
import InputLayer.InstructionEnum;


public class RoverClass {


    public CompassDirectionEnum rotateRover(CompassDirectionEnum startingCompassPositionInput, InstructionEnum inputDirectionChange) {


        CompassDirectionEnum finishingCompassPositionOutput = null;

       if (startingCompassPositionInput == CompassDirectionEnum.N) {
           switch (inputDirectionChange) {
               case InstructionEnum.L:
                   finishingCompassPositionOutput = CompassDirectionEnum.W;
                   break;
               case InstructionEnum.R:
                   finishingCompassPositionOutput = CompassDirectionEnum.E;
                   break;
           }
       }

        if (startingCompassPositionInput == CompassDirectionEnum.S) {
            switch (inputDirectionChange) {
                case InstructionEnum.L:
                    finishingCompassPositionOutput = CompassDirectionEnum.E;
                    break;
                case InstructionEnum.R:
                    finishingCompassPositionOutput = CompassDirectionEnum.W;
                    break;
            }
        }

        if (startingCompassPositionInput == CompassDirectionEnum.E) {
            switch (inputDirectionChange) {
                case InstructionEnum.L:
                    finishingCompassPositionOutput = CompassDirectionEnum.N;
                    break;
                case InstructionEnum.R:
                    finishingCompassPositionOutput = CompassDirectionEnum.S;
                    break;
            }
        }

        if (startingCompassPositionInput == CompassDirectionEnum.W) {
            switch (inputDirectionChange) {
                case InstructionEnum.L:
                    finishingCompassPositionOutput = CompassDirectionEnum.S;
                    break;
                case InstructionEnum.R:
                    finishingCompassPositionOutput = CompassDirectionEnum.N;
                    break;
            }
        }

        return finishingCompassPositionOutput;

    }


}
