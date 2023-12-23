import java.util.Scanner;

public class infix_to_prefix {
	char stack[];
	int tos,MaxSize;
	void createstack(int size) {
		stack =new char[size];
		MaxSize=size;
		tos=-1;
		
	}
	void push(char e) {
		tos++;
		stack [tos]=e;
	}
	boolean is_full() {
		if(tos==MaxSize-1)
			return true;
		else
			return false;
	}
	char pop() {
		char temp =stack[tos];
		tos--;
		return temp;

	}
	char peek() {
		char temp =stack [tos];
		return temp;

	}
	boolean is_empty() {
		if(tos==-1)
			return true;
		else
			return false;
	}
    boolean is_operator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }

    int get_precedence(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default:
                return 0;
        }
    }
    String INFIX_TO_PREFIX(String infix) {
    	StringBuilder prefix= new StringBuilder();
    	
    	for (int i = infix.length() - 1; i >= 0; i--) {
            char c = infix.charAt(i);
            if (c == ')') {
                push(c);
            } else if (c == '(') {
                while (!is_empty() && peek() != ')') {
                    prefix.insert(0, pop());
                }
                pop(); // Pop ')'
            } else if (Character.isLetterOrDigit(c)) {
                prefix.insert(0, c);
            } else if (is_operator(c)) {
                while (!is_empty() && get_precedence(c) < get_precedence(peek())) {
                    prefix.insert(0, pop());
                }
                push(c);
            }
        }

    	 while (!is_empty()) {
             prefix.insert(0, pop());
         }


        return prefix.toString();
    	
    }
    public static void main(String args[]) {
    	Scanner sc= new Scanner(System.in);
    	String s=sc.nextLine();
    	infix_to_prefix OBJ= new infix_to_prefix();
    	OBJ.createstack(s.length());
    	System.out.println("Prefix is "+OBJ.INFIX_TO_PREFIX(s));
    }
    

}