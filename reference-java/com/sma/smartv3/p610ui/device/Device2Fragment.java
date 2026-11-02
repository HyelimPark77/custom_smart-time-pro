package com.sma.smartv3.p610ui.device;

import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.fragment.app.FragmentActivity;
import com.android.mltcode.paycertificationapi.X1OOO;
import com.android.mltcode.paycertificationapi.XXiOOOX;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.ds1;
import com.android.mltcode.paycertificationapi.hr1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.tb1;
import com.angcyo.dsladapter.DslAdapterItem;
import com.bestmafen.androidbase.extension.PermissionStatus;
import com.blankj.utilcode.constant.PermissionConstants;
import com.blankj.utilcode.util.BarUtils;
import com.blankj.utilcode.util.PermissionUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.sma.smartv3.p610ui.device.Device2Fragment;
import com.sma.smartv3.p610ui.device.item.DeviceListItem;
import com.sma.smartv3.p610ui.device.item.EarphoneItem;
import com.sma.smartv3.p610ui.device.item.GameStoreItem;
import com.sma.smartv3.p610ui.device.item.Info2Item;
import com.sma.smartv3.p610ui.device.item.InfoItem;
import com.sma.smartv3.p610ui.device.item.SplitLine4DPItem;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.UtilsKt;
import com.sma.smartv3.view.bubbleview.ArrowDirection;
import com.sma.smartv3.view.bubbleview.BubbleLayout;
import java.io.IOException;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nDevice2Fragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Device2Fragment.kt\ncom/sma/smartv3/ui/device/Device2Fragment\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,389:1\n151#2,5:390\n156#2,5:396\n1#3:395\n*S KotlinDebug\n*F\n+ 1 Device2Fragment.kt\ncom/sma/smartv3/ui/device/Device2Fragment\n*L\n383#1:390,5\n383#1:396,5\n383#1:395\n*E\n"})
public class Device2Fragment extends DeviceFragment {
    private boolean addMarginTop = true;

