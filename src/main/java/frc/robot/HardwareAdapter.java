// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.sensors.WPI_CANCoder;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.PowerDistribution;
import frc.joystickLibs.XboxController;

/** Add your docs here. */
public interface HardwareAdapter extends Constants {

    // XBOX
    public static final XboxController xbox = new XboxController(XBOX_PORT);

    // CAN
    public static final PowerDistribution pdp = new PowerDistribution();

    // DRIVETRAIN
    public static final WPI_TalonSRX leftDriveMaster = new WPI_TalonSRX(LEFT_DRIVE_MASTER);
    public static final WPI_TalonSRX leftDriveSlave = new WPI_TalonSRX(LEFT_DRIVE_SLAVE);
    public static final WPI_TalonSRX leftDriveSlave2 = new WPI_TalonSRX(LEFT_DRIVE_SLAVE2);

    public static final WPI_TalonSRX rightDriveMaster = new WPI_TalonSRX(RIGHT_DRIVE_MASTER);
    public static final WPI_TalonSRX rightDriveSlave = new WPI_TalonSRX(RIGHT_DRIVE_SLAVE);
    public static final WPI_TalonSRX rightDriveSlave2 = new WPI_TalonSRX(RIGHT_DRIVE_SLAVE2);



    // PNEUMATICS
    public static final Compressor compressor = new Compressor(Constants.PCM, PneumaticsModuleType.CTREPCM);
    public static final DoubleSolenoid shifter = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, SHIFTER_EXT, SHIFTER_RET);

    //Flag Mover 
    public static final WPI_TalonSRX flag = new WPI_TalonSRX(9);
}
