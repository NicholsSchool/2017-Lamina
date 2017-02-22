package org.usfirst.frc.team4930.robot.commands;

import org.usfirst.frc.team4930.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ShiftUp extends Command
{

  public ShiftUp() {
    requires(Robot.pneumatics);
  }

  protected void initialize() {}

  protected void execute() {
    Robot.pneumatics.enableHighGear();
  }

  protected boolean isFinished() {
    return false;
  }

  protected void end() {}

  protected void interrupted() {}
}
