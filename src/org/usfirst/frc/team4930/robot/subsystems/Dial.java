package org.usfirst.frc.team4930.robot.subsystems;

import org.usfirst.frc.team4930.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Dial extends Subsystem
{

  protected void initDefaultCommand() {}

  private static double autoSwitch;

  private final static int dials = 11;

  static public double getDial() {

    autoSwitch = RobotMap.dialChooser.get() + 4;

    double dialNum = autoSwitch / (360 / dials);

    double floor = Math.floor(dialNum);

    if ((dialNum - floor) >= 0.5) {
      dialNum = Math.ceil(dialNum);
    }

    else if ((dialNum - floor) < 0.5) {
      dialNum = floor;
    }

    return dialNum;

  }
}
