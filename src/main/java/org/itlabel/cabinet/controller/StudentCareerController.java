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
import java.util.List;

/*
 *@author Yakovlev Alexandr
 */
@Controller
public class StudentCareerController {
    List vacancies = new ArrayList<Vacancy>();
    List skills = new ArrayList<String>();

    User user = new User();

    @RequestMapping("/career")
    public ModelAndView showCareerPage() {
        vacancies.add(new Vacancy(0, "Google", "middle Java Developer", 250000, 1));
        vacancies.add(new Vacancy(1, "Yandex", "junior Java Developer", 150000, 1));
        vacancies.add(new Vacancy(2, "FaceBook", "middle Java Developer", 240000, 1));
        vacancies.add(new Vacancy(3, "Uber", "junior Java Developer", 180000, 1));
        skills.add("SQL");
        skills.add("Java Core");
        skills.add("Spring");
        user.setSkills(skills);
        return new ModelAndView("career", "careerModel", new CareerModel(vacancies, user));
    }

    @RequestMapping("/vacancy")
    public ModelAndView greeting(@RequestParam(value = "id") Integer id) {
        return new ModelAndView("vacancy", "vacancy", vacancies.get(id));
    }

    List<Vacancy> llist = new ArrayList();
}
