package view.prodword;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import javafx.scene.layout.Border;

public class PanelGenAdd extends JPanel{
	
	private JLabel symbol;
	private JTextField fieldIn;
	private JButton addButton;
	private JPanel panel;
	
	public PanelGenAdd(String symbolText, String buttonText) {
		setBackground(Color.WHITE);
		setLayout(new BorderLayout());
		setBorder(new EmptyBorder(10, 20, 10, 20));
		init(symbolText, buttonText);
	}
	
	public void init(String textSymbol, String textButton) {
		
		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		 
		symbol = new JLabel(textSymbol);
		symbol.setFont(new Font("Serif", Font.BOLD, 30));
		panel.add(symbol);
		
		fieldIn = new JTextField();
		fieldIn.setBorder(new RoundedBorder(10));
		fieldIn.setPreferredSize(new Dimension(200, 40));
		panel.add(fieldIn);
//		this.setAlignmentX(CENTER_ALIGNMENT);
		add(panel, BorderLayout.NORTH);
		
		addButton = new JButton(textButton);
		addButton.setAlignmentX(CENTER_ALIGNMENT);
//		addButton.setActionCommand();
//		addButton.addActionListener();
		addButton.setBackground(Color.GREEN);
		addButton.setForeground(Color.WHITE);
		add(addButton, BorderLayout.SOUTH);
	}

}
