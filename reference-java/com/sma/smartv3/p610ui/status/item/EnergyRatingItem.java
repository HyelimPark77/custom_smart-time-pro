package com.sma.smartv3.p610ui.status.item;

import android.content.Context;
import android.view.View;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sf5;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import com.blankj.utilcode.util.LogUtils;
import com.sma.smartv3.model.EnergyRatingDataKt;
import com.sma.smartv3.p608db.MyDb;
import com.sma.smartv3.p608db.dao.EnergyRatingDao;
import com.sma.smartv3.p608db.entity.EnergyRating;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.TimePeriod;
import com.sma.smartv3.view.EnergySegmentProgressView;
import com.sma.smartv3.view.text.DINCondBold;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nEnergyRatingItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnergyRatingItem.kt\ncom/sma/smartv3/ui/status/item/EnergyRatingItem\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,75:1\n1969#2,14:76\n*S KotlinDebug\n*F\n+ 1 EnergyRatingItem.kt\ncom/sma/smartv3/ui/status/item/EnergyRatingItem\n*L\n60#1:76,14\n*E\n"})
public final class EnergyRatingItem extends BaseDslItem {
    private DINCondBold energyRatingLastTime;
    private DINCondBold energyRatingLastValue;
    public List<EnergyRating> energyRatingList;
    public Context mContext;
    private EnergySegmentProgressView mSegmentProgressView;
    public long[] range;

    @aa1
    private final EnergyRatingDao mEnergyRatingDao = MyDb.INSTANCE.getMDatabase().energyRating();
    private final boolean initEvent = true;

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder itemHolder) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        View viewM3483v = itemHolder.m3483v(R.id.tempLastTime);
        Intrinsics.XXI(viewM3483v);
        this.energyRatingLastTime = (DINCondBold) viewM3483v;
        View viewM3483v2 = itemHolder.m3483v(R.id.tempLastValue);
        Intrinsics.XXI(viewM3483v2);
        this.energyRatingLastValue = (DINCondBold) viewM3483v2;
        View viewM3483v3 = itemHolder.m3483v(R.id.sw_segmentProgress);
        Intrinsics.XXI(viewM3483v3);
        this.mSegmentProgressView = (EnergySegmentProgressView) viewM3483v3;
        Context context = itemHolder.getContext();
        Intrinsics.O10IXXX0X(context, "<get-context>(...)");
        setMContext(context);
    }

    @aa1
    public final List<EnergyRating> getEnergyRatingList() {
        List<EnergyRating> list = this.energyRatingList;
        if (list != null) {
            return list;
        }
        Intrinsics.XXO("energyRatingList");
        return null;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public boolean getInitEvent() {
        return this.initEvent;
    }

    @aa1
    public final Context getMContext() {
        Context context = this.mContext;
        if (context != null) {
            return context;
        }
        Intrinsics.XXO("mContext");
        return null;
    }

    @aa1
    public final long[] getRange() {
        long[] jArr = this.range;
        if (jArr != null) {
            return jArr;
        }
        Intrinsics.XXO("range");
        return null;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        setItemHidden(!q62.OXO1.IXOiIi1O1());
        List<Integer> energyRatingColorLevel = EnergyRatingDataKt.getEnergyRatingColorLevel(getMContext());
        EnergySegmentProgressView energySegmentProgressView = this.mSegmentProgressView;
        EnergySegmentProgressView energySegmentProgressView2 = null;
        if (energySegmentProgressView == null) {
            Intrinsics.XXO("mSegmentProgressView");
            energySegmentProgressView = null;
        }
        energySegmentProgressView.setSelectColorList(energyRatingColorLevel);
        setRange(O0X11OiO.iOOX010X(null, TimePeriod.DAY, 0, 5, null));
        setEnergyRatingList(this.mEnergyRatingDao.getEnergyRating(getRange()[0], getRange()[1]));
        if (getEnergyRatingList().isEmpty()) {
            DINCondBold dINCondBold = this.energyRatingLastTime;
            if (dINCondBold == null) {
                Intrinsics.XXO("energyRatingLastTime");
                dINCondBold = null;
            }
            dINCondBold.setText(R.string.data_none);
            DINCondBold dINCondBold2 = this.energyRatingLastValue;
            if (dINCondBold2 == null) {
                Intrinsics.XXO("energyRatingLastValue");
                dINCondBold2 = null;
            }
            dINCondBold2.setText(R.string.data_none);
            EnergySegmentProgressView energySegmentProgressView3 = this.mSegmentProgressView;
            if (energySegmentProgressView3 == null) {
                Intrinsics.XXO("mSegmentProgressView");
            } else {
                energySegmentProgressView2 = energySegmentProgressView3;
            }
            energySegmentProgressView2.setSelectIndex(-1);
            return;
        }
        DINCondBold dINCondBold3 = this.energyRatingLastTime;
        if (dINCondBold3 == null) {
            Intrinsics.XXO("energyRatingLastTime");
            dINCondBold3 = null;
        }
        dINCondBold3.setText(O0X11OiO.i0X000X0O(false, false, 3, null).format(Long.valueOf(((EnergyRating) CollectionsKt___CollectionsKt.Xi1XO00(getEnergyRatingList())).getMTime())));
        Iterator<T> it = getEnergyRatingList().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            int mScore = ((EnergyRating) next).getMScore();
            do {
                Object next2 = it.next();
                int mScore2 = ((EnergyRating) next2).getMScore();
                if (mScore < mScore2) {
                    next = next2;
                    mScore = mScore2;
                }
            } while (it.hasNext());
        }
        int mScore3 = ((EnergyRating) next).getMScore();
        DINCondBold dINCondBold4 = this.energyRatingLastValue;
        if (dINCondBold4 == null) {
            Intrinsics.XXO("energyRatingLastValue");
            dINCondBold4 = null;
        }
        dINCondBold4.setText(String.valueOf(mScore3));
        EnergySegmentProgressView energySegmentProgressView4 = this.mSegmentProgressView;
        if (energySegmentProgressView4 == null) {
            Intrinsics.XXO("mSegmentProgressView");
        } else {
            energySegmentProgressView2 = energySegmentProgressView4;
        }
        energySegmentProgressView2.setSelectIndex(EnergyRatingDataKt.getEnergyRatingLevel(mScore3));
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.status_item_energy_tating;
    }

    @sf5(tag = I01XX0.iIIIiIO0)
    public final void onDataChanged(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        LogUtils.m11131v("SWEnergyRatingItem onDataChanged");
        initView();
    }

    public final void setEnergyRatingList(@aa1 List<EnergyRating> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.energyRatingList = list;
    }

    public final void setMContext(@aa1 Context context) {
        Intrinsics.X0O(context, "<set-?>");
        this.mContext = context;
    }

    public final void setRange(@aa1 long[] jArr) {
        Intrinsics.X0O(jArr, "<set-?>");
        this.range = jArr;
    }
}
