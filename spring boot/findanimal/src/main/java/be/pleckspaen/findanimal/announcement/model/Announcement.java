package be.pleckspaen.findanimal.announcement.model;

import be.pleckspaen.findanimal.animal.model.Animal;

import java.util.Date;

public class Announcement {
    private Date creationDate;
    private AnnoncementType annoncementType;
    private Animal animal;

    public Announcement(Date creationDate, AnnoncementType annoncementType, Animal animal) {
        this.creationDate = creationDate;
        this.annoncementType = annoncementType;
        this.animal = animal;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public AnnoncementType getAnnoncementType() {
        return annoncementType;
    }

    public void setAnnoncementType(AnnoncementType annoncementType) {
        this.annoncementType = annoncementType;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
}


