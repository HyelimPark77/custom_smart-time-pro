package com.sma.smartv3.ui.device.item;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.lv0;
import com.android.mltcode.paycertificationapi.mv0;
import com.android.mltcode.paycertificationapi.nv0;
import com.android.mltcode.paycertificationapi.ov0;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uz0;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.ImageUtils;
import com.blankj.utilcode.util.LogUtils;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.sma.smartv3.pro.R;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.component.BaseBleCache;
import com.szabh.smable3.component.BleCache;
import com.szabh.smable3.component.BleConnector;
import com.szabh.smable3.entity.BleDeviceInfo;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class MultiDeviceInfoItem extends BaseDslItem {
    private View btnDelete;

    @aa1
    private final BleDeviceInfo deviceInfo;
    private final boolean initEvent;
    private ImageView ivConnection;
    private ImageView ivDevice;
    private ImageView ivPower;
    private Context mContext;

    @tb1
    private OXO1 mOnClickListener;
    private ProgressBar pbConnecting;
    private View powerPanel;
    private RelativeLayout rlLayout;
    private TextView tvMac;
    private TextView tvName;
    public TextView tvReconnect;
    private TextView tvState;

    public interface OXO1 {
        void onClick(@aa1 View r1);
    }

    public MultiDeviceInfoItem(@aa1 BleDeviceInfo r2) {
        Intrinsics.X0O(r2, "deviceInfo");
        this.deviceInfo = r2;
        this.initEvent = true;
    }

    public static /* synthetic */ void IiI10X(MultiDeviceInfoItem r0, View r1) {
        bindView$lambda$1(r0, r1);
    }

    public static /* synthetic */ void O00(MultiDeviceInfoItem r0, View r1) {
        bindView$lambda$0(r0, r1);
    }

    public static /* synthetic */ void XOO0ii0(MultiDeviceInfoItem r0, View r1) {
        bindView$lambda$2(r0, r1);
    }

    private static final void bindView$lambda$0(MultiDeviceInfoItem r0, View r1) {
        OXO1 r2 = r0.mOnClickListener;
        if (r2 == null) goto L6;
        Intrinsics.XXI(r1);
        r2.onClick(r1);
        return;
    }

    private static final void bindView$lambda$1(MultiDeviceInfoItem r0, View r1) {
        OXO1 r2 = r0.mOnClickListener;
        if (r2 == null) goto L6;
        Intrinsics.XXI(r1);
        r2.onClick(r1);
        return;
    }

    private static final void bindView$lambda$2(MultiDeviceInfoItem r0, View r1) {
        OXO1 r2 = r0.mOnClickListener;
        if (r2 == null) goto L6;
        Intrinsics.XXI(r1);
        r2.onClick(r1);
        return;
    }

    private final void currentThirdPartyDeviceDisConnected() {
        ImageView r0 = this.ivConnection;
        View r1 = null;
        if (r0 != null) goto L5;
        Intrinsics.XXO("ivConnection");
        r0 = null;
    L5:
        r0.setEnabled(false);
        TextView r2 = this.tvState;
        if (r2 != null) goto L8;
        Intrinsics.XXO("tvState");
        r2 = null;
    L8:
        r2.setText(R.string.device_disconnected);
        View r3 = this.btnDelete;
        if (r3 != null) goto L11;
        Intrinsics.XXO("btnDelete");
    L12:
        r1.setVisibility(8);
        getTvReconnect().setVisibility(0);
        return;
    L11:
        r1 = r3;
        goto L12
    }

    private final void initDevice() {
        if (this.deviceInfo.getMFirmwareFlag().length() <= 0) goto L5;
        boolean r0 = true;
    L6:
        i1O0OXO1O.OXO1.OXO1("initDevice deviceInfo = " + this.deviceInfo + "  isSelfDevice:" + r0);
        if (r0 == true) goto L10;
        initThirdPartyDevice();
        return;
    L10:
        initSelfDevice();
        return;
    L5:
        r0 = false;
        goto L6
    }

    private final void initSelfDevice() {
        if (ov0.OXO1.I0iXXO(this.deviceInfo.getMBleAddress()) == true) goto L5;
    L39:
        disconnect();
        return;
    L5:
        if (com.sma.smartv3.dto.OXO1.I0iXXO.XOO0ii0() == true) goto L39;
        getTvReconnect().setVisibility(4);
        View r0 = this.btnDelete;
        TextView r1 = null;
        ImageView r2 = null;
        if (r0 != null) goto L9;
        Intrinsics.XXO("btnDelete");
        r0 = null;
    L9:
        r0.setVisibility(8);
        ImageView r3 = this.ivConnection;
        if (r3 != null) goto L12;
        Intrinsics.XXO("ivConnection");
        r3 = null;
    L12:
        r3.setEnabled(false);
        ImageView r4 = this.ivPower;
        if (r4 != null) goto L15;
        Intrinsics.XXO("ivPower");
        r4 = null;
    L15:
        r4.setImageLevel(BaseBleCache.getInt$default(BleCache.INSTANCE, BleKey.POWER, 0, null, 6, null));
        BleConnector r5 = BleConnector.INSTANCE;
        if (r5.isAvailable() == false) goto L30;
        View r6 = this.powerPanel;
        if (r6 != null) goto L20;
        Intrinsics.XXO("powerPanel");
        r6 = null;
    L20:
        r6.setVisibility(0);
        TextView r7 = this.tvState;
        if (r7 != null) goto L23;
        Intrinsics.XXO("tvState");
        r7 = null;
    L23:
        r7.setText(R.string.device_connectied);
        ImageView r8 = this.ivConnection;
        if (r8 != null) goto L26;
        Intrinsics.XXO("ivConnection");
    L27:
        r2.setEnabled(r5.isAvailable());
        return;
    L26:
        r2 = r8;
        goto L27
    L30:
        if (r5.isConnecting() == false) goto L33;
        connecting();
        return;
    L33:
        TextView r9 = this.tvState;
        if (r9 != null) goto L36;
        Intrinsics.XXO("tvState");
    L37:
        r1.setText(R.string.device_disconnected);
        return;
    L36:
        r1 = r9;
        goto L37
    }

    private final void initThirdPartyDevice() {
        String r1 = this.deviceInfo.getMBleAddress();
        com.sma.smartv3.dto.OXO1 r2 = com.sma.smartv3.dto.OXO1.I0iXXO.XIi00iiXO();
        if (r2 != null) goto L5;
        r2 = new com.sma.smartv3.dto.OXO1(this.deviceInfo.getMBleName(), this.deviceInfo.getMBleAddress(), false, 0, null, null, 0, 0, 0, 0, 0, IronSourceError.ERROR_INIT_ALREADY_FINISHED, null);
    L5:
        boolean r3 = Intrinsics.XOO0ii0(r1, r2.XiOIii1());
        View r4 = this.powerPanel;
        ImageView r5 = null;
        if (r4 != null) goto L8;
        Intrinsics.XXO("powerPanel");
        r4 = null;
    L8:
        r4.setVisibility(0);
        ImageView r6 = this.ivPower;
        if (r6 != null) goto L11;
        Intrinsics.XXO("ivPower");
        r6 = null;
    L11:
        r6.setVisibility(8);
        ImageView r7 = this.ivDevice;
        if (r7 != null) goto L14;
        Intrinsics.XXO("ivDevice");
    L15:
        r5.setImageResource(R.drawable.ear_other_device);
        if (r3 == true) goto L18;
        thirdPartyDeviceDisConnected();
        return;
    L18:
        if (r2.XX0() == false) goto L21;
        thirdPartyDeviceConnected();
        return;
    L21:
        currentThirdPartyDeviceDisConnected();
        return;
    L14:
        r5 = r7;
        goto L15
    }

    private final void thirdPartyDeviceConnected() {
        View r0 = this.btnDelete;
        ImageView r1 = null;
        if (r0 != null) goto L5;
        Intrinsics.XXO("btnDelete");
        r0 = null;
    L5:
        r0.setVisibility(8);
        getTvReconnect().setVisibility(4);
        TextView r2 = this.tvState;
        if (r2 != null) goto L8;
        Intrinsics.XXO("tvState");
        r2 = null;
    L8:
        r2.setText(R.string.device_connectied);
        ImageView r3 = this.ivConnection;
        if (r3 != null) goto L11;
        Intrinsics.XXO("ivConnection");
    L12:
        r1.setEnabled(true);
        return;
    L11:
        r1 = r3;
        goto L12
    }

    private final void thirdPartyDeviceDisConnected() {
        TextView r0 = this.tvState;
        ImageView r1 = null;
        if (r0 != null) goto L5;
        Intrinsics.XXO("tvState");
        r0 = null;
    L5:
        r0.setText(R.string.device_disconnected);
        getTvReconnect().setVisibility(0);
        View r2 = this.btnDelete;
        if (r2 != null) goto L8;
        Intrinsics.XXO("btnDelete");
        r2 = null;
    L8:
        r2.setVisibility(0);
        ImageView r3 = this.ivConnection;
        if (r3 != null) goto L11;
        Intrinsics.XXO("ivConnection");
    L12:
        r1.setEnabled(false);
        return;
    L11:
        r1 = r3;
        goto L12
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder r4) {
        Intrinsics.X0O(r4, "itemHolder");
        Context r0 = r4.getContext();
        Intrinsics.O10IXXX0X(r0, "<get-context>(...)");
        this.mContext = r0;
        View r1 = r4.v(R.id.multi_device_item_info_layout);
        Intrinsics.XXI(r1);
        this.rlLayout = (RelativeLayout) r1;
        View r2 = r4.v(R.id.iv_device);
        Intrinsics.XXI(r2);
        this.ivDevice = (ImageView) r2;
        View r3 = r4.v(R.id.tv_name);
        Intrinsics.XXI(r3);
        this.tvName = (TextView) r3;
        TextView r5 = r4.tv(R.id.tv_mac);
        Intrinsics.XXI(r5);
        this.tvMac = r5;
        TextView r6 = r4.tv(R.id.tv_state);
        Intrinsics.XXI(r6);
        this.tvState = r6;
        View r7 = r4.v(R.id.power_panel);
        Intrinsics.XXI(r7);
        this.powerPanel = r7;
        View r8 = r4.v(R.id.iv_connection);
        Intrinsics.XXI(r8);
        this.ivConnection = (ImageView) r8;
        View r9 = r4.v(R.id.iv_power);
        Intrinsics.XXI(r9);
        this.ivPower = (ImageView) r9;
        TextView r10 = r4.tv(R.id.tv_reconnect);
        Intrinsics.XXI(r10);
        setTvReconnect(r10);
        getTvReconnect().setOnClickListener(new lv0(this));
        View r11 = r4.view(R.id.btn_delete);
        Intrinsics.XXI(r11);
        this.btnDelete = r11;
        RelativeLayout r12 = null;
        if (r11 != null) goto L5;
        Intrinsics.XXO("btnDelete");
        r11 = null;
    L5:
        r11.setOnClickListener(new mv0(this));
        RelativeLayout r13 = this.rlLayout;
        if (r13 != null) goto L8;
        Intrinsics.XXO("rlLayout");
    L9:
        r12.setOnClickListener(new nv0(this));
        View r14 = r4.v(R.id.pb_connecting);
        Intrinsics.XXI(r14);
        this.pbConnecting = (ProgressBar) r14;
        return;
    L8:
        r12 = r13;
        goto L9
    }

    public final void connected() {
        View r0 = this.powerPanel;
        ImageView r1 = null;
        if (r0 != null) goto L5;
        Intrinsics.XXO("powerPanel");
        r0 = null;
    L5:
        r0.setVisibility(0);
        TextView r2 = this.tvState;
        if (r2 != null) goto L8;
        Intrinsics.XXO("tvState");
        r2 = null;
    L8:
        r2.setText(R.string.device_connectied);
        ImageView r3 = this.ivConnection;
        if (r3 != null) goto L11;
        Intrinsics.XXO("ivConnection");
    L12:
        r1.setEnabled(BleConnector.INSTANCE.isAvailable());
        return;
    L11:
        r1 = r3;
        goto L12
    }

    public final void connecting() {
        TextView r0 = this.tvState;
        ProgressBar r1 = null;
        if (r0 != null) goto L5;
        Intrinsics.XXO("tvState");
        r0 = null;
    L5:
        r0.setText(R.string.device_connecting);
        ProgressBar r2 = this.pbConnecting;
        if (r2 != null) goto L8;
        Intrinsics.XXO("pbConnecting");
    L9:
        r1.setVisibility(0);
        getTvReconnect().setVisibility(8);
        return;
    L8:
        r1 = r2;
        goto L9
    }

    public final void disconnect() {
        TextView r0 = this.tvState;
        View r1 = null;
        if (r0 != null) goto L5;
        Intrinsics.XXO("tvState");
        r0 = null;
    L5:
        r0.setText(R.string.device_disconnected);
        getTvReconnect().setVisibility(0);
        View r2 = this.btnDelete;
        if (r2 != null) goto L8;
        Intrinsics.XXO("btnDelete");
    L9:
        r1.setVisibility(0);
        return;
    L8:
        r1 = r2;
        goto L9
    }

    @aa1
    public final BleDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public boolean getInitEvent() {
        return this.initEvent;
    }

    @aa1
    public final TextView getTvReconnect() {
        TextView r0 = this.tvReconnect;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("tvReconnect");
        return null;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        TextView r0 = this.tvName;
        View r1 = null;
        if (r0 != null) goto L5;
        Intrinsics.XXO("tvName");
        r0 = null;
    L5:
        r0.setText(this.deviceInfo.getMBleName());
        TextView r2 = this.tvMac;
        if (r2 != null) goto L8;
        Intrinsics.XXO("tvMac");
        r2 = null;
    L8:
        r2.setText(this.deviceInfo.getMBleAddress());
        ProgressBar r3 = this.pbConnecting;
        if (r3 != null) goto L11;
        Intrinsics.XXO("pbConnecting");
        r3 = null;
    L11:
        r3.setVisibility(8);
        View r4 = this.powerPanel;
        if (r4 != null) goto L14;
        Intrinsics.XXO("powerPanel");
    L15:
        r1.setVisibility(4);
        initDevice();
        onPairImageChange(new Object());
        return;
    L14:
        r1 = r4;
        goto L15
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.multi_device_item_info;
    }

    @sf5(tag = I01XX0.XXX11i)
    public final void onPairImageChange(@aa1 Object r6) {
        Intrinsics.X0O(r6, "data");
        LogUtils.d(new Object[]{"onPairImageChange"});
        ImageView r1 = null;
        if (this.deviceInfo.getMFirmwareFlag().length() != 0) goto L10;
        ImageView r7 = this.ivDevice;
        if (r7 != null) goto L7;
        Intrinsics.XXO("ivDevice");
    L8:
        r1.setImageResource(R.drawable.ear_other_device);
        return;
    L7:
        r1 = r7;
        goto L8
    L10:
        q62 r8 = q62.OXO1;
        if (r8.IOI(this.deviceInfo) == false) goto L19;
        ImageView r2 = this.ivDevice;
        if (r2 != null) goto L15;
        Intrinsics.XXO("ivDevice");
        r2 = null;
    L15:
        Context r4 = this.mContext;
        if (r4 != null) goto L18;
        Intrinsics.XXO("mContext");
        r4 = null;
    L18:
        r2.setImageDrawable(r4.getDrawable(((Number) q62.XOOXII(r8, null, 1, null).getFirst()).intValue()));
    L26:
        File r9 = uz0.X00Xi1X(sz0.OXO1, this.deviceInfo);
        if (FileUtils.isFileExists(r9) == false) goto L34;
        ImageView r3 = this.ivDevice;
        if (r3 != null) goto L31;
        Intrinsics.XXO("ivDevice");
    L32:
        r1.setImageBitmap(ImageUtils.getBitmap(r9));
        return;
    L31:
        r1 = r3;
        goto L32
    L34:
        return;
    L19:
        ImageView r5 = this.ivDevice;
        if (r5 != null) goto L22;
        Intrinsics.XXO("ivDevice");
        r5 = null;
    L22:
        Context r10 = this.mContext;
        if (r10 != null) goto L25;
        Intrinsics.XXO("mContext");
        r10 = null;
    L25:
        r5.setImageDrawable(r10.getDrawable(r8.iX(this.deviceInfo)));
        goto L26
    }

    public final void setOnClickListener(@aa1 OXO1 r2) {
        Intrinsics.X0O(r2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.mOnClickListener = r2;
    }

    public final void setTvReconnect(@aa1 TextView r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.tvReconnect = r2;
    }
}
