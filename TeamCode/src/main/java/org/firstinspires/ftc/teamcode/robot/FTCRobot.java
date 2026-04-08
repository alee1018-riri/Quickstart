package org.firstinspires.ftc.teamcode.robot;



public class FTCRobot {
    private static final String TAG = FTCRobot.class.getSimpleName();

    // all motors
    public enum MotorID {
       // drive motors
        FRONT_LEFT_DRIVE,     //front left drive motor
        FRONT_RIGHT_DRIVE,     // front right drive motor
        BACK_LEFT_DRIVE,       // back left drive motor
        BACK_RIGHT_DRIVE,      // back right drive motor

        // other motors used
        INTAKE,       // intake motor
        FLYWHEEL_SHOOTER,      // shooter motor
        MOTOR_ID_NPOS        // represents "no motor" / invalid — for error checking

    }

    public enum MotorAction {
        MOVE_AND_HOLD_VELOCITY,  // keep motor running at a set speed (RUN_USING_ENCODER)
        MOVE_AND_STOP            // move then stop (RUN_TO_POSITION)
    }

    // servos
    public enum ServoID {
        // include all robot parts that have servos in a (XX, XX, ETC) format

    }

    public enum SensorID {
        COLOUR_SENSOR,       // colour sensor
        DISTANCE_SENSOR    // distance sensor

    }


}