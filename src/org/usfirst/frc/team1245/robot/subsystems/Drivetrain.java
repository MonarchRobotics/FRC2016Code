package org.usfirst.frc.team1245.robot.subsystems;

import org.usfirst.frc.team1245.robot.RobotMap;
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
    public Drivetrain(){
        frontLeft = new CANTalon(RobotMap.frontLeft);
        frontRight = new CANTalon(RobotMap.frontRight);
        rearLeft = new CANTalon(RobotMap.rearLeft);
        rearRight = new CANTalon(RobotMap.rearRight);
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

