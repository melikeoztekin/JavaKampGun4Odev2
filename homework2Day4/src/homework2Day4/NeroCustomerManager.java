package homework2Day4;

public class NeroCustomerManager extends CustomerManager{
	public void Save(Customer customer) {
			System.out.println("Nero kullanýcýsý veri tabanýna kaydedildi : " + customer.getFirstName()+" "+customer.getLastName());
	}
}
