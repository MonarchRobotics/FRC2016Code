package org.usfirst.frc.team1245.robot.commands;

import org.usfirst.frc.team1245.robot.OI;
import org.usfirst.frc.team1245.robot.Robot;

import edu.wpi.first.wpilibj.Relay.Value;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class MoveLeverArm extends Command{
	
    private Value direction;
    private boolean finished;
    
	public MoveLeverArm(Value direction){
		// Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
	    this.direction = direction;
	    finished = false;
		requires(Robot.leverArm);
	}
	// Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        SmartDashboard.putString("Direction", direction.toString());
        Robot.leverArm.leverArmRelay.set(direction);
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
