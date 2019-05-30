package com.huxinfeng.ssh.domain;

import lombok.Data;
import org.springframework.stereotype.Component;
@Data
@Component
public class Employee {
    private Long id;
    private String name;
    private Integer age;
}
