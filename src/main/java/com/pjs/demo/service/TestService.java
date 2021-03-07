package com.pjs.demo.service;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.*;


@AllArgsConstructor
@Service
public class TestService {//비지니스 로직 처리

    public String testService() {
        return "test service";
    }

    public int calculate(int number1,int number2,String type) {
        if(type.equals("plus")){
            return number1+number2;
        }
        else if(type.equals("minus")){
            return number1-number2;
        }
        else if(type.equals("mul")) {
            return number1 * number2;
        }
        else if(type.equals("div")) {
            return number1 / number2;
        }
        return number1+number2;
    }
    public Map makeTestJson(){
        HashMap<String, String> data = new HashMap<>();
        data.put("idx","1");
        data.put("name","donald");
        data.put("age","6");
        data.put("country","korea");

        return data;
    }
    public ArrayList<HashMap> makeTestJsonList() {
        HashMap<String, String> data = new HashMap<>();
        data.put("idx","1");
        data.put("name","donald");
        data.put("age","6");
        data.put("country","korea");
        HashMap<String, String> data2 = new HashMap<>();
        data2.put("idx","2");
        data2.put("name","donald");
        data2.put("age","18");
        data2.put("country","korea");
        HashMap<String, String> data3 = new HashMap<>();
        data3.put("idx","3");
        data3.put("name","donald");
        data3.put("age","10");
        data3.put("country","korea");


        ArrayList<HashMap> returnData = new ArrayList<>();
        returnData.add(data);
        returnData.add(data2);
        returnData.add(data3);
        return returnData;
    }

}