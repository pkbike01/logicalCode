import java.util.List;
import java.util.Arrays;





public class MostRepeatingWord{


	public static void main(String[] args ){
		List<String> l = Arrays.asList("rakhi","pankaj","rakhi","rakhi","raj","pankaj");

		System.out.println(l);
		int freq=0;
		String result ="";

		for(int i=0;i<l.size();i++){
			int count=0;
			for(int j=0;j<l.size(); j++){
				if(l.get(i).equals(l.get(j))){

					count++;
			
				}
				if(count>freq){
					freq=count;
					result = l.get(i);
			
				}
				
			}
		}
		System.out.println(freq);
		System.out.println(result);

		

	}

}
