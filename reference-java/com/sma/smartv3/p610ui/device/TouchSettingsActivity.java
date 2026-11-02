package com.sma.smartv3.p610ui.device;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.core.view.ViewGroupKt;
import com.android.mltcode.paycertificationapi.C3006uq;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.I0iIi;
import com.android.mltcode.paycertificationapi.OiOX0i;
import com.android.mltcode.paycertificationapi.X0IOiX1O;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.aj4;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.gj4;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i22;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.sma.smartv3.p610ui.device.TouchSettingsActivity;
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
@SourceDebugExtension({"SMAP\nTouchSettingsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TouchSettingsActivity.kt\ncom/sma/smartv3/ui/device/TouchSettingsActivity\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,410:1\n1332#2,3:411\n69#3,3:414\n72#3,5:418\n1#4:417\n*S KotlinDebug\n*F\n+ 1 TouchSettingsActivity.kt\ncom/sma/smartv3/ui/device/TouchSettingsActivity\n*L\n221#1:411,3\n140#1:414,3\n140#1:418,5\n140#1:417\n*E\n"})
public final class TouchSettingsActivity extends BaseActivity {

    @tb1
    private go0 mFailPopup;

    @tb1
    private C3006uq mLoadingPopup;

    @tb1
    private go0 mTouchICPopup;

