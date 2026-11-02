package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.ContactSideBar;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityContactListV2Binding implements ViewBinding {

    @NonNull
    public final ContactSideBar contactListContactSidebar;

    @NonNull
    public final EditText contactListEt;

    @NonNull
    public final RelativeLayout contactSearchLayout;

    @NonNull
    public final LinearLayout empty;

    @NonNull
    public final LinearLayout llData;

    @NonNull
    public final LinearLayout rootView;

    @NonNull
    private final LinearLayout rootView_;

    @NonNull
    public final RecyclerView rv;

    @NonNull
    public final ImageView searchCionImg;

    private ActivityContactListV2Binding(@NonNull LinearLayout rootView_, @NonNull ContactSideBar contactListContactSidebar, @NonNull EditText contactListEt, @NonNull RelativeLayout contactSearchLayout, @NonNull LinearLayout empty, @NonNull LinearLayout llData, @NonNull LinearLayout rootView, @NonNull RecyclerView rv, @NonNull ImageView searchCionImg) {
        this.rootView_ = rootView_;
        this.contactListContactSidebar = contactListContactSidebar;
        this.contactListEt = contactListEt;
        this.contactSearchLayout = contactSearchLayout;
        this.empty = empty;
        this.llData = llData;
        this.rootView = rootView;
        this.rv = rv;
        this.searchCionImg = searchCionImg;
    }

    @NonNull
    public static ActivityContactListV2Binding bind(@NonNull View rootView) {
        int r0 = R.id.contact_list_contact_sidebar;
        ContactSideBar r4 = (ContactSideBar) ViewBindings.findChildViewById(rootView, R.id.contact_list_contact_sidebar);
        if (r4 == null) goto L19;
        r0 = R.id.contact_list_et;
        EditText r5 = (EditText) ViewBindings.findChildViewById(rootView, R.id.contact_list_et);
        if (r5 == null) goto L19;
        r0 = R.id.contact_search_layout;
        RelativeLayout r6 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.contact_search_layout);
        if (r6 == null) goto L19;
        r0 = R.id.empty;
        LinearLayout r7 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.empty);
        if (r7 == null) goto L19;
        r0 = R.id.ll_data;
        LinearLayout r8 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_data);
        if (r8 == null) goto L19;
        LinearLayout r3 = (LinearLayout) rootView;
        r0 = R.id.rv;
        RecyclerView r10 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.rv);
        if (r10 == null) goto L19;
        r0 = R.id.search_cion_img;
        ImageView r11 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.search_cion_img);
        if (r11 == null) goto L19;
        return new ActivityContactListV2Binding(r3, r4, r5, r6, r7, r8, r3, r10, r11);
    L19:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityContactListV2Binding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityContactListV2Binding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_contact_list_v2, parent, false);
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
