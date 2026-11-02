package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class PopList2Binding implements ViewBinding {

    @NonNull
    public final Button popListAppRecording;

    @NonNull
    public final Button popListBluetoothRecording;

    @NonNull
    public final Button popListClearRecording;

    @NonNull
    public final Button popListClosure;

    @NonNull
    public final Button popListDataCancel;

    @NonNull
    public final RecyclerView popListRecycler;

    @NonNull
    public final Button popListStopPlay;

    @NonNull
    private final LinearLayout rootView;

    private PopList2Binding(@NonNull LinearLayout rootView, @NonNull Button popListAppRecording, @NonNull Button popListBluetoothRecording, @NonNull Button popListClearRecording, @NonNull Button popListClosure, @NonNull Button popListDataCancel, @NonNull RecyclerView popListRecycler, @NonNull Button popListStopPlay) {
        this.rootView = rootView;
        this.popListAppRecording = popListAppRecording;
        this.popListBluetoothRecording = popListBluetoothRecording;
        this.popListClearRecording = popListClearRecording;
        this.popListClosure = popListClosure;
        this.popListDataCancel = popListDataCancel;
        this.popListRecycler = popListRecycler;
        this.popListStopPlay = popListStopPlay;
    }

    @NonNull
    public static PopList2Binding bind(@NonNull View rootView) {
        int r0 = R.id.pop_list_app_recording;
        Button r4 = (Button) ViewBindings.findChildViewById(rootView, R.id.pop_list_app_recording);
        if (r4 == null) goto L19;
        r0 = R.id.pop_list_bluetooth_recording;
        Button r5 = (Button) ViewBindings.findChildViewById(rootView, R.id.pop_list_bluetooth_recording);
        if (r5 == null) goto L19;
        r0 = R.id.pop_list_clear_recording;
        Button r6 = (Button) ViewBindings.findChildViewById(rootView, R.id.pop_list_clear_recording);
        if (r6 == null) goto L19;
        r0 = R.id.pop_list_closure;
        Button r7 = (Button) ViewBindings.findChildViewById(rootView, R.id.pop_list_closure);
        if (r7 == null) goto L19;
        r0 = R.id.pop_list_data_cancel;
        Button r8 = (Button) ViewBindings.findChildViewById(rootView, R.id.pop_list_data_cancel);
        if (r8 == null) goto L19;
        r0 = R.id.pop_list_recycler;
        RecyclerView r9 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.pop_list_recycler);
        if (r9 == null) goto L19;
        r0 = R.id.pop_list_stop_play;
        Button r10 = (Button) ViewBindings.findChildViewById(rootView, R.id.pop_list_stop_play);
        if (r10 == null) goto L19;
        return new PopList2Binding((LinearLayout) rootView, r4, r5, r6, r7, r8, r9, r10);
    L19:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static PopList2Binding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static PopList2Binding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.pop_list2, parent, false);
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
