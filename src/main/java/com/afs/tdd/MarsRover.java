package com.afs.tdd;

import java.util.List;

public class MarsRover {
    private Location location;

    public MarsRover(Location location) {
        this.location = location;
    }

    public void executeMoveCommand() {
        if (location.getDirection() == Direction.NORTH) {
            location.setY(location.getY() + 1);
        } else if (location.getDirection() == Direction.EAST) {
            location.setX(location.getX() + 1);
        } else if (location.getDirection() == Direction.SOUTH) {
            location.setY(location.getY() - 1);
        } else if (location.getDirection() == Direction.WEST) {
            location.setX(location.getX() - 1);
        }
    }

    public void executeRightCommand() {
        this.location.setDirection(Direction.getAfterWestWhenTurnRight(this.location.getDirection()));
    }

    public Location getCurrentLocation() {
        return location;
    }


    public void executeLeftCommand() {
        this.location.setDirection(Direction.getAfterEastWhenTurnLeft(this.location.getDirection()));
    }


    public void executeListOfCommands(List<Command> listCommands) {
        listCommands.forEach(this::givenCommands);
    }

    public void givenCommands(Command command) {
        if (command == Command.MOVE) {
            executeMoveCommand();
        } else if (command == Command.RIGHT) {
            executeRightCommand();
        } else if (command == Command.LEFT) {
            executeLeftCommand();
        }
    }
}
