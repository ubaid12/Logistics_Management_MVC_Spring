package org.ServicesBeans;

import java.util.Collection;

import com.mkyong.model.Customers;

public interface Ilogsticservice {
 Collection<Customers> getall();
 Customers search(Long ID);
 Customers create(Customers newcust);
 Customers update(Customers updatecust);
 void delete (Long ID);
 
}
