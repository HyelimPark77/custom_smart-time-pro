package com.sma.smartv3.otherdevice.p609jl.p250ui;

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
import com.android.mltcode.paycertificationapi.XIXi00OX;
import com.bestmafen.androidbase.adapter.recyclerview.MultiItemTypeAdapter;
import com.jieli.jl_rcsp.model.device.EqInfo;
import com.jieli.jl_rcsp.model.device.EqPresetInfo;
import com.sma.smartv3.otherdevice.p609jl.adapter.EqModeAdapter;
import com.sma.smartv3.otherdevice.p609jl.view.CommonDecoration;
import com.sma.smartv3.pro.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class EqModeDialog extends DialogFragment {
    private EqInfo mEqInfo;
    private XIi00iiXO mOnSelectedChange;

    public class OXO1 implements MultiItemTypeAdapter.InterfaceC4239iO {
        public final /* synthetic */ EqModeAdapter OXO1;

        public OXO1(final EqModeAdapter val$eqModeAdapter) {
            this.OXO1 = val$eqModeAdapter;
        }

        @Override // com.bestmafen.androidbase.adapter.recyclerview.MultiItemTypeAdapter.InterfaceC4239iO
        public void OXO1(View view, RecyclerView.ViewHolder holder, int position) {
            this.OXO1.select(position);
            EqModeDialog.this.dismiss();
            if (EqModeDialog.this.getActivity() == null || EqModeDialog.this.mOnSelectedChange == null) {
                return;
            }
            EqInfo eqInfoCopy = this.OXO1.getDatas().get(position).copy();
            if (eqInfoCopy.getMode() == 6) {
                byte[] bArr = new byte[eqInfoCopy.getCount()];
                Arrays.fill(bArr, (byte) 127);
                eqInfoCopy.setValue(bArr);
            }
            EqModeDialog.this.mOnSelectedChange.OXO1(eqInfoCopy);
        }

        @Override // com.bestmafen.androidbase.adapter.recyclerview.MultiItemTypeAdapter.InterfaceC4239iO
        public boolean XIi00iiXO(View view, RecyclerView.ViewHolder holder, int position) {
            return false;
        }
    }

    public interface XIi00iiXO {
        void OXO1(EqInfo eqInfo);
    }

    private List<EqInfo> getData() {
        EqPresetInfo eqPresetInfoOIX0iXi = XIXi00OX.OIX0iXi();
        return eqPresetInfoOIX0iXi == null ? new ArrayList() : eqPresetInfoOIX0iXi.getEqInfos();
    }

    public static EqModeDialog newInstance(XIi00iiXO onSelectedChange) {
        EqModeDialog eqModeDialog = new EqModeDialog();
        eqModeDialog.setArguments(new Bundle());
        eqModeDialog.mOnSelectedChange = onSelectedChange;
        return eqModeDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Window window = requireDialog().getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.gravity = 80;
            attributes.width = -1;
            attributes.horizontalMargin = 0.0f;
            window.setAttributes(attributes);
        }
        View viewInflate = inflater.inflate(R.layout.dialog_eq_mode_dialog, container, false);
        EqModeAdapter eqModeAdapter = new EqModeAdapter(getContext(), getData());
        EqInfo eqInfoXOO0ii0 = XIXi00OX.XOO0ii0();
        this.mEqInfo = eqInfoXOO0ii0;
        eqModeAdapter.select(eqInfoXOO0ii0.getMode());
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.rv_eq_mode);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(eqModeAdapter);
        recyclerView.addItemDecoration(new CommonDecoration(requireContext(), 1, requireContext().getResources().getColor(R.color.gray_eeeeee), 1));
        eqModeAdapter.setOnItemClickListener(new OXO1(eqModeAdapter));
        viewInflate.findViewById(R.id.tv_eq_mode_cancel).setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.IIXiiO0i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f1680IO.dismiss();
            }
        });
        return viewInflate;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Window window = requireDialog().getWindow();
        if (window != null) {
            window.setLayout(-1, -2);
            window.setBackgroundDrawable(null);
        }
    }
}
