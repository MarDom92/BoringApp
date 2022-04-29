package pl.mardom92.BoringApp.model.mapper;

import org.springframework.stereotype.Component;
import pl.mardom92.BoringApp.model.Activity;
import pl.mardom92.BoringApp.model.builder.ActivityBuilder;
import pl.mardom92.BoringApp.model.builder.dto.ActivityDtoBuilder;
import pl.mardom92.BoringApp.model.dto.ActivityDto;

import java.util.Objects;

@Component
public class ActivityMapper {

    public Activity fromDtoToEntity(ActivityDto activityDto) {

        if (activityDto == null) {
            return null;
        }

        ActivityBuilder activityBuilder = new ActivityBuilder();

        if (Objects.nonNull(activityDto.getActivity())) {
            activityBuilder.withActivity(activityDto.getActivity());
        }

        if (Objects.nonNull(activityDto.getType())) {
            activityBuilder.withType(activityDto.getType());
        }

        if (Objects.nonNull(activityDto.getParticipants())) {
            activityBuilder.withParticipants(activityDto.getParticipants());
        }

        if (Objects.nonNull(activityDto.getPrice())) {
            activityBuilder.withPrice(activityDto.getPrice());
        }

        if (Objects.nonNull(activityDto.getLink())) {
            activityBuilder.withLink(activityDto.getLink());
        }

        if (Objects.nonNull(activityDto.getKey())) {
            activityBuilder.withKey(activityDto.getKey());
        }

        if (Objects.nonNull(activityDto.getAccessibility())) {
            activityBuilder.withAccessibility(activityDto.getAccessibility());
        }

        return activityBuilder.build();
    }

    public ActivityDto fromEntityToDto(Activity activity) {

        if (activity == null) {
            return null;
        }

        ActivityDtoBuilder activityDtoBuilder = new ActivityDtoBuilder();

        if (Objects.nonNull(activity.getActivity())) {
            activityDtoBuilder.withActivity(activity.getActivity());
        }

        if (Objects.nonNull(activity.getType())) {
            activityDtoBuilder.withType(activity.getType());
        }

        if (Objects.nonNull(activity.getParticipants())) {
            activityDtoBuilder.withParticipants(activity.getParticipants());
        }

        if (Objects.nonNull(activity.getPrice())) {
            activityDtoBuilder.withPrice(activity.getPrice());
        }

        if (Objects.nonNull(activity.getLink())) {
            activityDtoBuilder.withLink(activity.getLink());
        }

        if (Objects.nonNull(activity.getKey())) {
            activityDtoBuilder.withKey(activity.getKey());
        }

        if (Objects.nonNull(activity.getAccessibility())) {
            activityDtoBuilder.withAccessibility(activity.getAccessibility());
        }

        return activityDtoBuilder.build();
    }
}
