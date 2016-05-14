package org.usfirst.frc.team5026.robot.subsystems;
import edu.wpi.first.wpilibj.Joystick;

public class MyJoystick extends Joystick {
	
	public int powerOfOne;
	
	public MyJoystick(int port) {
		super(port);
		powerOfOne = 1;	
	}
}