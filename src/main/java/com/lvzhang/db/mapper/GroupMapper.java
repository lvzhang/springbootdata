package com.lvzhang.db.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.lvzhang.entity.Group;
@Mapper
public interface GroupMapper {
	@Select("select * from `group` where id = 1")
	Group findById();
	
	@Update("insert into `group` (project_id,user_id,type) value(#{project_id},#{user_id},#{type})")
	int insert(@Param("user_id") Integer user_id,@Param("project_id") Integer project_id,@Param("type") Integer type);
}
