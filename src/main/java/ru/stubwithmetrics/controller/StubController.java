package ru.stubwithmetrics.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import ru.stubwithmetrics.model.GetHumanResponse;
import ru.stubwithmetrics.model.GetTokenResponse;
import ru.stubwithmetrics.model.PostHumanResponse;
import ru.stubwithmetrics.service.StubService;

@RestController
public class StubController {

    private final StubService stubService;

    @Autowired
    public StubController(StubService stubService){ this.stubService = stubService; }

    @GetMapping(value = "/access/getToken")
    public Object token(@RequestHeader(value = "sub", required = false) String sub){
        final GetTokenResponse getTokenResponse = stubService.token(sub);

        return sub != null
                //? new ResponseEntity<>(getTokenResponse, HttpStatus.OK)
                ? ResponseEntity.ok().body(getTokenResponse)
                : ResponseEntity.notFound();
    }

    @PostMapping(value = "/addInformation/human")
    public ResponseEntity<PostHumanResponse> status(){
        final PostHumanResponse postHumanResponse = stubService.status();
        /*HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("New-header", "New-value");
        return ResponseEntity.ok().headers(httpHeaders).body(postHumanResponse);*/
        return ResponseEntity.ok().body(postHumanResponse);
    }

    @GetMapping(value = "/getInformation/human")
    public ResponseEntity<GetHumanResponse> human(){
        final GetHumanResponse getHumanResponse = stubService.human();

        return ResponseEntity.ok().body(getHumanResponse);
    }
}
