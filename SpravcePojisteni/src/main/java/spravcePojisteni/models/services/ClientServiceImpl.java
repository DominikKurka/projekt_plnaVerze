package spravcePojisteni.models.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spravcePojisteni.data.entities.ClientEntity;
import spravcePojisteni.data.repositories.ClientRepository;
import spravcePojisteni.models.dto.ClientDTO;
import spravcePojisteni.models.dto.mappers.ClientMapper;

import java.util.List;
import java.util.stream.StreamSupport;

@Service
public class ClientServiceImpl implements ClientService {
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private ClientMapper clientMapper;

    @Override
    public void create(ClientDTO client) {
        ClientEntity newClient = clientMapper.toEntity(client); // <-- Tímto řádkem jsme nahradili velkou část obsahu této metody

        clientRepository.save(newClient);
    }
    @Override
    public List<ClientDTO> getAll() {
        return StreamSupport.stream(clientRepository.findAll().spliterator(), false)
                .map(i -> clientMapper.toDTO(i))
                .toList();
    }
    @Override
    public ClientDTO getById(long clientId) {
        ClientEntity fetchedClient = getClientOrThrow(clientId);

        return clientMapper.toDTO(fetchedClient);
    }

    @Override
    public void edit(ClientDTO client) {
        ClientEntity fetchedClient = getClientOrThrow(client.getClientId());

        clientMapper.updateClientEntity(client, fetchedClient);
        clientRepository.save(fetchedClient);
    }

    private ClientEntity getClientOrThrow(long clientId) {
        return clientRepository
                .findById(clientId)
                .orElseThrow();
    }

    @Override
    public void remove(long clientId) {
        ClientEntity fetchedEntity = getClientOrThrow(clientId);
        clientRepository.delete(fetchedEntity);
    }
}
