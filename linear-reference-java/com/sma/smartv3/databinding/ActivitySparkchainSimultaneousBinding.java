package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivitySparkchainSimultaneousBinding implements ViewBinding {

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView sparkChainOriginTextTv;

    @NonNull
    public final ImageView sparkChainRecordIv;

    @NonNull
    public final TextView sparkChainTranslationTextTv;

    private ActivitySparkchainSimultaneousBinding(@NonNull LinearLayout rootView, @NonNull TextView sparkChainOriginTextTv, @NonNull ImageView sparkChainRecordIv, @NonNull TextView sparkChainTranslationTextTv) {
        this.rootView = rootView;
        this.sparkChainOriginTextTv = sparkChainOriginTextTv;
        this.sparkChainRecordIv = sparkChainRecordIv;
        this.sparkChainTranslationTextTv = sparkChainTranslationTextTv;
    }

    @NonNull
    public static ActivitySparkchainSimultaneousBinding bind(@NonNull View rootView) {
        int r0 = R.id.sparkChainOriginTextTv;
        TextView r1 = (TextView) ViewBindings.findChildViewById(rootView, R.id.sparkChainOriginTextTv);
        if (r1 == null) goto L11;
        r0 = R.id.sparkChainRecordIv;
        ImageView r2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.sparkChainRecordIv);
        if (r2 == null) goto L11;
        r0 = R.id.sparkChainTranslationTextTv;
        TextView r3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.sparkChainTranslationTextTv);
        if (r3 == null) goto L11;
        return new ActivitySparkchainSimultaneousBinding((LinearLayout) rootView, r1, r2, r3);
    L11:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivitySparkchainSimultaneousBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivitySparkchainSimultaneousBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_sparkchain_simultaneous, parent, false);
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
