package com.api.daoInterface;

import org.springframework.data.jpa.repository.JpaRepository;
import com.api.model.Role;

public interface RoleDao extends JpaRepository<Role, Integer>{
	
}
