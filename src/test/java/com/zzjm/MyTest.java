package com.zzjm;

import com.zzjm.dao.StudentDao;
import com.zzjm.domain.Student;
import org.apache.ibatis.session.SqlSession;
import com.zzjm.Utils.*;
import org.junit.Test;

import java.util.List;

public class MyTest {
    @Test
    public void ProxyselelctStudent() {
        /**
         * 使用mybatis的动态代理机制，使用sqlSession.getMapper(Dao接口)
         * getMapper能够获取dao接口对于实现类的对象。
         */
        SqlSession sqlSession=MyUtils.getSqlsession();
        StudentDao studentDao=sqlSession.getMapper(StudentDao.class);
        Student student=studentDao.selectStudent(1001);
        System.out.println(student);
    }
}
