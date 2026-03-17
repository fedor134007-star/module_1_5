package org.example.proxy.ex2;

public class ProxyRobot implements Robot {
    RobotAndroid robot;
    @Override
    public void checkRobot(){
        if(robot == null){
            robot = new RobotAndroid();
        }
    }

    @Override
    public void work() {
        robot.work();
        IO.println("Большой брат следит за тобой!");
    }
}
