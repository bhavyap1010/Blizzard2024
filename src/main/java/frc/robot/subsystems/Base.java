// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;
import frc.robot.RobotMap;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import com.revrobotics.RelativeEncoder;
public class Base extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */

  CANSparkMax frontLeftDrive = new CANSparkMax(RobotMap.leftFrontDrive, MotorType.kBrushless);
  CANSparkMax backLeftDrive = new CANSparkMax(RobotMap.leftBackDrive, MotorType.kBrushless);
 
  CANSparkMax frontRightDrive = new CANSparkMax(RobotMap.rightFrontDrive, MotorType.kBrushless);
  CANSparkMax backRightDrive = new CANSparkMax(RobotMap.rightBackDrive, MotorType.kBrushless);

  //drive is for spinning wheel, spin is for turning the wheel in the right direction

  CANSparkMax frontLeftSpin = new CANSparkMax(RobotMap.leftFrontSpin, MotorType.kBrushless);
  CANSparkMax backLeftSpin = new CANSparkMax(RobotMap.leftBackSpin, MotorType.kBrushless);
 
  CANSparkMax frontRightSpin = new CANSparkMax(RobotMap.rightFrontSpin, MotorType.kBrushless);
  CANSparkMax backRightSpin = new CANSparkMax(RobotMap.rightBackSpin, MotorType.kBrushless);

  public Base() {
    double rate = 0.04;

    frontLeftSpin.setOpenLoopRampRate(rate);
    backLeftSpin.setOpenLoopRampRate(rate);
    frontRightSpin.setOpenLoopRampRate(rate);
    backRightSpin.setOpenLoopRampRate(rate);

    frontLeftDrive.setOpenLoopRampRate(rate);
    backLeftDrive.setOpenLoopRampRate(rate);
    frontRightDrive.setOpenLoopRampRate(rate);
    backRightDrive.setOpenLoopRampRate(rate);
  }
 
  
  /**
   * Example command factory method.
   *
   * @return a command
   */
  public CommandBase exampleMethodCommand() {
    // Inline construction of command goes here.
    // Subsystem::RunOnce implicitly requires `this` subsystem.
    return runOnce(
        () -> {
          /* one-time action goes here */
        });
  }

  /**
   * An example method querying a boolean state of the subsystem (for example, a digital sensor).
   *
   * @return value of some boolean subsystem state, such as a digital sensor.
   */
  public boolean exampleCondition() {
    // Query some boolean state, such as a digital sensor.
    return false;
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  
}
