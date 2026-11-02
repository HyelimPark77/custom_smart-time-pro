package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class MeItemMiddleBinding implements ViewBinding {

    @NonNull
    public final LinearLayout btContactUs;

    @NonNull
    public final LinearLayout btFAQ;

    @NonNull
    public final LinearLayout btGoal;

    @NonNull
    public final LinearLayout btHelp;

    @NonNull
    public final LinearLayout btTalk;

    @NonNull
    public final ImageView ivContactUs;

    @NonNull
    private final LinearLayout rootView;

    private MeItemMiddleBinding(@NonNull LinearLayout rootView, @NonNull LinearLayout btContactUs, @NonNull LinearLayout btFAQ, @NonNull LinearLayout btGoal, @NonNull LinearLayout btHelp, @NonNull LinearLayout btTalk, @NonNull ImageView ivContactUs) {
        this.rootView = rootView;
        this.btContactUs = btContactUs;
        this.btFAQ = btFAQ;
        this.btGoal = btGoal;
        this.btHelp = btHelp;
        this.btTalk = btTalk;
        this.ivContactUs = ivContactUs;
    }

    @NonNull
    public static MeItemMiddleBinding bind(@NonNull View rootView) {
        int i = R.id.btContactUs;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.btContactUs);
        if (linearLayout != null) {
            i = R.id.btFAQ;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.btFAQ);
            if (linearLayout2 != null) {
                i = R.id.btGoal;
                LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.btGoal);
                if (linearLayout3 != null) {
                    i = R.id.btHelp;
                    LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.btHelp);
                    if (linearLayout4 != null) {
                        i = R.id.btTalk;
                        LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.btTalk);
                        if (linearLayout5 != null) {
                            i = R.id.iv_contact_us;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_contact_us);
                            if (imageView != null) {
                                return new MeItemMiddleBinding((LinearLayout) rootView, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, imageView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static MeItemMiddleBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static MeItemMiddleBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.me_item_middle, parent, false);
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
