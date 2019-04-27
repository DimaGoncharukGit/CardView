package com.example.magazine;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.magazine.R;

import java.util.List;

class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private OnClickListener onClickListener;

    private LayoutInflater inflater;
    private List<Product> products;


    Adapter(Context context, List<Product> products) {
        this.onClickListener = onClickListener;
        this.products = products;
        this.inflater = LayoutInflater.from(context);
    }
    @Override
    public Adapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(Adapter.ViewHolder holder, int position) {
        Product product = products.get(position);
        holder.imageView.setImageResource(product.getImage());
        holder.nameView.setText(product.getName());
        holder.companyView.setText(product.getCompany());
    }

    @Override
    public int getItemCount() {
        return products.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        final ImageView imageView;
        final TextView nameView, companyView;

        ViewHolder(View view){
            super(view);
            imageView = (ImageView)view.findViewById(R.id.image);
            companyView = view.findViewById(R.id.content);
            nameView = view.findViewById(R.id.title);

        }
    }

    public interface OnClickListener {
        void onCardClick(Product product);
    }
}