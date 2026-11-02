package com.jing.ragaiback.pojo.dto;

import lombok.Data;

/**
 * @Title: PasswardDTO
 * @Author jing
 * @Package com.jing.rag.pojo.dto
 * @Date 2025/3/26 19:02
 * @description: 修改密码DTO
 */

@Data
public class PasswordDTO {
    private Integer id;
    private String oldPassword;
    private String newPassword;
    private String confirmPassword;
}
