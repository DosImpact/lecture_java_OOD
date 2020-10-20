package SOLID.printer;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("printer MainTest");
		AllinOnePrinter allinOnePrinter = new AllinOnePrinter();
		allinOnePrinter.fax();
		allinOnePrinter.scan();
		allinOnePrinter.print();
		
		EconomicPrinter economicPrinter = new  EconomicPrinter();
		economicPrinter.print();
	}

}
