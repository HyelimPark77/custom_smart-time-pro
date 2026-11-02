package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ShareCardPopEditBinding implements ViewBinding {

    @NonNull
    public final ImageView action2;

    @NonNull
    public final EditText edt;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final View shareEditBlackView;

    @NonNull
    public final View shareEditWhiteView;

    private ShareCardPopEditBinding(@NonNull LinearLayout rootView, @NonNull ImageView action2, @NonNull EditText edt, @NonNull View shareEditBlackView, @NonNull View shareEditWhiteView) {
        this.rootView = rootView;
        this.action2 = action2;
        this.edt = edt;
        this.shareEditBlackView = shareEditBlackView;
        this.shareEditWhiteView = shareEditWhiteView;
    }

    @NonNull
    public static ShareCardPopEditBinding bind(@NonNull View rootView) {
        int i = R.id.action2;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.action2);
        if (imageView != null) {
            i = R.id.edt;
            EditText editText = (EditText) ViewBindings.findChildViewById(rootView, R.id.edt);
            if (editText != null) {
                i = R.id.share_edit_black_view;
                View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.share_edit_black_view);
                if (viewFindChildViewById != null) {
                    i = R.id.share_edit_white_view;
                    View viewFindChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.share_edit_white_view);
                    if (viewFindChildViewById2 != null) {
                        return new ShareCardPopEditBinding((LinearLayout) rootView, imageView, editText, viewFindChildViewById, viewFindChildViewById2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ShareCardPopEditBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ShareCardPopEditBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.share_card_pop_edit, parent, false);
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
