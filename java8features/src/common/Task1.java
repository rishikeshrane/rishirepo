/**
 * 
 */
package common;

import java.util.Stack;
import java.util.function.Predicate;

/**
 * @author Rishikesh
 * Stack
 */
public class Task1 {

	Stack<Integer> intStack = new Stack<>();
	Predicate<Integer> p = (size) ->  size > 1;
	Predicate<Integer> p1 = (sub) ->  sub > 0;
	
	public static final int   MAX_VALUE =(int) Math.pow(2, 20);
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Task1 t = new Task1();
		String str="4 5 6 - 7 +";
		String str1="13 DUP 4 POP 5 DUP + DUP + -";
		String str2="5 6 + -";
		String str3="3 DUP 5 - -";
		String str4="1048575 DUP -";
		String str5="1 0 4 8 5 7 5 DUP - - - - -";
		//String str4="+ 1 ";
		
		Integer o = t.solution(str5);
		System.out.println("o/p:" + o);
		
	}

		public int solution(String s) {
			String[] inputStr = s.split(" "); //separated with a space
			
			for (int i = 0; i < inputStr.length; i++) {
				System.out.println(intStack);
				System.out.println(inputStr[i]);
				switch(inputStr[i]) {
					case "+":						 
						
						
						if(p.test(size())) {
							try {
								Integer firstEle = pop();
								Integer secondEle = pop();
								Integer subOfEle = firstEle + secondEle;
								if(subOfEle > MAX_VALUE) return -1; 
								push(subOfEle);
							} catch(NumberFormatException e) {
								return -1;
							}
						} else return -1;
						
						break;
					case "-": 						
						if(p.test(size())) {
							Integer firstElement = pop();
							Integer secondElement = pop();
							Integer subOfElements = firstElement - secondElement;
							
							if(p1.test(subOfElements)) {
								push(subOfElements);
							}
						} else return -1;
						
						break;
					case "POP": 
						pop();
						break;
					case "DUP": 
						dup(peek());
						break;
					default: 
						try { 
								push(Integer.valueOf(inputStr[i]));
							} catch(NumberFormatException e) {
								return -1;
							}
						break;
				}
			}
			
			return pop();
		}
		
		boolean isEmptyStack() {
			return intStack.isEmpty();
		}
		
		int size() {
			return intStack.size();
		}
		
		Integer push(Integer element) {
			return intStack.push(element);
		}
		
		Integer pop() {
			if(isEmptyStack()) return -1;
			return intStack.pop();
		}
		
		Integer dup(Integer element) {
			return intStack.push(element);
		}
		
		Integer peek() {
			if(isEmptyStack()) return -1;
			return intStack.peek();
		}
}
