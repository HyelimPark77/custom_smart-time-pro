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
        int r0 = R.id.btContactUs;
        LinearLayout r4 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.btContactUs);
        if (r4 == null) goto L17;
        r0 = R.id.btFAQ;
        LinearLayout r5 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.btFAQ);
        if (r5 == null) goto L17;
        r0 = R.id.btGoal;
        LinearLayout r6 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.btGoal);
        if (r6 == null) goto L17;
        r0 = R.id.btHelp;
        LinearLayout r7 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.btHelp);
        if (r7 == null) goto L17;
        r0 = R.id.btTalk;
        LinearLayout r8 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.btTalk);
        if (r8 == null) goto L17;
        r0 = R.id.iv_contact_us;
        ImageView r9 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_contact_us);
        if (r9 == null) goto L17;
        return new MeItemMiddleBinding((LinearLayout) rootView, r4, r5, r6, r7, r8, r9);
    L17:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static MeItemMiddleBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static MeItemMiddleBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.me_item_middle, parent, false);
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
