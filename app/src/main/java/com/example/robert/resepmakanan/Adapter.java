package com.example.robert.resepmakanan;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by Robert on 04/10/2017.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.Holder> {

    private Context ctx;
    private List<resepMakanan> reseplist;

    public Adapter(Context ct,List<resepMakanan> resep){
        this.ctx = ct;
        this.reseplist = resep;
    }

    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.barisresep,parent,false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(Holder holder, int position) {
        final resepMakanan data = reseplist.get(position);
        holder.judul.setText(data.getNama());
        holder.desk.setText(data.getDesk());
        holder.gmbr.setImageResource(data.getGmbr());
        holder.judul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(ctx,detailactivity.class);
                it.putExtra("resep.namamasakan",data.getNama());
                it.putExtra("resep.carabuat",data.getCara_buat());
                it.putExtra("resep.gambar",data.getGmbr());
                ctx.startActivity(it);
            }
        });
    }

    @Override
    public int getItemCount() {
        return reseplist.size();
    }

    public class Holder extends RecyclerView.ViewHolder{
        TextView judul,desk;
        ImageView gmbr;
        public Holder(View itemView) {
            super(itemView);
            judul = (TextView)itemView.findViewById(R.id.judul);
            desk = (TextView)itemView.findViewById(R.id.deskripsi);
            gmbr = (ImageView)itemView.findViewById(R.id.imageView);
        }
    }
}
