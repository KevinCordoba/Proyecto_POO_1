import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import javax.swing.plaf.DimensionUIResource;
import java.awt.event.*;

public class Ventana_Main extends JFrame implements ActionListener{
    private boolean ciclo = true;
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    JButton botonMostrar;
    JPanel panelBoton;

    JLabel etiquetaTexto;
    JPanel panelTexto;
    JPanel panelTexto2;
    JPanel panelTexto3;

    JTextArea areaTexto;
    JTextArea areaTexto2;
    
    Fila_Produccion filaProbarBoton = new Fila_Produccion();
    Cliente ramon = new Cliente();
    boolean condicionBoton;

    int contando = 0;

    public Ventana_Main(){
        super("Restaurante");
        this.setPreferredSize(new DimensionUIResource(700, 500));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        int height = pantalla.height;
        int width = pantalla.width;
        setSize(width/2, height/2);	
        setLocationRelativeTo(null); // Hace que la ventana aparezca centrada

        agregarComponentes();
        
        this.pack(); //trata de acomodar todo bien y es opcional
        this.setVisible(true);
    }

    private void agregarComponentes(){
        panelBoton = new JPanel();
        panelTexto = new JPanel();
        panelTexto2 = new JPanel();
        panelTexto3 = new JPanel();


        etiquetaTexto = new JLabel("Bienvenido al Restaurante");
        panelTexto.add(etiquetaTexto, BorderLayout.CENTER);

        panelBoton.setLayout(new GridLayout(10,2));

        botonMostrar = new JButton("Siguiente");
        botonMostrar.addActionListener(this);
        panelBoton.add(botonMostrar);

        panelBoton.setLayout(new GridLayout(10,1));

        areaTexto = new JTextArea(" Primer texto de prueba ");
        panelTexto2.add(areaTexto, BorderLayout.SOUTH);

        areaTexto2 = new JTextArea(" Segundo texto de prueba ");
        panelTexto3.add(areaTexto2, BorderLayout.SOUTH);

        this.add(panelBoton, BorderLayout.LINE_END);
        this.add(panelTexto, BorderLayout.NORTH);
        this.add(panelTexto2, BorderLayout.CENTER);
        this.add(panelTexto3, BorderLayout.SOUTH);

    }

    public void cambiar_ciclo(boolean valor){
        this.ciclo = valor;
    }
    public boolean get_ciclo(){
        return ciclo;
    }

    public void procesandoPrueba(){
        //contando;
        System.out.println(contando + "contando valor");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource().equals(botonMostrar)){
            //Debe cambiar el ciclo a False para que haga la produccion
            //etiquetaTexto.setText("Hola");
            cambiar_ciclo(false);
            //this.contando++;
            contando++;
            areaTexto.setText(" estado del ciclo " + ciclo + " \nnum clicks: " + contando);

        }
        /*cambiar_ciclo(true);
        areaTexto2.setText("ciclo real: " + ciclo + " \ncontando esta en: " + contando);*/
    }
}
