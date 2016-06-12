package DB;

import java.sql.*;

public class DB {

	public static void main(String[] args) throws Exception{
		Connection conn = null;
		Statement stat = null;
		
			Class.forName("java.sql.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/companydb?autoReconnect=true&useSSL=false", "root", "1234");
			stat = conn.createStatement();
			 
			ResultSet rs = stat.executeQuery("select p.pname, e.Lname, e.fname "
					+ "from employee e, employee m, department d, project p, works_on w "
					+ "where m.fname='Franklin' and m.lname='Wong' and m.ssn = d.Mgr_ssn and d.Dnumber=p.Dnum and e.Dno=p.Dnum "
					+ "and e.ssn =w.essn and p.pnumber = w.pno;");
			
			while(rs.next()){
				String pname = rs.getString("pname");
				String lname = rs.getString("lname");
				String fname = rs.getString("fname");
				
				System.out.println(pname + "\t" + fname + "    \t" + lname);
			}
			stat.close();
			conn.close();
	}
}