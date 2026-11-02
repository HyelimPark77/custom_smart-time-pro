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
        int r0 = R.id.base_share_cardView;
        CardView r4 = (CardView) ViewBindings.findChildViewById(rootView, R.id.base_share_cardView);
        if (r4 == null) goto L21;
        r0 = R.id.btn_share;
        Button r5 = (Button) ViewBindings.findChildViewById(rootView, R.id.btn_share);
        if (r5 == null) goto L21;
        r0 = R.id.edt_nickname;
        PFMedium r6 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.edt_nickname);
        if (r6 == null) goto L21;
        r0 = R.id.iv_avatar;
        ImageViewRound r7 = (ImageViewRound) ViewBindings.findChildViewById(rootView, R.id.iv_avatar);
        if (r7 == null) goto L21;
        r0 = R.id.share_card_route_image;
        ImageView r8 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.share_card_route_image);
        if (r8 == null) goto L21;
        r0 = R.id.tv_calories_value;
        PFMedium r9 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_calories_value);
        if (r9 == null) goto L21;
        r0 = R.id.tv_dateTime;
        PFMedium r10 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_dateTime);
        if (r10 == null) goto L21;
        r0 = R.id.tv_detail_name;
        PFMedium r11 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_detail_name);
        if (r11 == null) goto L21;
        return new FragmentSportDetailShareCardCaloriesBinding((LinearLayout) rootView, r4, r5, r6, r7, r8, r9, r10, r11);
    L21:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static FragmentSportDetailShareCardCaloriesBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static FragmentSportDetailShareCardCaloriesBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.fragment_sport_detail_share_card_calories, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
