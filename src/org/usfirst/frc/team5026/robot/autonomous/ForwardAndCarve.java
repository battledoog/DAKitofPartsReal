package org.usfirst.frc.team5026.robot.autonomous;

import org.usfirst.frc.team5026.robot.commands.DriveCarve;
import org.usfirst.frc.team5026.robot.commands.DriveStraight;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class ForwardAndCarve extends CommandGroup {
    
    public  ForwardAndCarve() {
      addSequential(new DriveStraight(0.3, 2));
      addSequential(new DriveCarve(2, 5, false)); 
    }
}
