package com.afs.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DemoTest {
    @Test
    void should_return_to_location_0_1_N_when_executeMoveCommand_given_0_0_North_and_command_move() {
        Location initialLocation = new Location(0, 0,Direction.NORTH );
        Command givenCommand = Command.MOVE;
        MarsRover marsRover = new MarsRover(initialLocation);

        marsRover.executeMoveCommand(givenCommand);
        Location currentLocation = marsRover.getCurrentLocation();

        Assertions.assertEquals(0, currentLocation.getX());
        Assertions.assertEquals(1, currentLocation.getY());
        Assertions.assertEquals(Direction.NORTH, currentLocation.getDirection());


    }

    @Test
    void should_return_to_location_1_0_E_when_executeMoveCommand_given_0_0_East_and_command_move(){
        Location initialLocation = new Location(0, 0,Direction.EAST );
        Command givenCommand = Command.MOVE;
        MarsRover marsRover = new MarsRover(initialLocation);

        marsRover.executeMoveCommand(givenCommand);
        Location currentLocation = marsRover.getCurrentLocation();

        Assertions.assertEquals(1, currentLocation.getX());
        Assertions.assertEquals(0, currentLocation.getY());
        Assertions.assertEquals(Direction.EAST, currentLocation.getDirection());
    }

    @Test
    void should_return_to_location_negative_1_0_S_when_executeMoveCommand_given_0_0_South_and_command_move(){
        Location initialLocation = new Location(0, 0,Direction.SOUTH );
        Command givenCommand = Command.MOVE;
        MarsRover marsRover = new MarsRover(initialLocation);

        marsRover.executeMoveCommand(givenCommand);
        Location currentLocation = marsRover.getCurrentLocation();

        Assertions.assertEquals(0, currentLocation.getX());
        Assertions.assertEquals(-1, currentLocation.getY());
        Assertions.assertEquals(Direction.SOUTH, currentLocation.getDirection());
    }
    @Test
    void should_return_to_location_0_negative_1_S_when_executeMoveCommand_given_0_0_West_and_command_move(){
        Location initialLocation = new Location(0, 0,Direction.WEST );
        Command givenCommand = Command.MOVE;
        MarsRover marsRover = new MarsRover(initialLocation);

        marsRover.executeMoveCommand(givenCommand);
        Location currentLocation = marsRover.getCurrentLocation();

        Assertions.assertEquals(-1, currentLocation.getX());
        Assertions.assertEquals(0, currentLocation.getY());
        Assertions.assertEquals(Direction.WEST, currentLocation.getDirection());
    }

    @Test
    void should_return_to_location_0_0_E_when_executeTurnRightCommand_given_0_0_North_and_command_turn_right(){
        Location initialLocation = new Location(0, 0,Direction.NORTH );
        Command givenCommand = Command.RIGHT;
        MarsRover marsRover = new MarsRover(initialLocation);

        marsRover.executeRightCommand(givenCommand);
        Location currentLocation = marsRover.getCurrentLocation();

        Assertions.assertEquals(0, currentLocation.getX());
        Assertions.assertEquals(0, currentLocation.getY());
        Assertions.assertEquals(Direction.EAST, currentLocation.getDirection());
    }
    @Test
    void should_return_to_location_0_0_S_when_executeTurnRightCommand_given_0_0_East_and_command_turn_right(){
        Location initialLocation = new Location(0, 0,Direction.NORTH );
        Command givenCommand = Command.RIGHT;
        MarsRover marsRover = new MarsRover(initialLocation);

        marsRover.executeRightCommand(givenCommand);
        Location currentLocation = marsRover.getCurrentLocation();

        Assertions.assertEquals(0, currentLocation.getX());
        Assertions.assertEquals(0, currentLocation.getY());
        Assertions.assertEquals(Direction.EAST, currentLocation.getDirection());
    }
    @Test
    void should_return_to_location_0_0_W_when_executeTurnRightCommand_given_0_0_South_and_command_turn_right(){
        Location initialLocation = new Location(0, 0,Direction.NORTH );
        Command givenCommand = Command.RIGHT;
        MarsRover marsRover = new MarsRover(initialLocation);

        marsRover.executeRightCommand(givenCommand);
        Location currentLocation = marsRover.getCurrentLocation();

        Assertions.assertEquals(0, currentLocation.getX());
        Assertions.assertEquals(0, currentLocation.getY());
        Assertions.assertEquals(Direction.EAST, currentLocation.getDirection());
    }
    @Test
    void should_return_to_location_0_0_N_when_executeTurnRightCommand_given_0_0_West_and_command_turn_right(){
        Location initialLocation = new Location(0, 0,Direction.NORTH );
        Command givenCommand = Command.RIGHT;
        MarsRover marsRover = new MarsRover(initialLocation);

        marsRover.executeRightCommand(givenCommand);
        Location currentLocation = marsRover.getCurrentLocation();

        Assertions.assertEquals(0, currentLocation.getX());
        Assertions.assertEquals(0, currentLocation.getY());
        Assertions.assertEquals(Direction.EAST, currentLocation.getDirection());
    }
}
