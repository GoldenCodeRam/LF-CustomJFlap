package view.prodword;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class PanelGenAdd extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel symbol;
	private JTextField fieldIn;
	private JButton addButton;
	private JPanel panel;
	
	public PanelGenAdd(String symbolText, String buttonText, Commands command, ActionListener listener) {
		setBackground(Color.WHITE);
		setLayout(new BorderLayout());
		setBorder(new EmptyBorder(10, 20, 10, 20));
		init(symbolText, buttonText, command, listener);
	}
	
	public void init(String textSymbol, String textButton, Commands command, ActionListener listener) {
		
		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		 
		symbol = new JLabel(textSymbol);
		symbol.setFont(new Font("Serif", Font.BOLD, 30));
		panel.add(symbol);
		
		fieldIn = new JTextField();
		fieldIn.setBorder(new RoundedBorder(10));
		fieldIn.setPreferredSize(new Dimension(200, 40));
		panel.add(fieldIn);
		panel.setBorder(new EmptyBorder(20, 20, 20, 20));
		add(panel, BorderLayout.NORTH);
		
		addButton = new JButton(textButton);
		addButton.setAlignmentX(CENTER_ALIGNMENT);
		addButton.setActionCommand(command.toString());
		addButton.addActionListener(listener);
		addButton.setBackground(Color.GREEN);
		addButton.setForeground(Color.WHITE);
		addButton.setFocusable(false);
		addButton.setBorder(new RoundedBorder(10));
		add(addButton, BorderLayout.SOUTH);
	}
	
	public String getFieldText() {
		String text = fieldIn.getText();
		return text;
	}
	
	public void clear() {
		fieldIn.setText("");
		this.repaint(); 
		this.revalidate();
	}
	
	public void setText(String text) {
		fieldIn.setText(text);
	}

}
