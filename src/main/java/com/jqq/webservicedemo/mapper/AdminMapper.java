package com.jqq.webservicedemo.mapper;

import com.jqq.webservicedemo.entity.Admin;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface AdminMapper {

    /**
     * @param adminList
     * @return 插入成功的记录条数
     */
    Integer initAdmins(@Param("adminList") List adminList);

    List<Admin> selectAllAdmin();

    Admin selectAdmin(@Param("adminId") int adminId, @Param("password") String password);

    Admin selectAdminById(@Param("adminId") int adminId);

    Integer deleteAllAdmin();
}
