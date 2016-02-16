package org.usfirst.frc.team1245.robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
	public static int frontLeft = 2;
	public static int frontRight = 4;
	public static int rearLeft = 1;
	public static int rearRight = 3;
	public static double deadZone = .1;
	
	public static int pulleyArmChannel = 0;
	
	//Lifter channels, may need to change later.
	public static final int lifterForwardChannel = 0;
	public static final int lifterReverseChannel = 1;
	public static final int leverArmChannel = 1;
	
	public static final int moveLeverArmUpButton = 3;
	public static final int moveLeverArmDownButton = 2;
	public static final int elevateLeverArmButton = 1;
}
