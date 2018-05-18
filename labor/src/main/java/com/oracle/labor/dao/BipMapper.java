package com.oracle.labor.dao;

import com.oracle.labor.po.Bip;
import com.oracle.labor.po.BipExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BipMapper {
    long countByExample(BipExample example);

    int deleteByExample(BipExample example);

    int deleteByPrimaryKey(String bipId);

    int insert(Bip record);

    int insertSelective(Bip record);

    List<Bip> selectByExample(BipExample example);

    Bip selectByPrimaryKey(String bipId);

    int updateByExampleSelective(@Param("record") Bip record, @Param("example") BipExample example);

    int updateByExample(@Param("record") Bip record, @Param("example") BipExample example);

    int updateByPrimaryKeySelective(Bip record);

    int updateByPrimaryKey(Bip record);
}