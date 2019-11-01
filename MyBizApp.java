// java MyBizApp 10000
class Account{
	public double valueOfSupply = 0;
	public static double vatRate = 0.1;
	public double getVAT() {
		return valueOfSupply*vatRate;
	}
	public double getTotal() {
		return valueOfSupply+getVAT();
	}
}
public class MyBizApp {
	public static void main(String[] args) {
		Account a1 = new Account();
		a1.valueOfSupply = 10000.0;
		
		Account a2 = new Account();
		a2.valueOfSupply = 20000.0;
		
		System.out.println("Value Of Supply a1 : "+a1.valueOfSupply);
		System.out.println("Value Of Supply a2 : "+a2.valueOfSupply);
		System.out.println("VAT  a1 : "+a1.getVAT());
		System.out.println("VAT  a2 : "+a2.getVAT());
		System.out.println("Total  a1 : "+ a1.getTotal());
		System.out.println("Total  a2 : "+ a2.getTotal());
	}
}