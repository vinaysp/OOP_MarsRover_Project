package InputLayer;

public class RoverPosition {


    private int roverPositionX;
    private int roverPositionY;
    private EnumCompassDirection facing;

    RoverPosition(int roverPositionX, int roverPositionY, EnumCompassDirection compassDirection) {
    }


    int getRoverPositionX() {
        return roverPositionX;
    }

    int getRoverPositionY() {
        return roverPositionY;
    }

    EnumCompassDirection getFacing() {
        return facing;
    }
}
