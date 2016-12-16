package com.mybatis3.dao;

public class AddressDaoMain {

	public static void main(String[] args) {
		
		AddressDao addrDao = new AddressDao();
		
		/*******************AddressService.findAddressById()**************/
		System.out.println(">>> findAddressById : "+addrDao.findAddressById(1));

	}

}
