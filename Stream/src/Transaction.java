
public class Transaction {
	int year;
	int value;
	Trader trader;
	public Transaction(int year, int value, Trader trader) {
		super();
		this.year = year;
		this.value = value;
		this.trader = trader;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public Trader getTrader() {
		return trader;
	}
	public void setTrader(Trader trader) {
		this.trader = trader;
	}
	@Override
	public String toString() {
		return"Transaction[year="+year+", value="+value+",trader="+trader+"]";
	}
	
	

}
