package observable_decorador;

public class FiltroDeteccionEsquinas extends FiltroGeneral {
	
	private float[] filtroM = { (float) (- 1.0), (float) (- 1.0), (float) (- 1.0), 
			(float) (0.0), (float) (0.0), (float) (0.0), 
			(float) (1.0), (float) (1.0), (float) (1.0) };
	

	public FiltroDeteccionEsquinas(Imagen sig) {
		super(sig);
		super.setFiltroMatriz(filtroM);
	}

}