    @aa1
    private final Lazy itemHeader$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ox5
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return TouchSettingsActivity.itemHeader_delegate$lambda$0(this.f10244IO);
        }
    });

    @aa1
    private final Lazy containerPanel$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.px5
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return TouchSettingsActivity.containerPanel_delegate$lambda$0(this.f10456IO);
        }
    });

    @aa1
    private final Lazy itemHeaderMusic$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.qx5
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return TouchSettingsActivity.itemHeaderMusic_delegate$lambda$0(this.f10702IO);
        }
    });

    @aa1
    private final Lazy itemHeaderPhoto$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.rx5
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return TouchSettingsActivity.itemHeaderPhoto_delegate$lambda$0(this.f10925IO);
        }
    });

    @aa1
    private final Lazy itemHeaderSlide$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.sx5
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return TouchSettingsActivity.itemHeaderSlide_delegate$lambda$0(this.f11154IO);
        }
    });

    @aa1
    private final Lazy itemHeaderCustom$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.sw5
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return TouchSettingsActivity.itemHeaderCustom_delegate$lambda$0(this.f11146IO);
        }
    });

    @aa1
    private final Lazy itemHeaderTouchRepair$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.tw5
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return TouchSettingsActivity.itemHeaderTouchRepair_delegate$lambda$0(this.f11376IO);
        }
    });

    @aa1
    private final Lazy itemSingle$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.uw5
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return TouchSettingsActivity.itemSingle_delegate$lambda$0(this.f11587IO);
        }
    });

    @aa1
    private final Lazy itemDouble$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.vw5
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return TouchSettingsActivity.itemDouble_delegate$lambda$0(this.f11827IO);
        }
    });

    @aa1
    private final Lazy itemLong$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ww5
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return TouchSettingsActivity.itemLong_delegate$lambda$0(this.f12052IO);
        }
    });

    @aa1
    private final List<aj4> mSingleChoiceItems = getSingleChoiceItems();

    @aa1
    private final BleTouchSettings mSettings = (BleTouchSettings) BaseBleCache.getObjectNotNull$default(BleCache.INSTANCE, BleKey.TOUCH_SET, BleTouchSettings.class, null, null, 12, null);

    @aa1
    private TouchSettingsActivity$mBluetoothReceiver$1 mBluetoothReceiver = new BroadcastReceiver() { // from class: com.sma.smartv3.ui.device.TouchSettingsActivity$mBluetoothReceiver$1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action;
            C3006uq c3006uq;
            if (intent == null || (action = intent.getAction()) == null) {
                return;
            }
            TouchSettingsActivity touchSettingsActivity = this.OXO1;
            i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
            i1o0oxo1o.OXO1("BluetoothReceiver onReceive intent -> " + intent);
            if (!Intrinsics.XOO0ii0(action, "android.bluetooth.device.action.BOND_STATE_CHANGED")) {
                if (!Intrinsics.XOO0ii0(action, "android.bluetooth.device.action.ACL_DISCONNECTED") || (c3006uq = touchSettingsActivity.mLoadingPopup) == null) {
                    return;
                }
                c3006uq.dismiss();
                return;
            }
            BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            if (bluetoothDevice != null && Intrinsics.XOO0ii0(bluetoothDevice.getAddress(), BleCache.INSTANCE.getMBleAddress())) {
                int bondState = bluetoothDevice.getBondState();
                i1o0oxo1o.OXO1("BluetoothReceiver onReceive ACTION_BOND_STATE_CHANGED -> device = " + bluetoothDevice + ", bondState = " + bondState);
                if (bondState == 10) {
                    C3006uq c3006uq2 = touchSettingsActivity.mLoadingPopup;
                    if (c3006uq2 != null) {
                        c3006uq2.dismiss();
                    }
                    touchSettingsActivity.mSettings.setMEnabled(0);
                    BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.TOUCH_SET, BleKeyFlag.UPDATE, touchSettingsActivity.mSettings, false, false, 24, null);
                    touchSettingsActivity.showConnectFailPopup();
                    touchSettingsActivity.updateUI();
                    return;
                }
                if (bondState != 12) {
                    return;
                }
                C3006uq c3006uq3 = touchSettingsActivity.mLoadingPopup;
                if (c3006uq3 != null) {
                    c3006uq3.dismiss();
                }
                touchSettingsActivity.mSettings.setMEnabled(1);
                BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.TOUCH_SET, BleKeyFlag.UPDATE, touchSettingsActivity.mSettings, false, false, 24, null);
                touchSettingsActivity.updateUI();
            }
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final SettingsPanel containerPanel_delegate$lambda$0(TouchSettingsActivity touchSettingsActivity) {
        return (SettingsPanel) touchSettingsActivity.findViewById(R.id.item_container);
    }

    private final SettingsPanel getContainerPanel() {
        return (SettingsPanel) this.containerPanel$delegate.getValue();
    }

    private final AbhSettingsItem getItemDouble() {
        return (AbhSettingsItem) this.itemDouble$delegate.getValue();
    }

    private final AbhSettingsHeader getItemHeader() {
        return (AbhSettingsHeader) this.itemHeader$delegate.getValue();
    }

    private final AbhSettingsHeader getItemHeaderCustom() {
        return (AbhSettingsHeader) this.itemHeaderCustom$delegate.getValue();
    }

    private final AbhSettingsHeader getItemHeaderMusic() {
        return (AbhSettingsHeader) this.itemHeaderMusic$delegate.getValue();
    }

    private final AbhSettingsHeader getItemHeaderPhoto() {
        return (AbhSettingsHeader) this.itemHeaderPhoto$delegate.getValue();
    }

    private final AbhSettingsHeader getItemHeaderSlide() {
        return (AbhSettingsHeader) this.itemHeaderSlide$delegate.getValue();
    }

    private final AbhSettingsHeader getItemHeaderTouchRepair() {
        return (AbhSettingsHeader) this.itemHeaderTouchRepair$delegate.getValue();
    }

    private final AbhSettingsItem getItemLong() {
        return (AbhSettingsItem) this.itemLong$delegate.getValue();
    }

    private final AbhSettingsItem getItemSingle() {
        return (AbhSettingsItem) this.itemSingle$delegate.getValue();
    }

    private final List<aj4> getSingleChoiceItems() {
        return CollectionsKt__CollectionsKt.iXiX011(new aj4(R.string.touch_screen_none, 0), new aj4(R.string.touch_screen_double, R.string.touch_screen_double_tip), new aj4(R.string.touch_screen_swipe_up, R.string.touch_screen_swipe_up_tip), new aj4(R.string.touch_screen_swipe_down, R.string.touch_screen_swipe_down_tip), new aj4(R.string.touch_screen_swipe_left, R.string.touch_screen_swipe_left_tip), new aj4(R.string.touch_screen_swipe_right, R.string.touch_screen_swipe_right_tip), new aj4(R.string.touch_screen_swipe_back, R.string.touch_screen_exit_application_tip), new aj4(R.string.touch_screen_vol_inc, R.string.touch_screen_vol_increase_tip), new aj4(R.string.touch_screen_vol_dec, R.string.touch_screen_vol_down_tip), new aj4(R.string.touch_screen_music_prev, R.string.touch_screen_play_pre_tip), new aj4(R.string.touch_screen_music_next, R.string.touch_screen_play_next_tip), new aj4(R.string.touch_screen_music_play_pause, R.string.touch_screen_play_pause_and_stop_tip));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0$0(TouchSettingsActivity touchSettingsActivity, View view) {
        touchSettingsActivity.startActivity(new Intent(touchSettingsActivity, (Class<?>) TouchRepairActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbhSettingsItem itemDouble_delegate$lambda$0(TouchSettingsActivity touchSettingsActivity) {
        return (AbhSettingsItem) touchSettingsActivity.findViewById(R.id.item_double);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbhSettingsHeader itemHeaderCustom_delegate$lambda$0(TouchSettingsActivity touchSettingsActivity) {
        return (AbhSettingsHeader) touchSettingsActivity.findViewById(R.id.item_header_custom);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbhSettingsHeader itemHeaderMusic_delegate$lambda$0(TouchSettingsActivity touchSettingsActivity) {
        return (AbhSettingsHeader) touchSettingsActivity.findViewById(R.id.item_header_music);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbhSettingsHeader itemHeaderPhoto_delegate$lambda$0(TouchSettingsActivity touchSettingsActivity) {
        return (AbhSettingsHeader) touchSettingsActivity.findViewById(R.id.item_header_photo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbhSettingsHeader itemHeaderSlide_delegate$lambda$0(TouchSettingsActivity touchSettingsActivity) {
        return (AbhSettingsHeader) touchSettingsActivity.findViewById(R.id.item_header_slide);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbhSettingsHeader itemHeaderTouchRepair_delegate$lambda$0(TouchSettingsActivity touchSettingsActivity) {
        return (AbhSettingsHeader) touchSettingsActivity.findViewById(R.id.item_header_touch_repair);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbhSettingsHeader itemHeader_delegate$lambda$0(TouchSettingsActivity touchSettingsActivity) {
        return (AbhSettingsHeader) touchSettingsActivity.findViewById(R.id.item_header);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbhSettingsItem itemLong_delegate$lambda$0(TouchSettingsActivity touchSettingsActivity) {
        return (AbhSettingsItem) touchSettingsActivity.findViewById(R.id.item_long);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbhSettingsItem itemSingle_delegate$lambda$0(TouchSettingsActivity touchSettingsActivity) {
        return (AbhSettingsItem) touchSettingsActivity.findViewById(R.id.item_single);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onShowKeysPopup$lambda$0$0(final View view, final TouchSettingsActivity touchSettingsActivity, final int i) {
        return X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.mx5
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TouchSettingsActivity.onShowKeysPopup$lambda$0$0$0(view, touchSettingsActivity, i, (BleConnector) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onShowKeysPopup$lambda$0$0$0(View view, TouchSettingsActivity touchSettingsActivity, int i, BleConnector it) {
        Intrinsics.X0O(it, "it");
        int id = view.getId();
        if (id == R.id.item_double) {
            touchSettingsActivity.mSettings.setMCustomDouble(i);
        } else if (id == R.id.item_long) {
            touchSettingsActivity.mSettings.setMCustomLong(i);
        } else if (id == R.id.item_single) {
            touchSettingsActivity.mSettings.setMCustomSingle(i);
        }
        BaseBleConnector.sendObject$default(it, BleKey.TOUCH_SET, BleKeyFlag.UPDATE, touchSettingsActivity.mSettings, false, false, 24, null);
        touchSettingsActivity.updateUI();
        return Unit.OXO1;
    }

    private final void setHeader() {
        AbhSettingsHeader itemHeader = getItemHeader();
        itemHeader.setChecked(OiOX0i.XIi00iiXO(this.mSettings.getMEnabled()));
        itemHeader.setMListener(new Function1() { // from class: com.android.mltcode.paycertificationapi.lx5
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TouchSettingsActivity.setHeader$lambda$0$0(this.f9561IO, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setHeader$lambda$0$0(final TouchSettingsActivity touchSettingsActivity, final boolean z) {
        if (z) {
            touchSettingsActivity.showTouchICPopup(new Function1() { // from class: com.android.mltcode.paycertificationapi.ax5
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return TouchSettingsActivity.setHeader$lambda$0$0$0(this.f5604IO, z, ((Boolean) obj).booleanValue());
                }
            });
        } else {
            touchSettingsActivity.setHeaderChecked(z);
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setHeader$lambda$0$0$0(TouchSettingsActivity touchSettingsActivity, boolean z, boolean z2) {
        if (z2) {
            touchSettingsActivity.setHeaderChecked(z);
        } else {
            touchSettingsActivity.getItemHeader().setChecked(false);
        }
        return Unit.OXO1;
    }

    private final void setHeaderChecked(final boolean z) {
        if (X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.nx5
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TouchSettingsActivity.setHeaderChecked$lambda$0(z, this, (BleConnector) obj);
            }
        }, 1, null)) {
            return;
        }
        getItemHeader().setChecked(!z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setHeaderChecked$lambda$0(boolean z, TouchSettingsActivity touchSettingsActivity, BleConnector it) {
        Intrinsics.X0O(it, "it");
        if (!z) {
            touchSettingsActivity.mSettings.setMEnabled(0);
            BaseBleConnector.sendObject$default(it, BleKey.TOUCH_SET, BleKeyFlag.UPDATE, touchSettingsActivity.mSettings, false, false, 24, null);
            i22.m2035iO(0, 1, null);
            touchSettingsActivity.updateUI();
        } else if (BleConnector.INSTANCE.isBoundHID()) {
            touchSettingsActivity.mSettings.setMEnabled(1);
            BaseBleConnector.sendObject$default(it, BleKey.TOUCH_SET, BleKeyFlag.UPDATE, touchSettingsActivity.mSettings, false, false, 24, null);
            touchSettingsActivity.updateUI();
            i22.O00(touchSettingsActivity.getMContext(), 0, 2, null);
        } else {
            touchSettingsActivity.getItemHeader().setChecked(false);
            touchSettingsActivity.tryConnectHID();
            i22.m2035iO(0, 1, null);
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showConnectFailPopup() {
        go0 go0Var;
        if (this.mFailPopup == null) {
            final go0 go0Var2 = new go0(this, 0, 2, null);
            go0Var2.O1O(R.string.hid_connect_fail);
            go0Var2.iX1O1(Integer.valueOf(R.string.cancel), new Function0() { // from class: com.android.mltcode.paycertificationapi.gx5
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(TouchSettingsActivity.showConnectFailPopup$lambda$0$0());
                }
            });
            go0Var2.X1IX(R.string.confirm, new Function0() { // from class: com.android.mltcode.paycertificationapi.hx5
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(TouchSettingsActivity.showConnectFailPopup$lambda$0$1(go0Var2, this));
                }
            });
            this.mFailPopup = go0Var2;
        }
        go0 go0Var3 = this.mFailPopup;
        if ((go0Var3 == null || !go0Var3.isShowing()) && (go0Var = this.mFailPopup) != null) {
            go0Var.IIX1OXO();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showConnectFailPopup$lambda$0$0() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showConnectFailPopup$lambda$0$1(go0 go0Var, TouchSettingsActivity touchSettingsActivity) {
        go0Var.dismiss();
        touchSettingsActivity.tryConnectHID();
        return true;
    }

    private final void showTouchICPopup(final Function1<? super Boolean, Unit> function1) {
        go0 go0Var;
        if (this.mTouchICPopup == null) {
            go0 go0Var2 = new go0(this, 0, 2, null);
            go0Var2.O1O(R.string.experimental_functional_tips);
            go0Var2.m1865iX(Integer.valueOf(R.string.experimental_functional_tips_content));
            go0Var2.iX1O1(Integer.valueOf(R.string.shut_down_function), new Function0() { // from class: com.android.mltcode.paycertificationapi.rw5
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(TouchSettingsActivity.showTouchICPopup$lambda$0$0(function1));
                }
            });
            go0Var2.X1IX(R.string.open_function, new Function0() { // from class: com.android.mltcode.paycertificationapi.cx5
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(TouchSettingsActivity.showTouchICPopup$lambda$0$1(function1));
                }
            });
            this.mTouchICPopup = go0Var2;
        }
        go0 go0Var3 = this.mTouchICPopup;
        if ((go0Var3 == null || !go0Var3.isShowing()) && (go0Var = this.mTouchICPopup) != null) {
            go0Var.IIX1OXO();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showTouchICPopup$lambda$0$0(Function1 function1) {
        function1.invoke2(Boolean.FALSE);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showTouchICPopup$lambda$0$1(Function1 function1) {
        function1.invoke2(Boolean.TRUE);
        return true;
    }

    private final void tryConnectHID() {
        if (this.mLoadingPopup == null) {
            C3006uq c3006uq = new C3006uq(this);
            c3006uq.X01IiOiIi(R.string.device_connecting);
            c3006uq.m3183I1(Integer.valueOf(R.string.connecting_hid_tip));
            this.mLoadingPopup = c3006uq;
        }
        C3006uq c3006uq2 = this.mLoadingPopup;
        if (c3006uq2 != null) {
            c3006uq2.IIX1OXO();
        }
        BleConnector.INSTANCE.connectHID();
    }

    private final void updateCrossAppToAiTransPage(boolean z) {
        a01.OXO1.OXO1().put(b01.i0O, z);
        I01XX0.XIi00iiXO(I01XX0.I0i0, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateUI() {
        AbhSettingsHeader itemHeaderMusic = getItemHeaderMusic();
        itemHeaderMusic.getCheckEnabled().setButtonDrawable(R.drawable.selector_radio);
        itemHeaderMusic.setChecked(this.mSettings.getMType() == 0);
        itemHeaderMusic.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.bx5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TouchSettingsActivity.updateUI$lambda$0$0(this.f5844IO, view);
            }
        });
        getItemHeaderPhoto().setVisibility(8);
        AbhSettingsHeader itemHeaderPhoto = getItemHeaderPhoto();
        itemHeaderPhoto.getCheckEnabled().setButtonDrawable(R.drawable.selector_radio);
        itemHeaderPhoto.setChecked(this.mSettings.getMType() == 1);
        itemHeaderPhoto.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.dx5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TouchSettingsActivity.updateUI$lambda$1$0(this.f6292IO, view);
            }
        });
        if (q62.OXO1.ii1I()) {
            getItemHeaderSlide().setVisibility(0);
        } else {
            getItemHeaderSlide().setVisibility(8);
        }
        final AbhSettingsHeader itemHeaderSlide = getItemHeaderSlide();
        itemHeaderSlide.getCheckEnabled().setButtonDrawable(R.drawable.selector_radio);
        itemHeaderSlide.setChecked(this.mSettings.getMType() == 2);
        itemHeaderSlide.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.ex5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TouchSettingsActivity.updateUI$lambda$2$0(this.f6513IO, itemHeaderSlide, view);
            }
        });
        AbhSettingsHeader itemHeaderCustom = getItemHeaderCustom();
        itemHeaderCustom.getCheckEnabled().setButtonDrawable(R.drawable.selector_radio);
        itemHeaderCustom.setChecked(this.mSettings.getMType() == 3);
        itemHeaderCustom.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.fx5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TouchSettingsActivity.updateUI$lambda$3$0(this.f6758IO, view);
            }
        });
        ViewParent parent = itemHeaderCustom.getParent();
        Intrinsics.X1ii(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        int i = 0;
        for (View view : ViewGroupKt.getChildren((ViewGroup) parent)) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.XOX0O0();
            }
            View view2 = view;
            if ((view2 instanceof AbhSettingsItem) && i > 0) {
                ((AbhSettingsItem) view2).setVisibility(itemHeaderCustom.m38868iO() ? 0 : 8);
            }
            i = i2;
        }
        getContainerPanel().OXO1(!OiOX0i.XIi00iiXO(this.mSettings.getMEnabled()));
        AbhSettingsItem itemSingle = getItemSingle();
        String string = getString(this.mSingleChoiceItems.get(this.mSettings.getMCustomSingle()).IiI10X());
        Intrinsics.O10IXXX0X(string, "getString(...)");
        itemSingle.setMRightText(string);
        AbhSettingsItem itemDouble = getItemDouble();
        String string2 = getString(this.mSingleChoiceItems.get(this.mSettings.getMCustomDouble()).IiI10X());
        Intrinsics.O10IXXX0X(string2, "getString(...)");
        itemDouble.setMRightText(string2);
        AbhSettingsItem itemLong = getItemLong();
        String string3 = getString(this.mSingleChoiceItems.get(this.mSettings.getMCustomLong()).IiI10X());
        Intrinsics.O10IXXX0X(string3, "getString(...)");
        itemLong.setMRightText(string3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateUI$lambda$0$0(final TouchSettingsActivity touchSettingsActivity, View view) {
        X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.ix5
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TouchSettingsActivity.updateUI$lambda$0$0$0(this.f8787IO, (BleConnector) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateUI$lambda$0$0$0(TouchSettingsActivity touchSettingsActivity, BleConnector it) {
        Intrinsics.X0O(it, "it");
        touchSettingsActivity.mSettings.setMType(0);
        BaseBleConnector.sendObject$default(it, BleKey.TOUCH_SET, BleKeyFlag.UPDATE, touchSettingsActivity.mSettings, false, false, 24, null);
        touchSettingsActivity.updateUI();
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateUI$lambda$1$0(final TouchSettingsActivity touchSettingsActivity, View view) {
        X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.jx5
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TouchSettingsActivity.updateUI$lambda$1$0$0(this.f9063IO, (BleConnector) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateUI$lambda$1$0$0(TouchSettingsActivity touchSettingsActivity, BleConnector it) {
        Intrinsics.X0O(it, "it");
        touchSettingsActivity.mSettings.setMType(1);
        BaseBleConnector.sendObject$default(it, BleKey.TOUCH_SET, BleKeyFlag.UPDATE, touchSettingsActivity.mSettings, false, false, 24, null);
        touchSettingsActivity.updateUI();
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateUI$lambda$2$0(final TouchSettingsActivity touchSettingsActivity, AbhSettingsHeader abhSettingsHeader, View view) {
        X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.zw5
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TouchSettingsActivity.updateUI$lambda$2$0$0(this.f12707IO, (BleConnector) obj);
            }
        }, 1, null);
        touchSettingsActivity.updateCrossAppToAiTransPage(abhSettingsHeader.m38868iO());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateUI$lambda$2$0$0(TouchSettingsActivity touchSettingsActivity, BleConnector it) {
        Intrinsics.X0O(it, "it");
        touchSettingsActivity.mSettings.setMType(2);
        BaseBleConnector.sendObject$default(it, BleKey.TOUCH_SET, BleKeyFlag.UPDATE, touchSettingsActivity.mSettings, false, false, 24, null);
        touchSettingsActivity.updateUI();
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateUI$lambda$3$0(final TouchSettingsActivity touchSettingsActivity, View view) {
        X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.yw5
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TouchSettingsActivity.updateUI$lambda$3$0$0(this.f12470IO, (BleConnector) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateUI$lambda$3$0$0(TouchSettingsActivity touchSettingsActivity, BleConnector it) {
        Intrinsics.X0O(it, "it");
        touchSettingsActivity.mSettings.setMType(3);
        BaseBleConnector.sendObject$default(it, BleKey.TOUCH_SET, BleKeyFlag.UPDATE, touchSettingsActivity.mSettings, false, false, 24, null);
        touchSettingsActivity.updateUI();
        return Unit.OXO1;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
        I0iIi i0iIi = I0iIi.OXO1;
        TouchSettingsActivity$mBluetoothReceiver$1 touchSettingsActivity$mBluetoothReceiver$1 = this.mBluetoothReceiver;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.bluetooth.device.action.BOND_STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
        Unit unit = Unit.OXO1;
        i0iIi.OXO1(this, touchSettingsActivity$mBluetoothReceiver$1, intentFilter, 2);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.touch_set);
        setHeader();
        updateUI();
        if (OiOX0i.XIi00iiXO(this.mSettings.getMEnabled()) && !BleConnector.INSTANCE.isBoundHID()) {
            tryConnectHID();
        }
        AbhSettingsHeader itemHeaderTouchRepair = getItemHeaderTouchRepair();
        if (!i72.OXO1.IXI() || !q62.OXO1.X0100I()) {
            itemHeaderTouchRepair.setVisibility(8);
            return;
        }
        itemHeaderTouchRepair.getCheckEnabled().setVisibility(4);
        itemHeaderTouchRepair.setChecked(true);
        itemHeaderTouchRepair.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.kx5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TouchSettingsActivity.initView$lambda$0$0(this.f9305IO, view);
            }
        });
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_touch_settings;
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.mBluetoothReceiver);
    }

    public final void onShowKeysPopup(@aa1 final View view) {
        Intrinsics.X0O(view, "view");
        gj4 gj4Var = new gj4(this, this.mSingleChoiceItems, 0, 4, null);
        int id = view.getId();
        if (id == R.id.item_double) {
            gj4Var.m1858iX(R.string.touch_set_double);
            gj4Var.II1Xi0(this.mSettings.getMCustomDouble());
        } else if (id == R.id.item_long) {
            gj4Var.m1858iX(R.string.touch_set_long);
            gj4Var.II1Xi0(this.mSettings.getMCustomLong());
        } else if (id == R.id.item_single) {
            gj4Var.m1858iX(R.string.touch_set_single);
            gj4Var.II1Xi0(this.mSettings.getMCustomSingle());
        }
        gj4Var.i010I(new Function1() { // from class: com.android.mltcode.paycertificationapi.xw5
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(TouchSettingsActivity.onShowKeysPopup$lambda$0$0(view, this, ((Integer) obj).intValue()));
            }
        });
        gj4Var.IIX1OXO();
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }
}
