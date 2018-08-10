import java.util.ArrayList;

public class Check {
	
	public  boolean isright(String s){
		if(s.equals("")){
			
			return false;
		}
		else{
			
			return true;
		}
		
	}
	
	public void getchar(String s,int row,ArrayList<String> error,ArrayList<Category> word){
		 Compilework a = new Compilework();
		int size = s.length();
		int index=0;
		
		
		while(index<=size-1){
			if(isnumber(s.charAt(index)))
			{  
			   int length=0;
				index++;
				
				while(isout(index,size-1)&&isnumber(s.charAt(index))){
				
					index++;
					length++;
				}
				if(isout(index,size-1)&&ispoint(s.charAt(index)))
				{
					index++;
					length++;
					while(isout(index,size-1)&&isnumber(s.charAt(index))){
						index++;
						length++;
					}
					String str = s.substring(index-length-1, index);
					double num=Double.parseDouble(str);
					word.add(new Category(8,str,num+"","double"));

					continue;
				}
					
					else{
						String str = s.substring(index-length-1, index);
						int num=Integer.parseInt(str);
						word.add(new Category(5,str,num+"","int"));
		
				continue;
					}
			} else if(s.charAt(index)=='+'){
				word.add(new Category(1,"+","NULL","NULL"));
	
				index++;
				continue;
			}else if(s.charAt(index)=='-'){
				word.add(new Category(2,"-","NULL","NULL"));
	
				index++;
				continue;
			}else if(s.charAt(index)=='*'){
				word.add(new Category(3,"*","NULL","NULL"));
			
				index++;
				continue;
			}else if(s.charAt(index)=='/'){
				word.add(new Category(4,"/","NULL","NULL"));
	
				index++;
				continue;
			}else if(s.charAt(index)==')'){
				word.add(new Category(7,")","NULL","NULL"));

				index++;
				continue;
			}else if(s.charAt(index)=='('){
				word.add(new Category(6,"(","NULL","NULL"));
	
				index++;
				continue;
			}else {
				if(word.size()==0){
			String str =" Error"+(error.size()+1)+":第"+row+"行"+"开头"+"存在非法字符“"+s.charAt(index)+"”";
			error.add(str);
			index++;
		
			continue;
				}
				Category category= word.get(word.size()-1);
				String words=category.getStr();
				String str =" Error"+(error.size()+1)+":第"+row+"行"+words+"后面存在非法字符“"+s.charAt(index)+"”";
				error.add(str);
		
				index++;
				continue;
				
			}
		
			
		}
	}
	public boolean ispoint(char ch){
		if(ch=='.') return true;
		else return false;
		
		
	}
	public boolean isnumber(char ch){
		if(ch=='1'||ch=='2'||ch=='3'
			||ch=='4'||ch=='5'||ch=='6'||
			ch=='7'||ch=='8'||ch=='9'||
			ch=='0')
			return true;
		else 
			return false;
		
	}
	public boolean isout(int a,int b){
		
		if(a>b)return false;
		else return true;
		
	}
}
