package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.IndexerConstants;

public class IndexerSubsystem extends SubsystemBase {
    public WPI_TalonSRX indexMotor;
    public DigitalInput indexBeamBreak;

    public IndexerSubsystem() {
        indexMotor = new WPI_TalonSRX(IndexerConstants.indexMotorID);

        indexBeamBreak = new DigitalInput(IndexerConstants.indexBeamBreakChannel);
    }

}
