package com.sma.smartv3.p610ui.status;

import android.content.Intent;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.k30;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.w85;
import com.angcyo.dsladapter.DslAdapterItem;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import com.blankj.utilcode.util.BarUtils;
import com.blankj.utilcode.util.SPUtils;
import com.google.gson.Gson;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.p610ui.login.LoginReminderActivity;
import com.sma.smartv3.p610ui.status.MainStatus2Fragment;
import com.sma.smartv3.p610ui.status.item.BloodGlucose2Item;
import com.sma.smartv3.p610ui.status.item.BloodGlucose2Item2;
import com.sma.smartv3.p610ui.status.item.BloodOxyGen2Item;
import com.sma.smartv3.p610ui.status.item.BloodPressure2Item;
import com.sma.smartv3.p610ui.status.item.EditCardItem;
import com.sma.smartv3.p610ui.status.item.Electrocardiogram2Item;
import com.sma.smartv3.p610ui.status.item.HeartRate2Item;
import com.sma.smartv3.p610ui.status.item.HeathReports2Item;
import com.sma.smartv3.p610ui.status.item.Hrv2Item;
import com.sma.smartv3.p610ui.status.item.MainSportRecord2Item;
import com.sma.smartv3.p610ui.status.item.MainStatusFunctionsItem;
import com.sma.smartv3.p610ui.status.item.MainStep2Item;
import com.sma.smartv3.p610ui.status.item.Pressure2Item;
import com.sma.smartv3.p610ui.status.item.Sleep2Item;
import com.sma.smartv3.p610ui.status.item.Temperature2Item;
import com.sma.smartv3.p610ui.status.item.TodayDataItem;
import com.sma.smartv3.p610ui.status.item.Weight2Item;
import com.sma.smartv3.pro.R;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nMainStatus2Fragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainStatus2Fragment.kt\ncom/sma/smartv3/ui/status/MainStatus2Fragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 5 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,162:1\n1#2:163\n1#2:169\n1#2:178\n1#2:187\n1#2:196\n1#2:205\n1#2:214\n1#2:223\n1#2:232\n1#2:241\n1#2:250\n1#2:259\n1#2:270\n1#2:279\n1#2:290\n37#3,2:164\n78#4,3:166\n81#4,5:170\n78#4,3:175\n81#4,5:179\n78#4,3:184\n81#4,5:188\n78#4,3:193\n81#4,5:197\n78#4,3:202\n81#4,5:206\n78#4,3:211\n81#4,5:215\n78#4,3:220\n81#4,5:224\n78#4,3:229\n81#4,5:233\n78#4,3:238\n81#4,5:242\n78#4,3:247\n81#4,5:251\n78#4,3:256\n81#4,5:260\n78#4,3:267\n81#4,5:271\n78#4,3:276\n81#4,5:280\n151#4,5:285\n156#4,5:291\n19#5:265\n15#5:266\n*S KotlinDebug\n*F\n+ 1 MainStatus2Fragment.kt\ncom/sma/smartv3/ui/status/MainStatus2Fragment\n*L\n67#1:169\n76#1:178\n90#1:187\n94#1:196\n98#1:205\n102#1:214\n106#1:223\n110#1:232\n114#1:241\n118#1:250\n122#1:259\n133#1:270\n135#1:279\n157#1:290\n72#1:164,2\n67#1:166,3\n67#1:170,5\n76#1:175,3\n76#1:179,5\n90#1:184,3\n90#1:188,5\n94#1:193,3\n94#1:197,5\n98#1:202,3\n98#1:206,5\n102#1:211,3\n102#1:215,5\n106#1:220,3\n106#1:224,5\n110#1:229,3\n110#1:233,5\n114#1:238,3\n114#1:242,5\n118#1:247,3\n118#1:251,5\n122#1:256,3\n122#1:260,5\n133#1:267,3\n133#1:271,5\n135#1:276,3\n135#1:280,5\n157#1:285,5\n157#1:291,5\n127#1:265\n127#1:266\n*E\n"})
public final class MainStatus2Fragment extends MainStatusFragment {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showCard$lambda$1$0(MainStatus2Fragment mainStatus2Fragment, View it) {
        Intrinsics.X0O(it, "it");
        if (w85.OXO1.OXO1()) {
            mainStatus2Fragment.startActivity(new Intent(mainStatus2Fragment.getActivity(), (Class<?>) TodayHealthyDataActivity.class));
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showCard$lambda$10$0(MainStatus2Fragment mainStatus2Fragment, View it) {
        Intrinsics.X0O(it, "it");
        if (w85.OXO1.OXO1()) {
            mainStatus2Fragment.startActivity(new Intent(mainStatus2Fragment.getActivity(), (Class<?>) PressureActivity.class));
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showCard$lambda$11$0(MainStatus2Fragment mainStatus2Fragment, View it) {
        Intrinsics.X0O(it, "it");
        if (w85.OXO1.OXO1()) {
            mainStatus2Fragment.startActivity(new Intent(mainStatus2Fragment.getActivity(), (Class<?>) BloodGlucoseActivity.class));
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showCard$lambda$12$0(MainStatus2Fragment mainStatus2Fragment, View it) {
        Intrinsics.X0O(it, "it");
        a01 a01Var = a01.OXO1;
        SPUtils sPUtilsIiI10X = a01Var.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        if (objFromJson != null) {
            appUser = objFromJson;
        }
        AppUser appUser2 = (AppUser) appUser;
        if (!a01Var.IiI10X().getBoolean(b01.O001I, true) || appUser2.getIdentity().length() <= 0) {
            mainStatus2Fragment.startActivity(new Intent(mainStatus2Fragment.getActivity(), (Class<?>) LoginReminderActivity.class));
        } else if (w85.OXO1.OXO1()) {
            mainStatus2Fragment.startActivity(new Intent(mainStatus2Fragment.getActivity(), (Class<?>) BloodGlucose2Activity.class));
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showCard$lambda$15$0(MainStatus2Fragment mainStatus2Fragment, View it) {
        Intrinsics.X0O(it, "it");
        if (w85.OXO1.OXO1()) {
            FragmentActivity activity = mainStatus2Fragment.getActivity();
            Intrinsics.XXI(activity);
            mainStatus2Fragment.startActivityForResult(new Intent(activity, (Class<?>) EditCardActivity.class), k30.OXO1);
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showCard$lambda$2$0(MainStatus2Fragment mainStatus2Fragment, View it) {
        Intrinsics.X0O(it, "it");
        if (w85.OXO1.OXO1()) {
            mainStatus2Fragment.startActivity(new Intent(mainStatus2Fragment.getActivity(), (Class<?>) HeartRateActivity.class));
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showCard$lambda$3$0(MainStatus2Fragment mainStatus2Fragment, View it) {
        Intrinsics.X0O(it, "it");
        if (w85.OXO1.OXO1()) {
            mainStatus2Fragment.startActivity(new Intent(mainStatus2Fragment.getActivity(), (Class<?>) ElectrocardiogramActivity.class));
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showCard$lambda$4$0(MainStatus2Fragment mainStatus2Fragment, View it) {
        Intrinsics.X0O(it, "it");
        if (w85.OXO1.OXO1()) {
            mainStatus2Fragment.startActivity(new Intent(mainStatus2Fragment.getActivity(), (Class<?>) HrvActivity.class));
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showCard$lambda$5$0(MainStatus2Fragment mainStatus2Fragment, View it) {
        Intrinsics.X0O(it, "it");
        if (w85.OXO1.OXO1()) {
            mainStatus2Fragment.startActivity(new Intent(mainStatus2Fragment.getActivity(), (Class<?>) BloodPressureActivity.class));
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showCard$lambda$6$0(MainStatus2Fragment mainStatus2Fragment, View it) {
        Intrinsics.X0O(it, "it");
        if (w85.OXO1.OXO1()) {
            mainStatus2Fragment.startActivity(new Intent(mainStatus2Fragment.getActivity(), (Class<?>) BloodOxyGenActivity.class));
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showCard$lambda$7$0(MainStatus2Fragment mainStatus2Fragment, View it) {
        Intrinsics.X0O(it, "it");
        if (w85.OXO1.OXO1()) {
            mainStatus2Fragment.startActivity(new Intent(mainStatus2Fragment.getActivity(), (Class<?>) SleepActivity.class));
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showCard$lambda$8$0(MainStatus2Fragment mainStatus2Fragment, View it) {
        Intrinsics.X0O(it, "it");
        if (w85.OXO1.OXO1()) {
            mainStatus2Fragment.startActivity(new Intent(mainStatus2Fragment.getActivity(), (Class<?>) TemperatureActivity.class));
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showCard$lambda$9$0(MainStatus2Fragment mainStatus2Fragment, View it) {
        Intrinsics.X0O(it, "it");
        if (w85.OXO1.OXO1()) {
            mainStatus2Fragment.startActivity(new Intent(mainStatus2Fragment.getActivity(), (Class<?>) WeightActivity.class));
        }
        return Unit.OXO1;
    }

    @Override // com.sma.smartv3.p610ui.status.MainStatusFragment, com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        BarUtils.addMarginTopEqualStatusBarHeight(getMView().findViewById(R.id.srf));
        getRecyclerView().setHasFixedSize(false);
    }

    @Override // com.sma.smartv3.p610ui.status.MainStatusFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.v2_fragment_srf_rv;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.sma.smartv3.p610ui.status.MainStatusFragment
    @aa1
    public ArrayList<DslAdapterItem> showCard() {
        getShowList().clear();
        getShowList().add(new MainStep2Item());
        getShowList().add(new MainSportRecord2Item());
        i72 i72Var = i72.OXO1;
        if (!i72Var.X11I() && q62.OXO1.iOIi00Ii()) {
            if (getBannerItem() == null) {
                setBannerItem(getAdBannerItem());
            }
            BaseDslItem bannerItem = getBannerItem();
            if (bannerItem != null) {
                getShowList().add(bannerItem);
            }
        }
        if (i72Var.I0i0() && !i72Var.OIIOI()) {
            getShowList().add(new HeathReports2Item());
        }
        if (i72Var.I1OI()) {
            ArrayList<DslAdapterItem> showList = getShowList();
            TodayDataItem todayDataItem = new TodayDataItem();
            todayDataItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.f20
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return MainStatus2Fragment.showCard$lambda$1$0(this.f6559IO, (View) obj);
                }
            });
            showList.add(todayDataItem);
        }
        ArrayList arrayList = new ArrayList();
        String cardOrder = getCardOrder();
        Intrinsics.O10IXXX0X(cardOrder, "<get-cardOrder>(...)");
        for (String str : (String[]) StringsKt__StringsKt.i1I(cardOrder, new String[]{I000IiI1O.C2156iO.XO0O10}, false, 0, 6, null).toArray(new String[0])) {
            switch (str.hashCode()) {
                case -2030863703:
                    if (str.equals(q62.Oi0X)) {
                        BloodGlucose2Item bloodGlucose2Item = new BloodGlucose2Item();
                        bloodGlucose2Item.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.j20
                            @Override // kotlin.jvm.functions.Function1
                            /* JADX INFO: renamed from: invoke */
                            public final Object invoke2(Object obj) {
                                return MainStatus2Fragment.showCard$lambda$11$0(this.f8865IO, (View) obj);
                            }
                        });
                        arrayList.add(bloodGlucose2Item);
                    }
                    break;
                case -1276242363:
                    if (str.equals(q62.IIII0II)) {
                        Pressure2Item pressure2Item = new Pressure2Item();
                        pressure2Item.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.i20
                            @Override // kotlin.jvm.functions.Function1
                            /* JADX INFO: renamed from: invoke */
                            public final Object invoke2(Object obj) {
                                return MainStatus2Fragment.showCard$lambda$10$0(this.f7731IO, (View) obj);
                            }
                        });
                        arrayList.add(pressure2Item);
                    }
                    break;
                case -791592328:
                    if (str.equals("weight")) {
                        Weight2Item weight2Item = new Weight2Item();
                        weight2Item.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.h20
                            @Override // kotlin.jvm.functions.Function1
                            /* JADX INFO: renamed from: invoke */
                            public final Object invoke2(Object obj) {
                                return MainStatus2Fragment.showCard$lambda$9$0(this.f7033IO, (View) obj);
                            }
                        });
                        arrayList.add(weight2Item);
                    }
                    break;
                case -240915579:
                    if (str.equals(q62.IiOIO1OX)) {
                        BloodOxyGen2Item bloodOxyGen2Item = new BloodOxyGen2Item();
                        bloodOxyGen2Item.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.q20
                            @Override // kotlin.jvm.functions.Function1
                            /* JADX INFO: renamed from: invoke */
                            public final Object invoke2(Object obj) {
                                return MainStatus2Fragment.showCard$lambda$6$0(this.f10495IO, (View) obj);
                            }
                        });
                        arrayList.add(bloodOxyGen2Item);
                    }
                    break;
                case 100233:
                    if (str.equals(q62.XiI1iO1i)) {
                        Electrocardiogram2Item electrocardiogram2Item = new Electrocardiogram2Item();
                        electrocardiogram2Item.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.n20
                            @Override // kotlin.jvm.functions.Function1
                            /* JADX INFO: renamed from: invoke */
                            public final Object invoke2(Object obj) {
                                return MainStatus2Fragment.showCard$lambda$3$0(this.f9834IO, (View) obj);
                            }
                        });
                        arrayList.add(electrocardiogram2Item);
                    }
                    break;
                case 103596:
                    if (str.equals(q62.XOX1)) {
                        Hrv2Item hrv2Item = new Hrv2Item();
                        hrv2Item.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.o20
                            @Override // kotlin.jvm.functions.Function1
                            /* JADX INFO: renamed from: invoke */
                            public final Object invoke2(Object obj) {
                                return MainStatus2Fragment.showCard$lambda$4$0(this.f10057IO, (View) obj);
                            }
                        });
                        arrayList.add(hrv2Item);
                    }
                    break;
                case 109522647:
                    if (str.equals("sleep")) {
                        Sleep2Item sleep2Item = new Sleep2Item();
                        sleep2Item.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.r20
                            @Override // kotlin.jvm.functions.Function1
                            /* JADX INFO: renamed from: invoke */
                            public final Object invoke2(Object obj) {
                                return MainStatus2Fragment.showCard$lambda$7$0(this.f10733IO, (View) obj);
                            }
                        });
                        arrayList.add(sleep2Item);
                    }
                    break;
                case 321701236:
                    if (str.equals("temperature")) {
                        Temperature2Item temperature2Item = new Temperature2Item();
                        temperature2Item.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.g20
                            @Override // kotlin.jvm.functions.Function1
                            /* JADX INFO: renamed from: invoke */
                            public final Object invoke2(Object obj) {
                                return MainStatus2Fragment.showCard$lambda$8$0(this.f6794IO, (View) obj);
                            }
                        });
                        arrayList.add(temperature2Item);
                    }
                    break;
                case 560044778:
                    if (str.equals(q62.OXOXXiI)) {
                        BloodPressure2Item bloodPressure2Item = new BloodPressure2Item();
                        bloodPressure2Item.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.p20
                            @Override // kotlin.jvm.functions.Function1
                            /* JADX INFO: renamed from: invoke */
                            public final Object invoke2(Object obj) {
                                return MainStatus2Fragment.showCard$lambda$5$0(this.f10277IO, (View) obj);
                            }
                        });
                        arrayList.add(bloodPressure2Item);
                    }
                    break;
                case 1467734697:
                    if (str.equals(q62.O001OXi)) {
                        BloodGlucose2Item2 bloodGlucose2Item2 = new BloodGlucose2Item2();
                        bloodGlucose2Item2.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.k20
                            @Override // kotlin.jvm.functions.Function1
                            /* JADX INFO: renamed from: invoke */
                            public final Object invoke2(Object obj) {
                                return MainStatus2Fragment.showCard$lambda$12$0(this.f9093IO, (View) obj);
                            }
                        });
                        arrayList.add(bloodGlucose2Item2);
                    }
                    break;
                case 1930449209:
                    if (str.equals("heart_rate")) {
                        HeartRate2Item heartRate2Item = new HeartRate2Item();
                        heartRate2Item.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.m20
                            @Override // kotlin.jvm.functions.Function1
                            /* JADX INFO: renamed from: invoke */
                            public final Object invoke2(Object obj) {
                                return MainStatus2Fragment.showCard$lambda$2$0(this.f9599IO, (View) obj);
                            }
                        });
                        arrayList.add(heartRate2Item);
                    }
                    break;
            }
        }
        ArrayList<DslAdapterItem> showList2 = getShowList();
        MainStatusFunctionsItem mainStatusFunctionsItem = new MainStatusFunctionsItem();
        mainStatusFunctionsItem.setItems(arrayList);
        showList2.add(mainStatusFunctionsItem);
        if (i72.OXO1.X11I() && q62.OXO1.iOIi00Ii()) {
            if (getBannerItem() == null) {
                setBannerItem(getAdBannerItem());
            }
            BaseDslItem bannerItem2 = getBannerItem();
            if (bannerItem2 != null) {
                getShowList().add(bannerItem2);
            }
        }
        ArrayList<DslAdapterItem> showList3 = getShowList();
        EditCardItem editCardItem = new EditCardItem();
        editCardItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.l20
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MainStatus2Fragment.showCard$lambda$15$0(this.f9334IO, (View) obj);
            }
        });
        showList3.add(editCardItem);
        return getShowList();
    }
}
