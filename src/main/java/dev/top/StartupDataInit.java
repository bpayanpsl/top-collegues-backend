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
        
        this.collegueRepo.save(new Collegue("Benny",2,"aaa.jpg"));
        this.collegueRepo.save(new Collegue("Benna",1,"bbb.jpg"));
        this.collegueRepo.save(new Collegue("Benno",0,"ccc.jpg"));
        this.collegueRepo.save(new Collegue("Bennu",9,"ddd.jpg"));

    }
}
