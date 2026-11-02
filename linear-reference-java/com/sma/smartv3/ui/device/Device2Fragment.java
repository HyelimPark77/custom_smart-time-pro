package com.sma.smartv3.ui.device;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.PopupWindow;
import androidx.fragment.app.FragmentActivity;
import com.android.mltcode.paycertificationapi.OXiXX1O0I;
import com.android.mltcode.paycertificationapi.X1OOO;
import com.android.mltcode.paycertificationapi.XOOiI1;
import com.android.mltcode.paycertificationapi.XX10O10;
import com.android.mltcode.paycertificationapi.XXIO11;
import com.android.mltcode.paycertificationapi.XXiOOOX;
import com.android.mltcode.paycertificationapi.XiO00OOX;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.ds1;
import com.android.mltcode.paycertificationapi.hr1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.iO0X011X0;
import com.android.mltcode.paycertificationapi.tb1;
import com.angcyo.dsladapter.DslAdapterItem;
import com.bestmafen.androidbase.extension.PermissionStatus;
import com.blankj.utilcode.constant.PermissionConstants;
import com.blankj.utilcode.util.BarUtils;
import com.blankj.utilcode.util.PermissionUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.device.item.DeviceListItem;
import com.sma.smartv3.ui.device.item.EarphoneItem;
import com.sma.smartv3.ui.device.item.GameStoreItem;
import com.sma.smartv3.ui.device.item.Info2Item;
import com.sma.smartv3.ui.device.item.InfoItem;
import com.sma.smartv3.ui.device.item.SplitLine4DPItem;
import com.sma.smartv3.util.UtilsKt;
import com.sma.smartv3.view.bubbleview.ArrowDirection;
import com.sma.smartv3.view.bubbleview.BubbleLayout;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nDevice2Fragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Device2Fragment.kt\ncom/sma/smartv3/ui/device/Device2Fragment\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,389:1\n151#2,5:390\n156#2,5:396\n1#3:395\n*S KotlinDebug\n*F\n+ 1 Device2Fragment.kt\ncom/sma/smartv3/ui/device/Device2Fragment\n*L\n383#1:390,5\n383#1:396,5\n383#1:395\n*E\n"})
public class Device2Fragment extends DeviceFragment {
    private boolean addMarginTop;

    @aa1
    private final Lazy info2Item$delegate;

    @tb1
    private PopupWindow mDropDownPopup;

    @SourceDebugExtension({"SMAP\nDevice2Fragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Device2Fragment.kt\ncom/sma/smartv3/ui/device/Device2Fragment$info2Item$2$1$1\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,389:1\n151#2,5:390\n156#2,5:396\n1#3:395\n*S KotlinDebug\n*F\n+ 1 Device2Fragment.kt\ncom/sma/smartv3/ui/device/Device2Fragment$info2Item$2$1$1\n*L\n55#1:390,5\n55#1:396,5\n55#1:395\n*E\n"})
    public static final class OXO1 implements InfoItem.OXO1 {
        public final /* synthetic */ Device2Fragment OXO1;

        public OXO1(Device2Fragment r1) {
            this.OXO1 = r1;
        }

        @Override // com.sma.smartv3.ui.device.item.InfoItem.OXO1
        public void onClick(View r4) {
            Intrinsics.X0O(r4, "v");
            switch(r4.getId()) {
                case 2131362265: goto L11;
                case 2131363335: goto L9;
                case 2131363367: goto L7;
                case 2131368110: goto L5;
                default: goto L4;
            };
        L4:
            return;
        L5:
            i72.OXO1.OIXOXXi(Device2Fragment.access$getMActivity(this.OXO1));
            return;
        L7:
            DeviceFragment.toAddDevice$default(this.OXO1, null, null, 3, null);
            return;
        L9:
            this.OXO1.showDropDownPopup(r4);
            return;
        L11:
            Device2Fragment r5 = this.OXO1;
            FragmentActivity r1 = r5.getActivity();
            Intrinsics.XXI(r1);
            r5.startActivityForResult(new Intent(r1, MultiDeviceManagerActivity.class), 7);
        }
    }

    public Device2Fragment() {
        this.addMarginTop = true;
        this.info2Item$delegate = LazyKt__LazyJVMKt.iO(new OXiXX1O0I(this));
    }

    public static /* synthetic */ Unit IXXI1(Device2Fragment r0, View r1, boolean r2) {
        return showDropDownPopup$lambda$1(r0, r1, r2);
    }

    public static /* synthetic */ Unit Ii1X(Device2Fragment r0, View r1, boolean r2) {
        return showDropDownPopup$lambda$0(r0, r1, r2);
    }

    public static /* synthetic */ Unit X01I0(Device2Fragment r0, PermissionStatus r1) {
        return showDropDownPopup$lambda$2$0(r0, r1);
    }

