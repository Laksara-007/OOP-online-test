package MockPaperQ1;

import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<String> theStack = new Stack<String>();
		PrintReverse ob=new PrintReverse();
		ob.inputSentence(theStack);
		ob.printSentence(theStack);
	}

}
