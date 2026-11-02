package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityContactUsBinding implements ViewBinding {

    @NonNull
    public final LinearLayout facebookLl;

    @NonNull
    public final View facebookLlLine;

    @NonNull
    public final LinearLayout lineLl;

    @NonNull
    public final View lineLlLine;

    @NonNull
    public final View qqLine;

    @NonNull
    public final LinearLayout qqLl;

    @NonNull
    public final LinearLayout rootView;

    @NonNull
    private final LinearLayout rootView_;

    @NonNull
    public final LinearLayout whatsAppLl;

    @NonNull
    public final View whatsAppLlLine;

    @NonNull
    public final View wxLine;

    @NonNull
    public final LinearLayout wxLl;

    private ActivityContactUsBinding(@NonNull LinearLayout rootView_, @NonNull LinearLayout facebookLl, @NonNull View facebookLlLine, @NonNull LinearLayout lineLl, @NonNull View lineLlLine, @NonNull View qqLine, @NonNull LinearLayout qqLl, @NonNull LinearLayout rootView, @NonNull LinearLayout whatsAppLl, @NonNull View whatsAppLlLine, @NonNull View wxLine, @NonNull LinearLayout wxLl) {
        this.rootView_ = rootView_;
        this.facebookLl = facebookLl;
        this.facebookLlLine = facebookLlLine;
        this.lineLl = lineLl;
        this.lineLlLine = lineLlLine;
        this.qqLine = qqLine;
        this.qqLl = qqLl;
        this.rootView = rootView;
        this.whatsAppLl = whatsAppLl;
        this.whatsAppLlLine = whatsAppLlLine;
        this.wxLine = wxLine;
        this.wxLl = wxLl;
    }

    @NonNull
    public static ActivityContactUsBinding bind(@NonNull View rootView) {
        int i = R.id.facebookLl;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.facebookLl);
        if (linearLayout != null) {
            i = R.id.facebookLlLine;
            View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.facebookLlLine);
            if (viewFindChildViewById != null) {
                i = R.id.lineLl;
                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.lineLl);
                if (linearLayout2 != null) {
                    i = R.id.lineLlLine;
                    View viewFindChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.lineLlLine);
                    if (viewFindChildViewById2 != null) {
                        i = R.id.qqLine;
                        View viewFindChildViewById3 = ViewBindings.findChildViewById(rootView, R.id.qqLine);
                        if (viewFindChildViewById3 != null) {
                            i = R.id.qqLl;
                            LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.qqLl);
                            if (linearLayout3 != null) {
                                LinearLayout linearLayout4 = (LinearLayout) rootView;
                                i = R.id.whatsAppLl;
                                LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.whatsAppLl);
                                if (linearLayout5 != null) {
                                    i = R.id.whatsAppLlLine;
                                    View viewFindChildViewById4 = ViewBindings.findChildViewById(rootView, R.id.whatsAppLlLine);
                                    if (viewFindChildViewById4 != null) {
                                        i = R.id.wxLine;
                                        View viewFindChildViewById5 = ViewBindings.findChildViewById(rootView, R.id.wxLine);
                                        if (viewFindChildViewById5 != null) {
                                            i = R.id.wxLl;
                                            LinearLayout linearLayout6 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.wxLl);
                                            if (linearLayout6 != null) {
                                                return new ActivityContactUsBinding(linearLayout4, linearLayout, viewFindChildViewById, linearLayout2, viewFindChildViewById2, viewFindChildViewById3, linearLayout3, linearLayout4, linearLayout5, viewFindChildViewById4, viewFindChildViewById5, linearLayout6);
                                            }
                                        }
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
    public static ActivityContactUsBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityContactUsBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_contact_us, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView_;
    }
}
