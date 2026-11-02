package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.ImageViewRound;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class FragmentSportDetailShareCardCaloriesBinding implements ViewBinding {

    @NonNull
    public final CardView baseShareCardView;

    @NonNull
    public final Button btnShare;

    @NonNull
    public final PFMedium edtNickname;

    @NonNull
    public final ImageViewRound ivAvatar;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final ImageView shareCardRouteImage;

    @NonNull
    public final PFMedium tvCaloriesValue;

    @NonNull
    public final PFMedium tvDateTime;

    @NonNull
    public final PFMedium tvDetailName;

    private FragmentSportDetailShareCardCaloriesBinding(@NonNull LinearLayout rootView, @NonNull CardView baseShareCardView, @NonNull Button btnShare, @NonNull PFMedium edtNickname, @NonNull ImageViewRound ivAvatar, @NonNull ImageView shareCardRouteImage, @NonNull PFMedium tvCaloriesValue, @NonNull PFMedium tvDateTime, @NonNull PFMedium tvDetailName) {
        this.rootView = rootView;
        this.baseShareCardView = baseShareCardView;
        this.btnShare = btnShare;
        this.edtNickname = edtNickname;
        this.ivAvatar = ivAvatar;
        this.shareCardRouteImage = shareCardRouteImage;
        this.tvCaloriesValue = tvCaloriesValue;
        this.tvDateTime = tvDateTime;
        this.tvDetailName = tvDetailName;
    }

    @NonNull
    public static FragmentSportDetailShareCardCaloriesBinding bind(@NonNull View rootView) {
        int i = R.id.base_share_cardView;
        CardView cardView = (CardView) ViewBindings.findChildViewById(rootView, R.id.base_share_cardView);
        if (cardView != null) {
            i = R.id.btn_share;
            Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.btn_share);
            if (button != null) {
                i = R.id.edt_nickname;
                PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.edt_nickname);
                if (pFMedium != null) {
                    i = R.id.iv_avatar;
                    ImageViewRound imageViewRound = (ImageViewRound) ViewBindings.findChildViewById(rootView, R.id.iv_avatar);
                    if (imageViewRound != null) {
                        i = R.id.share_card_route_image;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.share_card_route_image);
                        if (imageView != null) {
                            i = R.id.tv_calories_value;
                            PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_calories_value);
                            if (pFMedium2 != null) {
                                i = R.id.tv_dateTime;
                                PFMedium pFMedium3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_dateTime);
                                if (pFMedium3 != null) {
                                    i = R.id.tv_detail_name;
                                    PFMedium pFMedium4 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_detail_name);
                                    if (pFMedium4 != null) {
                                        return new FragmentSportDetailShareCardCaloriesBinding((LinearLayout) rootView, cardView, button, pFMedium, imageViewRound, imageView, pFMedium2, pFMedium3, pFMedium4);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentSportDetailShareCardCaloriesBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentSportDetailShareCardCaloriesBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_sport_detail_share_card_calories, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
