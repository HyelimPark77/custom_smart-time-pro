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
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ItemListAudioBookLearnBinding implements ViewBinding {

    @NonNull
    public final PFMedium audioBookFileSize;

    @NonNull
    public final PFMedium audioBookFileTopTip;

    @NonNull
    public final LinearLayout itemLayoutBookLearn;

    /* JADX INFO: renamed from: iv */
    @NonNull
    public final ImageView f51149iv;

    @NonNull
    public final ImageView listItemChooseIv;

    @NonNull
    private final LinearLayout rootView;

    /* JADX INFO: renamed from: tv */
    @NonNull
    public final PFMedium f51150tv;

    private ItemListAudioBookLearnBinding(@NonNull LinearLayout rootView, @NonNull PFMedium audioBookFileSize, @NonNull PFMedium audioBookFileTopTip, @NonNull LinearLayout itemLayoutBookLearn, @NonNull ImageView iv, @NonNull ImageView listItemChooseIv, @NonNull PFMedium tv) {
        this.rootView = rootView;
        this.audioBookFileSize = audioBookFileSize;
        this.audioBookFileTopTip = audioBookFileTopTip;
        this.itemLayoutBookLearn = itemLayoutBookLearn;
        this.f51149iv = iv;
        this.listItemChooseIv = listItemChooseIv;
        this.f51150tv = tv;
    }

    @NonNull
    public static ItemListAudioBookLearnBinding bind(@NonNull View rootView) {
        int i = R.id.audio_book_file_size;
        PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.audio_book_file_size);
        if (pFMedium != null) {
            i = R.id.audio_book_file_top_tip;
            PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.audio_book_file_top_tip);
            if (pFMedium2 != null) {
                LinearLayout linearLayout = (LinearLayout) rootView;
                i = R.id.f51417iv;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.f51417iv);
                if (imageView != null) {
                    i = R.id.list_item_choose_iv;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.list_item_choose_iv);
                    if (imageView2 != null) {
                        i = R.id.f51423tv;
                        PFMedium pFMedium3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.f51423tv);
                        if (pFMedium3 != null) {
                            return new ItemListAudioBookLearnBinding(linearLayout, pFMedium, pFMedium2, linearLayout, imageView, imageView2, pFMedium3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemListAudioBookLearnBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemListAudioBookLearnBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_list_audio_book_learn, parent, false);
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
