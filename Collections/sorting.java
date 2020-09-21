import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a[]= {-1,4,2,6,8,1};
		
		Arrays.sort(a);
		
		for(int num:a)
			System.out.print(num+" ");
		
		
		List<String> l=new ArrayList<>();
		
		l.add("nikhil");
		l.add("ajay");
		l.add("vijay");
		l.add("pushpa");
		
		
		Collections.sort(l);
		
		System.out.print(l);

	}

}
