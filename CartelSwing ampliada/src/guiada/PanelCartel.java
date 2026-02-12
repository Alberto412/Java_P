package guiada;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class PanelCartel extends JPanel implements ActionListener {
    //variable donde se almacenara el textotexto
    String texto;
    //definicion de variables de la clase boton
    JButton btnColor;
    JButton btnTexto;
    JButton btnColorTexto;
    JButton btnTamanoA;
    JButton btnTamanoR;
    JButton btnSalir;
    JButton btnFigura;
    //otras variables
    Color colorTexto= Color.BLACK;
    int tamanoFuente=28;
    boolean usarElipse=false;
    public PanelCartel() {
        //añadimos un "raton oyente"
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //definimos las cordenadas a las que le va a afectar
                int x = e.getX();
                int y = e.getY();

                // Zona aproximada donde está el texto
                if (x >= 100 && x <= 400 && y >= 120 && y <= 170) {
                    //panel para volver a dar valor a texto
                    texto = JOptionPane.showInputDialog("Nuevo texto:");
                    if(texto==null||texto.isEmpty())texto="Cartelsintexto";
                    repaint();
                }
            }
        });

        //crea una ventana que permite leer los datos introducidos y darselos a una variable texto
        texto=JOptionPane.showInputDialog("Escribe texto del cartel");
        //condicion por si no se introduce el texto
        if(texto==null||texto.isEmpty())texto="Cartelsintexto";
        //lo que va a darle nombre a los botones en la salida
        btnColor = new JButton("Cambiar Color con texto cambiado");
        btnTexto = new JButton("Cambiar Texto con texto cambiado");
        btnColorTexto = new JButton("Color Texto");
        btnTamanoA = new JButton("Aumentar tamaño Texto");
        btnTamanoR = new JButton("Reducir tamaño Texto");
        btnFigura = new JButton("figura Texto");
        btnSalir = new JButton("Salir con texto cambiado");
        //hace a los botones que pudean actuar
        btnColor.addActionListener(this);
        btnTexto.addActionListener(this);
        btnColorTexto.addActionListener(this);
        btnTamanoA.addActionListener(this);
        btnTamanoR.addActionListener(this);
        btnFigura.addActionListener(this);
        btnSalir.addActionListener(this);
        //los posicionara abajo y oredenados
        setLayout(new BorderLayout());
        //instancia y crea los botones
        JPanel panelBotones = new JPanel();
        panelBotones.add(btnColor);
        panelBotones.add(btnTexto);
        panelBotones.add(btnColorTexto);
        panelBotones.add(btnTamanoA);
        panelBotones.add(btnTamanoR);
        panelBotones.add(btnFigura);
        panelBotones.add(btnSalir);
        add(panelBotones, BorderLayout.SOUTH);
        //el color que va ha tener
        setBackground(Color.RED);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //si se pulsa el boton salir se cerrara el programa en orden 0. es decir sin fallos
        if (e.getSource() == btnSalir) System.exit(0);
        //si se pulsa el boton leera el texto y lo imprimira por pantalla
        if (e.getSource() == btnTexto) {
            texto = JOptionPane.showInputDialog("Escribe el texto del cartel");
                    repaint();
        }
        //si se pulsa el boton se alterara el color de fondo de la ventana
        if (e.getSource()==btnColor){
            //genero un random
            Random r = new Random();
            //rgb aleatorio
            int rojo = r.nextInt(256);
            int azul = r.nextInt(256);
            int verde=r.nextInt(256);
            //creo un color en base al rgb alteatorio anterior
            Color miColor = new Color(rojo, azul, verde);
            //fondo del color aleatorio
            setBackground(miColor);
        }
        if (e.getSource() == btnColorTexto) {
            //genero un random
            Random r = new Random();
            //rgb aleatorio
            int rojo = r.nextInt(256);
            int azul = r.nextInt(256);
            int verde=r.nextInt(256);
            //creo un color en base al rgb alteatorio anterior
            Color miColor = new Color(rojo, azul, verde);
            //colorTexto=miColor;
            colorTexto = JColorChooser.showDialog(this, "Elige un color", Color.BLACK);
            repaint();

        }
        if (e.getSource() == btnTamanoA) {
            if(tamanoFuente<60) {
                tamanoFuente = tamanoFuente + 5;
            }
            else {
                tamanoFuente=28;
                JOptionPane.showMessageDialog(null,"has superado el tamaño de 60");

            }
            repaint();

        }
        if (e.getSource() == btnTamanoR) {
            if(tamanoFuente>10) {
                tamanoFuente = tamanoFuente - 5;
            }
            else {
                tamanoFuente=28;
            }
            repaint();

        }
        if (e.getSource() == btnFigura) {
            usarElipse=!usarElipse;
            repaint();
        }
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        //defino la fuente
        g.setFont(new Font("z003", Font.ITALIC, tamanoFuente));
        //un obalo en base a lo que he dado
       if(usarElipse){
           g.drawOval(90, 110, 300, 60);
       }
       else {
           g.drawRect(90, 110, 300, 60);
       }
        //dibujo el texto en las cordenadas
        g.setColor(colorTexto);
        g.drawString(texto, 100, 150);

        //mi nombre
        g.drawString("Alberto", 600, 300);
    }
}