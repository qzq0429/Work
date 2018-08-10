import java.util.ArrayList;

public class StateStack {
ArrayList<String> stack = new ArrayList<String>();
public StateStack(){
	
	stack.add("0");
	
}
public void remove(){
	  if(stack.size()>0)
	  stack.remove(stack.size()-1);
	  
}
public void add(String sign){
	  
	  stack.add(sign);
}
public String getlastest(){
	int index = stack.size()-1;
	String state=stack.get(index);
	
	return state;
}
public ArrayList<String> getStack() {
	return stack;
}
public void setStack(ArrayList<String> stack) {
	this.stack = stack;
}
}
