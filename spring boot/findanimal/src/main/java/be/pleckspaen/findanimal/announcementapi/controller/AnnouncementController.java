package be.pleckspaen.findanimal.announcementapi.controller;


import be.pleckspaen.findanimal.announcement.service.AnnouncementService;
import be.pleckspaen.findanimal.announcementapi.dto.AnnouncementDisplayDto;
import be.pleckspaen.findanimal.announcementapi.dto.AnnouncementDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "${spring.data.rest.base-path}/announcement")
public class AnnouncementController {

    @Autowired
    private AnnouncementService announcementService;

    @GetMapping
    public List<AnnouncementDisplayDto> getAllAnnouncements(){return announcementService.getAnnouncementList();}

    @PostMapping(value="/addAnnouncement")
    public ResponseEntity<Object> addAnnouncement(@RequestBody AnnouncementDto announcementDto){
        AnnouncementDto announcement = announcementService.addAnnouncement(announcementDto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

}
