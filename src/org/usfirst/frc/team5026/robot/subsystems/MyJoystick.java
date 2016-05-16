package org.usfirst.frc.team5026.robot.subsystems;
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
}