package com.tts.eCommerce.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tts.eCommerce.model.AdminRole;

@Repository
public interface AdminRoleRepository extends CrudRepository<AdminRole, Long> {

}
