package observable_decorador;

import java.io.IOException;

import javax.swing.JOptionPane;

public class ControladorAplicacion {

	private Observable_de_Filtro obfil;

	private Imagen img_obs;
	String fileNameAndPath;

	public ControladorAplicacion(Observable_de_Filtro of) {

		obfil = of;
		img_obs = null;
		fileNameAndPath = null;
	}

	public void Reiniciar() throws IOException {
		if (img_obs != null) {
			img_obs = new ImagenSinFiltro(fileNameAndPath);
			obfil.ActualizarImagen(img_obs.GetImagen());
		} else {
			JOptionPane.showMessageDialog(null, "Aún no se ha cargado ninguna imagen.");
		}
	}

	public void NuevoVisor() {
		try {
			VisorImagen vi = new VisorImagen(obfil);
			vi.setVisible(true);
		} catch (Exception ex) {
		}

	}

	public void cambiarArchivo(String newFileNameAndPath) {
		fileNameAndPath = newFileNameAndPath;
		try {
			img_obs = new ImagenSinFiltro(fileNameAndPath);
			obfil.ActualizarImagen(img_obs.GetImagen());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
