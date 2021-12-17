package be.pleckspaen.findanimal.announcement.service;

import be.pleckspaen.findanimal.animal.converter.AnimalConverter;
import be.pleckspaen.findanimal.animal.model.Animal;
import be.pleckspaen.findanimal.announcement.dao.IAnnoucementDao;
import be.pleckspaen.findanimal.announcement.model.Announcement;
import be.pleckspaen.findanimal.announcementapi.converter.AnnouncementConverter;
import be.pleckspaen.findanimal.announcementapi.dto.AnnouncementDisplayDto;
import be.pleckspaen.findanimal.announcementapi.dto.AnnouncementDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AnnouncementService {

    @Autowired
    private IAnnoucementDao dao;
    @Autowired
    private AnimalConverter animalConverter;
    @Autowired
    private AnnouncementConverter announcementConverter;

    public List<AnnouncementDisplayDto> getAnnouncementList() {
        return dao.findAll()
                .stream()
                .map(announcement -> announcementConverter.apply(announcement))
                .collect(Collectors.toList());
    }

    public AnnouncementDto addAnnouncement(AnnouncementDto announcementDto) {
        Announcement announcement = dao.save(new Announcement(
                announcementDto.getCreationDate(),
                announcementDto.getAnnoncementType(),
                new Animal(announcementDto.getAnimalDto().getType(),
                        announcementDto.getAnimalDto().getBreed(),
                        announcementDto.getAnimalDto().getColor(),
                        announcementDto.getAnimalDto().getState())
        ));
        return announcementConverter.applyDto(announcement);
    }
}
