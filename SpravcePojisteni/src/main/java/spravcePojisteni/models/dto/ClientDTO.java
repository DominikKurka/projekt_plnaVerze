package spravcePojisteni.models.dto;

import jakarta.validation.constraints.*;

public class ClientDTO {
    private long clientId;
    @NotBlank(message = "Vyplňte jméno")
    @NotNull(message = "Vyplňte jméno")
    private String clientName;
    @NotBlank(message = "Vyplňte příjmení")
    @NotNull(message = "Vyplňte příjmení")
    private String clientSurname;
    @NotBlank(message = "Vyplňte datum")
    @NotNull(message = "Vyplňte datum")
    private String clientDateOfB;
    @NotBlank(message = "Vyplňte email")
    @NotNull(message = "Vyplňte email")
    private String clientEmail;

    @NotBlank(message = "Vyplňte adresu")
    @NotNull(message = "Vyplňte adresu")
    private String clientAdress;

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientSurname() {
        return clientSurname;
    }

    public void setClientSurname(String clientSurname) {
        this.clientSurname = clientSurname;
    }

    public String getClientEmail() {
        return clientEmail;
    }

    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

    public String getClientAdress() {
        return clientAdress;
    }

    public void setClientAdress(String clientAdress) {
        this.clientAdress = clientAdress;
    }

    public String getClientDateOfB() {
        return clientDateOfB;
    }

    public void setClientDateOfB(String clientDateOfB) {
        this.clientDateOfB = clientDateOfB;
    }

    public long getClientId() {
        return clientId;
    }

    public void setClientId(long clientId) {
        this.clientId = clientId;
    }
}
