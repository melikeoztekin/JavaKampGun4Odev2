package homework2Day4;

public class Main {

	public static void main(String[] args) {
		
		Customer starbucks=new Customer(1, "Melike", "Öztekin", 1996, "151225641");
		Customer nero=new Customer(1, "Kadriye", "Çakmak", 1997, "12544265615");

		StarbucksCustomerManager starbucksCustomerManager = new StarbucksCustomerManager(new MernisServiceAdaptor());
		starbucksCustomerManager.Save(starbucks);
		
		NeroCustomerManager neroCustomerManager = new NeroCustomerManager();
		neroCustomerManager.Save(nero);
	}

}
