package factory;

public class FactoryDemo {

	public static void main(String[] args) {
		
		OperatingFactory of=new OperatingFactory();
		OS obj=of.getInstance("dddddd");
		obj.dispach();
	}

}
