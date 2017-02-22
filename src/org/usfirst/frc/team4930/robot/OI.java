package org.usfirst.frc.team4930.robot;

import org.usfirst.frc.team4930.robot.commands.Climb;
import org.usfirst.frc.team4930.robot.commands.PlaceGear;
import org.usfirst.frc.team4930.robot.commands.Playback;
import org.usfirst.frc.team4930.robot.commands.Record;
import org.usfirst.frc.team4930.robot.commands.ShiftDown;
import org.usfirst.frc.team4930.robot.commands.ShiftUp;
import org.usfirst.frc.team4930.robot.commands.StopRecord;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator interface to the commands
 * and command groups that allow control of the robot.
 */
public class OI
{
  public static Joystick joystick0;
  public static Joystick joystick1;
  public static JoystickButton joystick0button11;
  public static JoystickButton joystick1Button12;

  public static JoystickButton joystick0Button2;
  public static JoystickButton joystick0Button3;
  public static JoystickButton joystick0Button7;
  public static JoystickButton joystick0Button8;
  public static JoystickButton joystick0Button9;

  public OI() {
    joystick0 = new Joystick(0);
    joystick1 = new Joystick(1);

    joystick0Button2 = new JoystickButton(joystick0, 2);
    joystick0Button2.whenPressed(new ShiftUp());

    joystick0Button3 = new JoystickButton(joystick0, 3);
    joystick0Button3.whenPressed(new ShiftDown());

    joystick0Button7 = new JoystickButton(joystick0, 7);
    joystick0Button7.whenPressed(new Record());

    joystick0Button8 = new JoystickButton(joystick0, 8);
    joystick0Button8.whenPressed(new StopRecord());

    joystick0Button9 = new JoystickButton(joystick0, 9);
    joystick0Button9.whenPressed(new Playback());

    joystick0button11 = new JoystickButton(joystick0, 11);
    joystick0button11.whileHeld(new Climb());

    joystick1Button12 = new JoystickButton(joystick1, 12);
    joystick1Button12.whileHeld(new PlaceGear());

  }

  public double getJoystick0() {
    return joystick0.getY();
  }

  public double getJoystick1() {
    return joystick1.getY();
  }
}
