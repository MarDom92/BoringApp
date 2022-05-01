package pl.mardom92.BoringApp.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.mardom92.BoringApp.model.Activity;
import pl.mardom92.BoringApp.model.dto.ActivityDto;
import pl.mardom92.BoringApp.model.exception.ActivityError;
import pl.mardom92.BoringApp.model.exception.ActivityException;
import pl.mardom92.BoringApp.model.mapper.ActivityMapper;
import pl.mardom92.BoringApp.repository.ActivityRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ActivityService {

    private final RestTemplate restTemplate;
    private final ActivityMapper activityMapper;
    private final ActivityRepository activityRepository;

    public ActivityDto getActivityFromApi() {

        Activity activity = restTemplate.getForObject("https://www.boredapi.com/api/activity", Activity.class);

        return activityMapper.fromEntityToDto(activity);
    }

    public List<ActivityDto> getActivitiesFromDb() {

        List<Activity> activities = activityRepository.findAll();

        return activities.stream().map(activityMapper::fromEntityToDto).collect(Collectors.toList());
    }

    public ActivityDto getUniqueActivityDto() {

        ActivityDto activityDto = getActivityFromApi();
        String key = activityDto.getKey();
        boolean exist = existByKey(key);

        if (!exist) {
            activityRepository.save(activityMapper.fromDtoToEntity(activityDto));
            exist = true;
        } else {
            throw new ActivityException(ActivityError.ACTIVITY_EXIST);
        }

        return activityDto;
    }

    private boolean existByKey(String key) {
        return activityRepository.existsByKey(key);
    }
}
