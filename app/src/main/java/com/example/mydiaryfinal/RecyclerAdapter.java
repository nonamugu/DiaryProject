package com.example.mydiaryfinal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.sql.Array;
import java.sql.DatabaseMetaData;
import java.util.ArrayList;

import javax.xml.transform.Result;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.CustomViewHolder> {

    Context mContext;
    ArrayList<RecycleModel> arrayList;
    DataBaseHelper mDatabaseHelper;                 // 데이터베이스 헬퍼 클라스

    public RecyclerAdapter(ArrayList<RecycleModel> arrayList) {
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public RecyclerAdapter.CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // 아이템 뷰가 최초로 생성이 될 때 호출되는 곳
        mContext = parent.getContext();
        mDatabaseHelper = new DataBaseHelper(mContext);
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.content_list_item, parent, false);
        CustomViewHolder holder = new CustomViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.CustomViewHolder holder, int position) {
        holder.rcy_Time.setText(arrayList.get(position).getRcy_Time());
        holder.rcy_Context.setText(arrayList.get(position).getRcy_Context());
        holder.rcy_Money.setText(arrayList.get(position).getRcy_Money());

        holder.itemView.setTag(position);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String rcyTable = holder.rcy_Context.getText().toString();
                Toast.makeText(view.getContext(), rcyTable, Toast.LENGTH_SHORT).show();
            }
        });

        holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                remove(holder.getAdapterPosition());
                return true;
            }
        });

    }

    @Override
    public int getItemCount() {
        return (null != arrayList ? arrayList.size() : 0);

    }

    public void remove(int position){
        try {
          arrayList.remove(position);
          notifyItemRemoved(position);
        } catch (IndexOutOfBoundsException ex){
            ex.printStackTrace();
        }
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {

        protected EditText rcy_Time, rcy_Context, rcy_Money;
        protected RadioGroup mGroup;
        protected RadioButton mRbcar, mRbcook, mRbhouse, mRbetc;
        protected TextView mTxtype;

        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);
            this.rcy_Time = (EditText) itemView.findViewById(R.id.rcy_Time);
            this.rcy_Context = (EditText) itemView.findViewById(R.id.rcy_Context);
            this.rcy_Money = (EditText) itemView.findViewById(R.id.rcy_Money);

            this.mGroup = (RadioGroup) itemView.findViewById(R.id.money_type);
            this.mRbcar = (RadioButton) itemView.findViewById(R.id.rb_car);
            this.mRbhouse = (RadioButton) itemView.findViewById(R.id.rb_house);
            this.mRbcook = (RadioButton) itemView.findViewById(R.id.rb_cook);
            this.mRbetc = (RadioButton) itemView.findViewById(R.id.rb_etc);
            this.mTxtype = (TextView) itemView.findViewById(R.id.tx_type);

        }
    }
}
