package org.usfirst.frc.team1245.robot.subsystems;

import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class RelayArm extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public Relay armRelay;
    
    public RelayArm(int relayChannel) {
        armRelay = new Relay(relayChannel);
    }
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

