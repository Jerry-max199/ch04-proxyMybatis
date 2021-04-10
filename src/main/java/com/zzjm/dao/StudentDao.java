package com.zzjm.dao;

import com.zzjm.domain.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

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
}
