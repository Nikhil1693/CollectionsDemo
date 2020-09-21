package Genericmethod;

public class MethodDemo {
	
	public <T> void showArray(T[] array) {
		
		for(T item:array)
			System.out.print(item.toString()+" ");
			System.out.println();
	}
	
	public <T> T showItem(T t) {
		System.out.println("Item is- "+t);
		return t;
	}
	
	
	
	
	public static void main(String[] args) {
		
		MethodDemo md=new MethodDemo();
		//md.showItem("Nikhil");
		System.out.println("The returned item is: "+md.showItem("Hello"));
		
		Integer[] a= {1,2,3,5,4};
		md.showArray(a);
		String[] s= {"nikhil","vijay","Deepak","pushpa"};
		md.showArray(s);
	}

}
