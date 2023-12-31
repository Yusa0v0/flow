package com.example.flow.dao;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.flow.entity.People;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * (People)表数据库访问层
 *
 * @author makejava
 * @since 2023-10-29 12:50:30
 */
@Mapper
public interface PeopleDao extends BaseMapper<People> {

/**
* 批量新增数据（MyBatis原生foreach方法）
*
* @param entities List<People> 实例对象列表
* @return 影响行数
*/
int insertBatch(@Param("entities") List<People> entities);

/**
* 批量新增或按主键更新数据（MyBatis原生foreach方法）
*
* @param entities List<People> 实例对象列表
* @return 影响行数
* @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
*/
int insertOrUpdateBatch(@Param("entities") List<People> entities);

}

