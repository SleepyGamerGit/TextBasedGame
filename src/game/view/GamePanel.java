package game.view;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;
import java.awt.Color;

import game.controller.GameController;


public class GamePanel extends JPanel
{
	private GameController appController;
	private SpringLayout appLayout;
	
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
		this.setLayout(appLayout);
		this.setPreferredSize(new Dimension(800, 600));
		this.setBackground(Color.GRAY);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
	
}
