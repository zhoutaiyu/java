package linkDatebase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {
	//����һ������mysql������String
	private static String driverName="com.mysql.jdbc.Driver";
	//�������ݿ����Ӵ�����������IP��ַ�Ͷ˿�,���ݿ�����
	private static String URL="jdbc:mysql://localhost:3306/student";
	//��ʼ���û���������
	private static String user="root";
	private static String password="123";
	//����һ���ӿ�,ע����һ���Ǵ�д
	private static Connection con=null;
	
	//��̬����飬����ʱ�ᱻִ��
	static {
		loadDriver();
	}
	
	//��������
	private static void loadDriver(){
		try {
			Class.forName(driverName);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			//�쳣��������
			System.out.println("��������ʧ��");
		}
	}
	
	//�������ݿ�
	public static Connection getConnection(){
		if(null==con){
			try {
				con=DriverManager.getConnection(URL,user,password);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("���ݿ�����ʧ��");
				}
		}
		return con;
	}
	
	//�ر����ݿ�
	public static void close(){
		try {
			if(con!=null&&!con.isClosed())
				con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("�ر�ʧ��");
		}
	}
	
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		//���ü�������
		
		//�����������ݿⷽ��
		Connection con=Test.getConnection();
		//����������
		Statement stmt = con.createStatement();
		//��������sql�Ľ����
		ResultSet rs=stmt.executeQuery("select * from student");
		//�ж�rs�Ƿ�Ϊ��
		while(rs.next())
			//�����Ӧ�±���ֶΣ���1��ʼ
			System.out.println(rs.getString(1)+" "+rs.getString(2));
	}

}
