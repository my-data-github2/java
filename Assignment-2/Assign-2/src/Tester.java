import com.sunbeam.assignmments.Invoice;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Invoice invoice  = new Invoice();
		invoice.acceptData();
		System.out.println(invoice.calculateInvoice());
	}

}
