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

    /* JADX INFO: renamed from: rv */
    @NonNull
    public final RecyclerView f50974rv;

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
        this.f50974rv = rv;
        this.searchCionImg = searchCionImg;
    }

    @NonNull
    public static ActivityContactListV2Binding bind(@NonNull View rootView) {
        int i = R.id.contact_list_contact_sidebar;
        ContactSideBar contactSideBar = (ContactSideBar) ViewBindings.findChildViewById(rootView, R.id.contact_list_contact_sidebar);
        if (contactSideBar != null) {
            i = R.id.contact_list_et;
            EditText editText = (EditText) ViewBindings.findChildViewById(rootView, R.id.contact_list_et);
            if (editText != null) {
                i = R.id.contact_search_layout;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.contact_search_layout);
                if (relativeLayout != null) {
                    i = R.id.empty;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.empty);
                    if (linearLayout != null) {
                        i = R.id.ll_data;
                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_data);
                        if (linearLayout2 != null) {
                            LinearLayout linearLayout3 = (LinearLayout) rootView;
                            i = R.id.f51422rv;
                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.f51422rv);
                            if (recyclerView != null) {
                                i = R.id.search_cion_img;
                                ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.search_cion_img);
                                if (imageView != null) {
                                    return new ActivityContactListV2Binding(linearLayout3, contactSideBar, editText, relativeLayout, linearLayout, linearLayout2, linearLayout3, recyclerView, imageView);
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
    public static ActivityContactListV2Binding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityContactListV2Binding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_contact_list_v2, parent, false);
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
