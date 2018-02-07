package com.lvzhang.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.lvzhang.entity.User;
@Mapper
public interface UserPMapper {
	@Select("select * from users where name = #{name}")
	User findByName(@Param("name") String name);
	
	@Update("insert into users (age,name) value(#{age},@{name})")
	int insert(@Param("name") String name,@Param("age") Integer age);
	
}
