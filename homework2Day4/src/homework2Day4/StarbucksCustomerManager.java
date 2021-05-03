package homework2Day4;

public class StarbucksCustomerManager extends CustomerManager{
	
	private CustomerCheckService customerCheckService;
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService=customerCheckService;
	}
	
	@Override
	public void Save(Customer customer) {
		if (customerCheckService.CheckIfRealPerson(customer)) {
			System.out.println("Kullan�c� do�rulama i�lemi ba�ar�l�");
			System.out.println("Starbuck kullan�c�s� veri taban�na kaydedildi : " + customer.getFirstName()+" "+customer.getLastName());
			return;
		}else {
			System.out.println("Kullan�c� do�rulama i�lemi ba�ar�s�z.");
		}
	}

}
