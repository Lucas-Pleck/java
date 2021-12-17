package be.pleckspaen.findanimal.announcementapi.dto;

import be.pleckspaen.findanimal.animalapi.dto.AnimalDto;
import be.pleckspaen.findanimal.announcement.model.AnnoncementType;

import java.util.Date;

public class AnnouncementDto {

    private Date creationDate;
    private AnnoncementType annoncementType;
    private AnimalDto animalDto;

    public AnnouncementDto(Date creationDate, AnnoncementType annoncementType, AnimalDto animalDto) {
        this.creationDate = creationDate;
        this.annoncementType = annoncementType;
        this.animalDto = animalDto;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public AnnoncementType getAnnoncementType() {
        return annoncementType;
    }

    public AnimalDto getAnimalDto() {
        return animalDto;
    }
}
