package org.firstinspires.ftc.teamcode.teleop;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

import org.firstinspires.ftc.teamcode.robot.FTCRobot;

// @TeleOp(name = "Main TeleOp")
public class MainTeleop extends OpMode {
    // main that applies to all functions of teleop (gamepad/drive train control, resting state, etc)
    private FTCRobot robot;

    @Override
    public void init() {
        RobotState currentState = RobotState.IDLE; // always start at rest
        telemetry.addData("Waiting for Start...", " ");
    }

    @Override
    public void loop() {
        while () {
            handleDrivetrain();

        }
    }

    // use enums to express states for teleop
    public enum RobotState {
        IDLE,   // robot at rest
        INTAKING,  // intake state
        SHOOTING,  // shoot
        // express other states here
    }


    private void updateStateMachine() {
        switch (currentState) {

            case IDLE:
                // motors off
                robot.setMotorPower(FTCRobot.MotorID.INTAKE, 0);
                robot.setMotorPower(FTCRobot.MotorID.FLYWHEEL_SHOOTER, 0);

                // transitions out of IDLE
               /* if (gamepad1.a) {
                    currentState = RobotState.INTAKING;
                }
                if (gamepad1.b) {
                    currentState = RobotState.REVVING;
                }
                break;

            case INTAKING:
                // run intake
                robot.setMotorPower(FTCRobot.MotorID.INTAKE, 1.0);

                // transitions out of INTAKING
                if (!gamepad1.a) {
                    // driver released button, go back to idle
                    currentState = DecodeRedTeleop.RobotState.IDLE;
                }
                if (gamepad1.b) {
                    // driver wants to shoot, stop intake first
                    currentState = DecodeRedTeleop.RobotState.REVVING;
                }
                break;

            case REVVING:
                // spin flywheel up to speed
                robot.setMotorPower(MotorID.FLYWHEEL_SHOOTER, 0.8);
                robot.setMotorPower(MotorID.INTAKE, 0); // stop intake while revving

                // transitions out of REVVING
                if (robot.flywheelAtSpeed()) {
                    // flywheel ready, move to shooting
                    currentState = DecodeRedTeleop.RobotState.SHOOTING;
                }
                if (gamepad1.x) {
                    // driver cancels
                    currentState = DecodeRedTeleop.RobotState.IDLE;
                }
                break;

            case SHOOTING:
                // flywheel already running, feed rings in
                robot.setMotorPower(MotorID.INTAKE, 0.5); // slow intake to feed

                // transitions out of SHOOTING
                if (!gamepad1.b) {
                    // driver released shoot button
                    currentState = DecodeRedTeleop.RobotState.RETRACTING;
                }
                break;

                */
        }
    }
    private void handleDrivetrain() {
        double drive  = -gamepad1.left_stick_y;
        double strafe =  gamepad1.left_stick_x;
        double turn   =  gamepad1.right_stick_x;

        // mecanum drive math
        double lf = drive + strafe + turn;
        double rf = drive - strafe - turn;
        double lr = drive - strafe + turn;
        double rr = drive + strafe - turn;

        /*
        robot.setMotorPower(FTCRobot.MotorID.FRONT_LEFT_DRIVE,  lf);
        robot.setMotorPower(FTCRobot.MotorID.FRONT_RIGHT_DRIVE, rf);
        robot.setMotorPower(FTCRobot.MotorID.BACK_LEFT_DRIVE,   lr);
        robot.setMotorPower(FTCRobot.MotorID.BACK_RIGHT_DRIVE,  rr);

         */
    }
}