package pl.mardom92.BoringApp.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Getter
@Setter
@Entity
public class Activity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;
    public String activity;
    public String type;
    public Integer participants;
    public Double price;
    public String link;
    public String key;
    public Double accessibility;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Activity)) return false;
        Activity activity1 = (Activity) o;
        return getId() == activity1.getId() && Objects.equals(getActivity(), activity1.getActivity()) && Objects.equals(getType(), activity1.getType()) && Objects.equals(getParticipants(), activity1.getParticipants()) && Objects.equals(getPrice(), activity1.getPrice()) && Objects.equals(getLink(), activity1.getLink()) && Objects.equals(getKey(), activity1.getKey()) && Objects.equals(getAccessibility(), activity1.getAccessibility());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getActivity(), getType(), getParticipants(), getPrice(), getLink(), getKey(), getAccessibility());
    }
}
