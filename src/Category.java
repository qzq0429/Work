
public class Category {
    protected int code;
    protected String str;
    protected String value;
    protected String type;
    Category(){}
    Category(int _code,String _str,String _value,String _type){
    	code=_code;
    	str=_str;
    	value=_value;
    	type=_type;
    	
    }
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
    
}
