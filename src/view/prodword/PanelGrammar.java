package view.prodword;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Production;

public class PanelGrammar extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel banner;
	private JLabel textBanner;
	private PanelGenAdd terminalSymbol;
	private PanelGenAdd nonTerminalSymbol;
	private PanelAddProd panelProd;
	private JPanel symbols;
	
	public PanelGrammar(ActionListener listener) {
		setBackground(Color.WHITE);
		setLayout(new BorderLayout());
		init(listener);
	}
	
	public void init(ActionListener listener) {
		symbols = new JPanel();
		textBanner = new JLabel("GRAMATICAS");
		banner = new JPanel();
		terminalSymbol = new PanelGenAdd("<html>&Sigma;:( )</html>", "Añadir simbolo terminal.", Commands.ADD_TERMINAL, listener);
		nonTerminalSymbol = new PanelGenAdd("V:( )", "Añadir simbolo no terminal", Commands.ADD_NON_TERMINAL, listener);
		panelProd = new PanelAddProd();
		config();
	}
	
	public void config() {
		banner.setBackground(Color.GREEN);
		textBanner.setForeground(Color.WHITE);
		textBanner.setFont(new Font("Serif", Font.BOLD, 60));
		banner.add(textBanner);
		add(banner, BorderLayout.NORTH);
		
		symbols.setBackground(Color.white);
		symbols.add(terminalSymbol);
		symbols.add(nonTerminalSymbol);
		symbols.setBorder(new EmptyBorder(10, 10, 10, 10));
		add(symbols, BorderLayout.CENTER);
		
		add(panelProd, BorderLayout.SOUTH);
	}
	
	public String getTerminalSymb() {
		return terminalSymbol.getFieldText();
	}
	
	public String getNonTerminalSymb() {
		return nonTerminalSymbol.getFieldText();
	}
	
	public Production getProduction() {
		return panelProd.getProduction();
	}
}

