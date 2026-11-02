package com.sma.smartv3.ui.status;

import android.content.Intent;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.f20;
import com.android.mltcode.paycertificationapi.g20;
import com.android.mltcode.paycertificationapi.h20;
import com.android.mltcode.paycertificationapi.i20;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.j20;
import com.android.mltcode.paycertificationapi.k20;
import com.android.mltcode.paycertificationapi.k30;
import com.android.mltcode.paycertificationapi.l20;
import com.android.mltcode.paycertificationapi.m20;
import com.android.mltcode.paycertificationapi.n20;
import com.android.mltcode.paycertificationapi.o20;
import com.android.mltcode.paycertificationapi.p20;
import com.android.mltcode.paycertificationapi.q20;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.r20;
import com.android.mltcode.paycertificationapi.w85;
import com.angcyo.dsladapter.DslAdapterItem;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import com.blankj.utilcode.util.BarUtils;
import com.blankj.utilcode.util.SPUtils;
import com.google.gson.Gson;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.login.LoginReminderActivity;
import com.sma.smartv3.ui.status.item.BloodGlucose2Item;
import com.sma.smartv3.ui.status.item.BloodGlucose2Item2;
import com.sma.smartv3.ui.status.item.BloodOxyGen2Item;
import com.sma.smartv3.ui.status.item.BloodPressure2Item;
import com.sma.smartv3.ui.status.item.EditCardItem;
import com.sma.smartv3.ui.status.item.Electrocardiogram2Item;
import com.sma.smartv3.ui.status.item.HeartRate2Item;
import com.sma.smartv3.ui.status.item.HeathReports2Item;
import com.sma.smartv3.ui.status.item.Hrv2Item;
import com.sma.smartv3.ui.status.item.MainSportRecord2Item;
import com.sma.smartv3.ui.status.item.MainStatusFunctionsItem;
import com.sma.smartv3.ui.status.item.MainStep2Item;
import com.sma.smartv3.ui.status.item.Pressure2Item;
import com.sma.smartv3.ui.status.item.Sleep2Item;
import com.sma.smartv3.ui.status.item.Temperature2Item;
import com.sma.smartv3.ui.status.item.TodayDataItem;
import com.sma.smartv3.ui.status.item.Weight2Item;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nMainStatus2Fragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainStatus2Fragment.kt\ncom/sma/smartv3/ui/status/MainStatus2Fragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 5 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,162:1\n1#2:163\n1#2:169\n1#2:178\n1#2:187\n1#2:196\n1#2:205\n1#2:214\n1#2:223\n1#2:232\n1#2:241\n1#2:250\n1#2:259\n1#2:270\n1#2:279\n1#2:290\n37#3,2:164\n78#4,3:166\n81#4,5:170\n78#4,3:175\n81#4,5:179\n78#4,3:184\n81#4,5:188\n78#4,3:193\n81#4,5:197\n78#4,3:202\n81#4,5:206\n78#4,3:211\n81#4,5:215\n78#4,3:220\n81#4,5:224\n78#4,3:229\n81#4,5:233\n78#4,3:238\n81#4,5:242\n78#4,3:247\n81#4,5:251\n78#4,3:256\n81#4,5:260\n78#4,3:267\n81#4,5:271\n78#4,3:276\n81#4,5:280\n151#4,5:285\n156#4,5:291\n19#5:265\n15#5:266\n*S KotlinDebug\n*F\n+ 1 MainStatus2Fragment.kt\ncom/sma/smartv3/ui/status/MainStatus2Fragment\n*L\n67#1:169\n76#1:178\n90#1:187\n94#1:196\n98#1:205\n102#1:214\n106#1:223\n110#1:232\n114#1:241\n118#1:250\n122#1:259\n133#1:270\n135#1:279\n157#1:290\n72#1:164,2\n67#1:166,3\n67#1:170,5\n76#1:175,3\n76#1:179,5\n90#1:184,3\n90#1:188,5\n94#1:193,3\n94#1:197,5\n98#1:202,3\n98#1:206,5\n102#1:211,3\n102#1:215,5\n106#1:220,3\n106#1:224,5\n110#1:229,3\n110#1:233,5\n114#1:238,3\n114#1:242,5\n118#1:247,3\n118#1:251,5\n122#1:256,3\n122#1:260,5\n133#1:267,3\n133#1:271,5\n135#1:276,3\n135#1:280,5\n157#1:285,5\n157#1:291,5\n127#1:265\n127#1:266\n*E\n"})
public final class MainStatus2Fragment extends MainStatusFragment {
    public MainStatus2Fragment() {
    }

