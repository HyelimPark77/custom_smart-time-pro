package com.sma.smartv3.ui.status.item;

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
import com.sma.smartv3.db.MyDb;
import com.sma.smartv3.db.dao.EnergyRatingDao;
import com.sma.smartv3.db.entity.EnergyRating;
import com.sma.smartv3.model.EnergyRatingDataKt;
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
    private final boolean initEvent;
    public Context mContext;

    @aa1
    private final EnergyRatingDao mEnergyRatingDao;
    private EnergySegmentProgressView mSegmentProgressView;
    public long[] range;

    public EnergyRatingItem() {
        this.mEnergyRatingDao = MyDb.INSTANCE.getMDatabase().energyRating();
        this.initEvent = true;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder r2) {
        Intrinsics.X0O(r2, "itemHolder");
        View r0 = r2.v(R.id.tempLastTime);
        Intrinsics.XXI(r0);
        this.energyRatingLastTime = (DINCondBold) r0;
        View r1 = r2.v(R.id.tempLastValue);
        Intrinsics.XXI(r1);
        this.energyRatingLastValue = (DINCondBold) r1;
        View r3 = r2.v(R.id.sw_segmentProgress);
        Intrinsics.XXI(r3);
        this.mSegmentProgressView = (EnergySegmentProgressView) r3;
        Context r4 = r2.getContext();
        Intrinsics.O10IXXX0X(r4, "<get-context>(...)");
        setMContext(r4);
    }

    @aa1
    public final List<EnergyRating> getEnergyRatingList() {
        List<EnergyRating> r0 = this.energyRatingList;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("energyRatingList");
        return null;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public boolean getInitEvent() {
        return this.initEvent;
    }

    @aa1
    public final Context getMContext() {
        Context r0 = this.mContext;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("mContext");
        return null;
    }

    @aa1
    public final long[] getRange() {
        long[] r0 = this.range;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("range");
        return null;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        setItemHidden(!q62.OXO1.IXOiIi1O1());
        List<Integer> r0 = EnergyRatingDataKt.getEnergyRatingColorLevel(getMContext());
        EnergySegmentProgressView r2 = this.mSegmentProgressView;
        EnergySegmentProgressView r4 = null;
        if (r2 != null) goto L5;
        Intrinsics.XXO("mSegmentProgressView");
        r2 = null;
    L5:
        r2.setSelectColorList(r0);
        setRange(O0X11OiO.iOOX010X(null, TimePeriod.DAY, 0, 5, null));
        setEnergyRatingList(this.mEnergyRatingDao.getEnergyRating(getRange()[0], getRange()[1]));
        if (getEnergyRatingList().isEmpty() == false) goto L19;
        DINCondBold r1 = this.energyRatingLastTime;
        if (r1 != null) goto L10;
        Intrinsics.XXO("energyRatingLastTime");
        r1 = null;
    L10:
        r1.setText(R.string.data_none);
        DINCondBold r3 = this.energyRatingLastValue;
        if (r3 != null) goto L13;
        Intrinsics.XXO("energyRatingLastValue");
        r3 = null;
    L13:
        r3.setText(R.string.data_none);
        EnergySegmentProgressView r5 = this.mSegmentProgressView;
        if (r5 != null) goto L16;
        Intrinsics.XXO("mSegmentProgressView");
    L17:
        r4.setSelectIndex(-1);
        return;
    L16:
        r4 = r5;
        goto L17
    L19:
        DINCondBold r6 = this.energyRatingLastTime;
        if (r6 != null) goto L22;
        Intrinsics.XXO("energyRatingLastTime");
        r6 = null;
    L22:
        r6.setText(O0X11OiO.i0X000X0O(false, false, 3, null).format(Long.valueOf(((EnergyRating) CollectionsKt___CollectionsKt.Xi1XO00(getEnergyRatingList())).getMTime())));
        Iterator<T> r7 = getEnergyRatingList().iterator();
        if (r7.hasNext() == false) goto L43;
        Object r8 = r7.next();
        if (r7.hasNext() == false) goto L33;
        int r9 = ((EnergyRating) r8).getMScore();
    L28:
        Object r10 = r7.next();
        int r11 = ((EnergyRating) r10).getMScore();
        if (r9 >= r11) goto L32;
        r8 = r10;
        r9 = r11;
    L32:
        if (r7.hasNext() == true) goto L28;
    L33:
        int r12 = ((EnergyRating) r8).getMScore();
        DINCondBold r13 = this.energyRatingLastValue;
        if (r13 != null) goto L36;
        Intrinsics.XXO("energyRatingLastValue");
        r13 = null;
    L36:
        r13.setText(String.valueOf(r12));
        EnergySegmentProgressView r14 = this.mSegmentProgressView;
        if (r14 != null) goto L39;
        Intrinsics.XXO("mSegmentProgressView");
    L40:
        r4.setSelectIndex(EnergyRatingDataKt.getEnergyRatingLevel(r12));
        return;
    L39:
        r4 = r14;
        goto L40
    L43:
        throw new NoSuchElementException();
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.status_item_energy_tating;
    }

    @sf5(tag = I01XX0.iIIIiIO0)
    public final void onDataChanged(@aa1 Object r2) {
        Intrinsics.X0O(r2, "data");
        LogUtils.v(new Object[]{"SWEnergyRatingItem onDataChanged"});
        initView();
    }

    public final void setEnergyRatingList(@aa1 List<EnergyRating> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.energyRatingList = r2;
    }

    public final void setMContext(@aa1 Context r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mContext = r2;
    }

    public final void setRange(@aa1 long[] r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.range = r2;
    }
}
