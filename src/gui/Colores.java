package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Colores {

	private JFrame frame;
	private JLabel lblColor;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Colores window = new Colores();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Colores() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 516, 373);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("COLORES");
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		JButton btnRojo = new JButton("Rojo");
		btnRojo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblColor.setBackground(Color.red);
			}
		});
		btnRojo.setBounds(57, 45, 89, 23);
		frame.getContentPane().add(btnRojo);
		
		JButton btnVerde = new JButton("Verde");
		btnVerde.setBounds(57, 94, 89, 23);
		frame.getContentPane().add(btnVerde);
		
		JButton btnAzul = new JButton("Azul");
		btnAzul.setBounds(57, 138, 89, 23);
		frame.getContentPane().add(btnAzul);
		
		lblColor = new JLabel("");
		lblColor.setOpaque(true);
		lblColor.setBorder(new LineBorder(Color.BLACK, 6, true));
		lblColor.setBounds(179, 11, 281, 279);
		frame.getContentPane().add(lblColor);
	}
}
