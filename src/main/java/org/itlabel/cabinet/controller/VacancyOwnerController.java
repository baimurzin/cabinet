package org.itlabel.cabinet.controller;

import org.itlabel.cabinet.model.UserModel;
import org.itlabel.cabinet.model.Vacancy;
import org.itlabel.cabinet.model.VacancyModel;
import org.itlabel.cabinet.service.UserService;
import org.itlabel.cabinet.service.VacancyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/*
 *@author Maxim
 */
@Controller
public class VacancyOwnerController {


    @Autowired
   private VacancyService vacancyService;

    @Autowired
    private UserService userService;

    @RequestMapping("/vacancy")
    public ModelAndView allVacancies() {
        return new ModelAndView("vacancy", "vacancies", vacancyService.getAllVacancies());
    }

    @RequestMapping("/updateVacancy")
    public String updateVacancy(@ModelAttribute("vacancy") Vacancy vacancy) {

VacancyModel vacancyModel = new VacancyModel();
vacancyModel.setCompanyName(vacancy.getCompanyName());
vacancyModel.setCurrencyId(vacancy.getCurrencyId());
vacancyModel.setPositionName(vacancy.getPositionName());
vacancyModel.setSalary(vacancy.getSalary());
vacancyModel.setVacancyDescription(vacancy.getVacancyDescription());
vacancyModel.setVacancyId(vacancy.getVacancyId());
vacancyModel.setUser_model(userService.findUserById(vacancy.getUser_model_id()));

        vacancyService.updateVacancy(vacancyModel);

        return "redirect:/employerPage/" +  vacancyModel.getUser_model().getId();
    }

    @GetMapping("/updateVacancy/{id}")
    public String updateVacancyById(@PathVariable("id") int id, Model model) {

        VacancyModel vacancyModel = vacancyService.getVacancyById(id);
        Vacancy vacancy = new Vacancy();
        vacancy.setCompanyName(vacancyModel.getCompanyName());
        vacancy.setCurrencyId(vacancyModel.getCurrencyId());
        vacancy.setPositionName(vacancyModel.getPositionName());
        vacancy.setVacancyDescription(vacancyModel.getVacancyDescription());
        vacancy.setSalary(vacancyModel.getSalary());
        vacancy.setVacancyId(vacancyModel.getVacancyId());
        vacancy.setUser_model_id(vacancyModel.getUser_model().getId());
        model.addAttribute("vacancy", vacancy);

       return "updateVacancy";
    }


    @GetMapping("/addVacancy/{creator_id}")
    public String addVacancyPage(@PathVariable("creator_id") long id, Model model) {
        model.addAttribute("creator_id", id);
        return "addVacancy";
    }

    @PostMapping("/addVacancy")
    public String addVacancyPage(@ModelAttribute("vacancy") Vacancy vacancy2) throws Exception {
        System.out.println(vacancy2.getUser_model_id() + "SOME ID HERE , id of vacancy is " + vacancy2.getVacancyId());

        VacancyModel vacancy = new VacancyModel();

        vacancy.setCompanyName(vacancy2.getCompanyName());
        vacancy.setCurrencyId(vacancy2.getCurrencyId());
        vacancy.setPositionName(vacancy2.getPositionName());
        vacancy.setVacancyDescription(vacancy2.getVacancyDescription());
        vacancy.setSalary(vacancy2.getSalary());
        vacancy.setVacancyId(vacancy2.getVacancyId());
        vacancy.setUser_model(userService.findUserById(vacancy2.getUser_model_id()));

        vacancyService.saveVacancy(vacancy);
        return "redirect:/employerPage/" +  vacancy2.getUser_model_id();
    }

    @RequestMapping("/removeVacancy/{id}/{id_employer}")
    public String removeVacancy(@PathVariable("id") int id, @PathVariable("id_employer") int id_employer) {
        VacancyModel vacancyModel = vacancyService.getVacancyById(id);
        vacancyService.deleteVacancy(vacancyModel);

        return "redirect:/employerPage/" + id_employer;
    }

    @GetMapping("/employerPage/{id}")
    public ModelAndView employerPageWithId(@PathVariable("id") int id, Model model) {

        return new ModelAndView("employerPage", "vacancies", vacancyService.findAllEmployersVacancyById(id));
    }

}
