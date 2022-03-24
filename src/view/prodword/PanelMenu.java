package view.prodword;

import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelMenu extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton grammar;
	private JButton validateWord;
	
	public PanelMenu(ActionListener listener) {

		setBackground(Color.white);
		init(listener);
	}
	
	public void init(ActionListener listener) {
		
		grammar = new JButton();
		validateWord = new JButton();
		
		configButton(grammar, "Gramatica", Commands.MENU_GRAMMAR, listener);
		configButton(validateWord, "Validar Lenguaje", Commands.MENU_VALIDATE_LANGUAGE, listener);
		
		add(grammar);
		add(validateWord);
	}
	
	private void configButton(JButton button, String text, Commands command, ActionListener listener) {
		button.setBorder(new RoundedBorder(10));
		button.setBackground(Color.WHITE);
		button.setForeground(Color.GREEN);
		button.setText(text);
		button.setFocusable(false);
		button.setActionCommand(command.toString());
		button.addActionListener(listener);
	}
	
	
	
	

}
