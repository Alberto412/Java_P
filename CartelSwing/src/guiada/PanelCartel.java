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
    JButton btnSalir;
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
        btnSalir = new JButton("Salir con texto cambiado");
        //hace a los botones que pudean actuar
        btnColor.addActionListener(this);
        btnTexto.addActionListener(this);
        btnSalir.addActionListener(this);
        //los posicionara abajo y oredenados
        setLayout(new BorderLayout());
        //instancia y crea los botones
        JPanel panelBotones = new JPanel();
        panelBotones.add(btnColor);
        panelBotones.add(btnTexto);
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
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        //defino la fuente
        g.setFont(new Font("z003", Font.ITALIC, 28));
        //un obalo en base a lo que he dado
        g.drawOval(90, 110, 300, 60);
        //dibujo el texto en las cordenadas
        g.drawString(texto, 100, 150);
        //mi nombre
        g.drawString("Alberto", 600, 300);
    }
}