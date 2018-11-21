/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team2412.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
	public static int rollerID = 4;
	public static int[] drivebaseIDs = new int[] {
			0,
			1,
			2,
			3
	public static WPI_TalonSRX drivebaseIDS = new WPI_TalonSRX(drivebaseTalons);
	public static WPI_TalonSRX[] talons = new WPI_TalonSRX[] {
				new WPI_TalonSRX(drivebaseTalons[0]),
				new WPI_TalonSRX(drivebaseTalons[1]),
				new WPI_TalonSRX(drivebaseTalons[2]),
				new WPI_TalonSRX(drivebaseTalons[3]),
	}
			};
	
	

