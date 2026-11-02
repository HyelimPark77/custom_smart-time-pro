package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityChooseLanguageBinding implements ViewBinding {

    @NonNull
    public final ImageView chooseLanguageSearchIcon;

    @NonNull
    public final EditText chooseLanguageSearchText;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final RecyclerView rv;

    @NonNull
    public final LinearLayout searchItem;

    private ActivityChooseLanguageBinding(@NonNull LinearLayout rootView, @NonNull ImageView chooseLanguageSearchIcon, @NonNull EditText chooseLanguageSearchText, @NonNull RecyclerView rv, @NonNull LinearLayout searchItem) {
        this.rootView = rootView;
        this.chooseLanguageSearchIcon = chooseLanguageSearchIcon;
        this.chooseLanguageSearchText = chooseLanguageSearchText;
        this.rv = rv;
        this.searchItem = searchItem;
    }

    @NonNull
    public static ActivityChooseLanguageBinding bind(@NonNull View rootView) {
        int r0 = R.id.choose_language_search_icon;
        ImageView r4 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.choose_language_search_icon);
        if (r4 == null) goto L13;
        r0 = R.id.choose_language_search_text;
        EditText r5 = (EditText) ViewBindings.findChildViewById(rootView, R.id.choose_language_search_text);
        if (r5 == null) goto L13;
        r0 = R.id.rv;
        RecyclerView r6 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.rv);
        if (r6 == null) goto L13;
        r0 = R.id.search_item;
        LinearLayout r7 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.search_item);
        if (r7 == null) goto L13;
        return new ActivityChooseLanguageBinding((LinearLayout) rootView, r4, r5, r6, r7);
    L13:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityChooseLanguageBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityChooseLanguageBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_choose_language, parent, false);
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
