package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.ImageViewRound;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class MeItemAvatarBinding implements ViewBinding {

    @NonNull
    public final PFMedium edtNickname;

    @NonNull
    public final ImageViewRound ivAvatar;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final PFMedium userID;

    private MeItemAvatarBinding(@NonNull RelativeLayout rootView, @NonNull PFMedium edtNickname, @NonNull ImageViewRound ivAvatar, @NonNull PFMedium userID) {
        this.rootView = rootView;
        this.edtNickname = edtNickname;
        this.ivAvatar = ivAvatar;
        this.userID = userID;
    }

    @NonNull
    public static MeItemAvatarBinding bind(@NonNull View rootView) {
        int i = R.id.edt_nickname;
        PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.edt_nickname);
        if (pFMedium != null) {
            i = R.id.iv_avatar;
            ImageViewRound imageViewRound = (ImageViewRound) ViewBindings.findChildViewById(rootView, R.id.iv_avatar);
            if (imageViewRound != null) {
                i = R.id.userID;
                PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.userID);
                if (pFMedium2 != null) {
                    return new MeItemAvatarBinding((RelativeLayout) rootView, pFMedium, imageViewRound, pFMedium2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static MeItemAvatarBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static MeItemAvatarBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.me_item_avatar, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
