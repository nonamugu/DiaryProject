package com.example.mydiaryfinal;

import java.io.Serializable;

/**
 * 다이어리 리스트 아이템을 구성하는 모델 (표본)
 */

public class DiaryModel implements Serializable {

    int id;                 // 게시물 고유 Id 값
    String title;           // 게시물 제목
    String title2;          // 여행지 입력란
    String content;         // 게시물 내용
    int weatherType;        // 날씨 값 (0:맑음 1:흐림뒤갬 2:흐림 3:매우흐림 4:비 5:눈)
    String userDate;        // 사용자가 지정한 날짜(일시)
    String userDate2;
    String writeDate;       // 게시글 작성한 날짜(일시)
    String waveIcon;

    // 첫번째 목록
    String Time1;
    String Context1;
    String Money1;

    // rcy 목록
    String Time2;
    String Context2;
    String Money2;

    // getter & setter 게터세터
    public int getId() { return id; }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public String getTitle2() { return  title2; }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setTitle2(String title2) {this.title2 = title2;}

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getWeatherType() {
        return weatherType;
    }

    public void setWeatherType(int weatherType) {
        this.weatherType = weatherType;
    }

    public String getUserDate() {
        return userDate;
    }

    public String getUserDate2() {
        return userDate2;
    }

    public void setUserDate(String userDate) {
        this.userDate = userDate;
    }

    public void setUserDate2(String userDate2) {this.userDate2 = userDate2;}

    public String getWriteDate() {
        return writeDate;
    }

    public void setWriteDate(String writeDate) {
        this.writeDate = writeDate;
    }

    public String getWaveIcon() { return waveIcon; }

    public void setWaveIcon(String waveIcon) { this.waveIcon = waveIcon; }

    // 목록
    public String getTime1() { return Time1; }

    public void setTime1(String time1) { Time1 = time1; }

    public String getContext1() { return Context1; }

    public void setContext1(String context1) { Context1 = context1; }

    public String getMoney1() { return Money1; }

    public void setMoney1(String money1) { Money1 = money1; }

    public String getTime2() { return Time2; }

    public void setTime2(String time2) { Time2 = time2; }

    public String getContext2() { return Context2; }

    public void setContext2(String context2) { Context2 = context2; }

    public String getMoney2() { return Money2; }

    public void setMoney2(String money2) { Money2 = money2; }

}
