package com.ygl.demo;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface GreetingMapper {

    @Select("SELECT * from greeting")
    List<Greeting> findAll();

    @Select("SELECT * from greeting limit 5")
    List<Greeting> findAll2();

    @Select("SELECT * from greeting where 1>1")
    List<Greeting> findAll3();

}