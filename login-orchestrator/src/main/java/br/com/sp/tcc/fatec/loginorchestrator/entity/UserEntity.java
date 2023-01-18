package br.com.sp.tcc.fatec.loginorchestrator.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.OffsetDateTime;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class UserEntity {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	@Column(unique = true)
	private String email;
	private String password;
	@Enumerated(EnumType.STRING)
	private Type type;
	@CreatedDate
	private OffsetDateTime createdAt;

	public UserEntity(String name, String email, String password, Type type) {
		this.name = name;
		this.email = email;
		this.password = password;
		this.type = type;
	}

	public enum Type {
		ADMIN, CLIENT;
	}
}
