package com.example.timetable.controller.rest;

import com.example.timetable.model.Teacher;
import com.example.timetable.model.Student;
import com.example.timetable.model.Teacher;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class TeacherController {
    private List<Teacher> teacher = new ArrayList<>(
            Arrays.asList(
                    new Teacher("1" , "Jirniy" , "fizruck" ) ,
                    new Teacher("2" , "Shizoidka" , "Shizika" ) ,
                    new Teacher("3" , "THEBEST" , "Matemat" ) ,
                    new Teacher("4" , "50/50" , "Ximia" ) ,
                    new Teacher("5" , "Demon" , "Ukr.m" )
            )
    );

    @RequestMapping("/demons")
    List<Teacher> getAll(){
        return teacher;
    }

}