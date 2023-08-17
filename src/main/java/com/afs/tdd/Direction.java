package com.afs.tdd;

public enum Direction {
    NORTH,EAST,SOUTH,WEST;

    public static Direction getNextDirectionWhenTurnRight(Direction direction){
        int nextIndex = (direction.ordinal() + 1) % Direction.values().length;
        return Direction.values()[nextIndex];
    }

    public static Direction getNextDirectionWhenTurnLeft(Direction direction){
        int nextIndex = (direction.ordinal() - 1 + Direction.values().length) % Direction.values().length;
        return Direction.values()[nextIndex];
    }

    public static Direction getAfterWestWhenTurnRight(Direction direction){
        if(direction == WEST){
            return NORTH;
        }
        return getNextDirectionWhenTurnRight(direction);
    }

    public static Direction getAfterEastWhenTurnLeft(Direction direction){
        if(direction == EAST){
            return NORTH;
        }
        return getNextDirectionWhenTurnLeft(direction);
    }
}
