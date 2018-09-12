package org.itlabel.cabinet.controller;

import org.itlabel.cabinet.model.CareerModel;
import org.itlabel.cabinet.model.User;
import org.itlabel.cabinet.model.Vacancy;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

/*
 *@author Yakovlev Alexandr
 */
@Controller
public class StudentCareerController {
    Vacancy[] vacancies = {
            new Vacancy(0, "Google", "middle Java Developer", 250000,1),
            new Vacancy(1, "Yandex", "junior Java Developer", 150000,1),
            new Vacancy(2, "FaceBook", "middle Java Developer", 240000,1),
            new Vacancy(3, "Uber", "junior Java Developer", 180000,1),
    };

    User user = new User();

    @RequestMapping("/career")
    public ModelAndView showCareerPage() {
        String[] skills = {"SQL", "Java Core", "Spring"};
        user.setSkills(skills);
        return new ModelAndView("career", "careerModel", new CareerModel(vacancies, user));
    }

    @RequestMapping("/vacancy")
    public ModelAndView greeting(@RequestParam(value="id", defaultValue="2") Integer id) {
        return new ModelAndView("vacancy","vacancy",vacancies[id]);
    }
}
