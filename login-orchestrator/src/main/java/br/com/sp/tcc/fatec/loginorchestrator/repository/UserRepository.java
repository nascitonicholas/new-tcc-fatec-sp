package br.com.sp.tcc.fatec.loginorchestrator.repository;

import br.com.sp.tcc.fatec.loginorchestrator.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

	Optional<UserEntity> findByEmail(String username);
}
