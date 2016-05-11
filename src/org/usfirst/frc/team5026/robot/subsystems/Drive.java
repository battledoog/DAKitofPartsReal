package org.usfirst.frc.team5026.robot.subsystems;
import org.usfirst.frc.team5026.robot.Hardware;


import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;

public class Drive {

	Hardware hardware;
	RobotDrive drive;

	public Drive(SpeedController leftMotor, SpeedController rightMotor) {
		
		drive = new RobotDrive(leftMotor, rightMotor);
	}
	
	public void myArcadeDrive(double xAxis, double yAxis) {
		drive.arcadeDrive(yAxis, xAxis);
	}
}
