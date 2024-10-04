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
import javax.swing.BoxLayout;

public class VentanaApp extends JFrame {

	private static DefaultListModel<Pelicula> listModel;
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	
	public VentanaApp() {
		
		listModel = new DefaultListModel<Pelicula>();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menu = new JMenu("Peliculas");
		menuBar.add(menu);
		
		JMenuItem menuItemAgregarPelicula = new JMenuItem("Agregar");
		
		menu.add(menuItemAgregarPelicula);	
		
		menuItemAgregarPelicula.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				contentPane.removeAll();

				AgregarPeliculas panel = new AgregarPeliculas();
				panel.setDefaultListModel(listModel);
				
				contentPane.add(panel); 								
				contentPane.repaint();
				contentPane.revalidate();
			
			}
		});
		
		JMenuItem menuItemListarPeliculas = new JMenuItem("Listar");
		menu.add(menuItemListarPeliculas);
		
		menuItemListarPeliculas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				contentPane.removeAll();

				ListarPeliculas panel = new ListarPeliculas();
				panel.setDefaultListModel(listModel);
				
				contentPane.add(panel); 								
				contentPane.repaint();
				contentPane.revalidate();
		
			}
		});
		menu.add(menuItemListarPeliculas);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));

	}
}
