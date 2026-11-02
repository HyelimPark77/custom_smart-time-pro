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
        int r0 = R.id.edt_nickname;
        PFMedium r1 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.edt_nickname);
        if (r1 == null) goto L11;
        r0 = R.id.iv_avatar;
        ImageViewRound r2 = (ImageViewRound) ViewBindings.findChildViewById(rootView, R.id.iv_avatar);
        if (r2 == null) goto L11;
        r0 = R.id.userID;
        PFMedium r3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.userID);
        if (r3 == null) goto L11;
        return new MeItemAvatarBinding((RelativeLayout) rootView, r1, r2, r3);
    L11:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static MeItemAvatarBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static MeItemAvatarBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.me_item_avatar, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
