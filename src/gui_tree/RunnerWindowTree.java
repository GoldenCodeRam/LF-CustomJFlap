package gui_tree;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;

public class RunnerWindowTree extends javax.swing.JFrame {

	private JButton InOrden;
	private JButton PostOrden;
	private JButton PreOrden;
	private JButton botonInsertar;
	private JTextArea impresion;
	private JDesktopPane jDesktopPane1;
	private JInternalFrame jInternalFrame2;
	private JPanel jPanel2;
	private JScrollPane jScrollPane1;
	private JTextField txtdato;

	private static final long serialVersionUID = 7722210957507928511L;
	private TreeRoutes routesTree = new TreeRoutes();

	public RunnerWindowTree() {
		initComponents();
		this.inicializar(false);
	}

	private void inicializar(boolean enable) {
		this.InOrden.setEnabled(enable);
		this.PostOrden.setEnabled(enable);
		this.PreOrden.setEnabled(enable);
	}

	private void initComponents() {

		jPanel2 = new JPanel();
		jScrollPane1 = new JScrollPane();
		impresion = new JTextArea();
		jDesktopPane1 = new JDesktopPane();
		jInternalFrame2 = new JInternalFrame();
		botonInsertar = new JButton();
		InOrden = new JButton();
		PreOrden = new JButton();
		PostOrden = new JButton();
		txtdato = new JTextField();

		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setResizable(false);

		jPanel2.setBackground(new Color(255, 255, 255));
		jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Panel de Pruebas",
				javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
				new Font("Tahoma", 1, 10))); // NOI18N
		jPanel2.setOpaque(false);

		jScrollPane1.setOpaque(false);

		impresion.setEditable(false);
		impresion.setColumns(20);
		impresion.setFont(new java.awt.Font("Tahoma", 0, 12));
		impresion.setRows(5);
		impresion.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultados de operaciones"));
		impresion.setOpaque(false);
		jScrollPane1.setViewportView(impresion);

		jDesktopPane1.setOpaque(false);

		jInternalFrame2.setIconifiable(true);
		jInternalFrame2.setMaximizable(true);
		jInternalFrame2.setResizable(true);
		jInternalFrame2.setEnabled(false);
		jInternalFrame2.setFocusCycleRoot(false);
		jInternalFrame2.setVisible(true);

		javax.swing.GroupLayout jInternalFrame2Layout = new GroupLayout(jInternalFrame2.getContentPane());
		jInternalFrame2.getContentPane().setLayout(jInternalFrame2Layout);
		jInternalFrame2Layout.setHorizontalGroup(jInternalFrame2Layout
				.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 584, Short.MAX_VALUE));
		jInternalFrame2Layout.setVerticalGroup(jInternalFrame2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGap(0, 290, Short.MAX_VALUE));

		jDesktopPane1.add(jInternalFrame2);
		jInternalFrame2.setBounds(10, 10, 600, 320);

		botonInsertar.setFont(new Font("Tahoma", 1, 12));
		botonInsertar.setText("Insertar");
		botonInsertar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				botonInsertarActionPerformed(evt);
			}
		});

		InOrden.setFont(new Font("Tahoma", 3, 11));
		InOrden.setText("");
		InOrden.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				InOrdenActionPerformed(evt);
			}
		});

		PreOrden.setFont(new Font("Tahoma", 3, 11));
		PreOrden.setText("");
		PreOrden.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				PreOrdenActionPerformed(evt);
			}
		});

		PostOrden.setFont(new Font("Tahoma", 3, 11));
		PostOrden.setText("");
		PostOrden.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				PostOrdenActionPerformed(evt);
			}
		});

		GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup()
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addGroup(jPanel2Layout.createSequentialGroup()
										.addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
												.addGroup(jPanel2Layout.createSequentialGroup()
														.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(InOrden, GroupLayout.PREFERRED_SIZE, 82,
																GroupLayout.PREFERRED_SIZE)
														.addGap(4, 4, 4).addComponent(PreOrden).addGap(4, 4, 4))
												.addGroup(jPanel2Layout.createSequentialGroup().addContainerGap()
														.addComponent(txtdato, GroupLayout.PREFERRED_SIZE, 169,
																GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED,
																GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
										.addGroup(
												jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
														.addComponent(botonInsertar, GroupLayout.DEFAULT_SIZE,
																GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(PostOrden, GroupLayout.DEFAULT_SIZE,
																GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
										.addGap(18, 18, 18).addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 325,
												GroupLayout.PREFERRED_SIZE))
								.addComponent(jDesktopPane1, GroupLayout.PREFERRED_SIZE, 616,
										GroupLayout.PREFERRED_SIZE))
						.addGap(0, 3, Short.MAX_VALUE)));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addContainerGap()
						.addComponent(jDesktopPane1, GroupLayout.PREFERRED_SIZE, 327, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
								.addGroup(jPanel2Layout.createSequentialGroup()
										.addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
												.addComponent(botonInsertar, GroupLayout.PREFERRED_SIZE, 30,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(txtdato, GroupLayout.PREFERRED_SIZE, 30,
														GroupLayout.PREFERRED_SIZE))
										.addGap(10, 10, 10)
										.addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
												.addComponent(InOrden, GroupLayout.PREFERRED_SIZE, 33,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(PreOrden, GroupLayout.PREFERRED_SIZE, 33,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(PostOrden, GroupLayout.PREFERRED_SIZE, 33,
														GroupLayout.PREFERRED_SIZE)))
								.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE))
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		javax.swing.GroupLayout layout = new GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(jPanel2,
								GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));

		pack();
	}

	private void botonInsertarActionPerformed(ActionEvent evt) {// GEN-FIRST:event_botonInsertarActionPerformed
		try {
			String dato = txtdato.getText();
			if (this.routesTree.insertar(dato)) {
				JOptionPane.showMessageDialog(null, "El dato fue insertado correctamente", " ...", 1);
				this.inicializar(true);

				complementos();
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "No se pudo insertar el dato", "Intenta de nuevo...", 0);

		}
	}

	private void InOrdenActionPerformed(ActionEvent evt) {
		String recorrido = null;
		recorrido = this.routesTree.inOrden();

		this.impresion.setText("");
		this.impresion.setText(recorrido);
	}

	private void PreOrdenActionPerformed(ActionEvent evt) {
		String recorrido = null;
		recorrido = this.routesTree.preOrden();

		this.impresion.setText("");
		this.impresion.setText(recorrido);
	}

	private void PostOrdenActionPerformed(ActionEvent evt) {
		String recorrido = null;
		recorrido = this.routesTree.postOrden();

		this.impresion.setText("");
		this.impresion.setText(recorrido);
	}

	public void complementos() {
		this.repintarArbol();
	}

	private void repintarArbol() {
		this.jDesktopPane1.removeAll();
		Rectangle tamano = this.jInternalFrame2.getBounds();
		this.jInternalFrame2 = null;
		this.jInternalFrame2 = new JInternalFrame("ARBOL DE DERIVACION", true);
		this.jDesktopPane1.add(this.jInternalFrame2, JLayeredPane.DEFAULT_LAYER);
		this.jInternalFrame2.setVisible(true);
		this.jInternalFrame2.setBounds(tamano);
		this.jInternalFrame2.setEnabled(false);
		this.jInternalFrame2.add(this.routesTree.getDibujo(), BorderLayout.CENTER);
	}

	public static void main(String args[]) {
		try {
			for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			Logger.getLogger(RunnerWindowTree.class.getName()).log(Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			Logger.getLogger(RunnerWindowTree.class.getName()).log(Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			Logger.getLogger(RunnerWindowTree.class.getName()).log(Level.SEVERE, null, ex);
		} catch (UnsupportedLookAndFeelException ex) {
			Logger.getLogger(RunnerWindowTree.class.getName()).log(Level.SEVERE, null, ex);
		}

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				new RunnerWindowTree().setVisible(true);
			}
		});
	}
}
