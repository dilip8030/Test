package factory;

public class OperatingFactory {
	public OS getInstance(String s) {

		if (s.equals("Open"))
			return new Android();
		else if (s.equals("Close"))
			return new IOS();
		else
			return new Windows();

	}

}
