package pl.mardom92.BoringApp.model.builder.dto;

import pl.mardom92.BoringApp.model.dto.ActivityDto;

public class ActivityDtoBuilder {

    public String activity;
    public String type;
    public Integer participants;
    public Double price;
    public String link;
    public String key;
    public Double accessibility;

    public ActivityDtoBuilder withActivity(String activity) {
        this.activity = activity;
        return this;
    }

    public ActivityDtoBuilder withType(String type) {
        this.type = type;
        return this;
    }

    public ActivityDtoBuilder withParticipants(Integer participants) {
        this.participants = participants;
        return this;
    }

    public ActivityDtoBuilder withPrice(Double price) {
        this.price = price;
        return this;
    }

    public ActivityDtoBuilder withLink(String link) {
        this.link = link;
        return this;
    }

    public ActivityDtoBuilder withKey(String key) {
        this.key = key;
        return this;
    }

    public ActivityDtoBuilder withAccessibility(Double accessibility) {
        this.accessibility = accessibility;
        return this;
    }

    public ActivityDto build() {
        ActivityDto activityDto = new ActivityDto();

        activityDto.setActivity(activity);
        activityDto.setType(type);
        activityDto.setParticipants(participants);
        activityDto.setPrice(price);
        activityDto.setLink(link);
        activityDto.setKey(key);
        activityDto.setAccessibility(accessibility);

        return activityDto;
    }
}
