package com.newyearongole.guru;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.huxq17.swipecardsview.SwipeCardsView;
import com.newyearongole.guru.Adapter.CardAdapter;
import com.newyearongole.guru.Model.Model;

import java.util.ArrayList;
import java.util.List;

public class swipeview extends AppCompatActivity {


    private SwipeCardsView swipeCardsView;
    private List<Model> modelList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swipeview);

        swipeCardsView = (SwipeCardsView) findViewById(R.id.swipeCardView);
        swipeCardsView.retainLastCard(false);
        swipeCardsView.enableSwipe(true);
        getData();
    }

    private void getData() {
        modelList.add(new Model("",R.drawable.two));
        modelList.add(new Model("",R.drawable.one));
        modelList.add(new Model("",R.drawable.secondone));
        modelList.add(new Model("",R.drawable.secondsecon));
        modelList.add(new Model("",R.drawable.three));
        modelList.add(new Model("",R.drawable.four));
        modelList.add(new Model("",R.drawable.fivetwo));
        modelList.add(new Model("",R.drawable.five));
        modelList.add(new Model("",R.drawable.six));
        modelList.add(new Model("",R.drawable.sixsecond));
        modelList.add(new Model("",R.drawable.seven));
        modelList.add(new Model("",R.drawable.eight));

        CardAdapter cardAdapter = new CardAdapter(modelList,this);
        swipeCardsView.setAdapter(cardAdapter);
    }
}
