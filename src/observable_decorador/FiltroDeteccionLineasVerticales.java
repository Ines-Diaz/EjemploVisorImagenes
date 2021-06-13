package observable_decorador;

public class FiltroDeteccionLineasVerticales extends FiltroGeneral{

	private float[] filtroM = { (float) (-1.0), (float) (2.0), (float) (-1.0), 
			(float) (-1.0), (float) (2.0), (float) (-1.0), 
			(float) (-1.0), (float) (2.0), (float) (-1.0) };

	public FiltroDeteccionLineasVerticales(Imagen sig) {
		super(sig);
		super.setFiltroMatriz(filtroM);
	}

}
