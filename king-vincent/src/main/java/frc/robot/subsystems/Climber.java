package frc.robot.subsystems;

import java.util.function.BooleanSupplier;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Subsystem;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Climber extends SubsystemBase{
        
    public static CANSparkMax motorLeft;
    public static CANSparkMax motorRight;

    public Climber() {

        motorLeft = new CANSparkMax(1, MotorType.kBrushless);
        motorRight = new CANSparkMax(2, MotorType.kBrushless);

    }

    public static Command up() {

        motorLeft.set(1);
        motorRight.set(1);
        return null;
    
    }

    public static Command down() {

        motorLeft.set(-1);
        motorRight.set(-1);
        return null;

    }

    public static Command normal() {

        motorLeft.set(0);
        motorRight.set(0);
        return null;

    }
}
