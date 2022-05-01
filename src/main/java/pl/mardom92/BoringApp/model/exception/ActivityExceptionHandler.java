package pl.mardom92.BoringApp.model.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ActivityExceptionHandler {

    @ExceptionHandler(value = ActivityException.class)
    public ResponseEntity<ActivityErrorInfo> handlerActivityException(ActivityException activityException) {

        HttpStatus httpStatus = HttpStatus.MULTI_STATUS;

        return ResponseEntity.status(httpStatus).body(new ActivityErrorInfo(activityException.getActivityError().getMessage()));
    }
}