    @aa1
    private final Lazy info2Item$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OXiXX1O0I
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return Device2Fragment.info2Item_delegate$lambda$0(this.f3589IO);
        }
    });

    @tb1
    private PopupWindow mDropDownPopup;

    @SourceDebugExtension({"SMAP\nDevice2Fragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Device2Fragment.kt\ncom/sma/smartv3/ui/device/Device2Fragment$info2Item$2$1$1\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,389:1\n151#2,5:390\n156#2,5:396\n1#3:395\n*S KotlinDebug\n*F\n+ 1 Device2Fragment.kt\ncom/sma/smartv3/ui/device/Device2Fragment$info2Item$2$1$1\n*L\n55#1:390,5\n55#1:396,5\n55#1:395\n*E\n"})
    public static final class OXO1 implements InfoItem.OXO1 {
        public OXO1() {
        }

        @Override // com.sma.smartv3.ui.device.item.InfoItem.OXO1
        public void onClick(View v) {
            Intrinsics.X0O(v, "v");
            switch (v.getId()) {
                case R.id.btn_multi_device /* 2131362265 */:
                    Device2Fragment device2Fragment = Device2Fragment.this;
                    FragmentActivity activity = device2Fragment.getActivity();
                    Intrinsics.XXI(activity);
                    device2Fragment.startActivityForResult(new Intent(activity, (Class<?>) MultiDeviceManagerActivity.class), 7);
                    break;
                case R.id.ivPairType /* 2131363335 */:
                    Device2Fragment.this.showDropDownPopup(v);
                    break;
                case R.id.iv_device_add /* 2131363367 */:
                    DeviceFragment.toAddDevice$default(Device2Fragment.this, null, null, 3, null);
                    break;
                case R.id.tv_usage_guid_lines /* 2131368110 */:
                    i72.OXO1.OIXOXXi(Device2Fragment.this.getMActivity());
                    break;
            }
        }
    }

    private final Info2Item getInfo2Item() {
        return (Info2Item) this.info2Item$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Info2Item info2Item_delegate$lambda$0(Device2Fragment device2Fragment) {
        Info2Item info2Item = new Info2Item();
        info2Item.setOnClickListener(device2Fragment.new OXO1());
        return info2Item;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showDropDownPopup$lambda$0(Device2Fragment device2Fragment, View view, boolean z) {
        if (z) {
            device2Fragment.showDropDownPopup(view);
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showDropDownPopup$lambda$1(Device2Fragment device2Fragment, View view, boolean z) {
        if (z) {
            device2Fragment.showDropDownPopup(view);
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showDropDownPopup$lambda$2(final Device2Fragment device2Fragment, View view) {
        PermissionUtils permissionUtilsPermission = PermissionUtils.permission(PermissionConstants.STORAGE, PermissionConstants.CAMERA);
        Intrinsics.O10IXXX0X(permissionUtilsPermission, "permission(...)");
        ds1.m1690iO(permissionUtilsPermission, null, null, new Function1() { // from class: com.android.mltcode.paycertificationapi.iO0X011X0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Device2Fragment.showDropDownPopup$lambda$2$0(this.f7999IO, (PermissionStatus) obj);
            }
        }, 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showDropDownPopup$lambda$2$0(Device2Fragment device2Fragment, PermissionStatus it) throws IOException {
        Intrinsics.X0O(it, "it");
        if (it == PermissionStatus.GRANTED) {
            PopupWindow popupWindow = device2Fragment.mDropDownPopup;
            if (popupWindow != null) {
                popupWindow.dismiss();
            }
            device2Fragment.scanQrcode();
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showDropDownPopup$lambda$3(Device2Fragment device2Fragment, View view) {
        PopupWindow popupWindow = device2Fragment.mDropDownPopup;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        device2Fragment.setBindDevice(true);
        FragmentActivity activity = device2Fragment.getActivity();
        Intrinsics.XXI(activity);
        device2Fragment.startActivityForResult(new Intent(activity, (Class<?>) AddDeviceActivity.class), 1);
    }

    public final boolean getAddMarginTop() {
        return this.addMarginTop;
    }

    @Override // com.sma.smartv3.p610ui.device.DeviceFragment
    @aa1
    public List<DslAdapterItem> getBCItems() {
        Info2Item info2Item = getInfo2Item();
        DeviceListItem deviceListItem = new DeviceListItem();
        deviceListItem.setMTitle(R.string.health_monitoring);
        deviceListItem.setItems(CollectionsKt__CollectionsKt.Ii1iii0(getHrMonitoringItem(), getBloodOxyGenItem(), getPressureItem()));
        Unit unit = Unit.OXO1;
        DeviceListItem deviceListItem2 = new DeviceListItem();
        deviceListItem2.setMTitle(R.string.device_settings);
        deviceListItem2.setItems(CollectionsKt__CollectionsKt.Ii1iii0(getFirmwareItem(), getResetItem(), getShutdownItem()));
        return CollectionsKt__CollectionsKt.Ii1iii0(info2Item, deviceListItem, deviceListItem2, new SplitLine4DPItem(), getUnpairItem(), new SplitLine4DPItem());
    }

    @Override // com.sma.smartv3.p610ui.device.DeviceFragment
    @aa1
    public List<DslAdapterItem> getItems() {
        Info2Item info2Item = getInfo2Item();
        EarphoneItem earphoneItem = getEarphoneItem();
        GameStoreItem gameStoreItem = getGameStoreItem();
        DeviceListItem deviceListItem = new DeviceListItem();
        deviceListItem.setItems(CollectionsKt__CollectionsKt.Ii1iii0(getClassicPairItem(), getQiblaItem(), getDialItem()));
        Unit unit = Unit.OXO1;
        DeviceListItem deviceListItem2 = new DeviceListItem();
        deviceListItem2.setMTitle(R.string.notification_settings);
        deviceListItem2.setItems(CollectionsKt__CollectionsKt.Ii1iii0(getMessagePushItem(), getIncomingCallItem(), getNoDisturbItem(), getNoDisturb2Item()));
        DeviceListItem deviceListItem3 = new DeviceListItem();
        deviceListItem3.setMTitle(R.string.health_monitoring);
        deviceListItem3.setItems(CollectionsKt__CollectionsKt.Ii1iii0(getHrMonitoringItem(), getEcgMonitoringItem(), getBloodOxyGenItem(), getTempMonitoringItem(), getGirlCareItem(), getSedentarinessItem(), getMedicationAlarmItem(), getDrinkWaterItem(), getWashItem(), getPressureItem()));
        DeviceListItem deviceListItem4 = new DeviceListItem();
        deviceListItem4.setMTitle(R.string.device_application);
        deviceListItem4.setItems(CollectionsKt__CollectionsKt.Ii1iii0(getMusicControlItem(), getRemoteCameraItem(), getAlarmClockItem(), getScheduleItem(), getSyncContactItem(), getFindWatchItem(), getVoiceItem(), getDialogueTranslation(), getSimultaneousTranslation(), getRecordingItem(), getWorldClockItem(), getStockMarketItem(), getGameSettingsItem(), getGameTimeSetItem(), getNavigationItem(), getNucleicAcidCodeItem(), getMyCardCodeItem(), getMyCardCode2Item(), getReceiptCodeItem(), getReceiptCode2Item(), getOfflineMapsItem(), getAlipaySetItem(), getWechatPaySetItem(), getHardWareAlipay(), getSosManagerItem(), getAppStoreItem(), getAudioBookLearnItem(), getNotificationLightScreenItem(), getLearnCardItem(), getLogoFileItem(), getMusicManagerItem(), getEbookManagerItem()));
        DeviceListItem deviceListItem5 = new DeviceListItem();
        deviceListItem5.setMTitle(R.string.device_settings);
        deviceListItem5.setItems(CollectionsKt__CollectionsKt.Ii1iii0(getGestureWakeItem(), getGestureWake2Item(), getShockItem(), getShockSettingsItem(), getBackLightItem(), getTimeFormatItem(), getDateFormatItem(), getMemoryManagerItem(), getSmsQuickReplyItem(), getMeasureUnitItem(), getWearWayItem(), getLanguageItem(), getStandbySetItem(), getStandbyWatchFaceItem(), getWatchPasswordItem(), getAntiLostItem(), getMacQrcodeItem(), getNfcGuideItem(), getPowerSaveModeItem(), getTouchSetItem(), getFirmwareItem(), getAGPSUpgradeItem(), getLanguageUpdateItem(), getDoubleClickScreenItem(), getIncomingCallRingItem(), getWechatVerificationItem(), getIncomingCallRingVibrationItem(), getLanguageUpdateItem(), getResetItem()));
        return CollectionsKt__CollectionsKt.Ii1iii0(info2Item, earphoneItem, gameStoreItem, deviceListItem, deviceListItem2, deviceListItem3, deviceListItem4, deviceListItem5, new SplitLine4DPItem(), getUnpairItem(), new SplitLine4DPItem());
    }

    @Override // com.sma.smartv3.p610ui.device.DeviceFragment
    @aa1
    public List<DslAdapterItem> getRingItems() {
        Info2Item info2Item = getInfo2Item();
        GameStoreItem gameStoreItem = getGameStoreItem();
        DeviceListItem deviceListItem = new DeviceListItem();
        deviceListItem.setMTitle(R.string.health_monitoring);
        deviceListItem.setItems(CollectionsKt__CollectionsKt.Ii1iii0(getHrMonitoringItem(), getBloodOxyGenItem(), getPressureItem()));
        Unit unit = Unit.OXO1;
        DeviceListItem deviceListItem2 = new DeviceListItem();
        deviceListItem2.setMTitle(R.string.device_settings);
        deviceListItem2.setItems(CollectionsKt__CollectionsKt.Ii1iii0(getTouchSetItem(), getFirmwareItem(), getResetItem(), getShutdownItem()));
        DeviceListItem deviceListItem3 = new DeviceListItem();
        deviceListItem3.setItems(CollectionsKt__CollectionsKt.Ii1iii0(getVideoUseHelpItem()));
        return CollectionsKt__CollectionsKt.Ii1iii0(info2Item, gameStoreItem, deviceListItem, deviceListItem2, deviceListItem3, new SplitLine4DPItem(), getUnpairItem(), new SplitLine4DPItem());
    }

    @Override // com.sma.smartv3.p610ui.device.DeviceFragment
    @aa1
    public List<DslAdapterItem> getScreenlessBraceletItems() {
        Info2Item info2Item = getInfo2Item();
        DeviceListItem deviceListItem = new DeviceListItem();
        deviceListItem.setMTitle(R.string.health_monitoring);
        deviceListItem.setItems(CollectionsKt__CollectionsKt.Ii1iii0(getHrMonitoringItem(), getBloodOxyGenItem(), getPressureItem(), getHrvSetItem(), getTempMonitoringItem()));
        Unit unit = Unit.OXO1;
        DeviceListItem deviceListItem2 = new DeviceListItem();
        deviceListItem2.setMTitle(R.string.device_application);
        deviceListItem2.setItems(CollectionsKt__CollectionsKt.Ii1iii0(getAlarmClockItem()));
        DeviceListItem deviceListItem3 = new DeviceListItem();
        deviceListItem3.setMTitle(R.string.device_settings);
        deviceListItem3.setItems(CollectionsKt__CollectionsKt.Ii1iii0(getShockLevelItem(), getActivityRecognitionItem(), getFindWatchItem(), getMeasureUnitItem(), getFirmwareItem(), getResetItem(), getShutdownItem()));
        return CollectionsKt__CollectionsKt.Ii1iii0(info2Item, deviceListItem, deviceListItem2, deviceListItem3, new SplitLine4DPItem(), getUnpairItem(), new SplitLine4DPItem());
    }

    @Override // com.sma.smartv3.p610ui.device.DeviceFragment, com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        if (this.addMarginTop) {
            BarUtils.addMarginTopEqualStatusBarHeight(getMView().findViewById(R.id.f51422rv));
        }
    }

    @Override // com.sma.smartv3.p610ui.device.DeviceFragment
    @aa1
    public List<DslAdapterItem> isM100Items() {
        Info2Item info2Item = getInfo2Item();
        DeviceListItem deviceListItem = new DeviceListItem();
        deviceListItem.setMTitle(R.string.health_monitoring);
        deviceListItem.setItems(CollectionsKt__CollectionsKt.Ii1iii0(getHrMonitoringItem(), getBloodOxyGenItem(), getPressureItem()));
        Unit unit = Unit.OXO1;
        DeviceListItem deviceListItem2 = new DeviceListItem();
        deviceListItem2.setMTitle(R.string.device_settings);
        deviceListItem2.setItems(CollectionsKt__CollectionsKt.Ii1iii0(getGestureWakeItem(), getGestureWake2Item(), getBackLightItem(), getFirmwareItem(), getResetItem(), getShutdownItem()));
        return CollectionsKt__CollectionsKt.Ii1iii0(info2Item, deviceListItem, deviceListItem2, new SplitLine4DPItem(), getUnpairItem(), new SplitLine4DPItem());
    }

    @Override // com.sma.smartv3.p610ui.device.DeviceFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.v2_device_fragment_rv;
    }

    public final void setAddMarginTop(boolean z) {
        this.addMarginTop = z;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public final void showDropDownPopup(@aa1 final View v) {
        Intrinsics.X0O(v, "v");
        PopupWindow popupWindow = this.mDropDownPopup;
        if (popupWindow == null || !popupWindow.isShowing()) {
            if (!PermissionUtils.isGranted(PermissionConstants.LOCATION)) {
                hr1.XXIIO1i11(hr1.OXO1, getMActivity(), false, new Function1() { // from class: com.android.mltcode.paycertificationapi.XX10O10
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return Device2Fragment.showDropDownPopup$lambda$0(this.f4967IO, v, ((Boolean) obj).booleanValue());
                    }
                }, 2, null);
                return;
            }
            if (Build.VERSION.SDK_INT >= 31) {
                hr1 hr1Var = hr1.OXO1;
                if (!hr1Var.i11I(getMActivity())) {
                    hr1Var.m1930OX(getMActivity(), new Function1() { // from class: com.android.mltcode.paycertificationapi.XOOiI1
                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: invoke */
                        public final Object invoke2(Object obj) {
                            return Device2Fragment.showDropDownPopup$lambda$1(this.f4839IO, v, ((Boolean) obj).booleanValue());
                        }
                    });
                    return;
                }
            }
            if (!BluetoothAdapter.getDefaultAdapter().isEnabled()) {
                try {
                    X1OOO.XiOIO(this, "android.bluetooth.adapter.action.REQUEST_ENABLE", 5, 0, 4, null);
                    return;
                } catch (Exception e) {
                    ToastUtils.showLong("Please turn on bluetooth", new Object[0]);
                    i1O0OXO1O.OXO1.XIi00iiXO("requestEnableBluetooth -> " + e.getMessage());
                    return;
                }
            }
            if (!UtilsKt.m38846X1()) {
                startActivityForResult(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"), 6);
                return;
            }
            View viewInflate = LayoutInflater.from(requireActivity()).inflate(R.layout.layout_add_device_pop, (ViewGroup) null);
            BubbleLayout bubbleLayout = (BubbleLayout) viewInflate.findViewById(R.id.bubbleLayout);
            bubbleLayout.measure(0, 0);
            bubbleLayout.requestLayout();
            viewInflate.requestLayout();
            this.mDropDownPopup = XXiOOOX.OXO1(requireActivity(), viewInflate);
            bubbleLayout.O00(ArrowDirection.TOP);
            bubbleLayout.XOO0ii0((bubbleLayout.getMeasuredWidth() - v.getWidth()) - (bubbleLayout.getArrowWidth() / 2));
            viewInflate.findViewById(R.id.ll_scan).setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.XXIO11
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Device2Fragment.showDropDownPopup$lambda$2(this.f5030IO, view);
                }
            });
            viewInflate.findViewById(R.id.ll_search).setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.XiO00OOX
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Device2Fragment.showDropDownPopup$lambda$3(this.f5287IO, view);
                }
            });
            PopupWindow popupWindow2 = this.mDropDownPopup;
            if (popupWindow2 != null) {
                popupWindow2.showAsDropDown(v);
            }
        }
    }
}
