package General;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class OccurencesOfCharUsingJava8 {
	
	static void m(String s) {
		IntStream intStream = s.chars();
		Stream<Character> stream = intStream.mapToObj(ch -> (char)ch);
		Map<Object, Long> m = stream.collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));
		System.out.println(m);
	}

	public static void main(String[] args) {
		m("jjjaaavvaa");
	}

}
