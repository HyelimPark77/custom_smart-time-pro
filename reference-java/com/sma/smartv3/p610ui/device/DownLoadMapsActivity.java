package com.sma.smartv3.p610ui.device;

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
import com.android.mltcode.paycertificationapi.C2702ms;
import com.android.mltcode.paycertificationapi.C2743ns;
import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.C2999uk;
import com.android.mltcode.paycertificationapi.IO0OI;
import com.android.mltcode.paycertificationapi.O00IXIOI1;
import com.android.mltcode.paycertificationapi.OOiIO0;
import com.android.mltcode.paycertificationapi.XX01Oi;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.hr1;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i01I1i1X;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.iii1ii;
import com.android.mltcode.paycertificationapi.l76;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uz0;
import com.applovin.sdk.AppLovinErrorCodes;
import com.baidu.mapapi.map.BaiduMap;
import com.baidu.mapapi.map.MapStatus;
import com.baidu.mapapi.map.MapStatusUpdateFactory;
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
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.UiSettings;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.gson.Gson;
import com.google.maps.android.SphericalUtil;
import com.jieli.watchtesttool.tool.upgrade.OTAManager;
import com.sma.androidnetworklib.method.HttpProgressCallback;
import com.sma.smartv3.location.CustomLocation;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.model.OffLineGenerateFileVo;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.p610ui.device.DownLoadMapsActivity;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nDownLoadMapsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DownLoadMapsActivity.kt\ncom/sma/smartv3/ui/device/DownLoadMapsActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,990:1\n19#2:991\n15#2:992\n173#3,7:993\n180#3,3:1001\n143#3,7:1004\n183#3:1011\n1#4:1000\n1#4:1012\n*S KotlinDebug\n*F\n+ 1 DownLoadMapsActivity.kt\ncom/sma/smartv3/ui/device/DownLoadMapsActivity\n*L\n98#1:991\n98#1:992\n359#1:993,7\n359#1:1001,3\n359#1:1004,7\n359#1:1011\n359#1:1000\n*E\n"})
public final class DownLoadMapsActivity extends BaseActivity {

    @aa1
    public static final OXO1 Companion = new OXO1(null);
    public static final int MAP_DEF_DIS = 2;
    public static final int MAP_MAX_DIS = 3;
    public static final int MAP_MIN_DIS = 1;
    public static final int MAP_NOT_PROCESSED = 0;
    private LatLng curLatLng;
    private double curLatitude;
    private double curLongitude;
    private float curZoom;
    private float googleCurZoom;
    private boolean isInChinaMainland;
    private boolean isInProgress;
    private boolean isMapPauseResume;
    private int isNeedCalculateNumber;

    @tb1
    private BaiduMap mBaiDuMap;
    private GoogleMap mGoogleMap;

    @tb1
    private C2702ms mLocationClient;

    @tb1
    private go0 mLocationServerPopup;
    public MaskView.OXO1 mMaskCoordinates;

    @aa1
    private final Lazy mMaskView$delegate;
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

    @aa1
    private final String TAG = "DownLoadMapsActivity";

