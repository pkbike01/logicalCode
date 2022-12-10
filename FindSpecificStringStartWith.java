import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;
public class FindSpecificStringStartWith{
	public static void main(String[] args)
	{	
		List<String> l1 = Arrays.asList("pankaj","pawan","prinyanka","abhishek","susanth","ravi");


		l1.stream().filter(e->e.startsWith("p")).collect(Collectors.toList()).forEach(a->{System.out.println(a);});
	

	}


}





