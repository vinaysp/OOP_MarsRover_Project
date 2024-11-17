package InputLayer;

public class RoverPosition {


    private int roverPositionX;
    private int roverPositionY;
    private EnumCompassDirection facing;

   /* RoverPosition(int roverPositionX, int roverPositionY, EnumCompassDirection compassDirection) {
    }*/


    public int getRoverPositionX() {
        return roverPositionX;
    }

    public int getRoverPositionY() {
        return roverPositionY;
    }

    public EnumCompassDirection getFacing() {
        return facing;
    }

    public void setRoverPositionX(int roverPositionX) {
        this.roverPositionX = roverPositionX;
    }

    public void setRoverPositionY(int roverPositionY) {
        this.roverPositionY = roverPositionY;
    }

    public void setFacing(EnumCompassDirection facing) {
        this.facing = facing;
    }
}
