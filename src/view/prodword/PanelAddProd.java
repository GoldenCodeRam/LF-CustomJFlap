package view.prodword;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import model.Production;

public class PanelAddProd extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel title;
	private JLabel arrow;
	private JTextField text;
	private JTextField production;
	private JButton addProd;

	public PanelAddProd(ActionListener listener) {
		
		setBackground(Color.WHITE);
		init(listener);
	}
	
	public void init(ActionListener listener) {
		title = new JLabel("PRODUCCIONES");
		arrow = new JLabel("<html>&rarr;</html>");
		text = new JTextField();
		production = new JTextField();
		config(listener);
	}
	
	public void config(ActionListener listener) {
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
		addProd.setActionCommand(Commands.ADD_PRODUCTIONS.toString());
		addProd.addActionListener(listener);
		addProd.setFocusable(false);
		addProd.setBorder(new RoundedBorder(10));
		add(addProd);
		this.setBorder(new EmptyBorder(30, 30, 30, 30));
	}
	
	public Production getProduction() {
		Production pr = new Production(text.getText().charAt(0), production.getText());
		text.setText("");
		production.setText("");
		repaint(); 
		revalidate();
		return pr;
	}
}
