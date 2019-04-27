package com.example.magazine;

import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class ProductViewHolder extends RecyclerView.ViewHolder {

    private CardView layout;
    private TextView titleTextView;
    private TextView contentTextView;

    public ProductViewHolder(View itemView) {
        super(itemView);
        layout = itemView.findViewById(R.id.list);
        titleTextView = itemView.findViewById(R.id.title);
        contentTextView = itemView.findViewById(R.id.content);
    }

    public void bind(Product product) {
        titleTextView.setText(product.getName());
        contentTextView.setText(product.getCompany());
    }

    public void bind(Product product, final long id, final OnClickListener.OnItemClickLisneter listener) {
        bind(product);
        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onClick(v, id);
            }
        });
    }

}
