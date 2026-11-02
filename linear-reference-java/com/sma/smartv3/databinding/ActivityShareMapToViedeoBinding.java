package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityShareMapToViedeoBinding implements ViewBinding {

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final FrameLayout sportDetailV2MapFragment;

    private ActivityShareMapToViedeoBinding(@NonNull LinearLayout rootView, @NonNull FrameLayout sportDetailV2MapFragment) {
        this.rootView = rootView;
        this.sportDetailV2MapFragment = sportDetailV2MapFragment;
    }

    @NonNull
    public static ActivityShareMapToViedeoBinding bind(@NonNull View rootView) {
        FrameLayout r1 = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.sport_detail_v2_map_fragment);
        if (r1 == null) goto L7;
        return new ActivityShareMapToViedeoBinding((LinearLayout) rootView, r1);
    L7:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.sport_detail_v2_map_fragment)));
    }

    @NonNull
    public static ActivityShareMapToViedeoBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityShareMapToViedeoBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_share_map_to_viedeo, parent, false);
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
