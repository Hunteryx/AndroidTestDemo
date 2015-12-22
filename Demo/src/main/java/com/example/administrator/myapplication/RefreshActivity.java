package com.example.administrator.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.example.administrator.myapplication.listenenr.XrefershListviewListener;
import com.example.administrator.myapplication.view.XrefershListview;

import butterknife.Bind;
import butterknife.ButterKnife;

public class RefreshActivity extends AppCompatActivity implements XrefershListviewListener {

    @Bind(R.id.toolbar)
    Toolbar mToolbar;
    @Bind(R.id.XrefershListview)
    XrefershListview mXrefershListview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_refresh);
        ButterKnife.bind(this);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1);
        for (int i = 0; i < 10; i++) {
            adapter.add("string1"+i);
        }
        mXrefershListview.setAdapter(adapter);
        mXrefershListview.setXrefershListviewListener(this);
    }
    //刷新的监听
    @Override
    public void onRefresh() {
        Toast.makeText(RefreshActivity.this,"刷新啦！！",Toast.LENGTH_LONG).show();
    }

    @Override
    public void onLoadMore() {

    }
}
