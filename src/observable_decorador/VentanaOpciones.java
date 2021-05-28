package observable_decorador;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class VentanaOpciones extends JPanel implements ActionListener{

	private JButton reset;
	private JButton nuevoVisor;
	private JButton escogerArchivo;
	
	private ControladorAplicacion controlador;
	
	public VentanaOpciones(ControladorAplicacion cntr)
	{
		controlador = cntr;
		
	  	setLayout(new FlowLayout());
	  	reset = new JButton("Reiniciar");
	  	reset.addActionListener(this);
		nuevoVisor = new JButton("Nuevo Visor");
		nuevoVisor.addActionListener(this);
		escogerArchivo = new JButton("Escoger Archivo");
		escogerArchivo.addActionListener(this);
 	
	  	add(reset);
	  	add(nuevoVisor);
		add(escogerArchivo);
	} 	
	public void actionPerformed(ActionEvent e) {

		String actComm = e.getActionCommand();
		if (actComm.compareTo("Reiniciar") == 0) {
			try {
				controlador.Reiniciar();
			} catch (Exception ex) {
			}
		} else if (actComm.compareTo("Nuevo Visor") == 0) {
				controlador.NuevoVisor();
		} else if (actComm.compareTo("Escoger Archivo") == 0) {
			try {
				JFileChooser fch = new JFileChooser(".");
				fch.showOpenDialog(this);
				controlador.cambiarArchivo(fch.getSelectedFile().getAbsolutePath());
			} catch (Exception ex) {
			}
		} else {
			System.out.println("MAAAAAAAL");
		}
	}

}
