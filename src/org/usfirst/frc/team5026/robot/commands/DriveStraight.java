package org.usfirst.frc.team5026.robot.commands;

import org.usfirst.frc.team5026.robot.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveStraight extends Command {

	private Timer timer;
	private double seconds;
	private double negative;
	private double speed;
	
    public DriveStraight(double speed, double seconds) {
    	requires(Robot.drive);
    	timer = new Timer();
    	this.speed = speed;
    	this.seconds = Math.abs(seconds);
    	this.negative = Math.abs(seconds) / seconds;
    }

    protected void initialize() {
    	Robot.drive.timeToStop();
    	timer.reset();
    	timer.start();
    }

    protected void execute() {
    	Robot.drive.setLeftRightMotor(speed, speed);
    }

     protected boolean isFinished() {
        return timer.hasPeriodPassed(seconds);
    }

    protected void end() {
    	Robot.drive.timeToStop();
    	timer.reset();
    }

    protected void interrupted() {
    	end();
    }
}
