package homework2Day4;

public class CustomerManager  implements CustomerService{

	@Override
	public void Save(Customer customer) {
		System.out.println("Veri taban�na kaydedildi : " + customer.getFirstName());
	}

}
