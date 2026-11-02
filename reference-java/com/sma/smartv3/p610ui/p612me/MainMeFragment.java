package com.sma.smartv3.p610ui.p612me;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.TextAppearanceSpan;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.OIXX00X;
import com.android.mltcode.paycertificationapi.OXI1i1;
import com.android.mltcode.paycertificationapi.X0IOiX1O;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.tb1;
import com.angcyo.dsladapter.DslAdapter;
import com.angcyo.dsladapter.DslAdapterExKt;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment;
import com.blankj.utilcode.util.ClipboardUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.google.gson.Gson;
import com.sma.smartv3.biz.DeviceInfoChecker;
import com.sma.smartv3.biz.OrderManager;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.p610ui.device.item.SplitLine4DPItem;
import com.sma.smartv3.p610ui.order.OrderDetailActivity;
import com.sma.smartv3.p610ui.order.PointsDetailActivity;
import com.sma.smartv3.p610ui.p612me.MainMeFragment;
import com.sma.smartv3.p610ui.p612me.item.MainAvatarItem;
import com.sma.smartv3.p610ui.p612me.item.MainBottomItem;
import com.sma.smartv3.p610ui.p612me.item.MainMiddleItem;
import com.sma.smartv3.p610ui.p612me.item.MainUserOrderItem;
import com.sma.smartv3.p610ui.p612me.item.MeADPBannerItem;
import com.sma.smartv3.p610ui.p612me.item.MeADPCBannerItem;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.UtilsKt;
import com.szabh.smable3.component.BleConnector;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nMainMeFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainMeFragment.kt\ncom/sma/smartv3/ui/me/MainMeFragment\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,410:1\n78#2,3:411\n81#2,5:415\n78#2,3:423\n81#2,5:427\n78#2,3:432\n81#2,5:436\n78#2,3:441\n81#2,5:445\n78#2,3:450\n81#2,5:454\n78#2,3:459\n81#2,5:463\n99#2,7:468\n106#2,3:476\n79#2,7:479\n109#2:486\n78#2,3:487\n81#2,5:491\n78#2,3:498\n81#2,5:502\n1#3:414\n1#3:426\n1#3:435\n1#3:444\n1#3:453\n1#3:462\n1#3:475\n1#3:490\n1#3:501\n19#4:420\n15#4:421\n90#4:422\n90#4:496\n90#4:497\n*S KotlinDebug\n*F\n+ 1 MainMeFragment.kt\ncom/sma/smartv3/ui/me/MainMeFragment\n*L\n149#1:411,3\n149#1:415,5\n182#1:423,3\n182#1:427,5\n210#1:432,3\n210#1:436,5\n256#1:441,3\n256#1:445,5\n257#1:450,3\n257#1:454,5\n260#1:459,3\n260#1:463,5\n262#1:468,7\n262#1:476,3\n262#1:479,7\n262#1:486\n265#1:487,3\n265#1:491,5\n191#1:498,3\n191#1:502,5\n149#1:414\n182#1:426\n210#1:435\n256#1:444\n257#1:453\n260#1:462\n262#1:475\n265#1:490\n191#1:501\n164#1:420\n164#1:421\n167#1:422\n322#1:496\n342#1:497\n*E\n"})
public class MainMeFragment extends BaseDSLRecyclerFragment implements View.OnClickListener {

    @tb1
    private BaseDslItem bannerItem;

    @tb1
    private go0 mFirmwareRepairPopup;

    @tb1
    private OIXX00X mFreePointPopup;

    @tb1
    private go0 mUserIdentityRemindPopup;

    @tb1
    private go0 mWelfarePopup;

    @aa1
    private final MainBottomItem mainBottomItem;

