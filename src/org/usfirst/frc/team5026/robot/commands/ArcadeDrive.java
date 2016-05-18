package org.usfirst.frc.team5026.robot.commands;

import org.usfirst.frc.team5026.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class ArcadeDrive extends Command {

    public ArcadeDrive() {
    	requires(Robot.drive);
    }
    
    protected void initialize() {
    	Robot.drive.timeToStop();
    }
    
    protected void execute() {
    	Robot.drive.myArcadeDrive(Robot.oi.joystick.getModX(), Robot.oi.joystick.getModY());
    	SmartDashboard.putNumber("modX", Robot.oi.joystick.getModX());
    	SmartDashboard.putNumber("modY", Robot.oi.joystick.getModY());
    	SmartDashboard.putNumber("joystickY", Robot.oi.joystick.getY());
        SmartDashboard.putNumber("joystickX", Robot.oi.joystick.getX());
    }
    
    protected boolean isFinished() {
        return false;
    }
    
    protected void end() {
    	Robot.drive.timeToStop();
    }

    protected void interrupted() {
    	end();
    }
}
