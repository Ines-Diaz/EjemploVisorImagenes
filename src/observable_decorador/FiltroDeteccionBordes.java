package observable_decorador;

public class FiltroDeteccionBordes extends FiltroGeneral {
	
	private float[] filtroM = { (float) (0.0), (float) (0.25), (float) (0.0),
			(float) (0.25), (float) (0.0), (float) (0.25), 
			(float) (0.0), (float) (0.25), (float) (0.0) };
	
	public FiltroDeteccionBordes(Imagen sig) {
		super(sig);
		super.setFiltroMatriz(filtroM);
	}

}
