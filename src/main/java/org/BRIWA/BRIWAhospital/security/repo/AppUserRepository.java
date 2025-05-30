package org.BRIWA.BRIWAhospital.security.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.BRIWA.BRIWAhospital.security.entities.AppUser;

public interface AppUserRepository extends JpaRepository<AppUser, String> {
    AppUser findByUsername(String username);
}
