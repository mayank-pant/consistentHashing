package com.project.storage;

import java.util.*;

public class Database {
    public static Map<Integer, Map<Integer, List<Object>>> database = new HashMap<>();

    public Response save(Integer node, WriteRequest data) {
        try {
            if (database.containsKey(node)) {
                if (database.get(node).containsKey(data.getUserId())) {
                    database.get(node).get(data.getUserId()).add(data.getData());
                } else {
                    database.get(node).put(data.getUserId(),new ArrayList<>(Arrays.asList(data.getData())));
                }
            } else {
                HashMap<Integer,List<Object>> newData = new HashMap<>();
                newData.put(data.getUserId(), new ArrayList<>(Arrays.asList(data.getData())));
                database.put(node, newData);
            }
            return Response.OK;
        } catch (Exception e) {
            System.out.println("Error occured");
            System.out.println(e.getMessage());
            return Response.ERROR;
        }
    }

    public Object read(Integer node, Integer userId) {
        try {
            if (database.containsKey(node)) {
                if (database.get(node).containsKey(userId)) {
                    return database.get(node).get(userId);
                } else {
                    return "user does not exist";
                }
            } else {
                return "user does not exist";
            }
        } catch (Exception e) {
            System.out.println("Error occured");
            System.out.println(e.getMessage());
            return "some error occured";
        }
    }
}
