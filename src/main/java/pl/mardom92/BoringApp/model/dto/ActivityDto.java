package pl.mardom92.BoringApp.model.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ActivityDto {

    public String activity;
    public String type;
    public Integer participants;
    public Double price;
    public String link;
    public String key;
    public Double accessibility;
}
