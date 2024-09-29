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
    @Column(name = "age")
    private String age;
    @Column(name = "children")    
    private LocalDate children;
    @Column(name = "location") 
    private String location;
    @Column(name = "behavior") 
    private String behavior;

    public Consult(){

    }

    public Consult(Long idConsult, String name, LocalDate dateConsult, String typeConsult, String description) {
        this.idConsult = idConsult;
        this.age = age;
        this.children = children;
        this.location = location;
        this.behavior = behavior;
    }

    public Long getIdConsult() {
        return idConsult;
    }

    public void setIdConsult(Long idConsult) {
        this.idConsult = idConsult;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public LocalDate getChildren() {
        return children;
    }

    public void setChildren(LocalDate children) {
        this.children = children;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getBehavior() {
        return behavior;
    }

    public void setBehavior(String behavior) {
        this.behavior = behavior;
    }
   
}