package Default;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class ReadingPropertiesFromFIle {

	public static void main(String[] args) throws IOException {
		try {
			Properties props = new Properties();
			FileInputStream reader = new FileInputStream(
					"C:\\JavaEclipseProjects\\Exercise25_05_2014\\src\\Default\\Properties");
			props.load(reader);

			System.out.println(props.getProperty(Constants.COLOR));
			props.setProperty("text_box_color", "Hellol");
			OutputStream writer = new FileOutputStream(
					"C:\\JavaEclipseProjects\\Exercise25_05_2014\\src\\Default\\Properties");

			props.store(writer, "i set you");
			

		} finally {

		}

	}

}
