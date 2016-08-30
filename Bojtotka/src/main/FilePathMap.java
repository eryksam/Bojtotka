package main;

import java.util.HashMap;
import java.util.Map;

public class FilePathMap {
	private Map<String, String> testInputFileMap;
	private Map<String, String> testOutputFileMap;
	private static FilePathMap singleton;
	
	protected FilePathMap() {
		putTestInputFilesToMap();
		putTestOutputFilesToMap();
	}

	private void putTestOutputFilesToMap() {
		testOutputFileMap = new HashMap<>();
		testOutputFileMap.put("bar0", "C:\\Users\\Eryk\\workspace\\Bojtotka\\data\\bar0.out");
		testOutputFileMap.put("bar1a", "C:\\Users\\Eryk\\workspace\\Bojtotka\\data\\bar1a.out");
		testOutputFileMap.put("bar1b", "C:\\Users\\Eryk\\workspace\\Bojtotka\\data\\bar1b.out");
		testOutputFileMap.put("bar1c", "C:\\Users\\Eryk\\workspace\\Bojtotka\\data\\bar1c.out");
		testOutputFileMap.put("bar1d", "C:\\Users\\Eryk\\workspace\\Bojtotka\\data\\bar1d.out");
		testOutputFileMap.put("bar1e", "C:\\Users\\Eryk\\workspace\\Bojtotka\\data\\bar1e.out");
		testOutputFileMap.put("bar1f", "C:\\Users\\Eryk\\workspace\\Bojtotka\\data\\bar1f.out");
		testOutputFileMap.put("bar1g", "C:\\Users\\Eryk\\workspace\\Bojtotka\\data\\bar1g.out");
		testOutputFileMap.put("bar2a", "C:\\Users\\Eryk\\workspace\\Bojtotka\\data\\bar2a.out");
		testOutputFileMap.put("bar2b", "C:\\Users\\Eryk\\workspace\\Bojtotka\\data\\bar2b.out");
		testOutputFileMap.put("bar2c", "C:\\Users\\Eryk\\workspace\\Bojtotka\\data\\bar2c.out");
		testOutputFileMap.put("bar3a", "C:\\Users\\Eryk\\workspace\\Bojtotka\\data\\bar3a.out");
		testOutputFileMap.put("bar3b", "C:\\Users\\Eryk\\workspace\\Bojtotka\\data\\bar3b.out");
		testOutputFileMap.put("bar3c", "C:\\Users\\Eryk\\workspace\\Bojtotka\\data\\bar3c.out");
		testOutputFileMap.put("bar3d", "C:\\Users\\Eryk\\workspace\\Bojtotka\\data\\bar3d.out");
		testOutputFileMap.put("bar4a", "C:\\Users\\Eryk\\workspace\\Bojtotka\\data\\bar4a.out");
		testOutputFileMap.put("bar4b", "C:\\Users\\Eryk\\workspace\\Bojtotka\\data\\bar4b.out");
		testOutputFileMap.put("bar4c", "C:\\Users\\Eryk\\workspace\\Bojtotka\\data\\bar4c.out");
		testOutputFileMap.put("bar5a", "C:\\Users\\Eryk\\workspace\\Bojtotka\\data\\bar5a.out");
		testOutputFileMap.put("bar5b", "C:\\Users\\Eryk\\workspace\\Bojtotka\\data\\bar5b.out");
		testOutputFileMap.put("bar5c", "C:\\Users\\Eryk\\workspace\\Bojtotka\\data\\bar5c.out");
		testOutputFileMap.put("bar6a", "C:\\Users\\Eryk\\workspace\\Bojtotka\\data\\bar6a.out");
		testOutputFileMap.put("bar6b", "C:\\Users\\Eryk\\workspace\\Bojtotka\\data\\bar6b.out");
		testOutputFileMap.put("bar6c", "C:\\Users\\Eryk\\workspace\\Bojtotka\\data\\bar6c.out");
		testOutputFileMap.put("bar7a", "C:\\Users\\Eryk\\workspace\\Bojtotka\\data\\bar7a.out");
		testOutputFileMap.put("bar7b", "C:\\Users\\Eryk\\workspace\\Bojtotka\\data\\bar7b.out");
		testOutputFileMap.put("bar7c", "C:\\Users\\Eryk\\workspace\\Bojtotka\\data\\bar7c.out");
		testOutputFileMap.put("bar7d", "C:\\Users\\Eryk\\workspace\\Bojtotka\\data\\bar7d.out");
		testOutputFileMap.put("bar8a", "C:\\Users\\Eryk\\workspace\\Bojtotka\\data\\bar8a.out");
		testOutputFileMap.put("bar8b", "C:\\Users\\Eryk\\workspace\\Bojtotka\\data\\bar8b.out");
		testOutputFileMap.put("bar8c", "C:\\Users\\Eryk\\workspace\\Bojtotka\\data\\bar8c.out");
		testOutputFileMap.put("bar9a", "C:\\Users\\Eryk\\workspace\\Bojtotka\\data\\bar9a.out");
		testOutputFileMap.put("bar9b", "C:\\Users\\Eryk\\workspace\\Bojtotka\\data\\bar9b.out");
		testOutputFileMap.put("bar9c", "C:\\Users\\Eryk\\workspace\\Bojtotka\\data\\bar9c.out");
		testOutputFileMap.put("bar9d", "C:\\Users\\Eryk\\workspace\\Bojtotka\\data\\bar9d.out");
		testOutputFileMap.put("bar10a", "C:\\Users\\Eryk\\workspace\\Bojtotka\\data\\bar10a.out");
		testOutputFileMap.put("bar10b", "C:\\Users\\Eryk\\workspace\\Bojtotka\\data\\bar10b.out");
		testOutputFileMap.put("bar10c", "C:\\Users\\Eryk\\workspace\\Bojtotka\\data\\bar10c.out");
		
	}

