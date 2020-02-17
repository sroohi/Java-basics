package customerServicePack;

import java.util.List;

public class TestClass {
	public static void main(String[] args) {

		customerService.CustomerInfo();

		CustomerFinder cf = new CustomerFinder();

		new customerService();

		System.out.println("List of all Customers  :");
		System.out.println("");

		cf.AllCustomers();
		for (Customer c1 : customerService.list.values()) {
			System.out.println(c1.toString());
		}
		System.out.println("---------");

		System.out.println("List of Names  :");
		System.out.println("");

		cf.getNamesOfAllCustomers();
		System.out.println("-------------");

		System.out.println("List of DOBs  :");
		System.out.println("");

		cf.getAllDOBs();
		System.out.println(cf.toString());
		System.out.println("-------------");

		System.out.println("List of Addresses  :");
		System.out.println("");

		cf.getAllAddresses();
		System.out.println("-------------");

		System.out.println("Selected IDs  :");
		System.out.println("");

		Customer c = cf.FindByID("100");
		Customer cc = cf.FindByID("101");
		Customer ccc = cf.FindByID("103");

		System.out.println(c.toString());
		System.out.println(cc.toString());
		System.out.println(ccc.toString());
		System.out.println("------------");

		System.out.println("Selected Names  :");
		System.out.println("");

		List<Customer> cname = cf.FindByName("Noah");
		List<Customer> ccname = cf.FindByName("Moe");

		System.out.println(cname.toString());
		System.out.println(ccname.toString());
		System.out.println("------------");

	}

}
