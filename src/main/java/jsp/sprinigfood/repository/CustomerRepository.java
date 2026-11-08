package jsp.sprinigfood.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import jsp.sprinigfood.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
