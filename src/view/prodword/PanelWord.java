package view.prodword;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class PanelWord extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private PanelMenu menu;
	private PanelBanner banner;
	private JPanel panelCenter;
	private PanelGenAdd getInLanguage;
   
		public PanelWord(ActionListener listener) {

			setBackground(Color.white);
			
			setLayout(new BorderLayout());
			init(listener);
		}
		
		public void init(ActionListener listener) {
			banner = new PanelBanner("Validar Lenguaje");
			menu = new PanelMenu(listener);
			panelCenter = new JPanel();
			getInLanguage = new PanelGenAdd("Ingrese el lenguaje: ", "Validar", Commands.VALIDATE_LANGUAGE, listener);
			config();
		}
		
		public void config() {
			panelCenter.setLayout(new BorderLayout());
			panelCenter.add(getInLanguage, BorderLayout.NORTH);
			panelCenter.setBackground(Color.WHITE);
			panelCenter.setBorder(new EmptyBorder(40, 40, 40, 40));
			add(panelCenter, BorderLayout.CENTER);
			
			
			add(banner, BorderLayout.NORTH);
			add(menu, BorderLayout.SOUTH);
		}
		
		public String getLanguage() {
			String language = getInLanguage.getFieldText();
			return language;

		}
}
