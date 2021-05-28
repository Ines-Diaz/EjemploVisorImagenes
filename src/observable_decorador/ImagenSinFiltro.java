package observable_decorador;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ImagenSinFiltro implements Imagen {

//	 Flujo a una imagen.
	BufferedImage imagen;

//	 Constructor que crea un flujo a una imagen almacenada en un fichero.
	public ImagenSinFiltro(String nFicheroImg) throws IOException {
		File ficheroImg = new File(nFicheroImg);
		imagen = ImageIO.read(ficheroImg);
	}

//	 Devuelve directamente el flujo a la imagen sin aplicar ning�n tipo de filtro.
	public BufferedImage GetImagen() {
		return imagen;
	}

//	 Devuelve directamente el flujo a la imagen sin aplicar ning�n tipo de filtro.
	public BufferedImage aplicarFiltro() {
		return GetImagen();
	}

	// Guarda la imagen asociada al flujo en un fichero con el formato indicado.
	public void guardarImagen(String nFicheroImg, String fmt) throws IOException {
		ImageIO.write(imagen, fmt, new File(nFicheroImg));
	}
}
