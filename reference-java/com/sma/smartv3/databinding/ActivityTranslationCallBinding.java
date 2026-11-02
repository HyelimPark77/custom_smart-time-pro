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
        LinearLayout linearLayout = (LinearLayout) rootView;
        int i = R.id.translation_call_me_language;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.translation_call_me_language);
        if (textView != null) {
            i = R.id.translation_call_other_language;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.translation_call_other_language);
            if (textView2 != null) {
                i = R.id.translation_call_video_call;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.translation_call_video_call);
                if (textView3 != null) {
                    i = R.id.translation_call_voice_call;
                    TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.translation_call_voice_call);
                    if (textView4 != null) {
                        return new ActivityTranslationCallBinding(linearLayout, linearLayout, textView, textView2, textView3, textView4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityTranslationCallBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityTranslationCallBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_translation_call, parent, false);
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
