package com.example.gokulan.mylist;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class MatchAdapter extends RecyclerView.Adapter<MatchAdapter.MyViewHolder>
{
    List<Match> matchList;

    public MatchAdapter(List<Match> li)
    {
        this.matchList = li;
    }

    @NonNull
    @Override
    public MatchAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View matchView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.match_layout, parent, false);
        return new MyViewHolder(matchView);
    }

    @Override
    public void onBindViewHolder(@NonNull MatchAdapter.MyViewHolder holder, int position) {
        Match match = matchList.get(position);
        //Match match = matchList.get(matchList.size()-1-position);
        holder.t1.setText(match.team1);
        holder.t2.setText(match.team2);
    }

    @Override
    public int getItemCount() {
        return matchList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder
    {
        TextView t1, t2;

        public MyViewHolder(View itemView) {
            super(itemView);

            t1 = itemView.findViewById(R.id.team1);
            t2 = itemView.findViewById(R.id.team2);
        }
    }
}