	private void putTestInputFilesToMap() {
		testInputFileMap = new HashMap<>();
		testInputFileMap.put("bar0", "C:\\Users\\Eryk\\workspace\\Bojtotka\\data\\bar0.in");
		testInputFileMap.put("bar1a", "C:\\Users\\Eryk\\workspace\\Bojtotka\\data\\bar1a.in");
		testInputFileMap.put("bar1b", "C:\\Users\\Eryk\\workspace\\Bojtotka\\data\\bar1b.in");
		testInputFileMap.put("bar1c", "C:\\Users\\Eryk\\workspace\\Bojtotka\\data\\bar1c.in");
		testInputFileMap.put("bar1d", "C:\\Users\\Eryk\\workspace\\Bojtotka\\data\\bar1d.in");
		testInputFileMap.put("bar1e", "C:\\Users\\Eryk\\workspace\\Bojtotka\\data\\bar1e.in");
		testInputFileMap.put("bar1f", "C:\\Users\\Eryk\\workspace\\Bojtotka\\data\\bar1f.in");
		testInputFileMap.put("bar1g", "C:\\Users\\Eryk\\workspace\\Bojtotka\\data\\bar1g.in");
		testInputFileMap.put("bar2a", "C:\\Users\\Eryk\\workspace\\Bojtotka\\data\\bar2a.in");
		testInputFileMap.put("bar2b", "C:\\Users\\Eryk\\workspace\\Bojtotka\\data\\bar2b.in");
		testInputFileMap.put("bar2c", "C:\\Users\\Eryk\\workspace\\Bojtotka\\data\\bar2c.in");
		testInputFileMap.put("bar3a", "C:\\Users\\Eryk\\workspace\\Bojtotka\\data\\bar3a.in");
		testInputFileMap.put("bar3b", "C:\\Users\\Eryk\\workspace\\Bojtotka\\data\\bar3b.in");
		testInputFileMap.put("bar3c", "C:\\Users\\Eryk\\workspace\\Bojtotka\\data\\bar3c.in");
		testInputFileMap.put("bar3d", "C:\\Users\\Eryk\\workspace\\Bojtotka\\data\\bar3d.in");
		testInputFileMap.put("bar4a", "C:\\Users\\Eryk\\workspace\\Bojtotka\\data\\bar4a.in");
		testInputFileMap.put("bar4b", "C:\\Users\\Eryk\\workspace\\Bojtotka\\data\\bar4b.in");
		testInputFileMap.put("bar4c", "C:\\Users\\Eryk\\workspace\\Bojtotka\\data\\bar4c.in");
		testInputFileMap.put("bar5a", "C:\\Users\\Eryk\\workspace\\Bojtotka\\data\\bar5a.in");
		testInputFileMap.put("bar5b", "C:\\Users\\Eryk\\workspace\\Bojtotka\\data\\bar5b.in");
		testInputFileMap.put("bar5c", "C:\\Users\\Eryk\\workspace\\Bojtotka\\data\\bar5c.in");
		testInputFileMap.put("bar6a", "C:\\Users\\Eryk\\workspace\\Bojtotka\\data\\bar6a.in");
		testInputFileMap.put("bar6b", "C:\\Users\\Eryk\\workspace\\Bojtotka\\data\\bar6b.in");
		testInputFileMap.put("bar6c", "C:\\Users\\Eryk\\workspace\\Bojtotka\\data\\bar6c.in");
		testInputFileMap.put("bar7a", "C:\\Users\\Eryk\\workspace\\Bojtotka\\data\\bar7a.in");
		testInputFileMap.put("bar7b", "C:\\Users\\Eryk\\workspace\\Bojtotka\\data\\bar7b.in");
		testInputFileMap.put("bar7c", "C:\\Users\\Eryk\\workspace\\Bojtotka\\data\\bar7c.in");
		testInputFileMap.put("bar7d", "C:\\Users\\Eryk\\workspace\\Bojtotka\\data\\bar7d.in");
		testInputFileMap.put("bar8a", "C:\\Users\\Eryk\\workspace\\Bojtotka\\data\\bar8a.in");
		testInputFileMap.put("bar8b", "C:\\Users\\Eryk\\workspace\\Bojtotka\\data\\bar8b.in");
		testInputFileMap.put("bar8c", "C:\\Users\\Eryk\\workspace\\Bojtotka\\data\\bar8c.in");
		testInputFileMap.put("bar9a", "C:\\Users\\Eryk\\workspace\\Bojtotka\\data\\bar9a.in");
		testInputFileMap.put("bar9b", "C:\\Users\\Eryk\\workspace\\Bojtotka\\data\\bar9b.in");
		testInputFileMap.put("bar9c", "C:\\Users\\Eryk\\workspace\\Bojtotka\\data\\bar9c.in");
		testInputFileMap.put("bar9d", "C:\\Users\\Eryk\\workspace\\Bojtotka\\data\\bar9d.in");
		testInputFileMap.put("bar10a", "C:\\Users\\Eryk\\workspace\\Bojtotka\\data\\bar10a.in");
		testInputFileMap.put("bar10b", "C:\\Users\\Eryk\\workspace\\Bojtotka\\data\\bar10b.in");
		testInputFileMap.put("bar10c", "C:\\Users\\Eryk\\workspace\\Bojtotka\\data\\bar10c.in");
	}
	
	public String getInputFilePath(String fileName) {
		return testInputFileMap.get(fileName);
	}
	
	public String getOutputFilePath(String fileName) {
		return testOutputFileMap.get(fileName);
	}
	
	public static FilePathMap getSingleton() {
		if(singleton == null) {
			singleton = new FilePathMap();
		}
		return singleton;
	}
}
