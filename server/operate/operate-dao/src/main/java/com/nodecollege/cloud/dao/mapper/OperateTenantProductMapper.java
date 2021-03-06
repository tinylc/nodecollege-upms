package com.nodecollege.cloud.dao.mapper;

import com.nodecollege.cloud.common.model.po.OperateTenantProduct;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 版权：节点学院
 * <p>
 * OperateTenantProductMapper
 *
 * @author LC
 * @date 2020-10-19 10:20:04
 */
@Mapper
@Component
public interface OperateTenantProductMapper {
    /**
     * 根据主键删除数据
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 插入数据库记录（建议使用）
     */
    int insertSelective(OperateTenantProduct record);

    /**
     * 根据主键id查询
     */
    OperateTenantProduct selectByPrimaryKey(Long id);

    /**
     * 修改数据(推荐使用)
     */
    int updateByPrimaryKeySelective(OperateTenantProduct record);

    List<OperateTenantProduct> selectList(OperateTenantProduct query);
}