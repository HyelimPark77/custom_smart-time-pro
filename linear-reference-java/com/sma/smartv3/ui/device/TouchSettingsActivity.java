package com.sma.smartv3.ui.device;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.core.view.ViewGroupKt;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.I0iIi;
import com.android.mltcode.paycertificationapi.OiOX0i;
import com.android.mltcode.paycertificationapi.X0IOiX1O;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.aj4;
import com.android.mltcode.paycertificationapi.ax5;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.bx5;
import com.android.mltcode.paycertificationapi.cx5;
import com.android.mltcode.paycertificationapi.dx5;
import com.android.mltcode.paycertificationapi.ex5;
import com.android.mltcode.paycertificationapi.fx5;
import com.android.mltcode.paycertificationapi.gj4;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.gx5;
import com.android.mltcode.paycertificationapi.hx5;
import com.android.mltcode.paycertificationapi.i22;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.ix5;
import com.android.mltcode.paycertificationapi.jx5;
import com.android.mltcode.paycertificationapi.kx5;
import com.android.mltcode.paycertificationapi.lx5;
import com.android.mltcode.paycertificationapi.mx5;
import com.android.mltcode.paycertificationapi.nx5;
import com.android.mltcode.paycertificationapi.ox5;
import com.android.mltcode.paycertificationapi.px5;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.qx5;
import com.android.mltcode.paycertificationapi.rw5;
import com.android.mltcode.paycertificationapi.rx5;
import com.android.mltcode.paycertificationapi.sw5;
import com.android.mltcode.paycertificationapi.sx5;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.tw5;
import com.android.mltcode.paycertificationapi.uq;
import com.android.mltcode.paycertificationapi.uw5;
import com.android.mltcode.paycertificationapi.vw5;
import com.android.mltcode.paycertificationapi.ww5;
import com.android.mltcode.paycertificationapi.xw5;
import com.android.mltcode.paycertificationapi.yw5;
import com.android.mltcode.paycertificationapi.zw5;
import com.bestmafen.androidbase.base.BaseActivity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.AbhSettingsHeader;
import com.sma.smartv3.view.AbhSettingsItem;
import com.sma.smartv3.view.SettingsPanel;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.BleKeyFlag;
import com.szabh.smable3.component.BaseBleCache;
import com.szabh.smable3.component.BaseBleConnector;
import com.szabh.smable3.component.BleCache;
import com.szabh.smable3.component.BleConnector;
import com.szabh.smable3.entity.BleTouchSettings;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nTouchSettingsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TouchSettingsActivity.kt\ncom/sma/smartv3/ui/device/TouchSettingsActivity\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,410:1\n1332#2,3:411\n69#3,3:414\n72#3,5:418\n1#4:417\n*S KotlinDebug\n*F\n+ 1 TouchSettingsActivity.kt\ncom/sma/smartv3/ui/device/TouchSettingsActivity\n*L\n221#1:411,3\n140#1:414,3\n140#1:418,5\n140#1:417\n*E\n"})
public final class TouchSettingsActivity extends BaseActivity {

    @aa1
    private final Lazy containerPanel$delegate;

    @aa1
    private final Lazy itemDouble$delegate;

    @aa1
    private final Lazy itemHeader$delegate;

    @aa1
    private final Lazy itemHeaderCustom$delegate;

    @aa1
    private final Lazy itemHeaderMusic$delegate;

    @aa1
    private final Lazy itemHeaderPhoto$delegate;

    @aa1
    private final Lazy itemHeaderSlide$delegate;

    @aa1
    private final Lazy itemHeaderTouchRepair$delegate;

    @aa1
    private final Lazy itemLong$delegate;

    @aa1
    private final Lazy itemSingle$delegate;

    @aa1
    private TouchSettingsActivity$mBluetoothReceiver$1 mBluetoothReceiver;

    @tb1
    private go0 mFailPopup;

    @tb1
    private uq mLoadingPopup;

    @aa1
    private final BleTouchSettings mSettings;

    @aa1
    private final List<aj4> mSingleChoiceItems;

    @tb1
    private go0 mTouchICPopup;

