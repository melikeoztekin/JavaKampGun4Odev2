package homework2Day4;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdaptor implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		KPSPublicSoap kpsPublic = new KPSPublicSoapProxy();
		try {
			  return kpsPublic.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),
					  customer.getFirstName(), 
					  customer.getLastName(), 
					  customer.getDateOfBirth());
		  } catch (Exception e) {
				System.out.println(e.getMessage());
				return false;
			}
	}

}