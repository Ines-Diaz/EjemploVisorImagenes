 package observable_decorador;

import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.util.Observable;
import java.util.Observer;

public class PanelImagen extends JPanel implements Observer{

	BufferedImage mbi;
	Observable_de_Filtro obsfilt;

	PanelImagen(Observable_de_Filtro obsf)
	{
		obsfilt = obsf; 
	}

	public void cambiaImagen(BufferedImage bi) {
		mbi = bi;
		repaint();
	}

    // Actualizamos la imagen que se muestra en el panel
	// con la imagen que tenga el observable
    public void update( Observable obs,Object obj ) {
    	System.out.println("uuppddaattee");
        if( obsfilt == obs ){
            cambiaImagen(obsfilt.GetImagen());
        }
    }

	  /** Draw the image on the panel. **/
	public void paintComponent (Graphics g) {
		super.paintComponent (g);
		if (mbi != null) g.drawImage (mbi, 0, 0, this );
	}

}
