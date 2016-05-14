package org.usfirst.frc.team5026.robot;

import edu.wpi.first.wpilibj.CANTalon;



public class Hardware {
	
	public CANTalon talonThree; //left or right?
	public CANTalon talonFive;
	
	Hardware() {
		talonThree= new CANTalon(3);
		talonFive = new CANTalon(5);
	}
	
}
