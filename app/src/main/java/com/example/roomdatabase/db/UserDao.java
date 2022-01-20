package com.example.roomdatabase.db;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface UserDao {

    @Query("SELECT * FROM user")
    List<User> getAllUsers();

    @Insert
    void insertUser(User... users);

    @Delete
    void delete(User user);

    @Query("DELETE FROM user WHERE uid = :id")
    void deleteById(int id);

    @Query("update user set first_name=:fname,last_name = :lname")
    void update(String fname,String lname);

    @Query("select * from user where uid =:id")
    List<User> getUserByid(int id);

}



