import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class PinCode {
	    public static boolean isValid(String pincode) {

	      String ZIP = "[1-9]{1}[0-9]{2}\s{0,1}[0-9]{3}";

	      Pattern p = Pattern.compile(ZIP);

	      if (pincode == null){
	         return false;
	      }

	      Matcher m = p.matcher(pincode);
	      return m.matches();
	      }

	   public static void main(String args[]){

	      String Pincode1 ="400708";
	      System.out.println( Pincode1 +":" +isValid(Pincode1));
	      
	      String Pincode2="A400708";
	      System.out.println( Pincode2 +":" +isValid(Pincode2));
	      
	      String Pincode3="400708B";
	      System.out.println( Pincode3 +":" +isValid(Pincode3));
	      
	      String Pincode4="400 705";
	      System.out.println( Pincode4 +":" +isValid(Pincode4));
	     }
}
