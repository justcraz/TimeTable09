package com.example.timetable.services.classroom;

import com.example.timetable.model.Classroom;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class ClassroomService {
    private List<Classroom> classrooms;

    @PostConstruct
    void init() {
        classrooms = new ArrayList<>(
                Arrays.asList(
                        new Classroom("1", "Laboratory", 20),
                        new Classroom("2", "WC", 30),
                        new Classroom("3", "Assembly Hall", 40),
                        new Classroom("4", "Gym", 50)
                )
        );
    }

    public List<Classroom> getAll() {
        return classrooms;
    }
    public List<Classroom> reNew(){
        return classrooms=classrooms;
}
    public void delete(String id) {
        classrooms = classrooms .stream().filter(room->!room.getId().equals(id))
                .collect(Collectors.toList());
    }

    public void create(Classroom classroom) {
        String id = UUID.randomUUID().toString();
        classroom.setId(id);
        classrooms.add(classroom);
    }

    public Classroom get(String id) {
        Classroom classroom = classrooms.stream()
                .filter(el -> el.getId().equals(id))
                .findAny().get();
        return classroom;
    }

    public void update(Classroom classroom) {
        String id = classroom.getId();
        Classroom room = get(id);
        int index = classrooms.indexOf(room);
        classrooms.remove(room);
        classrooms.add(index,classroom);
    }
}

