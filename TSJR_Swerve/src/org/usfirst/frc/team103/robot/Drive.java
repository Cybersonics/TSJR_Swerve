package org.usfirst.frc.team103.robot;

import edu.wpi.first.wpilibj.command.Subsystem;
import com.ctre.CANTalon;



public class Drive extends Subsystem {
	
	
	public static final double WHEEL_BASE_LENGTH = 27.0; //double unit in inches
	public static final double WHEEL_BASE_WIDTH = 22.0;
	public static final double WHEEL_SPEED_MAXIMUM = 132.0; //11 * 12 (INCHES PER SECOND)
	
	public static void swerveDrive(double strafe, double forward, double omega) {
		strafe *= WHEEL_SPEED_MAXIMUM;   //Converting velocity to inches per second.
		forward *= WHEEL_SPEED_MAXIMUM;  // ^ 
		//strafe = x | forward = y
		double A = strafe - omega * WHEEL_BASE_LENGTH / 2;
		double B = strafe + omega * WHEEL_BASE_LENGTH / 2;
		double C = forward - omega * WHEEL_BASE_WIDTH / 2;
		double D = forward + omega * WHEEL_BASE_WIDTH / 2;
		double pi = Math.PI;
		
		//Wheel 2
		double leftFrontSpeed = Math.hypot(B, D);
		double leftFrontAngle = Math.atan2(B, D) * 180/pi;	
		
		//Wheel 1
		double rightFrontSpeed = Math.hypot(B, C);
		double rightFrontAngle = Math.atan2(B, C) * 180/pi;
		
		//Wheel 3
		double leftRearSpeed = Math.hypot(A, D);
		double leftRearAngle = Math.atan2(A, D) * 180/pi;
		
		//Wheel 4
		double rightRearSpeed = Math.hypot(A, C);
		double rightRearAngle = Math.atan2(A, C) * 180/pi;
		
		RobotMap.driveLeftFront.set(leftFrontSpeed);
		RobotMap.driveLeftRear.set(leftRearSpeed);
		RobotMap.driveRightFront.set(rightFrontSpeed);
		RobotMap.driveRightRear.set(rightRearSpeed);
		
		RobotMap.steerLeftFront.set(leftFrontAngle);
		RobotMap.steerLeftRear.set(leftRearAngle);
		RobotMap.steerRightFront.set(rightFrontAngle);
		RobotMap.steerRightRear.set(rightRearAngle);
		
		
	}
	
	@Override
	protected void initDefaultCommand() {
		
	}
	


}

