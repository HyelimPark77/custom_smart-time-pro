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

    @NonNull
    public final ImageView iv;

    @NonNull
    public final ImageView listItemChooseIv;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final PFMedium tv;

    private ItemListAudioBookLearnBinding(@NonNull LinearLayout rootView, @NonNull PFMedium audioBookFileSize, @NonNull PFMedium audioBookFileTopTip, @NonNull LinearLayout itemLayoutBookLearn, @NonNull ImageView iv, @NonNull ImageView listItemChooseIv, @NonNull PFMedium tv) {
        this.rootView = rootView;
        this.audioBookFileSize = audioBookFileSize;
        this.audioBookFileTopTip = audioBookFileTopTip;
        this.itemLayoutBookLearn = itemLayoutBookLearn;
        this.iv = iv;
        this.listItemChooseIv = listItemChooseIv;
        this.tv = tv;
    }

    @NonNull
    public static ItemListAudioBookLearnBinding bind(@NonNull View rootView) {
        int r0 = R.id.audio_book_file_size;
        PFMedium r4 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.audio_book_file_size);
        if (r4 == null) goto L15;
        r0 = R.id.audio_book_file_top_tip;
        PFMedium r5 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.audio_book_file_top_tip);
        if (r5 == null) goto L15;
        LinearLayout r3 = (LinearLayout) rootView;
        r0 = R.id.iv;
        ImageView r7 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv);
        if (r7 == null) goto L15;
        r0 = R.id.list_item_choose_iv;
        ImageView r8 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.list_item_choose_iv);
        if (r8 == null) goto L15;
        r0 = R.id.tv;
        PFMedium r9 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv);
        if (r9 == null) goto L15;
        return new ItemListAudioBookLearnBinding(r3, r4, r5, r3, r7, r8, r9);
    L15:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ItemListAudioBookLearnBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ItemListAudioBookLearnBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.item_list_audio_book_learn, parent, false);
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
