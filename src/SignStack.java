import java.util.*;
public class SignStack {
	int index;
ArrayList<Sign> list = new ArrayList<Sign>();

public SignStack(){
	
	index=0;
}
public void remove(){
	if(index>0)
	{
		list.remove(list.size()-1);
	    index--;
	}
	
}
public void add(Sign sign){
	list.add(sign);
	index++;
}
public ArrayList<Sign> get(int need){
	ArrayList<Sign> array = new ArrayList<Sign>();
	for(int i=list.size()-need;i<list.size();i++){
		array.add(list.get(i));
		
	}
	return array;
	
}
}
