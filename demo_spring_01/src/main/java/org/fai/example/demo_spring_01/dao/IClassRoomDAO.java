package org.fai.example.demo_spring_01.dao;

import org.fai.example.demo_spring_01.entity.ClassRoom;

import java.util.List;

public interface IClassRoomDAO {
    void saveClassRoom(ClassRoom classRoom);
    ClassRoom getClassRoomById(Long id);
    List<ClassRoom> getAllClassRooms();
}
