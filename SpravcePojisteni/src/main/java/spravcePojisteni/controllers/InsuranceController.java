package spravcePojisteni.controllers;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import spravcePojisteni.models.dto.InsuranceDTO;
import spravcePojisteni.models.dto.mappers.InsuranceMapper;
import spravcePojisteni.models.services.InsuranceService;


import java.util.List;
@Controller
@RequestMapping("/insurances")
public class InsuranceController {

    @GetMapping
    public String renderIndex(Model model) {
        List<InsuranceDTO> insurances = insuranceService.getAll();
        model.addAttribute("insurances", insurances);

        return "pages/insurances/index";
    }
    @GetMapping("create")
    public String renderCreateForm(@ModelAttribute
                                   InsuranceDTO insurance) {
        return "pages/insurances/create";
    }

    @Autowired
    private InsuranceService insuranceService;

    @PostMapping("create")
    public String createInsurance(
            @Valid @ModelAttribute InsuranceDTO insurance,
            BindingResult result
    ) {
        if (result.hasErrors())
            return renderCreateForm(insurance);

        insuranceService.create(insurance); // <-- Přidání článku do databáze

        return "redirect:/insurances";
    }

    @GetMapping("{insuranceId}")
    public String renderDetail(
            @PathVariable long insuranceId,
            Model model
    ) {
        InsuranceDTO insurance = insuranceService.getById(insuranceId);
        model.addAttribute("insurance", insurance);

        return "pages/insurances/detail";
    }

    @Autowired
    private InsuranceMapper insuranceMapper;

    @GetMapping("edit/{insuranceId}")
    public String renderEditForm(
            @PathVariable Long insuranceId,
            InsuranceDTO insurance
    ) {
        InsuranceDTO fetchedInsurance = insuranceService.getById(insuranceId);
        insuranceMapper.updateInsuranceDTO(fetchedInsurance, insurance);

        return "pages/insurances/edit";
    }
    @PostMapping("edit/{insuranceId}")
    public String editInsurance(
            @PathVariable long insuranceId,
            @Valid InsuranceDTO insurance,
            BindingResult result
    ) {
        if (result.hasErrors())
            return renderEditForm(insuranceId, insurance);

        insurance.setInsuranceId(insuranceId);
        insuranceService.edit(insurance);

        return "redirect:/insurances";
    }
    @GetMapping("delete/{insuranceId}")
    public String deleteInsurance(@PathVariable long insuranceId) {
        insuranceService.remove(insuranceId);

        return "redirect:/insurances";
    }
}
