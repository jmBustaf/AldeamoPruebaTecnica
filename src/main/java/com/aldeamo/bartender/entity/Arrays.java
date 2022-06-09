package com.aldeamo.bartender.entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ARRAYS")
public class Arrays 
{
	@Id
	private int id;
	
	@Column(nullable = false)
	private String input_array;
	
	
	public Arrays() {
		super();
	}

	public Arrays(int id, String input_array) {
		super();
		this.id = id;
		this.input_array = input_array;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getInput_array() {
		return input_array;
	}

	public void setInput_array(String input_array) {
		this.input_array = input_array;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, input_array);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Arrays other = (Arrays) obj;
		return id == other.id && Objects.equals(input_array, other.input_array);
	}

	@Override
	public String toString() {
		return "BarTender [id=" + id + ", input_array=" + input_array + "]";
	}
}