    @aa1
    private final Lazy rootView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.m10
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return MainMeFragment.rootView_delegate$lambda$0(this.f9594IO);
        }
    });

    public MainMeFragment() {
        MainBottomItem mainBottomItem = new MainBottomItem();
        mainBottomItem.setMOnClick(this);
        this.mainBottomItem = mainBottomItem;
    }

    private final View getRootView() {
        return (View) this.rootView$delegate.getValue();
    }

    private final void getUserPoins() {
        i72 i72Var = i72.OXO1;
        if (i72Var.O101()) {
            if (!i72Var.IOX1()) {
                OrderManager.OXO1.XXIIO1i11();
                return;
            }
            OrderManager orderManager = OrderManager.OXO1;
            orderManager.O1O(new Function1() { // from class: com.android.mltcode.paycertificationapi.l10
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return MainMeFragment.getUserPoins$lambda$0((Boolean) obj);
                }
            });
            if (i72Var.XX1Oi()) {
                orderManager.m38109iI();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getUserPoins$lambda$0(Boolean bool) {
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onClick$lambda$0(MainMeFragment mainMeFragment, BleConnector it) {
        Intrinsics.X0O(it, "it");
        if (q62.OXO1.iiIOiX() == 1) {
            mainMeFragment.startActivity(new Intent(mainMeFragment.getActivity(), (Class<?>) CoachingsActivity.class));
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onClick$lambda$1$0(final go0 go0Var) {
        UtilsKt.iXi(go0Var.XO0O10(), new Function0() { // from class: com.android.mltcode.paycertificationapi.p10
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return MainMeFragment.onClick$lambda$1$0$0(go0Var);
            }
        });
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onClick$lambda$1$0$0(go0 go0Var) {
        DeviceInfoChecker.iOO1ii1(DeviceInfoChecker.OXO1, go0Var.XO0O10(), null, 2, null);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onClick$lambda$2$0(final go0 go0Var) {
        UtilsKt.iXi(go0Var.XO0O10(), new Function0() { // from class: com.android.mltcode.paycertificationapi.n10
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return MainMeFragment.onClick$lambda$2$0$0(go0Var);
            }
        });
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onClick$lambda$2$0$0(go0 go0Var) {
        DeviceInfoChecker.iX1O1(DeviceInfoChecker.OXO1, go0Var.XO0O10(), null, 2, null);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onClick$lambda$3$0(go0 go0Var) {
        UtilsKt.iXi(go0Var.XO0O10(), new Function0() { // from class: com.android.mltcode.paycertificationapi.q10
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return MainMeFragment.onClick$lambda$3$0$0();
            }
        });
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onClick$lambda$3$0$0() {
        I01XX0.XIi00iiXO(I01XX0.iOiXi11II, null, 2, null);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderAdapterMethod$lambda$0(final MainMeFragment mainMeFragment, DslAdapter renderAdapter) {
        Intrinsics.X0O(renderAdapter, "$this$renderAdapter");
        mainMeFragment.getDslViewHolder().post(new Function0() { // from class: com.android.mltcode.paycertificationapi.s10
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return MainMeFragment.renderAdapterMethod$lambda$0$0(this.f10950IO);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderAdapterMethod$lambda$0$0(final MainMeFragment mainMeFragment) {
        mainMeFragment.getDslAdapter().clearAllItems();
        mainMeFragment.renderAdapter(new Function1() { // from class: com.android.mltcode.paycertificationapi.r10
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MainMeFragment.renderAdapterMethod$lambda$0$0$0(this.f10726IO, (DslAdapter) obj);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderAdapterMethod$lambda$0$0$0(MainMeFragment mainMeFragment, DslAdapter renderAdapter) {
        Intrinsics.X0O(renderAdapter, "$this$renderAdapter");
        MainAvatarItem mainAvatarItem = new MainAvatarItem();
        mainAvatarItem.setMOnClick(mainMeFragment);
        DslAdapterExKt.IIX1OXO(renderAdapter, mainAvatarItem, null, 2, null);
        MainMiddleItem mainMiddleItem = new MainMiddleItem();
        mainMiddleItem.setMOnClick(mainMeFragment);
        DslAdapterExKt.IIX1OXO(renderAdapter, mainMiddleItem, null, 2, null);
        MainUserOrderItem mainUserOrderItem = new MainUserOrderItem();
        mainUserOrderItem.setMOnClick(mainMeFragment);
        DslAdapterExKt.IIX1OXO(renderAdapter, mainUserOrderItem, null, 2, null);
        DslAdapterExKt.IIX1OXO(renderAdapter, mainMeFragment.mainBottomItem, null, 2, null);
        if (q62.OXO1.iOIi00Ii() && i72.OXO1.X11I()) {
            if (mainMeFragment.bannerItem == null) {
                mainMeFragment.bannerItem = mainMeFragment.getAdBannerItem();
            }
            BaseDslItem baseDslItem = mainMeFragment.bannerItem;
            if (baseDslItem != null) {
                DslAdapterExKt.IIX1OXO(renderAdapter, baseDslItem, null, 2, null);
                DslAdapterExKt.IIX1OXO(renderAdapter, new SplitLine4DPItem(), null, 2, null);
            }
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View rootView_delegate$lambda$0(MainMeFragment mainMeFragment) {
        return mainMeFragment.getMView().findViewById(R.id.root_view);
    }

    private final void selectGoal() {
        startActivity(new Intent(getActivity(), (Class<?>) GoalSettingActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showUserIdentityCopyPopup$lambda$0$0() {
        return true;
    }

    public void customOnClick(int i) {
    }

    @tb1
    public BaseDslItem getAdBannerItem() {
        i72 i72Var = i72.OXO1;
        if (i72Var.m2046O1()) {
            return new MeADPCBannerItem();
        }
        if (i72Var.XXOXi()) {
            return new MeADPBannerItem();
        }
        return null;
    }

    @tb1
    public final BaseDslItem getBannerItem() {
        return this.bannerItem;
    }

    @aa1
    public final MainBottomItem getMainBottomItem() {
        return this.mainBottomItem;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
        getUserPoins();
    }

    @Override // com.bestmafen.androidbase.base.BaseFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public boolean initEvent() {
        return true;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.fragment_rv;
    }

    @sf5(tag = I01XX0.I0XXi0X)
    public final void onAdStateChange(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
        i72 i72Var = i72.OXO1;
        i1o0oxo1o.OXO1("Me Ad State -> " + i72Var.IOi1O0() + ", " + i72Var.IX0iIX());
        renderAdapterMethod();
    }

    @sf5(tag = I01XX0.iX1O1)
    public final void onAvatarChange(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        getDslAdapter().notifyDataSetChanged();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        int id = view.getId();
        switch (id) {
            case R.id.btAbout /* 2131362168 */:
                i72.OXO1.O0X(getMActivity());
                break;
            case R.id.btContactUs /* 2131362169 */:
                i72.OXO1.iO0iiOi(getMActivity());
                break;
            case R.id.btExercise /* 2131362170 */:
                X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.v10
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return MainMeFragment.onClick$lambda$0(this.f11628IO, (BleConnector) obj);
                    }
                }, 1, null);
                break;
            case R.id.btFAQ /* 2131362171 */:
                i72.OXO1.OIXOXXi(getMActivity());
                break;
            case R.id.btFeedBack /* 2131362172 */:
                i72.OXO1.i1i(getMActivity());
                break;
            case R.id.btFirmwareRepair /* 2131362173 */:
                final go0 go0Var = new go0(getMActivity(), 0, 2, null);
                go0Var.O1O(R.string.firmware_repair_remind);
                go0.X11iII1O1(go0Var, Integer.valueOf(R.string.cancel), null, 2, null);
                go0Var.X1IX(R.string.confirm, new Function0() { // from class: com.android.mltcode.paycertificationapi.z10
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2() {
                        return Boolean.valueOf(MainMeFragment.onClick$lambda$3$0(go0Var));
                    }
                });
                this.mFirmwareRepairPopup = go0Var;
                View rootView = getRootView();
                Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
                go0Var.I1XOi1(rootView);
                break;
            case R.id.btFont /* 2131362174 */:
                final go0 go0Var2 = new go0(getMActivity(), 0, 2, null);
                go0Var2.O1O(R.string.language_repair_remind);
                go0.X11iII1O1(go0Var2, Integer.valueOf(R.string.cancel), null, 2, null);
                go0Var2.X1IX(R.string.confirm, new Function0() { // from class: com.android.mltcode.paycertificationapi.w10
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2() {
                        return Boolean.valueOf(MainMeFragment.onClick$lambda$1$0(go0Var2));
                    }
                });
                this.mFirmwareRepairPopup = go0Var2;
                View rootView2 = getRootView();
                Intrinsics.O10IXXX0X(rootView2, "<get-rootView>(...)");
                go0Var2.I1XOi1(rootView2);
                break;
            default:
                switch (id) {
                    case R.id.btGoal /* 2131362176 */:
                        selectGoal();
                        break;
                    case R.id.btHelp /* 2131362178 */:
                        i72.OXO1.IIiiIiXiI(getMActivity());
                        break;
                    case R.id.iv_avatar /* 2131363343 */:
                        break;
                    case R.id.userID /* 2131368156 */:
                        showUserIdentityCopyPopup();
                        break;
                    default:
                        switch (id) {
                            case R.id.btPermissionSetting /* 2131362180 */:
                                startActivity(new Intent(getActivity(), (Class<?>) PermissionSettingsActivity.class));
                                break;
                            case R.id.btPointsDetail /* 2131362181 */:
                                startActivity(new Intent(getActivity(), (Class<?>) PointsDetailActivity.class));
                                break;
                            case R.id.btRecharge /* 2131362182 */:
                                String strX11iII1O1 = OrderManager.X11iII1O1(OrderManager.OXO1, null, null, 3, null);
                                Bundle bundle = new Bundle();
                                bundle.putString("mArg0", strX11iII1O1);
                                bundle.putInt("mArg1", 2);
                                bundle.putParcelable("mArg2", null);
                                bundle.putSerializable("mArg3", null);
                                Intent intent = new Intent(getActivity(), (Class<?>) GoogleWebViewActivity.class);
                                intent.putExtras(bundle);
                                startActivity(intent);
                                break;
                            default:
                                switch (id) {
                                    case R.id.btSetting /* 2131362184 */:
                                        startActivity(new Intent(getActivity(), (Class<?>) SettingsActivity.class));
                                        break;
                                    case R.id.btSwitch /* 2131362185 */:
                                        startActivity(new Intent(getActivity(), (Class<?>) ThemeActivity.class));
                                        break;
                                    case R.id.btTalk /* 2131362186 */:
                                        i72.OXO1.OiO1iiO1O(getMActivity());
                                        break;
                                    case R.id.btUiRepair /* 2131362187 */:
                                        final go0 go0Var3 = new go0(getMActivity(), 0, 2, null);
                                        go0Var3.O1O(R.string.ui_repair_remind);
                                        go0.X11iII1O1(go0Var3, Integer.valueOf(R.string.cancel), null, 2, null);
                                        go0Var3.X1IX(R.string.confirm, new Function0() { // from class: com.android.mltcode.paycertificationapi.y10
                                            @Override // kotlin.jvm.functions.Function0
                                            /* JADX INFO: renamed from: invoke */
                                            public final Object invoke2() {
                                                return Boolean.valueOf(MainMeFragment.onClick$lambda$2$0(go0Var3));
                                            }
                                        });
                                        this.mFirmwareRepairPopup = go0Var3;
                                        View rootView3 = getRootView();
                                        Intrinsics.O10IXXX0X(rootView3, "<get-rootView>(...)");
                                        go0Var3.I1XOi1(rootView3);
                                        break;
                                    case R.id.btUserInfo /* 2131362188 */:
                                        break;
                                    case R.id.btUserOrder /* 2131362189 */:
                                        startActivity(new Intent(getActivity(), (Class<?>) OrderDetailActivity.class));
                                        break;
                                    default:
                                        customOnClick(view.getId());
                                        break;
                                }
                                break;
                        }
                        break;
                }
                startActivity(new Intent(getActivity(), (Class<?>) CompatibleUserActivity.class));
                break;
        }
    }

    public final void onGetFreePoints() {
        LogUtils.m11128d("onGetFreePoints");
        if (this.mFreePointPopup == null) {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.O10IXXX0X(fragmentActivityRequireActivity, "requireActivity(...)");
            OIXX00X oixx00x = new OIXX00X(fragmentActivityRequireActivity, R.layout.pop_center_prompt_free_point);
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(getResources().getColor(R.color.order_text_orange));
            Intrinsics.O10IXXX0X(colorStateListValueOf, "valueOf(...)");
            if (i72.OXO1.IOX1()) {
                SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
                String str = (String) new Gson().fromJson(sPUtilsIiI10X.getString(b01.I0IIOI + '_' + String.class.getName()), String.class);
                String str2 = str == null ? "0" : str;
                String string = getString(R.string.ai_privileges_giveaway_tip, Integer.valueOf(Integer.parseInt(str2)));
                Intrinsics.O10IXXX0X(string, "getString(...)");
                oixx00x.XXIIO1i11(R.string.ai_privileges_delivered);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                spannableStringBuilder.setSpan(new TextAppearanceSpan(null, 0, OXI1i1.XIi00iiXO(requireActivity(), 16.0f), colorStateListValueOf, null), StringsKt__StringsKt.OO1101010(string, str2, 0, false, 6, null), StringsKt__StringsKt.OO1101010(string, str2, 0, false, 6, null) + 1, 34);
                oixx00x.iOO1ii1(spannableStringBuilder);
            } else {
                SPUtils sPUtilsIiI10X2 = a01.OXO1.IiI10X();
                String str3 = (String) new Gson().fromJson(sPUtilsIiI10X2.getString(I01XX0.iOX + '_' + String.class.getName()), String.class);
                String str4 = str3 == null ? "0" : str3;
                String string2 = getString(R.string.free_points_arrived_tip, Integer.valueOf(Integer.parseInt(str4)));
                Intrinsics.O10IXXX0X(string2, "getString(...)");
                oixx00x.XXIIO1i11(R.string.free_points_arrived);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(string2);
                spannableStringBuilder2.setSpan(new TextAppearanceSpan(null, 0, OXI1i1.XIi00iiXO(requireActivity(), 16.0f), colorStateListValueOf, null), StringsKt__StringsKt.OO1101010(string2, str4, 0, false, 6, null), StringsKt__StringsKt.OO1101010(string2, str4, 0, false, 6, null) + 1, 34);
                oixx00x.iOO1ii1(spannableStringBuilder2);
            }
            this.mFreePointPopup = oixx00x;
        }
        OIXX00X oixx00x2 = this.mFreePointPopup;
        if (oixx00x2 != null) {
            View rootView = getRootView();
            Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
            oixx00x2.XiOIO(rootView);
        }
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment
    public void onInitBaseLayoutAfter() {
        super.onInitBaseLayoutAfter();
        renderAdapterMethod();
    }

    @sf5(tag = I01XX0.Ii0X0X)
    public final void onLoginDone(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        getUserPoins();
    }

    @sf5(tag = I01XX0.X11iII1O1)
    public final void onNicknameChange(@aa1 String nickname) {
        Intrinsics.X0O(nickname, "nickname");
        getDslAdapter().notifyDataSetChanged();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        OrderManager orderManager = OrderManager.OXO1;
        if (orderManager.iOOX010X()) {
            orderManager.iIXi1iiXI(false);
            getUserPoins();
        }
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment
    public int recyclerViewId() {
        return R.id.f51422rv;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment
    public int refreshLayoutId() {
        return 0;
    }

    public void renderAdapterMethod() {
        renderAdapter(new Function1() { // from class: com.android.mltcode.paycertificationapi.t10
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MainMeFragment.renderAdapterMethod$lambda$0(this.f11173IO, (DslAdapter) obj);
            }
        });
    }

    public final void setBannerItem(@tb1 BaseDslItem baseDslItem) {
        this.bannerItem = baseDslItem;
    }

    public final void showUserIdentityCopyPopup() {
        if (this.mUserIdentityRemindPopup == null) {
            go0 go0Var = new go0(getMActivity(), 0, 2, null);
            go0Var.O1O(R.string.user_identity_use_remind);
            go0.X11iII1O1(go0Var, null, null, 2, null);
            go0Var.X1IX(R.string.confirm, new Function0() { // from class: com.android.mltcode.paycertificationapi.u10
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(MainMeFragment.showUserIdentityCopyPopup$lambda$0$0());
                }
            });
            this.mUserIdentityRemindPopup = go0Var;
        }
        go0 go0Var2 = this.mUserIdentityRemindPopup;
        if (go0Var2 == null || !go0Var2.isShowing()) {
            go0 go0Var3 = this.mUserIdentityRemindPopup;
            if (go0Var3 != null) {
                View rootView = getRootView();
                Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
                go0Var3.I1XOi1(rootView);
            }
            a01 a01Var = a01.OXO1;
            SPUtils sPUtilsIiI10X = a01Var.IiI10X();
            Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
            Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
            if (objFromJson != null) {
                appUser = objFromJson;
            }
            String identity = ((AppUser) appUser).getIdentity();
            if (identity.length() == 0) {
                SPUtils sPUtilsOXO1 = a01Var.OXO1();
                AppUser appUser2 = (AppUser) new Gson().fromJson(sPUtilsOXO1.getString(b01.O0O + '_' + AppUser.class.getName()), AppUser.class);
                if (appUser2 != null) {
                    identity = appUser2.getIdentity();
                }
            }
            ClipboardUtils.copyText(identity);
            ToastUtils.showLong(R.string.copied);
        }
    }
}
