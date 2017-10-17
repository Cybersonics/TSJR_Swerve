package org.usfirst.frc.team103.robot;

import com.ctre.CANTalon;
import com.ctre.CANTalon.FeedbackDevice;
import com.ctre.CANTalon.TalonControlMode;

import edu.wpi.first.wpilibj.livewindow.LiveWindow;

public class RobotMap {


    public static CANTalon driveLeftFront;
    public static CANTalon driveLeftRear;
    public static CANTalon driveRightFront;
    public static CANTalon driveRightRear;
    public static CANTalon steerLeftFront;
    public static CANTalon steerLeftRear;
    public static CANTalon steerRightFront;
    public static CANTalon steerRightRear;
	
	
	public static void init(){
        driveLeftFront = new CANTalon(10);
        driveLeftFront.setFeedbackDevice(FeedbackDevice.QuadEncoder);
        driveLeftFront.reverseSensor(true);
        LiveWindow.addActuator("Drive", "LeftFrontDrive", driveLeftFront);
        
        driveLeftRear = new CANTalon(11);
        driveLeftRear.setFeedbackDevice(FeedbackDevice.QuadEncoder);
        LiveWindow.addActuator("Drive", "LeftRearDrive", driveLeftRear);
        
        driveRightFront = new CANTalon(12);
        driveRightFront.setFeedbackDevice(FeedbackDevice.QuadEncoder);
        driveRightFront.setInverted(true);
        LiveWindow.addActuator("Drive", "RightFrontDrive", driveRightFront);
        
        driveRightRear = new CANTalon(13);
        driveRightRear.setFeedbackDevice(FeedbackDevice.QuadEncoder);
        driveRightRear.setInverted(true);
        driveRightRear.reverseSensor(true);
        LiveWindow.addActuator("Drive", "RightRearDrive", driveRightRear);
        
        steerLeftFront = new CANTalon(16);
        steerLeftFront.setFeedbackDevice(FeedbackDevice.AnalogEncoder);
        steerLeftFront.setPID(10.0, 0.02, 0.0);
        steerLeftFront.setIZone(100);
        steerLeftFront.setAllowableClosedLoopErr(5);
        steerLeftFront.changeControlMode(TalonControlMode.Position);
        LiveWindow.addActuator("Steer", "LeftFrontSteer", steerLeftFront);
        
        steerLeftRear = new CANTalon(17);
        steerLeftRear.setFeedbackDevice(FeedbackDevice.AnalogEncoder);
        steerLeftRear.setPID(10.0, 0.02, 0.0);
        steerLeftRear.setIZone(100);
        steerLeftRear.setAllowableClosedLoopErr(5);
        steerLeftRear.changeControlMode(TalonControlMode.Position);
        LiveWindow.addActuator("Steer", "LeftRearSteer", steerLeftRear);
        
        steerRightFront = new CANTalon(18);
        steerRightFront.setFeedbackDevice(FeedbackDevice.AnalogEncoder);
        steerRightFront.setPID(10.0, 0.02, 0.0);
        steerRightFront.setIZone(100);
        steerRightFront.setAllowableClosedLoopErr(5);
        steerRightFront.changeControlMode(TalonControlMode.Position);
        LiveWindow.addActuator("Steer", "RightFrontSteer", steerRightFront);
        
        steerRightRear = new CANTalon(19);
        steerRightRear.setFeedbackDevice(FeedbackDevice.AnalogEncoder);
        steerRightRear.setPID(10.0, 0.02, 0.0);
        steerRightRear.setIZone(100);
        steerRightRear.setAllowableClosedLoopErr(5);
        steerRightRear.changeControlMode(TalonControlMode.Position);
        LiveWindow.addActuator("Steer", "RightRearSteer", steerRightRear);
		
		
	}
	
	
}
