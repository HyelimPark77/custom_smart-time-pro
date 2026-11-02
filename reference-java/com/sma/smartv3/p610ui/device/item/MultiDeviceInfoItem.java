package com.sma.smartv3.p610ui.device.item;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
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
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.sma.smartv3.p610ui.device.item.MultiDeviceInfoItem;
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
        void onClick(@aa1 View view);
    }

    public MultiDeviceInfoItem(@aa1 BleDeviceInfo deviceInfo) {
        Intrinsics.X0O(deviceInfo, "deviceInfo");
        this.deviceInfo = deviceInfo;
        this.initEvent = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$0(MultiDeviceInfoItem multiDeviceInfoItem, View view) {
        OXO1 oxo1 = multiDeviceInfoItem.mOnClickListener;
        if (oxo1 != null) {
            Intrinsics.XXI(view);
            oxo1.onClick(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$1(MultiDeviceInfoItem multiDeviceInfoItem, View view) {
        OXO1 oxo1 = multiDeviceInfoItem.mOnClickListener;
        if (oxo1 != null) {
            Intrinsics.XXI(view);
            oxo1.onClick(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$2(MultiDeviceInfoItem multiDeviceInfoItem, View view) {
        OXO1 oxo1 = multiDeviceInfoItem.mOnClickListener;
        if (oxo1 != null) {
            Intrinsics.XXI(view);
            oxo1.onClick(view);
        }
    }

    private final void currentThirdPartyDeviceDisConnected() {
        ImageView imageView = this.ivConnection;
        View view = null;
        if (imageView == null) {
            Intrinsics.XXO("ivConnection");
            imageView = null;
        }
        imageView.setEnabled(false);
        TextView textView = this.tvState;
        if (textView == null) {
            Intrinsics.XXO("tvState");
            textView = null;
        }
        textView.setText(R.string.device_disconnected);
        View view2 = this.btnDelete;
        if (view2 == null) {
            Intrinsics.XXO("btnDelete");
        } else {
            view = view2;
        }
        view.setVisibility(8);
        getTvReconnect().setVisibility(0);
    }

    private final void initDevice() {
        boolean z = this.deviceInfo.getMFirmwareFlag().length() > 0;
        i1O0OXO1O.OXO1.OXO1("initDevice deviceInfo = " + this.deviceInfo + "  isSelfDevice:" + z);
        if (z) {
            initSelfDevice();
        } else {
            initThirdPartyDevice();
        }
    }

    private final void initSelfDevice() {
        if (!ov0.OXO1.I0iXXO(this.deviceInfo.getMBleAddress()) || com.sma.smartv3.dto.OXO1.I0iXXO.XOO0ii0()) {
            disconnect();
            return;
        }
        getTvReconnect().setVisibility(4);
        View view = this.btnDelete;
        TextView textView = null;
        ImageView imageView = null;
        if (view == null) {
            Intrinsics.XXO("btnDelete");
            view = null;
        }
        view.setVisibility(8);
        ImageView imageView2 = this.ivConnection;
        if (imageView2 == null) {
            Intrinsics.XXO("ivConnection");
            imageView2 = null;
        }
        imageView2.setEnabled(false);
        ImageView imageView3 = this.ivPower;
        if (imageView3 == null) {
            Intrinsics.XXO("ivPower");
            imageView3 = null;
        }
        imageView3.setImageLevel(BaseBleCache.getInt$default(BleCache.INSTANCE, BleKey.POWER, 0, null, 6, null));
        BleConnector bleConnector = BleConnector.INSTANCE;
        if (!bleConnector.isAvailable()) {
            if (bleConnector.isConnecting()) {
                connecting();
                return;
            }
            TextView textView2 = this.tvState;
            if (textView2 == null) {
                Intrinsics.XXO("tvState");
            } else {
                textView = textView2;
            }
            textView.setText(R.string.device_disconnected);
            return;
        }
        View view2 = this.powerPanel;
        if (view2 == null) {
            Intrinsics.XXO("powerPanel");
            view2 = null;
        }
        view2.setVisibility(0);
        TextView textView3 = this.tvState;
        if (textView3 == null) {
            Intrinsics.XXO("tvState");
            textView3 = null;
        }
        textView3.setText(R.string.device_connectied);
        ImageView imageView4 = this.ivConnection;
        if (imageView4 == null) {
            Intrinsics.XXO("ivConnection");
        } else {
            imageView = imageView4;
        }
        imageView.setEnabled(bleConnector.isAvailable());
    }

    private final void initThirdPartyDevice() {
        String mBleAddress = this.deviceInfo.getMBleAddress();
        com.sma.smartv3.dto.OXO1 oxo1XIi00iiXO = com.sma.smartv3.dto.OXO1.I0iXXO.XIi00iiXO();
        if (oxo1XIi00iiXO == null) {
            oxo1XIi00iiXO = new com.sma.smartv3.dto.OXO1(this.deviceInfo.getMBleName(), this.deviceInfo.getMBleAddress(), false, 0, null, null, 0, 0, 0, 0, 0, IronSourceError.ERROR_INIT_ALREADY_FINISHED, null);
        }
        boolean zXOO0ii0 = Intrinsics.XOO0ii0(mBleAddress, oxo1XIi00iiXO.XiOIii1());
        View view = this.powerPanel;
        ImageView imageView = null;
        if (view == null) {
            Intrinsics.XXO("powerPanel");
            view = null;
        }
        view.setVisibility(0);
        ImageView imageView2 = this.ivPower;
        if (imageView2 == null) {
            Intrinsics.XXO("ivPower");
            imageView2 = null;
        }
        imageView2.setVisibility(8);
        ImageView imageView3 = this.ivDevice;
        if (imageView3 == null) {
            Intrinsics.XXO("ivDevice");
        } else {
            imageView = imageView3;
        }
        imageView.setImageResource(R.drawable.ear_other_device);
        if (!zXOO0ii0) {
            thirdPartyDeviceDisConnected();
        } else if (oxo1XIi00iiXO.XX0()) {
            thirdPartyDeviceConnected();
        } else {
            currentThirdPartyDeviceDisConnected();
        }
    }

    private final void thirdPartyDeviceConnected() {
        View view = this.btnDelete;
        ImageView imageView = null;
        if (view == null) {
            Intrinsics.XXO("btnDelete");
            view = null;
        }
        view.setVisibility(8);
        getTvReconnect().setVisibility(4);
        TextView textView = this.tvState;
        if (textView == null) {
            Intrinsics.XXO("tvState");
            textView = null;
        }
        textView.setText(R.string.device_connectied);
        ImageView imageView2 = this.ivConnection;
        if (imageView2 == null) {
            Intrinsics.XXO("ivConnection");
        } else {
            imageView = imageView2;
        }
        imageView.setEnabled(true);
    }

    private final void thirdPartyDeviceDisConnected() {
        TextView textView = this.tvState;
        ImageView imageView = null;
        if (textView == null) {
            Intrinsics.XXO("tvState");
            textView = null;
        }
        textView.setText(R.string.device_disconnected);
        getTvReconnect().setVisibility(0);
        View view = this.btnDelete;
        if (view == null) {
            Intrinsics.XXO("btnDelete");
            view = null;
        }
        view.setVisibility(0);
        ImageView imageView2 = this.ivConnection;
        if (imageView2 == null) {
            Intrinsics.XXO("ivConnection");
        } else {
            imageView = imageView2;
        }
        imageView.setEnabled(false);
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder itemHolder) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        Context context = itemHolder.getContext();
        Intrinsics.O10IXXX0X(context, "<get-context>(...)");
        this.mContext = context;
        View viewM3483v = itemHolder.m3483v(R.id.multi_device_item_info_layout);
        Intrinsics.XXI(viewM3483v);
        this.rlLayout = (RelativeLayout) viewM3483v;
        View viewM3483v2 = itemHolder.m3483v(R.id.iv_device);
        Intrinsics.XXI(viewM3483v2);
        this.ivDevice = (ImageView) viewM3483v2;
        View viewM3483v3 = itemHolder.m3483v(R.id.tv_name);
        Intrinsics.XXI(viewM3483v3);
        this.tvName = (TextView) viewM3483v3;
        TextView textViewM3482tv = itemHolder.m3482tv(R.id.tv_mac);
        Intrinsics.XXI(textViewM3482tv);
        this.tvMac = textViewM3482tv;
        TextView textViewM3482tv2 = itemHolder.m3482tv(R.id.tv_state);
        Intrinsics.XXI(textViewM3482tv2);
        this.tvState = textViewM3482tv2;
        View viewM3483v4 = itemHolder.m3483v(R.id.power_panel);
        Intrinsics.XXI(viewM3483v4);
        this.powerPanel = viewM3483v4;
        View viewM3483v5 = itemHolder.m3483v(R.id.iv_connection);
        Intrinsics.XXI(viewM3483v5);
        this.ivConnection = (ImageView) viewM3483v5;
        View viewM3483v6 = itemHolder.m3483v(R.id.iv_power);
        Intrinsics.XXI(viewM3483v6);
        this.ivPower = (ImageView) viewM3483v6;
        TextView textViewM3482tv3 = itemHolder.m3482tv(R.id.tv_reconnect);
        Intrinsics.XXI(textViewM3482tv3);
        setTvReconnect(textViewM3482tv3);
        getTvReconnect().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.lv0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MultiDeviceInfoItem.bindView$lambda$0(this.f9527IO, view);
            }
        });
        View view = itemHolder.view(R.id.btn_delete);
        Intrinsics.XXI(view);
        this.btnDelete = view;
        RelativeLayout relativeLayout = null;
        if (view == null) {
            Intrinsics.XXO("btnDelete");
            view = null;
        }
        view.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.mv0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                MultiDeviceInfoItem.bindView$lambda$1(this.f9794IO, view2);
            }
        });
        RelativeLayout relativeLayout2 = this.rlLayout;
        if (relativeLayout2 == null) {
            Intrinsics.XXO("rlLayout");
        } else {
            relativeLayout = relativeLayout2;
        }
        relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.nv0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                MultiDeviceInfoItem.bindView$lambda$2(this.f10018IO, view2);
            }
        });
        View viewM3483v7 = itemHolder.m3483v(R.id.pb_connecting);
        Intrinsics.XXI(viewM3483v7);
        this.pbConnecting = (ProgressBar) viewM3483v7;
    }

    public final void connected() {
        View view = this.powerPanel;
        ImageView imageView = null;
        if (view == null) {
            Intrinsics.XXO("powerPanel");
            view = null;
        }
        view.setVisibility(0);
        TextView textView = this.tvState;
        if (textView == null) {
            Intrinsics.XXO("tvState");
            textView = null;
        }
        textView.setText(R.string.device_connectied);
        ImageView imageView2 = this.ivConnection;
        if (imageView2 == null) {
            Intrinsics.XXO("ivConnection");
        } else {
            imageView = imageView2;
        }
        imageView.setEnabled(BleConnector.INSTANCE.isAvailable());
    }

    public final void connecting() {
        TextView textView = this.tvState;
        ProgressBar progressBar = null;
        if (textView == null) {
            Intrinsics.XXO("tvState");
            textView = null;
        }
        textView.setText(R.string.device_connecting);
        ProgressBar progressBar2 = this.pbConnecting;
        if (progressBar2 == null) {
            Intrinsics.XXO("pbConnecting");
        } else {
            progressBar = progressBar2;
        }
        progressBar.setVisibility(0);
        getTvReconnect().setVisibility(8);
    }

    public final void disconnect() {
        TextView textView = this.tvState;
        View view = null;
        if (textView == null) {
            Intrinsics.XXO("tvState");
            textView = null;
        }
        textView.setText(R.string.device_disconnected);
        getTvReconnect().setVisibility(0);
        View view2 = this.btnDelete;
        if (view2 == null) {
            Intrinsics.XXO("btnDelete");
        } else {
            view = view2;
        }
        view.setVisibility(0);
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
        TextView textView = this.tvReconnect;
        if (textView != null) {
            return textView;
        }
        Intrinsics.XXO("tvReconnect");
        return null;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        TextView textView = this.tvName;
        View view = null;
        if (textView == null) {
            Intrinsics.XXO("tvName");
            textView = null;
        }
        textView.setText(this.deviceInfo.getMBleName());
        TextView textView2 = this.tvMac;
        if (textView2 == null) {
            Intrinsics.XXO("tvMac");
            textView2 = null;
        }
        textView2.setText(this.deviceInfo.getMBleAddress());
        ProgressBar progressBar = this.pbConnecting;
        if (progressBar == null) {
            Intrinsics.XXO("pbConnecting");
            progressBar = null;
        }
        progressBar.setVisibility(8);
        View view2 = this.powerPanel;
        if (view2 == null) {
            Intrinsics.XXO("powerPanel");
        } else {
            view = view2;
        }
        view.setVisibility(4);
        initDevice();
        onPairImageChange(new Object());
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.multi_device_item_info;
    }

    @sf5(tag = I01XX0.XXX11i)
    public final void onPairImageChange(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        LogUtils.m11128d("onPairImageChange");
        ImageView imageView = null;
        if (this.deviceInfo.getMFirmwareFlag().length() == 0) {
            ImageView imageView2 = this.ivDevice;
            if (imageView2 == null) {
                Intrinsics.XXO("ivDevice");
            } else {
                imageView = imageView2;
            }
            imageView.setImageResource(R.drawable.ear_other_device);
            return;
        }
        q62 q62Var = q62.OXO1;
        if (q62Var.IOI(this.deviceInfo)) {
            ImageView imageView3 = this.ivDevice;
            if (imageView3 == null) {
                Intrinsics.XXO("ivDevice");
                imageView3 = null;
            }
            Context context = this.mContext;
            if (context == null) {
                Intrinsics.XXO("mContext");
                context = null;
            }
            imageView3.setImageDrawable(context.getDrawable(((Number) q62.XOOXII(q62Var, null, 1, null).getFirst()).intValue()));
        } else {
            ImageView imageView4 = this.ivDevice;
            if (imageView4 == null) {
                Intrinsics.XXO("ivDevice");
                imageView4 = null;
            }
            Context context2 = this.mContext;
            if (context2 == null) {
                Intrinsics.XXO("mContext");
                context2 = null;
            }
            imageView4.setImageDrawable(context2.getDrawable(q62Var.m2893iX(this.deviceInfo)));
        }
        File fileX00Xi1X = uz0.X00Xi1X(sz0.OXO1, this.deviceInfo);
        if (FileUtils.isFileExists(fileX00Xi1X)) {
            ImageView imageView5 = this.ivDevice;
            if (imageView5 == null) {
                Intrinsics.XXO("ivDevice");
            } else {
                imageView = imageView5;
            }
            imageView.setImageBitmap(ImageUtils.getBitmap(fileX00Xi1X));
        }
    }

    public final void setOnClickListener(@aa1 OXO1 listener) {
        Intrinsics.X0O(listener, "listener");
        this.mOnClickListener = listener;
    }

    public final void setTvReconnect(@aa1 TextView textView) {
        Intrinsics.X0O(textView, "<set-?>");
        this.tvReconnect = textView;
    }
}
