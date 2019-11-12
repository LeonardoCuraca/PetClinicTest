package com.tecsup.petclinic.domain;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author jgomezm
 *
 */
@Repository
public interface OwnerRepository extends CrudRepository<Owner, Long> {

	// Fetch pets by name
	@Query(value = "SELECT * FROM owners WHERE first_name = ?1", nativeQuery = true)
	List<Owner> findByName(String name);

}
