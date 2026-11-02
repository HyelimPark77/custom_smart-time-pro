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
        int i = R.id.pop_list_app_recording;
        Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.pop_list_app_recording);
        if (button != null) {
            i = R.id.pop_list_bluetooth_recording;
            Button button2 = (Button) ViewBindings.findChildViewById(rootView, R.id.pop_list_bluetooth_recording);
            if (button2 != null) {
                i = R.id.pop_list_clear_recording;
                Button button3 = (Button) ViewBindings.findChildViewById(rootView, R.id.pop_list_clear_recording);
                if (button3 != null) {
                    i = R.id.pop_list_closure;
                    Button button4 = (Button) ViewBindings.findChildViewById(rootView, R.id.pop_list_closure);
                    if (button4 != null) {
                        i = R.id.pop_list_data_cancel;
                        Button button5 = (Button) ViewBindings.findChildViewById(rootView, R.id.pop_list_data_cancel);
                        if (button5 != null) {
                            i = R.id.pop_list_recycler;
                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.pop_list_recycler);
                            if (recyclerView != null) {
                                i = R.id.pop_list_stop_play;
                                Button button6 = (Button) ViewBindings.findChildViewById(rootView, R.id.pop_list_stop_play);
                                if (button6 != null) {
                                    return new PopList2Binding((LinearLayout) rootView, button, button2, button3, button4, button5, recyclerView, button6);
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
    public static PopList2Binding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static PopList2Binding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.pop_list2, parent, false);
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
