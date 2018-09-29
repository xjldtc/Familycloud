package com.xjldtc.user.dao.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.xjldtc.user.entity.po.UsertLoginInfoPO;

@Mapper
public interface UserMapper {
	
	@Select(value="select * from user_login_info where user_id = #{userId}")
	@Results({
        @Result(property = "id",  column = "ID"),
        @Result(property = "userId",  column = "USER_ID")
    })
	UsertLoginInfoPO queryLoginInfoByUserId(long userId);
	
}
