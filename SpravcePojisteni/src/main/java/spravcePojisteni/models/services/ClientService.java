package spravcePojisteni.models.services;

import spravcePojisteni.models.dto.ClientDTO;

import java.util.List;

public interface ClientService {
    void create(ClientDTO client);
    List<ClientDTO> getAll();
    ClientDTO getById(long clientId);
    void edit(ClientDTO client);
    void remove(long clientId);
}
