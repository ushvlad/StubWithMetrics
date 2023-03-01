package ru.stubwithmetrics.service;


import org.springframework.stereotype.Service;
import ru.stubwithmetrics.model.GetHumanResponse;
import ru.stubwithmetrics.model.GetTokenResponse;
import ru.stubwithmetrics.model.PostHumanResponse;

import java.util.Calendar;

import java.util.Random;
import java.util.UUID;

@Service
public class StubServiceImpl implements StubService{
    private final static java.text.SimpleDateFormat DATE_FORMAT = new java.text.SimpleDateFormat("dd.MM.yyyy");

    @Override
    public GetTokenResponse token(String sub){
        String randomToken = UUID.randomUUID().toString().replace("-", "");
        return new GetTokenResponse(sub, randomToken);
    }
    @Override
    public PostHumanResponse status(){return new PostHumanResponse();}
    @Override
    public GetHumanResponse human(){
        String name, surname, birthDate;
        Random r = new Random();
        Calendar c = Calendar.getInstance();
        /*name = getHumanResponse.getName().replaceAll("\\d", "");
        surname = getHumanResponse.getSurname().replaceAll("\\d", "");
        birthDate = new SimpleDateFormat("dd.MM.yyyy").format(new Date());
        return new GetHumanResponse(name, surname, birthDate);*/
        name = randomString();
        surname = randomString();
        c.set(Calendar.MONTH, Math.abs(r.nextInt()) % 12);
        c.set(Calendar.DAY_OF_MONTH, Math.abs(r.nextInt()) % 30);
        c.set(Calendar.YEAR, 1900 + (int)Math.round(Math.random() * (2023 - 1900)));
        c.setLenient(true);
        birthDate = DATE_FORMAT.format(c.getTime());
        return new GetHumanResponse(name, surname, birthDate);
    }
    static String randomString(){
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        StringBuffer randomString = new StringBuffer();
        for(int i = 0; i < 10; i++){
            int randomIndex = (int)(Math.random() * alphabet.length());
            randomString.append(alphabet.charAt(randomIndex));
        }
        return randomString.toString();
    }
}
