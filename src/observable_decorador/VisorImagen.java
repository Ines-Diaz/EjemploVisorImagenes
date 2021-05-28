package observable_decorador;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;

public class VisorImagen extends JFrame {

	public VisorImagen(Observable_de_Filtro obsf) {
		setTitle("Visor de Imágenes");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLayout(new GridLayout(1, 1));

		PanelImagen panimg = new PanelImagen(obsf);
			panimg.cambiaImagen(obsf.GetImagen());
			panimg.repaint();

		obsf.addObserver(panimg);
		JScrollPane spImage = new JScrollPane(panimg);
//		spImage.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
//		spImage.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		add(spImage);

		setSize(600, 600);

	}
}
