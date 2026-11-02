package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityAiDialogueTranslationBinding implements ViewBinding {

    @NonNull
    public final ImageView abhTitleRight;

    @NonNull
    public final TextView dialogueTranslationLeftTv;

    @NonNull
    public final TextView dialogueTranslationRightTv;

    @NonNull
    public final ImageView imgChangeBig;

    @NonNull
    public final TextView leftRecordDetail;

    @NonNull
    public final ImageView leftRecordingImg;

    @NonNull
    public final LinearLayout llLeftLanguage;

    @NonNull
    public final LinearLayout llRightLanguage;

    @NonNull
    public final LinearLayout llTopSelectLanguage;

    @NonNull
    public final ImageView popRecordingImg;

    @NonNull
    public final RecyclerView recyclerView;

    @NonNull
    public final TextView rightRecordDetail;

    @NonNull
    public final ImageView rightRecordingImg;

    @NonNull
    public final LinearLayout rootView;

    @NonNull
    private final LinearLayout rootView_;

    @NonNull
    public final ImageView transformLanguageImg;

    @NonNull
    public final ImageView translateLeftIv;

    @NonNull
    public final TextView tvLeftSelectLanguage;

    @NonNull
    public final TextView tvRightSelectLanguage;

    private ActivityAiDialogueTranslationBinding(@NonNull LinearLayout rootView_, @NonNull ImageView abhTitleRight, @NonNull TextView dialogueTranslationLeftTv, @NonNull TextView dialogueTranslationRightTv, @NonNull ImageView imgChangeBig, @NonNull TextView leftRecordDetail, @NonNull ImageView leftRecordingImg, @NonNull LinearLayout llLeftLanguage, @NonNull LinearLayout llRightLanguage, @NonNull LinearLayout llTopSelectLanguage, @NonNull ImageView popRecordingImg, @NonNull RecyclerView recyclerView, @NonNull TextView rightRecordDetail, @NonNull ImageView rightRecordingImg, @NonNull LinearLayout rootView, @NonNull ImageView transformLanguageImg, @NonNull ImageView translateLeftIv, @NonNull TextView tvLeftSelectLanguage, @NonNull TextView tvRightSelectLanguage) {
        this.rootView_ = rootView_;
        this.abhTitleRight = abhTitleRight;
        this.dialogueTranslationLeftTv = dialogueTranslationLeftTv;
        this.dialogueTranslationRightTv = dialogueTranslationRightTv;
        this.imgChangeBig = imgChangeBig;
        this.leftRecordDetail = leftRecordDetail;
        this.leftRecordingImg = leftRecordingImg;
        this.llLeftLanguage = llLeftLanguage;
        this.llRightLanguage = llRightLanguage;
        this.llTopSelectLanguage = llTopSelectLanguage;
        this.popRecordingImg = popRecordingImg;
        this.recyclerView = recyclerView;
        this.rightRecordDetail = rightRecordDetail;
        this.rightRecordingImg = rightRecordingImg;
        this.rootView = rootView;
        this.transformLanguageImg = transformLanguageImg;
        this.translateLeftIv = translateLeftIv;
        this.tvLeftSelectLanguage = tvLeftSelectLanguage;
        this.tvRightSelectLanguage = tvRightSelectLanguage;
    }

    @NonNull
    public static ActivityAiDialogueTranslationBinding bind(@NonNull View rootView) {
        int r1 = R.id.abh_title_right;
        ImageView r5 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.abh_title_right);
        if (r5 == null) goto L39;
        r1 = R.id.dialogue_translation_left_tv;
        TextView r6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.dialogue_translation_left_tv);
        if (r6 == null) goto L39;
        r1 = R.id.dialogue_translation_right_tv;
        TextView r7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.dialogue_translation_right_tv);
        if (r7 == null) goto L39;
        r1 = R.id.img_change_big;
        ImageView r8 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.img_change_big);
        if (r8 == null) goto L39;
        r1 = R.id.left_record_detail;
        TextView r9 = (TextView) ViewBindings.findChildViewById(rootView, R.id.left_record_detail);
        if (r9 == null) goto L39;
        r1 = R.id.left_recording_img;
        ImageView r10 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.left_recording_img);
        if (r10 == null) goto L39;
        r1 = R.id.ll_left_language;
        LinearLayout r11 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_left_language);
        if (r11 == null) goto L39;
        r1 = R.id.ll_right_language;
        LinearLayout r12 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_right_language);
        if (r12 == null) goto L39;
        r1 = R.id.ll_top_select_language;
        LinearLayout r13 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_top_select_language);
        if (r13 == null) goto L39;
        r1 = R.id.pop_recording_img;
        ImageView r14 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.pop_recording_img);
        if (r14 == null) goto L39;
        r1 = R.id.recycler_view;
        RecyclerView r15 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.recycler_view);
        if (r15 == null) goto L39;
        r1 = R.id.right_record_detail;
        TextView r16 = (TextView) ViewBindings.findChildViewById(rootView, R.id.right_record_detail);
        if (r16 == null) goto L39;
        r1 = R.id.right_recording_img;
        ImageView r17 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.right_recording_img);
        if (r17 == null) goto L39;
        LinearLayout r4 = (LinearLayout) rootView;
        r1 = R.id.transform_language_img;
        ImageView r19 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.transform_language_img);
        if (r19 == null) goto L39;
        r1 = R.id.translate_left_iv;
        ImageView r20 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.translate_left_iv);
        if (r20 == null) goto L39;
        r1 = R.id.tv_left_select_language;
        TextView r21 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_left_select_language);
        if (r21 == null) goto L39;
        r1 = R.id.tv_right_select_language;
        TextView r22 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_right_select_language);
        if (r22 == null) goto L39;
        return new ActivityAiDialogueTranslationBinding(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r4, r19, r20, r21, r22);
    L39:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r1)));
    }

    @NonNull
    public static ActivityAiDialogueTranslationBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityAiDialogueTranslationBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_ai_dialogue_translation, parent, false);
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
