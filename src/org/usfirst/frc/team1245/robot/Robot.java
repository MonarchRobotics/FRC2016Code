
package org.usfirst.frc.team1245.robot;

import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

import org.usfirst.frc.team1245.robot.commands.StopRelayArm;
import org.usfirst.frc.team1245.robot.subsystems.Drivetrain;
import org.usfirst.frc.team1245.robot.subsystems.LeverArm;
import org.usfirst.frc.team1245.robot.subsystems.RelayArm;
import org.usfirst.frc.team1245.robot.subsystems.Scalar;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {

	public static OI oi;
	public static final Drivetrain drivetrain = new Drivetrain(RobotMap.frontLeft, RobotMap.frontRight, RobotMap.rearLeft, RobotMap.rearRight);
	public static final LeverArm leverArm = new LeverArm(RobotMap.leverArmChannel, RobotMap.leverForwardChannel, RobotMap.leverReverseChannel);
	public static final RelayArm pulleyArm = new RelayArm(RobotMap.pulleyArmChannel);
	public static final Scalar scalar = new Scalar(RobotMap.scalarLeft, RobotMap.scalarRight, RobotMap.scalarForwardChannel, RobotMap.scalarReverseChannel);
	
	public DigitalInput limitSwitch;
	
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     * Gtfo boskin k?
     */
    public void robotInit() {
        oi = new OI();
		CameraServer.getInstance().startAutomaticCapture();
		limitSwitch = new DigitalInput(0);
		// instantiate the command used for the autonomous period
    }
	
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

    public void autonomousInit() {
        // schedule the autonomous command (example)
  //     if (autonomousCommand != null) autonomousCommand.start();
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    public void teleopInit() {
		// This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to 
        // continue until interrupted by another command, remove
        // this line or comment it out.
        // or comment everything
    //    if (autonomousCommand != null) autonomousCommand.cancel();
    }

    /**
     * This function is called when the disabled button is hit.
     * You can use it to reset subsystems before shutting down.
     */
    public void disabledInit(){

    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        if(limitSwitch.get()) {
            Scheduler.getInstance().add(new StopRelayArm(Robot.leverArm));
        }
        Scheduler.getInstance().run();
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
        LiveWindow.run();
    }
}
