package com.example.schoolexam.modules.sys.user.entity;

import lombok.Data;

/**
* <p>
* 角色实体类
* </p>
*/
@Data
public class SysRole{

    private static final long serialVersionUID = 1L;
    
    /**
    * 角色ID
    */
    private String id;
    
    /**
    * 角色名称
    */
    private String roleName;
    
}
