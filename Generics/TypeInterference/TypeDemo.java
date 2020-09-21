package TypeInterference;

import java.util.ArrayList;
import java.util.List;

public class TypeDemo {
	
public static <T> void addstore(T t,List<Bucket<T>> list) {
	
	Bucket<T> bucket=new Bucket<>();
	bucket.setitem(t);
	list.add(bucket);
	System.out.println(t.toString()+" has been added to the list..");
	
}
	
	public static void main(String[] args) {
		
		List<Bucket<String>> list=new ArrayList<>();
		TypeDemo.addstore("Nikhil", list);
		
		//type witness
		TypeDemo.<String>addstore("Ajay",list);
		
		
	}

	
}

class Bucket<T>  {//generic
	
	private T item;
	
	public T getitem() {
		return this.item;
	}
	
	public void setitem(T item) {
		this.item=item;
	}
}
