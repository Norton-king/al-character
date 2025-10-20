package com.al.model.enums;

import cn.hutool.core.util.ObjUtil;
import lombok.Getter;

@Getter
public enum UserRoleEnums {
    USER("user", "普通用户"),
    ADMIN("admin", "管理员");
    private final String text;
    private final String value;

    UserRoleEnums(String value, String text) {
        this.value = value;
        this.text = text;
    }
    /**
     * 根据value获取枚举
     * @param value
     * @return
     */
    public static UserRoleEnums getEnumByValue(String value) {
        //判断传入的value是否为空
        if(ObjUtil.isEmpty( value)){
            return null;
        }
        for(UserRoleEnums userRoleEnums : UserRoleEnums.values()){
            if(userRoleEnums.value.equals(value)){
                return userRoleEnums;
            }
        }
        return null;
    }
}
