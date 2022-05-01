package pl.mardom92.BoringApp.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.mardom92.BoringApp.model.dto.ActivityDto;
import pl.mardom92.BoringApp.service.ActivityService;

import java.util.List;

@RestController
@AllArgsConstructor
public class ActivityController {

    private final ActivityService activityService;

    @GetMapping("/api")
    public ActivityDto getActivityFromApi() {
        return activityService.getActivityFromApi();
    }

    @GetMapping("/db")
    public List<ActivityDto> getActivityFromDb() {
        return activityService.getActivitiesFromDb();
    }

    @GetMapping("/")
    public ActivityDto getUniqueActivityDto() {
        return activityService.getUniqueActivityDto();
    }
}
