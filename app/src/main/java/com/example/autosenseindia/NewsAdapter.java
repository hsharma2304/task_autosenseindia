package com.example.autosenseindia;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;

public class NewsAdapter extends ArrayAdapter<News> {
    public NewsAdapter(Context context, List<News> newses) {
        super(context, 0, newses);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_list, parent, false);
        }
        News currentNews = getItem(position);
        TextView topicView = listItemView.findViewById(R.id.news_topic);
        topicView.setText(currentNews.getmTopic());
        TextView titleVies = listItemView.findViewById(R.id.news_title);
        titleVies.setText(currentNews.getmTitle());
        return listItemView;
    }
}
