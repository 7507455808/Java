package com.spirnt1project.model;

import java.util.List;
import com.sprint1project.entity.Patients;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class DoctorDTO {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int did;
	
	@NotNull(message = "Please enter name")
	@Size(min = 4, message = "name should be atleast four character")
	private String dfname;
	
	@NotNull(message = "Please enter surname")
	@Size(min = 6, message = "name should be atleast six character")
	private String dlname;
	
	@NotNull(message = "Please enter email")
	@Email(message = "Please enter proper email id")
	private String demail;
	
	@NotNull(message = "Please enter phone number")
	@Size(min=10, max=12)
	private long dphone;
	
	private String daddr;
	
	private List<Patients> patients;

}
