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
		this.setSize(1024, 768);
		this.setTitle("text based game");
		this.setResizable(false);
		this.setVisible(true);
	}
	
}
