package com.pjs.demo.service;



import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.tags.HtmlEscapeTag;

import javax.swing.text.html.HTML;
import java.lang.reflect.Array;
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
        data1.put("name","??????");
        data1.put("count","10");
        HashMap<String, String> data2 = new HashMap<>();
        data2.put("id","2");
        data2.put("name", "??????");
        data2.put("count", "1");
        HashMap<String, String> data3 = new HashMap<>();
        data3.put("id","3");
        data3.put("name", "????????????");
        data3.put("count", "14");
        HashMap<String, String> data4 = new HashMap<>();
        data2.put("id","4");
        data2.put("name", "?????????");
        data2.put("count", "3");
        result.put("resultcode", 200);
        data.add(data1);
        data.add(data2);
        data.add(data3);
        data.add(data4);
        result.put("data", data);

        return result;



    }
    public Map<String, Object> makeTestBrands(){
        Map<String, Object> result = new HashMap<>();


        HashMap<String, String> data1 = new HashMap<>();
        data1.put("br_name", "?????????");
        data1.put("br_eng_name", "CARHARTT");
        data1.put("br_desc_html", " CARHARTT (??? ??????)??? ?????? ????????? ???????????? ???????????? ????????? ??????????????? ???????????????. ?????? ??? ????????? ?????? ?????? ????????? ???????????? ?????? ????????????????????????. ????????? ????????????, ?????? ???????????? ?????? ??? ????????? ????????? ????????? ????????? ?????? ????????? ???????????? ???????????? ???????????? ????????? ??????????????? ?????? ?????? ??????????????????.");
        data1.put("br_banner_img_url", " https://s3.ap-northeast-2.amazonaws.com/hhp-brand-resource/new/CARHARTT/BRAND_TOP_CARHARTT_PC.jpg");
        data1.put("br_mbanner_img_url", "https : //s3.ap -?????? -2.amazonaws.");
        result.put("code","200");
        result.put("data",data1);
        return result;
    }
    public Map<String, Object> makeTestitemList(){
        Map<String, Object> result = new HashMap<>();
        Map<String, Object> result1 = new HashMap<>();

        HashMap<String, String> paging = new HashMap<>();
        paging.put("curPage","1");
        paging.put("page_list_size", "10");
        paging.put("page_size", "20");
        paging.put("totalPage", "1");
        paging.put("totalSet","1");
        paging.put("curSet","1");
        paging.put("startPage","1");
        paging.put("endPage","10");
        paging.put("no","0");
        result1.put("code","200");
        result1.put("data",result);
        result.put("paging", paging);
        ArrayList<Object> itemList=  new ArrayList<>();
        HashMap<String, String> itemList1= new HashMap<>();
        itemList1.put("br_code","ROTHCO");
        itemList1.put("it_id","ZM689037");
        itemList1.put("it_name","ROTHCO ????????? ?????? ?????? W.Camo");
        itemList1.put("br_name ","????????? ");
        itemList1.put("br_eng_name ","ROTHCO ");
        itemList1.put("it_price ","25000");
        itemList1.put("it_sale_price ","25000");
        itemList1.put("it_badge_new ","0");
        itemList1.put("it_badge_best ","0");
        itemList1.put("it_badge_oversea","0");
        itemList1.put("it_img1"," https://hhp-item-resource.s3.ap-northeast-2.amazonaws.com/ZM/68/ZM689037/07_01.jpg");
        HashMap<String, String> itemList2 = new HashMap<>();
        itemList2.put("br_code","ROTHCO");
        itemList2.put("it_id","LE117715");
        itemList2.put("it_name","ROTHCO ????????? ?????? ?????? ??????");
        itemList2.put("br_name ","????????? ");
        itemList2.put("br_eng_name ","ROTHCO ");
        itemList2.put("it_price ","25000");
        itemList2.put("it_sale_price ","25000");
        itemList2.put("it_badge_new ","0");
        itemList2.put("it_badge_best ","0");
        itemList2.put("it_badge_oversea","0");
        itemList2.put("it_img1"," https://hhp-item-resource.s3.ap-northeast-2.amazonaws.com/LE/11/LE117715/06_01.jpg");
        HashMap<String,String> itemList3 = new HashMap<>();
        itemList3.put("br_code","ROTHCO");
        itemList3.put("it_id","RR904641");
        itemList3.put("it_name","?????? ????????? ?????? ?????? 4 ??????");
        itemList3.put("br_name ","????????? ");
        itemList3.put("br_eng_name ","ROTHCO ");
        itemList3.put("it_price ","99000");
        itemList3.put("it_sale_price ","99000");
        itemList3.put("it_badge_new ","0");
        itemList3.put("it_badge_best ","0");
        itemList3.put("it_badge_oversea","0");
        itemList3.put("it_img1","  https : //hhp-item-resource.s3.ap-northeast-2.amazonaws. com / RR / 90 / RR904641 / ROTHCOETC120.jpg");
        itemList.add(itemList1);
        itemList.add(itemList2);
        itemList.add(itemList3);
        result1.put("itemList",itemList);
        return result1;
    }

}