package hj.Conn;

import java.sql.*;

public class SqlSeverConnect {
    final static String url="jdbc:sqlserver://localhost:1433;DatabaseName=classCheck";
    static {
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    public Connection getConnection() throws SQLException{
        return DriverManager.getConnection(url,"sa","123456");
    }

    public ResultSet executeQuery(String sql) throws SQLException {
        Connection connection = getConnection();
        Statement statement=connection.createStatement();
        return statement.executeQuery(sql);
    }
    public void closeConnection(){
        try {
            Connection connection= getConnection();
            if(connection!=null&&!connection.isClosed())
                connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
