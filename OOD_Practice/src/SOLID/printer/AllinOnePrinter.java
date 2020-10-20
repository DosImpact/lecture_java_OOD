package SOLID.printer;

public class AllinOnePrinter implements IFax,IPrinter,IScan {

	@Override
	public void scan() {
		// TODO Auto-generated method stub
		System.out.println("AllinOnePrinter scan");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("AllinOnePrinter print");
	}

	@Override
	public void fax() {
		// TODO Auto-generated method stub
		System.out.println("AllinOnePrinter fax");
	}

}
