package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import view.prodword.Commands;
import view.prodword.MainFrame;

public class Controller implements ActionListener{
	
	private MainFrame frame;
	
	public Controller() {
		
		frame = new MainFrame(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		switch (Commands.valueOf(e.getActionCommand())) {
		case ADD_TERMINAL:
			JOptionPane.showMessageDialog(frame, "El simbolo terminal se ha agregado con exito");
			break;
		case ADD_NON_TERMINAL:
			JOptionPane.showMessageDialog(frame, "El simbolo no terminal se ha agregado con exito");
			break;
		case ADD_PRODUCTIONS:
			JOptionPane.showMessageDialog(frame, "La produccion se ha agregado con exito");
			break;
		default:
			break;
		}
	}

}
