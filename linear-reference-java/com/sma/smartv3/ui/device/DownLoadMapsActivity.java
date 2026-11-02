package com.sma.smartv3.ui.device;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import com.android.mltcode.paycertificationapi.I001X;
import com.android.mltcode.paycertificationapi.I0100iOI;
import com.android.mltcode.paycertificationapi.I100X1;
import com.android.mltcode.paycertificationapi.I10i1;
import com.android.mltcode.paycertificationapi.IO0OI;
import com.android.mltcode.paycertificationapi.IOIO11;
import com.android.mltcode.paycertificationapi.IX111;
import com.android.mltcode.paycertificationapi.O00IXIOI1;
import com.android.mltcode.paycertificationapi.OIXX0O0iI;
import com.android.mltcode.paycertificationapi.OOiIO0;
import com.android.mltcode.paycertificationapi.OXX10;
import com.android.mltcode.paycertificationapi.OiO0X;
import com.android.mltcode.paycertificationapi.Oii1IXiXi;
import com.android.mltcode.paycertificationapi.X11ii1OOI;
import com.android.mltcode.paycertificationapi.X1X1iOI;
import com.android.mltcode.paycertificationapi.XIO1X0XX;
import com.android.mltcode.paycertificationapi.XOXIi1;
import com.android.mltcode.paycertificationapi.XiXiI10;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.hr1;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i01I1i1X;
import com.android.mltcode.paycertificationapi.iOIXI1II0;
import com.android.mltcode.paycertificationapi.iXX0I0;
import com.android.mltcode.paycertificationapi.iii1ii;
import com.android.mltcode.paycertificationapi.l76;
import com.android.mltcode.paycertificationapi.ms;
import com.android.mltcode.paycertificationapi.ns;
import com.android.mltcode.paycertificationapi.pb;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uk;
import com.android.mltcode.paycertificationapi.uz0;
import com.applovin.sdk.AppLovinErrorCodes;
import com.baidu.mapapi.map.BaiduMap;
import com.baidu.mapapi.map.BitmapDescriptorFactory;
import com.baidu.mapapi.map.MapStatus;
import com.baidu.mapapi.map.MapStatusUpdateFactory;
import com.baidu.mapapi.map.MarkerOptions;
import com.baidu.mapapi.map.TextureMapView;
import com.baidu.mapapi.model.LatLngBounds;
import com.baidu.mapapi.utils.DistanceUtil;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.constant.PermissionConstants;
import com.blankj.utilcode.util.ImageUtils;
import com.blankj.utilcode.util.PermissionUtils;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.ScreenUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.UiSettings;
import com.google.android.gms.maps.model.LatLng;
import com.google.gson.Gson;
import com.google.maps.android.SphericalUtil;
import com.jieli.watchtesttool.tool.upgrade.OTAManager;
import com.sma.smartv3.location.CustomLocation;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.model.OffLineGenerateFileVo;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.OffLineMapManagerKt;
import com.sma.smartv3.util.UtilsKt;
import com.sma.smartv3.view.CustomGoogleMapView;
import com.sma.smartv3.view.MaskView;
import com.sma.smartv3.view.ProgressButton;
import java.io.File;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nDownLoadMapsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DownLoadMapsActivity.kt\ncom/sma/smartv3/ui/device/DownLoadMapsActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,990:1\n19#2:991\n15#2:992\n173#3,7:993\n180#3,3:1001\n143#3,7:1004\n183#3:1011\n1#4:1000\n1#4:1012\n*S KotlinDebug\n*F\n+ 1 DownLoadMapsActivity.kt\ncom/sma/smartv3/ui/device/DownLoadMapsActivity\n*L\n98#1:991\n98#1:992\n359#1:993,7\n359#1:1001,3\n359#1:1004,7\n359#1:1011\n359#1:1000\n*E\n"})
public final class DownLoadMapsActivity extends BaseActivity {

    @aa1
    public static final OXO1 Companion = null;
    public static final int MAP_DEF_DIS = 2;
    public static final int MAP_MAX_DIS = 3;
    public static final int MAP_MIN_DIS = 1;
    public static final int MAP_NOT_PROCESSED = 0;

    @aa1
    private final String TAG;
    private LatLng curLatLng;
    private double curLatitude;
    private double curLongitude;
    private float curZoom;
    private float googleCurZoom;
    private boolean isInChinaMainland;
    private boolean isInProgress;
    private boolean isMapPauseResume;
    private int isNeedCalculateNumber;

    @aa1
    private final Lazy mBMapView$delegate;

    @tb1
    private BaiduMap mBaiDuMap;

    @aa1
    private final Lazy mGMapView$delegate;
    private GoogleMap mGoogleMap;

    @tb1
    private ms mLocationClient;

    @tb1
    private go0 mLocationServerPopup;

    @aa1
    private final File mMapDir;
    public MaskView.OXO1 mMaskCoordinates;

    @aa1
    private final Lazy mMaskView$delegate;

    @aa1
    private final Lazy mProgressButton$delegate;

    @aa1
    private final Lazy mRootView$delegate;
    private int mStartIcon;

    @aa1
    private final Lazy mTipTitle$delegate;

    @tb1
    private iii1ii mTitlePopup;
    private final double maxDistance;
    private double maxLatitude;
    private double maxLongitude;
    private final double minDistance;
    private double minLatitude;
    private double minLongitude;

    @aa1
    private final Lazy searchView$delegate;
    private int targetDistanceType;

