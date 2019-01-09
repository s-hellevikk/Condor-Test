package org.usfirst.frc.team2412.robot.subsystems;

public class CatapultSubsystem {
public void launchHigh(){
	catapult.set(DoubleSolenoid.Value.kForward);
	Timer.delay(.2);
	latch.set(DoubleSolenoid.Value.kForward);
	Timer.delay(.5);
}
launchLow(){
	catapult.set(DoubleSolenoid.Value.kForward);
	Timer.delay(2.5);
}
retractHigh(){
	catapult.set(DoubleSolenoid.Value.kReverse);
	Timer.delay(2.0);
	latch.set(DoubleSolenoid.Value.kReverse);
}
retractLow(){
	catapult.set(DoubleSolenoid.Value.kReverse);
	Timer.delay(2.0);
}
private DoubleSolenoid catapult = RobotMap.catapult;
private DoubleSolenoid latch = RobotMap.latch;
}

