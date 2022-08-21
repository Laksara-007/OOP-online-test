package MockPaperQ1;

import java.util.Scanner;
import java.util.Stack;

public class PrintReverse {
	Stack<String> input  = new Stack<String>();
	

	public void inputSentence(Stack<String> theStack) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first word :");
		String temp;
		while (true) {
			temp = sc.nextLine();
			input.add(temp);
			if (temp.endsWith(".")) {
				break;
			}
			System.out.println("enter word by word");
			
		}
	}


	public void printSentence(Stack<String> theStack) {
		System.out.println("Reverse sentence");
		while (!(input.isEmpty())) {
			System.out.println(input.pop());
		}
	}
	

}
