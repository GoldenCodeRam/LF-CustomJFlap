package view;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

import view.prodword.PanelGenAdd;
import view.prodword.PanelGrammar;

public class TestFrame extends JFrame{
	
	public PanelGrammar panel;
	
	public TestFrame() {
		
		init();
		setVisible(true);
		setResizable(false);
		setTitle("Prueba");
		setSize(1000,400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	}
	
	private void init() {
		JPanel prin = new JPanel();
//		panel = new PanelGrammar();
		prin.add(panel);
		
		this.setContentPane(prin);
	}
	
	public static void main(String[] args) {
		new TestFrame();
	}
	

}
