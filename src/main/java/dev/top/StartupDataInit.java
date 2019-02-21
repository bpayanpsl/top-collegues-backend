package dev.top;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import dev.top.entities.Collegue;
import dev.top.entities.Version;
import dev.top.repos.CollegueRepo;
import dev.top.repos.VersionRepo;

@Component
public class StartupDataInit {

    @Autowired
    VersionRepo versionRepo;
    
    @Autowired
    CollegueRepo collegueRepo;

    @EventListener(ContextRefreshedEvent.class)
    public void init() {

        this.versionRepo.save(new Version("v1"));
        this.versionRepo.save(new Version("v2"));
        this.versionRepo.save(new Version("v3"));
        this.versionRepo.save(new Version("v4"));
        
        this.collegueRepo.save(new Collegue("Benny",2,"http://i.imgur.com/Zvh8fXX.jpg"));
        this.collegueRepo.save(new Collegue("Benna",1,"http://fc08.deviantart.net/fs71/i/2010/180/b/f/MEMES__MEMES_EVERYWHERE_by_CaptainWii.png"));
        this.collegueRepo.save(new Collegue("Benno",0,"https://pbs.twimg.com/media/CdN4vE2VIAAul4R.jpg"));
        this.collegueRepo.save(new Collegue("Bennu",9,"https://pbs.twimg.com/media/DYrZZckVoAACGz9.jpg:large"));

    }
}
