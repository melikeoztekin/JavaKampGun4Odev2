package homework2Day4;

public class StarbucksCustomerManager extends CustomerManager{
	
	private CustomerCheckService customerCheckService;
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService=customerCheckService;
	}
	
	@Override
	public void Save(Customer customer) {
		if (customerCheckService.CheckIfRealPerson(customer)) {
			System.out.println("Kullanýcý doðrulama iþlemi baþarýlý");
			System.out.println("Starbuck kullanýcýsý veri tabanýna kaydedildi : " + customer.getFirstName()+" "+customer.getLastName());
			return;
		}else {
			System.out.println("Kullanýcý doðrulama iþlemi baþarýsýz.");
		}
	}

}
