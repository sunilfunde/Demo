package com.cpc.formulation.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;
import org.springframework.security.core.GrantedAuthority;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString
@Table(name="role")
public class Role implements GrantedAuthority {
	
	@Id
	private Integer id;
	private String nmae;
	@Override
	public String getAuthority() {
		// TODO Auto-generated method stub
		return null;
	}

}

	