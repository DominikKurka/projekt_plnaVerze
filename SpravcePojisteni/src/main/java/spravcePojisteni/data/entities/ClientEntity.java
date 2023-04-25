package spravcePojisteni.data.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class ClientEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long clientId;

    @Column(nullable = false)
    private String clientName;

    @Column(nullable = false)
    private String clientSurname;

    @Column(nullable = false)
    private String clientDateOfB;
    @Column(nullable = false)
    private String clientEmail;
    @Column(nullable = false)
    private String clientAdress;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_clientId", referencedColumnName = "clientId")
    private List<InsuranceEntity> insurance;

    public long getClientId() {
        return clientId;
    }

    public void setClientId(long clientId) {
        this.clientId = clientId;
    }

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

    public String getClientDateOfB() {
        return clientDateOfB;
    }

    public void setClientDateOfB(String clientDateOfB) {
        this.clientDateOfB = clientDateOfB;
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
}
