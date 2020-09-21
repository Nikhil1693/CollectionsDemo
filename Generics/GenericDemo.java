public class GenericDemo<T> {//single parameter
	
	private T item;
	
	public void setitem(T item) {
		
		this.item=item;
	}
	
	public T getitem() {
		return this.item;
	}
	

static class Hashtable<K,V>{//multiple parameter
	
	private K key;
	private V value;
	


 public Hashtable(K key, V value){
	 this.key=key;
	 this.value=value;
 }
 
 @Override
public String toString() {
	return key.toString()+"-"+value.toString();
}
}
	
	public static void main(String[] args) {
		
//		GenericDemo<String> gd=new GenericDemo<>();
//		gd.setitem("Nikhil");
//		
//		String s=gd.getitem();
//		System.out.println(s);
		
		
		Hashtable<String,Integer> ht=new Hashtable<>("Hello World",55);
		System.out.println(ht);


	}

}
