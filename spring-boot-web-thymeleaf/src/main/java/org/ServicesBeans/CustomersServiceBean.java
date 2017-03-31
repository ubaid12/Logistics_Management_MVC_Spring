package org.ServicesBeans;

import java.util.Collection;

import org.mkyong.repositories.customersrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mkyong.model.Customers;
@Service
public class CustomersServiceBean implements Ilogsticservice {

	@Autowired
	private customersrepo CustRepo;
	@Override
	public Collection<Customers> getall() {
		Collection <Customers> newcust =CustRepo.findAll(); 
		// TODO Auto-generated method stub
		return newcust;
	}

	@Override
	public Customers search(Long ID) {
		Customers cust =CustRepo.findOne(ID);
		// TODO Auto-generated method stub
		return cust;
	}

	@Override
	public Customers create(Customers newcust) {
		// TODO Auto-generated method stub
		if (newcust.getId()!=null)
		{
			return null;
		}
		Customers savecust = CustRepo.save(newcust);
		return savecust;
	}

	@Override
	public Customers update(Customers updatecust) {
		// TODO Auto-generated method stub
		Customers custpersist= search(updatecust.getId());
		if (custpersist==null)
		{
			return null;
		}
		Customers upcust = CustRepo.save(updatecust);
		return upcust;
	}

	@Override
	public void delete(Long ID) {
		// TODO Auto-generated method stub
		CustRepo.delete(ID);
	}

}
