package org.usfirst.frc.team5026.robot.subsystems;
import org.usfirst.frc.team5026.robot.Robot;

import edu.wpi.first.wpilibj.Joystick;

public class MyJoystick extends Joystick {
	
	public int powerOfOne;
	public double m_deadzoneX;
	public double m_deadzoneY;
	double motorDeadZone;
	double scalingX = 0.5; // slope of joystick curve
	double scalingY = 1; // slope of joystick curve
	
	public MyJoystick(int port, double deadzoneX, double deadzoneY, double driveMotorsDeadZone, double joystickXScaling, double joystickYScaling) {
		super(port);
		m_deadzoneX = deadzoneX;
		m_deadzoneY = deadzoneY;
		scalingX = joystickXScaling;
		scalingY = joystickYScaling;
		motorDeadZone = driveMotorsDeadZone;
		powerOfOne = 1;	
	}
	
	public double getModX() {
		double value = getX();
		if(value <= m_deadzoneX) {
			value = 0;
		}
		return value;
	}
	public double getModY() {
		double value = getY();
		if(value <= m_deadzoneY) {
			value = 0;
		}
		return value;
	}
}