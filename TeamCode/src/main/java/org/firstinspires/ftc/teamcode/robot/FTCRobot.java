package org.firstinspires.ftc.teamcode.robot;


import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

import java.util.HashMap;
import java.util.Map;

public class FTCRobot {
    /*
    includes all hardware IDs
     */
    private final HardwareMap hardwareMap;
    private final Map<MotorID, DcMotor> motors = new HashMap<>();
    public FTCRobot(HardwareMap hardwareMap) {
        this.hardwareMap = hardwareMap;
    }

    /* names for robot elements in an enum-based state machine
    (drive train motors correlate to mecanum drive train motor names in constants class in pedro pathing
     */

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

    // names elements in driver hub configuration

    public static final String FRONT_LEFT_DRIVE_NAME  = "lf";
    public static final String FRONT_RIGHT_DRIVE_NAME = "rf";
    public static final String BACK_LEFT_DRIVE_NAME   = "lb";
    public static final String BACK_RIGHT_DRIVE_NAME  = "rb";
    public static final String INTAKE_NAME            = "intake";
    public static final String FLYWHEEL_SHOOTER_NAME  = "flywheelShooter";

    // public static final String DRIVE_TRAIN__NAME = "DRIVE TRAIN";


    // servos

    // cameras
    public static final String LIMELIGHT_CAMERA_NAME = "Limelight Camera";


    // connecting drive trains motors in this class and constant class
    public void init() {
        // MoterID and name strings connect
        motors.put(MotorID.FRONT_LEFT_DRIVE,
                hardwareMap.get(DcMotor.class, FRONT_LEFT_DRIVE_NAME));
        motors.put(MotorID.FRONT_RIGHT_DRIVE,
                hardwareMap.get(DcMotor.class, FRONT_RIGHT_DRIVE_NAME));
        motors.put(MotorID.BACK_LEFT_DRIVE,
                hardwareMap.get(DcMotor.class, BACK_LEFT_DRIVE_NAME));
        motors.put(MotorID.BACK_RIGHT_DRIVE,
                hardwareMap.get(DcMotor.class, BACK_RIGHT_DRIVE_NAME));
    }
}