    public static final /* synthetic */ Activity access$getMActivity(Device2Fragment r0) {
        return r0.getMActivity();
    }

    private final Info2Item getInfo2Item() {
        return (Info2Item) getValue();
    }

    public static /* synthetic */ void i1IIX0iX(Device2Fragment r0, View r1) {
        showDropDownPopup$lambda$2(r0, r1);
    }

    public static /* synthetic */ void iXOOOO0X0(Device2Fragment r0, View r1) {
        showDropDownPopup$lambda$3(r0, r1);
    }

    public static /* synthetic */ Info2Item iXOXii(Device2Fragment r0) {
        return info2Item_delegate$lambda$0(r0);
    }

    private static final Info2Item info2Item_delegate$lambda$0(Device2Fragment r2) {
        Info2Item r0 = new Info2Item();
        r0.setOnClickListener(new OXO1(r2));
        return r0;
    }

    private static final Unit showDropDownPopup$lambda$0(Device2Fragment r0, View r1, boolean r2) {
        if (r2 == false) goto L5;
        r0.showDropDownPopup(r1);
    L5:
        return Unit.OXO1;
    }

    private static final Unit showDropDownPopup$lambda$1(Device2Fragment r0, View r1, boolean r2) {
        if (r2 == false) goto L5;
        r0.showDropDownPopup(r1);
    L5:
        return Unit.OXO1;
    }

    private static final void showDropDownPopup$lambda$2(final Device2Fragment r6, View r7) {
        PermissionUtils r0 = PermissionUtils.permission(new String[]{PermissionConstants.STORAGE, PermissionConstants.CAMERA});
        Intrinsics.O10IXXX0X(r0, "permission(...)");
        ds1.iO(r0, null, null, new iO0X011X0(r6), 3, null);
    }

    private static final Unit showDropDownPopup$lambda$2$0(Device2Fragment r1, PermissionStatus r2) {
        Intrinsics.X0O(r2, "it");
        if (r2 != PermissionStatus.GRANTED) goto L9;
        PopupWindow r3 = r1.mDropDownPopup;
        if (r3 == null) goto L7;
        r3.dismiss();
    L7:
        r1.scanQrcode();
    L9:
        return Unit.OXO1;
    }

    private static final void showDropDownPopup$lambda$3(Device2Fragment r3, View r4) {
        PopupWindow r5 = r3.mDropDownPopup;
        if (r5 == null) goto L5;
        r5.dismiss();
    L5:
        r3.setBindDevice(true);
        FragmentActivity r1 = r3.getActivity();
        Intrinsics.XXI(r1);
        r3.startActivityForResult(new Intent(r1, AddDeviceActivity.class), 1);
    }

    public final boolean getAddMarginTop() {
        return this.addMarginTop;
    }

    @Override // com.sma.smartv3.ui.device.DeviceFragment
    @aa1
    public List<DslAdapterItem> getBCItems() {
        Info2Item r0 = getInfo2Item();
        DeviceListItem r1 = new DeviceListItem();
        r1.setMTitle(R.string.health_monitoring);
        r1.setItems(CollectionsKt__CollectionsKt.Ii1iii0(new DslAdapterItem[]{getHrMonitoringItem(), getBloodOxyGenItem(), getPressureItem()}));
        Unit r4 = Unit.OXO1;
        DeviceListItem r5 = new DeviceListItem();
        r5.setMTitle(R.string.device_settings);
        r5.setItems(CollectionsKt__CollectionsKt.Ii1iii0(new DslAdapterItem[]{getFirmwareItem(), getResetItem(), getShutdownItem()}));
        return CollectionsKt__CollectionsKt.Ii1iii0(new DslAdapterItem[]{r0, r1, r5, new SplitLine4DPItem(), getUnpairItem(), new SplitLine4DPItem()});
    }

