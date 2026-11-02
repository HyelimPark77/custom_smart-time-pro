package com.sma.smartv3.otherdevice.jl.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.IIXiiO0i;
import com.android.mltcode.paycertificationapi.XIXi00OX;
import com.bestmafen.androidbase.adapter.recyclerview.MultiItemTypeAdapter;
import com.jieli.jl_rcsp.model.device.EqInfo;
import com.jieli.jl_rcsp.model.device.EqPresetInfo;
import com.sma.smartv3.otherdevice.jl.adapter.EqModeAdapter;
import com.sma.smartv3.otherdevice.jl.view.CommonDecoration;
import com.sma.smartv3.pro.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class EqModeDialog extends DialogFragment {
    private EqInfo mEqInfo;
    private XIi00iiXO mOnSelectedChange;

    public class OXO1 implements MultiItemTypeAdapter.iO {
        public final /* synthetic */ EqModeAdapter OXO1;
        public final /* synthetic */ EqModeDialog XIi00iiXO;

        public OXO1(final EqModeDialog this$0, final EqModeAdapter val$eqModeAdapter) {
            this.XIi00iiXO = this$0;
            this.OXO1 = val$eqModeAdapter;
        }

        @Override // com.bestmafen.androidbase.adapter.recyclerview.MultiItemTypeAdapter.iO
        public void OXO1(View view, RecyclerView.ViewHolder holder, int position) {
            this.OXO1.select(position);
            this.XIi00iiXO.dismiss();
            if (this.XIi00iiXO.getActivity() != null) goto L5;
            return;
        L5:
            if (EqModeDialog.iO(this.XIi00iiXO) == null) goto L12;
            EqInfo r1 = this.OXO1.getDatas().get(position).copy();
            if (r1.getMode() != 6) goto L9;
            byte[] r2 = new byte[r1.getCount()];
            Arrays.fill(r2, (byte) 127);
            r1.setValue(r2);
        L9:
            EqModeDialog.iO(this.XIi00iiXO).OXO1(r1);
            return;
        }

        @Override // com.bestmafen.androidbase.adapter.recyclerview.MultiItemTypeAdapter.iO
        public boolean XIi00iiXO(View view, RecyclerView.ViewHolder holder, int position) {
            return false;
        }
    }

    public interface XIi00iiXO {
        void OXO1(EqInfo eqInfo);
    }

    public EqModeDialog() {
    }

    public static /* synthetic */ void XIi00iiXO(EqModeDialog r0, View r1) {
        r0.dismiss();
    }

    private List<EqInfo> getData() {
        EqPresetInfo r0 = XIXi00OX.OIX0iXi();
        if (r0 != null) goto L7;
        return new ArrayList();
    L7:
        return r0.getEqInfos();
    }

    public static /* bridge */ /* synthetic */ XIi00iiXO iO(EqModeDialog r0) {
        return r0.mOnSelectedChange;
    }

    public static EqModeDialog newInstance(XIi00iiXO onSelectedChange) {
        EqModeDialog r0 = new EqModeDialog();
        r0.setArguments(new Bundle());
        r0.mOnSelectedChange = onSelectedChange;
        return r0;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Window r7 = requireDialog().getWindow();
        if (r7 == null) goto L5;
        WindowManager.LayoutParams r0 = r7.getAttributes();
        r0.gravity = 80;
        r0.width = -1;
        r0.horizontalMargin = 0.0f;
        r7.setAttributes(r0);
    L5:
        View r5 = inflater.inflate(R.layout.dialog_eq_mode_dialog, container, false);
        EqModeAdapter r6 = new EqModeAdapter(getContext(), getData());
        EqInfo r8 = XIXi00OX.XOO0ii0();
        this.mEqInfo = r8;
        r6.select(r8.getMode());
        RecyclerView r9 = (RecyclerView) r5.findViewById(R.id.rv_eq_mode);
        r9.setLayoutManager(new LinearLayoutManager(getContext()));
        r9.setAdapter(r6);
        r9.addItemDecoration(new CommonDecoration(requireContext(), 1, requireContext().getResources().getColor(R.color.gray_eeeeee), 1));
        r6.setOnItemClickListener(new OXO1(this, r6));
        r5.findViewById(R.id.tv_eq_mode_cancel).setOnClickListener(new IIXiiO0i(this));
        return r5;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Window r0 = requireDialog().getWindow();
        if (r0 == null) goto L6;
        r0.setLayout(-1, -2);
        r0.setBackgroundDrawable(null);
        return;
    }
}
