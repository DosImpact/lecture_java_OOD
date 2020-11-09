<<<<<<< HEAD
import java.util.Date;

// http://www.kma.go.kr/HELP/basic/help_01_03_01.jsp
// DecompositionIndex (KPARK 2020/09/27)
enum DecompositionIndex {
	HIGH, NORMAL, LOW;
}

public class DecompositionIndexDisplay implements Observer, DisplayElement  {
	private DecompositionIndex index = null;

	// DecompositionIndex = (RH - 65)/14 * (1.054^T) [RH: relativeHumidity (%), T: temperature (celsius)]
	public static double calculate(double T, double RH) {
		double value = (RH - 65.0)/14.0 * Math.pow(1.054, T);
        value = Math.round(value * 100) / 100.0; // ï¿½Ò¼ï¿½ï¿½ï¿½ ï¿½ï¿½Â°ï¿½Ú¸ï¿½ ï¿½İ¿Ã¸ï¿½
        return value;
	}
	
	@Override
	public String toString() {
		return "DecompositionIndexDisplay [index=" + index + "]";
	}

	@Override
	public void display() {
		System.out.println(this);//toString ½ÇÇà
	}

	@Override
	public void update(Date dateTime, double temp, double velocity, double humidity) {
		// subject¿¡¼­ ¾÷µ¥ÀÌÆ® ½ÅÈ£°¡ ¿À¸é, µ¥ÀÌÅÍ¸¦ °¡°ø ¹× ÀúÀå ÈÄ¿¡ display ½ÇÇà
		double result =  DecompositionIndexDisplay.calculate(temp, humidity);
		if( result >= 7 ) {
			this.index = DecompositionIndex.HIGH;
		}
		else if( result >= 3 ) {
			this.index = DecompositionIndex.NORMAL;
		}
		else {
			this.index = DecompositionIndex.LOW;
		}
		display();
		
	}
	@Override
	public boolean equals(Object o){
		return ( o instanceof DecompositionIndexDisplay); // indexOf¸¦ °áÁ¤ÇÏ±â À§ÇÑ ÄÚµå
	}
}
=======
import java.util.Date;

// http://www.kma.go.kr/HELP/basic/help_01_03_01.jsp
// DecompositionIndex (KPARK 2020/09/27)
enum DecompositionIndex {
	HIGH, NORMAL, LOW;
}

public class DecompositionIndexDisplay implements Observer, DisplayElement  {
	private DecompositionIndex index = null;

	// DecompositionIndex = (RH - 65)/14 * (1.054^T) [RH: relativeHumidity (%), T: temperature (celsius)]
	public static double calculate(double T, double RH) {
		double value = (RH - 65.0)/14.0 * Math.pow(1.054, T);
        value = Math.round(value * 100) / 100.0; // ï¿½Ò¼ï¿½ï¿½ï¿½ ï¿½ï¿½Â°ï¿½Ú¸ï¿½ ï¿½İ¿Ã¸ï¿½
        return value;
	}
	
	@Override
	public String toString() {
		return "DecompositionIndexDisplay [index=" + index + "]";
	}

	@Override
	public void display() {
		System.out.println(this);
	}

	@Override
	public void update(Date dateTime, double temp, double velocity, double humidity) {
		double result =  DecompositionIndexDisplay.calculate(temp, humidity);
		if( result >= 7 ) {
			this.index = DecompositionIndex.HIGH;
		}
		else if( result >= 3 ) {
			this.index = DecompositionIndex.NORMAL;
		}
		else {
			this.index = DecompositionIndex.LOW;
		}
		display();
		
	}
	@Override
	public boolean equals(Object o){
		return ( o instanceof DecompositionIndexDisplay);
	}
}
>>>>>>> 789faa920333a2f38521e18a1190b9fd0d246435
