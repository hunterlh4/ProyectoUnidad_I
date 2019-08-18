package Presentacion;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Reservas extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Reservas frame = new Reservas();
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
	public Reservas() {
		setBounds(100, 100, 736, 557);
		getContentPane().setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(34, 23, 263, 22);
		getContentPane().add(comboBox);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(71, 76, 48, 14);
		getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(60, 173, 89, 23);
		getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Estado");
		lblNewLabel_1.setBounds(36, 137, 48, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Total");
		lblNewLabel_2.setBounds(34, 112, 48, 14);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("S/2500");
		lblNewLabel_3.setBounds(92, 112, 48, 14);
		getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Pagado");
		lblNewLabel_4.setBounds(94, 137, 48, 14);
		getContentPane().add(lblNewLabel_4);
		
		JButton button = new JButton("New button");
		button.setBounds(226, 173, 89, 23);
		getContentPane().add(button);
		
		JLabel label = new JLabel("Estado");
		label.setBounds(202, 137, 48, 14);
		getContentPane().add(label);
		
		JLabel label_1 = new JLabel("Pagado");
		label_1.setBounds(260, 137, 48, 14);
		getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("S/2500");
		label_2.setBounds(258, 112, 48, 14);
		getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("Total");
		label_3.setBounds(200, 112, 48, 14);
		getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("New label");
		label_4.setBounds(237, 76, 48, 14);
		getContentPane().add(label_4);

	}
}
