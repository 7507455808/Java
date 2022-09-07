package java8;

import java.util.Optional;

public class OptionalEg {

	public static void main(String[] args) {
		
		String[] str = new String[5];
	//	str[3] = "hiiiii all";
		
		Optional<String> chk = Optional.ofNullable(str[3]);
		
		if(chk.isPresent()) {
			String a = str[3].toUpperCase();
			System.out.println(a);
		}
		else {
			System.out.println("value not present in string array");
		}

	}

}
