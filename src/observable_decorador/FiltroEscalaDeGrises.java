package observable_decorador;

import java.awt.Color;
import java.awt.image.BufferedImage;

public class FiltroEscalaDeGrises implements Imagen{
	
	private Imagen siguiente;
	
	public FiltroEscalaDeGrises(Imagen sig) {
		siguiente = sig;
	}

	public BufferedImage aplicarFiltroEspecifico(BufferedImage imagenOrigen) {
		int fWidth = imagenOrigen.getWidth();
		int fHeight = imagenOrigen.getHeight();

		for (int i = 0; i < fWidth; i++) {
			for (int j = 0; j < fHeight; j++) {
				Color color = new Color(imagenOrigen.getRGB(i, j));
				int rojo = color.getRed();
				int verde = color.getGreen();
				int azul = color.getBlue();
				int media = (rojo + verde + azul) / 3;
				imagenOrigen.setRGB(i, j, new Color(media, media, media).getRGB());
			}
		}
		return imagenOrigen;
	}

	@Override
	public BufferedImage aplicarFiltro() {
		BufferedImage imagenOrigen = siguiente.aplicarFiltro();
		return aplicarFiltroEspecifico(imagenOrigen);
	}

	@Override
	public BufferedImage GetImagen() {
		return siguiente.GetImagen();
	}

}
