package spravcePojisteni.models.dto.mappers;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import spravcePojisteni.data.entities.ClientEntity;
import spravcePojisteni.models.dto.ClientDTO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-25T15:35:09+0200",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.5 (Eclipse Adoptium)"
)
@Component
public class ClientMapperImpl implements ClientMapper {

    @Override
    public ClientEntity toEntity(ClientDTO source) {
        if ( source == null ) {
            return null;
        }

        ClientEntity clientEntity = new ClientEntity();

        clientEntity.setClientId( source.getClientId() );
        clientEntity.setClientName( source.getClientName() );
        clientEntity.setClientSurname( source.getClientSurname() );
        clientEntity.setClientDateOfB( source.getClientDateOfB() );
        clientEntity.setClientEmail( source.getClientEmail() );
        clientEntity.setClientAdress( source.getClientAdress() );

        return clientEntity;
    }

    @Override
    public ClientDTO toDTO(ClientEntity source) {
        if ( source == null ) {
            return null;
        }

        ClientDTO clientDTO = new ClientDTO();

        clientDTO.setClientName( source.getClientName() );
        clientDTO.setClientSurname( source.getClientSurname() );
        clientDTO.setClientEmail( source.getClientEmail() );
        clientDTO.setClientAdress( source.getClientAdress() );
        clientDTO.setClientDateOfB( source.getClientDateOfB() );
        clientDTO.setClientId( source.getClientId() );

        return clientDTO;
    }

    @Override
    public void updateClientDTO(ClientDTO source, ClientDTO target) {
        if ( source == null ) {
            return;
        }

        target.setClientName( source.getClientName() );
        target.setClientSurname( source.getClientSurname() );
        target.setClientEmail( source.getClientEmail() );
        target.setClientAdress( source.getClientAdress() );
        target.setClientDateOfB( source.getClientDateOfB() );
        target.setClientId( source.getClientId() );
    }

    @Override
    public void updateClientEntity(ClientDTO source, ClientEntity target) {
        if ( source == null ) {
            return;
        }

        target.setClientId( source.getClientId() );
        target.setClientName( source.getClientName() );
        target.setClientSurname( source.getClientSurname() );
        target.setClientDateOfB( source.getClientDateOfB() );
        target.setClientEmail( source.getClientEmail() );
        target.setClientAdress( source.getClientAdress() );
    }
}