    /* JADX WARN: Type inference failed for: r0v23, types: [com.sma.smartv3.ui.device.TouchSettingsActivity$mBluetoothReceiver$1] */
    public TouchSettingsActivity() {
        this.itemHeader$delegate = LazyKt__LazyJVMKt.iO(new ox5(this));
        this.containerPanel$delegate = LazyKt__LazyJVMKt.iO(new px5(this));
        this.itemHeaderMusic$delegate = LazyKt__LazyJVMKt.iO(new qx5(this));
        this.itemHeaderPhoto$delegate = LazyKt__LazyJVMKt.iO(new rx5(this));
        this.itemHeaderSlide$delegate = LazyKt__LazyJVMKt.iO(new sx5(this));
        this.itemHeaderCustom$delegate = LazyKt__LazyJVMKt.iO(new sw5(this));
        this.itemHeaderTouchRepair$delegate = LazyKt__LazyJVMKt.iO(new tw5(this));
        this.itemSingle$delegate = LazyKt__LazyJVMKt.iO(new uw5(this));
        this.itemDouble$delegate = LazyKt__LazyJVMKt.iO(new vw5(this));
        this.itemLong$delegate = LazyKt__LazyJVMKt.iO(new ww5(this));
        this.mSingleChoiceItems = getSingleChoiceItems();
        this.mSettings = (BleTouchSettings) BaseBleCache.getObjectNotNull$default(BleCache.INSTANCE, BleKey.TOUCH_SET, BleTouchSettings.class, null, null, 12, null);
        this.mBluetoothReceiver = new TouchSettingsActivity$mBluetoothReceiver$1(this);
    }

    public static /* synthetic */ boolean I0iXXO(View r0, TouchSettingsActivity r1, int r2) {
        return onShowKeysPopup$lambda$0$0(r0, r1, r2);
    }

