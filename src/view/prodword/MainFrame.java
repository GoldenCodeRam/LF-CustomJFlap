package view.prodword;

import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import model.Production;
import view.TestFrame;

public class MainFrame extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public PanelGrammar panelGrammar;
	public JPanel prin;
	public PanelWord panelValidate;
	
	public MainFrame(ActionListener listener) {
		setResizable(false);
		setTitle("Prueba");
		setSize(800,460);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		init(listener);
		setVisible(true);
	}
		
	
	private void init(ActionListener listener) {
		prin = new JPanel();
		panelGrammar = new PanelGrammar(listener);
		panelValidate = new PanelWord(listener);
		prin.setBackground(Color.white);
		prin.add(panelGrammar);
		this.setContentPane(prin);
	}
	
	public void changePanelToValidate() {
		remove(panelGrammar);
		setContentPane(panelValidate);
		repaint();
		revalidate();
	}
	
	public void changePanelToGrammar() {
		remove(panelValidate);
		setContentPane(panelGrammar);
		repaint();
		revalidate();
	}
	
	public String getTerminalSymb() {
		String text = panelGrammar.getTerminalSymb();
		return text;
	}
	
	public char getNonTerminalSymb() {
		return panelGrammar.getNonTerminalSymb();
	}
	
	public Production getProduction() {
		panelGrammar.repaint();
		panelGrammar.revalidate();
		return panelGrammar.getProduction();
	}
	
}
