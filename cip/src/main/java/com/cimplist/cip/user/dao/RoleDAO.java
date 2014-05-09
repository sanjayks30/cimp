package com.cimplist.cip.user.dao;


import org.springframework.stereotype.Repository;

import com.cimplist.cip.framework.CrudDAO;
import com.cimplist.cip.user.domain.Role;

@Repository
public class RoleDAO extends CrudDAO<Role,Long> {

	@Override
	public Role findByKey(Long key) {
		return (Role) sessionFactory.getCurrentSession().get(Role.class, key);
	}

}
