package com.inn;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.inn.myapp.base.abstracts.entity.AbstractEntity;

@Entity
@Table(name="User")
public class User extends AbstractEntity {

	
	@Column(name="id")
	@Id
	private Integer id;
}
