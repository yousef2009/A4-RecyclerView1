package com.example.a4_1.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a4_1.R;
import com.example.a4_1.model.Planet;

import java.util.ArrayList;

public class PlanetAdapter extends RecyclerView.Adapter<PlanetAdapter.myViewHolder> {

    private Activity activity;
    private ArrayList<Planet> data;

    public PlanetAdapter(Activity activity, ArrayList<Planet> data) {
        this.activity = activity;
        this.data = data;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View root = LayoutInflater.from(activity).inflate(R.layout.planet_item, parent, false);
        return new myViewHolder((root));
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, final int position) {

        holder.etName.setText(data.get(position).getName());
        holder.etDistance.setText(data.get(position).getDistance());
        holder.etGravity.setText(data.get(position).getGravity());
        holder.etDiameter.setText(data.get(position).getDiameter());

        holder.etName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(activity, "This is "+data.get(position).getName() + " Planet",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class myViewHolder extends RecyclerView.ViewHolder {

        public TextView etName;
        public TextView etDistance;
        public TextView etGravity;
        public TextView etDiameter;

        public myViewHolder(@NonNull View itemView) {
            super(itemView);
            etName = itemView.findViewById(R.id.etName);
            etDistance = itemView.findViewById(R.id.etDistance);
            etGravity = itemView.findViewById(R.id.etGravity);
            etDiameter = itemView.findViewById(R.id.etDiameter);
        }
    }
}
