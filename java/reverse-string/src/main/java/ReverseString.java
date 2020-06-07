import java.util.*;

class ReverseString {

    String reverse(String inputString) {
    	StringBuilder str = new StringBuilder();
    	str.append(inputString);
        return str.reverse().toString();
    }
  
}