    public static /* synthetic */ Unit I1(MainStatus2Fragment r0, View r1) {
        return showCard$lambda$6$0(r0, r1);
    }

    public static /* synthetic */ Unit II1Xi0(MainStatus2Fragment r0, View r1) {
        return showCard$lambda$12$0(r0, r1);
    }

    public static /* synthetic */ Unit IXXOO(MainStatus2Fragment r0, View r1) {
        return showCard$lambda$11$0(r0, r1);
    }

    public static /* synthetic */ Unit OII(MainStatus2Fragment r0, View r1) {
        return showCard$lambda$8$0(r0, r1);
    }

    public static /* synthetic */ Unit OX(MainStatus2Fragment r0, View r1) {
        return showCard$lambda$2$0(r0, r1);
    }

    public static /* synthetic */ Unit OiIIX101O(MainStatus2Fragment r0, View r1) {
        return showCard$lambda$9$0(r0, r1);
    }

    public static /* synthetic */ Unit X01IiOiIi(MainStatus2Fragment r0, View r1) {
        return showCard$lambda$1$0(r0, r1);
    }

    public static /* synthetic */ Unit XX0(MainStatus2Fragment r0, View r1) {
        return showCard$lambda$15$0(r0, r1);
    }

    public static /* synthetic */ Unit XiOIii1(MainStatus2Fragment r0, View r1) {
        return showCard$lambda$4$0(r0, r1);
    }

    public static /* synthetic */ Unit i010I(MainStatus2Fragment r0, View r1) {
        return showCard$lambda$5$0(r0, r1);
    }

    public static /* synthetic */ Unit iOO1ii1(MainStatus2Fragment r0, View r1) {
        return showCard$lambda$10$0(r0, r1);
    }

    public static /* synthetic */ Unit iOOX010X(MainStatus2Fragment r0, View r1) {
        return showCard$lambda$7$0(r0, r1);
    }

    public static /* synthetic */ Unit iX(MainStatus2Fragment r0, View r1) {
        return showCard$lambda$3$0(r0, r1);
    }

    private static final Unit showCard$lambda$1$0(MainStatus2Fragment r2, View r3) {
        Intrinsics.X0O(r3, "it");
        if (w85.OXO1.OXO1() == false) goto L6;
        r2.startActivity(new Intent(r2.getActivity(), TodayHealthyDataActivity.class));
    L6:
        return Unit.OXO1;
    }

    private static final Unit showCard$lambda$10$0(MainStatus2Fragment r2, View r3) {
        Intrinsics.X0O(r3, "it");
        if (w85.OXO1.OXO1() == false) goto L6;
        r2.startActivity(new Intent(r2.getActivity(), PressureActivity.class));
    L6:
        return Unit.OXO1;
    }

    private static final Unit showCard$lambda$11$0(MainStatus2Fragment r2, View r3) {
        Intrinsics.X0O(r3, "it");
        if (w85.OXO1.OXO1() == false) goto L6;
        r2.startActivity(new Intent(r2.getActivity(), BloodGlucoseActivity.class));
    L6:
        return Unit.OXO1;
    }

    private static final Unit showCard$lambda$12$0(MainStatus2Fragment r33, View r34) {
        Intrinsics.X0O(r34, "it");
        a01 r1 = a01.OXO1;
        SPUtils r2 = r1.IiI10X();
        Object r3 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r4 = new Gson().fromJson(r2.getString(AppUser.class.getName()), AppUser.class);
        if (r4 == null) goto L6;
        r3 = r4;
    L6:
        AppUser r5 = (AppUser) r3;
        if (r1.IiI10X().getBoolean(b01.O001I, true) == true) goto L9;
    L13:
        r33.startActivity(new Intent(r33.getActivity(), LoginReminderActivity.class));
    L15:
        return Unit.OXO1;
    L9:
        if (r5.getIdentity().length() <= 0) goto L13;
        if (w85.OXO1.OXO1() == false) goto L15;
        r33.startActivity(new Intent(r33.getActivity(), BloodGlucose2Activity.class));
        goto L15
    }

