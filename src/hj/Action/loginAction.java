package hj.Action;


import com.opensymphony.xwork2.ActionSupport;
import hj.Dao.StudentDao;
import hj.Dao.StudentDaoImpl;
import hj.pojo.Person;
import org.apache.struts2.interceptor.ServletRequestAware;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

public class loginAction extends ActionSupport implements ServletRequestAware {
    private HttpServletRequest req;

    @Override
    public void setServletRequest(HttpServletRequest httpServletRequest) {
        this.req=httpServletRequest;
    }

    private String signIn() throws SQLException{
        String name=req.getParameter("number");
        String password=req.getParameter("pwd");
        String type=req.getParameter("occupation");
        Person person=new Person();
        person.setNumber(name);
        person.setPwd(password);
        String action = new String();
        if(type.equals("student"))
        {
            StudentDao studentDao=new StudentDaoImpl();
            Person student=studentDao.loginStudent(person);
            if(student!=null){
                action="index";
            }
            else if(student.getPwd()=="123456"){
                action="register";
            }
            else action="login";
        }
        else if(type.equals("teacher"))
        {

        }
        return action;
    }
}
