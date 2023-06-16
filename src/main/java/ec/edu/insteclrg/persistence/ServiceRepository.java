package ec.edu.insteclrg.persistence;

import org.springframework.stereotype.Repository;

import ec.edu.insteclrg.domain.Service;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ServiceRepository extends JpaRepository<Service, Long>{
	
}
