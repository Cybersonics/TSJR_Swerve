package org.usfirst.frc.team103.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.usfirst.frc.team103.robot.RobotMap;


public class Robot extends IterativeRobot {
	final String defaultAuto = "Default";
	final String customAuto = "My Auto";
	String autoSelected;
	SendableChooser<String> chooser = new SendableChooser<>();


	@Override
	public void robotInit() {
		//Jacob was here
		//Trevor wasn't here
		chooser.addDefault("Default Auto", defaultAuto);
		chooser.addObject("My Auto", customAuto);
		SmartDashboard.putData("Auto choices", chooser);
	}

	@Override
	public void autonomousInit() {
		autoSelected = chooser.getSelected();
		// autoSelected = SmartDashboard.getString("Auto Selector",

		System.out.println("Auto selected: " + autoSelected);
	}

	
	@Override
	public void autonomousPeriodic() {
		
		
	}


	@Override
	public void teleopPeriodic() {
		RobotMap.leftJoy.getRawAxis(0); //X-Axis
		RobotMap.leftJoy.getRawAxis(1); //Y-Axis
		RobotMap.rightJoy.getRawAxis(0);
		
		
	}

	
	@Override
	public void testPeriodic() {
	}
}

