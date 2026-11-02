package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityNationServerSelectBinding implements ViewBinding {

    @NonNull
    public final Button btnNextStep;

    @NonNull
    public final ImageView chooseNationSearchIcon;

    @NonNull
    public final TextView chooseNationSearchText;

    @NonNull
    public final ImageView nationSearchIcon;

    @NonNull
    public final EditText nationSearchText;

    @NonNull
    public final LinearLayout rootView;

    @NonNull
    private final LinearLayout rootView_;

    @NonNull
    public final RecyclerView rv;

    @NonNull
    public final LinearLayout searchItem;

    @NonNull
    public final RelativeLayout searchNation;

    @NonNull
    public final ImageButton serverSelectImgButton;

    @NonNull
    public final TextView serverSelectTv;

    private ActivityNationServerSelectBinding(@NonNull LinearLayout rootView_, @NonNull Button btnNextStep, @NonNull ImageView chooseNationSearchIcon, @NonNull TextView chooseNationSearchText, @NonNull ImageView nationSearchIcon, @NonNull EditText nationSearchText, @NonNull LinearLayout rootView, @NonNull RecyclerView rv, @NonNull LinearLayout searchItem, @NonNull RelativeLayout searchNation, @NonNull ImageButton serverSelectImgButton, @NonNull TextView serverSelectTv) {
        this.rootView_ = rootView_;
        this.btnNextStep = btnNextStep;
        this.chooseNationSearchIcon = chooseNationSearchIcon;
        this.chooseNationSearchText = chooseNationSearchText;
        this.nationSearchIcon = nationSearchIcon;
        this.nationSearchText = nationSearchText;
        this.rootView = rootView;
        this.rv = rv;
        this.searchItem = searchItem;
        this.searchNation = searchNation;
        this.serverSelectImgButton = serverSelectImgButton;
        this.serverSelectTv = serverSelectTv;
    }

    @NonNull
    public static ActivityNationServerSelectBinding bind(@NonNull View rootView) {
        int r0 = R.id.btn_nextStep;
        Button r4 = (Button) ViewBindings.findChildViewById(rootView, R.id.btn_nextStep);
        if (r4 == null) goto L25;
        r0 = R.id.choose_nation_search_icon;
        ImageView r5 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.choose_nation_search_icon);
        if (r5 == null) goto L25;
        r0 = R.id.choose_nation_search_text;
        TextView r6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.choose_nation_search_text);
        if (r6 == null) goto L25;
        r0 = R.id.nation_search_icon;
        ImageView r7 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.nation_search_icon);
        if (r7 == null) goto L25;
        r0 = R.id.nation_search_text;
        EditText r8 = (EditText) ViewBindings.findChildViewById(rootView, R.id.nation_search_text);
        if (r8 == null) goto L25;
        LinearLayout r3 = (LinearLayout) rootView;
        r0 = R.id.rv;
        RecyclerView r10 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.rv);
        if (r10 == null) goto L25;
        r0 = R.id.search_item;
        LinearLayout r11 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.search_item);
        if (r11 == null) goto L25;
        r0 = R.id.search_nation;
        RelativeLayout r12 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.search_nation);
        if (r12 == null) goto L25;
        r0 = R.id.server_select_img_button;
        ImageButton r13 = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.server_select_img_button);
        if (r13 == null) goto L25;
        r0 = R.id.server_select_tv;
        TextView r14 = (TextView) ViewBindings.findChildViewById(rootView, R.id.server_select_tv);
        if (r14 == null) goto L25;
        return new ActivityNationServerSelectBinding(r3, r4, r5, r6, r7, r8, r3, r10, r11, r12, r13, r14);
    L25:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityNationServerSelectBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityNationServerSelectBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_nation_server_select, parent, false);
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
