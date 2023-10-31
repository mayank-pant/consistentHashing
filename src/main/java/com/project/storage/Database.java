package main.java.com.project.storage;

import com.project.storage.enums.Response;

import java.util.*;

public class Database {
    public static Map<Integer,List<Object>> database = new HashMap<>();

    public Response save(Integer userId, Object data) {
        try {
            if (database.containsKey(userId)) {
                database.get(userId).add(data);
            } else {
                List<Object> keyData = new ArrayList<>(Arrays.asList(data));
                database.put(userId, keyData);
            }
            return Response.OK;
        } catch (Exception e) {
            System.out.println("Error occured");
            System.out.println(e.getMessage());
            return Response.ERROR_SAVING;
        }
    }

    public Object read(Integer userId) {
        try {
            return database.get(userId);
        } catch (Exception e) {
            System.out.println("Error occured");
            System.out.println(e.getMessage());
            return Response.USER_NOT_PRESENT;
        }
    }
}
