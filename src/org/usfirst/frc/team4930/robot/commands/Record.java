package org.usfirst.frc.team4930.robot.commands;

import org.usfirst.frc.team4930.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class Record extends Command
{

  protected void initialize() {
    Robot.isRecording = true;
    try {
      Robot.recorder.setupRecorder();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  protected void execute() {
    try {
      Robot.recorder.record();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  protected boolean isFinished() {
    return !Robot.isRecording;
  }

  protected void end() {
    try {
      Robot.recorder.endRecord();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  protected void interrupted() {
    end();
  }
}
