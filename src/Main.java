import java.util.Scanner;

import javax.script.ScriptException;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws ScriptException{
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入题目的个数\n");
		int n=sc.nextInt();
		new Question(n);
	}
}
