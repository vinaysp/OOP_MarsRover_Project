package LogicLayer;

import InputLayer.EnumCompassDirection;
import InputLayer.EnumInstruction;
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


}