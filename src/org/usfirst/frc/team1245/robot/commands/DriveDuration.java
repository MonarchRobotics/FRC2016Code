package org.usfirst.frc.team1245.robot.commands;

import org.usfirst.frc.team1245.robot.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveDuration extends Command {

    private double magnitude;
    private double duration;
    private Timer timer;
    
    public DriveDuration(double magnitude, double duration) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        this.magnitude = magnitude;
        this.duration = duration;
        timer = new Timer();
        requires(Robot.drivetrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        timer.start();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        Robot.drivetrain.robotDrive.arcadeDrive(-magnitude, 0);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return timer.get() >= duration;
    }

    // Called once after isFinished returns true
    protected void end() {
        timer.stop();
        timer.reset();
        Robot.drivetrain.robotDrive.stopMotor();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
