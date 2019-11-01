public class MyBizApp {
	public static void main(String[] args) {
		double valueOfSupply = 10000.0;
		double vatRate = 0.1;
		double vat = 10000*vatRate;
		double total = valueOfSupply+vat;
		System.out.println("Value Of Supply : "+valueOfSupply);
		System.out.println("VAT : "+vat);
		System.out.println("Total : "+ total );
	}
}