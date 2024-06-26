package org.fai.example.demo_spring_01.controllers;

import org.fai.example.demo_spring_01.entity.ClassRoom;
import org.fai.example.demo_spring_01.services.ClassRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
    public String saveClassRoom(@ModelAttribute("classRoom") ClassRoom classRoom){
        System.out.println("save class room "+classRoom.getClass_name());
        classRoomService.saveClassRoom(classRoom);
        return "redirect:/classroom/list";
    }
    @GetMapping("/delete")
    public String deleteClassRoom(@RequestParam("class_id") Integer class_id){
        System.out.println(class_id);
        classRoomService.deleteClassRoomById(class_id);
        return "redirect:/classroom/list";
    }
}
