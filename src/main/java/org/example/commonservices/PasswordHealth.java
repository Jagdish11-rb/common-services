package org.example.commonservices;

import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PasswordHealth {

    private String credential;
    private boolean health;

    public PasswordHealth checkPasswordHealth(String credential){
        this.credential=credential;
        if(credential.contains("123")){
            this.health=false;
        }
        return new PasswordHealth(this.credential,this.health);
    }

    public void display(String str){
        System.out.println(str);
    }
}
