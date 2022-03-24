package view.prodword;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelBanner extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel title;
	
	public PanelBanner(String text) {

		setBackground(Color.GREEN);	
		init(text);
	}
	
	public void init(String text) {
		title = new JLabel(text);
		title.setForeground(Color.WHITE);
		title.setFont(new Font("Serif", Font.BOLD, 60));
		
		add(title);
	}

}
