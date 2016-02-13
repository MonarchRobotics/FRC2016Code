package org.usfirst.frc.team1245.robot.subsystems;

import org.usfirst.frc.team1245.robot.RobotMap;
import org.usfirst.frc.team1245.robot.commands.MovePulley;

import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class PulleyArm extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public Relay pullyRelay;
    
    public PulleyArm() {
        pullyRelay = new Relay(RobotMap.pulleyArmChannel);
    }
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
        setDefaultCommand(new MovePulley());
    }
}

