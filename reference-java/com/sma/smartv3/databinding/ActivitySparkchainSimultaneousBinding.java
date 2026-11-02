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
        int i = R.id.sparkChainOriginTextTv;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.sparkChainOriginTextTv);
        if (textView != null) {
            i = R.id.sparkChainRecordIv;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.sparkChainRecordIv);
            if (imageView != null) {
                i = R.id.sparkChainTranslationTextTv;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.sparkChainTranslationTextTv);
                if (textView2 != null) {
                    return new ActivitySparkchainSimultaneousBinding((LinearLayout) rootView, textView, imageView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivitySparkchainSimultaneousBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivitySparkchainSimultaneousBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_sparkchain_simultaneous, parent, false);
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
