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
        int i = R.id.abh_title_right;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.abh_title_right);
        if (imageView != null) {
            i = R.id.dialogue_translation_left_tv;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.dialogue_translation_left_tv);
            if (textView != null) {
                i = R.id.dialogue_translation_right_tv;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.dialogue_translation_right_tv);
                if (textView2 != null) {
                    i = R.id.img_change_big;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.img_change_big);
                    if (imageView2 != null) {
                        i = R.id.left_record_detail;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.left_record_detail);
                        if (textView3 != null) {
                            i = R.id.left_recording_img;
                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.left_recording_img);
                            if (imageView3 != null) {
                                i = R.id.ll_left_language;
                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_left_language);
                                if (linearLayout != null) {
                                    i = R.id.ll_right_language;
                                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_right_language);
                                    if (linearLayout2 != null) {
                                        i = R.id.ll_top_select_language;
                                        LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_top_select_language);
                                        if (linearLayout3 != null) {
                                            i = R.id.pop_recording_img;
                                            ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.pop_recording_img);
                                            if (imageView4 != null) {
                                                i = R.id.recycler_view;
                                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.recycler_view);
                                                if (recyclerView != null) {
                                                    i = R.id.right_record_detail;
                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.right_record_detail);
                                                    if (textView4 != null) {
                                                        i = R.id.right_recording_img;
                                                        ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.right_recording_img);
                                                        if (imageView5 != null) {
                                                            LinearLayout linearLayout4 = (LinearLayout) rootView;
                                                            i = R.id.transform_language_img;
                                                            ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.transform_language_img);
                                                            if (imageView6 != null) {
                                                                i = R.id.translate_left_iv;
                                                                ImageView imageView7 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.translate_left_iv);
                                                                if (imageView7 != null) {
                                                                    i = R.id.tv_left_select_language;
                                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_left_select_language);
                                                                    if (textView5 != null) {
                                                                        i = R.id.tv_right_select_language;
                                                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_right_select_language);
                                                                        if (textView6 != null) {
                                                                            return new ActivityAiDialogueTranslationBinding(linearLayout4, imageView, textView, textView2, imageView2, textView3, imageView3, linearLayout, linearLayout2, linearLayout3, imageView4, recyclerView, textView4, imageView5, linearLayout4, imageView6, imageView7, textView5, textView6);
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
    public static ActivityAiDialogueTranslationBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityAiDialogueTranslationBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_ai_dialogue_translation, parent, false);
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
