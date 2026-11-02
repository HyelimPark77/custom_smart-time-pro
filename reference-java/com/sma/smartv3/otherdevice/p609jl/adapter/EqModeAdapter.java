package com.sma.smartv3.otherdevice.p609jl.adapter;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import com.android.mltcode.paycertificationapi.XIXi00OX;
import com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter;
import com.bestmafen.androidbase.adapter.recyclerview.base.ViewHolder;
import com.blankj.utilcode.util.Utils;
import com.jieli.jl_rcsp.model.device.EqInfo;
import com.sma.smartv3.pro.R;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class EqModeAdapter extends CommonAdapter<EqInfo> {
    private int selectMode;

    public EqModeAdapter(Context context, List<EqInfo> list) {
        super(context, R.layout.item_eq_mode, list);
        this.selectMode = 0;
    }

    public String getModeNmae(int mode) {
        return Utils.getApp().getResources().getStringArray(R.array.eq_mode_list)[mode];
    }

    public void select(int selectMode) {
        this.selectMode = selectMode;
        notifyDataSetChanged();
    }

    @Override // com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter
    public void convert(ViewHolder holder, EqInfo item, int position) {
        holder.setText(R.id.tv_eq_mode_name, getModeNmae(item.getMode()));
        holder.getView(R.id.tv_eq_mode_name).setSelected(this.selectMode == item.getMode());
        ((ImageView) holder.getView(R.id.iv_eq_mode_bmp)).setImageBitmap(item.getMode() == 6 ? XIXi00OX.XIi00iiXO(item) : BitmapFactory.decodeFile(XIXi00OX.m1247IO(item)));
    }
}
