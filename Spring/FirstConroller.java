package com.shakthi.SpringbootDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mysql.jdbc.Statement;

@RestController
public class FirstConroller {
	@RequestMapping("name")
	String getName(){
		return "Shakthi";
	}
	@RequestMapping("data")
	int getNum(){
		return 8081;
	}
	
	@RequestMapping("ur")
	List<String> getdata() throws Exception {
		//jdbc code
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shakthi","Shakthi","Shakthisri@26");
		Statement st = (Statement) con.createStatement();
		String query ="select * from student";
		ResultSet rs=st.executeQuery(query);
		List<String> list =new ArrayList<>();
		while(rs.next()) {
			String name =rs.getString("name");
			list.add(name);
		}
		return list;
	}
	}
