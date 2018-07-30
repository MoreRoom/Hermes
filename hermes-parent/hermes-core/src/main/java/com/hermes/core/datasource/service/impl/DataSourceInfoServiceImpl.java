package com.hermes.core.datasource.service.impl;

import com.hermes.core.datasource.dao.IDataSourceInfoDao;
import com.hermes.core.datasource.entity.DataSourceInfoEntity;
import com.hermes.core.datasource.service.IDataSourceInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName IDataSourceInfoServiceImpl
 * @Description TODO
 * @Author MoreRoom
 * @Since 2018/7/27
 */
@Service
public class DataSourceInfoServiceImpl implements IDataSourceInfoService {

    @Resource
    private IDataSourceInfoDao dataSourceInfoDao;

    @Override
    public DataSourceInfoEntity insertNewDataSource(DataSourceInfoEntity dataSourceInfoEntity) {
        dataSourceInfoDao.insertNewDataSource(dataSourceInfoEntity);
        System.out.println(dataSourceInfoEntity.getId() + "");
        return dataSourceInfoEntity;
    }
}
