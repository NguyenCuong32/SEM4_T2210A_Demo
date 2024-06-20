package org.fai.example.demo_spring_01.dao;

import org.fai.example.demo_spring_01.entity.ClassRoom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClassRoomRepository extends JpaRepository<ClassRoom,Integer> {
}
