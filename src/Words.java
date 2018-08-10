import java.util.ArrayList;

public class Words {
	int index=0;
	int size;
	ArrayList<Sign> words=new ArrayList<Sign>();
	public Words(ArrayList<Category> word){
		
		size = word.size();
		
		for(int i=0;i<size;i++){
			if(word.get(i).code==5||word.get(i).code==8)
				words.add(new Sign("D",word.get(i)));
			else if (word.get(i).code==1)
				words.add(new Sign("+",word.get(i)));
			else if (word.get(i).code==2)
				words.add(new Sign("-",word.get(i)));
			else if (word.get(i).code==3)
				words.add(new Sign("*",word.get(i)));
			else if (word.get(i).code==4)
				words.add(new Sign("/",word.get(i)));
			else if (word.get(i).code==6)
				words.add(new Sign("(",word.get(i)));
			else if (word.get(i).code==7)
				words.add(new Sign(")",word.get(i)));
		}
	}
	public boolean IsIndex(){
		if(index<=size)
			return true;
		else 
			return false;
		
	}
	public Sign getindex(int index){
		return words.get(index);
		
	}
	public Sign get(){
		if(index<=size-1)
			
		  return words.get(index++);
		else
			return null;
	}
	public void revoke(){
		
		index--;
	}
}
