import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
public class WriteToFile {
	public WriteToFile(String path,ArrayList<String> al,int n){
		ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine se = manager.getEngineByName("js");
		try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(path));
            bw.write("201571030321\n");
            bw.write(n+"\n");
            for(int i=0;i<al.size();i++){
            	al.get(i);
            	bw.write(al.get(i).toString()+"="+ se.eval(al.get(i).toString()));
            	bw.write("\n");
            }
              
            bw.close();
        } catch (IOException | ScriptException e1) {
            e1.printStackTrace();
        }
	}
}
