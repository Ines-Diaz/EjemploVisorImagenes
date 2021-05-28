package observable_decorador;

import java.io.IOException;

public class TestImagen {
	
	public static void main(String [] args) throws IOException {
		// Creación de una imagen original (sin filtrar)
		ImagenSinFiltro img = new ImagenSinFiltro("minion.jpg");
		// Combinación de filtros sobre la imagen
		Imagen imgConFiltro = new FiltroDeteccionEsquinas(img);
		Imagen imgCon2Filtros = new FiltroSuavizado(imgConFiltro);
		// Aplicación del filtro
		imgCon2Filtros.aplicarFiltro();
		// Se guarda la imagen en un fichero, con el formato jpg.
		img.guardarImagen("imagenFiltrada.jpg", "jpg");
	}
}