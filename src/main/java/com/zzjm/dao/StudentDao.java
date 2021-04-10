package com.zzjm.dao;

import com.zzjm.domain.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface StudentDao {
    /**
     * 一个简单类型的参数：
     * 简单类型：mybatis把java的基本数据类型和String都叫简单类型
     * 在mapper文件获取简单数据类型的以恶搞参数的值，使用#{任意字符}
     *
     */
    Student selectStudent(Integer id);
    //多个参数：命名空间，在形参定义前面加入@Param（“自定义参数名称”）
    List<Student> selectMulitParam(@Param("myname") String name,@Param("myage") Integer age);
    //多个参数，使用java对象作为方法的参数
    List<Student> selectStudentObject(Student student);
    /**
     *  多个参数，按位置传参
     *  mybatis.3.4之前，使用#{0}，#{1}
     *  mybatis.3.4之后使用#{arg0}，#{arg1}
     */
    List<Student> selectStudentIndex(String name,String email);
    List<Student> selectStudentMap(Map<String,Object> map);

}
