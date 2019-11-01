// java MyBizApp 10000
class Account{
	public static double valueOfSupply = 0;
	public static double vatRate = 0.1;
	public static double getVAT() {
		return valueOfSupply*vatRate;
	}
	public static double getTotal() {
		return valueOfSupply+getVAT();
	}
}
public class MyBizApp {
	public static void main(String[] args) {
		Account.valueOfSupply = Double.parseDouble(args[0]);
		System.out.println("Value Of Supply : "+Account.valueOfSupply);
		System.out.println("VAT : "+Account.getVAT());
		System.out.println("Total : "+ Account.getTotal());
	}
}