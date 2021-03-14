package com.pjs.demo.service;



import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;


@AllArgsConstructor
@Service
public class TestService {

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
    public Map<String, Object> makeTestJsonPractice(){
        Map<String, Object> result = new HashMap<>();

        ArrayList<HashMap> data = new ArrayList<>();
        HashMap<String, String> data1 = new HashMap<>();
        data1.put("id","1");
        data1.put("name","티모");
        data1.put("count","10");
        HashMap<String, String> data2 = new HashMap<>();
        data2.put("id","2");
        data2.put("name", "가렌");
        data2.put("count", "1");
        HashMap<String, String> data3 = new HashMap<>();
        data3.put("id","3");
        data3.put("name", "다리우스");
        data3.put("count", "14");
        HashMap<String, String> data4 = new HashMap<>();
        data2.put("id","4");
        data2.put("name", "시비르");
        data2.put("count", "3");
        result.put("resultcode", 200);
        data.add(data1);
        data.add(data2);
        data.add(data3);
        data.add(data4);
        result.put("data", data);

        return result;



    }

}