package com.sma.smartv3.otherdevice.jl.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.O0X10O;
import com.android.mltcode.paycertificationapi.OXXXOX;
import com.android.mltcode.paycertificationapi.X00X01i0;
import com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter;
import com.bestmafen.androidbase.adapter.recyclerview.base.ViewHolder;
import com.blankj.utilcode.util.ScreenUtils;
import com.blankj.utilcode.util.SizeUtils;
import com.jieli.jl_rcsp.model.device.EqInfo;
import com.sma.smartv3.otherdevice.jl.view.VerticalSeekBarView;
import com.sma.smartv3.pro.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class EqSeekBarAdapter extends CommonAdapter<OXXXOX> {
    private boolean ban;
    private EqInfo mEqInfo;
    private boolean mHasHoverView;
    private RecyclerView mRecyclerView;
    private OXO1 mValueChange;
    private int selectMode;

    public interface OXO1 {
        void OXO1(int index, EqInfo eqInfo, boolean end);
    }

    public EqSeekBarAdapter(Context context, List<OXXXOX> list, OXO1 valueChange) {
        super(context, R.layout.item_eq_seekbar, list);
        this.selectMode = -1;
        this.mHasHoverView = false;
        this.mEqInfo = new EqInfo();
        this.mValueChange = valueChange;
    }

    public static /* synthetic */ void OXO1(EqSeekBarAdapter r0, boolean r1) {
        r0.mHasHoverView = r1;
    }

    public static /* synthetic */ void XIi00iiXO(EqSeekBarAdapter r1, int r2, OXXXOX r3, int r4, boolean r5) {
        r1.getClass();
        if (r2 >= 0) goto L5;
        return;
    L5:
        r3.IiI10X(r4);
        r1.mEqInfo.getValue()[r3.XIi00iiXO()] = (byte) r3.iO();
        r1.mValueChange.OXO1(r3.XIi00iiXO(), r1.mEqInfo, r5);
    }

    public static String freqValueToFreqShowText(int value) {
        int r0 = value / 1000;
        if (r0 <= 0) goto L7;
        return r0 + "K";
    L7:
        return value + "";
    }

    public static int getScreenWidth(Context context) {
        WindowManager r1 = (WindowManager) context.getSystemService("window");
        DisplayMetrics r0 = new DisplayMetrics();
        r1.getDefaultDisplay().getMetrics(r0);
        return r0.widthPixels;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    private void setNewInstance(List<OXXXOX> r2) {
        this.mDatas.clear();     // Catch: Exception -> L4
        this.mDatas.addAll(r2);     // Catch: Exception -> L4
        notifyDataSetChanged();     // Catch: Exception -> L4
        return;
    L4:
        e = move-exception;
        e.printStackTrace();
    }

    @Override // com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter
    public /* bridge */ /* synthetic */ void convert(ViewHolder holder, OXXXOX item, int position) {
        convert2(holder, item, position);
    }

    public int[] getValues() {
        int r0 = getDatas().size();
        int[] r1 = new int[r0];
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L5;
        r1[r2] = getDatas().get(r2).iO();
        r2 = r2 + 1;
        goto L3
    L5:
        return r1;
    }

    public boolean hasHoverView() {
        return this.mHasHoverView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.mRecyclerView = recyclerView;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public void reset() {
        Iterator<OXXXOX> r0 = getDatas().iterator();
    L4:
        if (r0.hasNext() == false) goto L6;
        r0.next().IiI10X(0);
        goto L4
    L6:
        notifyDataSetChanged();
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public void select(int selectMode) {
        this.selectMode = selectMode;
        notifyDataSetChanged();
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public void setBan(boolean ban) {
        this.ban = ban;
        notifyDataSetChanged();
    }

    public void updateSeekBar(EqInfo eqInfo) {
        this.mEqInfo = eqInfo;
        ArrayList r0 = new ArrayList();
        int r1 = 0;
    L4:
        if (r1 >= eqInfo.getValue().length) goto L8;
        if (r1 >= eqInfo.getFreqs().length) goto L8;
        r0.add(new OXXXOX(r1, freqValueToFreqShowText(eqInfo.getFreqs()[r1]), eqInfo.getValue()[r1]));
        r1 = r1 + 1;
    L8:
        setNewInstance(r0);
    }

    /* JADX INFO: renamed from: convert, reason: avoid collision after fix types in other method */
    public void convert2(ViewHolder holder, final OXXXOX item, final int position) {
        if (getDatas().size() <= 0) goto L13;
        ViewGroup r0 = (ViewGroup) holder.getView(R.id.cl_main);
        ViewGroup.LayoutParams r1 = r0.getLayoutParams();
        if (getDatas().size() < 7) goto L7;
        r1.width = SizeUtils.dp2px(50.0f);
        int r2 = 0;
    L11:
        if (r2 == 0) goto L13;
        r1.width = r2;
        r0.setLayoutParams(r1);
        goto L13
    L7:
        if (getWidth() == 0) goto L9;
        r2 = getWidth() / getDatas().size();
        goto L11
    L9:
        r2 = (ScreenUtils.getScreenWidth() - SizeUtils.dp2px(60.0f)) / getDatas().size();
    L13:
        VerticalSeekBarView r5 = (VerticalSeekBarView) holder.getView(R.id.vsb_eq);
        r5.setText(item.OXO1());
        r5.setValue(item.iO());
        r5.setIndex(item.XIi00iiXO());
        r5.setEnable(!this.ban);
        this.mEqInfo.getValue()[item.XIi00iiXO()] = (byte) item.iO();
        r5.setValueListener(new O0X10O(this, position, item));
        r5.setHoverListener(new X00X01i0(this));
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public void updateSeekBar(int[] value) {
        if (this.mHasHoverView == true) goto L26;
        List<OXXXOX> r0 = getDatas();
        int r2 = 0;
        int r4 = -1;
        int r3 = 0;
    L7:
        if (r2 >= r0.size()) goto L15;
        if (r2 >= value.length) goto L15;
        if (value[r2] == r0.get(r2).iO()) goto L13;
        r3 = r3 + 1;
        r4 = r2;
    L13:
        r0.get(r2).IiI10X(value[r2]);
        r2 = r2 + 1;
    L15:
        if (r3 <= 1) goto L18;
        notifyDataSetChanged();
        return;
    L18:
        if (r4 == (-1)) goto L25;
        notifyItemChanged(r4);
        return;
    L25:
        return;
    }
}
