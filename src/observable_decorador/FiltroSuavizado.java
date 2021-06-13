package observable_decorador;

public class FiltroSuavizado extends FiltroGeneral {	
	
	private float[] filtroM = { (float) (1.0 / 9.0), (float) (1.0 / 9.0), (float) (1.0 / 9.0), 
			(float) (1.0 / 9.0), (float) (1.0 / 9.0), (float) (1.0 / 9.0), 
			(float) (1.0 / 9.0), (float) (1.0 / 9.0), (float) (1.0 / 9.0) };

	public FiltroSuavizado(Imagen sig) {
		super(sig);
		super.setFiltroMatriz(filtroM);
	}	

}
