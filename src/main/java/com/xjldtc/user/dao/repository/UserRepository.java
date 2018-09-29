package com.xjldtc.user.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xjldtc.user.entity.po.UserPO;

@Repository
public interface UserRepository extends JpaRepository<UserPO, String>{
	
	UserPO findByLogName(String logName);

}
