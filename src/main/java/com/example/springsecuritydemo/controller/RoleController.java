package com.example.springsecuritydemo.controller;

import com.example.springsecuritydemo.model.Role;
import com.example.springsecuritydemo.service.RolesService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class RoleController {
    private RolesService roleService;

    @PostMapping("/roles")
    public Role addRole (@RequestBody Role role){
        return roleService.save(role);
    }
}
