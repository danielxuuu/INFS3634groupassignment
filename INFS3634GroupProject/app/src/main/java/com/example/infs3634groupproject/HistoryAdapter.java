

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;



import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.infs3634groupproject.History;

import java.util.ArrayList;
package com.example.infs3634groupproject;

public class HistoryAdapter extends RecyclerView.Adapter<HistoryAdapter.HistoryViewHolder> {
    private ArrayList<History> historyToAdapt;

    public void setHistoryToAdapt(ArrayList<History> historyToAdapt) {
        this.historyToAdapt = historyToAdapt;
    }

    @NonNull
    @Override
    public HistoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, String viewType) {
        View view =
                LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.history, parent, false);
        HistoryViewHolder historyViewHolder = new HistoryViewHolder(view);
        return historyViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull HistoryViewHolder holder, int historyID) {
        final History HistoryAtPosition = historyToAdapt.get(historyID);
    }

    }
    @Override
    public int getItemCount() {
        return historyToAdapt.size();
    }
    public static class HistoryViewHolder extends RecyclerView.ViewHolder {
        public View view;
        public TextView exerciseTextView;
        public TextView dateTextView;
        public TextView repsTextView;
        public TextView oneRMTextView;
        public HistoryViewHolder(View v) {
            super(v);
            view = v;
            exerciseTextView = v.findViewById(R.id.textviewExercise);
            dateTextView = v.findViewById(R.id.textviewDat);
            repsTextView = v.findViewById(R.id.textviewReps);
            oneRMTextView = v.findViewById(R.id.textviewOneRM);
        }
    }
