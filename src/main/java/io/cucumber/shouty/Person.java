package io.cucumber.shouty;

import java.util.ArrayList;
import java.util.List;

public class Person {
    public void moveTo(Integer distance){
    }
    public void shout(String message){
    }
    public List<String> getMessageHeard(String message){
        List<String> result=new ArrayList<String>();
        result.add(message);
        return result;
    }
}
