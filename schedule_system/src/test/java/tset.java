
import com.shedule.dao.SysUserDao;
import com.shedule.dao.impl.SysUserDaoImpl;
import com.shedule.pojo.SysUser;

import org.junit.Test;

import java.util.List;


/**
 * @version 1.0
 */
public class tset {
    public static void main(String[] args) {
//
        SysUserDao sysUserDao = new SysUserDaoImpl();
       int rows = sysUserDao.addSysUser(new SysUser(null,"林是006", "123"));
        System.out.println(rows);
    }

}
