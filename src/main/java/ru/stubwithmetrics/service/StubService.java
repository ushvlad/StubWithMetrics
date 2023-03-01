package ru.stubwithmetrics.service;

import ru.stubwithmetrics.model.GetHumanResponse;
import ru.stubwithmetrics.model.GetTokenResponse;
import ru.stubwithmetrics.model.PostHumanResponse;

public interface StubService {
    GetTokenResponse token(String sub);
    PostHumanResponse status();
    GetHumanResponse human();
}
