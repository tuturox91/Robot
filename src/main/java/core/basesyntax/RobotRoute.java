package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {



        if(robot.getX() > toX) {
            rotateRobot(robot, Direction.LEFT);
        } else {
            rotateRobot(robot, Direction.RIGHT);
        }
        //move
        while (robot.getX() != toX)
        {
            robot.stepForward();
        }

        if(robot.getY() > toY) {
            rotateRobot(robot, Direction.DOWN);

        } else {
            rotateRobot(robot, Direction.UP);
        }
        //move
        while (robot.getY() != toY)
        {
            robot.stepForward();
        }

    }
    private void rotateRobot(Robot robot, Direction neededDirection) {
        while(robot.getDirection() != neededDirection) {
            robot.turnRight();
        }
    }




}
