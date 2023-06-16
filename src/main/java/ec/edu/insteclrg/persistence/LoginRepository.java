package ec.edu.insteclrg.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.insteclrg.domain.Login;

public interface LoginRepository extends JpaRepository<Login, Long>{
	Login findByUsuario(String usuario);
}
