package be.pleckspaen.findanimal.announcement.dao.impl;

import be.pleckspaen.findanimal.animal.model.Animal;
import be.pleckspaen.findanimal.animal.model.AnimalState;
import be.pleckspaen.findanimal.animal.model.AnimalType;
import be.pleckspaen.findanimal.announcement.dao.IAnnoucementDao;
import be.pleckspaen.findanimal.announcement.model.AnnoncementType;
import be.pleckspaen.findanimal.announcement.model.Announcement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Repository
public class AnnouncementDaoImpl implements IAnnoucementDao {

    Logger logger = LoggerFactory.getLogger(AnnouncementDaoImpl.class);

    private List<Announcement> announcements=new ArrayList<>();

    @PostConstruct
    private void onPostConstruct() {
        announcements.add(new Announcement(
                new Date(),
                AnnoncementType.LOST,
                new Animal(
                        AnimalType.CAT,
                        "persan",
                        "Rainbow",
                        AnimalState.ALIVE
                )
        ));
        announcements.add(new Announcement(
                new Date(),
                AnnoncementType.FOUND,
                new Animal(
                        AnimalType.DOG,
                        "Yorkshire",
                        "purple",
                        AnimalState.DEAD
                )
        ));
    }

    @Override
    public Announcement save(Announcement announcement) {
        announcements.add(announcement);
        return announcement;
    }

    @Override
    public List<Announcement> findAll() {
        return announcements;
    }

    @Override
    public Announcement findByDate(Date date) {
        return announcements.stream().filter(announcement -> announcement.getCreationDate()==date).findFirst().orElse(null); }
}
