package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.AbhSettingsItem;

/* JADX INFO: loaded from: classes19.dex */
public final class FragmentAigcBinding implements ViewBinding {

    @NonNull
    public final Button btnAgain;

    @NonNull
    public final Button btnGen;

    @NonNull
    public final Button btnGenNextStep;

    @NonNull
    public final Button btnSearch;

    @NonNull
    public final EditText edtContent;

    @NonNull
    public final ScrollView genPanel;

    @NonNull
    public final AbhSettingsItem itemStyle;

    @NonNull
    public final LinearLayout previewPanel;

    @NonNull
    public final LinearLayout root;

    @NonNull
    private final LinearLayout rootView;

    /* JADX INFO: renamed from: rv */
    @NonNull
    public final RecyclerView f51108rv;

    private FragmentAigcBinding(@NonNull LinearLayout rootView, @NonNull Button btnAgain, @NonNull Button btnGen, @NonNull Button btnGenNextStep, @NonNull Button btnSearch, @NonNull EditText edtContent, @NonNull ScrollView genPanel, @NonNull AbhSettingsItem itemStyle, @NonNull LinearLayout previewPanel, @NonNull LinearLayout root, @NonNull RecyclerView rv) {
        this.rootView = rootView;
        this.btnAgain = btnAgain;
        this.btnGen = btnGen;
        this.btnGenNextStep = btnGenNextStep;
        this.btnSearch = btnSearch;
        this.edtContent = edtContent;
        this.genPanel = genPanel;
        this.itemStyle = itemStyle;
        this.previewPanel = previewPanel;
        this.root = root;
        this.f51108rv = rv;
    }

    @NonNull
    public static FragmentAigcBinding bind(@NonNull View rootView) {
        int i = R.id.btn_again;
        Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.btn_again);
        if (button != null) {
            i = R.id.btn_gen;
            Button button2 = (Button) ViewBindings.findChildViewById(rootView, R.id.btn_gen);
            if (button2 != null) {
                i = R.id.btn_gen_next_step;
                Button button3 = (Button) ViewBindings.findChildViewById(rootView, R.id.btn_gen_next_step);
                if (button3 != null) {
                    i = R.id.btn_search;
                    Button button4 = (Button) ViewBindings.findChildViewById(rootView, R.id.btn_search);
                    if (button4 != null) {
                        i = R.id.edt_content;
                        EditText editText = (EditText) ViewBindings.findChildViewById(rootView, R.id.edt_content);
                        if (editText != null) {
                            i = R.id.gen_panel;
                            ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(rootView, R.id.gen_panel);
                            if (scrollView != null) {
                                i = R.id.item_style;
                                AbhSettingsItem abhSettingsItem = (AbhSettingsItem) ViewBindings.findChildViewById(rootView, R.id.item_style);
                                if (abhSettingsItem != null) {
                                    i = R.id.preview_panel;
                                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.preview_panel);
                                    if (linearLayout != null) {
                                        LinearLayout linearLayout2 = (LinearLayout) rootView;
                                        i = R.id.f51422rv;
                                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.f51422rv);
                                        if (recyclerView != null) {
                                            return new FragmentAigcBinding(linearLayout2, button, button2, button3, button4, editText, scrollView, abhSettingsItem, linearLayout, linearLayout2, recyclerView);
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
    public static FragmentAigcBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentAigcBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_aigc, parent, false);
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
