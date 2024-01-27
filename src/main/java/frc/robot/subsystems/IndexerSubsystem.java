package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.IndexerConstants;

public class IndexerSubsystem extends SubsystemBase {
    public CANSparkMax indexMotor;

    public IndexerSubsystem() {
        indexMotor = new CANSparkMax(IndexerConstants.indexMotorID, MotorType.kBrushless);

    }

}
