package org.usfirst.frc.team1245.robot.subsystems;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Scalar extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public CANTalon leftMotor;
    public CANTalon rightMotor;
    public DoubleSolenoid solenoid;
    public boolean isExtended;

    public Scalar(int leftMotor, int rightMotor, int forwardChannel, int reverseChannel) {
        this.leftMotor = new CANTalon(leftMotor);
        this.rightMotor = new CANTalon(rightMotor);
        solenoid = new DoubleSolenoid(forwardChannel, reverseChannel);
        isExtended = false;
    }
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