    @Override // com.sma.smartv3.ui.device.DeviceFragment
    @aa1
    public List<DslAdapterItem> getItems() {
        Info2Item r0 = getInfo2Item();
        EarphoneItem r1 = getEarphoneItem();
        GameStoreItem r2 = getGameStoreItem();
        DeviceListItem r3 = new DeviceListItem();
        r3.setItems(CollectionsKt__CollectionsKt.Ii1iii0(new DslAdapterItem[]{getClassicPairItem(), getQiblaItem(), getDialItem()}));
        Unit r6 = Unit.OXO1;
        DeviceListItem r7 = new DeviceListItem();
        r7.setMTitle(R.string.notification_settings);
        r7.setItems(CollectionsKt__CollectionsKt.Ii1iii0(new DslAdapterItem[]{getMessagePushItem(), getIncomingCallItem(), getNoDisturbItem(), getNoDisturb2Item()}));
        DeviceListItem r8 = new DeviceListItem();
        r8.setMTitle(R.string.health_monitoring);
        r8.setItems(CollectionsKt__CollectionsKt.Ii1iii0(new DslAdapterItem[]{getHrMonitoringItem(), getEcgMonitoringItem(), getBloodOxyGenItem(), getTempMonitoringItem(), getGirlCareItem(), getSedentarinessItem(), getMedicationAlarmItem(), getDrinkWaterItem(), getWashItem(), getPressureItem()}));
        DeviceListItem r5 = new DeviceListItem();
        r5.setMTitle(R.string.device_application);
        r5.setItems(CollectionsKt__CollectionsKt.Ii1iii0(new DslAdapterItem[]{getMusicControlItem(), getRemoteCameraItem(), getAlarmClockItem(), getScheduleItem(), getSyncContactItem(), getFindWatchItem(), getVoiceItem(), getDialogueTranslation(), getSimultaneousTranslation(), getRecordingItem(), getWorldClockItem(), getStockMarketItem(), getGameSettingsItem(), getGameTimeSetItem(), getNavigationItem(), getNucleicAcidCodeItem(), getMyCardCodeItem(), getMyCardCode2Item(), getReceiptCodeItem(), getReceiptCode2Item(), getOfflineMapsItem(), getAlipaySetItem(), getWechatPaySetItem(), getHardWareAlipay(), getSosManagerItem(), getAppStoreItem(), getAudioBookLearnItem(), getNotificationLightScreenItem(), getLearnCardItem(), getLogoFileItem(), getMusicManagerItem(), getEbookManagerItem()}));
        DeviceListItem r9 = new DeviceListItem();
        r9.setMTitle(R.string.device_settings);
        r9.setItems(CollectionsKt__CollectionsKt.Ii1iii0(new DslAdapterItem[]{getGestureWakeItem(), getGestureWake2Item(), getShockItem(), getShockSettingsItem(), getBackLightItem(), getTimeFormatItem(), getDateFormatItem(), getMemoryManagerItem(), getSmsQuickReplyItem(), getMeasureUnitItem(), getWearWayItem(), getLanguageItem(), getStandbySetItem(), getStandbyWatchFaceItem(), getWatchPasswordItem(), getAntiLostItem(), getMacQrcodeItem(), getNfcGuideItem(), getPowerSaveModeItem(), getTouchSetItem(), getFirmwareItem(), getAGPSUpgradeItem(), getLanguageUpdateItem(), getDoubleClickScreenItem(), getIncomingCallRingItem(), getWechatVerificationItem(), getIncomingCallRingVibrationItem(), getLanguageUpdateItem(), getResetItem()}));
        return CollectionsKt__CollectionsKt.Ii1iii0(new DslAdapterItem[]{r0, r1, r2, r3, r7, r8, r5, r9, new SplitLine4DPItem(), getUnpairItem(), new SplitLine4DPItem()});
    }

    @Override // com.sma.smartv3.ui.device.DeviceFragment
    @aa1
    public List<DslAdapterItem> getRingItems() {
        Info2Item r0 = getInfo2Item();
        GameStoreItem r1 = getGameStoreItem();
        DeviceListItem r2 = new DeviceListItem();
        r2.setMTitle(R.string.health_monitoring);
        r2.setItems(CollectionsKt__CollectionsKt.Ii1iii0(new DslAdapterItem[]{getHrMonitoringItem(), getBloodOxyGenItem(), getPressureItem()}));
        Unit r5 = Unit.OXO1;
        DeviceListItem r6 = new DeviceListItem();
        r6.setMTitle(R.string.device_settings);
        r6.setItems(CollectionsKt__CollectionsKt.Ii1iii0(new DslAdapterItem[]{getTouchSetItem(), getFirmwareItem(), getResetItem(), getShutdownItem()}));
        DeviceListItem r7 = new DeviceListItem();
        r7.setItems(CollectionsKt__CollectionsKt.Ii1iii0(new DslAdapterItem[]{getVideoUseHelpItem()}));
        return CollectionsKt__CollectionsKt.Ii1iii0(new DslAdapterItem[]{r0, r1, r2, r6, r7, new SplitLine4DPItem(), getUnpairItem(), new SplitLine4DPItem()});
    }

