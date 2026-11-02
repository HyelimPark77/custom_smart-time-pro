package com.sma.smartv3.ui.me;

import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.iiO11XiX;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.wd0;
import com.android.mltcode.paycertificationapi.xd0;
import com.android.mltcode.paycertificationapi.yd0;
import com.angcyo.dsladapter.DslAdapter;
import com.angcyo.dsladapter.DslAdapterExKt;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import com.blankj.utilcode.util.BarUtils;
import com.sma.smartv3.biz.OrderManager;
import com.sma.smartv3.initializer.BleInitializer;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.device.item.SplitLine4DPItem;
import com.sma.smartv3.ui.me.item.MeAvatar2Item;
import com.sma.smartv3.ui.me.item.MeBottom2Item;
import com.sma.smartv3.ui.me.item.MeMiddle2Item;
import com.sma.smartv3.ui.me.item.MeUserOrder2Item;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class Me2Fragment extends MainMeFragment implements iiO11XiX {

    @aa1
    private final MeBottom2Item meBottom2Item;

    public Me2Fragment() {
        MeBottom2Item r0 = new MeBottom2Item();
        r0.setMOnClick(this);
        this.meBottom2Item = r0;
    }

    public static /* synthetic */ Unit I1XOi1(Me2Fragment r0, DslAdapter r1) {
        return renderAdapterMethod$lambda$0(r0, r1);
    }

    public static /* synthetic */ Unit IIX1OXO(Me2Fragment r0, DslAdapter r1) {
        return renderAdapterMethod$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ Unit X0O(Me2Fragment r0) {
        return renderAdapterMethod$lambda$0$0(r0);
    }

    private static final Unit renderAdapterMethod$lambda$0(final Me2Fragment r1, DslAdapter r2) {
        Intrinsics.X0O(r2, "$this$renderAdapter");
        r1.getDslViewHolder().post(new xd0(r1));
        return Unit.OXO1;
    }

    private static final Unit renderAdapterMethod$lambda$0$0(final Me2Fragment r1) {
        r1.getDslAdapter().clearAllItems();
        r1.renderAdapter(new yd0(r1));
        return Unit.OXO1;
    }

    private static final Unit renderAdapterMethod$lambda$0$0$0(Me2Fragment r3, DslAdapter r4) {
        Intrinsics.X0O(r4, "$this$renderAdapter");
        MeAvatar2Item r0 = new MeAvatar2Item();
        r0.setMOnClick(r3);
        DslAdapterExKt.IIX1OXO(r4, r0, null, 2, null);
        MeUserOrder2Item r1 = new MeUserOrder2Item();
        r1.setMOnClick(r3);
        DslAdapterExKt.IIX1OXO(r4, r1, null, 2, null);
        MeMiddle2Item r2 = new MeMiddle2Item();
        r2.setMOnClick(r3);
        DslAdapterExKt.IIX1OXO(r4, r2, null, 2, null);
        DslAdapterExKt.IIX1OXO(r4, r3.meBottom2Item, null, 2, null);
        if (q62.OXO1.iOIi00Ii() == false) goto L13;
        if (i72.OXO1.X11I() == false) goto L13;
        if (r3.getBannerItem() != null) goto L9;
        r3.setBannerItem(r3.getAdBannerItem());
    L9:
        BaseDslItem r5 = r3.getBannerItem();
        if (r5 == null) goto L13;
        DslAdapterExKt.IIX1OXO(r4, r5, null, 2, null);
        DslAdapterExKt.IIX1OXO(r4, new SplitLine4DPItem(), null, 2, null);
    L13:
        return Unit.OXO1;
    }

    @Override // com.sma.smartv3.ui.me.MainMeFragment, com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        BarUtils.addMarginTopEqualStatusBarHeight(getMView().findViewById(R.id.rv));
    }

    @Override // com.sma.smartv3.ui.me.MainMeFragment, com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.v2_me_fragment_rv;
    }

    @Override // com.android.mltcode.paycertificationapi.iiO11XiX
    public void onFragmentVisibilityChanged(boolean r3) {
        I01XX0.XIi00iiXO(I01XX0.O1, null, 2, null);
    }

    @Override // com.sma.smartv3.ui.me.MainMeFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        BleInitializer r0 = BleInitializer.IO;
        if (r0.I0iOXO() == false) goto L6;
        r0.ii00OXXO(false);
        OrderManager.OXO1.iI();
        return;
    }

    @Override // com.sma.smartv3.ui.me.MainMeFragment
    public void renderAdapterMethod() {
        renderAdapter(new wd0(this));
    }
}
