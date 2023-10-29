package com.project.controller;

import com.project.dto.Response;
import com.project.dto.WriteRequest;
import com.project.service.DatabaseService;
import io.micronaut.http.annotation.*;
import jakarta.inject.Inject;

@Controller("consistent-hashing")
public class ServiceApi {
    @Inject
    DatabaseService databaseService;

    @Post("/save")
    public Response save(@Body WriteRequest body){
        System.out.println(body);
        return databaseService.save(body);
    }

    @Get("/read/{userId}")
    public Object save(@PathVariable Integer userId){
        return databaseService.read(userId);
    }
}
