package org.itlabel.cabinet.controller;

import org.itlabel.cabinet.model.CareerModel;
import org.itlabel.cabinet.model.Task;
import org.itlabel.cabinet.model.User;
import org.itlabel.cabinet.model.Vacancy;
import org.itlabel.cabinet.service.VacancyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

/*
 *@author Yakovlev Alexandr
 */
@Controller
public class StudentCareerController {
//    List vacancies = new ArrayList<Vacancy>() {
//        {
//            add(new Vacancy(0, "Google", "middle Java Developer", 250000, 1));
//            add(new Vacancy(1, "Yandex", "junior Java Developer", 150000, 1));
//            add(new Vacancy(2, "FaceBook", "middle Java Developer", 240000, 1));
//            add(new Vacancy(3, "Uber", "junior Java Developer", 180000, 1));
//        }
//    };

    @Autowired
   private VacancyService vacancyService;


    List skills = new ArrayList<String>() {
        {
            add("SQL");
            add("Java Core");
            add("Spring");
        }
    };

    User user = new User();

    @RequestMapping("/career")
    public ModelAndView showCareerPage() {
        user.setSkills(skills);
        return new ModelAndView("career", "careerModel", new CareerModel(vacancyService.getAllVacancies(), user));
    }

    @RequestMapping(value = "/vacancy/{number}")
    public String showCurrentVacancyPage(Model model, @PathVariable("number") Integer number) {
        model.addAttribute("vacancy", vacancyService.getVacancyById(number));
        return "vacancy";
    }

}
