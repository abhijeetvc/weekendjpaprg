package com.weekendjpa.weekendjpaprg.respository;

import com.weekendjpa.weekendjpaprg.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Map;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {

    @Query(value = "select c.id,c.name,p.product_name from customer c, product p, cust_prod cp where p.id=cp.prod_id and p.id=?",nativeQuery = true)
    List<Map<String,Object>> getCustomerData(Integer productId);
}
