package com.group5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.group5.Model.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address,Long>{
}
