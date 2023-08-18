package com.afs.tdd;

import java.util.List;

import static com.afs.tdd.Command.*;
import static com.afs.tdd.Direction.*;

public class MarsRover {
    private Location location;

    public MarsRover(Location location) {
        this.location = location;
    }

    public void executeMoveCommand() {
        if (location.getDirection() == NORTH) {
            location.setY(location.getY() + 1);
        } else if (location.getDirection() == EAST) {
            location.setX(location.getX() + 1);
        } else if (location.getDirection() == SOUTH) {
            location.setY(location.getY() - 1);
        } else if (location.getDirection() == WEST) {
            location.setX(location.getX() - 1);
        }
    }

    public void executeRightCommand() {
        this.location.setDirection(getAfterWestWhenTurnRight(this.location.getDirection()));
    }

    public Location getCurrentLocation() {
        return location;
    }


    public void executeLeftCommand() {
        this.location.setDirection(getAfterEastWhenTurnLeft(this.location.getDirection()));
    }


    public void executeListOfCommands(List<Command> listCommands) {
        listCommands.forEach(this::givenCommands);
    }

    public void givenCommands(Command command) {
        if (command == MOVE) {
            executeMoveCommand();
        } else if (command == RIGHT) {
            executeRightCommand();
        } else if (command == LEFT) {
            executeLeftCommand();
        }
    }
}
