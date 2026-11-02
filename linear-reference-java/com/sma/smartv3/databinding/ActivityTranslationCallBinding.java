package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityTranslationCallBinding implements ViewBinding {

    @NonNull
    public final LinearLayout rootView;

    @NonNull
    private final LinearLayout rootView_;

    @NonNull
    public final TextView translationCallMeLanguage;

    @NonNull
    public final TextView translationCallOtherLanguage;

    @NonNull
    public final TextView translationCallVideoCall;

    @NonNull
    public final TextView translationCallVoiceCall;

    private ActivityTranslationCallBinding(@NonNull LinearLayout rootView_, @NonNull LinearLayout rootView, @NonNull TextView translationCallMeLanguage, @NonNull TextView translationCallOtherLanguage, @NonNull TextView translationCallVideoCall, @NonNull TextView translationCallVoiceCall) {
        this.rootView_ = rootView_;
        this.rootView = rootView;
        this.translationCallMeLanguage = translationCallMeLanguage;
        this.translationCallOtherLanguage = translationCallOtherLanguage;
        this.translationCallVideoCall = translationCallVideoCall;
        this.translationCallVoiceCall = translationCallVoiceCall;
    }

    @NonNull
    public static ActivityTranslationCallBinding bind(@NonNull View rootView) {
        LinearLayout r1 = (LinearLayout) rootView;
        int r0 = R.id.translation_call_me_language;
        TextView r3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.translation_call_me_language);
        if (r3 == null) goto L13;
        r0 = R.id.translation_call_other_language;
        TextView r4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.translation_call_other_language);
        if (r4 == null) goto L13;
        r0 = R.id.translation_call_video_call;
        TextView r5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.translation_call_video_call);
        if (r5 == null) goto L13;
        r0 = R.id.translation_call_voice_call;
        TextView r6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.translation_call_voice_call);
        if (r6 == null) goto L13;
        return new ActivityTranslationCallBinding(r1, r1, r3, r4, r5, r6);
    L13:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityTranslationCallBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityTranslationCallBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_translation_call, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView_;
    }
}