    private static final Unit showCard$lambda$15$0(MainStatus2Fragment r2, View r3) {
        Intrinsics.X0O(r3, "it");
        if (w85.OXO1.OXO1() == false) goto L6;
        FragmentActivity r0 = r2.getActivity();
        Intrinsics.XXI(r0);
        r2.startActivityForResult(new Intent(r0, EditCardActivity.class), k30.OXO1);
    L6:
        return Unit.OXO1;
    }

    private static final Unit showCard$lambda$2$0(MainStatus2Fragment r2, View r3) {
        Intrinsics.X0O(r3, "it");
        if (w85.OXO1.OXO1() == false) goto L6;
        r2.startActivity(new Intent(r2.getActivity(), HeartRateActivity.class));
    L6:
        return Unit.OXO1;
    }

    private static final Unit showCard$lambda$3$0(MainStatus2Fragment r2, View r3) {
        Intrinsics.X0O(r3, "it");
        if (w85.OXO1.OXO1() == false) goto L6;
        r2.startActivity(new Intent(r2.getActivity(), ElectrocardiogramActivity.class));
    L6:
        return Unit.OXO1;
    }

    private static final Unit showCard$lambda$4$0(MainStatus2Fragment r2, View r3) {
        Intrinsics.X0O(r3, "it");
        if (w85.OXO1.OXO1() == false) goto L6;
        r2.startActivity(new Intent(r2.getActivity(), HrvActivity.class));
    L6:
        return Unit.OXO1;
    }

    private static final Unit showCard$lambda$5$0(MainStatus2Fragment r2, View r3) {
        Intrinsics.X0O(r3, "it");
        if (w85.OXO1.OXO1() == false) goto L6;
        r2.startActivity(new Intent(r2.getActivity(), BloodPressureActivity.class));
    L6:
        return Unit.OXO1;
    }

    private static final Unit showCard$lambda$6$0(MainStatus2Fragment r2, View r3) {
        Intrinsics.X0O(r3, "it");
        if (w85.OXO1.OXO1() == false) goto L6;
        r2.startActivity(new Intent(r2.getActivity(), BloodOxyGenActivity.class));
    L6:
        return Unit.OXO1;
    }

    private static final Unit showCard$lambda$7$0(MainStatus2Fragment r2, View r3) {
        Intrinsics.X0O(r3, "it");
        if (w85.OXO1.OXO1() == false) goto L6;
        r2.startActivity(new Intent(r2.getActivity(), SleepActivity.class));
    L6:
        return Unit.OXO1;
    }

    private static final Unit showCard$lambda$8$0(MainStatus2Fragment r2, View r3) {
        Intrinsics.X0O(r3, "it");
        if (w85.OXO1.OXO1() == false) goto L6;
        r2.startActivity(new Intent(r2.getActivity(), TemperatureActivity.class));
    L6:
        return Unit.OXO1;
    }

    private static final Unit showCard$lambda$9$0(MainStatus2Fragment r2, View r3) {
        Intrinsics.X0O(r3, "it");
        if (w85.OXO1.OXO1() == false) goto L6;
        r2.startActivity(new Intent(r2.getActivity(), WeightActivity.class));
    L6:
        return Unit.OXO1;
    }

