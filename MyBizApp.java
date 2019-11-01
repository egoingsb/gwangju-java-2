// java MyBizApp 10000
public class MyBizApp {
	public static double valueOfSupply = Double.parseDouble(args[0]);
	public static double vatRate = 0.1;
	public static double getVAT() {
		return valueOfSupply*vatRate;
	}
	public static double getTotal() {
		return valueOfSupply*getVAT();
	}
	public static void main(String[] args) {
		System.out.println("Value Of Supply : "+valueOfSupply);
		System.out.println("VAT : "+getVAT());
		System.out.println("Total : "+ getTotal());
	}
}