package observable_decorador;

public class FiltroDeLaplace extends FiltroGeneral {
	
	private float[] filtroM = { (float) (0.0), (float) (-1.0), (float) (0.0), 
			(float) (1.0), (float) (-4.0), (float) (1.0), 
			(float) (0.0), (float) (-1.0), (float) (0.0) };
	
	public FiltroDeLaplace(Imagen sig) {
		super(sig);
		super.setFiltroMatriz(filtroM);
	}

}
