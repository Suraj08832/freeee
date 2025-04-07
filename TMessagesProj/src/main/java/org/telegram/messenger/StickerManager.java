package org.telegram.messenger;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.List;

public class StickerManager {
    private static final String PREFS_NAME = "StickerPrefs";
    private static final String PREMIUM_STICKERS_KEY = "premium_stickers";
    private static StickerManager instance;
    private SharedPreferences preferences;
    private List<Sticker> allStickers;
    private List<Sticker> premiumStickers;

    private StickerManager(Context context) {
        preferences = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        initializeStickers();
    }

    public static synchronized StickerManager getInstance(Context context) {
        if (instance == null) {
            instance = new StickerManager(context);
        }
        return instance;
    }

    private void initializeStickers() {
        allStickers = new ArrayList<>();
        premiumStickers = new ArrayList<>();
        
        // Add some sample stickers
        allStickers.add(new Sticker("1", "Happy", "sticker1.png", false, 0));
        allStickers.add(new Sticker("2", "Sad", "sticker2.png", false, 0));
        allStickers.add(new Sticker("3", "Premium Happy", "premium1.png", true, 100));
        allStickers.add(new Sticker("4", "Premium Sad", "premium2.png", true, 100));
        
        // Separate premium stickers
        for (Sticker sticker : allStickers) {
            if (sticker.isPremium()) {
                premiumStickers.add(sticker);
            }
        }
    }

    public List<Sticker> getAllStickers() {
        return allStickers;
    }

    public List<Sticker> getPremiumStickers() {
        return premiumStickers;
    }

    public boolean hasPremiumAccess(String stickerId) {
        return preferences.getBoolean(PREMIUM_STICKERS_KEY + "_" + stickerId, false);
    }

    public void grantPremiumAccess(String stickerId) {
        preferences.edit().putBoolean(PREMIUM_STICKERS_KEY + "_" + stickerId, true).apply();
    }
} 