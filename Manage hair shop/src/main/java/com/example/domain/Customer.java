package com.example.domain;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// 고객 (이름, 휴대폰 번호, 헤어 타입)을 기본 값으로 설정한다. 
@Entity
@Table(name = "customers")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
	
	@Id
	@GeneratedValue
	private Integer id;
	@Column(nullable = false)
	private String name;
	@Column(nullable = false)
	private String phone_number;
	@Column(nullable = false)
	private String hair_type;
}
