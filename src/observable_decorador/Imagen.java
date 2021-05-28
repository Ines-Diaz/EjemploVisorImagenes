package observable_decorador;

import java.awt.image.BufferedImage;

public interface Imagen {
		/**
		* Devuelve el resultado de aplicar el filtro asociado a la imagen
		* como un objeto de la clase BufferedImage. En caso de que se trate
		* de una imagen simple (sin filtro), lo que se devuelve es un flujo
		* a la imagen (posiblemente almacenada en un fichero).
		*
		* @return BufferedImage resultado de aplicar el filtro
		*/
	BufferedImage aplicarFiltro();
	BufferedImage GetImagen();

}
