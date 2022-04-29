package pl.mardom92.BoringApp.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.mardom92.BoringApp.model.Activity;
import pl.mardom92.BoringApp.model.dto.ActivityDto;
import pl.mardom92.BoringApp.model.mapper.ActivityMapper;

@Service
@RequiredArgsConstructor
public class ActivityService {

    private final RestTemplate restTemplate;
    private final ActivityMapper activityMapper;

    public ActivityDto getActivityFromApi() {

        Activity activity = restTemplate.getForObject("https://www.boredapi.com/api/activity", Activity.class);

        return activityMapper.fromEntityToDto(activity);
    }
}
