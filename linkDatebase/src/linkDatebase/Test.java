package linkDatebase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {
	//定义一个加载mysql驱动的String
	private static String driverName="com.mysql.jdbc.Driver";
	//定义数据库连接串，包括主机IP地址和端口,数据库名字
	private static String URL="jdbc:mysql://localhost:3306/student";
	//初始化用户名和密码
	private static String user="root";
	private static String password="123";
	//定义一个接口,注意类一定是大写
	private static Connection con=null;
	
	//静态代码块，运行时会被执行
	static {
		loadDriver();
	}
	
	//加载驱动
	private static void loadDriver(){
		try {
			Class.forName(driverName);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			//异常处理明晰
			System.out.println("驱动加载失败");
		}
	}
	
	//连接数据库
	public static Connection getConnection(){
		if(null==con){
			try {
				con=DriverManager.getConnection(URL,user,password);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("数据库连接失败");
				}
		}
		return con;
	}
	
	//关闭数据库
	public static void close(){
		try {
			if(con!=null&&!con.isClosed())
				con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("关闭失败");
		}
	}
	
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		//调用加载驱动
		
		//调用连接数据库方法
		Connection con=Test.getConnection();
		//创建语句对象
		Statement stmt = con.createStatement();
		//创建接收sql的结果集
		ResultSet rs=stmt.executeQuery("select * from student");
		//判断rs是否为空
		while(rs.next())
			//输出对应下标的字段，从1开始
			System.out.println(rs.getString(1)+" "+rs.getString(2));
	}

}
