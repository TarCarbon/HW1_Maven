package org.goit;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public Main() {
    }

    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        Mydata myData = new Mydata();
        myData.setName("Тарас");
        myData.setSurname("Наконечний");
        System.out.println(objectMapper.writeValueAsString(myData));
    }
}
