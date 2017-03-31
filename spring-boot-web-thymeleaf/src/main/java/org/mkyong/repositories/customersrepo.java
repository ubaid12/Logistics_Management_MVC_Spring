package org.mkyong.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mkyong.model.Customers;
@Repository
public interface customersrepo extends JpaRepository<Customers, Long> {

}
