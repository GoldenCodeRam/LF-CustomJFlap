package view.prodword;

import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import model.Production;

public class MainFrame extends JFrame{

	public PanelGrammar panel;
	
	public MainFrame(ActionListener listener) {
		init(listener);
		setVisible(true);
		setResizable(false);
		setTitle("Prueba");
		setSize(1000,400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
		
	
	private void init(ActionListener listener) {
		JPanel prin = new JPanel();
		panel = new PanelGrammar(listener);
		prin.add(panel);
		
		this.setContentPane(prin);
	}
	
	public static void main(String[] args) {
		new MainFrame(actionEvent -> {
			System.out.println();
		});
	}
	
	public String getTerminalSymb() {
		return panel.getTerminalSymb();
	}
	
	public String getNonTerminalSymb() {
		return panel.getNonTerminalSymb();
	}
	
	public Production getProduction() {
		return panel.getProduction();
	}
	
}
