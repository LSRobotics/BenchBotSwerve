package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.ElevatorConstants;

public class ElevatorSubsystem extends SubsystemBase{
    public CANSparkMax rightElevatorMotor;
    public CANSparkMax leftElevatorMotor;

    public DigitalInput elevatorTopLimit;
    public DigitalInput elevatorBottomLimit;

    public ElevatorSubsystem(){
        rightElevatorMotor = new CANSparkMax(ElevatorConstants.rightElevatorMotorID, MotorType.kBrushless);
        leftElevatorMotor = new CANSparkMax(ElevatorConstants.leftElevatorMotorID, MotorType.kBrushless);
        
        elevatorTopLimit = new DigitalInput(ElevatorConstants.elevatorTopLimitChannel);
        elevatorBottomLimit = new DigitalInput(ElevatorConstants.elevatorBottomLimitChannel);
    }
    
}