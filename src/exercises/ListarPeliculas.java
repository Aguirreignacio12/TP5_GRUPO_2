package exercises;

import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.awt.BorderLayout;

import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;

public class ListarPeliculas extends JPanel {

	private DefaultListModel<Pelicula> listModel;
	/**
	 * Create the panel.
	 */
	public ListarPeliculas() {
		setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Peliculas");
		add(lblNewLabel, BorderLayout.WEST);
		
		JList list = new JList();
		add(list, BorderLayout.CENTER);

	}

	public void setDefaultListModel(DefaultListModel<Pelicula> listModel) {

		this.listModel = listModel;
		
	}

}
