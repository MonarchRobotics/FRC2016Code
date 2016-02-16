package org.usfirst.frc.team1245.robot.subsystems;

import org.usfirst.frc.team1245.robot.commands.Drive;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drivetrain extends Subsystem {
    public CANTalon frontLeft, frontRight, rearLeft, rearRight;
    public RobotDrive robotDrive;
    public Drivetrain(int frontLeft, int frontRight, int rearLeft, int rearRight){
        this.frontLeft = new CANTalon(frontLeft);
        this.frontRight = new CANTalon(frontRight);
        this.rearLeft = new CANTalon(rearLeft);
        this.rearRight = new CANTalon(rearRight);
        robotDrive = new RobotDrive(frontLeft, rearLeft, frontRight, rearRight);
        
    }
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
        setDefaultCommand(new Drive());
    }
}

