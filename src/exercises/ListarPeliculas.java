package exercises;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;

public class ListarPeliculas extends JPanel {

    private static final long serialVersionUID = 1L;
    private DefaultListModel<Pelicula> listModel;
    private JList<Pelicula> list;  

    public ListarPeliculas() {
        setLayout(new BorderLayout(0, 0));
        
        JLabel lblNewLabel = new JLabel("Películas");
        add(lblNewLabel, BorderLayout.WEST);
        
       
        listModel = new DefaultListModel<>();  
     
        list = new JList<>(listModel); 
        add(list, BorderLayout.CENTER);
        
    }

    public void setDefaultListModel(DefaultListModel<Pelicula> listModel) {
    
        if (listModel != null) {
            this.setListModel(listModel);
        }
    }

    public DefaultListModel<Pelicula> getListModel() {
        return listModel;
    }

    public void setListModel(DefaultListModel<Pelicula> listModel) {
      
    	this.listModel = listModel;
    	ordenarPeliculas();
    }
    
    public void ordenarPeliculas() {
       
        List<Pelicula> peliculas = new ArrayList<>();
        for (int i = 0; i < listModel.size(); i++) {
            peliculas.add(listModel.getElementAt(i));
        }

       
        Collections.sort(peliculas, new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula p1, Pelicula p2) {
                return p1.get_nombre().compareToIgnoreCase(p2.get_nombre()); 
            }
        });

      
        listModel.clear();
        for (Pelicula pelicula : peliculas) {
            listModel.addElement(pelicula);
        }

     
        list.setModel(listModel);
    }
}
