package org.fai.example.demo_spring_01.controllers;

import org.fai.example.demo_spring_01.entity.ClassRoom;
import org.fai.example.demo_spring_01.services.ClassRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/classroom")
public class ClassRoomController  {
    ClassRoomService classRoomService;
    @Autowired
    public ClassRoomController(ClassRoomService classRoomService) {
        this.classRoomService = classRoomService;
    }

    @GetMapping("/list")
    public String getClassRoomList(Model model){
        List<ClassRoom> classRooms = classRoomService.getAllClassRooms();
        model.addAttribute("classRooms",classRooms);
        return "classroom/index";
    }
    @PostMapping("/save")
    public String saveClassRoom(ClassRoom classRoom){
        System.out.println("save class room");

        return "classroom/index";
    }
}
