package game.view;

import javax.swing.JFrame;
import game.controller.GameController;

public class GameFrame extends JFrame
{
	private GameController appController;
	private GamePanel appPanel;
	
	public GameFrame(GameController appController)
	{
		super();
		
		this.appController = appController;
		this.appPanel = new GamePanel(appController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setSize(1000, 500);
		this.setTitle("Text Based Game");
		this.setResizable(false);
		this.setVisible(true);
	}
}
