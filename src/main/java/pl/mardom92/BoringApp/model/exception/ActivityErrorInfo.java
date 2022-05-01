package pl.mardom92.BoringApp.model.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class ActivityErrorInfo {

    private final String message;
}
