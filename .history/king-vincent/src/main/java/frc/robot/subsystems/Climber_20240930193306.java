package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Climber extends SubsystemBase{
        
    public CANSparkMax motorLeft;
    public CANSparkMax motorRight;

    public Climber() {

        motorLeft = new CANSparkMax(1, MotorType.kBrushless);
        motorRight = new CANSparkMax(2, MotorType.kBrushless);

    }

    public Command up() {

        return run(() -> {

            motorLeft.set(1);
            motorRight.set(1);
        });
    }

    public Command down() {

        return run(() -> {

            motorLeft.set(-1);//sdsddsdsd
            motorRight.set(-1);
        });

    }

    public Command normal() {

        return run(() -> {

            motorLeft.set(0);
            motorRight.set(0);
        });

    }
}
