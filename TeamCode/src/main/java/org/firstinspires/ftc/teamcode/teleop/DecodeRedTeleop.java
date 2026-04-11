package org.firstinspires.ftc.teamcode.teleop;

import com.pedropathing.follower.Follower;
import com.pedropathing.geometry.Pose;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.robot.FTCRobot;

@TeleOp (name = "DECODE RED")
public class DecodeRedTeleop extends OpMode {

    private FTCRobot robot;
    private Follower follower;

    private static final String TAG = DecodeRedTeleop.class.getSimpleName();

    // use enums to express states for teleop
    public enum TeleOpStates {

    }

    @Override
    public void init() {
        FTCRobot robot = new FTCRobot(hardwareMap);
        robot.init();
        follower = new Follower(hardwareMap);

        telemetry.addData(TAG, "Waiting for start...");
        telemetry.update();
    }

    @Override
    public void loop() {


    }
}
