package be.pleckspaen.findanimal.announcementapi.converter;


import be.pleckspaen.findanimal.animal.converter.AnimalConverter;
import be.pleckspaen.findanimal.announcement.model.Announcement;
import be.pleckspaen.findanimal.announcementapi.dto.AnnouncementDisplayDto;
import be.pleckspaen.findanimal.announcementapi.dto.AnnouncementDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class AnnouncementConverter{


    @Autowired
    private AnimalConverter animalConverter;


    public AnnouncementDisplayDto apply(Announcement announcement){
        return new AnnouncementDisplayDto(
                announcement.getCreationDate(),
                announcement.getAnnoncementType(),
                animalConverter.applyDisplay(announcement.getAnimal())
        );
    }


    public AnnouncementDto applyDto(Announcement announcement){
        return new AnnouncementDto(
                announcement.getCreationDate(),
                announcement.getAnnoncementType(),
                animalConverter.apply(announcement.getAnimal())
        );
    }
}
