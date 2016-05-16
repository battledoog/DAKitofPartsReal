package org.usfirst.frc.team5026.robot;

import edu.wpi.first.wpilibj.CANTalon;



public class Hardware {
	
	public CANTalon leftMotor; //talon 3
	public CANTalon rightMotor; //talon 5
	
	Hardware() {
		leftMotor= new CANTalon(3);
		rightMotor = new CANTalon(5);
	}
	
}
