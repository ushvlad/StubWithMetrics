package ru.stubwithmetrics.model;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GetTokenResponse {

    private String sub, token;

   /*public String getSub(){ return sub; }
    public void setSub(String sub){ this.sub = sub; }
    public String getToken(){ return token; }
    public void setToken(String token){ this.token = token; }

    public GetTokenResponse(String sub, String token){
        this.sub = sub;
        this.token = token;
    }*/
}
