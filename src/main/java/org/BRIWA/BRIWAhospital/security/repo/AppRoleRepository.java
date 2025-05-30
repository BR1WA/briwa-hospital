package org.BRIWA.BRIWAhospital.security.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.BRIWA.BRIWAhospital.security.entities.AppRole;

public interface AppRoleRepository extends JpaRepository<AppRole, String> {
}