package observable_decorador;

import java.awt.image.BufferedImage;
import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;

public class FiltroGeneral implements Imagen {
	
	protected Imagen siguiente;
	protected float[] filtroMatriz;
	protected Kernel mascara;
	
	public FiltroGeneral(Imagen sig) {
		siguiente = sig;
	}
	
	protected void setFiltroMatriz(float[] filtroM) {
		filtroMatriz = filtroM;
		mascara = new Kernel(3, 3, filtroMatriz);
	}

	protected BufferedImage aplicarFiltroEspecifico(BufferedImage imagenOrigen) {
		BufferedImage imagenDestino = new BufferedImage(imagenOrigen.getWidth(), 
				imagenOrigen.getHeight(), 
				imagenOrigen.getType());
		ConvolveOp operadorConv = new ConvolveOp(mascara);
		operadorConv.filter(imagenOrigen, imagenDestino);
		copyBufferedImage(imagenDestino, imagenOrigen);
		return imagenOrigen;
	}

	protected void copyBufferedImage(BufferedImage dest, BufferedImage copy) {
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
