package org.usfirst.frc.team1245.robot.subsystems;

import org.usfirst.frc.team1245.robot.RobotMap;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

public class LeverArm extends Subsystem {
	public Solenoid lifterSolenoid, grabberSolenoid;
	public boolean isGripped, isElevated;
	//add more arguments if needed.
	public LeverArm(){
		lifterSolenoid = new Solenoid(RobotMap.lifterChannel);
		grabberSolenoid = new Solenoid(RobotMap.grabberChannel);
		isGripped = false;
		isElevated = false;
	}
	
	//here are methods to use in Commands
	
	//no default command
	public void initDefaultCommand(){
		//There is no default command
	}
}
