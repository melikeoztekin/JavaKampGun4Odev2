package homework2Day4;

public class NeroCustomerManager extends CustomerManager{
	public void Save(Customer customer) {
			System.out.println("Nero kullan�c�s� veri taban�na kaydedildi : " + customer.getFirstName()+" "+customer.getLastName());
	}
}
