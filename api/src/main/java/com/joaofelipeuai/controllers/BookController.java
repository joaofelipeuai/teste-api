package com.joaofelipeuai.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/books")
public class BookController {

    @GetMapping
    public String getBooks() {
        String name = "Livros";
        System.out.println(name);
        return name;
    }
}