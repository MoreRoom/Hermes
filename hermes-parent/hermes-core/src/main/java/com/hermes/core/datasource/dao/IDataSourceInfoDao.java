package com.hermes.core.datasource.dao;

import com.hermes.core.datasource.entity.DataSourceInfoEntity;

/**
 * @ClassName IDataSourceInfoDao
 * @Description 数据源持久层
 * @Author MoreRoom
 * @Since 2018/7/27
 */
public interface IDataSourceInfoDao {

    public int insertNewDataSource(DataSourceInfoEntity entity);

}
