package LogicLayer;

import InputLayer.EnumCompassDirection;
import InputLayer.EnumInstruction;
import InputLayer.RoverPosition;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoverClassTest {

    RoverClass rover;

    @BeforeEach
    void setUp() {
        rover = new RoverClass();
    }

  @Test
    @DisplayName("roverRotateMethod: should return updated compass position either West or East after a starting position of North")
    void testRotateRoverFromNorthPosition() {

        EnumCompassDirection startingPositionInput = EnumCompassDirection.N;

        EnumInstruction inputDirectionChangeLeft = EnumInstruction.L;
        EnumInstruction inputDirectionChangeRight = EnumInstruction.R;

        EnumCompassDirection expectedResultForLeftRotate = EnumCompassDirection.W;
        EnumCompassDirection expectedResultForRightRotate = EnumCompassDirection.E;

        EnumCompassDirection actualResultForRotateLeft = rover.rotateRover(startingPositionInput, inputDirectionChangeLeft);
        EnumCompassDirection actualResultForRotateRight = rover.rotateRover(startingPositionInput, inputDirectionChangeRight);

        assertAll(
                () -> assertEquals(expectedResultForLeftRotate, actualResultForRotateLeft),
                () -> assertEquals(expectedResultForRightRotate, actualResultForRotateRight)
        );
    }


        @Test
        @DisplayName("roverRotateMethod: should return updated compass position either North or South after after a starting position of East")
        void testRotateRoverFromEastPosition() {

            EnumCompassDirection startingPositionInput = EnumCompassDirection.E;

            EnumInstruction inputDirectionChangeLeft = EnumInstruction.L;
            EnumInstruction inputDirectionChangeRight = EnumInstruction.R;

            EnumCompassDirection expectedResultForLeftRotate = EnumCompassDirection.N;
            EnumCompassDirection expectedResultForRightRotate = EnumCompassDirection.S;

            EnumCompassDirection actualResultForRotateLeft = rover.rotateRover(startingPositionInput, inputDirectionChangeLeft);
            EnumCompassDirection actualResultForRotateRight = rover.rotateRover(startingPositionInput, inputDirectionChangeRight);

            assertAll(
                    () -> assertEquals(expectedResultForLeftRotate, actualResultForRotateLeft),
                    () -> assertEquals(expectedResultForRightRotate, actualResultForRotateRight)
            );
        }

    @Test
    @DisplayName("roverRotateMethod: should return updated compass position either East or West after a starting position of South")
    void testRotateRoverFromSouthPosition() {

        EnumCompassDirection startingPositionInput = EnumCompassDirection.S;

        EnumInstruction inputDirectionChangeLeft = EnumInstruction.L;
        EnumInstruction inputDirectionChangeRight = EnumInstruction.R;

        EnumCompassDirection expectedResultForLeftRotate = EnumCompassDirection.E;
        EnumCompassDirection expectedResultForRightRotate = EnumCompassDirection.W;

        EnumCompassDirection actualResultForRotateLeft = rover.rotateRover(startingPositionInput, inputDirectionChangeLeft);
        EnumCompassDirection actualResultForRotateRight = rover.rotateRover(startingPositionInput, inputDirectionChangeRight);

        assertAll(
                () -> assertEquals(expectedResultForLeftRotate, actualResultForRotateLeft),
                () -> assertEquals(expectedResultForRightRotate, actualResultForRotateRight)
        );
    }

    @Test
    @DisplayName("roverRotateMethod: should return updated compass position either North or South after a starting position of West")
    void testRotateRoverFromWestPosition() {

        EnumCompassDirection startingPositionInput = EnumCompassDirection.W;

        EnumInstruction inputDirectionChangeLeft = EnumInstruction.L;
        EnumInstruction inputDirectionChangeRight = EnumInstruction.R;

        EnumCompassDirection expectedResultForLeftRotate = EnumCompassDirection.S;
        EnumCompassDirection expectedResultForRightRotate = EnumCompassDirection.N;

        EnumCompassDirection actualResultForRotateLeft = rover.rotateRover(startingPositionInput, inputDirectionChangeLeft);
        EnumCompassDirection actualResultForRotateRight = rover.rotateRover(startingPositionInput, inputDirectionChangeRight);

        assertAll(
                () -> assertEquals(expectedResultForLeftRotate, actualResultForRotateLeft),
                () -> assertEquals(expectedResultForRightRotate, actualResultForRotateRight)
        );
    }

    @Test
    @DisplayName("moveRoverMethod: should return/update the rover position based on current direction its facing and an input to move")
    void testRoverMoveWhenFacingNorth(){

        rover.setRoverPositionX(2);
        rover.setRoverPositionY(3);
        rover.setFacing(EnumCompassDirection.N);

        int xPosition = rover.getRoverPositionX();
        int yPosition = rover.getRoverPositionY();
        EnumCompassDirection roverFacing = rover.getFacing();

        RoverPosition actualResult = rover.moveRover(roverFacing, xPosition, yPosition);

        int getNewPositionX = rover.getRoverPositionX();
        int getNewPositionY = rover.getRoverPositionY();

        int[] expectedResult = new int[]{getNewPositionX,getNewPositionY};

        assertEquals(expectedResult, actualResult);

    }


}