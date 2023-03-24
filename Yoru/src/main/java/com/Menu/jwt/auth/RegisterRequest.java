package com.Menu.jwt.auth;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="menui")
public class RegisterRequest {
	
	 @Id
	 private String id;
	 private String name;
	 private String category;
	 private String discription;
	 private Long price;
	 private String ingredients;
}
