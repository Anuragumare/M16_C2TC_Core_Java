package in.cg.stream;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Example3 {

	public static void main(String[] args) {
		List<Integer> obj = Arrays.asList(10,20,30);
		System.out.println("-----Distinct--------");
		Optional<Integer> o = obj.stream().reduce((a,b) -> (a*b));
		if(o.isPresent()) {
			System.out.println("result: "+o);
		}
	}

}