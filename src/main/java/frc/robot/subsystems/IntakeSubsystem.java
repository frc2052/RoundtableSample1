// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class IntakeSubsystem extends SubsystemBase {
  
  private CANSparkMax motor1 = null;
  public IntakeSubsystem() {
    motor1 = new CANSparkMax(1, MotorType.kBrushless);
  }

  public void setOn() {
    motor1.set(1);
  }

  public void setOff() {
    motor1.set(0);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
