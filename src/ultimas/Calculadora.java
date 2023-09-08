package ultimas;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class Calculadora {

	private JFrame frmGrupo;

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
		frmGrupo.setBounds(100, 100, 450, 300);
		frmGrupo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
