package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculadora {

	private JFrame frmGrupo;
	private JTextField txtNumero1;
	private JTextField txtNumero2;
	private JLabel lblResultado;
	private JButton btnSuma;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora window = new Calculadora();
					window.frmGrupo.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculadora() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGrupo = new JFrame();
		frmGrupo.setTitle("GRUPO 303");
		frmGrupo.setBounds(100, 100, 823, 505);
		frmGrupo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGrupo.getContentPane().setLayout(null);
		frmGrupo.setLocationRelativeTo(null);
		
		JLabel lblNewLabel = new JLabel("CACULADORA");
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 14));
		lblNewLabel.setBounds(167, 11, 130, 74);
		frmGrupo.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("N\u00FAmero 1:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(72, 108, 85, 34);
		frmGrupo.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("N\u00FAmero 2:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(72, 153, 85, 34);
		frmGrupo.getContentPane().add(lblNewLabel_1_1);
		
		txtNumero1 = new JTextField();
		txtNumero1.setBounds(167, 108, 229, 29);
		frmGrupo.getContentPane().add(txtNumero1);
		txtNumero1.setColumns(10);
		
		txtNumero2 = new JTextField();
		txtNumero2.setColumns(10);
		txtNumero2.setBounds(167, 158, 229, 29);
		frmGrupo.getContentPane().add(txtNumero2);
		
		btnSuma = new JButton("Suma");
		btnSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int num1=Integer.parseInt(txtNumero1.getText());
					int num2=Integer.parseInt(txtNumero2.getText());
					lblResultado.setText("SUMA: "+(num1+num2));
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "ERROR");
				}				
			}
		});
		btnSuma.setBounds(38, 230, 85, 41);
		frmGrupo.getContentPane().add(btnSuma);
		
		lblResultado = new JLabel("RESULTADO");
		lblResultado.setFont(new Font("Verdana", Font.BOLD, 14));
		lblResultado.setBounds(202, 274, 293, 74);
		frmGrupo.getContentPane().add(lblResultado);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Calculadora.class.getResource("/nuevos/cecytem.png")));
		lblNewLabel_2.setBounds(470, 56, 283, 334);
		frmGrupo.getContentPane().add(lblNewLabel_2);
	}
}
