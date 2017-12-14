package org.usfirst.frc.team103.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.usfirst.frc.team103.robot.RobotMap;
import org.usfirst.frc.team103.robot.Drive;


public class Robot extends IterativeRobot {


	@Override
	public void robotInit() {
		//Jacob was here
		//Trevor wasn't here
		
		RobotMap.init();
	}

	@Override
	public void autonomousInit() {
	}

	
	@Override
	public void autonomousPeriodic() {
		
		
	}


	@Override
	public void teleopPeriodic() {
		//Not Actually needed here, defining each axis with corresponding variable.
		RobotMap.leftJoy.getRawAxis(0); //X-Axis (strafe)
		RobotMap.leftJoy.getRawAxis(1); //Y-Axis (forward)
		RobotMap.rightJoy.getRawAxis(0); //X-Axis (omega)
		
		Drive.swerveDrive(RobotMap.leftJoy.getX(), RobotMap.leftJoy.getY(), RobotMap.rightJoy.getX());
		
		
	}

	
	@Override
	public void testPeriodic() {
	}
}

