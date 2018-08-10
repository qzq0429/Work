import java.util.ArrayList;
import java.util.Iterator;

public class Grammarcheck {
	   ArrayList<String> list = new ArrayList<String>();
	ArrayList<String> error = new ArrayList<String>();
	Words words;
	StateStack State_stack;
	SignStack Sign_stack;
   boolean iswrong = false;
   public Grammarcheck(ArrayList<Category> word){
	   words = new Words(word);
	   State_stack = new StateStack();
	   Sign_stack = new SignStack();
	   ArrayList<String> list = new ArrayList<String>();
   }
    public void check(){
    	while(!iswrong && words.IsIndex()){
    		

    		switch(State_stack.getlastest()){
    		case "0" :state0(words.get());break;
    		case "1" :state1();break;
    		case "2" :state2();break;
    		case "3" :state3(words.get()); break;
    		case "4" :state4(words.get());break;
    		case "5" :state5(words.get());break;
    		case "6" :state6(words.get());break;
    		case "7" :state7(words.get());break;
    		case "8" :state8(words.get());break;
    		case "9" :state9();break;
    		case "10" :state10();break;
    		case "11" :state11(words.get());break;
    		case "12" :state12(words.get());break;
    		case "13" :state13();break;
    		case "14" :state14();break;
    		case "15" :state15(words.get());break;
    		case "16" :state16();break;
    		case "17" :state17();break;
    		case "18" :state18();break;
    	}
    	
    		
    }
		for(int i = 0;i<error.size();i++)
			System.out.println(error.get(i));
    }
	public void state0(Sign e)
	{
	    switch (e.getSymbol())
	    {
	     
	    case "D":Sign_stack.add(e);State_stack.add("1");break;
	    case "(":Sign_stack.add(e);State_stack.add("6");break;
	    case "-":Sign_stack.add(e);State_stack.add("4");break;
	    case "C":Sign_stack.add(e);State_stack.add("2");break;
	    case "A":Sign_stack.add(e);State_stack.add("3");break;
	    case "E'":Sign_stack.add(e);State_stack.add("17");break;
	    case "B":Sign_stack.add(e);State_stack.add("5");break;
	    
	    default:iswrong=true;error.add("开头出现错误");
	    
	        }
	   
	
			
			      }
	
	public void state1()
	{
	   State_stack.remove();
	   ArrayList<Sign> array = Sign_stack.get(1);
	   Category cate=array.get(0).getCategory();
	   Sign_stack.remove();
	   String lasteststate = State_stack.getlastest();
	   lastedstatework(lasteststate,new Sign("C",cate));
		
	  
			
			   
	     }	
	public void state2()
	{
		 State_stack.remove();
		 ArrayList<Sign> array = Sign_stack.get(1);
		 Category cate=array.get(0).getCategory();
		   Sign_stack.remove();
		 String lasteststate = State_stack.getlastest();
		 
		 lastedstatework(lasteststate,new Sign("B",cate));

			
			   
	     }	
	
	public void state3(Sign e)
	{  if(e==null){
		
		 State_stack.remove();
		 ArrayList<Sign> array = Sign_stack.get(1);
		 Category cate=array.get(0).getCategory();
		 Sign_stack.remove();
		 String lasteststate = State_stack.getlastest();
		 lastedstatework(lasteststate,new Sign("E'",cate));
		 
		 return;
	}
	    switch (e.getSymbol())
	    {
	     
	    case "+":Sign_stack.add(e);State_stack.add("7");break;
	    case "-":Sign_stack.add(e);State_stack.add("8");break;
	    
	    default:
	    	 words.revoke();
	    	 State_stack.remove();
			 ArrayList<Sign> array = Sign_stack.get(1);
			 Category cate=array.get(0).getCategory();
			 Sign_stack.remove();
			 String lasteststate = State_stack.getlastest();
			 lastedstatework(lasteststate,new Sign("E'",cate));
			
	    
	        }
			
			   
	     }	
	public void state4(Sign e){
		 switch (e.getSymbol())
		    {
		     
		    case "D":Sign_stack.add(e);State_stack.add("1");break;
		    case "(":Sign_stack.add(e);State_stack.add("6");break;
		    case "-":Sign_stack.add(e);State_stack.add("4");break;
		    case "C":Sign_stack.add(e);State_stack.add("2");break;
		    case "B":Sign_stack.add(e);State_stack.add("18");break;
		    default:iswrong=true; error.add("-出现错误");
		    
		        }
	}
	public void state5 (Sign e){
		if(e==null)
	    	{State_stack.remove();
		    ArrayList<Sign> array = Sign_stack.get(1);
		    Category cate=array.get(0).getCategory();
		    Sign_stack.remove();
		    String lasteststate = State_stack.getlastest();
		    lastedstatework(lasteststate,new Sign("A",cate));
		    return;}
		  switch (e.getSymbol())
		    {
		    case "*":Sign_stack.add(e);State_stack.add("11");break;
		    case "/":Sign_stack.add(e);State_stack.add("12");break;
		    
		    default:	
		    	words.revoke();
		    	State_stack.remove();
			    ArrayList<Sign> array = Sign_stack.get(1);
			    Category cate=array.get(0).getCategory();
			    Sign_stack.remove();
			    String lasteststate = State_stack.getlastest();
			    lastedstatework(lasteststate,new Sign("A",cate));
		        }
		
	    }

		
		
	
	
