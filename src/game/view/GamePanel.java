package game.view;

import game.controller.GameController;
import javax.swing.*;

public class GamePanel extends JPanel
{
	private GameController appController;
//	private Springlayout appLayout;
	
	public GamePanel(GameController appController)
	{
		super();
		
		this.appController = appController;
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(getLayout());
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
}
