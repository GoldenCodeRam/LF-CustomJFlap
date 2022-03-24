package view.prodword;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import model.Production;

public class PanelAddProd extends JPanel{

	private JLabel title;
	private JLabel arrow;
	private JTextField text;
	private JTextField production;
	private JButton addProd;

	public PanelAddProd() {
		
		setBackground(Color.WHITE);
		init();
	}
	
	public void init() {
		title = new JLabel("PRODUCCIONES");
		arrow = new JLabel("<html>&rarr;</html>");
		text = new JTextField();
		production = new JTextField();
		config();
	}
	
	public void config() {
		title.setFont(new Font("Serif", Font.BOLD, 20));
		add(title);
		text.setBorder(new RoundedBorder(10));
		text.setPreferredSize(new Dimension(200, 40));
		add(text);
		
		add(arrow);
		production.setBorder(new RoundedBorder(10));
		production.setPreferredSize(new Dimension(200, 40));
		add(production);
		
		addProd = new JButton("Añadir produccion.");
		addProd.setBackground(Color.GREEN);
		addProd.setForeground(Color.white);
		add(addProd);
		this.setBorder(new EmptyBorder(30, 30, 30, 30));
	}
	
	public Production getProduction() {
		Production pr = new Production(text.getText().charAt(0), production.getText());
		return pr;
	}
}
