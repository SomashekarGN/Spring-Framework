package com.xworkz.project1.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class MusicAlbum {

    @Value("007")
    private int albumId;
    @Value("Shape of YOU")
    private String albumName;
    @Value("Ed sheeren")
    private String artist;
}
