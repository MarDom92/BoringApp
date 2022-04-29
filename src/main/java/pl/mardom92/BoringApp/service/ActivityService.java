package pl.mardom92.BoringApp.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.mardom92.BoringApp.model.Activity;

@Service
@RequiredArgsConstructor
public class ActivityService {

    private final RestTemplate restTemplate;

    public Activity getActivity() {

        Activity activity = restTemplate.getForObject("https://www.boredapi.com/api/activity", Activity.class);

        return activity;
    }
}
