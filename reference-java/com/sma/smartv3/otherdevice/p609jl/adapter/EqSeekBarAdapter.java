package com.sma.smartv3.otherdevice.p609jl.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.OXXXOX;
import com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter;
import com.bestmafen.androidbase.adapter.recyclerview.base.ViewHolder;
import com.blankj.utilcode.util.ScreenUtils;
import com.blankj.utilcode.util.SizeUtils;
import com.jieli.jl_rcsp.model.device.EqInfo;
import com.sma.smartv3.otherdevice.p609jl.adapter.EqSeekBarAdapter;
import com.sma.smartv3.otherdevice.p609jl.view.VerticalSeekBarView;
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

    public static /* synthetic */ void XIi00iiXO(EqSeekBarAdapter eqSeekBarAdapter, int i, OXXXOX oxxxox, int i2, boolean z) {
        eqSeekBarAdapter.getClass();
        if (i < 0) {
            return;
        }
        oxxxox.IiI10X(i2);
        eqSeekBarAdapter.mEqInfo.getValue()[oxxxox.XIi00iiXO()] = (byte) oxxxox.m991iO();
        eqSeekBarAdapter.mValueChange.OXO1(oxxxox.XIi00iiXO(), eqSeekBarAdapter.mEqInfo, z);
    }

    public static String freqValueToFreqShowText(int value) {
        int i = value / 1000;
        if (i > 0) {
            return i + "K";
        }
        return value + "";
    }

    public static int getScreenWidth(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    private void setNewInstance(List<OXXXOX> list) {
        try {
            ((CommonAdapter) this).mDatas.clear();
            ((CommonAdapter) this).mDatas.addAll(list);
            notifyDataSetChanged();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int[] getValues() {
        int size = getDatas().size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = getDatas().get(i).m991iO();
        }
        return iArr;
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
        Iterator<OXXXOX> it = getDatas().iterator();
        while (it.hasNext()) {
            it.next().IiI10X(0);
        }
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
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < eqInfo.getValue().length && i < eqInfo.getFreqs().length; i++) {
            arrayList.add(new OXXXOX(i, freqValueToFreqShowText(eqInfo.getFreqs()[i]), eqInfo.getValue()[i]));
        }
        setNewInstance(arrayList);
    }

    @Override // com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter
    public void convert(ViewHolder holder, final OXXXOX item, final int position) {
        int width;
        if (getDatas().size() > 0) {
            ViewGroup viewGroup = (ViewGroup) holder.getView(R.id.cl_main);
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            if (getDatas().size() < 7) {
                width = this.mRecyclerView.getWidth() != 0 ? this.mRecyclerView.getWidth() / getDatas().size() : (ScreenUtils.getScreenWidth() - SizeUtils.dp2px(60.0f)) / getDatas().size();
            } else {
                layoutParams.width = SizeUtils.dp2px(50.0f);
                width = 0;
            }
            if (width != 0) {
                layoutParams.width = width;
                viewGroup.setLayoutParams(layoutParams);
            }
        }
        VerticalSeekBarView verticalSeekBarView = (VerticalSeekBarView) holder.getView(R.id.vsb_eq);
        verticalSeekBarView.setText(item.OXO1());
        verticalSeekBarView.setValue(item.m991iO());
        verticalSeekBarView.setIndex(item.XIi00iiXO());
        verticalSeekBarView.setEnable(!this.ban);
        this.mEqInfo.getValue()[item.XIi00iiXO()] = (byte) item.m991iO();
        verticalSeekBarView.setValueListener(new VerticalSeekBarView.XIi00iiXO() { // from class: com.android.mltcode.paycertificationapi.O0X10O
            @Override // com.sma.smartv3.otherdevice.jl.view.VerticalSeekBarView.XIi00iiXO
            public final void OXO1(int i, boolean z) {
                EqSeekBarAdapter.XIi00iiXO(this.OXO1, position, item, i, z);
            }
        });
        verticalSeekBarView.setHoverListener(new VerticalSeekBarView.OXO1() { // from class: com.android.mltcode.paycertificationapi.X00X01i0
            @Override // com.sma.smartv3.otherdevice.jl.view.VerticalSeekBarView.OXO1
            public final void OXO1(boolean z) {
                this.OXO1.mHasHoverView = z;
            }
        });
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public void updateSeekBar(int[] value) {
        if (this.mHasHoverView) {
            return;
        }
        List<OXXXOX> datas = getDatas();
        int i = -1;
        int i2 = 0;
        for (int i3 = 0; i3 < datas.size() && i3 < value.length; i3++) {
            if (value[i3] != datas.get(i3).m991iO()) {
                i2++;
                i = i3;
            }
            datas.get(i3).IiI10X(value[i3]);
        }
        if (i2 > 1) {
            notifyDataSetChanged();
        } else if (i != -1) {
            notifyItemChanged(i);
        }
    }
}
