package org.usfirst.frc.team5026.robot.subsystems;
import org.usfirst.frc.team5026.robot.Robot;

import edu.wpi.first.wpilibj.Joystick;

public class MyJoystick extends Joystick {
	
	public int powerOfOne;
	public double m_deadzoneX;
	public double m_deadzoneY;
	double motorDeadZone;
	double scalingX;
	double scalingY; // slope of joystick curve
	
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
		if(Math.abs(value) <= m_deadzoneX || Math.abs(value) <= motorDeadZone) {
			return 0;
		}
		return value * scalingX;
	}
	public double getModY() {
		double value = getY();
		if(Math.abs(value) <= m_deadzoneY || Math.abs(value) <= motorDeadZone) {
			return 0;
		}
		return value * scalingY;
	}
}