    @aa1
    private final AppUser userProfile;

    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker r1) {
            this();
        }

        public OXO1() {
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.device.DownLoadMapsActivity$onActivityResult$1, reason: invalid class name and case insensitive filesystem */
    @DebugMetadata(c = "com.sma.smartv3.ui.device.DownLoadMapsActivity$onActivityResult$1", f = "DownLoadMapsActivity.kt", i = {}, l = {633, 638}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class C34421 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        final /* synthetic */ LatLng $mLatLng;
        int label;
        final /* synthetic */ DownLoadMapsActivity this$0;

        public C34421(DownLoadMapsActivity r1, LatLng r2, Continuation<? super C34421> r3) {
            this.this$0 = r1;
            this.$mLatLng = r2;
            super(2, r3);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
            return new C34421(this.this$0, this.$mLatLng, r4);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
            return ((C34421) create(r1, r2)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r20) {
            Object r1 = pb.I0iXXO();
            int r2 = this.label;
            if (r2 == 0) goto L10;
            if (r2 == 1) goto L9;
            if (r2 != 2) goto L8;
            ResultKt.X1ii(r20);
        L18:
            DownLoadMapsActivity r3 = this.this$0;
            LatLng r4 = this.$mLatLng;
            DownLoadMapsActivity.access$showMarkerOptions(r3, new CustomLocation(r4.latitude, r4.longitude, 0.0d, 0.0f, 0, 0, null, 0.0f, 0.0f, 0.0f, 1020, null));
            DownLoadMapsActivity.access$onCalculateZoom(this.this$0);
            return Unit.OXO1;
        L8:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        L9:
            ResultKt.X1ii(r20);
        L14:
            if (DownLoadMapsActivity.access$isInChinaMainland$p(this.this$0) == true) goto L18;
            this.this$0.setTargetDistanceType(2);
            DownLoadMapsActivity.access$onCalculateZoom(this.this$0);
            this.label = 2;
            if (DelayKt.XIi00iiXO(50, this) != r1) goto L18;
        L17:
            return r1;
        L10:
            ResultKt.X1ii(r20);
            this.label = 1;
            if (DelayKt.XIi00iiXO(100, this) != r1) goto L14;
            goto L17
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
            return invoke2(r1, r2);
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.device.DownLoadMapsActivity$onCalculateZoom$1, reason: invalid class name and case insensitive filesystem */
    @DebugMetadata(c = "com.sma.smartv3.ui.device.DownLoadMapsActivity$onCalculateZoom$1", f = "DownLoadMapsActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class C34431 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ DownLoadMapsActivity this$0;

        public C34431(DownLoadMapsActivity r1, Continuation<? super C34431> r2) {
            this.this$0 = r1;
            super(2, r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r2, Continuation<?> r3) {
            return new C34431(this.this$0, r3);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
            return ((C34431) create(r1, r2)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r27) {
            pb.I0iXXO();
            if (this.label != 0) goto L87;
            ResultKt.X1ii(r27);
            if (DownLoadMapsActivity.access$isInChinaMainland$p(this.this$0) == true) goto L7;
            GoogleMap r1 = DownLoadMapsActivity.access$getMGoogleMap$p(this.this$0);
            if (r1 != null) goto L45;
            Intrinsics.XXO("mGoogleMap");
            r1 = null;
        L45:
            UiSettings r2 = r1.getUiSettings();
            Intrinsics.O10IXXX0X(r2, "getUiSettings(...)");
            r2.setScrollGesturesEnabled(false);
            r2.setZoomGesturesEnabled(false);
            GoogleMap r13 = DownLoadMapsActivity.access$getMGoogleMap$p(this.this$0);
            if (r13 != null) goto L48;
            Intrinsics.XXO("mGoogleMap");
            r13 = null;
        L48:
            LatLng r3 = r13.getProjection().fromScreenLocation(new Point((int) this.this$0.getMMaskCoordinates().OIX0iXi(), (int) this.this$0.getMMaskCoordinates().XXI()));
            Intrinsics.O10IXXX0X(r3, "fromScreenLocation(...)");
            GoogleMap r14 = DownLoadMapsActivity.access$getMGoogleMap$p(this.this$0);
            if (r14 != null) goto L51;
            Intrinsics.XXO("mGoogleMap");
            r14 = null;
        L51:
            LatLng r4 = r14.getProjection().fromScreenLocation(new Point((int) this.this$0.getMMaskCoordinates().I0iXXO(), (int) this.this$0.getMMaskCoordinates().XXI()));
            Intrinsics.O10IXXX0X(r4, "fromScreenLocation(...)");
            float r5 = this.this$0.calculateDistanceGoogle(r3, r4);
            int r6 = this.this$0.getTargetDistanceType();
            if (r6 == 1) goto L74;
            if (r6 == 2) goto L65;
            if (r6 == 3) goto L56;
            this.this$0.setTargetDistanceType(0);
            this.this$0.setNeedCalculateNumber(0);
        L83:
            r2.setScrollGesturesEnabled(true);
            r2.setZoomGesturesEnabled(true);
        L85:
            return Unit.OXO1;
        L56:
            double r7 = r5;
            if (49000.0d > r7) goto L62;
            if (r7 > 50000.0d) goto L62;
        L64:
            this.this$0.setTargetDistanceType(0);
            this.this$0.setNeedCalculateNumber(0);
        L62:
            if (this.this$0.isNeedCalculateNumber() >= 10) goto L64;
            this.this$0.setNeedCalculateNumber(this.this$0.isNeedCalculateNumber() + 1);
            DownLoadMapsActivity.access$setComputeOffset(this.this$0, 25000.0d);
            goto L83
        L65:
            double r8 = r5;
            if (25000.0d > r8) goto L71;
            if (r8 > 26000.0d) goto L71;
        L73:
            this.this$0.setTargetDistanceType(0);
            this.this$0.setNeedCalculateNumber(0);
        L71:
            if (this.this$0.isNeedCalculateNumber() >= 10) goto L73;
            this.this$0.setNeedCalculateNumber(this.this$0.isNeedCalculateNumber() + 1);
            DownLoadMapsActivity.access$setComputeOffset(this.this$0, 12775.0d);
            goto L83
        L74:
            double r9 = r5;
            if (5000.0d > r9) goto L80;
            if (r9 > 6000.0d) goto L80;
        L82:
            this.this$0.setTargetDistanceType(0);
            this.this$0.setNeedCalculateNumber(0);
        L80:
            if (this.this$0.isNeedCalculateNumber() >= 10) goto L82;
            this.this$0.setNeedCalculateNumber(this.this$0.isNeedCalculateNumber() + 1);
            DownLoadMapsActivity.access$setComputeOffset(this.this$0, 2775.0d);
            goto L83
        L7:
            if (DownLoadMapsActivity.access$getMBaiDuMap$p(this.this$0) == null) goto L9;
            BaiduMap r10 = DownLoadMapsActivity.access$getMBaiDuMap$p(this.this$0);
            Intrinsics.XXI(r10);
            com.baidu.mapapi.model.LatLng r11 = r10.getProjection().fromScreenLocation(new Point((int) this.this$0.getMMaskCoordinates().OIX0iXi(), (int) this.this$0.getMMaskCoordinates().XXI()));
            BaiduMap r15 = DownLoadMapsActivity.access$getMBaiDuMap$p(this.this$0);
            Intrinsics.XXI(r15);
            com.baidu.mapapi.model.LatLng r12 = r15.getProjection().fromScreenLocation(new Point((int) this.this$0.getMMaskCoordinates().I0iXXO(), (int) this.this$0.getMMaskCoordinates().XXI()));
            DownLoadMapsActivity r16 = this.this$0;
            Intrinsics.XXI(r11);
            Intrinsics.XXI(r12);
            float r17 = DownLoadMapsActivity.access$calculateDistance(r16, r11, r12);
            int r18 = this.this$0.getTargetDistanceType();
            if (r18 == 1) goto L33;
            if (r18 == 2) goto L24;
            if (r18 == 3) goto L15;
            this.this$0.setTargetDistanceType(0);
            this.this$0.setNeedCalculateNumber(0);
            goto L85
        L15:
            double r19 = r17;
            if (49000.0d > r19) goto L21;
            if (r19 > 50000.0d) goto L21;
        L23:
            this.this$0.setTargetDistanceType(0);
            this.this$0.setNeedCalculateNumber(0);
        L21:
            if (this.this$0.isNeedCalculateNumber() >= 10) goto L23;
            this.this$0.setNeedCalculateNumber(this.this$0.isNeedCalculateNumber() + 1);
            DownLoadMapsActivity.access$setComputeOffset(this.this$0, 25000.0d);
            goto L85
        L24:
            double r20 = r17;
            if (25000.0d > r20) goto L30;
            if (r20 > 26000.0d) goto L30;
        L32:
            this.this$0.setTargetDistanceType(0);
            this.this$0.setNeedCalculateNumber(0);
        L30:
            if (this.this$0.isNeedCalculateNumber() >= 10) goto L32;
            this.this$0.setNeedCalculateNumber(this.this$0.isNeedCalculateNumber() + 1);
            DownLoadMapsActivity.access$setComputeOffset(this.this$0, 12775.0d);
            goto L85
        L33:
            double r21 = r17;
            if (5000.0d > r21) goto L39;
            if (r21 > 6000.0d) goto L39;
        L41:
            this.this$0.setTargetDistanceType(0);
            this.this$0.setNeedCalculateNumber(0);
        L39:
            if (this.this$0.isNeedCalculateNumber() >= 10) goto L41;
            this.this$0.setNeedCalculateNumber(this.this$0.isNeedCalculateNumber() + 1);
            DownLoadMapsActivity.access$setComputeOffset(this.this$0, 2775.0d);
            goto L85
        L9:
            return Unit.OXO1;
        L87:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
            return invoke2(r1, r2);
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.device.DownLoadMapsActivity$onLocationClient$1, reason: invalid class name and case insensitive filesystem */
    @DebugMetadata(c = "com.sma.smartv3.ui.device.DownLoadMapsActivity$onLocationClient$1", f = "DownLoadMapsActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class C34441 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ DownLoadMapsActivity this$0;

        /* JADX INFO: renamed from: com.sma.smartv3.ui.device.DownLoadMapsActivity$onLocationClient$1$OXO1 */
        public static final class OXO1 implements IO0OI {
            public final /* synthetic */ DownLoadMapsActivity OXO1;

            /* JADX INFO: renamed from: com.sma.smartv3.ui.device.DownLoadMapsActivity$onLocationClient$1$OXO1$OXO1, reason: collision with other inner class name */
            public static final class C0565OXO1 implements BaiduMap.OnMapStatusChangeListener {
                public final /* synthetic */ DownLoadMapsActivity OXO1;

                public C0565OXO1(DownLoadMapsActivity r1) {
                    this.OXO1 = r1;
                }

                @Override // com.baidu.mapapi.map.BaiduMap.OnMapStatusChangeListener
                public void onMapStatusChange(MapStatus r1) {
                }

                @Override // com.baidu.mapapi.map.BaiduMap.OnMapStatusChangeListener
                public void onMapStatusChangeFinish(MapStatus r1) {
                    DownLoadMapsActivity.access$checkZoomRestrictions(this.OXO1);
                }

                @Override // com.baidu.mapapi.map.BaiduMap.OnMapStatusChangeListener
                public void onMapStatusChangeStart(MapStatus r1) {
                }

                @Override // com.baidu.mapapi.map.BaiduMap.OnMapStatusChangeListener
                public void onMapStatusChangeStart(MapStatus r1, int r2) {
                }
            }

            public OXO1(DownLoadMapsActivity r1) {
                this.OXO1 = r1;
            }

            public static /* synthetic */ void XIi00iiXO(DownLoadMapsActivity r0) {
                iO(r0);
            }

            public static final void iO(DownLoadMapsActivity r0) {
                DownLoadMapsActivity.access$checkZoomRestrictions(r0);
            }

            @Override // com.android.mltcode.paycertificationapi.IO0OI
            public void OXO1(CustomLocation r12) {
                Intrinsics.X0O(r12, "location");
                LatLng r0 = new LatLng(r12.XO0O10(), r12.IiI10X());
                DownLoadMapsActivity.access$setCurLatLng$p(this.OXO1, new LatLng(r0.latitude, r0.longitude));
                if (DownLoadMapsActivity.access$isInChinaMainland$p(this.OXO1) == false) goto L29;
                DownLoadMapsActivity.access$setComputeOffset(this.OXO1, 12775.0d);
                BaiduMap r1 = DownLoadMapsActivity.access$getMBaiDuMap$p(this.OXO1);
                if (r1 == null) goto L27;
                r1.setOnMapStatusChangeListener(new C0565OXO1(this.OXO1));
            L27:
                DownLoadMapsActivity.access$showMarkerOptions(this.OXO1, r12);
                DownLoadMapsActivity.access$stopLocationClient(this.OXO1);
                return;
            L29:
                GoogleMap r2 = DownLoadMapsActivity.access$getMGoogleMap$p(this.OXO1);     // Catch: Exception -> L11
                GoogleMap r4 = null;
                if (r2 != null) goto L13;
                Intrinsics.XXO("mGoogleMap");     // Catch: Exception -> L11
                r2 = null;
            L13:
                DownLoadMapsActivity r5 = this.OXO1;     // Catch: Exception -> L11
                LatLng r7 = DownLoadMapsActivity.access$getCurLatLng$p(r5);     // Catch: Exception -> L11
                if (r7 != null) goto L17;
                Intrinsics.XXO("curLatLng");     // Catch: Exception -> L11
                r7 = null;
            L17:
                double r9 = r7.latitude;     // Catch: Exception -> L11
                LatLng r8 = DownLoadMapsActivity.access$getCurLatLng$p(r5);     // Catch: Exception -> L11
                if (r8 != null) goto L20;
                Intrinsics.XXO("curLatLng");     // Catch: Exception -> L11
                r8 = null;
            L20:
                r2.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(r9, r8.longitude), DownLoadMapsActivity.access$getGoogleCurZoom$p(r5)));     // Catch: Exception -> L11
                DownLoadMapsActivity.access$setComputeOffset(this.OXO1, 12775.0d);     // Catch: Exception -> L11
                GoogleMap r3 = DownLoadMapsActivity.access$getMGoogleMap$p(this.OXO1);     // Catch: Exception -> L11
                if (r3 != null) goto L23;
                Intrinsics.XXO("mGoogleMap");     // Catch: Exception -> L11
            L24:
                final DownLoadMapsActivity r6 = this.OXO1;     // Catch: Exception -> L11
                r4.setOnCameraIdleListener(new XOXIi1(r6));     // Catch: Exception -> L11
                goto L27
            L23:
                r4 = r3;
            L11:
                e = move-exception;
                e.printStackTrace();
                goto L27
            }

            @Override // com.android.mltcode.paycertificationapi.IO0OI
            public void onError(String r2) {
                Intrinsics.X0O(r2, "message");
            }
        }

        public C34441(DownLoadMapsActivity r1, Continuation<? super C34441> r2) {
            this.this$0 = r1;
            super(2, r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r2, Continuation<?> r3) {
            return new C34441(this.this$0, r3);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
            return ((C34441) create(r1, r2)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r5) {
            pb.I0iXXO();
            if (this.label != 0) goto L10;
            ResultKt.X1ii(r5);
            DownLoadMapsActivity r6 = this.this$0;
            DownLoadMapsActivity.access$setMLocationClient$p(r6, ns.XIi00iiXO(new OXO1(r6), false, 2, null));
            ms r7 = DownLoadMapsActivity.access$getMLocationClient$p(this.this$0);
            if (r7 == null) goto L8;
            r7.IiI10X(R.string.show_map_and_phone_get_location_desc, false);
        L8:
            return Unit.OXO1;
        L10:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
            return invoke2(r1, r2);
        }
    }

    static {
        Companion = new OXO1(null);
    }

    public DownLoadMapsActivity() {
        this.TAG = "DownLoadMapsActivity";
        this.mRootView$delegate = LazyKt__LazyJVMKt.iO(new OiO0X(this));
        this.mMapDir = uz0.iXiX011(sz0.OXO1);
        this.mProgressButton$delegate = LazyKt__LazyJVMKt.iO(new IX111(this));
        this.mGMapView$delegate = LazyKt__LazyJVMKt.iO(new I10i1(this));
        this.mBMapView$delegate = LazyKt__LazyJVMKt.iO(new I001X(this));
        a01 r1 = a01.OXO1;
        this.isInChinaMainland = r1.OXO1().getBoolean(b01.XiOIO, true);
        this.mMaskView$delegate = LazyKt__LazyJVMKt.iO(new XiXiI10(this));
        this.mTipTitle$delegate = LazyKt__LazyJVMKt.iO(new X11ii1OOI(this));
        SPUtils r2 = r1.IiI10X();
        Object r3 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r4 = new Gson().fromJson(r2.getString(AppUser.class.getName()), AppUser.class);
        if (r4 == null) goto L6;
        r3 = r4;
    L6:
        this.userProfile = (AppUser) r3;
        this.mStartIcon = R.drawable.icon_sport_map_rate_start;
        this.searchView$delegate = LazyKt__LazyJVMKt.iO(new iXX0I0(this));
        this.minDistance = 5000.0d;
        this.maxDistance = 50000.0d;
        this.targetDistanceType = 2;
        this.curZoom = 11.043798f;
        this.googleCurZoom = 10.6019125f;
    }

    public static /* synthetic */ Unit I0iXXO(DownLoadMapsActivity r0, boolean r1) {
        return requestLocationPermission$lambda$0(r0, r1);
    }

    public static /* synthetic */ boolean I1XOi1(DownLoadMapsActivity r0) {
        return locationServerRemind$lambda$0$0(r0);
    }

    public static /* synthetic */ void IIX1OXO(DownLoadMapsActivity r0, View r1) {
        initView$lambda$0(r0, r1);
    }

    public static /* synthetic */ CustomGoogleMapView O10IXXX0X(DownLoadMapsActivity r0) {
        return mGMapView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View OII(DownLoadMapsActivity r0) {
        return mRootView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextureMapView OIX0iXi(DownLoadMapsActivity r0) {
        return mBMapView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void OX(DownLoadMapsActivity r0, String r1, Bitmap r2) {
        showTitlePopup$lambda$0$0$1(r0, r1, r2);
    }

    public static /* synthetic */ Unit OiIIX101O(DownLoadMapsActivity r0, String r1, OffLineGenerateFileVo r2) {
        return showTitlePopup$lambda$0$0$3(r0, r1, r2);
    }

    public static /* synthetic */ boolean X0O(DownLoadMapsActivity r0, String r1) {
        return showTitlePopup$lambda$0$0(r0, r1);
    }

    public static /* synthetic */ void X1ii(DownLoadMapsActivity r0, String r1, Bitmap r2) {
        showTitlePopup$lambda$0$0$2(r0, r1, r2);
    }

    public static /* synthetic */ View XX0(DownLoadMapsActivity r0) {
        return searchView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void XXI(DownLoadMapsActivity r0, GoogleMap r1) {
        onCreate$lambda$2(r0, r1);
    }

    public static /* synthetic */ MaskView XiOIO(DownLoadMapsActivity r0) {
        return mMaskView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ProgressButton XiOIii1(DownLoadMapsActivity r0) {
        return mProgressButton_delegate$lambda$0(r0);
    }

    public static final /* synthetic */ float access$calculateDistance(DownLoadMapsActivity r0, com.baidu.mapapi.model.LatLng r1, com.baidu.mapapi.model.LatLng r2) {
        return r0.calculateDistance(r1, r2);
    }

    public static final /* synthetic */ void access$checkZoomRestrictions(DownLoadMapsActivity r0) {
        r0.checkZoomRestrictions();
    }

    public static final /* synthetic */ LatLng access$getCurLatLng$p(DownLoadMapsActivity r0) {
        return r0.curLatLng;
    }

    public static final /* synthetic */ float access$getGoogleCurZoom$p(DownLoadMapsActivity r0) {
        return r0.googleCurZoom;
    }

    public static final /* synthetic */ BaiduMap access$getMBaiDuMap$p(DownLoadMapsActivity r0) {
        return r0.mBaiDuMap;
    }

    public static final /* synthetic */ GoogleMap access$getMGoogleMap$p(DownLoadMapsActivity r0) {
        return r0.mGoogleMap;
    }

    public static final /* synthetic */ ms access$getMLocationClient$p(DownLoadMapsActivity r0) {
        return r0.mLocationClient;
    }

    public static final /* synthetic */ ProgressButton access$getMProgressButton(DownLoadMapsActivity r0) {
        return r0.getMProgressButton();
    }

    public static final /* synthetic */ String access$getTAG$p(DownLoadMapsActivity r0) {
        return r0.TAG;
    }

    public static final /* synthetic */ boolean access$isInChinaMainland$p(DownLoadMapsActivity r0) {
        return r0.isInChinaMainland;
    }

    public static final /* synthetic */ void access$onCalculateZoom(DownLoadMapsActivity r0) {
        r0.onCalculateZoom();
    }

    public static final /* synthetic */ void access$setComputeOffset(DownLoadMapsActivity r0, double r1) {
        r0.setComputeOffset(r1);
    }

    public static final /* synthetic */ void access$setCurLatLng$p(DownLoadMapsActivity r0, LatLng r1) {
        r0.curLatLng = r1;
    }

    public static final /* synthetic */ void access$setMLocationClient$p(DownLoadMapsActivity r0, ms r1) {
        r0.mLocationClient = r1;
    }

    public static final /* synthetic */ void access$showMarkerOptions(DownLoadMapsActivity r0, CustomLocation r1) {
        r0.showMarkerOptions(r1);
    }

    public static final /* synthetic */ void access$stopLocationClient(DownLoadMapsActivity r0) {
        r0.stopLocationClient();
    }

    private final float calculateDistance(com.baidu.mapapi.model.LatLng r1, com.baidu.mapapi.model.LatLng r2) {
        return (float) DistanceUtil.getDistance(r1, r2);
    }

    private final void checkZoomRestrictions() {
        onCalculateZoom();
        float r7 = 50000.0f;
        if (this.isInChinaMainland == false) goto L28;
        BaiduMap r0 = this.mBaiDuMap;
        if (r0 == null) goto L58;
        Intrinsics.XXI(r0);
        com.baidu.mapapi.model.LatLng r1 = r0.getProjection().fromScreenLocation(new Point((int) getMMaskCoordinates().OIX0iXi(), (int) getMMaskCoordinates().XXI()));
        BaiduMap r8 = this.mBaiDuMap;
        Intrinsics.XXI(r8);
        com.baidu.mapapi.model.LatLng r9 = r8.getProjection().fromScreenLocation(new Point((int) getMMaskCoordinates().I0iXXO(), (int) getMMaskCoordinates().XXI()));
        Intrinsics.XXI(r1);
        Intrinsics.XXI(r9);
        float r2 = calculateDistance(r1, r9);
        if (r2 > 49000.0f) goto L10;
    L12:
        r7 = r2;
    L14:
        if (this.userProfile.getUnit() != 0) goto L16;
        String r3 = ((int) (r7 / 1000)) + "KM";
    L18:
        if (this.isNeedCalculateNumber != 0) goto L20;
        getMMaskView().setDirectionsText(r3);
    L20:
        double r4 = r2;
        if (r4 <= this.maxDistance) goto L25;
        this.targetDistanceType = 3;
        onCalculateZoom();
        return;
    L25:
        if (r4 >= this.minDistance) goto L56;
        this.targetDistanceType = 1;
        onCalculateZoom();
        return;
    L56:
        return;
    L16:
        r3 = ((int) l76.XO0O10(r7 / 1000)) + "mi";
        goto L18
    L10:
        if (r2 > 50000.0f) goto L12;
    L58:
        return;
    L28:
        GoogleMap r5 = this.mGoogleMap;
        GoogleMap r10 = null;
        if (r5 != null) goto L31;
        Intrinsics.XXO("mGoogleMap");
        r5 = null;
    L31:
        LatLng r6 = r5.getProjection().fromScreenLocation(new Point((int) getMMaskCoordinates().OIX0iXi(), (int) getMMaskCoordinates().XXI()));
        Intrinsics.O10IXXX0X(r6, "fromScreenLocation(...)");
        GoogleMap r11 = this.mGoogleMap;
        if (r11 != null) goto L34;
        Intrinsics.XXO("mGoogleMap");
    L35:
        LatLng r12 = r10.getProjection().fromScreenLocation(new Point((int) getMMaskCoordinates().I0iXXO(), (int) getMMaskCoordinates().XXI()));
        Intrinsics.O10IXXX0X(r12, "fromScreenLocation(...)");
        float r13 = calculateDistanceGoogle(r6, r12);
        if (r13 > 49000.0f) goto L38;
    L40:
        r7 = r13;
    L42:
        if (this.userProfile.getUnit() != 0) goto L44;
        String r14 = ((int) (r7 / 1000)) + "KM";
    L46:
        if (this.isNeedCalculateNumber != 0) goto L48;
        getMMaskView().setDirectionsText(r14);
    L48:
        double r15 = r13;
        if (r15 <= this.maxDistance) goto L53;
        this.targetDistanceType = 3;
        onCalculateZoom();
        return;
    L53:
        if (r15 >= this.minDistance) goto L57;
        this.targetDistanceType = 1;
        onCalculateZoom();
        return;
    L57:
        return;
    L44:
        r14 = ((int) l76.XO0O10(r7 / 1000)) + "mi";
        goto L46
    L38:
        if (r13 > 50000.0f) goto L40;
    L34:
        r10 = r11;
        goto L35
    }

    private final void downloadMap(String r5, final String r6) {
        getMProgressButton().setProgress(0.0f);
        NetWorkUtils r0 = NetWorkUtils.INSTANCE;
        String r1 = this.mMapDir.getAbsolutePath();
        Intrinsics.O10IXXX0X(r1, "getAbsolutePath(...)");
        r0.download(r5, r1, r6 + OTAManager.OTA_ZIP_SUFFIX, new AnonymousClass1(this, r6));
    }

    private final TextureMapView getMBMapView() {
        return (TextureMapView) getValue();
    }

    private final CustomGoogleMapView getMGMapView() {
        return (CustomGoogleMapView) getValue();
    }

    private final MaskView getMMaskView() {
        return (MaskView) getValue();
    }

    private final ProgressButton getMProgressButton() {
        return (ProgressButton) getValue();
    }

    private final View getMRootView() {
        return (View) getValue();
    }

    private final TextView getMTipTitle() {
        return (TextView) getValue();
    }

    private final View getSearchView() {
        return (View) getValue();
    }

    public static /* synthetic */ TextView iIiiO(DownLoadMapsActivity r0) {
        return mTipTitle_delegate$lambda$0(r0);
    }

    private static final void initView$lambda$0(DownLoadMapsActivity r3, View r4) {
        Bundle r5 = new Bundle();
        r5.putString("mArg0", null);
        r5.putInt("mArg1", -1);
        r5.putParcelable("mArg2", null);
        r5.putSerializable("mArg3", null);
        Intent r0 = new Intent(r3, SearchMapsActivity.class);
        r0.putExtras(r5);
        r3.startActivityForResult(r0, 0);
    }

    private final void locationServerRemind() {
        if (this.mLocationServerPopup != null) goto L5;
        go0 r0 = new go0(this, 0, 2, null);
        r0.O1O(R.string.location_server_notification);
        go0.X11iII1O1(r0, Integer.valueOf(R.string.cancel), null, 2, null);
        r0.X1IX(R.string.settings, new XIO1X0XX(this));
        this.mLocationServerPopup = r0;
    L5:
        go0 r1 = this.mLocationServerPopup;
        if (r1 == null) goto L9;
        r1.IIX1OXO();
        return;
    }

    private static final boolean locationServerRemind$lambda$0$0(DownLoadMapsActivity r2) {
        r2.startActivityForResult(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"), 2);
        return true;
    }

    private static final TextureMapView mBMapView_delegate$lambda$0(DownLoadMapsActivity r1) {
        return (TextureMapView) r1.findViewById(R.id.bMapView);
    }

    private static final CustomGoogleMapView mGMapView_delegate$lambda$0(DownLoadMapsActivity r1) {
        return (CustomGoogleMapView) r1.findViewById(R.id.gMapView);
    }

    private static final MaskView mMaskView_delegate$lambda$0(DownLoadMapsActivity r1) {
        return (MaskView) r1.findViewById(R.id.abh_maskView);
    }

    private static final ProgressButton mProgressButton_delegate$lambda$0(DownLoadMapsActivity r1) {
        return (ProgressButton) r1.findViewById(R.id.btn_bottom);
    }

    private static final View mRootView_delegate$lambda$0(DownLoadMapsActivity r1) {
        return r1.findViewById(R.id.abh_root_view);
    }

    private static final TextView mTipTitle_delegate$lambda$0(DownLoadMapsActivity r1) {
        return (TextView) r1.findViewById(R.id.download_maps_tip_title);
    }

    private final void onCalculateZoom() {
        I100X1.O00(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C34431(this, null), 3, null);
    }

    private static final void onCreate$lambda$2(DownLoadMapsActivity r2, GoogleMap r3) {
        Intrinsics.X0O(r3, "googleMap");
        r2.mGoogleMap = r3;
        if (r3 != null) goto L5;
        Intrinsics.XXO("mGoogleMap");
        r3 = null;
    L5:
        UiSettings r4 = r3.getUiSettings();
        r4.setZoomControlsEnabled(false);
        r4.setScrollGesturesEnabled(true);
        r4.setZoomGesturesEnabled(true);
        r4.setTiltGesturesEnabled(false);
        r2.setMapColorScheme();
        r2.startLocation();
    }

    private final void onLocationClient() {
        I100X1.O00(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C34441(this, null), 3, null);
    }

    private final void requestLocationPermission() {
        hr1.XXIIO1i11(hr1.OXO1, this, false, new OIXX0O0iI(this), 2, null);
    }

    private static final Unit requestLocationPermission$lambda$0(DownLoadMapsActivity r0, boolean r1) {
        if (r1 == false) goto L5;
        r0.onLocationClient();
    L5:
        return Unit.OXO1;
    }

    private static final View searchView_delegate$lambda$0(DownLoadMapsActivity r1) {
        return r1.findViewById(R.id.abh_search_map_et);
    }

    private final void setComputeOffset(double r18) {
        if (r18 > 3000.0d) goto L6;
        double r1 = 0.03d;
    L9:
        uk r3 = uk.OXO1;
        LatLng r4 = this.curLatLng;
        GoogleMap r13 = null;
        if (r4 != null) goto L12;
        Intrinsics.XXO("curLatLng");
        r4 = null;
    L12:
        double r5 = r4.latitude - r1;
        LatLng r6 = this.curLatLng;
        if (r6 != null) goto L15;
        Intrinsics.XXO("curLatLng");
        r6 = null;
    L15:
        Pair<Double, Double> r14 = r3.OXO1(r5, r6.longitude, r18, 270.0d);
        LatLng r7 = this.curLatLng;
        if (r7 != null) goto L18;
        Intrinsics.XXO("curLatLng");
        r7 = null;
    L18:
        double r8 = r7.latitude - r1;
        LatLng r9 = this.curLatLng;
        if (r9 != null) goto L21;
        Intrinsics.XXO("curLatLng");
        r9 = null;
    L21:
        Pair<Double, Double> r15 = r3.OXO1(r8, r9.longitude, r18, 0.0d);
        LatLng r10 = this.curLatLng;
        if (r10 != null) goto L24;
        Intrinsics.XXO("curLatLng");
        r10 = null;
    L24:
        double r11 = r10.latitude - r1;
        LatLng r12 = this.curLatLng;
        if (r12 != null) goto L27;
        Intrinsics.XXO("curLatLng");
        r12 = null;
    L27:
        Pair<Double, Double> r16 = r3.OXO1(r11, r12.longitude, r18, 180.0d);
        LatLng r17 = this.curLatLng;
        if (r17 != null) goto L30;
        Intrinsics.XXO("curLatLng");
        r17 = null;
    L30:
        double r19 = r17.latitude - r1;
        LatLng r2 = this.curLatLng;
        if (r2 != null) goto L33;
        Intrinsics.XXO("curLatLng");
        r2 = null;
    L33:
        Pair<Double, Double> r20 = r3.OXO1(r19, r2.longitude, r18, 90.0d);
        if (this.isInChinaMainland == false) goto L39;
        LatLngBounds r21 = new LatLngBounds.Builder().include(new com.baidu.mapapi.model.LatLng(r15.getFirst().doubleValue(), r15.getSecond().doubleValue())).include(new com.baidu.mapapi.model.LatLng(r16.getFirst().doubleValue(), r16.getSecond().doubleValue())).include(new com.baidu.mapapi.model.LatLng(r20.getFirst().doubleValue(), r20.getSecond().doubleValue())).include(new com.baidu.mapapi.model.LatLng(r14.getFirst().doubleValue(), r14.getSecond().doubleValue())).build();
        BaiduMap r22 = this.mBaiDuMap;
        if (r22 == null) goto L45;
        r22.animateMapStatus(MapStatusUpdateFactory.newLatLngBounds(r21, 150, 0, 150, 0));
        return;
    L45:
        return;
    L39:
        com.google.android.gms.maps.model.LatLngBounds r23 = new com.google.android.gms.maps.model.LatLngBounds.Builder().include(new LatLng(r15.getFirst().doubleValue(), r15.getSecond().doubleValue())).include(new LatLng(r16.getFirst().doubleValue(), r16.getSecond().doubleValue())).include(new LatLng(r20.getFirst().doubleValue(), r20.getSecond().doubleValue())).include(new LatLng(r14.getFirst().doubleValue(), r14.getSecond().doubleValue())).build();
        Intrinsics.O10IXXX0X(r23, "build(...)");
        GoogleMap r24 = this.mGoogleMap;
        if (r24 != null) goto L42;
        Intrinsics.XXO("mGoogleMap");
    L43:
        r13.animateCamera(CameraUpdateFactory.newLatLngBounds(r23, 150));
        return;
    L42:
        r13 = r24;
        goto L43
    L6:
        if (r18 > 13000.0d) goto L8;
        r1 = 0.15d;
        goto L9
    L8:
        r1 = 0.25d;
        goto L9
    }

    private final void setMapColorScheme() {
        int r0 = a01.OXO1.OXO1().getInt(b01.X0O, 2);
        if (this.isInChinaMainland == true) goto L29;
        GoogleMap r1 = null;
        if (r0 != 0) goto L8;
        GoogleMap r2 = this.mGoogleMap;
        if (r2 != null) goto L26;
        Intrinsics.XXO("mGoogleMap");
    L27:
        r1.setMapColorScheme(2);
        return;
    L26:
        r1 = r2;
        goto L27
    L8:
        if (r0 == 1) goto L17;
        if (r0 == 2) goto L11;
        return;
    L11:
        GoogleMap r3 = this.mGoogleMap;
        if (r3 != null) goto L14;
        Intrinsics.XXO("mGoogleMap");
    L15:
        r1.setMapColorScheme(0);
        return;
    L14:
        r1 = r3;
        goto L15
    L17:
        GoogleMap r4 = this.mGoogleMap;
        if (r4 != null) goto L20;
        Intrinsics.XXO("mGoogleMap");
    L21:
        r1.setMapColorScheme(1);
        return;
    L20:
        r1 = r4;
        goto L21
    }

    private final void setMaskView() {
        int r0 = ScreenUtils.getScreenWidth();
        getMMaskView().iO(r0 + AppLovinErrorCodes.INCENTIVIZED_NO_AD_PRELOADED, 150);
        MaskView.OXO1 r1 = getMMaskView().getCoordinates();
        Intrinsics.XXI(r1);
        setMMaskCoordinates(r1);
    }

    private final void showMarkerOptions(CustomLocation r8) {
        if (this.isInChinaMainland == false) goto L8;
        BaiduMap r0 = this.mBaiDuMap;
        if (r0 == null) goto L13;
        MarkerOptions r9 = new MarkerOptions().position(new com.baidu.mapapi.model.LatLng(r8.XO0O10(), r8.IiI10X())).icon(BitmapDescriptorFactory.fromResource(this.mStartIcon)).draggable(false).flat(true).zIndex(9);
        r9.anchor(0.5f, 0.5f);
        r0.addOverlay(r9);
        return;
    L13:
        return;
    L8:
        GoogleMap r1 = this.mGoogleMap;
        if (r1 != null) goto L11;
        Intrinsics.XXO("mGoogleMap");
        r1 = null;
    L11:
        r1.addMarker(new com.google.android.gms.maps.model.MarkerOptions().position(new LatLng(r8.XO0O10(), r8.IiI10X())).icon(com.google.android.gms.maps.model.BitmapDescriptorFactory.fromResource(this.mStartIcon)));
    }

    private final void showTitlePopup() {
        if (this.mTitlePopup != null) goto L5;
        int r3 = 0;
        iii1ii r0 = new iii1ii(this, r3, 2, null);
        r0.XXX11i(R.string.map_naming);
        r0.X01IiOiIi().setTextColor(ContextCompat.getColor(r0.XO0O10(), R.color.line_color));
        r0.X01IiOiIi().setFilters(new O00IXIOI1[]{new O00IXIOI1()});
        r0.X11iII1O1(new OXX10(this));
        this.mTitlePopup = r0;
    L5:
        iii1ii r1 = this.mTitlePopup;
        if (r1 == null) goto L9;
        r1.IIX1OXO();
        return;
    }

    private static final boolean showTitlePopup$lambda$0$0(DownLoadMapsActivity r23, final String r24) {
        final DownLoadMapsActivity r12 = r23;
        Intrinsics.X0O(r24, "text");
        if (TextUtils.isEmpty(r24) == true) goto L52;
        File[] r3 = r12.mMapDir.listFiles();
        if (r3 == null) goto L12;
        int r6 = r3.length;
        int r7 = 0;
    L7:
        if (r7 >= r6) goto L12;
        File r8 = r3[r7];
        if (Intrinsics.XOO0ii0(r8.getName(), r24) == true) goto L13;
        r7 = r7 + 1;
    L13:
        if (r8 == null) goto L16;
        ToastUtils.showLong(r12.getString(R.string.file_exist), new Object[0]);
        return true;
    L16:
        if (r12.isInChinaMainland == false) goto L24;
        BaiduMap r4 = r12.mBaiDuMap;
        Intrinsics.XXI(r4);
        com.baidu.mapapi.model.LatLng r5 = r4.getProjection().fromScreenLocation(new Point((int) r12.getMMaskCoordinates().OIX0iXi(), (int) r12.getMMaskCoordinates().XXI()));
        BaiduMap r9 = r12.mBaiDuMap;
        Intrinsics.XXI(r9);
        com.baidu.mapapi.model.LatLng r10 = r9.getProjection().fromScreenLocation(new Point((int) r12.getMMaskCoordinates().OIX0iXi(), (int) r12.getMMaskCoordinates().XOO0ii0()));
        BaiduMap r11 = r12.mBaiDuMap;
        Intrinsics.XXI(r11);
        com.baidu.mapapi.model.LatLng r13 = r11.getProjection().fromScreenLocation(new Point((int) r12.getMMaskCoordinates().I0iXXO(), (int) r12.getMMaskCoordinates().XXI()));
        BaiduMap r14 = r12.mBaiDuMap;
        Intrinsics.XXI(r14);
        com.baidu.mapapi.model.LatLng r15 = r14.getProjection().fromScreenLocation(new Point((int) r12.getMMaskCoordinates().I0iXXO(), (int) r12.getMMaskCoordinates().XOO0ii0()));
        BaiduMap r16 = r12.mBaiDuMap;
        Intrinsics.XXI(r16);
        com.baidu.mapapi.model.LatLng r17 = r16.getProjection().fromScreenLocation(new Point((int) r12.getMMaskCoordinates().I0IIOi(), (int) r12.getMMaskCoordinates().OIi0()));
        i01I1i1X r18 = i01I1i1X.OXO1;
        if (r18.XO0O10(r17.latitude, r17.longitude) == false) goto L20;
        Pair<Double, Double> r19 = r18.XIi00iiXO(r5.latitude, r5.longitude);
        Pair<Double, Double> r20 = r18.XIi00iiXO(r10.latitude, r10.longitude);
        Pair<Double, Double> r21 = r18.XIi00iiXO(r13.latitude, r13.longitude);
        Pair<Double, Double> r22 = r18.XIi00iiXO(r15.latitude, r15.longitude);
        Pair<Double, Double> r25 = r18.XIi00iiXO(r17.latitude, r17.longitude);
        com.baidu.mapapi.model.LatLng r26 = new com.baidu.mapapi.model.LatLng(r19.getFirst().doubleValue(), r19.getSecond().doubleValue());
        com.baidu.mapapi.model.LatLng r27 = new com.baidu.mapapi.model.LatLng(r20.getFirst().doubleValue(), r20.getSecond().doubleValue());
        com.baidu.mapapi.model.LatLng r28 = new com.baidu.mapapi.model.LatLng(r21.getFirst().doubleValue(), r21.getSecond().doubleValue());
        com.baidu.mapapi.model.LatLng r29 = new com.baidu.mapapi.model.LatLng(r22.getFirst().doubleValue(), r22.getSecond().doubleValue());
        r17 = new com.baidu.mapapi.model.LatLng(r25.getFirst().doubleValue(), r25.getSecond().doubleValue());
        r15 = r29;
        r13 = r28;
        r10 = r27;
        r5 = r26;
    L20:
        com.baidu.mapapi.model.LatLng r110 = r10;
        r12 = r23;
        r12.maxLongitude = OOiIO0.X1IX(r5.longitude, new double[]{r10.longitude, r13.longitude, r15.longitude});
        r12.minLongitude = OOiIO0.XXiIiX10(r5.longitude, new double[]{r110.longitude, r13.longitude, r15.longitude});
        r12.maxLatitude = OOiIO0.X1IX(r5.latitude, new double[]{r110.latitude, r13.latitude, r15.latitude});
        r12.minLatitude = OOiIO0.XXiIiX10(r5.latitude, new double[]{r110.latitude, r13.latitude, r15.latitude});
        r12.curLongitude = r17.longitude;
        r12.curLatitude = r17.latitude;
        BaiduMap r1 = r12.mBaiDuMap;
        if (r1 == null) goto L23;
        r1.snapshot(new IOIO11(r12, r24));
    L23:
        boolean r2 = true;
    L47:
        r12.isInProgress = r2;
        OffLineMapManagerKt.XOO0ii0(r12.minLongitude, r12.minLatitude, r12.maxLongitude, r12.maxLatitude, r12.curLongitude, r12.curLatitude, r12, r12.getMRootView(), new Oii1IXiXi(r12, r24));
        iii1ii r0 = r12.mTitlePopup;
        if (r0 == null) goto L50;
        r0.dismiss();
    L50:
        return true;
    L24:
        GoogleMap r30 = r12.mGoogleMap;
        if (r30 != null) goto L27;
        Intrinsics.XXO("mGoogleMap");
        r30 = null;
    L27:
        LatLng r31 = r30.getProjection().fromScreenLocation(new Point((int) r12.getMMaskCoordinates().OIX0iXi(), (int) r12.getMMaskCoordinates().XXI()));
        Intrinsics.O10IXXX0X(r31, "fromScreenLocation(...)");
        GoogleMap r32 = r12.mGoogleMap;
        if (r32 != null) goto L30;
        Intrinsics.XXO("mGoogleMap");
        r32 = null;
    L30:
        LatLng r33 = r32.getProjection().fromScreenLocation(new Point((int) r12.getMMaskCoordinates().OIX0iXi(), (int) r12.getMMaskCoordinates().XOO0ii0()));
        Intrinsics.O10IXXX0X(r33, "fromScreenLocation(...)");
        GoogleMap r34 = r12.mGoogleMap;
        if (r34 != null) goto L33;
        Intrinsics.XXO("mGoogleMap");
        r34 = null;
    L33:
        LatLng r35 = r34.getProjection().fromScreenLocation(new Point((int) r12.getMMaskCoordinates().I0iXXO(), (int) r12.getMMaskCoordinates().XXI()));
        Intrinsics.O10IXXX0X(r35, "fromScreenLocation(...)");
        GoogleMap r36 = r12.mGoogleMap;
        if (r36 != null) goto L36;
        Intrinsics.XXO("mGoogleMap");
        r36 = null;
    L36:
        LatLng r37 = r36.getProjection().fromScreenLocation(new Point((int) r12.getMMaskCoordinates().I0iXXO(), (int) r12.getMMaskCoordinates().XOO0ii0()));
        Intrinsics.O10IXXX0X(r37, "fromScreenLocation(...)");
        GoogleMap r38 = r12.mGoogleMap;
        if (r38 != null) goto L39;
        Intrinsics.XXO("mGoogleMap");
        r38 = null;
    L39:
        LatLng r39 = r38.getProjection().fromScreenLocation(new Point((int) r12.getMMaskCoordinates().I0IIOi(), (int) r12.getMMaskCoordinates().OIi0()));
        Intrinsics.O10IXXX0X(r39, "fromScreenLocation(...)");
        i01I1i1X r40 = i01I1i1X.OXO1;
        if (r40.XO0O10(r39.latitude, r39.longitude) == false) goto L42;
        Pair<Double, Double> r41 = r40.iO(r31.latitude, r31.longitude);
        Pair<Double, Double> r42 = r40.iO(r33.latitude, r33.longitude);
        Pair<Double, Double> r43 = r40.iO(r35.latitude, r35.longitude);
        Pair<Double, Double> r44 = r40.iO(r37.latitude, r37.longitude);
        Pair<Double, Double> r45 = r40.iO(r39.latitude, r39.longitude);
        LatLng r46 = new LatLng(r41.getFirst().doubleValue(), r41.getSecond().doubleValue());
        LatLng r47 = new LatLng(r42.getFirst().doubleValue(), r42.getSecond().doubleValue());
        LatLng r48 = new LatLng(r43.getFirst().doubleValue(), r43.getSecond().doubleValue());
        LatLng r49 = new LatLng(r44.getFirst().doubleValue(), r44.getSecond().doubleValue());
        r33 = r47;
        r31 = r46;
        r39 = new LatLng(r45.getFirst().doubleValue(), r45.getSecond().doubleValue());
        r37 = r49;
        r35 = r48;
    L42:
        LatLng r111 = r33;
        r12.maxLongitude = OOiIO0.X1IX(r31.longitude, new double[]{r33.longitude, r35.longitude, r37.longitude});
        r12.minLongitude = OOiIO0.XXiIiX10(r31.longitude, new double[]{r111.longitude, r35.longitude, r37.longitude});
        r12.maxLatitude = OOiIO0.X1IX(r31.latitude, new double[]{r111.latitude, r35.latitude, r37.latitude});
        r12.minLatitude = OOiIO0.XXiIiX10(r31.latitude, new double[]{r111.latitude, r35.latitude, r37.latitude});
        r12.curLongitude = r39.longitude;
        r12.curLatitude = r39.latitude;
        GoogleMap r50 = r12.mGoogleMap;
        if (r50 != null) goto L45;
        Intrinsics.XXO("mGoogleMap");
        GoogleMap r51 = null;
    L46:
        r51.snapshot(new I0100iOI(r12, r24));
        r2 = true;
        goto L47
    L45:
        r51 = r50;
    L12:
        r8 = null;
        goto L13
    L52:
        ToastUtils.showLong(R.string.create_tip_title);
        return false;
    }

    private static final void showTitlePopup$lambda$0$0$1(DownLoadMapsActivity r2, String r3, Bitmap r4) {
        if (r4 == null) goto L5;
        ImageUtils.save(r4, new File(r2.mMapDir, r3 + ".jpg"), Bitmap.CompressFormat.JPEG);
        return;
    }

    private static final void showTitlePopup$lambda$0$0$2(DownLoadMapsActivity r2, String r3, Bitmap r4) {
        if (r4 == null) goto L5;
        ImageUtils.save(r4, new File(r2.mMapDir, r3 + ".jpg"), Bitmap.CompressFormat.JPEG);
        return;
    }

    private static final Unit showTitlePopup$lambda$0$0$3(DownLoadMapsActivity r1, String r2, OffLineGenerateFileVo r3) {
        if (r3 != null) goto L4;
    L6:
        r1.isInProgress = false;
    L8:
        return Unit.OXO1;
    L4:
        if (r3.getDownloadUrl().length() <= 0) goto L6;
        r1.downloadMap(r3.getDownloadUrl(), r2);
        goto L8
    }

    private final void startLocation() {
        if (UtilsKt.X1() == true) goto L7;
        locationServerRemind();
        return;
    L7:
        if (PermissionUtils.isGranted(new String[]{PermissionConstants.LOCATION}) == true) goto L10;
        requestLocationPermission();
        return;
    L10:
        onLocationClient();
    }

    private final void stopLocationClient() {
        ms r0 = this.mLocationClient;
        if (r0 == null) goto L6;
        r0.I0IIOi();
        return;
    }

    public final void addOffLineMap() {
    }

    public final float calculateDistanceGoogle(@aa1 LatLng r2, @aa1 LatLng r3) {
        Intrinsics.X0O(r2, "point1");
        Intrinsics.X0O(r3, "point2");
        return (float) SphericalUtil.computeDistanceBetween(r2, r3);
    }

    public final double getCurLatitude() {
        return this.curLatitude;
    }

    public final double getCurLongitude() {
        return this.curLongitude;
    }

    @aa1
    public final File getMMapDir() {
        return this.mMapDir;
    }

    @aa1
    public final MaskView.OXO1 getMMaskCoordinates() {
        MaskView.OXO1 r0 = this.mMaskCoordinates;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("mMaskCoordinates");
        return null;
    }

    public final int getMStartIcon() {
        return this.mStartIcon;
    }

    public final double getMaxLatitude() {
        return this.maxLatitude;
    }

    public final double getMaxLongitude() {
        return this.maxLongitude;
    }

    public final double getMinLatitude() {
        return this.minLatitude;
    }

    public final double getMinLongitude() {
        return this.minLongitude;
    }

    public final int getTargetDistanceType() {
        return this.targetDistanceType;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        setMaskView();
        ProgressButton r0 = getMProgressButton();
        Intrinsics.O10IXXX0X(r0, "<get-mProgressButton>(...)");
        String r1 = getString(R.string.off_line_map_download);
        Intrinsics.O10IXXX0X(r1, "getString(...)");
        ProgressButton.IiI10X(r0, r1, false, 2, null);
        getSearchView().setOnClickListener(new X1X1iOI(this));
    }

    public final boolean isInProgress() {
        return this.isInProgress;
    }

    public final boolean isMapPauseResume() {
        return this.isMapPauseResume;
    }

    public final int isNeedCalculateNumber() {
        return this.isNeedCalculateNumber;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_download_map;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int r7, int r8, @tb1 Intent r9) {
        super.onActivityResult(r7, r8, r9);
        if (r8 != (-1)) goto L16;
        if (r9 == null) goto L17;
        this.targetDistanceType = 2;
        this.isNeedCalculateNumber = 0;
        LatLng r10 = new LatLng(r9.getDoubleExtra("MAP_POINT_LAT", this.curLatitude), r9.getDoubleExtra("MAP_POINT_LON", this.curLongitude));
        this.curLatLng = new LatLng(r10.latitude, r10.longitude);
        if (this.isInChinaMainland == false) goto L10;
        BaiduMap r11 = this.mBaiDuMap;
        if (r11 == null) goto L14;
        r11.clear();
    L14:
        I100X1.O00(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C34421(this, r10, null), 3, null);
        return;
    L10:
        GoogleMap r12 = this.mGoogleMap;
        if (r12 != null) goto L13;
        Intrinsics.XXO("mGoogleMap");
        r12 = null;
    L13:
        r12.clear();
        goto L14
    L17:
        return;
    }

    public final void onBottomClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        if (this.isInProgress == true) goto L6;
        showTitlePopup();
        return;
    L6:
        ToastUtils.showLong(getString(R.string.is_it_in_progress_tip), new Object[0]);
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    @SuppressLint({"MissingPermission"})
    public void onCreate(@tb1 Bundle r4) {
        super.onCreate(r4);
        if (this.isInChinaMainland == false) goto L8;
        getMGMapView().setVisibility(8);
        TextureMapView r5 = getMBMapView();
        if (r5 == null) goto L7;
        r5.setVisibility(0);
    L7:
        TextureMapView r6 = getMBMapView();
        r6.showZoomControls(false);
        r6.showScaleControl(false);
        BaiduMap r7 = getMBMapView().getMap();
        r7.setCompassEnable(false);
        this.mBaiDuMap = r7;
        setMapColorScheme();
        startLocation();
    L12:
        TextView r8 = getMTipTitle();
        if (this.userProfile.getUnit() != 0) goto L15;
        String r0 = getString(R.string.maps_off_tip1);
    L16:
        r8.setText(r0);
        return;
    L15:
        r0 = getString(R.string.maps_off_tip3);
        goto L16
    L8:
        getMGMapView().setVisibility(0);
        TextureMapView r1 = getMBMapView();
        if (r1 == null) goto L11;
        r1.setVisibility(8);
    L11:
        getMGMapView().onCreate(r4);
        getMGMapView().getMapAsync(new iOIXI1II0(this));
        goto L12
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.isInChinaMainland == false) goto L8;
        TextureMapView r0 = getMBMapView();
        if (r0 == null) goto L10;
        r0.onDestroy();
        return;
    L10:
        return;
    L8:
        getMGMapView().onDestroy();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        if (this.isInChinaMainland == false) goto L8;
        TextureMapView r0 = getMBMapView();
        if (r0 == null) goto L10;
        r0.onPause();
        return;
    L10:
        return;
    L8:
        getMGMapView().onPause();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.isInChinaMainland == false) goto L8;
        TextureMapView r0 = getMBMapView();
        if (r0 == null) goto L10;
        r0.onResume();
        return;
    L10:
        return;
    L8:
        getMGMapView().onResume();
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }

    public final void onTitleRightClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        addOffLineMap();
    }

    public final void setCurLatitude(double r1) {
        this.curLatitude = r1;
    }

    public final void setCurLongitude(double r1) {
        this.curLongitude = r1;
    }

    public final void setInProgress(boolean r1) {
        this.isInProgress = r1;
    }

    public final void setMMaskCoordinates(@aa1 MaskView.OXO1 r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mMaskCoordinates = r2;
    }

    public final void setMStartIcon(int r1) {
        this.mStartIcon = r1;
    }

    public final void setMapPauseResume(boolean r1) {
        this.isMapPauseResume = r1;
    }

    public final void setMaxLatitude(double r1) {
        this.maxLatitude = r1;
    }

    public final void setMaxLongitude(double r1) {
        this.maxLongitude = r1;
    }

    public final void setMinLatitude(double r1) {
        this.minLatitude = r1;
    }

    public final void setMinLongitude(double r1) {
        this.minLongitude = r1;
    }

    public final void setNeedCalculateNumber(int r1) {
        this.isNeedCalculateNumber = r1;
    }

    public final void setTargetDistanceType(int r1) {
        this.targetDistanceType = r1;
    }
}
