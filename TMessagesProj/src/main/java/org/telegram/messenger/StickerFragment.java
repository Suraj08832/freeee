package org.telegram.messenger;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class StickerFragment extends Fragment implements StickerAdapter.OnStickerClickListener {
    private RecyclerView stickerRecyclerView;
    private StickerAdapter stickerAdapter;
    private StickerManager stickerManager;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_stickers, container, false);
        
        stickerRecyclerView = view.findViewById(R.id.sticker_recycler_view);
        stickerManager = StickerManager.getInstance(requireContext());
        
        setupRecyclerView();
        
        return view;
    }

    private void setupRecyclerView() {
        List<Sticker> stickers = stickerManager.getAllStickers();
        stickerAdapter = new StickerAdapter(stickers, this, stickerManager);
        
        stickerRecyclerView.setLayoutManager(new GridLayoutManager(requireContext(), 3));
        stickerRecyclerView.setAdapter(stickerAdapter);
    }

    @Override
    public void onStickerClick(Sticker sticker) {
        // Handle regular sticker click
        Toast.makeText(requireContext(), "Sticker clicked: " + sticker.getName(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onPremiumStickerClick(Sticker sticker) {
        // Show premium purchase dialog
        showPremiumPurchaseDialog(sticker);
    }

    private void showPremiumPurchaseDialog(Sticker sticker) {
        // Implement your premium purchase dialog here
        // This could be a custom dialog or integration with Google Play Billing
        Toast.makeText(requireContext(), "Premium sticker: " + sticker.getName() + " - Price: " + sticker.getPrice(), Toast.LENGTH_SHORT).show();
    }
} 