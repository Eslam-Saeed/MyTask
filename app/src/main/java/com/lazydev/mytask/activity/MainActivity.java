package com.lazydev.mytask.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import com.lazydev.mytask.R;
import com.lazydev.mytask.adapter.ItemAdapter;
import com.lazydev.mytask.controller.APIClient;
import com.lazydev.mytask.controller.ApiInterface;
import com.lazydev.mytask.model.Item;
import com.lazydev.mytask.model.ItemResponse;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    ListView listViewData;
    ItemAdapter mItemAdapter;
    ApiInterface mApiInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listViewData = (ListView) findViewById(R.id.listView_dataList);
        mApiInterface = APIClient.getInterfaceInstacne();

        Call<List<ItemResponse>> call = mApiInterface.getMethod("elkservice", "allauctions", "0");
        call.enqueue(new Callback<List<ItemResponse>>() {
            @Override
            public void onResponse(Call<List<ItemResponse>> call, Response<List<ItemResponse>> response) {
                if (response.isSuccessful()) {
                    mItemAdapter = new ItemAdapter(MainActivity.this, getItemsFromResponse(response));
                    listViewData.setAdapter(mItemAdapter);
                } else {
                    Toast.makeText(MainActivity.this, "Check your Internet!", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<List<ItemResponse>> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Check your Internet!", Toast.LENGTH_SHORT).show();
            }
        });

    }

    ArrayList<Item> getItemsFromResponse(Response<List<ItemResponse>> response) {
        ArrayList<Item> listItems = new ArrayList<>();
        for (int i = 0; i < response.body().size(); i++) {
            for (int j = 0; j < response.body().get(i).getList().size(); j++) {
                listItems.add(response.body().get(i).getList().get(j))   ;
            }
        }
        return listItems;
    }
}
