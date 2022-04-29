package pl.mardom92.BoringApp.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.mardom92.BoringApp.model.Activity;
import pl.mardom92.BoringApp.service.ActivityService;

@RestController
@AllArgsConstructor
@RequestMapping(path = "/")
public class ActivityController {

    private final ActivityService activityService;

    @GetMapping()
    public Activity getActivity() {
        return activityService.getActivity();
    }
}
