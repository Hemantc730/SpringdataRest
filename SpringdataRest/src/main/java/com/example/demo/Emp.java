package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="RestTable")
public class Emp {
	@Id
		private int id;
		private String name;
		private String tech;
		private String Address;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getTech() {
			return tech;
		}
		public void setTech(String tech) {
			this.tech = tech;
		}
		public String getAddress() {
			return Address;
		}
		public void setAddress(String address) {
			Address = address;
		}
		@Override
		public String toString() {
			return "Emp [id=" + id + ", name=" + name + ", tech=" + tech + ", Address=" + Address + "]";
		}
		
}
