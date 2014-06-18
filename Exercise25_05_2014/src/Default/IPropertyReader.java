package Default;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public interface IPropertyReader {
		public List<String> getPropertyKeys();
		public void loadProperties() throws IOException;
		public Iterator<String> getPropertyKeyIterator();
		
}
