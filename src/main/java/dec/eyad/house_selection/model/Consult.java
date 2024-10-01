package dec.eyad.house_selection.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Consults")
public class Consult {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idConsult")
    private Long idConsult;
    @Column(name = "name")
    private String name;
    @Column(name = "dateConsult")    
    private LocalDate dateConsult;
    @Column(name = "locationSite") 
    private String locationSite;
    @Column(name = "generalBehavior") 
    private String generalBehavior;

    public Consult(){

    }

    public Consult(Long idConsult, String name, LocalDate dateConsult, String locationSite, String generalBehavior) {
        this.idConsult = idConsult;
        this.name = name;
        this.dateConsult = dateConsult;
        this.locationSite = locationSite;
        this.generalBehavior = generalBehavior;
    }

    public Long getIdConsult() {
        return idConsult;
    }

    public void setIdConsult(Long idConsult) {
        this.idConsult = idConsult;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateConsult() {
        return dateConsult;
    }

    public void setDateConsult(LocalDate dateConsult) {
        this.dateConsult = dateConsult;
    }

    public String getLocationSite() {
        return locationSite;
    }

    public void setLocationSite(String locationSite) {
        this.locationSite = locationSite;
    }

    public String getGeneralBehavior() {
        return generalBehavior;
    }

    public void setGeneralBehavior(String generalBehavior) {
        this.generalBehavior = generalBehavior;
    }
    
}

   