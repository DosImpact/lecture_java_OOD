import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.util.ArrayList;
import java.util.List;

// WeatherDataImporter (KPARK 2020/09/27)
public class WeatherDataImporter {
	public static final SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

	// load CSV
    public static List<WeatherData> loadCSV(String filename) { 
    	List<WeatherData> list = new ArrayList<WeatherData>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))){
            String line = "";
            
            while((line = reader.readLine()) != null){
                
            	String[] array = line.split(",");
//                System.out.println(array[2]+"|"+array[3]+"|"+array[4]+"|"+array[5]);
                
                try {
					list.add(new WeatherData(
							formatter.parse(array[2]),
							Double.parseDouble(array[3]),
							Double.parseDouble(array[4]),
							Double.parseDouble(array[5]) ));
					
				} catch (NumberFormatException e) {
//					e.printStackTrace();
				} catch (ParseException e) {
//					e.printStackTrace();
				}
            }
        } catch (IOException e) {
//            e.printStackTrace();
            return null;
        }  

		return list;
    }
}
