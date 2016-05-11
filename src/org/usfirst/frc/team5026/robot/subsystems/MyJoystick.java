package org.usfirst.frc.team5026.robot.subsystems;
import edu.wpi.first.wpilibj.Joystick;

public class MyJoystick extends Joystick {
	
	private int axisX = 0;
	private int axisY = 0;
	
	public int powerOfOne;
	public double m_deadzoneX;
	public double m_deadzoneY;
	public double motorDeadZone;
	public double scalingX = 0.5; // reset sometime cause wrong
	public double scalingY = 1.0;
	
	MyJoystick(int port, double deadzoneX, double deadzoneY, double driveMotorsDeadZone, double driveJoystickXScaling, double driveJoystickYScaling) {
		super(port);
		m_deadzoneX = deadzoneX;
		m_deadzoneY = deadzoneY;
		scalingX = driveJoystickXScaling;
		scalingY = driveJoystickYScaling;
		motorDeadZone = driveMotorsDeadZone;
		powerOfOne = 1;

	
}
