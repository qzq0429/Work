
public class Sign {
protected String symbol;
protected Category category;
public Sign(String symbol,Category category){
	this.symbol = symbol;
	this.category = category;
	
}
public String getSymbol() {
	return symbol;
}
public void setSymbol(String symbol) {
	this.symbol = symbol;
}
public Category getCategory() {
	return category;
}
public void setCategory(Category category) {
	this.category = category;
}

}