    @Override // com.sma.smartv3.ui.device.DeviceFragment
    @aa1
    public List<DslAdapterItem> getScreenlessBraceletItems() {
        Info2Item r0 = getInfo2Item();
        DeviceListItem r1 = new DeviceListItem();
        r1.setMTitle(R.string.health_monitoring);
        r1.setItems(CollectionsKt__CollectionsKt.Ii1iii0(new DslAdapterItem[]{getHrMonitoringItem(), getBloodOxyGenItem(), getPressureItem(), getHrvSetItem(), getTempMonitoringItem()}));
        Unit r6 = Unit.OXO1;
        DeviceListItem r7 = new DeviceListItem();
        r7.setMTitle(R.string.device_application);
        r7.setItems(CollectionsKt__CollectionsKt.Ii1iii0(new DslAdapterItem[]{getAlarmClockItem()}));
        DeviceListItem r8 = new DeviceListItem();
        r8.setMTitle(R.string.device_settings);
        r8.setItems(CollectionsKt__CollectionsKt.Ii1iii0(new DslAdapterItem[]{getShockLevelItem(), getActivityRecognitionItem(), getFindWatchItem(), getMeasureUnitItem(), getFirmwareItem(), getResetItem(), getShutdownItem()}));
        return CollectionsKt__CollectionsKt.Ii1iii0(new DslAdapterItem[]{r0, r1, r7, r8, new SplitLine4DPItem(), getUnpairItem(), new SplitLine4DPItem()});
    }

    @Override // com.sma.smartv3.ui.device.DeviceFragment, com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        if (this.addMarginTop == false) goto L6;
        BarUtils.addMarginTopEqualStatusBarHeight(getMView().findViewById(R.id.rv));
        return;
    }

    @Override // com.sma.smartv3.ui.device.DeviceFragment
    @aa1
    public List<DslAdapterItem> isM100Items() {
        Info2Item r0 = getInfo2Item();
        DeviceListItem r1 = new DeviceListItem();
        r1.setMTitle(R.string.health_monitoring);
        r1.setItems(CollectionsKt__CollectionsKt.Ii1iii0(new DslAdapterItem[]{getHrMonitoringItem(), getBloodOxyGenItem(), getPressureItem()}));
        Unit r4 = Unit.OXO1;
        DeviceListItem r5 = new DeviceListItem();
        r5.setMTitle(R.string.device_settings);
        r5.setItems(CollectionsKt__CollectionsKt.Ii1iii0(new DslAdapterItem[]{getGestureWakeItem(), getGestureWake2Item(), getBackLightItem(), getFirmwareItem(), getResetItem(), getShutdownItem()}));
        return CollectionsKt__CollectionsKt.Ii1iii0(new DslAdapterItem[]{r0, r1, r5, new SplitLine4DPItem(), getUnpairItem(), new SplitLine4DPItem()});
    }

    @Override // com.sma.smartv3.ui.device.DeviceFragment, com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.v2_device_fragment_rv;
    }

    public final void setAddMarginTop(boolean r1) {
        this.addMarginTop = r1;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public final void showDropDownPopup(@aa1 final View r9) {
        Intrinsics.X0O(r9, "v");
        PopupWindow r0 = this.mDropDownPopup;
        if (r0 == null) goto L8;
        if (r0.isShowing() != true) goto L8;
        return;
    L8:
        if (PermissionUtils.isGranted(new String[]{PermissionConstants.LOCATION}) == true) goto L12;
        hr1.XXIIO1i11(hr1.OXO1, getMActivity(), false, new XX10O10(this, r9), 2, null);
        return;
    L12:
        if (Build.VERSION.SDK_INT < 31) goto L18;
        hr1 r1 = hr1.OXO1;
        if (r1.i11I(getMActivity()) == true) goto L18;
        r1.OX(getMActivity(), new XOOiI1(this, r9));
        return;
    L18:
        if (BluetoothAdapter.getDefaultAdapter().isEnabled() == true) goto L29;
        X1OOO.XiOIO(this, "android.bluetooth.adapter.action.REQUEST_ENABLE", 5, 0, 4, null);     // Catch: Exception -> L23
        return;
    L23:
        e = move-exception;
        ToastUtils.showLong("Please turn on bluetooth", new Object[0]);
        i1O0OXO1O.OXO1.XIi00iiXO("requestEnableBluetooth -> " + e.getMessage());
        return;
    L29:
        if (UtilsKt.X1() == true) goto L32;
        startActivityForResult(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"), 6);
        return;
    L32:
        View r2 = LayoutInflater.from(requireActivity()).inflate(R.layout.layout_add_device_pop, null);
        BubbleLayout r3 = (BubbleLayout) r2.findViewById(R.id.bubbleLayout);
        r3.measure(0, 0);
        r3.requestLayout();
        r2.requestLayout();
        this.mDropDownPopup = XXiOOOX.OXO1(requireActivity(), r2);
        r3.O00(ArrowDirection.TOP);
        r3.XOO0ii0((r3.getMeasuredWidth() - r9.getWidth()) - (r3.getArrowWidth() / 2));
        r2.findViewById(R.id.ll_scan).setOnClickListener(new XXIO11(this));
        r2.findViewById(R.id.ll_search).setOnClickListener(new XiO00OOX(this));
        PopupWindow r4 = this.mDropDownPopup;
        if (r4 == null) goto L39;
        r4.showAsDropDown(r9);
        return;
    }
}
