package com.sma.smartv3.ui.me;

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
import com.android.mltcode.paycertificationapi.l10;
import com.android.mltcode.paycertificationapi.m10;
import com.android.mltcode.paycertificationapi.n10;
import com.android.mltcode.paycertificationapi.p10;
import com.android.mltcode.paycertificationapi.q10;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.r10;
import com.android.mltcode.paycertificationapi.s10;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.t10;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.u10;
import com.android.mltcode.paycertificationapi.v10;
import com.android.mltcode.paycertificationapi.w10;
import com.android.mltcode.paycertificationapi.y10;
import com.android.mltcode.paycertificationapi.z10;
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
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.device.item.SplitLine4DPItem;
import com.sma.smartv3.ui.me.item.MainAvatarItem;
import com.sma.smartv3.ui.me.item.MainBottomItem;
import com.sma.smartv3.ui.me.item.MainMiddleItem;
import com.sma.smartv3.ui.me.item.MainUserOrderItem;
import com.sma.smartv3.ui.me.item.MeADPBannerItem;
import com.sma.smartv3.ui.me.item.MeADPCBannerItem;
import com.sma.smartv3.ui.order.OrderDetailActivity;
import com.sma.smartv3.ui.order.PointsDetailActivity;
import com.sma.smartv3.util.UtilsKt;
import com.szabh.smable3.component.BleConnector;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
    private final Lazy rootView$delegate;

    public MainMeFragment() {
        this.rootView$delegate = LazyKt__LazyJVMKt.iO(new m10(this));
        MainBottomItem r0 = new MainBottomItem();
        r0.setMOnClick(this);
        this.mainBottomItem = r0;
    }

    public static /* synthetic */ Unit I0IIOi(go0 r0) {
        return onClick$lambda$1$0$0(r0);
    }

    public static /* synthetic */ boolean I0iXXO(go0 r0) {
        return onClick$lambda$1$0(r0);
    }

    public static /* synthetic */ boolean IO(go0 r0) {
        return onClick$lambda$2$0(r0);
    }

    public static /* synthetic */ Unit IiI10X(MainMeFragment r0, DslAdapter r1) {
        return renderAdapterMethod$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ Unit O00(MainMeFragment r0, DslAdapter r1) {
        return renderAdapterMethod$lambda$0(r0, r1);
    }

    public static /* synthetic */ Unit O10IXXX0X(MainMeFragment r0) {
        return renderAdapterMethod$lambda$0$0(r0);
    }

    public static /* synthetic */ boolean OIX0iXi() {
        return showUserIdentityCopyPopup$lambda$0$0();
    }

    public static /* synthetic */ Unit OIi0() {
        return onClick$lambda$3$0$0();
    }

    public static /* synthetic */ boolean X1ii(go0 r0) {
        return onClick$lambda$3$0(r0);
    }

    public static /* synthetic */ Unit XO0O10(MainMeFragment r0, BleConnector r1) {
        return onClick$lambda$0(r0, r1);
    }

    public static /* synthetic */ Unit XOO0ii0(go0 r0) {
        return onClick$lambda$2$0$0(r0);
    }

    public static /* synthetic */ Unit XXI(Boolean r0) {
        return getUserPoins$lambda$0(r0);
    }

    private final View getRootView() {
        return (View) getValue();
    }

    private final void getUserPoins() {
        i72 r0 = i72.OXO1;
        if (r0.O101() == true) goto L5;
        return;
    L5:
        if (r0.IOX1() == false) goto L10;
        OrderManager r1 = OrderManager.OXO1;
        r1.O1O(new l10());
        if (r0.XX1Oi() == false) goto L13;
        r1.iI();
        return;
    L13:
        return;
    L10:
        OrderManager.OXO1.XXIIO1i11();
    }

    private static final Unit getUserPoins$lambda$0(Boolean r0) {
        return Unit.OXO1;
    }

    public static /* synthetic */ View iO(MainMeFragment r0) {
        return rootView_delegate$lambda$0(r0);
    }

    private static final Unit onClick$lambda$0(MainMeFragment r2, BleConnector r3) {
        Intrinsics.X0O(r3, "it");
        if (q62.OXO1.iiIOiX() != 1) goto L6;
        r2.startActivity(new Intent(r2.getActivity(), CoachingsActivity.class));
    L6:
        return Unit.OXO1;
    }

    private static final boolean onClick$lambda$1$0(final go0 r2) {
        UtilsKt.iXi(r2.XO0O10(), new p10(r2));
        return true;
    }

    private static final Unit onClick$lambda$1$0$0(go0 r3) {
        DeviceInfoChecker.iOO1ii1(DeviceInfoChecker.OXO1, r3.XO0O10(), null, 2, null);
        return Unit.OXO1;
    }

    private static final boolean onClick$lambda$2$0(final go0 r2) {
        UtilsKt.iXi(r2.XO0O10(), new n10(r2));
        return true;
    }

    private static final Unit onClick$lambda$2$0$0(go0 r3) {
        DeviceInfoChecker.iX1O1(DeviceInfoChecker.OXO1, r3.XO0O10(), null, 2, null);
        return Unit.OXO1;
    }

    private static final boolean onClick$lambda$3$0(go0 r1) {
        UtilsKt.iXi(r1.XO0O10(), new q10());
        return true;
    }

    private static final Unit onClick$lambda$3$0$0() {
        I01XX0.XIi00iiXO(I01XX0.iOiXi11II, null, 2, null);
        return Unit.OXO1;
    }

    private static final Unit renderAdapterMethod$lambda$0(final MainMeFragment r1, DslAdapter r2) {
        Intrinsics.X0O(r2, "$this$renderAdapter");
        r1.getDslViewHolder().post(new s10(r1));
        return Unit.OXO1;
    }

    private static final Unit renderAdapterMethod$lambda$0$0(final MainMeFragment r1) {
        r1.getDslAdapter().clearAllItems();
        r1.renderAdapter(new r10(r1));
        return Unit.OXO1;
    }

    private static final Unit renderAdapterMethod$lambda$0$0$0(MainMeFragment r3, DslAdapter r4) {
        Intrinsics.X0O(r4, "$this$renderAdapter");
        MainAvatarItem r0 = new MainAvatarItem();
        r0.setMOnClick(r3);
        DslAdapterExKt.IIX1OXO(r4, r0, null, 2, null);
        MainMiddleItem r1 = new MainMiddleItem();
        r1.setMOnClick(r3);
        DslAdapterExKt.IIX1OXO(r4, r1, null, 2, null);
        MainUserOrderItem r2 = new MainUserOrderItem();
        r2.setMOnClick(r3);
        DslAdapterExKt.IIX1OXO(r4, r2, null, 2, null);
        DslAdapterExKt.IIX1OXO(r4, r3.mainBottomItem, null, 2, null);
        if (q62.OXO1.iOIi00Ii() == false) goto L13;
        if (i72.OXO1.X11I() == false) goto L13;
        if (r3.bannerItem != null) goto L9;
        r3.bannerItem = r3.getAdBannerItem();
    L9:
        BaseDslItem r5 = r3.bannerItem;
        if (r5 == null) goto L13;
        DslAdapterExKt.IIX1OXO(r4, r5, null, 2, null);
        DslAdapterExKt.IIX1OXO(r4, new SplitLine4DPItem(), null, 2, null);
    L13:
        return Unit.OXO1;
    }

    private static final View rootView_delegate$lambda$0(MainMeFragment r1) {
        return r1.getMView().findViewById(R.id.root_view);
    }

    private final void selectGoal() {
        startActivity(new Intent(getActivity(), GoalSettingActivity.class));
    }

    private static final boolean showUserIdentityCopyPopup$lambda$0$0() {
        return true;
    }

    public void customOnClick(int r1) {
    }

    @tb1
    public BaseDslItem getAdBannerItem() {
        i72 r0 = i72.OXO1;
        if (r0.O1() == false) goto L7;
        return new MeADPCBannerItem();
    L7:
        if (r0.XXOXi() == true) goto L9;
        return null;
    L9:
        return new MeADPBannerItem();
    }

    @tb1
    public final BaseDslItem getBannerItem() {
        return this.bannerItem;
    }

    @aa1
    public final MainBottomItem getMainBottomItem() {
        return this.mainBottomItem;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
        getUserPoins();
    }

    @Override // com.bestmafen.androidbase.base.BaseFragment, com.android.mltcode.paycertificationapi.k5
    public boolean initEvent() {
        return true;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.fragment_rv;
    }

    @sf5(tag = I01XX0.I0XXi0X)
    public final void onAdStateChange(@aa1 Object r5) {
        Intrinsics.X0O(r5, "data");
        i1O0OXO1O r6 = i1O0OXO1O.OXO1;
        i72 r0 = i72.OXO1;
        r6.OXO1("Me Ad State -> " + r0.IOi1O0() + ", " + r0.IX0iIX());
        renderAdapterMethod();
    }

    @sf5(tag = I01XX0.iX1O1)
    public final void onAvatarChange(@aa1 Object r2) {
        Intrinsics.X0O(r2, "data");
        getDslAdapter().notifyDataSetChanged();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@aa1 View r8) {
        Intrinsics.X0O(r8, "view");
        int r0 = r8.getId();
        int r4 = 0;
        int r5 = 2;
        DefaultConstructorMarker r6 = null;
        switch(r0) {
            case 2131362168: goto L45;
            case 2131362169: goto L43;
            case 2131362170: goto L41;
            case 2131362171: goto L39;
            case 2131362172: goto L37;
            case 2131362173: goto L35;
            case 2131362174: goto L33;
            default: goto L4;
        };
    L4:
        switch(r0) {
            case 2131362176: goto L31;
            case 2131362178: goto L29;
            case 2131363343: goto L27;
            case 2131368156: goto L25;
            default: goto L5;
        };
    L5:
        switch(r0) {
            case 2131362180: goto L23;
            case 2131362181: goto L21;
            case 2131362182: goto L19;
            default: goto L6;
        };
    L6:
        switch(r0) {
            case 2131362184: goto L17;
            case 2131362185: goto L15;
            case 2131362186: goto L13;
            case 2131362187: goto L11;
            case 2131362188: goto L27;
            case 2131362189: goto L9;
            default: goto L7;
        };
    L7:
        customOnClick(r8.getId());
        return;
    L9:
        startActivity(new Intent(getActivity(), OrderDetailActivity.class));
        return;
    L11:
        final go0 r9 = new go0(getMActivity(), r4, r5, r6);
        r9.O1O(R.string.ui_repair_remind);
        go0.X11iII1O1(r9, Integer.valueOf(R.string.cancel), null, 2, null);
        r9.X1IX(R.string.confirm, new y10(r9));
        this.mFirmwareRepairPopup = r9;
        View r1 = getRootView();
        Intrinsics.O10IXXX0X(r1, "<get-rootView>(...)");
        r9.I1XOi1(r1);
        return;
    L13:
        i72.OXO1.OiO1iiO1O(getMActivity());
        return;
    L15:
        startActivity(new Intent(getActivity(), ThemeActivity.class));
        return;
    L17:
        startActivity(new Intent(getActivity(), SettingsActivity.class));
        return;
    L19:
        String r10 = OrderManager.X11iII1O1(OrderManager.OXO1, null, null, 3, null);
        Bundle r2 = new Bundle();
        r2.putString("mArg0", r10);
        r2.putInt("mArg1", 2);
        r2.putParcelable("mArg2", null);
        r2.putSerializable("mArg3", null);
        Intent r11 = new Intent(getActivity(), GoogleWebViewActivity.class);
        r11.putExtras(r2);
        startActivity(r11);
        return;
    L21:
        startActivity(new Intent(getActivity(), PointsDetailActivity.class));
        return;
    L23:
        startActivity(new Intent(getActivity(), PermissionSettingsActivity.class));
        return;
    L25:
        showUserIdentityCopyPopup();
        return;
    L27:
        startActivity(new Intent(getActivity(), CompatibleUserActivity.class));
        return;
    L29:
        i72.OXO1.IIiiIiXiI(getMActivity());
        return;
    L31:
        selectGoal();
        return;
    L33:
        final go0 r12 = new go0(getMActivity(), r4, r5, r6);
        r12.O1O(R.string.language_repair_remind);
        go0.X11iII1O1(r12, Integer.valueOf(R.string.cancel), null, 2, null);
        r12.X1IX(R.string.confirm, new w10(r12));
        this.mFirmwareRepairPopup = r12;
        View r3 = getRootView();
        Intrinsics.O10IXXX0X(r3, "<get-rootView>(...)");
        r12.I1XOi1(r3);
        return;
    L35:
        final go0 r13 = new go0(getMActivity(), r4, r5, r6);
        r13.O1O(R.string.firmware_repair_remind);
        go0.X11iII1O1(r13, Integer.valueOf(R.string.cancel), null, 2, null);
        r13.X1IX(R.string.confirm, new z10(r13));
        this.mFirmwareRepairPopup = r13;
        View r7 = getRootView();
        Intrinsics.O10IXXX0X(r7, "<get-rootView>(...)");
        r13.I1XOi1(r7);
        return;
    L37:
        i72.OXO1.i1i(getMActivity());
        return;
    L39:
        i72.OXO1.OIXOXXi(getMActivity());
        return;
    L41:
        X0IOiX1O.XIi00iiXO(false, new v10(this), 1, null);
        return;
    L43:
        i72.OXO1.iO0iiOi(getMActivity());
        return;
    L45:
        i72.OXO1.O0X(getMActivity());
    }

    public final void onGetFreePoints() {
        LogUtils.d(new Object[]{"onGetFreePoints"});
        if (this.mFreePointPopup != null) goto L17;
        FragmentActivity r2 = requireActivity();
        Intrinsics.O10IXXX0X(r2, "requireActivity(...)");
        OIXX00X r1 = new OIXX00X(r2, R.layout.pop_center_prompt_free_point);
        ColorStateList r7 = ColorStateList.valueOf(getResources().getColor(R.color.order_text_orange));
        Intrinsics.O10IXXX0X(r7, "valueOf(...)");
        if (i72.OXO1.IOX1() == false) goto L11;
        SPUtils r3 = a01.OXO1.IiI10X();
        String r4 = (String) new Gson().fromJson(r3.getString(b01.I0IIOI + '_' + String.class.getName()), String.class);
        if (r4 != null) goto L9;
        String r11 = "0";
    L10:
        String r10 = getString(R.string.ai_privileges_giveaway_tip, new Object[]{Integer.valueOf(Integer.parseInt(r11))});
        Intrinsics.O10IXXX0X(r10, "getString(...)");
        r1.XXIIO1i11(R.string.ai_privileges_delivered);
        SpannableStringBuilder r5 = new SpannableStringBuilder(r10);
        r5.setSpan(new TextAppearanceSpan(null, 0, OXI1i1.XIi00iiXO(requireActivity(), 16.0f), r7, null), StringsKt__StringsKt.OO1101010(r10, r11, 0, false, 6, null), StringsKt__StringsKt.OO1101010(r10, r11, 0, false, 6, null) + 1, 34);
        r1.iOO1ii1(r5);
    L16:
        this.mFreePointPopup = r1;
        goto L17
    L9:
        r11 = r4;
        goto L10
    L11:
        SPUtils r6 = a01.OXO1.IiI10X();
        String r8 = (String) new Gson().fromJson(r6.getString(I01XX0.iOX + '_' + String.class.getName()), String.class);
        if (r8 != null) goto L14;
        String r12 = "0";
    L15:
        String r13 = getString(R.string.free_points_arrived_tip, new Object[]{Integer.valueOf(Integer.parseInt(r12))});
        Intrinsics.O10IXXX0X(r13, "getString(...)");
        r1.XXIIO1i11(R.string.free_points_arrived);
        SpannableStringBuilder r9 = new SpannableStringBuilder(r13);
        r9.setSpan(new TextAppearanceSpan(null, 0, OXI1i1.XIi00iiXO(requireActivity(), 16.0f), r7, null), StringsKt__StringsKt.OO1101010(r13, r12, 0, false, 6, null), StringsKt__StringsKt.OO1101010(r13, r12, 0, false, 6, null) + 1, 34);
        r1.iOO1ii1(r9);
        goto L16
    L14:
        r12 = r8;
    L17:
        OIXX00X r14 = this.mFreePointPopup;
        if (r14 == null) goto L21;
        View r15 = getRootView();
        Intrinsics.O10IXXX0X(r15, "<get-rootView>(...)");
        r14.XiOIO(r15);
        return;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment
    public void onInitBaseLayoutAfter() {
        super.onInitBaseLayoutAfter();
        renderAdapterMethod();
    }

    @sf5(tag = I01XX0.Ii0X0X)
    public final void onLoginDone(@aa1 Object r2) {
        Intrinsics.X0O(r2, "data");
        getUserPoins();
    }

    @sf5(tag = I01XX0.X11iII1O1)
    public final void onNicknameChange(@aa1 String r2) {
        Intrinsics.X0O(r2, "nickname");
        getDslAdapter().notifyDataSetChanged();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        OrderManager r0 = OrderManager.OXO1;
        if (r0.iOOX010X() == false) goto L6;
        r0.iIXi1iiXI(false);
        getUserPoins();
        return;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment
    public int recyclerViewId() {
        return R.id.rv;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment
    public int refreshLayoutId() {
        return 0;
    }

    public void renderAdapterMethod() {
        renderAdapter(new t10(this));
    }

    public final void setBannerItem(@tb1 BaseDslItem r1) {
        this.bannerItem = r1;
    }

    public final void showUserIdentityCopyPopup() {
        if (this.mUserIdentityRemindPopup != null) goto L5;
        go0 r1 = new go0(getMActivity(), 0, 2, null);
        r1.O1O(R.string.user_identity_use_remind);
        go0.X11iII1O1(r1, null, null, 2, null);
        r1.X1IX(R.string.confirm, new u10());
        this.mUserIdentityRemindPopup = r1;
    L5:
        go0 r2 = this.mUserIdentityRemindPopup;
        if (r2 != null) goto L8;
    L10:
        go0 r3 = this.mUserIdentityRemindPopup;
        if (r3 == null) goto L13;
        View r4 = getRootView();
        Intrinsics.O10IXXX0X(r4, "<get-rootView>(...)");
        r3.I1XOi1(r4);
    L13:
        a01 r5 = a01.OXO1;
        SPUtils r6 = r5.IiI10X();
        Object r7 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r8 = new Gson().fromJson(r6.getString(AppUser.class.getName()), AppUser.class);
        if (r8 == null) goto L17;
        r7 = r8;
    L17:
        String r9 = ((AppUser) r7).getIdentity();
        if (r9.length() != 0) goto L22;
        SPUtils r10 = r5.OXO1();
        AppUser r11 = (AppUser) new Gson().fromJson(r10.getString(b01.O0O + '_' + AppUser.class.getName()), AppUser.class);
        if (r11 == null) goto L22;
        r9 = r11.getIdentity();
    L22:
        ClipboardUtils.copyText(r9);
        ToastUtils.showLong(R.string.copied);
        return;
    L8:
        if (r2.isShowing() != true) goto L10;
    }
}
