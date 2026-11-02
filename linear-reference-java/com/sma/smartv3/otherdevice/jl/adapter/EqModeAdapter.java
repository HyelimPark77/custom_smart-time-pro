package com.sma.smartv3.otherdevice.jl.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;
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

    @Override // com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter
    public /* bridge */ /* synthetic */ void convert(ViewHolder holder, EqInfo item, int position) {
        convert2(holder, item, position);
    }

    public String getModeNmae(int mode) {
        return Utils.getApp().getResources().getStringArray(R.array.eq_mode_list)[mode];
    }

    public void select(int selectMode) {
        this.selectMode = selectMode;
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: convert, reason: avoid collision after fix types in other method */
    public void convert2(ViewHolder holder, EqInfo item, int position) {
        holder.setText(R.id.tv_eq_mode_name, getModeNmae(item.getMode()));
        View r5 = holder.getView(R.id.tv_eq_mode_name);
        if (this.selectMode != item.getMode()) goto L5;
        boolean r0 = true;
    L6:
        r5.setSelected(r0);
        ImageView r3 = (ImageView) holder.getView(R.id.iv_eq_mode_bmp);
        if (item.getMode() != 6) goto L9;
        Bitmap r4 = XIXi00OX.XIi00iiXO(item);
    L10:
        r3.setImageBitmap(r4);
        return;
    L9:
        r4 = BitmapFactory.decodeFile(XIXi00OX.IO(item));
        goto L10
    L5:
        r0 = false;
        goto L6
    }
}
