package pl.mardom92.BoringApp.model.builder;

import pl.mardom92.BoringApp.model.Activity;

public class ActivityBuilder {

    public long id;
    public String activity;
    public String type;
    public Integer participants;
    public Double price;
    public String link;
    public String key;
    public Double accessibility;

    public ActivityBuilder withId(long id) {
        this.id = id;
        return this;
    }

    public ActivityBuilder withActivity(String activity) {
        this.activity = activity;
        return this;
    }

    public ActivityBuilder withType(String type) {
        this.type = type;
        return this;
    }

    public ActivityBuilder withParticipants(Integer participants) {
        this.participants = participants;
        return this;
    }

    public ActivityBuilder withPrice(Double price) {
        this.price = price;
        return this;
    }

    public ActivityBuilder withLink(String link) {
        this.link = link;
        return this;
    }

    public ActivityBuilder withKey(String key) {
        this.key = key;
        return this;
    }

    public ActivityBuilder withAccessibility(Double accessibility) {
        this.accessibility = accessibility;
        return this;
    }

    public Activity build() {
        Activity act = new Activity();

        act.setId(id);
        act.setActivity(activity);
        act.setType(type);
        act.setParticipants(participants);
        act.setPrice(price);
        act.setLink(link);
        act.setKey(key);
        act.setAccessibility(accessibility);

        return act;
    }
}
