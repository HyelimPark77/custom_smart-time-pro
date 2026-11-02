package com.sma.smartv3.p610ui.p612me;

import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.iiO11XiX;
import com.android.mltcode.paycertificationapi.q62;
import com.angcyo.dsladapter.DslAdapter;
import com.angcyo.dsladapter.DslAdapterExKt;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import com.blankj.utilcode.util.BarUtils;
import com.sma.smartv3.biz.OrderManager;
import com.sma.smartv3.initializer.BleInitializer;
import com.sma.smartv3.p610ui.device.item.SplitLine4DPItem;
import com.sma.smartv3.p610ui.p612me.Me2Fragment;
import com.sma.smartv3.p610ui.p612me.item.MeAvatar2Item;
import com.sma.smartv3.p610ui.p612me.item.MeBottom2Item;
import com.sma.smartv3.p610ui.p612me.item.MeMiddle2Item;
import com.sma.smartv3.p610ui.p612me.item.MeUserOrder2Item;
import com.sma.smartv3.pro.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class Me2Fragment extends MainMeFragment implements iiO11XiX {

    @aa1
    private final MeBottom2Item meBottom2Item;

    public Me2Fragment() {
        MeBottom2Item meBottom2Item = new MeBottom2Item();
        meBottom2Item.setMOnClick(this);
        this.meBottom2Item = meBottom2Item;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderAdapterMethod$lambda$0(final Me2Fragment me2Fragment, DslAdapter renderAdapter) {
        Intrinsics.X0O(renderAdapter, "$this$renderAdapter");
        me2Fragment.getDslViewHolder().post(new Function0() { // from class: com.android.mltcode.paycertificationapi.xd0
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return Me2Fragment.renderAdapterMethod$lambda$0$0(this.f12153IO);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderAdapterMethod$lambda$0$0(final Me2Fragment me2Fragment) {
        me2Fragment.getDslAdapter().clearAllItems();
        me2Fragment.renderAdapter(new Function1() { // from class: com.android.mltcode.paycertificationapi.yd0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Me2Fragment.renderAdapterMethod$lambda$0$0$0(this.f12354IO, (DslAdapter) obj);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderAdapterMethod$lambda$0$0$0(Me2Fragment me2Fragment, DslAdapter renderAdapter) {
        Intrinsics.X0O(renderAdapter, "$this$renderAdapter");
        MeAvatar2Item meAvatar2Item = new MeAvatar2Item();
        meAvatar2Item.setMOnClick(me2Fragment);
        DslAdapterExKt.IIX1OXO(renderAdapter, meAvatar2Item, null, 2, null);
        MeUserOrder2Item meUserOrder2Item = new MeUserOrder2Item();
        meUserOrder2Item.setMOnClick(me2Fragment);
        DslAdapterExKt.IIX1OXO(renderAdapter, meUserOrder2Item, null, 2, null);
        MeMiddle2Item meMiddle2Item = new MeMiddle2Item();
        meMiddle2Item.setMOnClick(me2Fragment);
        DslAdapterExKt.IIX1OXO(renderAdapter, meMiddle2Item, null, 2, null);
        DslAdapterExKt.IIX1OXO(renderAdapter, me2Fragment.meBottom2Item, null, 2, null);
        if (q62.OXO1.iOIi00Ii() && i72.OXO1.X11I()) {
            if (me2Fragment.getBannerItem() == null) {
                me2Fragment.setBannerItem(me2Fragment.getAdBannerItem());
            }
            BaseDslItem bannerItem = me2Fragment.getBannerItem();
            if (bannerItem != null) {
                DslAdapterExKt.IIX1OXO(renderAdapter, bannerItem, null, 2, null);
                DslAdapterExKt.IIX1OXO(renderAdapter, new SplitLine4DPItem(), null, 2, null);
            }
        }
        return Unit.OXO1;
    }

    @Override // com.sma.smartv3.p610ui.p612me.MainMeFragment, com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        BarUtils.addMarginTopEqualStatusBarHeight(getMView().findViewById(R.id.f51422rv));
    }

    @Override // com.sma.smartv3.p610ui.p612me.MainMeFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.v2_me_fragment_rv;
    }

    @Override // com.android.mltcode.paycertificationapi.iiO11XiX
    public void onFragmentVisibilityChanged(boolean z) {
        I01XX0.XIi00iiXO(I01XX0.f1085O1, null, 2, null);
    }

    @Override // com.sma.smartv3.p610ui.p612me.MainMeFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        BleInitializer bleInitializer = BleInitializer.f51208IO;
        if (bleInitializer.I0iOXO()) {
            bleInitializer.ii00OXXO(false);
            OrderManager.OXO1.m38109iI();
        }
    }

    @Override // com.sma.smartv3.p610ui.p612me.MainMeFragment
    public void renderAdapterMethod() {
        renderAdapter(new Function1() { // from class: com.android.mltcode.paycertificationapi.wd0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Me2Fragment.renderAdapterMethod$lambda$0(this.f11927IO, (DslAdapter) obj);
            }
        });
    }
}