    public static /* synthetic */ Unit I1(TouchSettingsActivity r0, BleConnector r1) {
        return updateUI$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ Unit I1XOi1(boolean r0, TouchSettingsActivity r1, BleConnector r2) {
        return setHeaderChecked$lambda$0(r0, r1, r2);
    }

    public static /* synthetic */ AbhSettingsHeader II1Xi0(TouchSettingsActivity r0) {
        return itemHeaderTouchRepair_delegate$lambda$0(r0);
    }

    public static /* synthetic */ AbhSettingsItem IIX1OXO(TouchSettingsActivity r0) {
        return itemLong_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit IXXOO(TouchSettingsActivity r0, BleConnector r1) {
        return updateUI$lambda$1$0$0(r0, r1);
    }

    public static /* synthetic */ void O10IXXX0X(TouchSettingsActivity r0, View r1) {
        updateUI$lambda$1$0(r0, r1);
    }

    public static /* synthetic */ void O1O(TouchSettingsActivity r0, AbhSettingsHeader r1, View r2) {
        updateUI$lambda$2$0(r0, r1, r2);
    }

    public static /* synthetic */ boolean OII(Function1 r0) {
        return showTouchICPopup$lambda$0$0(r0);
    }

    public static /* synthetic */ SettingsPanel OIX0iXi(TouchSettingsActivity r0) {
        return containerPanel_delegate$lambda$0(r0);
    }

    public static /* synthetic */ AbhSettingsItem OX(TouchSettingsActivity r0) {
        return itemDouble_delegate$lambda$0(r0);
    }

    public static /* synthetic */ AbhSettingsHeader OiIIX101O(TouchSettingsActivity r0) {
        return itemHeaderCustom_delegate$lambda$0(r0);
    }

    public static /* synthetic */ AbhSettingsItem X01IiOiIi(TouchSettingsActivity r0) {
        return itemSingle_delegate$lambda$0(r0);
    }

    public static /* synthetic */ AbhSettingsHeader X0O(TouchSettingsActivity r0) {
        return itemHeader_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void X11iII1O1(TouchSettingsActivity r0, View r1) {
        updateUI$lambda$0$0(r0, r1);
    }

    public static /* synthetic */ Unit X1ii(TouchSettingsActivity r0, BleConnector r1) {
        return updateUI$lambda$3$0$0(r0, r1);
    }

    public static /* synthetic */ AbhSettingsHeader XX0(TouchSettingsActivity r0) {
        return itemHeaderSlide_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void XXI(TouchSettingsActivity r0, View r1) {
        updateUI$lambda$3$0(r0, r1);
    }

    public static /* synthetic */ Unit XXIIO1i11(TouchSettingsActivity r0, BleConnector r1) {
        return updateUI$lambda$2$0$0(r0, r1);
    }

    public static /* synthetic */ boolean XiOIO(Function1 r0) {
        return showTouchICPopup$lambda$0$1(r0);
    }

    public static /* synthetic */ AbhSettingsHeader XiOIii1(TouchSettingsActivity r0) {
        return itemHeaderMusic_delegate$lambda$0(r0);
    }

    public static final /* synthetic */ uq access$getMLoadingPopup$p(TouchSettingsActivity r0) {
        return r0.mLoadingPopup;
    }

    public static final /* synthetic */ BleTouchSettings access$getMSettings$p(TouchSettingsActivity r0) {
        return r0.mSettings;
    }

    public static final /* synthetic */ void access$showConnectFailPopup(TouchSettingsActivity r0) {
        r0.showConnectFailPopup();
    }

    public static final /* synthetic */ void access$updateUI(TouchSettingsActivity r0) {
        r0.updateUI();
    }

    private static final SettingsPanel containerPanel_delegate$lambda$0(TouchSettingsActivity r1) {
        return (SettingsPanel) r1.findViewById(R.id.item_container);
    }

    private final SettingsPanel getContainerPanel() {
        return (SettingsPanel) getValue();
    }

    private final AbhSettingsItem getItemDouble() {
        return (AbhSettingsItem) getValue();
    }

    private final AbhSettingsHeader getItemHeader() {
        return (AbhSettingsHeader) getValue();
    }

    private final AbhSettingsHeader getItemHeaderCustom() {
        return (AbhSettingsHeader) getValue();
    }

    private final AbhSettingsHeader getItemHeaderMusic() {
        return (AbhSettingsHeader) getValue();
    }

    private final AbhSettingsHeader getItemHeaderPhoto() {
        return (AbhSettingsHeader) getValue();
    }

    private final AbhSettingsHeader getItemHeaderSlide() {
        return (AbhSettingsHeader) getValue();
    }

    private final AbhSettingsHeader getItemHeaderTouchRepair() {
        return (AbhSettingsHeader) getValue();
    }

    private final AbhSettingsItem getItemLong() {
        return (AbhSettingsItem) getValue();
    }

    private final AbhSettingsItem getItemSingle() {
        return (AbhSettingsItem) getValue();
    }

    private final List<aj4> getSingleChoiceItems() {
        return CollectionsKt__CollectionsKt.iXiX011(new aj4[]{new aj4(R.string.touch_screen_none, 0), new aj4(R.string.touch_screen_double, R.string.touch_screen_double_tip), new aj4(R.string.touch_screen_swipe_up, R.string.touch_screen_swipe_up_tip), new aj4(R.string.touch_screen_swipe_down, R.string.touch_screen_swipe_down_tip), new aj4(R.string.touch_screen_swipe_left, R.string.touch_screen_swipe_left_tip), new aj4(R.string.touch_screen_swipe_right, R.string.touch_screen_swipe_right_tip), new aj4(R.string.touch_screen_swipe_back, R.string.touch_screen_exit_application_tip), new aj4(R.string.touch_screen_vol_inc, R.string.touch_screen_vol_increase_tip), new aj4(R.string.touch_screen_vol_dec, R.string.touch_screen_vol_down_tip), new aj4(R.string.touch_screen_music_prev, R.string.touch_screen_play_pre_tip), new aj4(R.string.touch_screen_music_next, R.string.touch_screen_play_next_tip), new aj4(R.string.touch_screen_music_play_pause, R.string.touch_screen_play_pause_and_stop_tip)});
    }

    public static /* synthetic */ Unit i010I(TouchSettingsActivity r0, boolean r1) {
        return setHeader$lambda$0$0(r0, r1);
    }

    public static /* synthetic */ boolean iI() {
        return showConnectFailPopup$lambda$0$0();
    }

    public static /* synthetic */ Unit iIiiO(TouchSettingsActivity r0, boolean r1, boolean r2) {
        return setHeader$lambda$0$0$0(r0, r1, r2);
    }

    public static /* synthetic */ AbhSettingsHeader iOO1ii1(TouchSettingsActivity r0) {
        return itemHeaderPhoto_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void iOOX010X(TouchSettingsActivity r0, View r1) {
        initView$lambda$0$0(r0, r1);
    }

    public static /* synthetic */ boolean iX(go0 r0, TouchSettingsActivity r1) {
        return showConnectFailPopup$lambda$0$1(r0, r1);
    }

    public static /* synthetic */ Unit iX1O1(View r0, TouchSettingsActivity r1, int r2, BleConnector r3) {
        return onShowKeysPopup$lambda$0$0$0(r0, r1, r2, r3);
    }

    private static final void initView$lambda$0$0(TouchSettingsActivity r1, View r2) {
        r1.startActivity(new Intent(r1, TouchRepairActivity.class));
    }

    private static final AbhSettingsItem itemDouble_delegate$lambda$0(TouchSettingsActivity r1) {
        return (AbhSettingsItem) r1.findViewById(R.id.item_double);
    }

    private static final AbhSettingsHeader itemHeaderCustom_delegate$lambda$0(TouchSettingsActivity r1) {
        return (AbhSettingsHeader) r1.findViewById(R.id.item_header_custom);
    }

    private static final AbhSettingsHeader itemHeaderMusic_delegate$lambda$0(TouchSettingsActivity r1) {
        return (AbhSettingsHeader) r1.findViewById(R.id.item_header_music);
    }

    private static final AbhSettingsHeader itemHeaderPhoto_delegate$lambda$0(TouchSettingsActivity r1) {
        return (AbhSettingsHeader) r1.findViewById(R.id.item_header_photo);
    }

    private static final AbhSettingsHeader itemHeaderSlide_delegate$lambda$0(TouchSettingsActivity r1) {
        return (AbhSettingsHeader) r1.findViewById(R.id.item_header_slide);
    }

    private static final AbhSettingsHeader itemHeaderTouchRepair_delegate$lambda$0(TouchSettingsActivity r1) {
        return (AbhSettingsHeader) r1.findViewById(R.id.item_header_touch_repair);
    }

    private static final AbhSettingsHeader itemHeader_delegate$lambda$0(TouchSettingsActivity r1) {
        return (AbhSettingsHeader) r1.findViewById(R.id.item_header);
    }

    private static final AbhSettingsItem itemLong_delegate$lambda$0(TouchSettingsActivity r1) {
        return (AbhSettingsItem) r1.findViewById(R.id.item_long);
    }

    private static final AbhSettingsItem itemSingle_delegate$lambda$0(TouchSettingsActivity r1) {
        return (AbhSettingsItem) r1.findViewById(R.id.item_single);
    }

    private static final boolean onShowKeysPopup$lambda$0$0(final View r1, final TouchSettingsActivity r2, final int r3) {
        return X0IOiX1O.XIi00iiXO(false, new mx5(r1, r2, r3), 1, null);
    }

    private static final Unit onShowKeysPopup$lambda$0$0$0(View r8, TouchSettingsActivity r9, int r10, BleConnector r11) {
        Intrinsics.X0O(r11, "it");
        int r12 = r8.getId();
        if (r12 != R.id.item_double) goto L5;
        r9.mSettings.setMCustomDouble(r10);
    L12:
        BaseBleConnector.sendObject$default(r11, BleKey.TOUCH_SET, BleKeyFlag.UPDATE, r9.mSettings, false, false, 24, null);
        r9.updateUI();
        return Unit.OXO1;
    L5:
        if (r12 != R.id.item_long) goto L7;
        r9.mSettings.setMCustomLong(r10);
        goto L12
    L7:
        if (r12 != R.id.item_single) goto L12;
        r9.mSettings.setMCustomSingle(r10);
        goto L12
    }

    private final void setHeader() {
        AbhSettingsHeader r0 = getItemHeader();
        r0.setChecked(OiOX0i.XIi00iiXO(this.mSettings.getMEnabled()));
        r0.setMListener(new lx5(this));
    }

    private static final Unit setHeader$lambda$0$0(final TouchSettingsActivity r1, final boolean r2) {
        if (r2 == false) goto L4;
        r1.showTouchICPopup(new ax5(r1, r2));
    L6:
        return Unit.OXO1;
    L4:
        r1.setHeaderChecked(r2);
        goto L6
    }

    private static final Unit setHeader$lambda$0$0$0(TouchSettingsActivity r0, boolean r1, boolean r2) {
        if (r2 == false) goto L4;
        r0.setHeaderChecked(r1);
    L6:
        return Unit.OXO1;
    L4:
        r0.getItemHeader().setChecked(false);
        goto L6
    }

    private final void setHeaderChecked(final boolean r5) {
        if (X0IOiX1O.XIi00iiXO(false, new nx5(r5, this), 1, null) == true) goto L6;
        getItemHeader().setChecked(!r5);
        return;
    }

    private static final Unit setHeaderChecked$lambda$0(boolean r11, TouchSettingsActivity r12, BleConnector r13) {
        Intrinsics.X0O(r13, "it");
        if (r11 == true) goto L5;
        r12.mSettings.setMEnabled(0);
        BaseBleConnector.sendObject$default(r13, BleKey.TOUCH_SET, BleKeyFlag.UPDATE, r12.mSettings, false, false, 24, null);
        i22.iO(0, 1, null);
        r12.updateUI();
    L10:
        return Unit.OXO1;
    L5:
        if (BleConnector.INSTANCE.isBoundHID() == false) goto L7;
        r12.mSettings.setMEnabled(1);
        BaseBleConnector.sendObject$default(r13, BleKey.TOUCH_SET, BleKeyFlag.UPDATE, r12.mSettings, false, false, 24, null);
        r12.updateUI();
        i22.O00(r12.getMContext(), 0, 2, null);
        goto L10
    L7:
        r12.getItemHeader().setChecked(false);
        r12.tryConnectHID();
        i22.iO(0, 1, null);
        goto L10
    }

    private final void showConnectFailPopup() {
        if (this.mFailPopup != null) goto L5;
        int r3 = 0;
        final go0 r0 = new go0(this, r3, 2, null);
        r0.O1O(R.string.hid_connect_fail);
        r0.iX1O1(Integer.valueOf(R.string.cancel), new gx5());
        r0.X1IX(R.string.confirm, new hx5(r0, this));
        this.mFailPopup = r0;
    L5:
        go0 r1 = this.mFailPopup;
        if (r1 != null) goto L8;
    L10:
        go0 r2 = this.mFailPopup;
        if (r2 == null) goto L14;
        r2.IIX1OXO();
        return;
    L14:
        return;
    L8:
        if (r1.isShowing() != true) goto L10;
    }

    private static final boolean showConnectFailPopup$lambda$0$0() {
        return true;
    }

    private static final boolean showConnectFailPopup$lambda$0$1(go0 r0, TouchSettingsActivity r1) {
        r0.dismiss();
        r1.tryConnectHID();
        return true;
    }

    private final void showTouchICPopup(final Function1<? super Boolean, Unit> r5) {
        if (this.mTouchICPopup != null) goto L5;
        int r3 = 0;
        go0 r0 = new go0(this, r3, 2, null);
        r0.O1O(R.string.experimental_functional_tips);
        r0.iX(Integer.valueOf(R.string.experimental_functional_tips_content));
        r0.iX1O1(Integer.valueOf(R.string.shut_down_function), new rw5(r5));
        r0.X1IX(R.string.open_function, new cx5(r5));
        this.mTouchICPopup = r0;
    L5:
        go0 r6 = this.mTouchICPopup;
        if (r6 != null) goto L8;
    L10:
        go0 r7 = this.mTouchICPopup;
        if (r7 == null) goto L14;
        r7.IIX1OXO();
        return;
    L14:
        return;
    L8:
        if (r6.isShowing() != true) goto L10;
    }

    private static final boolean showTouchICPopup$lambda$0$0(Function1 r1) {
        r1.invoke(Boolean.FALSE);
        return true;
    }

    private static final boolean showTouchICPopup$lambda$0$1(Function1 r1) {
        r1.invoke(Boolean.TRUE);
        return true;
    }

    private final void tryConnectHID() {
        if (this.mLoadingPopup != null) goto L5;
        uq r0 = new uq(this);
        r0.X01IiOiIi(R.string.device_connecting);
        r0.I1(Integer.valueOf(R.string.connecting_hid_tip));
        this.mLoadingPopup = r0;
    L5:
        uq r1 = this.mLoadingPopup;
        if (r1 == null) goto L8;
        r1.IIX1OXO();
    L8:
        BleConnector.INSTANCE.connectHID();
    }

    private final void updateCrossAppToAiTransPage(boolean r3) {
        a01.OXO1.OXO1().put(b01.i0O, r3);
        I01XX0.XIi00iiXO(I01XX0.I0i0, null, 2, null);
    }

    private final void updateUI() {
        AbhSettingsHeader r0 = getItemHeaderMusic();
        r0.getCheckEnabled().setButtonDrawable(R.drawable.selector_radio);
        if (this.mSettings.getMType() != 0) goto L5;
        boolean r1 = true;
    L6:
        r0.setChecked(r1);
        r0.setOnClickListener(new bx5(this));
        getItemHeaderPhoto().setVisibility(8);
        AbhSettingsHeader r2 = getItemHeaderPhoto();
        r2.getCheckEnabled().setButtonDrawable(R.drawable.selector_radio);
        if (this.mSettings.getMType() != 1) goto L9;
        boolean r5 = true;
    L10:
        r2.setChecked(r5);
        r2.setOnClickListener(new dx5(this));
        if (q62.OXO1.ii1I() == false) goto L13;
        getItemHeaderSlide().setVisibility(0);
    L14:
        final AbhSettingsHeader r3 = getItemHeaderSlide();
        r3.getCheckEnabled().setButtonDrawable(R.drawable.selector_radio);
        if (this.mSettings.getMType() != 2) goto L17;
        boolean r6 = true;
    L18:
        r3.setChecked(r6);
        r3.setOnClickListener(new ex5(this, r3));
        AbhSettingsHeader r4 = getItemHeaderCustom();
        r4.getCheckEnabled().setButtonDrawable(R.drawable.selector_radio);
        if (this.mSettings.getMType() != 3) goto L21;
        boolean r7 = true;
    L22:
        r4.setChecked(r7);
        r4.setOnClickListener(new fx5(this));
        ViewParent r8 = r4.getParent();
        Intrinsics.X1ii(r8, "null cannot be cast to non-null type android.view.ViewGroup");
        Iterator<View> r9 = ViewGroupKt.getChildren((ViewGroup) r8).iterator();
        int r10 = 0;
    L24:
        if (r9.hasNext() == false) goto L37;
        View r11 = r9.next();
        int r12 = r10 + 1;
        if (r10 >= 0) goto L28;
        CollectionsKt__CollectionsKt.XOX0O0();
    L28:
        View r13 = r11;
        if ((r13 instanceof AbhSettingsItem) == false) goto L36;
        if (r10 <= 0) goto L36;
        AbhSettingsItem r14 = (AbhSettingsItem) r13;
        if (r4.iO() == false) goto L34;
        int r15 = 0;
    L35:
        r14.setVisibility(r15);
        goto L36
    L34:
        r15 = 8;
    L36:
        r10 = r12;
        goto L24
    L37:
        getContainerPanel().OXO1(!OiOX0i.XIi00iiXO(this.mSettings.getMEnabled()));
        AbhSettingsItem r16 = getItemSingle();
        String r17 = getString(this.mSingleChoiceItems.get(this.mSettings.getMCustomSingle()).IiI10X());
        Intrinsics.O10IXXX0X(r17, "getString(...)");
        r16.setMRightText(r17);
        AbhSettingsItem r18 = getItemDouble();
        String r19 = getString(this.mSingleChoiceItems.get(this.mSettings.getMCustomDouble()).IiI10X());
        Intrinsics.O10IXXX0X(r19, "getString(...)");
        r18.setMRightText(r19);
        AbhSettingsItem r20 = getItemLong();
        String r21 = getString(this.mSingleChoiceItems.get(this.mSettings.getMCustomLong()).IiI10X());
        Intrinsics.O10IXXX0X(r21, "getString(...)");
        r20.setMRightText(r21);
        return;
    L21:
        r7 = false;
        goto L22
    L17:
        r6 = false;
        goto L18
    L13:
        getItemHeaderSlide().setVisibility(8);
        goto L14
    L9:
        r5 = false;
        goto L10
    L5:
        r1 = false;
        goto L6
    }

    private static final void updateUI$lambda$0$0(final TouchSettingsActivity r2, View r3) {
        X0IOiX1O.XIi00iiXO(false, new ix5(r2), 1, null);
    }

    private static final Unit updateUI$lambda$0$0$0(TouchSettingsActivity r10, BleConnector r11) {
        Intrinsics.X0O(r11, "it");
        r10.mSettings.setMType(0);
        BaseBleConnector.sendObject$default(r11, BleKey.TOUCH_SET, BleKeyFlag.UPDATE, r10.mSettings, false, false, 24, null);
        r10.updateUI();
        return Unit.OXO1;
    }

    private static final void updateUI$lambda$1$0(final TouchSettingsActivity r2, View r3) {
        X0IOiX1O.XIi00iiXO(false, new jx5(r2), 1, null);
    }

    private static final Unit updateUI$lambda$1$0$0(TouchSettingsActivity r10, BleConnector r11) {
        Intrinsics.X0O(r11, "it");
        r10.mSettings.setMType(1);
        BaseBleConnector.sendObject$default(r11, BleKey.TOUCH_SET, BleKeyFlag.UPDATE, r10.mSettings, false, false, 24, null);
        r10.updateUI();
        return Unit.OXO1;
    }

    private static final void updateUI$lambda$2$0(final TouchSettingsActivity r3, AbhSettingsHeader r4, View r5) {
        X0IOiX1O.XIi00iiXO(false, new zw5(r3), 1, null);
        r3.updateCrossAppToAiTransPage(r4.iO());
    }

    private static final Unit updateUI$lambda$2$0$0(TouchSettingsActivity r10, BleConnector r11) {
        Intrinsics.X0O(r11, "it");
        r10.mSettings.setMType(2);
        BaseBleConnector.sendObject$default(r11, BleKey.TOUCH_SET, BleKeyFlag.UPDATE, r10.mSettings, false, false, 24, null);
        r10.updateUI();
        return Unit.OXO1;
    }

    private static final void updateUI$lambda$3$0(final TouchSettingsActivity r2, View r3) {
        X0IOiX1O.XIi00iiXO(false, new yw5(r2), 1, null);
    }

    private static final Unit updateUI$lambda$3$0$0(TouchSettingsActivity r10, BleConnector r11) {
        Intrinsics.X0O(r11, "it");
        r10.mSettings.setMType(3);
        BaseBleConnector.sendObject$default(r11, BleKey.TOUCH_SET, BleKeyFlag.UPDATE, r10.mSettings, false, false, 24, null);
        r10.updateUI();
        return Unit.OXO1;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r4) {
        I0iIi r5 = I0iIi.OXO1;
        TouchSettingsActivity$mBluetoothReceiver$1 r0 = this.mBluetoothReceiver;
        IntentFilter r1 = new IntentFilter();
        r1.addAction("android.bluetooth.device.action.BOND_STATE_CHANGED");
        r1.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
        Unit r2 = Unit.OXO1;
        r5.OXO1(this, r0, r1, 2);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.touch_set);
        setHeader();
        updateUI();
        if (OiOX0i.XIi00iiXO(this.mSettings.getMEnabled()) == true) goto L5;
    L7:
        AbhSettingsHeader r0 = getItemHeaderTouchRepair();
        if (i72.OXO1.IXI() == true) goto L10;
    L14:
        r0.setVisibility(8);
        return;
    L10:
        if (q62.OXO1.X0100I() == false) goto L14;
        r0.getCheckEnabled().setVisibility(4);
        r0.setChecked(true);
        r0.setOnClickListener(new kx5(this));
        return;
    L5:
        if (BleConnector.INSTANCE.isBoundHID() == true) goto L7;
        tryConnectHID();
        goto L7
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_touch_settings;
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.mBluetoothReceiver);
    }

    public final void onShowKeysPopup(@aa1 final View r8) {
        Intrinsics.X0O(r8, "view");
        int r4 = 0;
        gj4 r1 = new gj4(this, this.mSingleChoiceItems, r4, 4, null);
        int r0 = r8.getId();
        if (r0 != R.id.item_double) goto L5;
        r1.iX(R.string.touch_set_double);
        r1.II1Xi0(this.mSettings.getMCustomDouble());
    L12:
        r1.i010I(new xw5(r8, this));
        r1.IIX1OXO();
        return;
    L5:
        if (r0 != R.id.item_long) goto L7;
        r1.iX(R.string.touch_set_long);
        r1.II1Xi0(this.mSettings.getMCustomLong());
        goto L12
    L7:
        if (r0 != R.id.item_single) goto L12;
        r1.iX(R.string.touch_set_single);
        r1.II1Xi0(this.mSettings.getMCustomSingle());
        goto L12
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }
}
