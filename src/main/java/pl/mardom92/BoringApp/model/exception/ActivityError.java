package pl.mardom92.BoringApp.model.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ActivityError {

    ACTIVITY_EXIST("The activity hasn't been added to the database, because it already exists. Please, try again.");

    private final String message;
}
