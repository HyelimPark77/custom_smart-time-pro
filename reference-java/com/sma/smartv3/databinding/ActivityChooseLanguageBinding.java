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

    /* JADX INFO: renamed from: rv */
    @NonNull
    public final RecyclerView f50973rv;

    @NonNull
    public final LinearLayout searchItem;

    private ActivityChooseLanguageBinding(@NonNull LinearLayout rootView, @NonNull ImageView chooseLanguageSearchIcon, @NonNull EditText chooseLanguageSearchText, @NonNull RecyclerView rv, @NonNull LinearLayout searchItem) {
        this.rootView = rootView;
        this.chooseLanguageSearchIcon = chooseLanguageSearchIcon;
        this.chooseLanguageSearchText = chooseLanguageSearchText;
        this.f50973rv = rv;
        this.searchItem = searchItem;
    }

    @NonNull
    public static ActivityChooseLanguageBinding bind(@NonNull View rootView) {
        int i = R.id.choose_language_search_icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.choose_language_search_icon);
        if (imageView != null) {
            i = R.id.choose_language_search_text;
            EditText editText = (EditText) ViewBindings.findChildViewById(rootView, R.id.choose_language_search_text);
            if (editText != null) {
                i = R.id.f51422rv;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.f51422rv);
                if (recyclerView != null) {
                    i = R.id.search_item;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.search_item);
                    if (linearLayout != null) {
                        return new ActivityChooseLanguageBinding((LinearLayout) rootView, imageView, editText, recyclerView, linearLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityChooseLanguageBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityChooseLanguageBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_choose_language, parent, false);
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
