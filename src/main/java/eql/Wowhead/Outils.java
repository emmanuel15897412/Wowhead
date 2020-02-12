package eql.Wowhead;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.net.URI;
import java.net.URL;

public class Outils {
	
	public List<String> loadFile(String filePath) throws FileNotFoundException {
		   
	    URI uri = null;
	    
	    File file = new File(filePath);
	    ArrayList<String> list = new ArrayList<String>();
	    if(file.exists()) {
	    	Scanner s = new Scanner(file, "UTF-8");
	    	
	    	while (s.hasNextLine()){
	    		list.add(s.nextLine());
	    	}
	    	s.close();
	    	
	    	}
	    return list;
	}
}
