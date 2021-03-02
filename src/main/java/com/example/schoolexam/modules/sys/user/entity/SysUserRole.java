package com.example.schoolexam.modules.sys.user.entity;

import lombok.Data;

/**
* <p>
* 用户角色实体类
* </p>
*
* @author 聪明笨狗
* @since 2020-04-13 16:57
*/
@Data

public class SysUserRole {

    private static final long serialVersionUID = 1L;
    
    /**
    * ID
    */
    private String id;
    
    /**
    * 用户ID
    */
    private String userId;
    
    /**
    * 角色ID
    */
    private String roleId;
    
}
