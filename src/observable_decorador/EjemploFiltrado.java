package observable_decorador;

import java.awt.image.*;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class EjemploFiltrado {

	public static void main(String[] args) throws IOException {
		BufferedImage    imagenOrig, imagenDestino;
    	File ficheroImg = new File("minion.jpg");    	
		imagenOrig = ImageIO.read(ficheroImg);
		imagenDestino = new BufferedImage(imagenOrig.getWidth(),
				imagenOrig.getHeight(), imagenOrig.getType());
		float[] filtroSuavizado = {(float) (1.0/9.0), (float) (1.0/9.0), (float) (1.0/9.0),
					(float) (1.0/9.0), (float) (1.0/9.0), (float) (1.0/9.0), (float) (1.0/9.0),
					(float) (1.0/9.0), (float) (1.0/9.0)};
		Kernel mascara = new Kernel(3, 3, filtroSuavizado);
		ConvolveOp operadorConv = new ConvolveOp(mascara);	       
        operadorConv.filter(imagenOrig, imagenDestino);       
        ImageIO.write(imagenDestino, "jpg", new File("minion-suavizado.jpg"));		
	}

}
