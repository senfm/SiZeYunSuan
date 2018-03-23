import java.util.ArrayList;
import java.util.Random;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Question {
	int n;
	Random random;
	WriteToFile wtf;
	ArrayList<String> ar;
	ScriptEngineManager manager;
	ScriptEngine se;
	public Question(int n) throws ScriptException{
		this.n=n;
		init();
		ques();
	}
	private void init(){
		random=new Random();
		ar=new ArrayList<String>();
		manager = new ScriptEngineManager();
        se = manager.getEngineByName("js");
	}
	
	private void ques() throws ScriptException{
		String qu = null;
		for(int i=0;i<n;i++){
			qu="";
			int time=t();
			for(int j=0;j<time;j++){
				qu=qu+ti();
				if(j<time-1){
					qu=qu+type(ope());
				}
			}
			
			double result=Double.valueOf(se.eval(qu.toString()).toString()) ;
			if(result%1!=0 || result<0 || result>400){
				i--;
				continue;
			}
			ar.add(qu);			
		}
		wtf=new WriteToFile("result.txt", ar, n);
		
	}
	
	private String type(int n){
		if(n==0){
			return "+";
		}else if(n==1){
			return "-";
		}else if(n==2){
			return "*";
		}else{
			return "/";
		}
	}
	private int ti(){
		return random.nextInt(101);
	}
	
	private int t(){
		return random.nextInt(3)+3;
	}
	private int ope(){
		return random.nextInt(4);
	}
}
