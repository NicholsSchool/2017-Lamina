package org.usfirst.frc.team4930.robot.commands;

import org.usfirst.frc.team4930.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class PlaceGear extends Command
{

  public PlaceGear() {
    requires(Robot.gearGadget);
  }

  protected void initialize() {}

  protected void execute() {
    Robot.gearGadget.openGearPlacer(0.8);
  }

  protected boolean isFinished() {
    return false;
  }

  protected void end() {
    Robot.gearGadget.stop();
  }

  protected void interrupted() {}
}
