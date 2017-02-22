package org.usfirst.frc.team4930.robot.subsystems;

import org.usfirst.frc.team4930.robot.RobotMap;
import org.usfirst.frc.team4930.robot.commands.PlaceGear;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class GearGadget extends Subsystem
{

  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  public void initDefaultCommand() {
    setDefaultCommand(new PlaceGear());
  }

  public void openGearPlacer(double x) {
    RobotMap.gearGadgetLeft.set(x);
    RobotMap.gearGadgetRight.set(-x);
  }

  public void stop() {
    Timer.delay(.3);
    RobotMap.gearGadgetLeft.set(-0.3);
    RobotMap.gearGadgetRight.set(0.3);
    Timer.delay(0.75);
    RobotMap.gearGadgetLeft.set(0.0);
    RobotMap.gearGadgetRight.set(0.0);
  }
}
