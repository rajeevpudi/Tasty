package com.rajeev.tasty.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.rajeev.tasty.R;
import com.rajeev.tasty.login.ImportFragment;

import org.json.JSONArray;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomHolder> {

    private Context context;
    private JSONArray jsonArray;

    public CustomAdapter(@NonNull Context context) {
        //constructor values can't used in other methods.
        this.context = context;
    }

    public CustomAdapter(ImportFragment context) {

    }

    @NonNull
    @Override
    public CustomHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //get xml here to diaplay

        View layout = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_custom,
                parent, false);

        return new CustomHolder(layout);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomHolder holder, int position) {

        try {
            holder.tvid.setText("ID : " + jsonArray.getJSONObject(position).optInt("ID"));
            holder.tvfname.setText("FIRSTNAME : " + jsonArray.getJSONObject(position).optString("FIRSTNAME"));
            holder.tvlname.setText("LASTNAME : " + jsonArray.getJSONObject(position).optString("LASTNAME"));
            holder.tvbuilding.setText("BUILDING : " + jsonArray.getJSONObject(position).optString("BUILDING"));
            holder.tvphone.setText("PHONE : " + jsonArray.getJSONObject(position).optString("PHONE"));
            holder.tvemail.setText("EMAIL : " + jsonArray.getJSONObject(position).optString("EMAIL"));
            holder.tvdept.setText("DEPT : " + jsonArray.getJSONObject(position).optString("DEPT"));
            holder.tvposition.setText("POSITION : " + jsonArray.getJSONObject(position).optString("POSITION"));
            holder.tvurl.setText("URL : " + jsonArray.getJSONObject(position).optString("URL"));

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public int getItemCount() {
        return jsonArray.length();
    }

    public void setItems(JSONArray jsonArray) {
        this.jsonArray = jsonArray;
    }

    public class CustomHolder extends RecyclerView.ViewHolder {

        TextView tvid, tvfname, tvlname, tvbuilding, tvphone, tvemail, tvdept, tvposition, tvurl;

        public CustomHolder(View itemView) {
            super(itemView);

            tvid = itemView.findViewById(R.id.tv_id);
            tvfname = itemView.findViewById(R.id.tv_fname);
            tvlname = itemView.findViewById(R.id.tv_lname);
            tvbuilding = itemView.findViewById(R.id.tv_building);
            tvphone = itemView.findViewById(R.id.tv_phone);
            tvemail = itemView.findViewById(R.id.tv_email);
            tvdept = itemView.findViewById(R.id.tv_dept);
            tvposition = itemView.findViewById(R.id.tv_position);
            tvurl = itemView.findViewById(R.id.tv_url);


        }
    }
}
