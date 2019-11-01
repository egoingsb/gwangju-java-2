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
class AccountAddPrint extends Account{
	public void print() {
		System.out.println("Value Of Supply : "+valueOfSupply);
		System.out.println("VAT  : "+getVAT());
		System.out.println("Total  : "+ getTotal());
	}
}
public class MyBizApp {
	public static void main(String[] args) {
		AccountAddPrint a1 = new AccountAddPrint();
		a1.valueOfSupply = 10000.0;
		
		AccountAddPrint a2 = new AccountAddPrint();
		a2.valueOfSupply = 20000.0;
		
		a1.print();
		a2.print();
	}
}