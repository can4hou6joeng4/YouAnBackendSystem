package com.youan.backendsystem.model.dto.perimission;

import lombok.Data;

import java.io.Serializable;

@Data
public class PermissionAddRequest implements Serializable {


    /**
     * 所属上级id
     */
    private Long pid;

    /**
     * 菜单名称
     */
    private String name;

    /**
     * 菜单状态
     * 0开启 1关闭
     */
    private Integer status;

    /**
     * 菜单类型
     */
    private Integer type;

    /**
     * 菜单图标
     */
    private String icon;

    /**
     * 菜单路径
     */
    private String path;

}
