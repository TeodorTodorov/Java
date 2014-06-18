package Default;
import java.io.IOException;
import java.util.List;

public class TestPropertyReaderClass {

	public static void main(String[] args) throws IOException {
		PropertyReader reader  = new PropertyReader("C:\\JavaEclipseProjects\\Exercise25_05_2014\\src\\Default\\Properties");
		reader.loadProperties();
		List<String> strings = reader.getPropertyKeys();
		for (int i = 0; i < strings.size(); i++) {
			System.out.println(strings.get(i));
		}
	}

}