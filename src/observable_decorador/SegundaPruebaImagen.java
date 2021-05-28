package observable_decorador;

import java.io.IOException;

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class SegundaPruebaImagen  {
	
	public static void main(String [] args) throws IOException {
	  	
	  	SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {

			  	Observable_de_Filtro of = new Observable_de_Filtro();
			    
			    ControladorAplicacion contrlApl = new ControladorAplicacion(of);

			  	JFrame opciones = new JFrame("Opciones");
			    opciones.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			    opciones.setLayout(new GridLayout(1, 1));
				VentanaOpciones vo = new VentanaOpciones(contrlApl);
				opciones.add(vo);

			    opciones.setSize(400, 100);
			    opciones.setVisible(true);
				
			}});

	}
}