package com.Emp;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EmployeeHibernate {
	

		@Id
		private int id;
		private String fname;
		private String lname;
		private int dob;
		private String email;
		private String dept;
		private int salary;
		
		public EmployeeHibernate() {
			
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getFname() {
			return fname;
		}

		public void setFname(String fname) {
			this.fname = fname;
		}

		public String getLname() {
			return lname;
		}

		public void setLname(String lname) {
			this.lname = lname;
		}

		public int getDob() {
			return dob;
		}

		public void setDob(int dob) {
			this.dob = dob;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getDept() {
			return dept;
		}

		public void setDept(String dept) {
			this.dept = dept;
		}

		public int getSalary() {
			return salary;
		}

		public void setSalary(int salary) {
			this.salary = salary;
		}

		@Override
		public String toString() {
			return "EmployeeHibernate [id=" + id + ", fname=" + fname + ", lname=" + lname + ", dob=" + dob + ", email="
					+ email + ", dept=" + dept + ", salary=" + salary + "]";
		}
		
		
		
		
		
}
