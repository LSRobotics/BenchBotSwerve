package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.IndexerConstants;

public class IndexerSubsystem extends SubsystemBase {
    public TalonSRX indexMotor;
    public DigitalInput indexBeamBreak;

    public IndexerSubsystem() {
        indexMotor = new TalonSRX(IndexerConstants.indexMotorID);

        indexBeamBreak = new DigitalInput(IndexerConstants.indexBeamBreakChannel);
    }

}
