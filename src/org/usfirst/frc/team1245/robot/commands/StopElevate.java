package org.usfirst.frc.team1245.robot.commands;

import org.usfirst.frc.team1245.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class StopElevate extends Command {

    private boolean finished;
    
    public StopElevate() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        finished = false;
        requires(Robot.scalar);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        Robot.scalar.leftMotor.set(0);
        Robot.scalar.rightMotor.set(0);
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
