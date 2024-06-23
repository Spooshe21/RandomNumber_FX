/********************************************************************************************
 *   COPYRIGHT (C) 2024 CREVAVI TECHNOLOGIES PVT LTD
 *   The reproduction, transmission or use of this document/file or its
 *   contents is not permitted without written authorization.
 *   Offenders will be liable for damages. All rights reserved.
 *---------------------------------------------------------------------------
 *   Purpose:  MainController class file for the JavaTestFx application.
 *   Project:  MainController.java
 *   Platform: Cross-platform (Windows, macOS, Linux)
 *   Compiler: JDK-22
 *   IDE:  	   Eclipse IDE for Enterprise Java and Web Developers (includes Incubating components)
 *	           Version: 2024-03 (4.31.0)
 *             Build id: 20240307-1437
 ********************************************************************************************/

package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.util.Random;

/**
 * The MainController class controls the user interactions in the application.
 */
public class MainController {

	@FXML
	private Label myMessage;

	/**
	 * Generates a random number and displays it in the label.
	 * 
	 * @param event The event triggered by pressing the button to generate the
	 *              random number.
	 */
	@FXML
	public void generateRandom(ActionEvent event) {
		Random rand = new Random();
		int myRand = rand.nextInt(50) + 1; // Generating a random number between 1 and 50
		myMessage.setText(Integer.toString(myRand));
		System.out.println(Integer.toBinaryString(myRand)); // Printing the binary representation of the random number
	}
}
