package org.usfirst.frc.team1245.robot.commands;

import org.usfirst.frc.team1245.robot.Robot;

import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Command;

public class ToggleHeight extends Command{
	
    private boolean finished;
    
	public ToggleHeight(){
		// Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
	    finished = false;
		requires(Robot.leverArm);
	}
	// Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.leverArm.isElevated = !Robot.leverArm.isElevated;
    	if(Robot.leverArm.isElevated) {
    	    Robot.leverArm.lifterSolenoid.set(Value.kForward);
    	} else {
    	    Robot.leverArm.lifterSolenoid.set(Value.kReverse);
    	}
    	finished = true;
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return finished;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
