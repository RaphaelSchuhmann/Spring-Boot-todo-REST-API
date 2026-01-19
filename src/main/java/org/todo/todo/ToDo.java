/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.todo.todo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author schuhmann
 */
@RestController
@SpringBootApplication
public class ToDo {
    @RequestMapping("/")
    String home() {
        return "Hello Hello";
    }

    public static void main(String[] args) {
        SpringApplication.run(ToDo.class, args);
    }
}
