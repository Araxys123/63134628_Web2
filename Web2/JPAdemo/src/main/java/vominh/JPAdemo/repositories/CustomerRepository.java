


package vominh.JPAdemo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vominh.JPAdemo.models.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>  {
 
}
