package exercises;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import javax.swing.DefaultListModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaApp extends JFrame {

	private static DefaultListModel<Pelicula> listModel;
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	
	public VentanaApp() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menu = new JMenu("Peliculas");
		menuBar.add(menu);
		
		JMenuItem menuItemAgregarPelicula = new JMenuItem("Agregar");
				
		menuItemAgregarPelicula.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "AGREGAR PELICULA");
			
			}
		});
		menu.add(menuItemAgregarPelicula);
		
		
		
		JMenuItem menuItemListarPeliculas = new JMenuItem("Listar");
		menu.add(menuItemListarPeliculas);
		
		menuItemListarPeliculas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "LISTAR PELICULAS");
		
			}
		});
		menu.add(menuItemListarPeliculas);
		
		
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	
	}
}
