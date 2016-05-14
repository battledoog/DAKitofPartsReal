package org.usfirst.frc.team5026.robot.commands;

import org.usfirst.frc.team5026.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

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
    	Robot.drive.myArcadeDrive(Robot.oi.joystick.getX(), Robot.oi.joystick.getY());
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
