package org.usfirst.frc.team103.robot;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import com.ctre.CANTalon;



public class Drive extends Subsystem {
	
	
	public static final double WHEEL_BASE_LENGTH = 27.0; //double unit in inches
	public static final double WHEEL_BASE_WIDTH = 22.0;
	public static final double WHEEL_SPEED_MAXIMUM = 132.0; //11 * 12 (INCHES PER SECOND)
	//Robot goes 11 feet per second, converting it to inches per second ^
	
	public static void swerveDrive(double strafe, double forward, double omega) {
		strafe *= -WHEEL_SPEED_MAXIMUM;   //Converting velocity to inches per second.
		forward *= WHEEL_SPEED_MAXIMUM;  // ^ 
		omega *= -2.0 * Math.PI;
		//strafe = x | forward = y
		double A = strafe - omega * WHEEL_BASE_LENGTH / 2;
		double B = strafe + omega * WHEEL_BASE_LENGTH / 2;
		double C = forward - omega * WHEEL_BASE_WIDTH / 2;
		double D = forward + omega * WHEEL_BASE_WIDTH / 2;
		double pi = Math.PI;
		Math.atan2
		//Wheel 2
		double leftFrontSpeed = Math.hypot(B, D) / WHEEL_SPEED_MAXIMUM;
		double leftFrontAngle = -(Math.atan2(B, D) * 180.0/pi +180.0) * 1024.0/360.0;
		
		//Wheel 1
		double rightFrontSpeed = Math.hypot(B, C) / WHEEL_SPEED_MAXIMUM;
		double rightFrontAngle = -(Math.atan2(B, C) * 180.0/pi + 180.0) * 1024.0/360.0;
		
		//Wheel 3
		double leftRearSpeed = Math.hypot(A, D) / WHEEL_SPEED_MAXIMUM;
		double leftRearAngle = -(Math.atan2(A, D) * 180.0/pi + 180.0) * 1024.0/360.0;
		
		//Wheel 4
		double rightRearSpeed = Math.hypot(A, C) / WHEEL_SPEED_MAXIMUM; //Take all speeds
		double rightRearAngle = -(Math.atan2(A, C) * 180.0/pi + 180.0) * 1024.0/360.0;
		
		if(leftFrontAngle) {
			
		}
		
		RobotMap.driveLeftFront.set(leftFrontSpeed);
		RobotMap.driveLeftRear.set(leftRearSpeed);
		RobotMap.driveRightFront.set(rightFrontSpeed);
		RobotMap.driveRightRear.set(rightRearSpeed);
		
		RobotMap.steerLeftFront.set(leftFrontAngle);
		RobotMap.steerLeftRear.set(leftRearAngle);
		RobotMap.steerRightFront.set(rightFrontAngle);
		RobotMap.steerRightRear.set(rightRearAngle);
		
		SmartDashboard.putNumber("Left Front Speed", leftFrontSpeed);
		SmartDashboard.putNumber("Left Rear Speed", leftRearSpeed);
		SmartDashboard.putNumber("Right Front Speed", rightFrontSpeed);
		SmartDashboard.putNumber("Right Rear Speed", rightRearSpeed);
		SmartDashboard.putNumber("Left Front Angle", leftFrontAngle);
		SmartDashboard.putNumber("Left Rear Angle", leftRearAngle);
		SmartDashboard.putNumber("Right Front Angle", rightFrontAngle);
		SmartDashboard.putNumber("Right Rear Angle", rightRearAngle);
		
	}
	
	@Override
	protected void initDefaultCommand() {
		
	}
	


}

