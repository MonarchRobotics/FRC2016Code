package org.usfirst.frc.team1245.robot.commands;

import org.usfirst.frc.team1245.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Elevate extends Command {

    private boolean finished;
    private double magnitude;
    
    public Elevate(double magnitude) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        this.magnitude = magnitude;
        finished = false;
        requires(Robot.scalar);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        Robot.scalar.leftMotor.set(magnitude);
        Robot.scalar.rightMotor.set(magnitude);
        finished = true;
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
