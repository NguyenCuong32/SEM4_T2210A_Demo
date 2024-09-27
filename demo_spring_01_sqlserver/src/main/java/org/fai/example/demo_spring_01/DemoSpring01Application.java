package org.fai.example.demo_spring_01;

import jakarta.persistence.EntityManager;
import org.fai.example.demo_spring_01.dao.ClassRoomDAO;
import org.fai.example.demo_spring_01.entity.ClassRoom;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoSpring01Application {

    public static void main(String[] args) {
        SpringApplication.run(DemoSpring01Application.class, args);
        System.out.println("Test");

    }
    @Bean
   public static CommandLineRunner commandLineRunner(ClassRoomDAO classRoomDAO){
        return args -> {
            System.out.println("Start ...");
            addNewClass(classRoomDAO);
            System.out.println("Connected");
        };
   }

    private static void addNewClass(ClassRoomDAO classRoomDAO) {
        ClassRoom classRoom = new ClassRoom();
        classRoom.setClass_name("T2210A111");
        classRoom.setNumber_member(20);
        classRoomDAO.saveClassRoom(classRoom);
    }
    private static void getClassById(ClassRoomDAO classRoomDAO) {
        ClassRoom classRoom= classRoomDAO.getClassRoomById(1l);
        System.out.println(classRoom.toString());
    }

}
