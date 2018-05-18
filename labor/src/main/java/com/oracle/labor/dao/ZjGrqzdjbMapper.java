package com.oracle.labor.dao;

import com.oracle.labor.po.ZjGrqzdjb;
import com.oracle.labor.po.ZjGrqzdjbExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZjGrqzdjbMapper {
    long countByExample(ZjGrqzdjbExample example);

    int deleteByExample(ZjGrqzdjbExample example);

    int deleteByPrimaryKey(String qzbh);

    int insert(ZjGrqzdjb record);

    int insertSelective(ZjGrqzdjb record);

    List<ZjGrqzdjb> selectByExample(ZjGrqzdjbExample example);

    ZjGrqzdjb selectByPrimaryKey(String qzbh);

    int updateByExampleSelective(@Param("record") ZjGrqzdjb record, @Param("example") ZjGrqzdjbExample example);

    int updateByExample(@Param("record") ZjGrqzdjb record, @Param("example") ZjGrqzdjbExample example);

    int updateByPrimaryKeySelective(ZjGrqzdjb record);

    int updateByPrimaryKey(ZjGrqzdjb record);
}