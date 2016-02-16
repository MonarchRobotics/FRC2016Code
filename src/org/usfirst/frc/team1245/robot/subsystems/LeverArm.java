package org.usfirst.frc.team1245.robot.subsystems;

import org.usfirst.frc.team1245.robot.RobotMap;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

public class LeverArm extends Subsystem {
	public DoubleSolenoid lifterSolenoid;
	public Relay leverArmRelay;
	public boolean isElevated;
	public DigitalInput limitSwitch;
	//add more arguments if needed.
	public LeverArm(){
		lifterSolenoid = new DoubleSolenoid(RobotMap.lifterForwardChannel, RobotMap.lifterReverseChannel);
		leverArmRelay = new Relay(RobotMap.leverArmChannel);
		limitSwitch = new DigitalInput(0);
		isElevated = false;
	}
	
	//here are methods to use in Commands
	
	//no default command
	public void initDefaultCommand(){
		//There is no default command
	}
}
