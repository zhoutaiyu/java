

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet; 
import java.sql.SQLException;
import java.sql.Statement;

public class Hello {
	
	private static String dbDriver="org.gjt.mm.mysql.Driver";
	private static String dbConnection="jdbc:mysql://localhost:3306/student";
	private static String user="root";
	private static String password="123";
	
	private static Connection conn=null;
	private static Statement stmt=null;
	private static ResultSet rs=null;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.显式地加载驱动程序
		try {
			Class.forName(dbDriver);
			System.out.println("成功加载数据库驱动。");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("没找到数据库驱动");
		}
		
		//2.连接数据库
		try {
			conn=DriverManager.getConnection(dbConnection, user, password);
			System.out.println("连接数据库成功。");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("无法连接数据库。");
		}
		
		//3.
		try {
			stmt=conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//4.执行查询操作(executeQuery)或更新操作(executeUpdate)
		


		try {
			String str="select * from student";
			
//			String strInsert="insert into student(ssn,name) values('1115','Tom')";
//			stmt.executeUpdate(strInsert);                //插入
//			String sqlupdate="update student set name='zhou' where ssn='1100'";
//		    stmt.executeUpdate(sqlupdate);                //修改
//		    String sqldelete="delete from student where name='Tom'";
//		    stmt.executeUpdate(sqldelete);                //删除
			rs=stmt.executeQuery(str);                    //查询
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("对数据表的操作出现错误");
		}

		//5.对结果集进行操作		
		try {
			while(rs.next()){
				System.out.println(rs.getString(1)+" "+rs.getString(2));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try{
			rs.close();
			stmt.close();
			conn.close();	
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		
	}
}

