## Consistent-hashing

- This is simple hashing implementation for now
- This project uses modulo 10 as hash
- Using userid as hash input and data is stored in format
    ```
    {1:
      {2:["radagast"],
       3:["some info"]}
    }
    ```
    1 is hashValue  
    2 is userId and list has data
- 
- to save value path is **/consistent-hashing/save**
    - Body is **{userId:1,data:"dfdsf"}**
- to read value path is **/consistent-hashing/read/1** where 1 is userId


