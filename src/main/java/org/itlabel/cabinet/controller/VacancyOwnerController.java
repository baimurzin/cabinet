package org.itlabel.cabinet.controller;

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
//        user.setSkills(skills);
        return new ModelAndView("vacancy", "vacancies", vacancyService.getAllVacancies());
    }

    @RequestMapping("/updateVacancy")
    public String updateVacancy(@ModelAttribute("vacancy") Vacancy vacancy) {
//        System.out.println(vacancyModel.getUser_model().getId() + "second update");
        System.out.println(vacancy.getVacancyId());
VacancyModel vacancyModel = new VacancyModel();
vacancyModel.setCompanyName(vacancy.getCompanyName());
vacancyModel.setCurrencyId(vacancy.getCurrencyId());
vacancyModel.setPositionName(vacancy.getPositionName());
vacancyModel.setSalary(vacancy.getSalary());
vacancyModel.setVacancyDescription(vacancy.getVacancyDescription());
vacancyModel.setVacancyId(vacancy.getVacancyId());
vacancyModel.setUser_model(userService.findUserById(vacancy.getUser_model_id()));

        vacancyService.updateVacancy(vacancyModel);
//        System.out.println(vacancyModel.getUser_model().getId() + "second update");
        return "redirect:/employersVacancies/" +  vacancyModel.getUser_model().getId();
    }

    @GetMapping("/updateVacancy/{id}")
    public String updateVacancyById(@PathVariable("id") int id, Model model) {
        System.out.println();
        VacancyModel vacancyModel = vacancyService.getVacancyById(id);
        System.out.println(vacancyModel.getVacancyId() + " " + vacancyModel.getUser_model().getUserRole() + " " + vacancyModel.getCurrencyId()
                + " " + vacancyModel.getSalary()  + " " +  vacancyModel.getCompanyName()  + " " + vacancyModel.getPositionName() + " " +
        vacancyModel.getVacancyDescription());
        Vacancy vacancy = new Vacancy();
        vacancy.setCompanyName(vacancyModel.getCompanyName());
        vacancy.setCurrencyId(vacancyModel.getCurrencyId());
        vacancy.setPositionName(vacancyModel.getPositionName());
        vacancy.setVacancyDescription(vacancyModel.getVacancyDescription());
        vacancy.setSalary(vacancyModel.getSalary());
        vacancy.setVacancyId(vacancyModel.getVacancyId());
        vacancy.setUser_model_id(vacancyModel.getUser_model().getId());
        model.addAttribute("vacancy", vacancy);

//        System.out.println(vacancyService.getVacancyById(id).getVacancyId() + "I AM HEEREE! user_id=" + vacancyModel.getUser_model().getId());
        return "updateVacancy";
    }


    @GetMapping("/addVacancy/{id}")
    public String addVacancyPage(@PathVariable("id") int id, Model model) {
        model.addAttribute("creator_id", id);
        return "addVacancy";
    }

    @PostMapping("/addVacancy")
    public String addVacancyPage(@ModelAttribute("vacancy") VacancyModel vacancyModel) throws Exception {
        vacancyService.saveVacancy(vacancyModel);
        return "redirect:/vacancy";
    }

    @RequestMapping("/removeVacancy/{id}")
    public String removeVacancy(@PathVariable("id") int id) {
        VacancyModel vacancyModel = vacancyService.getVacancyById(id);
        vacancyService.deleteVacancy(vacancyModel);
        return "redirect:/vacancy";
    }

//    @GetMapping("/employerPage")
//    public ModelAndView employerPage() {
//        return new ModelAndView("employersVacancies", "vacancies", vacancyService.getAllVacancies());
//    }

    @GetMapping("/employerPage/{id}")
    public ModelAndView employerPageWithId(@PathVariable("id") int id, Model model) {

        return new ModelAndView("employersVacancies", "vacancies", vacancyService.findAllEmployersVacancyById(id));
    }

}
