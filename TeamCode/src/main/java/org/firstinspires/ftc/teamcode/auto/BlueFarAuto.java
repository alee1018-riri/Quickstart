package org.firstinspires.ftc.teamcode.auto;

import com.pedropathing.follower.Follower;
import com.pedropathing.geometry.Pose;
import com.pedropathing.util.Timer;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.robot.FTCRobot;

//Auto.java class
@Autonomous (name = "Blue Far")
public class BlueFarAuto extends LinearOpMode {
    private FTCRobot robot;
    private Follower follower;
    private static final String TAG = BlueFarAuto.class.getSimpleName();


    @Override
    public void runOpMode() throws InterruptedException {
        // create the robot and initialize hardware
        FTCRobot robot = new FTCRobot(hardwareMap);
        robot.init();
        follower = new Follower(hardwareMap);
        follower.setStartingPose(new Pose(0, 0, 0));

        telemetry.addData(TAG, "Waiting for start...");
        telemetry.update();

        waitForStart();

        // now use robot here


    }
}

