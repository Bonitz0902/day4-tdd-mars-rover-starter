package com.afs.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class DemoTest {
    @Test
    void should_return_to_location_0_1_N_when_executeMoveCommand_given_0_0_North_and_command_move() {
        Location initialLocation = new Location(0, 0,Direction.NORTH );
        Command givenCommand = Command.MOVE;
        MarsRover marsRover = new MarsRover(initialLocation);

        marsRover.givenCommands(givenCommand);
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

        marsRover.givenCommands(givenCommand);
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

        marsRover.givenCommands(givenCommand);
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

        marsRover.givenCommands(givenCommand);
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

        marsRover.givenCommands(givenCommand);
        Location currentLocation = marsRover.getCurrentLocation();

        Assertions.assertEquals(0, currentLocation.getX());
        Assertions.assertEquals(0, currentLocation.getY());
        Assertions.assertEquals(Direction.EAST, currentLocation.getDirection());
    }
    @Test
    void should_return_to_location_0_0_S_when_executeTurnRightCommand_given_0_0_East_and_command_turn_right(){
        Location initialLocation = new Location(0, 0,Direction.EAST );
        Command givenCommand = Command.RIGHT;
        MarsRover marsRover = new MarsRover(initialLocation);

        marsRover.givenCommands(givenCommand);
        Location currentLocation = marsRover.getCurrentLocation();

        Assertions.assertEquals(0, currentLocation.getX());
        Assertions.assertEquals(0, currentLocation.getY());
        Assertions.assertEquals(Direction.SOUTH, currentLocation.getDirection());
    }
    @Test
    void should_return_to_location_0_0_W_when_executeTurnRightCommand_given_0_0_South_and_command_turn_right(){
        Location initialLocation = new Location(0, 0,Direction.SOUTH );
        Command givenCommand = Command.RIGHT;
        MarsRover marsRover = new MarsRover(initialLocation);

        marsRover.givenCommands(givenCommand);
        Location currentLocation = marsRover.getCurrentLocation();

        Assertions.assertEquals(0, currentLocation.getX());
        Assertions.assertEquals(0, currentLocation.getY());
        Assertions.assertEquals(Direction.WEST, currentLocation.getDirection());
    }
    @Test
    void should_return_to_location_0_0_N_when_executeTurnRightCommand_given_0_0_West_and_command_turn_right(){
        Location initialLocation = new Location(0, 0,Direction.WEST );
        Command givenCommand = Command.RIGHT;
        MarsRover marsRover = new MarsRover(initialLocation);

        marsRover.givenCommands(givenCommand);
        Location currentLocation = marsRover.getCurrentLocation();

        Assertions.assertEquals(0, currentLocation.getX());
        Assertions.assertEquals(0, currentLocation.getY());
        Assertions.assertEquals(Direction.NORTH, currentLocation.getDirection());
    }

    @Test
    void should_return_to_location_0_0_W_when_executeTurnLeftCommand_given_0_0_North_and_command_left_right(){
        Location initialLocation = new Location(0, 0,Direction.NORTH );
        Command givenCommand = Command.LEFT;
        MarsRover marsRover = new MarsRover(initialLocation);

        marsRover.givenCommands(givenCommand);
        Location currentLocation = marsRover.getCurrentLocation();

        Assertions.assertEquals(0, currentLocation.getX());
        Assertions.assertEquals(0, currentLocation.getY());
        Assertions.assertEquals(Direction.WEST, currentLocation.getDirection());

    }

    @Test
    void should_return_to_location_0_0_S_when_executeTurnLeftCommand_given_0_0_West_and_command_left_right(){
        Location initialLocation = new Location(0, 0,Direction.WEST );
        Command givenCommand = Command.LEFT;
        MarsRover marsRover = new MarsRover(initialLocation);

        marsRover.givenCommands(givenCommand);
        Location currentLocation = marsRover.getCurrentLocation();

        Assertions.assertEquals(0, currentLocation.getX());
        Assertions.assertEquals(0, currentLocation.getY());
        Assertions.assertEquals(Direction.SOUTH, currentLocation.getDirection());

    }
    @Test
    void should_return_to_location_0_0_E_when_executeTurnLeftCommand_given_0_0_South_and_command_left_right(){
        Location initialLocation = new Location(0, 0,Direction.SOUTH );
        Command givenCommand = Command.LEFT;
        MarsRover marsRover = new MarsRover(initialLocation);

        marsRover.givenCommands(givenCommand);
        Location currentLocation = marsRover.getCurrentLocation();

        Assertions.assertEquals(0, currentLocation.getX());
        Assertions.assertEquals(0, currentLocation.getY());
        Assertions.assertEquals(Direction.EAST, currentLocation.getDirection());

    }
    @Test
    void should_return_to_location_0_0_N_when_executeTurnLeftCommand_given_0_0_East_and_command_left_right(){
        Location initialLocation = new Location(0, 0,Direction.EAST );
        Command givenCommand = Command.LEFT;
        MarsRover marsRover = new MarsRover(initialLocation);

        marsRover.givenCommands(givenCommand);
        Location currentLocation = marsRover.getCurrentLocation();

        Assertions.assertEquals(0, currentLocation.getX());
        Assertions.assertEquals(0, currentLocation.getY());
        Assertions.assertEquals(Direction.NORTH, currentLocation.getDirection());

    }

    @Test
    void should_return_to_location_when_executeBatchCommands_given_0_0_North_and_command_is_batch(){
        Location initialLocation = new Location(0, 0,Direction.NORTH );
        List<Command> listCommands = Arrays.asList(Command.MOVE,Command.LEFT,Command.MOVE,Command.RIGHT);
        MarsRover marsRover = new MarsRover(initialLocation);

        marsRover.executeListOfCommands(listCommands);
        Location currentLocation = marsRover.getCurrentLocation();

        Assertions.assertEquals(-1, currentLocation.getX());
        Assertions.assertEquals(1, currentLocation.getY());
        Assertions.assertEquals(Direction.NORTH, currentLocation.getDirection());
    }
}
