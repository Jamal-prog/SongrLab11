package com.PivotTech.songr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class gReeting {

    @RequestMapping("/hello") //
    public String test(String str) {

        return "Hello world";
    }

    @GetMapping("/capitalize/{text}")
    public String capitalize(@PathVariable(name = "text") String text, Model model)
    {
        model.addAttribute("text",text);
        return "capitalize";
    }
    @GetMapping("/")
    public String splash(){
        return "splash";
    }
    @GetMapping("/albums")
    public String albums(Model model)
    {
        Album album1 = new Album("Massacre","50 Cent", 6,1045,"www.youtube.com");
        ArrayList<Album> albumList = new ArrayList<>();

        albumList.add(album1);
        model.addAttribute("albums", albumList);
        return "albums";
    }

}


