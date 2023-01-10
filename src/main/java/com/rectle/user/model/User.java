package com.rectle.user.model;

import com.rectle.model.model.Model;
import com.rectle.project.model.Project;
import com.rectle.score.model.Score;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
@Table(name = "user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String provider;

	private String password;

	private String email;

	@OneToMany(mappedBy = "user")
	private Set<Project> projects = new HashSet<>();

	@OneToMany(mappedBy = "user")
	private Set<Model> models =  new HashSet<>();

	@OneToMany(mappedBy = "user")
	private Set<Score> scores =  new HashSet<>();
}
