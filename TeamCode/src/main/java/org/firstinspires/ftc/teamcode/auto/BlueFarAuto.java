package org.firstinspires.ftc.teamcode.auto;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

import org.firstinspires.ftc.teamcode.robot.FTCRobot;

//Auto.java class
@Autonomous (name = "Blue Far")
public class BlueFarAuto extends LinearOpMode {

    private static final String TAG = BlueFarAuto.class.getSimpleName();

    @Override
    public void runOpMode() throws InterruptedException {
        // everything here acts like init()

        telemetry.addData("Initialization", "Successful");
        telemetry.update();

        waitForStart();  // waits for driver to press START

        }
    if

    }

}

