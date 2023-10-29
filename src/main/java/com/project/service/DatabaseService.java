package com.project.service;

import com.project.dto.Response;
import com.project.dto.WriteRequest;
import com.project.hashFunction.Modulo;
import com.project.storage.Database;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
public class DatabaseService {
    @Inject
    Database database;
    @Inject
    Modulo modulo;
    public Response save(WriteRequest request){
        Integer hashValue = modulo.hash(request.getUserId());
        return database.save(hashValue,request);
    }

    public Object read(Integer userId){
        Integer hashValue = modulo.hash(userId);
        return database.read(hashValue,userId);
    }
}
