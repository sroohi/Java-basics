package customerServicePack;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class customerService {
	public static Map<String, Customer> list = new HashMap<String, Customer>();

	public static void CustomerInfo() {
		Customer c = new Customer();
		c.setName("Noah");
		c.setId(520);
		c.setAge(25);
		c.setAddress("45 west road");
		Date sdf = new Date(1995 - 10 - 07);
		c.setDob(sdf);

		Customer c1 = new Customer();
		c1.setName("Moe");
		c1.setId(588);
		c1.setAge(30);
		c1.setAddress("52020 Candidate road");
		Date sdf1 = new Date(1991 - 11 - 28);
		c1.setDob(sdf1);

		Customer c2 = new Customer();
		c2.setName("Joe");
		c2.setId(8080);
		c2.setAge(33);
		c2.setAddress("2020 Heatherton ln");
		Date sdf2 = new Date(1998 - 8 - 15);
		c2.setDob(sdf2);

		Customer c3 = new Customer();
		c3.setName("Noah");
		c3.setId(1040);
		c3.setAge(28);
		c3.setAddress("4800 cornerside blvd");
		Date sdf3 = new Date(1985 - 10 - 07);
		c3.setDob(sdf3);

		Customer c4 = new Customer();
		c4.setName("Jack");
		c4.setId(1000);
		c4.setAge(48);
		c4.setAddress("6545 Kooka St.");
		Date sdf4 = new Date(1976 - 10 - 19);
		c4.setDob(sdf4);

		Customer c5 = new Customer();
		c5.setName("Moe");
		c5.setId(1020);
		c5.setAge(50);
		c5.setAddress("46664 Kooka rd.");
		Date sdf5 = new Date(1966 - 6 - 16);
		c5.setDob(sdf5);

		Customer c6 = new Customer();
		c6.setName("Susan");
		c6.setId(560);
		c6.setAge(33);
		c6.setAddress("8520 Raglan rd.");
		Date sdf6 = new Date(1955 - 2 - 07);
		c6.setDob(sdf6);

		Customer c7 = new Customer();
		c7.setName("Rachel");
		c7.setId(7979);
		c7.setAge(26);
		c7.setAddress("Greensboro st");
		Date sdf7 = new Date(1962 - 8 - 07);
		c7.setDob(sdf7);

		Customer c8 = new Customer();
		c8.setName("Jack");
		c8.setId(5232);
		c8.setAge(60);
		c8.setAddress("Rose st,Paris");
		Date sdf8 = new Date(1930 - 10 - 07);
		c8.setDob(sdf8);

		list.put("100", c);
		list.put("101", c1);
		list.put("102", c2);
		list.put("103", c3);
		list.put("104", c4);
		list.put("105", c5);
		list.put("106", c6);
		list.put("107", c7);
		list.put("108", c8);

	}

}
