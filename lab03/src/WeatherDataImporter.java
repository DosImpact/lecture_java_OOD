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
	// yyyy-MM-dd 형태의 데이터를 받기위한 포멧터
	public static final SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

	// load CSV
    public static List<WeatherData> loadCSV(String filename) { 
    	// WeatherData 형태로 데이터를 받습니다. 처음 데이터는 주석 데이터로 Exception이 발생하여 try catch로 잘 잡아줍니다.
    	List<WeatherData> list = new ArrayList<WeatherData>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))){
            String line = "";
            while((line = reader.readLine()) != null){
                
            	String[] array = line.split(",");// CSV 파일이라 , 로 나눈 후 String 배열로 입력
//                System.out.println(array[2]+"|"+array[3]+"|"+array[4]+"|"+array[5]);
                try {
					list.add(
						new WeatherData(
								formatter.parse(array[2]),
								Double.parseDouble(array[3]),
								Double.parseDouble(array[4]),
								Double.parseDouble(array[5]) 
							)
						);
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
        // load 후 출력
        System.out.println("load successfully");
        for( WeatherData l : list ) {
        	System.out.println(l);
        }
		return list;
    }
}
