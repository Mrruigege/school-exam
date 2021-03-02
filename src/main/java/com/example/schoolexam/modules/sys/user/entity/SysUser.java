package com.example.schoolexam.modules.sys.user.entity;

import lombok.Data;

import java.util.Date;

/**
* <p>
* 管理用户实体类
* </p>
*/
@Data
public class SysUser {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    private String id;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 真实姓名
     */
    private String realName;

    /**
     * 密码
     */
    private String password;

    /**
     * 密码盐
     */
    private String salt;

    /**
     * 角色列表
     */
    private String roleIds;

    /**
     * 部门ID
     */
    private String departId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 状态
     */
    private Integer state;
    
}
