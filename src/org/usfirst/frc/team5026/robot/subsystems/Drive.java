package org.usfirst.frc.team5026.robot.subsystems;

import org.usfirst.frc.team5026.robot.commands.ArcadeDrive;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Drive extends Subsystem {

	RobotDrive drive;

	public Drive(SpeedController leftMotor, SpeedController rightMotor) {
		drive = new RobotDrive(leftMotor, rightMotor);
	}
	
	public void myArcadeDrive(double xAxis, double yAxis) {
		drive.arcadeDrive(yAxis, xAxis);
	}
	public void setLeftRightMotor(double leftMotor, double rightMotor) {
		drive.setLeftRightMotorOutputs(leftMotor, rightMotor);
	}
	public void timeToStop() {
		setLeftRightMotor(0.0 , 0.0);
	}
	public void initDefaultCommand() {
    	setDefaultCommand(new ArcadeDrive());
    }
}
