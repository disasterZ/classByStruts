package hj.Dao;

import hj.pojo.Person;

import java.sql.SQLException;

public interface StudentDao {
    /*根据id查找用户基本信息*/
    public Person loginStudent(Person student) throws SQLException;
}
