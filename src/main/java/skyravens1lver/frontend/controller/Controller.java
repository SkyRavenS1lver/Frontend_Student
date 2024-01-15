package skyravens1lver.frontend.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import skyravens1lver.frontend.entity.ResponseFromApi;
import skyravens1lver.frontend.model.StudentInsert;
import skyravens1lver.frontend.model.StudentUpdate;
import skyravens1lver.frontend.network.API;

@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("students", API.getAllData());
        StudentInsert studentInsert = new StudentInsert();
        model.addAttribute("data", studentInsert);
        StudentUpdate studentUpdate = new StudentUpdate();
        model.addAttribute("dataUpdate", studentUpdate);
        return "index.html";
    }
    @PostMapping("/add")
    public String add(@ModelAttribute("data") StudentInsert studentInsert){
        API.insertStudent(studentInsert);
        return "redirect:/";
    }
    @PostMapping("/update")
    public String update(@ModelAttribute("data") StudentInsert studentInsert){
        API.updateStudent(studentInsert);
        return "redirect:/";
    }

}
