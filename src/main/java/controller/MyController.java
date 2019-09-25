package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import repository.Information;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class MyController {
    @Autowired
    Information information;


    @GetMapping ({"/" , "/home"})
    public String home(Model model){
//          List list= information.read();
//          model.addAttribute("productname",list.get(0));
//          model.addAttribute("info",list.get(1));
//          model.addAttribute("list",list);
//


        Map map =information.read();
        model.addAttribute("productname", map.get("productname"));
        model.addAttribute("info",map.get("info"));
        model.addAttribute("map" , map );

        return "home";
    }


    @GetMapping("/form")
    public String page(Model model){
        model.addAttribute();
        return "newProduct";
    }

}
