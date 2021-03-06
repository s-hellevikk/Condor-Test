/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team2412.robot;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	//// CREATING BUTTONS
	// One type of button is a joystick button which is any button on a
	//// joystick.
	// You create one by telling it which joystick it's on and which button
	// number it is.
	// Joystick stick = new Joystick(port);
	// Button button = new JoystickButton(stick, buttonNumber);

	// There are a few additional built in buttons you can use. Additionally,
	// by subclassing Button you can create custom triggers and bind those to
	// commands the same as any other Button.

	//// TRIGGERING COMMANDS WITH BUTTONS
	// Once you have a button, it's trivial to bind it to a button in one of
	// three ways:

	// Start the command when the button is pressed and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenPressed(new ExampleCommand());

	// Run the command while the button is being held down and interrupt it once
	// the button is released.
	// button.whileHeld(new ExampleCommand());

	// Start the command when the button is released and let it run the command
	// until it is finished as determined by its isFinished method.
	// button.whenReleased(new ExampleCommand());
	public Joystick stick = new Joystick(0);
	public Joystick codriver = new Joystick(1);
	public Button buttonIn = new JoystickButton (codriver,2);
	public Button buttonDown = new JoystickButton (codriver,3);
	public Button buttonUp = new JoystickButton (codriver,4);
	public Button buttonOut = new JoystickButton (codriver,5);
	public Button buttonCatapult = new JoystickButton (codriver,6);
	public OI() {
		buttonIn.whileHeld(new intakeIn());
		buttonDown.whenPressed(new IntakeDown());
		buttonUp.whenPressed(new IntakeUp());
		buttonOut.whenHeld(new intakeOut());
		buttonCatapult.whenPressed(new Catapult());
		
	}
}

