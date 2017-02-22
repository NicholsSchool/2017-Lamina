package org.usfirst.frc.team4930.robot.commands;

import org.usfirst.frc.team4930.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ShiftDown extends Command
{

  public ShiftDown() {
    requires(Robot.pneumatics);
  }

  protected void initialize() {}

  protected void execute() {
    Robot.pneumatics.enableLowGear();
  }

  protected boolean isFinished() {
    return false;
  }

  protected void end() {}

  protected void interrupted() {}
}
