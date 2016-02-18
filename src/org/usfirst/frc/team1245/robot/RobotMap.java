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
	public static final int frontLeft = 2;
	public static final int frontRight = 4;
	public static final int rearLeft = 1;
	public static final int rearRight = 3;
	public static final double deadZone = .1;
	
	public static final int pulleyArmChannel = 0;
	
	public static final int leverForwardChannel = 0;
	public static final int leverReverseChannel = 1;
	public static final int leverArmChannel = 1;
	
	public static final int moveLeverArmUpButton = 3;
	public static final int moveLeverArmDownButton = 2;
	public static final int elevateLeverArmButton = 1;
	
	public static final int movePulleyArmUpButton = 6;
	public static final int movePulleyArmDownButton = 7;
	
	public static final int scalarLeft = 5;
	public static final int scalarRight = 6;
	public static final int scalarForwardChannel = 0;
	public static final int scalarReverseChannel = 0;
	
	public static final int toggleExtendArmButton = 8;
	public static final int elevateButton = 11;
	public static final int descendButton = 10;
	public static final double elevateMagnitude = .5;
}
