package com.hermes.core.datasource.service;

import com.hermes.core.datasource.entity.DataSourceInfoEntity;

/**
 * @ClassName IDataSourceInfoService
 * @Description TODO
 * @Author MoreRoom
 * @Since 2018/7/27
 */
public interface IDataSourceInfoService {

    /**
     * 添加新的DataSource
     *
     * @param dataSourceInfoEntity
     * @return
     */
    public DataSourceInfoEntity insertNewDataSource(DataSourceInfoEntity dataSourceInfoEntity);


}
