package homework2Day4;

public class NeroCustomerManager extends CustomerManager{
	public void Save(Customer customer) {
			System.out.println("Nero kullanıcısı veri tabanına kaydedildi : " + customer.getFirstName()+" "+customer.getLastName());
	}
}
