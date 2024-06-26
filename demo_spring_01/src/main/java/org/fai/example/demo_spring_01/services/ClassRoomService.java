package org.fai.example.demo_spring_01.services;

import org.fai.example.demo_spring_01.dao.IClassRoomRepository;
import org.fai.example.demo_spring_01.entity.ClassRoom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClassRoomService implements IClassRoomService{
    private IClassRoomRepository classRoomRepository;
    @Autowired
    public ClassRoomService(IClassRoomRepository classRoomRepository) {
        this.classRoomRepository = classRoomRepository;
    }

    @Override
    public List<ClassRoom> getAllClassRooms() {
        List<ClassRoom> classRooms = this.classRoomRepository.findAll();
        return classRooms;
    }

    @Override
    public ClassRoom getClassRoomById(Integer id) {
        return null;
    }

    @Override
    public void saveClassRoom(ClassRoom classRoom) {
        this.classRoomRepository.save(classRoom);
    }

    @Override
    public void deleteClassRoomById(Integer id) {
        this.classRoomRepository.deleteById(id);
    }
}
