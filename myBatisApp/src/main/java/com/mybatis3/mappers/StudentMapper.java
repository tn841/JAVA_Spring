package com.mybatis3.mappers;

import java.util.List;

import com.mybatis3.domain.Student;

public interface StudentMapper {
	public Student findStudentById(Integer studId);
	public List findStudentByIdMap(Integer studId);
}
