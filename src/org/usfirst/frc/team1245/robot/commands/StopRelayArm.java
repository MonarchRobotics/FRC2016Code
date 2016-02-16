package org.usfirst.frc.team1245.robot.commands;

import org.usfirst.frc.team1245.robot.subsystems.RelayArm;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class StopRelayArm extends Command {

    private boolean finished;
    private RelayArm subsystem;
    
    public StopRelayArm(RelayArm subsystem) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        finished = false;
        this.subsystem = subsystem;
        requires(subsystem);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        subsystem.armRelay.stopMotor();
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
