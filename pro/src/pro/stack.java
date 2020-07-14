import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class stack_pro {
	public static void main(String[] args) throws IOException{
		System.out.print("괄호를 입력하세요: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean isVPS = true;
		String input = br.readLine();
		Stack<Character> stack = new Stack<Character>();
		char temp;
		
		for(int i=0; i<input.length(); i++) {
			temp=input.charAt(i);
				
			if(temp=='(') {
				stack.push(temp);
			}else if(temp==')') {
				if(!stack.isEmpty()) {
					stack.pop();
				}else {
					isVPS=false;
					break;
				}
			}
		}
		
		if(!stack.isEmpty()) isVPS=false;
			
		if(isVPS) {
			System.out.println("올바른 괄호입니다.");
		}else {
			System.out.println("올바르지 않은 괄호입니다.");
		}
	}
}
