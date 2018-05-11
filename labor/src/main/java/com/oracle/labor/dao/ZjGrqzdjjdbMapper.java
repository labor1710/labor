package com.oracle.labor.dao;

import com.oracle.labor.po.ZjGrqzdjjdb;
import com.oracle.labor.po.ZjGrqzdjjdbExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZjGrqzdjjdbMapper {
    long countByExample(ZjGrqzdjjdbExample example);

    int deleteByExample(ZjGrqzdjjdbExample example);

    int deleteByPrimaryKey(String grdjjdbh);

    int insert(ZjGrqzdjjdb record);

    int insertSelective(ZjGrqzdjjdb record);

    List<ZjGrqzdjjdb> selectByExample(ZjGrqzdjjdbExample example);

    ZjGrqzdjjdb selectByPrimaryKey(String grdjjdbh);

    int updateByExampleSelective(@Param("record") ZjGrqzdjjdb record, @Param("example") ZjGrqzdjjdbExample example);

    int updateByExample(@Param("record") ZjGrqzdjjdb record, @Param("example") ZjGrqzdjjdbExample example);

    int updateByPrimaryKeySelective(ZjGrqzdjjdb record);

    int updateByPrimaryKey(ZjGrqzdjjdb record);
}