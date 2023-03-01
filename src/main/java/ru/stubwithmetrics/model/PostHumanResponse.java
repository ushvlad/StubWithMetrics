package ru.stubwithmetrics.model;

import lombok.Data;

@Data
public class PostHumanResponse {

    private String status;

   /* public String getStatus(){ return status; }
    public void setStatus(String token){ this.status = status; }*/

    public PostHumanResponse(){ this.status = "success"; }
}
