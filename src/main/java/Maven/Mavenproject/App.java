package Maven.Mavenproject;

import java.util.LinkedList;
import java.util.List;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

/**
 * Hello world!
 *
 */
public class App 
{
	 
     public static void get(String perm,String word
    		 
    		 ){
    	 if(word.length()==0)
    	 {
    		 System.out.println(perm);
    	 }
    	 else
    	 {
    		 for(int i=0;i<word.length();i++)
    		 {
    			 get(perm+word.charAt(i),word.substring(0,i)+word.substring(i+1,word.length()));
    		 }
    	 }
    	      }
	
    public static void main( String[] args )
    {
    get("","abc");
    }
   
}
