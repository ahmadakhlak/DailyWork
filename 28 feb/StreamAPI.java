package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.w3c.dom.NameList;

public class StreamAPI {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		addNames(names);
		// 1. print name with length more than 6
		List<String> nameList = names.stream().filter(s -> s.length() > 6).collect(Collectors.toList());
		names.forEach(System.out::println);

		// 2. Names in upper case
		// List<String> namesInUpper = nameList.stream().map(s ->
		// s.toUpperCase())
		// .collect(Collectors.toList());
		// System.out.println("names in upper case");
		// namesInUpper.forEach(System.out::println);

		long count = names.stream().count();
		System.out.println("List is :" + count);
		Stream<Integer> data = Stream.of(1, 11, 111, 1111, 11111);
		System.out.println("Data count :" + data.count());

		Stream<String> languages1 = Stream.of("c", "c++", "java", "python", "angular");
		Stream<String> languages = Stream.of("c", "c++", "java", "python", "angular");
		List<String> langLength = languages.filter(s -> s.length() > 4).collect(Collectors.toList());
		System.out.println("**********Length greater than 4");
		langLength.forEach(System.out::println);
		
		
		System.out.println("***********Adding Programming----------------");
		
	    List<String> addpro = languages1.map(s -> s.concat(" Programming")).collect(Collectors.toList());
		addpro.forEach(System.out::println);
		
		
		//3.sort the list
		List<String>customSorting=names.stream().sorted((s1,s2)-> -s1.compareTo(s2)).collect(Collectors.toList());
		System.out.println("***********descending order*********");
		customSorting.forEach(System.out::println);
	}

	private static void addNames(ArrayList<String> names) {
		names.add("Akhlak");
		names.add("yogesh");
		names.add("mayuresh");
		names.add("kunal");
		names.add("salman");
		names.add("iqbal");
	}
}