    @aa1
    private final Lazy mRootView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OiO0X
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DownLoadMapsActivity.mRootView_delegate$lambda$0(this.f3731IO);
        }
    });

    @aa1
    private final File mMapDir = uz0.iXiX011(sz0.OXO1);

    @aa1
    private final Lazy mProgressButton$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IX111
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DownLoadMapsActivity.mProgressButton_delegate$lambda$0(this.f1958IO);
        }
    });

    @aa1
    private final Lazy mGMapView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.I10i1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DownLoadMapsActivity.mGMapView_delegate$lambda$0(this.f1325IO);
        }
    });

    @aa1
    private final Lazy mBMapView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.I001X
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DownLoadMapsActivity.mBMapView_delegate$lambda$0(this.f1013IO);
        }
    });

    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public OXO1() {
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.device.DownLoadMapsActivity$onActivityResult$1, reason: case insensitive filesystem */
    @DebugMetadata(m39465c = "com.sma.smartv3.ui.device.DownLoadMapsActivity$onActivityResult$1", m39466f = "DownLoadMapsActivity.kt", m39467i = {}, m39468l = {633, 638}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
    public static final class C289751 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        final /* synthetic */ LatLng $mLatLng;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C289751(LatLng latLng, Continuation<? super C289751> continuation) {
            super(2, continuation);
            this.$mLatLng = latLng;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DownLoadMapsActivity.this.new C289751(this.$mLatLng, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
            return ((C289751) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
        
            if (kotlinx.coroutines.DelayKt.XIi00iiXO(50, r19) == r1) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objI0iXXO = C2798pb.I0iXXO();
            int i = this.label;
            if (i == 0) {
                ResultKt.X1ii(obj);
                this.label = 1;
                if (DelayKt.XIi00iiXO(100L, this) != objI0iXXO) {
                }
                return objI0iXXO;
            }
            if (i == 1) {
                ResultKt.X1ii(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.X1ii(obj);
            }
            DownLoadMapsActivity downLoadMapsActivity = DownLoadMapsActivity.this;
            LatLng latLng = this.$mLatLng;
            downLoadMapsActivity.showMarkerOptions(new CustomLocation(latLng.latitude, latLng.longitude, 0.0d, 0.0f, 0, 0L, null, 0.0f, 0.0f, 0.0f, 1020, null));
            DownLoadMapsActivity.this.onCalculateZoom();
            return Unit.OXO1;
            if (!DownLoadMapsActivity.this.isInChinaMainland) {
                DownLoadMapsActivity.this.setTargetDistanceType(2);
                DownLoadMapsActivity.this.onCalculateZoom();
                this.label = 2;
            }
            DownLoadMapsActivity downLoadMapsActivity2 = DownLoadMapsActivity.this;
            LatLng latLng2 = this.$mLatLng;
            downLoadMapsActivity2.showMarkerOptions(new CustomLocation(latLng2.latitude, latLng2.longitude, 0.0d, 0.0f, 0, 0L, null, 0.0f, 0.0f, 0.0f, 1020, null));
            DownLoadMapsActivity.this.onCalculateZoom();
            return Unit.OXO1;
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.device.DownLoadMapsActivity$onCalculateZoom$1, reason: case insensitive filesystem */
    @DebugMetadata(m39465c = "com.sma.smartv3.ui.device.DownLoadMapsActivity$onCalculateZoom$1", m39466f = "DownLoadMapsActivity.kt", m39467i = {}, m39468l = {}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
    public static final class C289761 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        int label;

        public C289761(Continuation<? super C289761> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DownLoadMapsActivity.this.new C289761(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
            return ((C289761) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C2798pb.I0iXXO();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.X1ii(obj);
            if (!DownLoadMapsActivity.this.isInChinaMainland) {
                GoogleMap googleMap = DownLoadMapsActivity.this.mGoogleMap;
                if (googleMap == null) {
                    Intrinsics.XXO("mGoogleMap");
                    googleMap = null;
                }
                UiSettings uiSettings = googleMap.getUiSettings();
                Intrinsics.O10IXXX0X(uiSettings, "getUiSettings(...)");
                uiSettings.setScrollGesturesEnabled(false);
                uiSettings.setZoomGesturesEnabled(false);
                GoogleMap googleMap2 = DownLoadMapsActivity.this.mGoogleMap;
                if (googleMap2 == null) {
                    Intrinsics.XXO("mGoogleMap");
                    googleMap2 = null;
                }
                LatLng latLngFromScreenLocation = googleMap2.getProjection().fromScreenLocation(new Point((int) DownLoadMapsActivity.this.getMMaskCoordinates().OIX0iXi(), (int) DownLoadMapsActivity.this.getMMaskCoordinates().XXI()));
                Intrinsics.O10IXXX0X(latLngFromScreenLocation, "fromScreenLocation(...)");
                GoogleMap googleMap3 = DownLoadMapsActivity.this.mGoogleMap;
                if (googleMap3 == null) {
                    Intrinsics.XXO("mGoogleMap");
                    googleMap3 = null;
                }
                LatLng latLngFromScreenLocation2 = googleMap3.getProjection().fromScreenLocation(new Point((int) DownLoadMapsActivity.this.getMMaskCoordinates().I0iXXO(), (int) DownLoadMapsActivity.this.getMMaskCoordinates().XXI()));
                Intrinsics.O10IXXX0X(latLngFromScreenLocation2, "fromScreenLocation(...)");
                float fCalculateDistanceGoogle = DownLoadMapsActivity.this.calculateDistanceGoogle(latLngFromScreenLocation, latLngFromScreenLocation2);
                int targetDistanceType = DownLoadMapsActivity.this.getTargetDistanceType();
                if (targetDistanceType == 1) {
                    double d = fCalculateDistanceGoogle;
                    if ((5000.0d > d || d > 6000.0d) && DownLoadMapsActivity.this.isNeedCalculateNumber() < 10) {
                        DownLoadMapsActivity.this.setNeedCalculateNumber(DownLoadMapsActivity.this.isNeedCalculateNumber() + 1);
                        DownLoadMapsActivity.this.setComputeOffset(2775.0d);
                    } else {
                        DownLoadMapsActivity.this.setTargetDistanceType(0);
                        DownLoadMapsActivity.this.setNeedCalculateNumber(0);
                    }
                } else if (targetDistanceType == 2) {
                    double d2 = fCalculateDistanceGoogle;
                    if ((25000.0d > d2 || d2 > 26000.0d) && DownLoadMapsActivity.this.isNeedCalculateNumber() < 10) {
                        DownLoadMapsActivity.this.setNeedCalculateNumber(DownLoadMapsActivity.this.isNeedCalculateNumber() + 1);
                        DownLoadMapsActivity.this.setComputeOffset(12775.0d);
                    } else {
                        DownLoadMapsActivity.this.setTargetDistanceType(0);
                        DownLoadMapsActivity.this.setNeedCalculateNumber(0);
                    }
                } else if (targetDistanceType != 3) {
                    DownLoadMapsActivity.this.setTargetDistanceType(0);
                    DownLoadMapsActivity.this.setNeedCalculateNumber(0);
                } else {
                    double d3 = fCalculateDistanceGoogle;
                    if ((49000.0d > d3 || d3 > 50000.0d) && DownLoadMapsActivity.this.isNeedCalculateNumber() < 10) {
                        DownLoadMapsActivity.this.setNeedCalculateNumber(DownLoadMapsActivity.this.isNeedCalculateNumber() + 1);
                        DownLoadMapsActivity.this.setComputeOffset(25000.0d);
                    } else {
                        DownLoadMapsActivity.this.setTargetDistanceType(0);
                        DownLoadMapsActivity.this.setNeedCalculateNumber(0);
                    }
                }
                uiSettings.setScrollGesturesEnabled(true);
                uiSettings.setZoomGesturesEnabled(true);
            } else {
                if (DownLoadMapsActivity.this.mBaiDuMap == null) {
                    return Unit.OXO1;
                }
                BaiduMap baiduMap = DownLoadMapsActivity.this.mBaiDuMap;
                Intrinsics.XXI(baiduMap);
                com.baidu.mapapi.model.LatLng latLngFromScreenLocation3 = baiduMap.getProjection().fromScreenLocation(new Point((int) DownLoadMapsActivity.this.getMMaskCoordinates().OIX0iXi(), (int) DownLoadMapsActivity.this.getMMaskCoordinates().XXI()));
                BaiduMap baiduMap2 = DownLoadMapsActivity.this.mBaiDuMap;
                Intrinsics.XXI(baiduMap2);
                com.baidu.mapapi.model.LatLng latLngFromScreenLocation4 = baiduMap2.getProjection().fromScreenLocation(new Point((int) DownLoadMapsActivity.this.getMMaskCoordinates().I0iXXO(), (int) DownLoadMapsActivity.this.getMMaskCoordinates().XXI()));
                DownLoadMapsActivity downLoadMapsActivity = DownLoadMapsActivity.this;
                Intrinsics.XXI(latLngFromScreenLocation3);
                Intrinsics.XXI(latLngFromScreenLocation4);
                float fCalculateDistance = downLoadMapsActivity.calculateDistance(latLngFromScreenLocation3, latLngFromScreenLocation4);
                int targetDistanceType2 = DownLoadMapsActivity.this.getTargetDistanceType();
                if (targetDistanceType2 == 1) {
                    double d4 = fCalculateDistance;
                    if ((5000.0d > d4 || d4 > 6000.0d) && DownLoadMapsActivity.this.isNeedCalculateNumber() < 10) {
                        DownLoadMapsActivity.this.setNeedCalculateNumber(DownLoadMapsActivity.this.isNeedCalculateNumber() + 1);
                        DownLoadMapsActivity.this.setComputeOffset(2775.0d);
                    } else {
                        DownLoadMapsActivity.this.setTargetDistanceType(0);
                        DownLoadMapsActivity.this.setNeedCalculateNumber(0);
                    }
                } else if (targetDistanceType2 == 2) {
                    double d5 = fCalculateDistance;
                    if ((25000.0d > d5 || d5 > 26000.0d) && DownLoadMapsActivity.this.isNeedCalculateNumber() < 10) {
                        DownLoadMapsActivity.this.setNeedCalculateNumber(DownLoadMapsActivity.this.isNeedCalculateNumber() + 1);
                        DownLoadMapsActivity.this.setComputeOffset(12775.0d);
                    } else {
                        DownLoadMapsActivity.this.setTargetDistanceType(0);
                        DownLoadMapsActivity.this.setNeedCalculateNumber(0);
                    }
                } else if (targetDistanceType2 != 3) {
                    DownLoadMapsActivity.this.setTargetDistanceType(0);
                    DownLoadMapsActivity.this.setNeedCalculateNumber(0);
                } else {
                    double d6 = fCalculateDistance;
                    if ((49000.0d > d6 || d6 > 50000.0d) && DownLoadMapsActivity.this.isNeedCalculateNumber() < 10) {
                        DownLoadMapsActivity.this.setNeedCalculateNumber(DownLoadMapsActivity.this.isNeedCalculateNumber() + 1);
                        DownLoadMapsActivity.this.setComputeOffset(25000.0d);
                    } else {
                        DownLoadMapsActivity.this.setTargetDistanceType(0);
                        DownLoadMapsActivity.this.setNeedCalculateNumber(0);
                    }
                }
            }
            return Unit.OXO1;
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.device.DownLoadMapsActivity$onLocationClient$1, reason: case insensitive filesystem */
    @DebugMetadata(m39465c = "com.sma.smartv3.ui.device.DownLoadMapsActivity$onLocationClient$1", m39466f = "DownLoadMapsActivity.kt", m39467i = {}, m39468l = {}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
    public static final class C289771 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.sma.smartv3.ui.device.DownLoadMapsActivity$onLocationClient$1$OXO1 */
        public static final class OXO1 implements IO0OI {
            public final /* synthetic */ DownLoadMapsActivity OXO1;

            /* JADX INFO: renamed from: com.sma.smartv3.ui.device.DownLoadMapsActivity$onLocationClient$1$OXO1$OXO1 */
            public static final class C22044OXO1 implements BaiduMap.OnMapStatusChangeListener {
                public final /* synthetic */ DownLoadMapsActivity OXO1;

                public C22044OXO1(DownLoadMapsActivity downLoadMapsActivity) {
                    this.OXO1 = downLoadMapsActivity;
                }

                @Override // com.baidu.mapapi.map.BaiduMap.OnMapStatusChangeListener
                public void onMapStatusChange(MapStatus mapStatus) {
                }

                @Override // com.baidu.mapapi.map.BaiduMap.OnMapStatusChangeListener
                public void onMapStatusChangeFinish(MapStatus mapStatus) {
                    this.OXO1.checkZoomRestrictions();
                }

                @Override // com.baidu.mapapi.map.BaiduMap.OnMapStatusChangeListener
                public void onMapStatusChangeStart(MapStatus mapStatus) {
                }

                @Override // com.baidu.mapapi.map.BaiduMap.OnMapStatusChangeListener
                public void onMapStatusChangeStart(MapStatus mapStatus, int i) {
                }
            }

            public OXO1(DownLoadMapsActivity downLoadMapsActivity) {
                this.OXO1 = downLoadMapsActivity;
            }

            /* JADX INFO: renamed from: iO */
            public static final void m38359iO(DownLoadMapsActivity downLoadMapsActivity) {
                downLoadMapsActivity.checkZoomRestrictions();
            }

            @Override // com.android.mltcode.paycertificationapi.IO0OI
            public void OXO1(CustomLocation location) {
                Intrinsics.X0O(location, "location");
                LatLng latLng = new LatLng(location.XO0O10(), location.IiI10X());
                this.OXO1.curLatLng = new LatLng(latLng.latitude, latLng.longitude);
                if (this.OXO1.isInChinaMainland) {
                    this.OXO1.setComputeOffset(12775.0d);
                    BaiduMap baiduMap = this.OXO1.mBaiDuMap;
                    if (baiduMap != null) {
                        baiduMap.setOnMapStatusChangeListener(new C22044OXO1(this.OXO1));
                    }
                } else {
                    try {
                        GoogleMap googleMap = this.OXO1.mGoogleMap;
                        GoogleMap googleMap2 = null;
                        if (googleMap == null) {
                            Intrinsics.XXO("mGoogleMap");
                            googleMap = null;
                        }
                        DownLoadMapsActivity downLoadMapsActivity = this.OXO1;
                        LatLng latLng2 = downLoadMapsActivity.curLatLng;
                        if (latLng2 == null) {
                            Intrinsics.XXO("curLatLng");
                            latLng2 = null;
                        }
                        double d = latLng2.latitude;
                        LatLng latLng3 = downLoadMapsActivity.curLatLng;
                        if (latLng3 == null) {
                            Intrinsics.XXO("curLatLng");
                            latLng3 = null;
                        }
                        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(d, latLng3.longitude), downLoadMapsActivity.googleCurZoom));
                        this.OXO1.setComputeOffset(12775.0d);
                        GoogleMap googleMap3 = this.OXO1.mGoogleMap;
                        if (googleMap3 == null) {
                            Intrinsics.XXO("mGoogleMap");
                        } else {
                            googleMap2 = googleMap3;
                        }
                        final DownLoadMapsActivity downLoadMapsActivity2 = this.OXO1;
                        googleMap2.setOnCameraIdleListener(new GoogleMap.OnCameraIdleListener() { // from class: com.android.mltcode.paycertificationapi.XOXIi1
                            @Override // com.google.android.gms.maps.GoogleMap.OnCameraIdleListener
                            public final void onCameraIdle() {
                                DownLoadMapsActivity.C289771.OXO1.m38359iO(downLoadMapsActivity2);
                            }
                        });
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                this.OXO1.showMarkerOptions(location);
                this.OXO1.stopLocationClient();
            }

            @Override // com.android.mltcode.paycertificationapi.IO0OI
            public void onError(String message) {
                Intrinsics.X0O(message, "message");
            }
        }

        public C289771(Continuation<? super C289771> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DownLoadMapsActivity.this.new C289771(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
            return ((C289771) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C2798pb.I0iXXO();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.X1ii(obj);
            DownLoadMapsActivity downLoadMapsActivity = DownLoadMapsActivity.this;
            downLoadMapsActivity.mLocationClient = C2743ns.XIi00iiXO(new OXO1(downLoadMapsActivity), false, 2, null);
            C2702ms c2702ms = DownLoadMapsActivity.this.mLocationClient;
            if (c2702ms != null) {
                c2702ms.IiI10X(R.string.show_map_and_phone_get_location_desc, false);
            }
            return Unit.OXO1;
        }
    }

    public DownLoadMapsActivity() {
        a01 a01Var = a01.OXO1;
        this.isInChinaMainland = a01Var.OXO1().getBoolean(b01.XiOIO, true);
        this.mMaskView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XiXiI10
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return DownLoadMapsActivity.mMaskView_delegate$lambda$0(this.f5351IO);
            }
        });
        this.mTipTitle$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.X11ii1OOI
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return DownLoadMapsActivity.mTipTitle_delegate$lambda$0(this.f4239IO);
            }
        });
        SPUtils sPUtilsIiI10X = a01Var.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        this.userProfile = (AppUser) (objFromJson != null ? objFromJson : appUser);
        this.mStartIcon = R.drawable.icon_sport_map_rate_start;
        this.searchView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iXX0I0
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return DownLoadMapsActivity.searchView_delegate$lambda$0(this.f8382IO);
            }
        });
        this.minDistance = 5000.0d;
        this.maxDistance = 50000.0d;
        this.targetDistanceType = 2;
        this.curZoom = 11.043798f;
        this.googleCurZoom = 10.6019125f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float calculateDistance(com.baidu.mapapi.model.LatLng latLng, com.baidu.mapapi.model.LatLng latLng2) {
        return (float) DistanceUtil.getDistance(latLng, latLng2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkZoomRestrictions() {
        float f;
        String str;
        String str2;
        onCalculateZoom();
        if (this.isInChinaMainland) {
            BaiduMap baiduMap = this.mBaiDuMap;
            if (baiduMap == null) {
                return;
            }
            Intrinsics.XXI(baiduMap);
            com.baidu.mapapi.model.LatLng latLngFromScreenLocation = baiduMap.getProjection().fromScreenLocation(new Point((int) getMMaskCoordinates().OIX0iXi(), (int) getMMaskCoordinates().XXI()));
            BaiduMap baiduMap2 = this.mBaiDuMap;
            Intrinsics.XXI(baiduMap2);
            com.baidu.mapapi.model.LatLng latLngFromScreenLocation2 = baiduMap2.getProjection().fromScreenLocation(new Point((int) getMMaskCoordinates().I0iXXO(), (int) getMMaskCoordinates().XXI()));
            Intrinsics.XXI(latLngFromScreenLocation);
            Intrinsics.XXI(latLngFromScreenLocation2);
            float fCalculateDistance = calculateDistance(latLngFromScreenLocation, latLngFromScreenLocation2);
            f = (fCalculateDistance <= 49000.0f || fCalculateDistance > 50000.0f) ? fCalculateDistance : 50000.0f;
            if (this.userProfile.getUnit() == 0) {
                str2 = ((int) (f / 1000)) + "KM";
            } else {
                str2 = ((int) l76.XO0O10(f / 1000)) + "mi";
            }
            if (this.isNeedCalculateNumber == 0) {
                getMMaskView().setDirectionsText(str2);
            }
            double d = fCalculateDistance;
            if (d > this.maxDistance) {
                this.targetDistanceType = 3;
                onCalculateZoom();
                return;
            } else {
                if (d < this.minDistance) {
                    this.targetDistanceType = 1;
                    onCalculateZoom();
                    return;
                }
                return;
            }
        }
        GoogleMap googleMap = this.mGoogleMap;
        GoogleMap googleMap2 = null;
        if (googleMap == null) {
            Intrinsics.XXO("mGoogleMap");
            googleMap = null;
        }
        LatLng latLngFromScreenLocation3 = googleMap.getProjection().fromScreenLocation(new Point((int) getMMaskCoordinates().OIX0iXi(), (int) getMMaskCoordinates().XXI()));
        Intrinsics.O10IXXX0X(latLngFromScreenLocation3, "fromScreenLocation(...)");
        GoogleMap googleMap3 = this.mGoogleMap;
        if (googleMap3 == null) {
            Intrinsics.XXO("mGoogleMap");
        } else {
            googleMap2 = googleMap3;
        }
        LatLng latLngFromScreenLocation4 = googleMap2.getProjection().fromScreenLocation(new Point((int) getMMaskCoordinates().I0iXXO(), (int) getMMaskCoordinates().XXI()));
        Intrinsics.O10IXXX0X(latLngFromScreenLocation4, "fromScreenLocation(...)");
        float fCalculateDistanceGoogle = calculateDistanceGoogle(latLngFromScreenLocation3, latLngFromScreenLocation4);
        f = (fCalculateDistanceGoogle <= 49000.0f || fCalculateDistanceGoogle > 50000.0f) ? fCalculateDistanceGoogle : 50000.0f;
        if (this.userProfile.getUnit() == 0) {
            str = ((int) (f / 1000)) + "KM";
        } else {
            str = ((int) l76.XO0O10(f / 1000)) + "mi";
        }
        if (this.isNeedCalculateNumber == 0) {
            getMMaskView().setDirectionsText(str);
        }
        double d2 = fCalculateDistanceGoogle;
        if (d2 > this.maxDistance) {
            this.targetDistanceType = 3;
            onCalculateZoom();
        } else if (d2 < this.minDistance) {
            this.targetDistanceType = 1;
            onCalculateZoom();
        }
    }

    private final void downloadMap(String str, final String str2) {
        getMProgressButton().setProgress(0.0f);
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        String absolutePath = this.mMapDir.getAbsolutePath();
        Intrinsics.O10IXXX0X(absolutePath, "getAbsolutePath(...)");
        netWorkUtils.download(str, absolutePath, str2 + OTAManager.OTA_ZIP_SUFFIX, new HttpProgressCallback<String>() { // from class: com.sma.smartv3.ui.device.DownLoadMapsActivity.downloadMap.1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(String str3) {
                i1O0OXO1O.OXO1.OXO1(DownLoadMapsActivity.this.TAG + " download -> handleResponse");
                XX01Oi.IiI10X(LifecycleOwnerKt.getLifecycleScope(DownLoadMapsActivity.this), null, null, new DownLoadMapsActivity$downloadMap$1$handleResponse$1(DownLoadMapsActivity.this, str2, null), 3, null);
                DownLoadMapsActivity.this.setInProgress(false);
                ProgressButton mProgressButton = DownLoadMapsActivity.this.getMProgressButton();
                Intrinsics.O10IXXX0X(mProgressButton, "access$getMProgressButton(...)");
                String string = DownLoadMapsActivity.this.getString(R.string.coach_plan_complete);
                Intrinsics.O10IXXX0X(string, "getString(...)");
                ProgressButton.IiI10X(mProgressButton, string, false, 2, null);
                DownLoadMapsActivity.this.finish();
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                i1O0OXO1O.OXO1.XIi00iiXO(DownLoadMapsActivity.this.TAG + "  download handleError error: " + error);
                DownLoadMapsActivity.this.setInProgress(false);
                ProgressButton mProgressButton = DownLoadMapsActivity.this.getMProgressButton();
                Intrinsics.O10IXXX0X(mProgressButton, "access$getMProgressButton(...)");
                String string = DownLoadMapsActivity.this.getString(R.string.generate_failed);
                Intrinsics.O10IXXX0X(string, "getString(...)");
                ProgressButton.IiI10X(mProgressButton, string, false, 2, null);
            }

            @Override // com.sma.androidnetworklib.method.HttpProgressCallback
            public void handleProgress(int i) {
                DownLoadMapsActivity.this.getMProgressButton().setProgress(i / 100);
            }
        });
    }

    private final TextureMapView getMBMapView() {
        return (TextureMapView) this.mBMapView$delegate.getValue();
    }

    private final CustomGoogleMapView getMGMapView() {
        return (CustomGoogleMapView) this.mGMapView$delegate.getValue();
    }

    private final MaskView getMMaskView() {
        return (MaskView) this.mMaskView$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ProgressButton getMProgressButton() {
        return (ProgressButton) this.mProgressButton$delegate.getValue();
    }

    private final View getMRootView() {
        return (View) this.mRootView$delegate.getValue();
    }

    private final TextView getMTipTitle() {
        return (TextView) this.mTipTitle$delegate.getValue();
    }

    private final View getSearchView() {
        return (View) this.searchView$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(DownLoadMapsActivity downLoadMapsActivity, View view) {
        Bundle bundle = new Bundle();
        bundle.putString("mArg0", null);
        bundle.putInt("mArg1", -1);
        bundle.putParcelable("mArg2", null);
        bundle.putSerializable("mArg3", null);
        Intent intent = new Intent(downLoadMapsActivity, (Class<?>) SearchMapsActivity.class);
        intent.putExtras(bundle);
        downLoadMapsActivity.startActivityForResult(intent, 0);
    }

    private final void locationServerRemind() {
        if (this.mLocationServerPopup == null) {
            go0 go0Var = new go0(this, 0, 2, null);
            go0Var.O1O(R.string.location_server_notification);
            go0.X11iII1O1(go0Var, Integer.valueOf(R.string.cancel), null, 2, null);
            go0Var.X1IX(R.string.settings, new Function0() { // from class: com.android.mltcode.paycertificationapi.XIO1X0XX
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(DownLoadMapsActivity.locationServerRemind$lambda$0$0(this.f4539IO));
                }
            });
            this.mLocationServerPopup = go0Var;
        }
        go0 go0Var2 = this.mLocationServerPopup;
        if (go0Var2 != null) {
            go0Var2.IIX1OXO();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean locationServerRemind$lambda$0$0(DownLoadMapsActivity downLoadMapsActivity) {
        downLoadMapsActivity.startActivityForResult(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"), 2);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextureMapView mBMapView_delegate$lambda$0(DownLoadMapsActivity downLoadMapsActivity) {
        return (TextureMapView) downLoadMapsActivity.findViewById(R.id.bMapView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CustomGoogleMapView mGMapView_delegate$lambda$0(DownLoadMapsActivity downLoadMapsActivity) {
        return (CustomGoogleMapView) downLoadMapsActivity.findViewById(R.id.gMapView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MaskView mMaskView_delegate$lambda$0(DownLoadMapsActivity downLoadMapsActivity) {
        return (MaskView) downLoadMapsActivity.findViewById(R.id.abh_maskView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProgressButton mProgressButton_delegate$lambda$0(DownLoadMapsActivity downLoadMapsActivity) {
        return (ProgressButton) downLoadMapsActivity.findViewById(R.id.btn_bottom);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View mRootView_delegate$lambda$0(DownLoadMapsActivity downLoadMapsActivity) {
        return downLoadMapsActivity.findViewById(R.id.abh_root_view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView mTipTitle_delegate$lambda$0(DownLoadMapsActivity downLoadMapsActivity) {
        return (TextView) downLoadMapsActivity.findViewById(R.id.download_maps_tip_title);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCalculateZoom() {
        XX01Oi.IiI10X(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C289761(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$2(DownLoadMapsActivity downLoadMapsActivity, GoogleMap googleMap) {
        Intrinsics.X0O(googleMap, "googleMap");
        downLoadMapsActivity.mGoogleMap = googleMap;
        if (googleMap == null) {
            Intrinsics.XXO("mGoogleMap");
            googleMap = null;
        }
        UiSettings uiSettings = googleMap.getUiSettings();
        uiSettings.setZoomControlsEnabled(false);
        uiSettings.setScrollGesturesEnabled(true);
        uiSettings.setZoomGesturesEnabled(true);
        uiSettings.setTiltGesturesEnabled(false);
        downLoadMapsActivity.setMapColorScheme();
        downLoadMapsActivity.startLocation();
    }

    private final void onLocationClient() {
        XX01Oi.IiI10X(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C289771(null), 3, null);
    }

    private final void requestLocationPermission() {
        hr1.XXIIO1i11(hr1.OXO1, this, false, new Function1() { // from class: com.android.mltcode.paycertificationapi.OIXX0O0iI
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DownLoadMapsActivity.requestLocationPermission$lambda$0(this.f3051IO, ((Boolean) obj).booleanValue());
            }
        }, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestLocationPermission$lambda$0(DownLoadMapsActivity downLoadMapsActivity, boolean z) {
        if (z) {
            downLoadMapsActivity.onLocationClient();
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View searchView_delegate$lambda$0(DownLoadMapsActivity downLoadMapsActivity) {
        return downLoadMapsActivity.findViewById(R.id.abh_search_map_et);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setComputeOffset(double d) {
        double d2;
        if (d <= 3000.0d) {
            d2 = 0.03d;
        } else {
            d2 = d <= 13000.0d ? 0.15d : 0.25d;
        }
        C2999uk c2999uk = C2999uk.OXO1;
        LatLng latLng = this.curLatLng;
        GoogleMap googleMap = null;
        if (latLng == null) {
            Intrinsics.XXO("curLatLng");
            latLng = null;
        }
        double d3 = latLng.latitude - d2;
        LatLng latLng2 = this.curLatLng;
        if (latLng2 == null) {
            Intrinsics.XXO("curLatLng");
            latLng2 = null;
        }
        Pair<Double, Double> pairOXO1 = c2999uk.OXO1(d3, latLng2.longitude, d, 270.0d);
        LatLng latLng3 = this.curLatLng;
        if (latLng3 == null) {
            Intrinsics.XXO("curLatLng");
            latLng3 = null;
        }
        double d4 = latLng3.latitude - d2;
        LatLng latLng4 = this.curLatLng;
        if (latLng4 == null) {
            Intrinsics.XXO("curLatLng");
            latLng4 = null;
        }
        Pair<Double, Double> pairOXO2 = c2999uk.OXO1(d4, latLng4.longitude, d, 0.0d);
        LatLng latLng5 = this.curLatLng;
        if (latLng5 == null) {
            Intrinsics.XXO("curLatLng");
            latLng5 = null;
        }
        double d5 = latLng5.latitude - d2;
        LatLng latLng6 = this.curLatLng;
        if (latLng6 == null) {
            Intrinsics.XXO("curLatLng");
            latLng6 = null;
        }
        Pair<Double, Double> pairOXO3 = c2999uk.OXO1(d5, latLng6.longitude, d, 180.0d);
        LatLng latLng7 = this.curLatLng;
        if (latLng7 == null) {
            Intrinsics.XXO("curLatLng");
            latLng7 = null;
        }
        double d6 = latLng7.latitude - d2;
        LatLng latLng8 = this.curLatLng;
        if (latLng8 == null) {
            Intrinsics.XXO("curLatLng");
            latLng8 = null;
        }
        Pair<Double, Double> pairOXO4 = c2999uk.OXO1(d6, latLng8.longitude, d, 90.0d);
        if (this.isInChinaMainland) {
            LatLngBounds latLngBoundsBuild = new LatLngBounds.Builder().include(new com.baidu.mapapi.model.LatLng(pairOXO2.getFirst().doubleValue(), pairOXO2.getSecond().doubleValue())).include(new com.baidu.mapapi.model.LatLng(pairOXO3.getFirst().doubleValue(), pairOXO3.getSecond().doubleValue())).include(new com.baidu.mapapi.model.LatLng(pairOXO4.getFirst().doubleValue(), pairOXO4.getSecond().doubleValue())).include(new com.baidu.mapapi.model.LatLng(pairOXO1.getFirst().doubleValue(), pairOXO1.getSecond().doubleValue())).build();
            BaiduMap baiduMap = this.mBaiDuMap;
            if (baiduMap != null) {
                baiduMap.animateMapStatus(MapStatusUpdateFactory.newLatLngBounds(latLngBoundsBuild, 150, 0, 150, 0));
                return;
            }
            return;
        }
        com.google.android.gms.maps.model.LatLngBounds latLngBoundsBuild2 = new com.google.android.gms.maps.model.LatLngBounds.Builder().include(new LatLng(pairOXO2.getFirst().doubleValue(), pairOXO2.getSecond().doubleValue())).include(new LatLng(pairOXO3.getFirst().doubleValue(), pairOXO3.getSecond().doubleValue())).include(new LatLng(pairOXO4.getFirst().doubleValue(), pairOXO4.getSecond().doubleValue())).include(new LatLng(pairOXO1.getFirst().doubleValue(), pairOXO1.getSecond().doubleValue())).build();
        Intrinsics.O10IXXX0X(latLngBoundsBuild2, "build(...)");
        GoogleMap googleMap2 = this.mGoogleMap;
        if (googleMap2 == null) {
            Intrinsics.XXO("mGoogleMap");
        } else {
            googleMap = googleMap2;
        }
        googleMap.animateCamera(CameraUpdateFactory.newLatLngBounds(latLngBoundsBuild2, 150));
    }

    private final void setMapColorScheme() {
        int i = a01.OXO1.OXO1().getInt(b01.X0O, 2);
        if (this.isInChinaMainland) {
            return;
        }
        GoogleMap googleMap = null;
        if (i == 0) {
            GoogleMap googleMap2 = this.mGoogleMap;
            if (googleMap2 == null) {
                Intrinsics.XXO("mGoogleMap");
            } else {
                googleMap = googleMap2;
            }
            googleMap.setMapColorScheme(2);
            return;
        }
        if (i == 1) {
            GoogleMap googleMap3 = this.mGoogleMap;
            if (googleMap3 == null) {
                Intrinsics.XXO("mGoogleMap");
            } else {
                googleMap = googleMap3;
            }
            googleMap.setMapColorScheme(1);
            return;
        }
        if (i != 2) {
            return;
        }
        GoogleMap googleMap4 = this.mGoogleMap;
        if (googleMap4 == null) {
            Intrinsics.XXO("mGoogleMap");
        } else {
            googleMap = googleMap4;
        }
        googleMap.setMapColorScheme(0);
    }

    private final void setMaskView() {
        getMMaskView().m38892iO(ScreenUtils.getScreenWidth() + AppLovinErrorCodes.INCENTIVIZED_NO_AD_PRELOADED, 150);
        MaskView.OXO1 coordinates = getMMaskView().getCoordinates();
        Intrinsics.XXI(coordinates);
        setMMaskCoordinates(coordinates);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showMarkerOptions(CustomLocation customLocation) {
        if (!this.isInChinaMainland) {
            GoogleMap googleMap = this.mGoogleMap;
            if (googleMap == null) {
                Intrinsics.XXO("mGoogleMap");
                googleMap = null;
            }
            googleMap.addMarker(new MarkerOptions().position(new LatLng(customLocation.XO0O10(), customLocation.IiI10X())).icon(BitmapDescriptorFactory.fromResource(this.mStartIcon)));
            return;
        }
        BaiduMap baiduMap = this.mBaiDuMap;
        if (baiduMap != null) {
            com.baidu.mapapi.map.MarkerOptions markerOptionsZIndex = new com.baidu.mapapi.map.MarkerOptions().position(new com.baidu.mapapi.model.LatLng(customLocation.XO0O10(), customLocation.IiI10X())).icon(com.baidu.mapapi.map.BitmapDescriptorFactory.fromResource(this.mStartIcon)).draggable(false).flat(true).zIndex(9);
            markerOptionsZIndex.anchor(0.5f, 0.5f);
            baiduMap.addOverlay(markerOptionsZIndex);
        }
    }

    private final void showTitlePopup() {
        if (this.mTitlePopup == null) {
            iii1ii iii1iiVar = new iii1ii(this, 0, 2, null);
            iii1iiVar.XXX11i(R.string.map_naming);
            iii1iiVar.X01IiOiIi().setTextColor(ContextCompat.getColor(iii1iiVar.XO0O10(), R.color.line_color));
            iii1iiVar.X01IiOiIi().setFilters(new O00IXIOI1[]{new O00IXIOI1()});
            iii1iiVar.X11iII1O1(new Function1() { // from class: com.android.mltcode.paycertificationapi.OXX10
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return Boolean.valueOf(DownLoadMapsActivity.showTitlePopup$lambda$0$0(this.f3537IO, (String) obj));
                }
            });
            this.mTitlePopup = iii1iiVar;
        }
        iii1ii iii1iiVar2 = this.mTitlePopup;
        if (iii1iiVar2 != null) {
            iii1iiVar2.IIX1OXO();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showTitlePopup$lambda$0$0(DownLoadMapsActivity downLoadMapsActivity, final String text) throws IllegalAccessException, InstantiationException {
        File file;
        GoogleMap googleMap;
        boolean z;
        final DownLoadMapsActivity downLoadMapsActivity2 = downLoadMapsActivity;
        Intrinsics.X0O(text, "text");
        if (TextUtils.isEmpty(text)) {
            ToastUtils.showLong(R.string.create_tip_title);
            return false;
        }
        File[] fileArrListFiles = downLoadMapsActivity2.mMapDir.listFiles();
        if (fileArrListFiles == null) {
            file = null;
            break;
        }
        int length = fileArrListFiles.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                file = null;
                break;
            }
            file = fileArrListFiles[i];
            if (Intrinsics.XOO0ii0(file.getName(), text)) {
                break;
            }
            i++;
        }
        if (file != null) {
            ToastUtils.showLong(downLoadMapsActivity2.getString(R.string.file_exist), new Object[0]);
            return true;
        }
        if (downLoadMapsActivity2.isInChinaMainland) {
            BaiduMap baiduMap = downLoadMapsActivity2.mBaiDuMap;
            Intrinsics.XXI(baiduMap);
            com.baidu.mapapi.model.LatLng latLngFromScreenLocation = baiduMap.getProjection().fromScreenLocation(new Point((int) downLoadMapsActivity2.getMMaskCoordinates().OIX0iXi(), (int) downLoadMapsActivity2.getMMaskCoordinates().XXI()));
            BaiduMap baiduMap2 = downLoadMapsActivity2.mBaiDuMap;
            Intrinsics.XXI(baiduMap2);
            com.baidu.mapapi.model.LatLng latLngFromScreenLocation2 = baiduMap2.getProjection().fromScreenLocation(new Point((int) downLoadMapsActivity2.getMMaskCoordinates().OIX0iXi(), (int) downLoadMapsActivity2.getMMaskCoordinates().XOO0ii0()));
            BaiduMap baiduMap3 = downLoadMapsActivity2.mBaiDuMap;
            Intrinsics.XXI(baiduMap3);
            com.baidu.mapapi.model.LatLng latLngFromScreenLocation3 = baiduMap3.getProjection().fromScreenLocation(new Point((int) downLoadMapsActivity2.getMMaskCoordinates().I0iXXO(), (int) downLoadMapsActivity2.getMMaskCoordinates().XXI()));
            BaiduMap baiduMap4 = downLoadMapsActivity2.mBaiDuMap;
            Intrinsics.XXI(baiduMap4);
            com.baidu.mapapi.model.LatLng latLngFromScreenLocation4 = baiduMap4.getProjection().fromScreenLocation(new Point((int) downLoadMapsActivity2.getMMaskCoordinates().I0iXXO(), (int) downLoadMapsActivity2.getMMaskCoordinates().XOO0ii0()));
            BaiduMap baiduMap5 = downLoadMapsActivity2.mBaiDuMap;
            Intrinsics.XXI(baiduMap5);
            com.baidu.mapapi.model.LatLng latLngFromScreenLocation5 = baiduMap5.getProjection().fromScreenLocation(new Point((int) downLoadMapsActivity2.getMMaskCoordinates().I0IIOi(), (int) downLoadMapsActivity2.getMMaskCoordinates().OIi0()));
            i01I1i1X i01i1i1x = i01I1i1X.OXO1;
            if (i01i1i1x.XO0O10(latLngFromScreenLocation5.latitude, latLngFromScreenLocation5.longitude)) {
                Pair<Double, Double> pairXIi00iiXO = i01i1i1x.XIi00iiXO(latLngFromScreenLocation.latitude, latLngFromScreenLocation.longitude);
                Pair<Double, Double> pairXIi00iiXO2 = i01i1i1x.XIi00iiXO(latLngFromScreenLocation2.latitude, latLngFromScreenLocation2.longitude);
                Pair<Double, Double> pairXIi00iiXO3 = i01i1i1x.XIi00iiXO(latLngFromScreenLocation3.latitude, latLngFromScreenLocation3.longitude);
                Pair<Double, Double> pairXIi00iiXO4 = i01i1i1x.XIi00iiXO(latLngFromScreenLocation4.latitude, latLngFromScreenLocation4.longitude);
                Pair<Double, Double> pairXIi00iiXO5 = i01i1i1x.XIi00iiXO(latLngFromScreenLocation5.latitude, latLngFromScreenLocation5.longitude);
                com.baidu.mapapi.model.LatLng latLng = new com.baidu.mapapi.model.LatLng(pairXIi00iiXO.getFirst().doubleValue(), pairXIi00iiXO.getSecond().doubleValue());
                com.baidu.mapapi.model.LatLng latLng2 = new com.baidu.mapapi.model.LatLng(pairXIi00iiXO2.getFirst().doubleValue(), pairXIi00iiXO2.getSecond().doubleValue());
                com.baidu.mapapi.model.LatLng latLng3 = new com.baidu.mapapi.model.LatLng(pairXIi00iiXO3.getFirst().doubleValue(), pairXIi00iiXO3.getSecond().doubleValue());
                com.baidu.mapapi.model.LatLng latLng4 = new com.baidu.mapapi.model.LatLng(pairXIi00iiXO4.getFirst().doubleValue(), pairXIi00iiXO4.getSecond().doubleValue());
                latLngFromScreenLocation5 = new com.baidu.mapapi.model.LatLng(pairXIi00iiXO5.getFirst().doubleValue(), pairXIi00iiXO5.getSecond().doubleValue());
                latLngFromScreenLocation4 = latLng4;
                latLngFromScreenLocation3 = latLng3;
                latLngFromScreenLocation2 = latLng2;
                latLngFromScreenLocation = latLng;
            }
            com.baidu.mapapi.model.LatLng latLng5 = latLngFromScreenLocation2;
            downLoadMapsActivity2 = downLoadMapsActivity;
            downLoadMapsActivity2.maxLongitude = OOiIO0.X1IX(latLngFromScreenLocation.longitude, latLngFromScreenLocation2.longitude, latLngFromScreenLocation3.longitude, latLngFromScreenLocation4.longitude);
            downLoadMapsActivity2.minLongitude = OOiIO0.XXiIiX10(latLngFromScreenLocation.longitude, latLng5.longitude, latLngFromScreenLocation3.longitude, latLngFromScreenLocation4.longitude);
            downLoadMapsActivity2.maxLatitude = OOiIO0.X1IX(latLngFromScreenLocation.latitude, latLng5.latitude, latLngFromScreenLocation3.latitude, latLngFromScreenLocation4.latitude);
            downLoadMapsActivity2.minLatitude = OOiIO0.XXiIiX10(latLngFromScreenLocation.latitude, latLng5.latitude, latLngFromScreenLocation3.latitude, latLngFromScreenLocation4.latitude);
            downLoadMapsActivity2.curLongitude = latLngFromScreenLocation5.longitude;
            downLoadMapsActivity2.curLatitude = latLngFromScreenLocation5.latitude;
            BaiduMap baiduMap6 = downLoadMapsActivity2.mBaiDuMap;
            if (baiduMap6 != null) {
                baiduMap6.snapshot(new BaiduMap.SnapshotReadyCallback() { // from class: com.android.mltcode.paycertificationapi.IOIO11
                    @Override // com.baidu.mapapi.map.BaiduMap.SnapshotReadyCallback
                    public final void onSnapshotReady(Bitmap bitmap) {
                        DownLoadMapsActivity.showTitlePopup$lambda$0$0$1(this.OXO1, text, bitmap);
                    }
                });
            }
            z = true;
        } else {
            GoogleMap googleMap2 = downLoadMapsActivity2.mGoogleMap;
            if (googleMap2 == null) {
                Intrinsics.XXO("mGoogleMap");
                googleMap2 = null;
            }
            LatLng latLngFromScreenLocation6 = googleMap2.getProjection().fromScreenLocation(new Point((int) downLoadMapsActivity2.getMMaskCoordinates().OIX0iXi(), (int) downLoadMapsActivity2.getMMaskCoordinates().XXI()));
            Intrinsics.O10IXXX0X(latLngFromScreenLocation6, "fromScreenLocation(...)");
            GoogleMap googleMap3 = downLoadMapsActivity2.mGoogleMap;
            if (googleMap3 == null) {
                Intrinsics.XXO("mGoogleMap");
                googleMap3 = null;
            }
            LatLng latLngFromScreenLocation7 = googleMap3.getProjection().fromScreenLocation(new Point((int) downLoadMapsActivity2.getMMaskCoordinates().OIX0iXi(), (int) downLoadMapsActivity2.getMMaskCoordinates().XOO0ii0()));
            Intrinsics.O10IXXX0X(latLngFromScreenLocation7, "fromScreenLocation(...)");
            GoogleMap googleMap4 = downLoadMapsActivity2.mGoogleMap;
            if (googleMap4 == null) {
                Intrinsics.XXO("mGoogleMap");
                googleMap4 = null;
            }
            LatLng latLngFromScreenLocation8 = googleMap4.getProjection().fromScreenLocation(new Point((int) downLoadMapsActivity2.getMMaskCoordinates().I0iXXO(), (int) downLoadMapsActivity2.getMMaskCoordinates().XXI()));
            Intrinsics.O10IXXX0X(latLngFromScreenLocation8, "fromScreenLocation(...)");
            GoogleMap googleMap5 = downLoadMapsActivity2.mGoogleMap;
            if (googleMap5 == null) {
                Intrinsics.XXO("mGoogleMap");
                googleMap5 = null;
            }
            LatLng latLngFromScreenLocation9 = googleMap5.getProjection().fromScreenLocation(new Point((int) downLoadMapsActivity2.getMMaskCoordinates().I0iXXO(), (int) downLoadMapsActivity2.getMMaskCoordinates().XOO0ii0()));
            Intrinsics.O10IXXX0X(latLngFromScreenLocation9, "fromScreenLocation(...)");
            GoogleMap googleMap6 = downLoadMapsActivity2.mGoogleMap;
            if (googleMap6 == null) {
                Intrinsics.XXO("mGoogleMap");
                googleMap6 = null;
            }
            LatLng latLngFromScreenLocation10 = googleMap6.getProjection().fromScreenLocation(new Point((int) downLoadMapsActivity2.getMMaskCoordinates().I0IIOi(), (int) downLoadMapsActivity2.getMMaskCoordinates().OIi0()));
            Intrinsics.O10IXXX0X(latLngFromScreenLocation10, "fromScreenLocation(...)");
            i01I1i1X i01i1i1x2 = i01I1i1X.OXO1;
            if (i01i1i1x2.XO0O10(latLngFromScreenLocation10.latitude, latLngFromScreenLocation10.longitude)) {
                Pair<Double, Double> pairM1953iO = i01i1i1x2.m1953iO(latLngFromScreenLocation6.latitude, latLngFromScreenLocation6.longitude);
                Pair<Double, Double> pairM1953iO2 = i01i1i1x2.m1953iO(latLngFromScreenLocation7.latitude, latLngFromScreenLocation7.longitude);
                Pair<Double, Double> pairM1953iO3 = i01i1i1x2.m1953iO(latLngFromScreenLocation8.latitude, latLngFromScreenLocation8.longitude);
                Pair<Double, Double> pairM1953iO4 = i01i1i1x2.m1953iO(latLngFromScreenLocation9.latitude, latLngFromScreenLocation9.longitude);
                Pair<Double, Double> pairM1953iO5 = i01i1i1x2.m1953iO(latLngFromScreenLocation10.latitude, latLngFromScreenLocation10.longitude);
                LatLng latLng6 = new LatLng(pairM1953iO.getFirst().doubleValue(), pairM1953iO.getSecond().doubleValue());
                LatLng latLng7 = new LatLng(pairM1953iO2.getFirst().doubleValue(), pairM1953iO2.getSecond().doubleValue());
                LatLng latLng8 = new LatLng(pairM1953iO3.getFirst().doubleValue(), pairM1953iO3.getSecond().doubleValue());
                LatLng latLng9 = new LatLng(pairM1953iO4.getFirst().doubleValue(), pairM1953iO4.getSecond().doubleValue());
                latLngFromScreenLocation7 = latLng7;
                latLngFromScreenLocation6 = latLng6;
                latLngFromScreenLocation10 = new LatLng(pairM1953iO5.getFirst().doubleValue(), pairM1953iO5.getSecond().doubleValue());
                latLngFromScreenLocation9 = latLng9;
                latLngFromScreenLocation8 = latLng8;
            }
            LatLng latLng10 = latLngFromScreenLocation7;
            downLoadMapsActivity2.maxLongitude = OOiIO0.X1IX(latLngFromScreenLocation6.longitude, latLngFromScreenLocation7.longitude, latLngFromScreenLocation8.longitude, latLngFromScreenLocation9.longitude);
            downLoadMapsActivity2.minLongitude = OOiIO0.XXiIiX10(latLngFromScreenLocation6.longitude, latLng10.longitude, latLngFromScreenLocation8.longitude, latLngFromScreenLocation9.longitude);
            downLoadMapsActivity2.maxLatitude = OOiIO0.X1IX(latLngFromScreenLocation6.latitude, latLng10.latitude, latLngFromScreenLocation8.latitude, latLngFromScreenLocation9.latitude);
            downLoadMapsActivity2.minLatitude = OOiIO0.XXiIiX10(latLngFromScreenLocation6.latitude, latLng10.latitude, latLngFromScreenLocation8.latitude, latLngFromScreenLocation9.latitude);
            downLoadMapsActivity2.curLongitude = latLngFromScreenLocation10.longitude;
            downLoadMapsActivity2.curLatitude = latLngFromScreenLocation10.latitude;
            GoogleMap googleMap7 = downLoadMapsActivity2.mGoogleMap;
            if (googleMap7 == null) {
                Intrinsics.XXO("mGoogleMap");
                googleMap = null;
            } else {
                googleMap = googleMap7;
            }
            googleMap.snapshot(new GoogleMap.SnapshotReadyCallback() { // from class: com.android.mltcode.paycertificationapi.I0100iOI
                @Override // com.google.android.gms.maps.GoogleMap.SnapshotReadyCallback
                public final void onSnapshotReady(Bitmap bitmap) {
                    DownLoadMapsActivity.showTitlePopup$lambda$0$0$2(this.OXO1, text, bitmap);
                }
            });
            z = true;
        }
        downLoadMapsActivity2.isInProgress = z;
        OffLineMapManagerKt.XOO0ii0(downLoadMapsActivity2.minLongitude, downLoadMapsActivity2.minLatitude, downLoadMapsActivity2.maxLongitude, downLoadMapsActivity2.maxLatitude, downLoadMapsActivity2.curLongitude, downLoadMapsActivity2.curLatitude, downLoadMapsActivity2, downLoadMapsActivity2.getMRootView(), new Function1() { // from class: com.android.mltcode.paycertificationapi.Oii1IXiXi
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DownLoadMapsActivity.showTitlePopup$lambda$0$0$3(this.f3816IO, text, (OffLineGenerateFileVo) obj);
            }
        });
        iii1ii iii1iiVar = downLoadMapsActivity2.mTitlePopup;
        if (iii1iiVar != null) {
            iii1iiVar.dismiss();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showTitlePopup$lambda$0$0$1(DownLoadMapsActivity downLoadMapsActivity, String str, Bitmap bitmap) {
        if (bitmap != null) {
            ImageUtils.save(bitmap, new File(downLoadMapsActivity.mMapDir, str + ".jpg"), Bitmap.CompressFormat.JPEG);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showTitlePopup$lambda$0$0$2(DownLoadMapsActivity downLoadMapsActivity, String str, Bitmap bitmap) {
        if (bitmap != null) {
            ImageUtils.save(bitmap, new File(downLoadMapsActivity.mMapDir, str + ".jpg"), Bitmap.CompressFormat.JPEG);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showTitlePopup$lambda$0$0$3(DownLoadMapsActivity downLoadMapsActivity, String str, OffLineGenerateFileVo offLineGenerateFileVo) {
        if (offLineGenerateFileVo == null || offLineGenerateFileVo.getDownloadUrl().length() <= 0) {
            downLoadMapsActivity.isInProgress = false;
        } else {
            downLoadMapsActivity.downloadMap(offLineGenerateFileVo.getDownloadUrl(), str);
        }
        return Unit.OXO1;
    }

    private final void startLocation() {
        if (!UtilsKt.m38846X1()) {
            locationServerRemind();
        } else if (PermissionUtils.isGranted(PermissionConstants.LOCATION)) {
            onLocationClient();
        } else {
            requestLocationPermission();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopLocationClient() {
        C2702ms c2702ms = this.mLocationClient;
        if (c2702ms != null) {
            c2702ms.I0IIOi();
        }
    }

    public final void addOffLineMap() {
    }

    public final float calculateDistanceGoogle(@aa1 LatLng point1, @aa1 LatLng point2) {
        Intrinsics.X0O(point1, "point1");
        Intrinsics.X0O(point2, "point2");
        return (float) SphericalUtil.computeDistanceBetween(point1, point2);
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
        MaskView.OXO1 oxo1 = this.mMaskCoordinates;
        if (oxo1 != null) {
            return oxo1;
        }
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

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        setMaskView();
        ProgressButton mProgressButton = getMProgressButton();
        Intrinsics.O10IXXX0X(mProgressButton, "<get-mProgressButton>(...)");
        String string = getString(R.string.off_line_map_download);
        Intrinsics.O10IXXX0X(string, "getString(...)");
        ProgressButton.IiI10X(mProgressButton, string, false, 2, null);
        getSearchView().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.X1X1iOI
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DownLoadMapsActivity.initView$lambda$0(this.f4336IO, view);
            }
        });
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

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_download_map;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, @tb1 Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 != -1 || intent == null) {
            return;
        }
        this.targetDistanceType = 2;
        this.isNeedCalculateNumber = 0;
        LatLng latLng = new LatLng(intent.getDoubleExtra("MAP_POINT_LAT", this.curLatitude), intent.getDoubleExtra("MAP_POINT_LON", this.curLongitude));
        this.curLatLng = new LatLng(latLng.latitude, latLng.longitude);
        if (this.isInChinaMainland) {
            BaiduMap baiduMap = this.mBaiDuMap;
            if (baiduMap != null) {
                baiduMap.clear();
            }
        } else {
            GoogleMap googleMap = this.mGoogleMap;
            if (googleMap == null) {
                Intrinsics.XXO("mGoogleMap");
                googleMap = null;
            }
            googleMap.clear();
        }
        XX01Oi.IiI10X(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C289751(latLng, null), 3, null);
    }

    public final void onBottomClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (this.isInProgress) {
            ToastUtils.showLong(getString(R.string.is_it_in_progress_tip), new Object[0]);
        } else {
            showTitlePopup();
        }
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    @SuppressLint({"MissingPermission"})
    public void onCreate(@tb1 Bundle bundle) {
        super.onCreate(bundle);
        if (this.isInChinaMainland) {
            getMGMapView().setVisibility(8);
            TextureMapView mBMapView = getMBMapView();
            if (mBMapView != null) {
                mBMapView.setVisibility(0);
            }
            TextureMapView mBMapView2 = getMBMapView();
            mBMapView2.showZoomControls(false);
            mBMapView2.showScaleControl(false);
            BaiduMap map = getMBMapView().getMap();
            map.setCompassEnable(false);
            this.mBaiDuMap = map;
            setMapColorScheme();
            startLocation();
        } else {
            getMGMapView().setVisibility(0);
            TextureMapView mBMapView3 = getMBMapView();
            if (mBMapView3 != null) {
                mBMapView3.setVisibility(8);
            }
            getMGMapView().onCreate(bundle);
            getMGMapView().getMapAsync(new OnMapReadyCallback() { // from class: com.android.mltcode.paycertificationapi.iOIXI1II0
                @Override // com.google.android.gms.maps.OnMapReadyCallback
                public final void onMapReady(GoogleMap googleMap) {
                    DownLoadMapsActivity.onCreate$lambda$2(this.OXO1, googleMap);
                }
            });
        }
        getMTipTitle().setText(this.userProfile.getUnit() == 0 ? getString(R.string.maps_off_tip1) : getString(R.string.maps_off_tip3));
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (!this.isInChinaMainland) {
            getMGMapView().onDestroy();
            return;
        }
        TextureMapView mBMapView = getMBMapView();
        if (mBMapView != null) {
            mBMapView.onDestroy();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        if (!this.isInChinaMainland) {
            getMGMapView().onPause();
            return;
        }
        TextureMapView mBMapView = getMBMapView();
        if (mBMapView != null) {
            mBMapView.onPause();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (!this.isInChinaMainland) {
            getMGMapView().onResume();
            return;
        }
        TextureMapView mBMapView = getMBMapView();
        if (mBMapView != null) {
            mBMapView.onResume();
        }
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }

    public final void onTitleRightClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        addOffLineMap();
    }

    public final void setCurLatitude(double d) {
        this.curLatitude = d;
    }

    public final void setCurLongitude(double d) {
        this.curLongitude = d;
    }

    public final void setInProgress(boolean z) {
        this.isInProgress = z;
    }

    public final void setMMaskCoordinates(@aa1 MaskView.OXO1 oxo1) {
        Intrinsics.X0O(oxo1, "<set-?>");
        this.mMaskCoordinates = oxo1;
    }

    public final void setMStartIcon(int i) {
        this.mStartIcon = i;
    }

    public final void setMapPauseResume(boolean z) {
        this.isMapPauseResume = z;
    }

    public final void setMaxLatitude(double d) {
        this.maxLatitude = d;
    }

    public final void setMaxLongitude(double d) {
        this.maxLongitude = d;
    }

    public final void setMinLatitude(double d) {
        this.minLatitude = d;
    }

    public final void setMinLongitude(double d) {
        this.minLongitude = d;
    }

    public final void setNeedCalculateNumber(int i) {
        this.isNeedCalculateNumber = i;
    }

    public final void setTargetDistanceType(int i) {
        this.targetDistanceType = i;
    }
}
