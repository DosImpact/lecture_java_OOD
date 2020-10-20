package SOLID.document2;

public class JPGConvertor extends DocumentConvertor{

	public JPGConvertor() {
		super("JPG");
	}

	@Override
	public void convertTo(String filename) {
		System.out.println(filename + this.getExt());
	}

}
