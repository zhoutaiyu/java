

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
		//1.��ʽ�ؼ�����������
		try {
			Class.forName(dbDriver);
			System.out.println("�ɹ��������ݿ�������");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("û�ҵ����ݿ�����");
		}
		
		//2.�������ݿ�
		try {
			conn=DriverManager.getConnection(dbConnection, user, password);
			System.out.println("�������ݿ�ɹ���");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("�޷��������ݿ⡣");
		}
		
		//3.
		try {
			stmt=conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//4.ִ�в�ѯ����(executeQuery)����²���(executeUpdate)
		


		try {
			String str="select * from student";
			
//			String strInsert="insert into student(ssn,name) values('1115','Tom')";
//			stmt.executeUpdate(strInsert);                //����
//			String sqlupdate="update student set name='zhou' where ssn='1100'";
//		    stmt.executeUpdate(sqlupdate);                //�޸�
//		    String sqldelete="delete from student where name='Tom'";
//		    stmt.executeUpdate(sqldelete);                //ɾ��
			rs=stmt.executeQuery(str);                    //��ѯ
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("�����ݱ�Ĳ������ִ���");
		}

		//5.�Խ�������в���		
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

