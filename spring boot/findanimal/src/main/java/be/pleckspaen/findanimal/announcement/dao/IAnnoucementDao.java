package be.pleckspaen.findanimal.announcement.dao;

import be.pleckspaen.findanimal.announcement.model.Announcement;

import java.util.Date;
import java.util.List;

public interface IAnnoucementDao {

    Announcement save(Announcement announcement);
    List<Announcement> findAll();
    Announcement findByDate(Date date);

}
