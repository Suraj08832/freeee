package org.telegram.messenger;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class StickerAdapter extends RecyclerView.Adapter<StickerAdapter.StickerViewHolder> {
    private List<Sticker> stickers;
    private OnStickerClickListener listener;
    private StickerManager stickerManager;

    public interface OnStickerClickListener {
        void onStickerClick(Sticker sticker);
        void onPremiumStickerClick(Sticker sticker);
    }

    public StickerAdapter(List<Sticker> stickers, OnStickerClickListener listener, StickerManager stickerManager) {
        this.stickers = stickers;
        this.listener = listener;
        this.stickerManager = stickerManager;
    }

    @NonNull
    @Override
    public StickerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_sticker, parent, false);
        return new StickerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StickerViewHolder holder, int position) {
        Sticker sticker = stickers.get(position);
        holder.stickerName.setText(sticker.getName());
        
        // Load sticker image using your preferred image loading library
        // Glide.with(holder.itemView.getContext()).load(sticker.getImageUrl()).into(holder.stickerImage);
        
        if (sticker.isPremium()) {
            holder.premiumBadge.setVisibility(View.VISIBLE);
            holder.itemView.setOnClickListener(v -> {
                if (stickerManager.hasPremiumAccess(sticker.getId())) {
                    listener.onStickerClick(sticker);
                } else {
                    listener.onPremiumStickerClick(sticker);
                }
            });
        } else {
            holder.premiumBadge.setVisibility(View.GONE);
            holder.itemView.setOnClickListener(v -> listener.onStickerClick(sticker));
        }
    }

    @Override
    public int getItemCount() {
        return stickers.size();
    }

    static class StickerViewHolder extends RecyclerView.ViewHolder {
        ImageView stickerImage;
        TextView stickerName;
        View premiumBadge;

        StickerViewHolder(View itemView) {
            super(itemView);
            stickerImage = itemView.findViewById(R.id.sticker_image);
            stickerName = itemView.findViewById(R.id.sticker_name);
            premiumBadge = itemView.findViewById(R.id.premium_badge);
        }
    }
} 