package org.usfirst.frc.team5026.robot;

import org.usfirst.frc.team5026.robot.subsystems.MyJoystick;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	public MyJoystick joystick;
	
	public OI() {
		joystick = new MyJoystick(Constants.PORT, Constants.DEADZONEX, Constants.DEADZONEY, Constants.DRIVEMOTORSDEADZONE, Constants.JOYSTICKXSCALING, Constants.JOYSTICKYSCALING);
	}
}

