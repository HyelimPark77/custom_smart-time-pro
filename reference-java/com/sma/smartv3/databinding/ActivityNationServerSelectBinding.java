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

    /* JADX INFO: renamed from: rv */
    @NonNull
    public final RecyclerView f50989rv;

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
        this.f50989rv = rv;
        this.searchItem = searchItem;
        this.searchNation = searchNation;
        this.serverSelectImgButton = serverSelectImgButton;
        this.serverSelectTv = serverSelectTv;
    }

    @NonNull
    public static ActivityNationServerSelectBinding bind(@NonNull View rootView) {
        int i = R.id.btn_nextStep;
        Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.btn_nextStep);
        if (button != null) {
            i = R.id.choose_nation_search_icon;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.choose_nation_search_icon);
            if (imageView != null) {
                i = R.id.choose_nation_search_text;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.choose_nation_search_text);
                if (textView != null) {
                    i = R.id.nation_search_icon;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.nation_search_icon);
                    if (imageView2 != null) {
                        i = R.id.nation_search_text;
                        EditText editText = (EditText) ViewBindings.findChildViewById(rootView, R.id.nation_search_text);
                        if (editText != null) {
                            LinearLayout linearLayout = (LinearLayout) rootView;
                            i = R.id.f51422rv;
                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.f51422rv);
                            if (recyclerView != null) {
                                i = R.id.search_item;
                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.search_item);
                                if (linearLayout2 != null) {
                                    i = R.id.search_nation;
                                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.search_nation);
                                    if (relativeLayout != null) {
                                        i = R.id.server_select_img_button;
                                        ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.server_select_img_button);
                                        if (imageButton != null) {
                                            i = R.id.server_select_tv;
                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.server_select_tv);
                                            if (textView2 != null) {
                                                return new ActivityNationServerSelectBinding(linearLayout, button, imageView, textView, imageView2, editText, linearLayout, recyclerView, linearLayout2, relativeLayout, imageButton, textView2);
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
    public static ActivityNationServerSelectBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityNationServerSelectBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_nation_server_select, parent, false);
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