	public void state6(Sign e){
		switch(e.getSymbol()){
	    case "D":Sign_stack.add(e);State_stack.add("1");break;
	    case "(":Sign_stack.add(e);State_stack.add("6");break;
	    case "-":Sign_stack.add(e);State_stack.add("4");break;
	    case "C":Sign_stack.add(e);State_stack.add("2");break;
	    case "A":Sign_stack.add(e);State_stack.add("3");break;
	    case "E'":Sign_stack.add(e);State_stack.add("15");break;
	    case "B":Sign_stack.add(e);State_stack.add("5");break;
	    default:iswrong=true; error.add("(符号后面出现错误");    
		}
		
	}
	public void state7(Sign e){
		
		switch(e.getSymbol()){
	    case "D":Sign_stack.add(e);State_stack.add("1");break;
	    case "(":Sign_stack.add(e);State_stack.add("6");break;
	    case "-":Sign_stack.add(e);State_stack.add("4");break;
	    case "C":Sign_stack.add(e);State_stack.add("2");break;
	    case "A":Sign_stack.add(e);State_stack.add("3");break;
	    case "E'":Sign_stack.add(e);State_stack.add("9");break;
	    case "B":Sign_stack.add(e);State_stack.add("5");break;
	    default:iswrong=true; error.add("+符号后面出现错误");   
		}
		
	}
	public void state8(Sign e){
		if(e==null){
		
			
		
		}
		switch(e.getSymbol()){
	    case "D":Sign_stack.add(e);State_stack.add("1");break;
	    case "(":Sign_stack.add(e);State_stack.add("6");break;
	    case "-":Sign_stack.add(e);State_stack.add("4");break;
	    case "C":Sign_stack.add(e);State_stack.add("2");break;
	    case "A":Sign_stack.add(e);State_stack.add("3");break;
	    case "E'":Sign_stack.add(e);State_stack.add("10");break;
	    case "B":Sign_stack.add(e);State_stack.add("5");break;
	    default:iswrong=true; error.add("-符号后面出现错误");   
		}
	}
	public void state9(){
		 Category cate;
		
		 
		 ArrayList<Sign> array = Sign_stack.get(3);
		 for(int i=2;i>=0;i--)
		 { State_stack.remove();
		   Sign_stack.remove();
		 }
		
		 Category num2=array.get(0).getCategory();
		 Category num1=array.get(2).getCategory(); 

		 if(num2.code==8||num1.code==8)
		 {
			cate= new Category(8,num2.str+"+"+num1.str,Double.parseDouble(num2.getValue())+Double.parseDouble(num1.getValue())+"","double");
               Double s=Double.parseDouble(num2.getValue())+Double.parseDouble(num1.getValue());
			String x="("+"+"+","+Double.parseDouble(num1.getValue())+","+Double.parseDouble(num2.getValue())+","+s+")";;
			System.out.println(x);
		 }else
		 {
			 cate= new Category(5,num2.str+"+"+num1.str,Integer.parseInt(num2.getValue())+Integer.parseInt(num1.getValue())+"","int");
	         int s = Integer.parseInt(num2.getValue())+Integer.parseInt(num1.getValue());
				String x="("+"+"+","+Integer.parseInt(num1.getValue())+","+Integer.parseInt(num2.getValue())+","+s+")";;
				System.out.println(x);
		 }
		
		 String lasteststate = State_stack.getlastest();
	     
		 lastedstatework(lasteststate,new Sign("E'",cate));
		
		
	}
	public void state10(){
		
		 Category cate;
	
		 ArrayList<Sign> array = Sign_stack.get(3);
		 for(int i=2;i>=0;i--)
		 { State_stack.remove();
		   Sign_stack.remove();
		 }
		 Category num2=array.get(0).getCategory();
		 Category num1=array.get(2).getCategory();
		 if(num2.code==8||num1.code==8)
		 {
			cate= new Category(8,num2.str+"+"+num1.str,Double.parseDouble(num2.getValue())-Double.parseDouble(num1.getValue())+"","double");
		     Double s=Double.parseDouble(num2.getValue())-Double.parseDouble(num1.getValue());
		 	String x="("+"-"+","+Double.parseDouble(num1.getValue())+","+Double.parseDouble(num2.getValue())+","+s+")";;
			System.out.println(x);
			 
		 }else
		 {
			 cate= new Category(5,num2.str+"+"+num1.str,Integer.parseInt(num2.getValue())-Integer.parseInt(num1.getValue())+"","int");
			    int s = Integer.parseInt(num2.getValue())-Integer.parseInt(num1.getValue());
							String x="("+"-"+","+Integer.parseInt(num1.getValue())+","+Integer.parseInt(num2.getValue())+","+s+")";;
				System.out.println(x);
		 }
		 String lasteststate = State_stack.getlastest();
		 lastedstatework(lasteststate,new Sign("E'",cate));
	}
	public void state11(Sign e){
		
		switch(e.getSymbol()){
	    case "D":Sign_stack.add(e);State_stack.add("1");break;
	    case "(":Sign_stack.add(e);State_stack.add("6");break;
	    case "-":Sign_stack.add(e);State_stack.add("4");break;
	    case "C":Sign_stack.add(e);State_stack.add("2");break;
	    case "A":Sign_stack.add(e);State_stack.add("13");break;
	    case "B":Sign_stack.add(e);State_stack.add("5");break;
	    default:iswrong=true; error.add("*符号后面出现错误");   
		}
	}
	public void state13(){
		
		 Category cate;

		 ArrayList<Sign> array = Sign_stack.get(3);
		 for(int i=2;i>=0;i--)
		 { State_stack.remove();
		   Sign_stack.remove();
		 }
		 Category num2=array.get(0).getCategory();
		 Category num1=array.get(2).getCategory();
		 if(num2.code==8||num1.code==8)
		 {
			cate= new Category(8,num2.str+"+"+num1.str,Double.parseDouble(num2.getValue())*Double.parseDouble(num1.getValue())+"","double");
		     Double s=Double.parseDouble(num2.getValue())*Double.parseDouble(num1.getValue());
		 	String x="("+"*"+","+Double.parseDouble(num1.getValue())+","+Double.parseDouble(num2.getValue())+","+s+")";;
	
			System.out.println(x);
			 
		 }else
		 {
			 cate= new Category(5,num2.str+"+"+num1.str,Integer.parseInt(num2.getValue())*Integer.parseInt(num1.getValue())+"","int");

			 int s = Integer.parseInt(num2.getValue())*Integer.parseInt(num1.getValue());
							String x="("+"*"+","+Integer.parseInt(num1.getValue())+","+Integer.parseInt(num2.getValue())+","+s+")";;
				System.out.println(x);
		 }
		 String lasteststate = State_stack.getlastest();
	
		 lastedstatework(lasteststate,new Sign("A",cate));
	}
	public void state12(Sign e){
		
		switch(e.getSymbol()){
	    case "D":Sign_stack.add(e);State_stack.add("1");break;
	    case "(":Sign_stack.add(e);State_stack.add("6");break;
	    case "-":Sign_stack.add(e);State_stack.add("4");break;
	    case "C":Sign_stack.add(e);State_stack.add("2");break;
	    case "A":Sign_stack.add(e);State_stack.add("14");break;
	    case "B":Sign_stack.add(e);State_stack.add("5");break;
	    default:iswrong=true; error.add("/符号后面出现错误");   
		}
	}
	public void state14(){
		
		 Category cate;
		
		 ArrayList<Sign> array = Sign_stack.get(3);
		 for(int i=2;i>=0;i--)
		 { State_stack.remove();
		   Sign_stack.remove();
		 }
		 Category num2=array.get(0).getCategory();
		 Category num1=array.get(2).getCategory();
		 if(num2.code==8||num1.code==8)
		 {
			cate= new Category(8,num2.str+"+"+num1.str,Double.parseDouble(num2.getValue())/Double.parseDouble(num1.getValue())+"","double");
		     Double s=Double.parseDouble(num2.getValue())/Double.parseDouble(num1.getValue());
		 	String x="("+"/"+","+Double.parseDouble(num1.getValue())+","+Double.parseDouble(num2.getValue())+","+s+")";;
			System.out.println(x);
			 
		 }else
		 {
			 cate= new Category(5,num2.str+"+"+num1.str,Integer.parseInt(num2.getValue())/Integer.parseInt(num1.getValue())+"","int");
			 int s = Integer.parseInt(num2.getValue())/Integer.parseInt(num1.getValue());
				String x="("+"/"+","+Integer.parseInt(num1.getValue())+","+Integer.parseInt(num2.getValue())+","+s+")";;
				System.out.println(x);
		 }
		 
		 String lasteststate = State_stack.getlastest();
		 lastedstatework(lasteststate,new Sign("A",cate));
	}
	public void state15(Sign e){
		switch(e.getSymbol()){
	    case ")":Sign_stack.add(e);State_stack.add("16");break;
	    default:iswrong=true; error.add("缺少（）不匹配");   
		
	         }
		}
		public void state16(){
			 Category cate;
			
			 ArrayList<Sign> array = Sign_stack.get(3);
			 	 
			 for(int i=2;i>=0;i--)
			 { State_stack.remove();
			   Sign_stack.remove();
			 }
			
			 cate=array.get(1).getCategory();
		
		
			 String lasteststate = State_stack.getlastest();
	
			 lastedstatework(lasteststate,new Sign("C",cate));
		   
			
		}
		public void state17(){
			if(words.index==words.size)
				
				{System.out.println("该句型是正确，且值是："+this.Sign_stack.list.get(0).category.value);words.index=words.size+1;}
			    
			else
				{System.out.println("该句型是不正确");iswrong=true; 
				Sign s  = words.getindex(words.index-1);
				
				while(words.index<words.size) 
				error.add(s.category.str+"后面"+words.get().getCategory().str+"存在问题");

				}
			
		}
		public void state18(){
			  State_stack.remove();
			  State_stack.remove();
			   ArrayList<Sign> array = Sign_stack.get(2);
			   Category cate=array.get(1).getCategory();
			   cate.value="-"+cate.value;
			   
			   Sign_stack.remove();
			   Sign_stack.remove();
			   String lasteststate = State_stack.getlastest();
			   lastedstatework(lasteststate,new Sign("B",cate));
			   String x="("+"@"+","+Double.parseDouble(cate.getValue())+","+"null"+")";
				System.out.println(x);
			
			
		}
	public void lastedstatework(String state,Sign s){
      
		switch(state){
	    
		case "0" :state0(s);break;
		case "1" :state1();break;
		case "2" :state2();break;
		case "3" :state3(s);break;
		case "4" :state4(s);break;
		case "5" :state5(s);break;
		case "6" :state6(s);break;
		case "7" :state7(s);break;
		case "8" :state8(s);break;
		case "9" :state9();break;
		case "10" :state10();break;
		case "11" :state11(s);break;
		case "12" :state12(s);break;
		case "13" :state13();break;
		case "14" :state14();break;
		case "15" :state15(s);break;
		case "16" :state16();break;
		case "17" :state17();break;
	}
	}
	public void publish(){
	for(int i=0;i<this.State_stack.stack.size();i++){
	System.out.print(State_stack.stack.get(i));
	
	}
	System.out.println();
	  
	for(int i=0;i<this.State_stack.stack.size()-1;i++){
		System.out.print(Sign_stack.list.get(i).symbol);
		
		}
	System.out.println();
  

 
    }
}

