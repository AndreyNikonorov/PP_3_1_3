package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.model.Role;

import java.util.Set;

public interface RoleService {
    void addRole(Role role);

    void removeRole(long id);

    Set<Role> getRoles();

    Role getRoleById(long id);

    Role getRoleByRoleName(String roleName);
}