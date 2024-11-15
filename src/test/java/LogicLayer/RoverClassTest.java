package LogicLayer;

import InputLayer.CompassDirectionEnum;
import InputLayer.InstructionEnum;
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

        CompassDirectionEnum startingPositionInput = CompassDirectionEnum.N;

        InstructionEnum inputDirectionChangeLeft = InstructionEnum.L;
        InstructionEnum inputDirectionChangeRight = InstructionEnum.R;

        CompassDirectionEnum expectedResultForLeftRotate = CompassDirectionEnum.W;
        CompassDirectionEnum expectedResultForRightRotate = CompassDirectionEnum.E;

        CompassDirectionEnum actualResultForRotateLeft = rover.rotateRover(startingPositionInput, inputDirectionChangeLeft);
        CompassDirectionEnum actualResultForRotateRight = rover.rotateRover(startingPositionInput, inputDirectionChangeRight);

        assertAll(
                () -> assertEquals(expectedResultForLeftRotate, actualResultForRotateLeft),
                () -> assertEquals(expectedResultForRightRotate, actualResultForRotateRight)
        );
    }


        @Test
        @DisplayName("roverRotateMethod: should return updated compass position either North or South after after a starting position of East")
        void testRotateRoverFromEastPosition() {

            CompassDirectionEnum startingPositionInput = CompassDirectionEnum.E;

            InstructionEnum inputDirectionChangeLeft = InstructionEnum.L;
            InstructionEnum inputDirectionChangeRight = InstructionEnum.R;

            CompassDirectionEnum expectedResultForLeftRotate = CompassDirectionEnum.N;
            CompassDirectionEnum expectedResultForRightRotate = CompassDirectionEnum.S;

            CompassDirectionEnum actualResultForRotateLeft = rover.rotateRover(startingPositionInput, inputDirectionChangeLeft);
            CompassDirectionEnum actualResultForRotateRight = rover.rotateRover(startingPositionInput, inputDirectionChangeRight);

            assertAll(
                    () -> assertEquals(expectedResultForLeftRotate, actualResultForRotateLeft),
                    () -> assertEquals(expectedResultForRightRotate, actualResultForRotateRight)
            );
        }

    @Test
    @DisplayName("roverRotateMethod: should return updated compass position either East or West after a starting position of South")
    void testRotateRoverFromSouthPosition() {

        CompassDirectionEnum startingPositionInput = CompassDirectionEnum.S;

        InstructionEnum inputDirectionChangeLeft = InstructionEnum.L;
        InstructionEnum inputDirectionChangeRight = InstructionEnum.R;

        CompassDirectionEnum expectedResultForLeftRotate = CompassDirectionEnum.E;
        CompassDirectionEnum expectedResultForRightRotate = CompassDirectionEnum.W;

        CompassDirectionEnum actualResultForRotateLeft = rover.rotateRover(startingPositionInput, inputDirectionChangeLeft);
        CompassDirectionEnum actualResultForRotateRight = rover.rotateRover(startingPositionInput, inputDirectionChangeRight);

        assertAll(
                () -> assertEquals(expectedResultForLeftRotate, actualResultForRotateLeft),
                () -> assertEquals(expectedResultForRightRotate, actualResultForRotateRight)
        );
    }

    @Test
    @DisplayName("roverRotateMethod: should return updated compass position either North or South after a starting position of West")
    void testRotateRoverFromWestPosition() {

        CompassDirectionEnum startingPositionInput = CompassDirectionEnum.W;

        InstructionEnum inputDirectionChangeLeft = InstructionEnum.L;
        InstructionEnum inputDirectionChangeRight = InstructionEnum.R;

        CompassDirectionEnum expectedResultForLeftRotate = CompassDirectionEnum.S;
        CompassDirectionEnum expectedResultForRightRotate = CompassDirectionEnum.N;

        CompassDirectionEnum actualResultForRotateLeft = rover.rotateRover(startingPositionInput, inputDirectionChangeLeft);
        CompassDirectionEnum actualResultForRotateRight = rover.rotateRover(startingPositionInput, inputDirectionChangeRight);

        assertAll(
                () -> assertEquals(expectedResultForLeftRotate, actualResultForRotateLeft),
                () -> assertEquals(expectedResultForRightRotate, actualResultForRotateRight)
        );
    }

}