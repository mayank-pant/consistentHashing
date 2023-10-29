package com.project.service;

import com.project.hashFunction.Modulo;
import com.project.storage.Database;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

public class DatabaseService {
    private final Modulo modulo;
    private final Database database;

    public DatabaseService(Modulo modulo, Database database) {
        this.modulo = modulo;
        this.database = database;
    }

    public Response save(WriteRequest request){
        Integer hashValue = modulo.hash(request.getUserId());
        return database.save(hashValue,request);
    }

    public Object read(Integer userId){
        Integer hashValue = modulo.hash(userId);
        return database.read(hashValue,userId);
    }
}
