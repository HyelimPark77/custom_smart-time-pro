package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class PopSelectPairBinding implements ViewBinding {

    @NonNull
    public final Button btnAddDevice;

    @NonNull
    public final Button btnCancel;

    @NonNull
    public final Button btnScanQrcode;

    @NonNull
    private final LinearLayout rootView;

    private PopSelectPairBinding(@NonNull LinearLayout rootView, @NonNull Button btnAddDevice, @NonNull Button btnCancel, @NonNull Button btnScanQrcode) {
        this.rootView = rootView;
        this.btnAddDevice = btnAddDevice;
        this.btnCancel = btnCancel;
        this.btnScanQrcode = btnScanQrcode;
    }

    @NonNull
    public static PopSelectPairBinding bind(@NonNull View rootView) {
        int i = R.id.btn_add_device;
        Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.btn_add_device);
        if (button != null) {
            i = R.id.btn_cancel;
            Button button2 = (Button) ViewBindings.findChildViewById(rootView, R.id.btn_cancel);
            if (button2 != null) {
                i = R.id.btn_scan_qrcode;
                Button button3 = (Button) ViewBindings.findChildViewById(rootView, R.id.btn_scan_qrcode);
                if (button3 != null) {
                    return new PopSelectPairBinding((LinearLayout) rootView, button, button2, button3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static PopSelectPairBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static PopSelectPairBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.pop_select_pair, parent, false);
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
