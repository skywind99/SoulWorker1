package com.namyangju.soulworker;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView noticeListView;
    private NoticeListAdpter adapter;
    private List<Notice> noticeList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        noticeListView = (ListView) findViewById(R.id.noticeListView);
        noticeList = new ArrayList<Notice>();
        noticeList.add(new Notice("공지사항입니다.", "유딩개발자", "2017-03-13"));
        noticeList.add(new Notice("공지사항입니다.", "유딩개발자", "2017-03-13"));
        noticeList.add(new Notice("공지사항입니다.", "유딩개발자", "2017-03-13"));
        noticeList.add(new Notice("공지사항입니다", "유딩개발자", "2017-03-13"));
        noticeList.add(new Notice("공지사항입니다", "유딩개발자", "2017-03-13"));
        noticeList.add(new Notice("공지사항입니다", "유딩개발자", "2017-03-13"));
        noticeList.add(new Notice("공지사항입니다", "유딩개발자", "2017-03-13"));
        noticeList.add(new Notice("공지사항입니다", "유딩개발자", "2017-03-13"));
        noticeList.add(new Notice("공지사항입니다", "유딩개발자", "2017-03-13"));
        noticeList.add(new Notice("공지사항입니다", "유딩개발자", "2017-03-13"));
        adapter = new NoticeListAdpter(getApplicationContext(), noticeList);
        noticeListView.setAdapter(adapter);

        final LinearLayout notice = (LinearLayout) findViewById(R.id.notice);

    }
}
