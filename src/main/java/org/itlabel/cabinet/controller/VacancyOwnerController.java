package org.itlabel.cabinet.controller;

import org.itlabel.cabinet.model.CareerModel;
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

/*
 *@author Maxim
 */
@Controller
public class VacancyOwnerController {


    @Autowired
    VacancyService vacancyService;


    List skills = new ArrayList<String>() {
        {
            add("SQL");
            add("Java Core");
            add("Spring");
        }
    };

    User user = new User();


    @RequestMapping("/vacancy")
    public ModelAndView allVacancies() {
//        user.setSkills(skills);
        return new ModelAndView("allVacancies", "vacancies", vacancyService.getAllVacancies());
    }

    @RequestMapping("/updateVacancy")
    public String updateVacancy(@ModelAttribute("vacancy") Vacancy vacancy) {
        System.out.println(vacancy.getVacancyId() + "hahah");
        System.out.println(vacancy.getCompanyName());
        vacancyService.updateVacancy(vacancy);
        return "redirect:/vacancy/" + vacancy.getVacancyId();
    }
    @GetMapping("/updateVacancy/{id}")
    public String updateVacancyById(@PathVariable("id") int id, Model model) {
        model.addAttribute("vacancy", vacancyService.getVacancyById(id));
        return "updateVacancy";
    }
 /////////////////////////////////////////////////////
    @GetMapping("/addVacancy")
    public String addVacancyPage() {
        return "addVacancy";
    }

    @PostMapping("/addVacancy")
    public String addVacancyPage(@ModelAttribute("vacancy") Vacancy vacancy) throws Exception {
        vacancyService.saveVacancy(vacancy);
        return "redirect:/vacancy";
    }

////////////////////////////////
//    @RequestMapping("/removeVacancy/{id}")    // del vac by id
//    public String removeVacancy(@RequestParam(value = "id") int id) {
//        vacancyService.deleteVacancy(id);
//        return "redirect:/vacancy";
//    }

    @RequestMapping("/removeVacancy/{id}")
    public String removeVacancy(@PathVariable("id") int id) {
        Vacancy vacancy = vacancyService.getVacancyById(id);
        vacancyService.deleteVacancy(vacancy);
        return "redirect:/vacancy";
    }


    @GetMapping("/employerPage")
    public ModelAndView employerPage() {

        return new ModelAndView("vacanciesOfTheOneEmployer", "vacancies", vacancyService.getAllVacancies());
    }


}
