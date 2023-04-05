package com.example.mydiaryfinal;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
import java.util.List;

public class PieChartActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_piechart);

        // 뒤로가기
        ImageView iv_back = findViewById(R.id.iv_back);
        iv_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


        PieChart pieChart = findViewById(R.id.piechart);

        pieChart.setUsePercentValues(true);
        pieChart.getDescription().setEnabled(false);
        pieChart.setExtraOffsets(5,10,5,5);

        pieChart.setDragDecelerationFrictionCoef(0.95f);

        pieChart.setDrawHoleEnabled(false);
        pieChart.setCenterTextSize(18);
        pieChart.setHoleColor(Color.BLACK);
        pieChart.setTransparentCircleRadius(61f);



        int i;
        double per[] = {49.9, 31.1, 9.9,9.1};
        String money[] = {"교통비", "식비", "숙박비", "기타"};


        List<PieEntry> Values = new ArrayList();
        for(i = 0; i < per.length;i++){
            Values.add(new PieEntry((float) per[i], (String) money[i]));
        }

        Description description = new Description();
        description.setText("여행 비용 통계");       // 라벨
        description.setTextSize(15);
        pieChart.setDescription(description);

        PieDataSet dataSet = new PieDataSet(Values, "money");
        dataSet.setSliceSpace(3f);
        dataSet.setSelectionShift(5f);
        final int[] MY_COLORS = {Color.rgb(32,127,177), Color.rgb(249,209,105), Color.rgb(0,190,159), Color.rgb(223,223,223) };
        ArrayList<Integer> colors = new ArrayList<Integer>();
        for(int c: MY_COLORS) colors.add(c);
        dataSet.setColors(colors);

        PieData data = new PieData(dataSet);
        data.setValueTextSize(15);
        data.setValueTextColor(Color.BLACK);

        pieChart.setData(data);

    }
}
