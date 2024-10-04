package exercises;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class AgregarPeliculas extends JPanel {
	
	private static final long serialVersionUID = 3908678547193996636L;
	private DefaultListModel<Pelicula> listModel;
	private JTextField txtNombre;



	public AgregarPeliculas() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{60, 37, 0, 0, 106, 0, 0};
		gridBagLayout.rowHeights = new int[]{60, 14, 35, 14, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblNewLabel = new JLabel("ID");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 0;
		add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblID = new JLabel(Integer.toString(Pelicula.DevuelveProximoID()));
		GridBagConstraints gbc_lblID = new GridBagConstraints();
		gbc_lblID.insets = new Insets(0, 0, 5, 5);
		gbc_lblID.gridx = 3;
		gbc_lblID.gridy = 0;
		add(lblID, gbc_lblID);
		
		JLabel lblNombre = new JLabel("Nombre");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblNombre.gridx = 1;
		gbc_lblNombre.gridy = 2;
		add(lblNombre, gbc_lblNombre);
		
		txtNombre = new JTextField();
		GridBagConstraints gbc_txtNombre = new GridBagConstraints();
		gbc_txtNombre.insets = new Insets(0, 0, 5, 5);
		gbc_txtNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombre.gridx = 3;
		gbc_txtNombre.gridy = 2;
		add(txtNombre, gbc_txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblGenero = new JLabel("Genero");
		GridBagConstraints gbc_lblGenero = new GridBagConstraints();
		gbc_lblGenero.insets = new Insets(0, 0, 5, 5);
		gbc_lblGenero.gridx = 1;
		gbc_lblGenero.gridy = 4;
		add(lblGenero, gbc_lblGenero);
		
		JComboBox<Genero> cbGenero = new JComboBox<Genero>();
		GridBagConstraints gbc_cbGenero = new GridBagConstraints();
		gbc_cbGenero.insets = new Insets(0, 0, 5, 5);
		gbc_cbGenero.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbGenero.gridx = 3;
		gbc_cbGenero.gridy = 4;
		add(cbGenero, gbc_cbGenero);
		cbGenero.addItem(new Genero("Seleccione un g�nero"));
		cbGenero.addItem(new Genero("Terror"));
		cbGenero.addItem(new Genero("Acci�n"));
		cbGenero.addItem(new Genero("Suspenso"));
		cbGenero.addItem(new Genero("Rom�ntica"));
		
		
		
		JButton btnAceptar = new JButton("Aceptar");	
		btnAceptar.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {

			   

            String nombre = txtNombre.getText();

            Genero generoSeleccionado = (Genero) cbGenero.getSelectedItem();



            if (nombre.isEmpty()) {

                JOptionPane.showMessageDialog(null, "Debe ingresar el nombre de la película.", "Error", JOptionPane.ERROR_MESSAGE);

            } else if (generoSeleccionado == null || generoSeleccionado.getNombre().equals("Seleccione un género")) {

                JOptionPane.showMessageDialog(null, "Debe seleccionar un género válido.", "Error", JOptionPane.ERROR_MESSAGE);

            } else {

                Pelicula nuevaPelicula = new Pelicula(nombre, generoSeleccionado);                                      

                listModel.addElement(nuevaPelicula);  // Agrega la película a la lista			               

                JOptionPane.showMessageDialog(null, "Película agregada exitosamente.", "Información", JOptionPane.INFORMATION_MESSAGE);

                            lblID.setText(Integer.toString(Pelicula.DevuelveProximoID()));

                txtNombre.setText(""); // Limpia el campo de nombre

                cbGenero.setSelectedIndex(0); // Resetea el ComboBox
            }

                

		}});


		GridBagConstraints gbc_btnAceptar = new GridBagConstraints();
		gbc_btnAceptar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnAceptar.gridwidth = 2;
		gbc_btnAceptar.insets = new Insets(0, 0, 5, 5);
		gbc_btnAceptar.gridx = 1;
		gbc_btnAceptar.gridy = 6;
		add(btnAceptar, gbc_btnAceptar);
		
		
		
	}

	public void setDefaultListModel(DefaultListModel<Pelicula> listModel) {
		
		this.listModel = listModel;
		
 }
	



}