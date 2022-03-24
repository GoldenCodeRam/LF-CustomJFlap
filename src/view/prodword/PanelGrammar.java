package view.prodword;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Production;

public class PanelGrammar extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private PanelBanner banner;
	private PanelGenAdd terminalSymbol;
	private PanelGenAdd nonTerminalSymbol;
	private PanelAddProd panelProd;
	private JPanel symbols;
	private JPanel panelCenter;
	private PanelMenu menu;
	
	public PanelGrammar(ActionListener listener) {
		setBackground(Color.WHITE);
		setLayout(new BorderLayout());
		init(listener);
	}
	
	public void init(ActionListener listener) {
		menu = new PanelMenu(listener);
		symbols = new JPanel();
		panelCenter = new JPanel();
		banner = new PanelBanner("GRAMATICAS");
		terminalSymbol = new PanelGenAdd("<html>&Sigma;:( )</html>", "Añadir simbolo terminal.", Commands.ADD_TERMINAL, listener);
		nonTerminalSymbol = new PanelGenAdd("V:( )", "Añadir simbolo no terminal", Commands.ADD_NON_TERMINAL, listener);
		panelProd = new PanelAddProd(listener);
		config();
	}
	
	public void config() {
		
		panelCenter.setBackground(Color.WHITE);
		panelCenter.setLayout(new BorderLayout());
		
		add(banner, BorderLayout.NORTH);
		
		symbols.setBackground(Color.white);
		symbols.add(terminalSymbol);
		symbols.add(nonTerminalSymbol);
		symbols.setBorder(new EmptyBorder(10, 10, 10, 10));
		panelCenter.add(symbols, BorderLayout.CENTER);
		
		panelCenter.add(panelProd, BorderLayout.SOUTH);
		
		add(panelCenter, BorderLayout.CENTER);
		add(menu, BorderLayout.SOUTH);
	}
	
	public String getTerminalSymb() {
		String terminal = terminalSymbol.getFieldText();
		return terminal;
	}
	
	public char getNonTerminalSymb() {
		char nonTerminal = nonTerminalSymbol.getFieldText().charAt(0);
		return nonTerminal;
	}
	
	public Production getProduction() {
		return panelProd.getProduction();
	}
}

