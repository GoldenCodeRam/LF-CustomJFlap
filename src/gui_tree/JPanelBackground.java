package gui_tree;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;

public class JPanelBackground extends javax.swing.JPanel {

	private static final long serialVersionUID = -6993976748116890888L;
	private String ruta;

	public JPanelBackground() {
		initComponents();
		this.setSize(933, 690);
		this.ruta = "";
	}

	@Override
	public void paintComponent(Graphics g) {
		Dimension tam = getSize();
		ImageIcon ImagenFondo = new ImageIcon(new ImageIcon(getClass().getResource(ruta)).getImage());
		g.drawImage(ImagenFondo.getImage(), 0, 0, tam.width, tam.height, null);
		setOpaque(false);
		super.paintComponent(g);
	}

	private void initComponents() {
		GroupLayout layout = new javax.swing.GroupLayout(this);
		this.setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 462, Short.MAX_VALUE));
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 323, Short.MAX_VALUE));
	}
}
