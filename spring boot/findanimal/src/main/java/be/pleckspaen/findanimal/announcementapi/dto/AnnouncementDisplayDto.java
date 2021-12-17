package be.pleckspaen.findanimal.announcementapi.dto;

import be.pleckspaen.findanimal.animalapi.dto.AnimalDisplayDto;
import be.pleckspaen.findanimal.announcement.model.AnnoncementType;

import java.util.Date;

public class AnnouncementDisplayDto {

    private Date creationDate;
    private AnnoncementType annoncementType;
    private AnimalDisplayDto animalDisplayDto;

    public AnnouncementDisplayDto(Date creationDate, AnnoncementType annoncementType, AnimalDisplayDto animalDisplayDto) {
        this.creationDate = creationDate;
        this.annoncementType = annoncementType;
        this.animalDisplayDto = animalDisplayDto;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public AnnoncementType getAnnoncementType() {
        return annoncementType;
    }

    public AnimalDisplayDto getAnimalDisplayDto() {
        return animalDisplayDto;
    }
}
