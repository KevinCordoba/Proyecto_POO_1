import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.plaf.DimensionUIResource;
import java.awt.GridLayout;
import java.awt.event.*;

public class Ventana_Main extends JFrame{ //implements ActionListener {

    JLabel imagen;
    JLabel etiquetaImagen;

    JButton boton1;
    JButton boton2;

    JPanel panelImagen;
    JPanel panelBotones;

    ImageIcon icon1;
    ImageIcon icon2;

    public Ventana_Main() {
        this.setPreferredSize(new DimensionUIResource(500, 500)); //Resolucion
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.pack();
        this.setVisible(true);
    }
    
    private void configuraciones(){
        panelImagen = new JPanel();
        panelBotones = new JPanel();

        //imagen_fondo = new ImageIcon()
    }
}
