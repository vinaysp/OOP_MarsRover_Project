package LogicLayer;


import InputLayer.EnumCompassDirection;
import InputLayer.EnumInstruction;


public class RoverClass {


    public EnumCompassDirection rotateRover(EnumCompassDirection startingCompassPositionInput, EnumInstruction inputDirectionChange) {


        EnumCompassDirection finishingCompassPositionOutput = null;

       if (startingCompassPositionInput == EnumCompassDirection.N) {
           switch (inputDirectionChange) {
               case EnumInstruction.L:
                   finishingCompassPositionOutput = EnumCompassDirection.W;
                   break;
               case EnumInstruction.R:
                   finishingCompassPositionOutput = EnumCompassDirection.E;
                   break;
           }
       }

        if (startingCompassPositionInput == EnumCompassDirection.S) {
            switch (inputDirectionChange) {
                case EnumInstruction.L:
                    finishingCompassPositionOutput = EnumCompassDirection.E;
                    break;
                case EnumInstruction.R:
                    finishingCompassPositionOutput = EnumCompassDirection.W;
                    break;
            }
        }

        if (startingCompassPositionInput == EnumCompassDirection.E) {
            switch (inputDirectionChange) {
                case EnumInstruction.L:
                    finishingCompassPositionOutput = EnumCompassDirection.N;
                    break;
                case EnumInstruction.R:
                    finishingCompassPositionOutput = EnumCompassDirection.S;
                    break;
            }
        }

        if (startingCompassPositionInput == EnumCompassDirection.W) {
            switch (inputDirectionChange) {
                case EnumInstruction.L:
                    finishingCompassPositionOutput = EnumCompassDirection.S;
                    break;
                case EnumInstruction.R:
                    finishingCompassPositionOutput = EnumCompassDirection.N;
                    break;
            }
        }

        return finishingCompassPositionOutput;

    }

}