    @Override // com.sma.smartv3.ui.status.MainStatusFragment, com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        BarUtils.addMarginTopEqualStatusBarHeight(getMView().findViewById(R.id.srf));
        getRecyclerView().setHasFixedSize(false);
    }

    @Override // com.sma.smartv3.ui.status.MainStatusFragment, com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.v2_fragment_srf_rv;
    }

    @Override // com.sma.smartv3.ui.status.MainStatusFragment
    @aa1
    public ArrayList<DslAdapterItem> showCard() {
        getShowList().clear();
        getShowList().add(new MainStep2Item());
        getShowList().add(new MainSportRecord2Item());
        i72 r0 = i72.OXO1;
        if (r0.X11I() == true) goto L13;
        if (q62.OXO1.iOIi00Ii() == false) goto L13;
        if (getBannerItem() != null) goto L9;
        setBannerItem(getAdBannerItem());
    L9:
        BaseDslItem r1 = getBannerItem();
        if (r1 == null) goto L13;
        getShowList().add(r1);
    L13:
        if (r0.I0i0() == false) goto L18;
        if (r0.OIIOI() == true) goto L18;
        getShowList().add(new HeathReports2Item());
    L18:
        if (r0.I1OI() == false) goto L20;
        ArrayList<DslAdapterItem> r2 = getShowList();
        TodayDataItem r3 = new TodayDataItem();
        r3.setItemClick(new f20(this));
        r2.add(r3);
    L20:
        ArrayList r4 = new ArrayList();
        String r5 = getCardOrder();
        Intrinsics.O10IXXX0X(r5, "<get-cardOrder>(...)");
        List r6 = StringsKt__StringsKt.i1I(r5, new String[]{I000IiI1O.iO.XO0O10}, false, 0, 6, null);
        int r7 = 0;
        String[] r8 = (String[]) r6.toArray(new String[0]);
        int r9 = r8.length;
    L21:
        if (r7 >= r9) goto L70;
        String r10 = r8[r7];
        switch(r10.hashCode()) {
            case -2030863703: goto L66;
            case -1276242363: goto L62;
            case -791592328: goto L58;
            case -240915579: goto L54;
            case 100233: goto L50;
            case 103596: goto L46;
            case 109522647: goto L42;
            case 321701236: goto L38;
            case 560044778: goto L34;
            case 1467734697: goto L30;
            case 1930449209: goto L26;
            default: goto L69;
        };
    L26:
        if (r10.equals("heart_rate") == false) goto L69;
        HeartRate2Item r11 = new HeartRate2Item();
        r11.setItemClick(new m20(this));
        r4.add(r11);
        goto L69
    L30:
        if (r10.equals(q62.O001OXi) == false) goto L69;
        BloodGlucose2Item2 r12 = new BloodGlucose2Item2();
        r12.setItemClick(new k20(this));
        r4.add(r12);
        goto L69
    L34:
        if (r10.equals(q62.OXOXXiI) == false) goto L69;
        BloodPressure2Item r13 = new BloodPressure2Item();
        r13.setItemClick(new p20(this));
        r4.add(r13);
        goto L69
    L38:
        if (r10.equals("temperature") == false) goto L69;
        Temperature2Item r14 = new Temperature2Item();
        r14.setItemClick(new g20(this));
        r4.add(r14);
        goto L69
    L42:
        if (r10.equals("sleep") == false) goto L69;
        Sleep2Item r15 = new Sleep2Item();
        r15.setItemClick(new r20(this));
        r4.add(r15);
        goto L69
    L46:
        if (r10.equals(q62.XOX1) == false) goto L69;
        Hrv2Item r16 = new Hrv2Item();
        r16.setItemClick(new o20(this));
        r4.add(r16);
        goto L69
    L50:
        if (r10.equals(q62.XiI1iO1i) == false) goto L69;
        Electrocardiogram2Item r17 = new Electrocardiogram2Item();
        r17.setItemClick(new n20(this));
        r4.add(r17);
        goto L69
    L54:
        if (r10.equals(q62.IiOIO1OX) == false) goto L69;
        BloodOxyGen2Item r18 = new BloodOxyGen2Item();
        r18.setItemClick(new q20(this));
        r4.add(r18);
        goto L69
    L58:
        if (r10.equals("weight") == false) goto L69;
        Weight2Item r19 = new Weight2Item();
        r19.setItemClick(new h20(this));
        r4.add(r19);
        goto L69
    L62:
        if (r10.equals(q62.IIII0II) == false) goto L69;
        Pressure2Item r20 = new Pressure2Item();
        r20.setItemClick(new i20(this));
        r4.add(r20);
        goto L69
    L66:
        if (r10.equals(q62.Oi0X) == false) goto L69;
        BloodGlucose2Item r21 = new BloodGlucose2Item();
        r21.setItemClick(new j20(this));
        r4.add(r21);
    L69:
        r7 = r7 + 1;
        goto L21
    L70:
        ArrayList<DslAdapterItem> r22 = getShowList();
        MainStatusFunctionsItem r23 = new MainStatusFunctionsItem();
        r23.setItems(r4);
        r22.add(r23);
        if (i72.OXO1.X11I() == true) goto L73;
    L80:
        ArrayList<DslAdapterItem> r24 = getShowList();
        EditCardItem r25 = new EditCardItem();
        r25.setItemClick(new l20(this));
        r24.add(r25);
        return getShowList();
    L73:
        if (q62.OXO1.iOIi00Ii() == false) goto L80;
        if (getBannerItem() != null) goto L77;
        setBannerItem(getAdBannerItem());
    L77:
        BaseDslItem r26 = getBannerItem();
        if (r26 == null) goto L80;
        getShowList().add(r26);
        goto L80
    }
}
