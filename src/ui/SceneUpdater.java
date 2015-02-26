package ui;

import java.util.Observable;
import java.util.Observer;

import javafx.stage.Stage;
import controller.Controller;

public class SceneUpdater implements Observer {
	private final int SCREEN_WIDTH = 600;
	private final int SCREEN_HEIGHT = 600;
	private GUI myGUI;

	private Controller myController;

	public SceneUpdater(Stage s, Controller c) {
		s.setWidth(SCREEN_WIDTH);
		s.setHeight(SCREEN_HEIGHT);

		myGUI = new GUI(s, this);
		myController = c;

	}

	public void initGUI() {
		myGUI.initialize();
	}

	/**
	 * Sends inputed command from the GUI to the Controller
	 * 
	 * @param input
	 * @param language
	 */
	public void sendCommands(String input, String language) {
		myController.parseCommand(input, language);
	}

	/**
	 * Sends output text from the Controller to the GUI
	 * 
	 * @param outputText
	 */
	public void setOutputText(String outputText) {
		myGUI.setOutputText(outputText);
	}

	@Override
	public void update(Observable o, Object arg) {
		// Update things from GhostView - for Sprint 3
	}

	/**
	 * Sends the GUI's TurtleView, used to link it to corresponding Turtle in
	 * back-end
	 * 
	 * @return
	 */
	public Observer getTurtleView() {
		return myGUI.getTurtleView();
	}

}
