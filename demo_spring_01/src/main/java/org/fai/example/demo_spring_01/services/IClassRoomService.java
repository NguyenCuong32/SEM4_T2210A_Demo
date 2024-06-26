package org.fai.example.demo_spring_01.services;

import org.fai.example.demo_spring_01.entity.ClassRoom;

import java.util.List;

public interface IClassRoomService {
    public List<ClassRoom> getAllClassRooms();
    public ClassRoom getClassRoomById(Integer id);
    public void saveClassRoom(ClassRoom classRoom);
    public void deleteClassRoomById(Integer id);
}
