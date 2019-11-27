package singleton;

public class SingletonDemo {
private static SingletonDemo singletonDemo;
private SingletonDemo(){
	
}

public static SingletonDemo getInstance(){
	if(singletonDemo==null){
		singletonDemo=new SingletonDemo();
	}
	return singletonDemo;
	
}
	public static void main(String[] args) {
		SingletonDemo singletonDemo = SingletonDemo.getInstance();
		SingletonDemo singletonDemo2=SingletonDemo.getInstance();
		System.out.println("::::::::::::::::::::singletonDemo::::::::::::::::");
		System.out.println(singletonDemo.hashCode());
		System.out.println(singletonDemo2.hashCode());
		
		
		
		System.out.println("::::::::::::::::::::Non singletonDemo::::::::::::::::");
		SingletonDemo sd=new SingletonDemo();
		SingletonDemo sd1=new SingletonDemo();
		System.out.println(sd.hashCode());
		System.out.println(sd1.hashCode());
		
		
	}

}
