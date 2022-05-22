	package in.cg.generic1;


	import java.util.HashMap;
	import java.util.Iterator;
	import java.util.Map;
	import java.util.Map.Entry;
	import java.util.Set;

	public class Example4 {

		public static void main(String[] args) 
		{
			Map<Integer, Integer> m=new HashMap<Integer, Integer>();
			m.put(1, 98745);
			m.put(2, 4568);
		 //   m.put(1, "Anurag");
		  //  System.out.println(m);
		    
			Set<Map.Entry<Integer, Integer>>obj=m.entrySet();
		    Iterator<Map.Entry<Integer, Integer>>itr=obj.iterator();
		    
		    while(itr.hasNext())
		    {
		    	Map.Entry e=itr.next();
		    	System.out.println(e.getKey()+""+e.getValue());
		    
		    	
		    }
		    
		}

	}
