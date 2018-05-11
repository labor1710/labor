package com.oracle.labor.dao;

import com.oracle.labor.po.ZjGrqzgzb;
import com.oracle.labor.po.ZjGrqzgzbExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZjGrqzgzbMapper {
    long countByExample(ZjGrqzgzbExample example);

    int deleteByExample(ZjGrqzgzbExample example);

    int deleteByPrimaryKey(String qzgzbh);

    int insert(ZjGrqzgzb record);

    int insertSelective(ZjGrqzgzb record);

    List<ZjGrqzgzb> selectByExample(ZjGrqzgzbExample example);

    ZjGrqzgzb selectByPrimaryKey(String qzgzbh);

    int updateByExampleSelective(@Param("record") ZjGrqzgzb record, @Param("example") ZjGrqzgzbExample example);

    int updateByExample(@Param("record") ZjGrqzgzb record, @Param("example") ZjGrqzgzbExample example);

    int updateByPrimaryKeySelective(ZjGrqzgzb record);

    int updateByPrimaryKey(ZjGrqzgzb record);
}