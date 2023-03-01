package ru.stubwithmetrics.model;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GetHumanResponse {

    private String name, surname, birthDate;
    /*public String getName(){ return name; }
    public void setName(String name){ this.name = name; }
    public String getSurname(){ return surname; }
    public void setSurname(String surname){ this.surname = surname; }
    public String getBirthDate(){ return birthDate; }
    public void setBirthDate(String birthDate){ this.birthDate = birthDate; }

    public GetHumanResponse(String name, String surname, String birthDate){
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
    }
    public GetHumanResponse(){}*/
}
