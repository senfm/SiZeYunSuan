import java.util.Scanner;

import javax.script.ScriptException;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws ScriptException{
		Scanner sc=new Scanner(System.in);
		System.out.println("��������Ŀ�ĸ���\n");
		int n=sc.nextInt();
		new Question(n);
	}
}
