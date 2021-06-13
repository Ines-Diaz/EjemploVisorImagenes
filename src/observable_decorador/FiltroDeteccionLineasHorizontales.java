package observable_decorador;

public class FiltroDeteccionLineasHorizontales extends FiltroGeneral {

	private float[] filtroM = { (float) (-1.0), (float) (-1.0), (float) (-1.0), 
			(float) (2.0), (float) (2.0), (float) (2.0), 
			(float) (-1.0), (float) (-1.0), (float) (-1.0) };
	
	public FiltroDeteccionLineasHorizontales(Imagen sig) {
		super(sig);
		super.setFiltroMatriz(filtroM);
	}
}
