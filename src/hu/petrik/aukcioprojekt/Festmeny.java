package hu.petrik.aukcioprojekt;

import java.time.LocalDateTime;

public class Festmeny {

    private String cim;
    private String festo;
    private String stilus;
    private Integer licitekSzama;
    private Integer legmagasabbLicti;
    private LocalDateTime legutolsoLicit;
    private Boolean elKellt;


    public Festmeny(String cim, String festo, String stilus) {
        this.cim = cim;
        this.festo = festo;
        this.stilus = stilus;
    }
}
