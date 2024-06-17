package org.fai.example.demo_spring_01.dao;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.fai.example.demo_spring_01.entity.ClassRoom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ClassRoomDAO implements IClassRoomDAO{
    private final EntityManager entityManager;
    @Autowired
    public ClassRoomDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    @Override
    @Transactional
    public void saveClassRoom(ClassRoom classRoom) {
        this.entityManager.persist(classRoom);
    }

    @Override
    public ClassRoom getClassRoomById(Long id) {
       return this.entityManager.find(ClassRoom.class, id);
    }

    @Override
    public List<ClassRoom> getAllClassRooms() {
        return this.entityManager.createQuery("from ClassRoom", ClassRoom.class).getResultList();
    }
}
