package org.usfirst.frc.team1245.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;

public class LeverArm extends RelayArm {
    
	public DoubleSolenoid lifterSolenoid;
	public boolean isElevated;

	//add more arguments if needed.
	public LeverArm(int relayChannel, int forwardChannel, int reverseChannel){
	    super(relayChannel);
	    isElevated = false;
		lifterSolenoid = new DoubleSolenoid(forwardChannel, reverseChannel);
	}
	
	//here are methods to use in Commands
	
	//no default command
	public void initDefaultCommand(){
		//There is no default command
	}
}
