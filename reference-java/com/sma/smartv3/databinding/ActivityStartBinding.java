package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityStartBinding implements ViewBinding {

    @NonNull
    public final RelativeLayout QQRl;

    @NonNull
    public final RelativeLayout faceBookRl;

    @NonNull
    public final RelativeLayout googleRl;

    @NonNull
    private final RelativeLayout rootView;

    /* JADX INFO: renamed from: rv */
    @NonNull
    public final NestedScrollView f51003rv;

    @NonNull
    public final RelativeLayout twitterRl;

    @NonNull
    public final RelativeLayout weChatRl;

    @NonNull
    public final RelativeLayout weiBoRl;

    private ActivityStartBinding(@NonNull RelativeLayout rootView, @NonNull RelativeLayout QQRl, @NonNull RelativeLayout faceBookRl, @NonNull RelativeLayout googleRl, @NonNull NestedScrollView rv, @NonNull RelativeLayout twitterRl, @NonNull RelativeLayout weChatRl, @NonNull RelativeLayout weiBoRl) {
        this.rootView = rootView;
        this.QQRl = QQRl;
        this.faceBookRl = faceBookRl;
        this.googleRl = googleRl;
        this.f51003rv = rv;
        this.twitterRl = twitterRl;
        this.weChatRl = weChatRl;
        this.weiBoRl = weiBoRl;
    }

    @NonNull
    public static ActivityStartBinding bind(@NonNull View rootView) {
        int i = R.id.QQRl;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.QQRl);
        if (relativeLayout != null) {
            i = R.id.faceBookRl;
            RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.faceBookRl);
            if (relativeLayout2 != null) {
                i = R.id.googleRl;
                RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.googleRl);
                if (relativeLayout3 != null) {
                    i = R.id.f51422rv;
                    NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(rootView, R.id.f51422rv);
                    if (nestedScrollView != null) {
                        i = R.id.twitterRl;
                        RelativeLayout relativeLayout4 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.twitterRl);
                        if (relativeLayout4 != null) {
                            i = R.id.weChatRl;
                            RelativeLayout relativeLayout5 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.weChatRl);
                            if (relativeLayout5 != null) {
                                i = R.id.weiBoRl;
                                RelativeLayout relativeLayout6 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.weiBoRl);
                                if (relativeLayout6 != null) {
                                    return new ActivityStartBinding((RelativeLayout) rootView, relativeLayout, relativeLayout2, relativeLayout3, nestedScrollView, relativeLayout4, relativeLayout5, relativeLayout6);
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
    public static ActivityStartBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityStartBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_start, parent, false);
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
