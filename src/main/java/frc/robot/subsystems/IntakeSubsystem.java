package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.IntakeConstants;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

public class IntakeSubsystem extends SubsystemBase {
  public CANSparkMax intakeMotorOne;
  public CANSparkMax intakeMotorTwo;
  public CANSparkMax intakeDeploy;

  public DigitalInput intakeTopLimit;
  public DigitalInput intakeBottomLimit;

  //Time of Flight Sensor Definition

  public IntakeSubsystem() {
    intakeMotorOne = new CANSparkMax(IntakeConstants.intakeMotorOneID, MotorType.kBrushless);
    intakeMotorTwo = new CANSparkMax(IntakeConstants.intakeMotorTwoID, MotorType.kBrushless);
    intakeDeploy = new CANSparkMax(IntakeConstants.intakeDeployID, MotorType.kBrushless);

    intakeTopLimit = new DigitalInput(IntakeConstants.intakeTopLimitChannel);
    intakeBottomLimit = new DigitalInput(IntakeConstants.intakeBottomLimitChannel);

    //intakeSensor
  }
}
