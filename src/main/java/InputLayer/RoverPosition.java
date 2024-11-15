package InputLayer;

class RoverPosition {


    private int roverPositionX;
    private int roverPositionY;
    private CompassDirectionEnum facing;

    RoverPosition(int roverPositionX, int roverPositionY, CompassDirectionEnum compassDirection) {
    }


    int getRoverPositionX() {
        return roverPositionX;
    }

    int getRoverPositionY() {
        return roverPositionY;
    }

    CompassDirectionEnum getFacing() {
        return facing;
    }
}
