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
   private VacancyService vacancyService;

    @RequestMapping("/vacancy")
    public ModelAndView allVacancies() {
//        user.setSkills(skills);
        return new ModelAndView("allVacancies", "vacancies", vacancyService.getAllVacancies());
    }

    @RequestMapping("/updateVacancy")
    public String updateVacancy(@ModelAttribute("vacancy") Vacancy vacancy) {
        vacancyService.updateVacancy(vacancy);
        return "redirect:/vacancy/" + vacancy.getVacancyId();
    }

    @GetMapping("/updateVacancy/{id}")
    public String updateVacancyById(@PathVariable("id") int id, Model model) {
        model.addAttribute("vacancy", vacancyService.getVacancyById(id));
        return "updateVacancy";
    }

    @GetMapping("/addVacancy")
    public String addVacancyPage() {
        return "addVacancy";
    }

    @PostMapping("/addVacancy")
    public String addVacancyPage(@ModelAttribute("vacancy") Vacancy vacancy) throws Exception {
        vacancyService.saveVacancy(vacancy);
        return "redirect:/vacancy";
    }

    @RequestMapping("/removeVacancy/{id}")
    public String removeVacancy(@PathVariable("id") int id) {
        Vacancy vacancy = vacancyService.getVacancyById(id);
        vacancyService.deleteVacancy(vacancy);
        return "redirect:/vacancy";
    }

    @GetMapping("/employerPage")
    public ModelAndView employerPage() {

        return new ModelAndView("employersVacanciers", "vacancies", vacancyService.getAllVacancies());
    }


}
