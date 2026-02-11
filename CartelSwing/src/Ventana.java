import javax.swing.*;
import java.awt.*;
public class Ventana extends JFrame {
    public Ventana() {
        //como se llama la ventana
        setTitle("sí");
        //el tamaño de la ventana
        setSize(900, 400);
        //que se cierre cuando se deba cerrar
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //que salga en el centro
        setLocationRelativeTo(null);
        //se aplican los cambios del panel al intarciarlo y añadirlo
        PanelCartel panel = new PanelCartel();
        add(panel);
        //que sea visible
        setVisible(true);

    }

}