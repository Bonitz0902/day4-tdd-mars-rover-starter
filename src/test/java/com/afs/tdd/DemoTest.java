package com.afs.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DemoTest {
    @Test
    void should_return_to_location_0_1_N_when_executeCommand_given_0_0_North_and_command_move() {
        Location initialLocation = new Location(0, 0,Direction.NORTH );
        Command givenCommand = Command.MOVE;
        MarsRover marsRover = new MarsRover(initialLocation);

        marsRover.executeCommand(givenCommand);
        Location currentLocation = marsRover.getCurrentLocation();

        Assertions.assertEquals(0, currentLocation.getX());
        Assertions.assertEquals(1, currentLocation.getY());
        Assertions.assertEquals(Direction.NORTH, currentLocation.getDirection());


    }
}
