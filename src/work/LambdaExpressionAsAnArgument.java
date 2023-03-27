package work;

interface operation{
	public int opt(int x, int y);
}
public class LambdaExpressionAsAnArgument {
	
	public static void result(int x, int y, operation obj) {
		System.out.println(obj.opt(x, y));
	}
	
	public static void main(String[] args) {
		result(10, 20, (a,b)->(a+b));
	}
}
