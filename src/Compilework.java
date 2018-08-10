import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Compilework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scanner = new Scanner(System.in);
     String s;
     ArrayList<String> error = new ArrayList<String>();
     ArrayList<Category> word = new ArrayList<Category>();
     int row=1;
     
    Check a = new Check();

	  System.out.println("输入完数据后，两次回车结束输出回车输入结束");
	  s=scanner.nextLine();
  while(!a.isright(s)){
	  System.out.println("首行内容不能为空");
	  s=scanner.nextLine();
  }
	 a.getchar(s,row,error,word);	
	 row++;
	
	   s=scanner.nextLine();
	    while(a.isright(s)){
	    	 a.getchar(s,row,error,word);
	    	 row++;
	    	 s=scanner.nextLine();
	     } 
	    Iterator<Category> c_iter=word.iterator();

	     while(c_iter.hasNext()){
	    	 Category c=c_iter.next();
	    	 String str="("+c.getCode()+","+c.getStr()+","+c.getValue()+","+c.getType()+")";
	    	 System.out.println(str);
	  
	     }
	     if(error.size()!=0){
	     System.out.println("Error:");
	     Iterator<String> iter=error.iterator();
            while(iter.hasNext())
            {
    	        String str=(String)iter.next();
    	        System.out.println(str);
 
                    }System.out.println("词法出现错误，无法进行语法分析");
	                                     }else{
	                                    	 
	                                    	  	Grammarcheck g = new Grammarcheck(word);
	                                         	
	                                            g.check();
	                                    	 
	                                     }
        
   
     }


}

