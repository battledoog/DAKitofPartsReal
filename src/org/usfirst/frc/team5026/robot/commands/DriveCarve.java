package org.usfirst.frc.team5026.robot.commands;

import org.usfirst.frc.team5026.robot.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveCarve extends Command {

	public Timer timer;
	private double seconds;
	private double negative;
	private double scaleValue;
	private boolean isLeft;
	
    public DriveCarve(double scaleValue, double seconds, boolean isLeft) {
    	timer = new Timer();
    	requires(Robot.drive);
    	this.seconds = Math.abs(seconds);
    	this.negative = Math.abs(seconds) / seconds;
    	this.scaleValue = scaleValue;
    	this.isLeft = isLeft;
    }

    protected void initialize() {
    	Robot.drive.timeToStop();
    	timer.reset();
    	timer.start();
    }

    protected void execute() {
    	if(isLeft == true) {
    		Robot.drive.setLeftRightMotor(0.1 * negative * scaleValue, 0.2 * negative * scaleValue);
    	}
    	else {
    		Robot.drive.setLeftRightMotor(0.2 * negative * scaleValue, 0.1 * negative * scaleValue);
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return timer.hasPeriodPassed(seconds);
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.drive.timeToStop();
    	timer.reset();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
