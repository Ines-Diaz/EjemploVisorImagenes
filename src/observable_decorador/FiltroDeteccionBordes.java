package observable_decorador;

import java.awt.image.BufferedImage;
import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;

public class FiltroDeteccionBordes implements Imagen {
	
	private Imagen siguiente;
	private float[] filtroDeteccionBordes = { (float) (0.0), (float) (0.25), (float) (0.0),
			(float) (0.25), (float) (0.0), (float) (0.25), 
			(float) (0.0), (float) (0.25), (float) (0.0) };
	private Kernel mascara = new Kernel(3, 3, filtroDeteccionBordes);
	
	public FiltroDeteccionBordes(Imagen sig) {
		siguiente = sig;
	}

	public BufferedImage aplicarFiltroEspecifico(BufferedImage imagenOrigen) {
		BufferedImage imagenDestino = new BufferedImage(imagenOrigen.getWidth(), 
				imagenOrigen.getHeight(), 
				imagenOrigen.getType());
		ConvolveOp operadorConv = new ConvolveOp(mascara);
		operadorConv.filter(imagenOrigen, imagenDestino);
		copyBufferedImage(imagenDestino, imagenOrigen);
		return imagenOrigen;
	}

	private void copyBufferedImage(BufferedImage dest, BufferedImage copy) {
		int ancho = dest.getWidth(), alto = dest.getHeight();
		copy.setRGB(0, 0, ancho - 1, alto - 1, dest.getRGB(0, 0, ancho - 1, alto - 1, null, 0, ancho), 0, ancho);
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
