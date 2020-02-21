package ahmad;
import java .util.Map.Entry;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Hashtable;
public class Map {

	public static void main(String[] args) {
		TreeMap<String,Integer> map=new TreeMap<>();
		map.put("Bananan",35);
		map.put("Apple",45);
		map.put("Mango",65);
		map.put("PineApple",95);
		map.put("Orange",55);
		map.put("Bananan",70);
		//map.put("Bananan",null);
		//map.put(null,70);
		/*System.out.println(map);
		System.out.println(map.get("Mango"));
		System.out.println(repalce("Grapes",70));*/
		for(Entry<String,Integer> entry:map.entrySet()) {
			//System.out.println(entry.getKey());
			//System.out.println(entry.getValue());
			System.out.println(entry.getKey()+"....>"+entry.getValue());
			
			
		}
		
	}

}
