package com.jing.ragaiback.mapper;

import com.github.pagehelper.Page;
import com.jing.ragaiback.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jing.ragaiback.pojo.dto.UserPageQueryDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
* @author jing
* @description 针对表【user】的数据库操作Mapper
* @createDate 2025-02-14 21:05:04
* @Entity com.jing.rag.entity.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {

    @Select("select * from tb_user where user_name = #{userName}")
    User getByUsername(@Param("userName") String userName);

    Page<User> pageQuery(UserPageQueryDTO userPageQueryDTO);

    void updateUser(User user);
}




