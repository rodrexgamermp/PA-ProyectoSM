package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import java.awt.CardLayout;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import net.miginfocom.swing.MigLayout;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import javax.swing.JSplitPane;

public class MenuPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipal frame = new MenuPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MenuPrincipal() {
	
		setSize(500, 500);
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panelPrincipal = new JPanel();
		getContentPane().add(panelPrincipal, BorderLayout.CENTER);
		panelPrincipal.setLayout(new BorderLayout(0, 0));
		
		JPanel panelSuperior = new JPanel();
		panelPrincipal.add(panelSuperior, BorderLayout.NORTH);
		panelSuperior.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Proyecto Sailor Moon");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panelSuperior.add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel panelInferior = new JPanel();
		panelPrincipal.add(panelInferior, BorderLayout.SOUTH);
		
		JLabel lblNewLabel_1 = new JLabel("Desarrollado por: Lucas, Rodrigo, Juan");
		panelInferior.add(lblNewLabel_1);
		
		JPanel panelAdentro = new JPanel();
		panelPrincipal.add(panelAdentro, BorderLayout.CENTER);
		panelAdentro.setLayout(new BorderLayout(0, 0));
		
		JSplitPane splitPane = new JSplitPane();
		panelAdentro.add(splitPane, BorderLayout.CENTER);
		
		JPanel panelBoton = new JPanel();
		splitPane.setLeftComponent(panelBoton);
		panelBoton.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnNewButton = new JButton("New button");
		panelBoton.add(btnNewButton);
		
		JButton btnNewButton_4 = new JButton("New button");
		panelBoton.add(btnNewButton_4);
		
		JButton btnNewButton_3 = new JButton("New button");
		panelBoton.add(btnNewButton_3);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		panelBoton.add(lblNewLabel_3);
		
		JButton btnNewButton_2 = new JButton("New button");
		panelBoton.add(btnNewButton_2);
		
		JButton btnNewButton_5 = new JButton("New button");
		panelBoton.add(btnNewButton_5);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		panelBoton.add(lblNewLabel_2);
		
		JButton btnNewButton_1 = new JButton("New button");
		panelBoton.add(btnNewButton_1);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		splitPane.setRightComponent(lblNewLabel_4);
		
	}
}
