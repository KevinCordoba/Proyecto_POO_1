import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import javax.swing.plaf.DimensionUIResource;
import java.awt.event.*;

public class Ventana_Main extends JFrame implements ActionListener{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    JButton botonMostrar;
    JButton addOrnamental;
    JButton addHierba;
    JButton addArbol;

    JPanel panelBoton;

    JLabel etiquetaTexto;
    JPanel panelTexto;


    public Ventana_Main(){
        super("Restaurante");
        this.setPreferredSize(new DimensionUIResource(700, 500));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        agregarComponentes();
        
        this.pack(); //trata de acomodar todo bien y es opcional
        this.setVisible(true);
    }

    private void agregarComponentes(){
        panelBoton = new JPanel();
        panelTexto = new JPanel();

        etiquetaTexto = new JLabel("Bienvenido al Restaurante");
        panelTexto.add(etiquetaTexto, BorderLayout.CENTER);

        panelBoton.setLayout(new GridLayout(10,2));

        botonMostrar = new JButton("Mostrar");
        botonMostrar.addActionListener(this);
        panelBoton.add(botonMostrar);

        panelBoton.setLayout(new GridLayout(10,1));

        this.add(panelBoton, BorderLayout.LINE_END);
        this.add(panelTexto, BorderLayout.CENTER);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
        if(e.getSource().equals(botonMostrar)){
            etiquetaTexto.setText("Hola");
        }
      
    }
}
