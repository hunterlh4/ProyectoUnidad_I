package Presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JInternalFrame;
import javax.swing.JDesktopPane;

public class Principal {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal window = new Principal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Principal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1075, 817);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(34, 26, 282, 715);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("IMAGEN");
		lblNewLabel.setBounds(22, 27, 63, 54);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("MI CARGO");
		lblNewLabel_1.setBounds(97, 27, 112, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("MI NOMBRE");
		lblNewLabel_2.setBounds(95, 47, 143, 14);
		panel.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Reservas");
		
		btnNewButton.setBounds(22, 112, 187, 23);
		panel.add(btnNewButton);
		
		JButton btnPedidosdemesa = new JButton("Pedidos De Mesa");
		
		btnPedidosdemesa.setBounds(22, 168, 187, 23);
		panel.add(btnPedidosdemesa);
		
		JButton btnReservas = new JButton("Reservas 2");
		btnReservas.setBounds(22, 225, 187, 23);
		panel.add(btnReservas);
		
		JButton btnReservas_1 = new JButton("Reservas 3");
		btnReservas_1.setBounds(22, 282, 187, 23);
		panel.add(btnReservas_1);
		
		JButton btnReservas_2 = new JButton("Reservas 4");
		btnReservas_2.setBounds(22, 333, 187, 23);
		panel.add(btnReservas_2);
		
		JButton btnNewButton_1 = new JButton("salir");
		btnNewButton_1.setBounds(22, 540, 63, 42);
		panel.add(btnNewButton_1);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setBounds(97, 540, 63, 42);
		panel.add(btnEditar);
		
		JButton btnCerrarSesion = new JButton("Cerrar Sesion");
		btnCerrarSesion.setBounds(175, 540, 76, 42);
		panel.add(btnCerrarSesion);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(348, 26, 615, 715);
		frame.getContentPane().add(desktopPane);
		
		
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				desktopPane.removeAll();
				desktopPane.repaint();
				  Reservas formulario = new Reservas();
				  
				  desktopPane.add(formulario);
			      
			            formulario.show();
				
				
			}
		});
		
		btnPedidosdemesa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				desktopPane.removeAll();
				desktopPane.repaint();
				  PedidosDeMesa formulario = new PedidosDeMesa();
				  
				  desktopPane.add(formulario);
				 
			            formulario.show();
			}
			
			
		});
	}
}
