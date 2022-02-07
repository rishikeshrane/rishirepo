/**
 * 
 */
package common;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author Rishikesh
 *
 */
public class Task2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}
	
	private static String solution(String originalStr){
	    String result = "";
	    result = eliminate(originalStr);
	    if(result.equals(originalStr)){
	        return  originalStr;
	    }else if(result.equals("")){
	        return  result;
	    }else {
	    	result = eliminate(result);
	    }


	    return result;

	}

	private static  String eliminate(String input){
	    int length = input.length();
	    int counter = 0;
	    String[] array  = input.split("");
	    while(counter<length){
	        if(array[counter].equals("A")){
	            if(counter+1<length && array[counter+1].equals("B")){
	                array[counter]="";
	                array[counter+1]="";
	            }
	        }else if(array[counter].equals("B")){
	            if(counter+1<length && array[counter+1].equals("A")){
	                array[counter]="";
	                array[counter+1]="";
	            }
	        } else if(array[counter].equals("C")){
	            if( counter+1<length && array[counter+1].equals("D")){
	                array[counter]="";
	                array[counter+1]="";
	            }
	        }else if(array[counter].equals("D")){
	            if(counter+1<length && array[counter+1].equals("C")){
	                array[counter]="";
	                array[counter+1]="";
	            }
	        }
	        counter++;
	    }
	    return Arrays.stream(array).collect(Collectors.joining());
	}

}
