package spravcePojisteni.controllers;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import spravcePojisteni.models.dto.ClientDTO;
import spravcePojisteni.models.dto.mappers.ClientMapper;
import spravcePojisteni.models.services.ClientService;

import java.util.List;

@Controller
@RequestMapping("/clients")
public class ClientController {
    @GetMapping
    public String renderIndex(Model model) {
        List<ClientDTO> clients = clientService.getAll();
        model.addAttribute("clients", clients);

        return "pages/clients/index";
    }
    @GetMapping("create")
    public String renderCreateForm(@ModelAttribute
                                   ClientDTO client) {
        return "pages/clients/create";
    }

    @Autowired
    private ClientService clientService;

    @PostMapping("create")
    public String createClient(
            @Valid @ModelAttribute ClientDTO client,
            BindingResult result
    ) {
        if (result.hasErrors())
            return renderCreateForm(client);

        clientService.create(client); // <-- Přidání článku do databáze

        return "redirect:/clients";
    }

    @GetMapping("{clientId}")
    public String renderDetail(
            @PathVariable long clientId,
            Model model
    ) {
        ClientDTO client = clientService.getById(clientId);
        model.addAttribute("client", client);

        return "pages/clients/detail";
    }

    @Autowired
    private ClientMapper clientMapper;

    @GetMapping("edit/{clientId}")
    public String renderEditForm(
            @PathVariable Long clientId,
            ClientDTO client
    ) {
        ClientDTO fetchedClient = clientService.getById(clientId);
        clientMapper.updateClientDTO(fetchedClient, client);

        return "pages/clients/edit";
    }
    @PostMapping("edit/{clientId}")
    public String editClient(
            @PathVariable long clientId,
            @Valid ClientDTO client,
            BindingResult result
    ) {
        if (result.hasErrors())
            return renderEditForm(clientId, client);

        client.setClientId(clientId);
        clientService.edit(client);

        return "redirect:/clients";
    }
    @GetMapping("delete/{clientId}")
    public String delateClient(@PathVariable long clientId) {
        clientService.remove(clientId);

        return "redirect:/clients";
    }
}
