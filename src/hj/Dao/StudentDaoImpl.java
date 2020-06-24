package hj.Dao;

import hj.Conn.SqlSeverConnect;
import hj.pojo.Person;


import javax.sql.DataSource;
import java.sql.*;

public class StudentDaoImpl extends SqlSeverConnect implements StudentDao {
    @Override
    public Person loginStudent(Person student) throws SQLException{
       String sql ="select stu_no,stu_name,stu_pwd,class_no,depart_no from student where stu_no=? and stu_pwd=?";
       Person person=new Person();
       PreparedStatement preparedStatement=null;
       ResultSet rs=null;
       Connection connection=getConnection();
       preparedStatement=connection.prepareStatement(sql);
       rs=preparedStatement.executeQuery();
       while(rs.next()){
           person.setNumber(rs.getString("stu_no"));
           person.setName(rs.getString("stu_name"));
           person.setPwd(rs.getString("stu_pwd"));
           person.setClassNo(rs.getInt("class_no"));
           person.setDepartNo(rs.getInt("depart_no"));
       }
       return person;
    }

}
