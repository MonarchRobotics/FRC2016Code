package org.usfirst.frc.team1245.robot.commands;

import org.usfirst.frc.team1245.robot.subsystems.RelayArm;

import edu.wpi.first.wpilibj.Relay.Value;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class MoveRelayArm extends Command{
	
    private Value direction;
    private boolean finished;
    private RelayArm subsytem;
    
	public MoveRelayArm(Value direction, RelayArm subsystem){
		// Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
	    this.direction = direction;
	    this.subsytem = subsystem;
	    finished = false;
		requires(subsystem);
	}
	// Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        SmartDashboard.putString("Direction", direction.toString());
        subsytem.armRelay.set(direction);
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
