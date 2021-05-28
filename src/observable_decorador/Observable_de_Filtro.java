package observable_decorador;

import java.awt.image.BufferedImage;
import java.io.IOException;

import java.util.Observable;

public class Observable_de_Filtro extends Observable{

	private BufferedImage imagenProcesada;

	public Observable_de_Filtro()
	{
		imagenProcesada = null;

	}

	// Aplica los filtros acumulados y notifica a los observadores que
	// estan pendientes del cambio de estado de los objetos de esta
	// clase, que su estado se ha visto alterado
	public void ActualizarImagen(BufferedImage bi)
	{
		imagenProcesada = bi;
	}
	
	public BufferedImage GetImagen()
	{
		return imagenProcesada;
	}

}
