import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.Statement;


public class JDBCCrudExample {

    private static Connection connection=null;
    private static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) throws Exception {
    	
    	JDBCCrudExample stuDB = new JDBCCrudExample();
    	
    	
    	try {
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	
    	String dburl="jdbc:mysql://localhost:3306/shakthi";
    	String username="Shakthi";
    	String password="Shakthisri@26";
    	connection=DriverManager.getConnection(dburl,username,password);
    	
    	System.out.println("Enter choice: ");
    	System.out.println("1. Insert Record: ");
    	System.out.println("2. Select Record");
    	System.out.println("3. Update Record");
    	System.out.println("4. Delete Record");
    	int ch = Integer.parseInt(sc.nextLine());
    	switch(ch) {
    	case 1:
    		stuDB.insertRecord();
    		break;
    	case 2:
    		stuDB.selectRecord();
    		break;	
    	case 3:
    		stuDB.updateRecord();
    		break;
    	case 4:
    		stuDB.deleteRecord();
    		break;
    	default:
    		break;
    	
    	}
    	}catch(Exception e){
    		throw new Exception("Went wrong");
    	}
    	}
    
    private void insertRecord() throws SQLException{
    	//System.out.println("inside Insert");
    	String sql="insert into student(name) values(?)";
    	PreparedStatement preparedStatement = connection.prepareStatement(sql);
    	System.out.println("Enter name: ");
    	preparedStatement.setString(1, sc.nextLine());
    	int rows = preparedStatement.executeUpdate();
    	if(rows>0) {
    		System.out.println("Record Inserted Successfully");
    	}
    }
    
    public void selectRecord() throws SQLException{
    	System.out.println("Enter the Id to find ");
    	int n=Integer.parseInt(sc.nextLine());
    	String sql = "select * from student where id="+n;
    	Statement st = connection.createStatement();
    	ResultSet res=st.executeQuery(sql);
    	if(res.next()) {
    		
        		int id=res.getInt("id");
        		String name=res.getString("name");
        		System.out.println("ID is "+id);
        		System.out.println("Name is "+name);
        	}
    	
    	else {
    		System.out.println("No Record Found");
    	}
    	
    }
    
    private void updateRecord() throws SQLException {
    	System.out.println("Enter the Id to update ");
    	int n=Integer.parseInt(sc.nextLine());
    	System.out.println("Enter the new name ");
    	String nname=sc.nextLine();
    	String sql = "update student set name = ? where id ="+n;
    	PreparedStatement pst = connection.prepareStatement(sql);
    	pst.setString(1, nname);
    	
    	int rows=pst.executeUpdate();
    	if(rows>0) {
    		
        		System.out.println("Name is updated sucessfully");
        	}
    	
    	else {
    		System.out.println("No Record Found");
    	}
    	
    }
    
    public void deleteRecord() throws SQLException{
    	System.out.println("Enter the Id to delete ");
    	int n=Integer.parseInt(sc.nextLine());
    	String sql = "delete from student where id="+n;
    	Statement st = connection.createStatement();
    	//ResultSet res=st.executeQuery(sql);
    	int rows=st.executeUpdate(sql);
    	if(rows>0) {
    		
        		System.out.println("Record is deleted sucessfully");
        	}
    	
    	else {
    		System.out.println("No Record Found");
    	}
    	
    }
}
