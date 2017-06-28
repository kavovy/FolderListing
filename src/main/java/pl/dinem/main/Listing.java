package pl.dinem.main;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Listing {

	private String path;

	public String getPath() {
		return path;
	}

	public Listing(String path) {
		this.path = path;
	}

	List<String> files = new ArrayList<String>();
	
	public void listFilesAndFolders() {
		File directory = new File(path);
		File[] fList = directory.listFiles();
		for (File file : fList) {
			files.add(file.getName());
		}
	}

	public List<String> getFiles() {
		return files;
	}
	


	
	
}
