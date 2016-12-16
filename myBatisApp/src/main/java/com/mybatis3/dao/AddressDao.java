package com.mybatis3.dao;

import com.mybatis3.domain.Address;
import com.mybatis3.util.MyBatisSqlSessionFactory;

public class AddressDao {
	public static final String namespace = "com.mybatis3.mappers.AddressMapper.";
	
	public Address findAddressById(int addrId){
		return MyBatisSqlSessionFactory.getSqlSession().selectOne(namespace+"findAddressById", addrId);
	}
}
