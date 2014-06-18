package Default;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

public class PropertyReader implements IPropertyReader  {
	String path = null;
	Properties myProperties ; 
	List<String> myStringKeys ;
	public PropertyReader(String path) {
		this.path = path;
	}
	
	@Override
	public List<String> getPropertyKeys() {
		ArrayList<Object> myKeys = new ArrayList<>(myProperties.keySet());
		 myStringKeys = new ArrayList<>();
		for (int i = 0; i < myKeys.size(); i++) {
			myStringKeys.add((myKeys.get(i).toString()));
		}
		return myStringKeys; 
		
		
	}

	@Override
	public void loadProperties() throws IOException {
		InputStream instream = new FileInputStream(path);
		Properties props = new Properties();
		props.load(instream);
		myProperties = props;
		
	}

	@Override
	public Iterator<String> getPropertyKeyIterator() {
		Iterator<String> iteratorString = myStringKeys.iterator();
		return iteratorString;
	}

		
}
