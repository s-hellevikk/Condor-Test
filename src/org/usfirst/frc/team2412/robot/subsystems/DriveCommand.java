package org.usfirst.frc.team2412.robot.subsystems;

public class DriveCommand {
	public void execute() {
		drive(Robot.m_oi.stick);
	}
}
