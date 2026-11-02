.class public final Lcom/sma/smartv3/ui/device/CameraActivity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/ui/device/CameraActivity$OXO1;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCameraActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CameraActivity.kt\ncom/sma/smartv3/ui/device/CameraActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,380:1\n69#2,3:381\n72#2,5:385\n1#3:384\n*S KotlinDebug\n*F\n+ 1 CameraActivity.kt\ncom/sma/smartv3/ui/device/CameraActivity\n*L\n279#1:381,3\n279#1:385,5\n279#1:384\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nCameraActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CameraActivity.kt\ncom/sma/smartv3/ui/device/CameraActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,380:1\n69#2,3:381\n72#2,5:385\n1#3:384\n*S KotlinDebug\n*F\n+ 1 CameraActivity.kt\ncom/sma/smartv3/ui/device/CameraActivity\n*L\n279#1:381,3\n279#1:385,5\n279#1:384\n*E\n"
    }
.end annotation


# instance fields
.field private final cameraView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mBleHandleCallback:Lcom/sma/smartv3/ui/device/CameraActivity$XO0O10;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mCalledByApp$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mDisplayOrientation:I

.field private final mFormat:Ljava/text/SimpleDateFormat;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mNeedSendExitCamera:Z

.field private mOrientationEventListener:Landroid/view/OrientationEventListener;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mPermissionPopup:Lcom/android/mltcode/paycertificationapi/go0;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mVisible:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/i0000OO;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/i0000OO;-><init>(Lcom/sma/smartv3/ui/device/CameraActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/CameraActivity;->cameraView$delegate:Lkotlin/Lazy;

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->X11I()Ljava/text/SimpleDateFormat;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/CameraActivity;->mFormat:Ljava/text/SimpleDateFormat;

    new-instance v0, Lcom/sma/smartv3/ui/device/CameraActivity$XO0O10;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/device/CameraActivity$XO0O10;-><init>(Lcom/sma/smartv3/ui/device/CameraActivity;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/CameraActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/CameraActivity$XO0O10;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/Xi1iiO1i;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/Xi1iiO1i;-><init>(Lcom/sma/smartv3/ui/device/CameraActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/CameraActivity;->mCalledByApp$delegate:Lkotlin/Lazy;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/device/CameraActivity;->mVisible:Z

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/device/CameraActivity;)Lcom/google/android/cameraview/CameraView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/CameraActivity;->cameraView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/CameraActivity;)Lcom/google/android/cameraview/CameraView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1XOi1(Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/CameraActivity;->onResume$lambda$0(Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IIX1OXO(Lcom/sma/smartv3/ui/device/CameraActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/CameraActivity;->start$lambda$0(Lcom/sma/smartv3/ui/device/CameraActivity;)V

    return-void
.end method

.method public static synthetic O10IXXX0X(Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/CameraActivity;->init$lambda$0(Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIX0iXi(Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/CameraActivity;->onPause$lambda$0(Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/device/CameraActivity;)Z
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/CameraActivity;->permissionRemind$lambda$0$0(Lcom/sma/smartv3/ui/device/CameraActivity;)Z

    move-result p0

    return p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/device/CameraActivity;Lcom/bestmafen/androidbase/extension/PermissionStatus;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/CameraActivity;->applyPermission$lambda$0(Lcom/sma/smartv3/ui/device/CameraActivity;Lcom/bestmafen/androidbase/extension/PermissionStatus;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI()Z
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/ui/device/CameraActivity;->permissionRemind$lambda$0$1()Z

    move-result v0

    return v0
.end method

.method public static synthetic XiOIO(Lcom/sma/smartv3/ui/device/CameraActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/CameraActivity;->permissionRemind$lambda$0$0$0(Lcom/sma/smartv3/ui/device/CameraActivity;)V

    return-void
.end method

.method public static final synthetic access$getCameraView(Lcom/sma/smartv3/ui/device/CameraActivity;)Lcom/google/android/cameraview/CameraView;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/CameraActivity;->getCameraView()Lcom/google/android/cameraview/CameraView;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getMDisplayOrientation$p(Lcom/sma/smartv3/ui/device/CameraActivity;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/ui/device/CameraActivity;->mDisplayOrientation:I

    return p0
.end method

.method public static final synthetic access$getMFormat$p(Lcom/sma/smartv3/ui/device/CameraActivity;)Ljava/text/SimpleDateFormat;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/CameraActivity;->mFormat:Ljava/text/SimpleDateFormat;

    return-object p0
.end method

.method public static final synthetic access$handleCapture(Lcom/sma/smartv3/ui/device/CameraActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/CameraActivity;->handleCapture()V

    return-void
.end method

.method public static final synthetic access$setMDisplayOrientation$p(Lcom/sma/smartv3/ui/device/CameraActivity;I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/device/CameraActivity;->mDisplayOrientation:I

    return-void
.end method

.method private final applyPermission()V
    .locals 4

    const-string v0, "android.permission.CAMERA"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/PermissionUtils;->permission([Ljava/lang/String;)Lcom/blankj/utilcode/util/PermissionUtils;

    move-result-object v0

    const-string v1, "permission(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const v1, 0x7f140278

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "getString(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const v3, 0x7f140277

    invoke-virtual {p0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lcom/android/mltcode/paycertificationapi/I1OOIO1X;

    invoke-direct {v2, p0}, Lcom/android/mltcode/paycertificationapi/I1OOIO1X;-><init>(Lcom/sma/smartv3/ui/device/CameraActivity;)V

    invoke-static {v0, v1, v3, v2}, Lcom/android/mltcode/paycertificationapi/ds1;->XIi00iiXO(Lcom/blankj/utilcode/util/PermissionUtils;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final applyPermission$lambda$0(Lcom/sma/smartv3/ui/device/CameraActivity;Lcom/bestmafen/androidbase/extension/PermissionStatus;)Lkotlin/Unit;
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "applyPermission -> "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    sget-object v0, Lcom/sma/smartv3/ui/device/CameraActivity$OXO1;->OXO1:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/CameraActivity;->permissionRemind()V

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/CameraActivity;->start()V

    :cond_1
    :goto_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final cameraView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/CameraActivity;)Lcom/google/android/cameraview/CameraView;
    .locals 1

    const v0, 0x7f0a0202

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/google/android/cameraview/CameraView;

    return-object p0
.end method

.method private final getCameraView()Lcom/google/android/cameraview/CameraView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/CameraActivity;->cameraView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/cameraview/CameraView;

    return-object v0
.end method

.method private final getMCalledByApp()Z
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/CameraActivity;->mCalledByApp$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method private final handleCapture()V
    .locals 1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/CameraActivity;->getCameraView()Lcom/google/android/cameraview/CameraView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/cameraview/CameraView;->isCameraOpened()Z

    move-result v0

    if-eqz v0, :cond_0

    :try_start_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/CameraActivity;->getCameraView()Lcom/google/android/cameraview/CameraView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/cameraview/CameraView;->takePicture()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_0
    return-void
.end method

.method public static synthetic iIiiO(Lcom/sma/smartv3/ui/device/CameraActivity;)Z
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/CameraActivity;->mCalledByApp_delegate$lambda$0(Lcom/sma/smartv3/ui/device/CameraActivity;)Z

    move-result p0

    return p0
.end method

.method private static final init$lambda$0(Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 8

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "init -> camera enter by app"

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v1, Lcom/szabh/smable3/BleKey;->CAMERA:Lcom/szabh/smable3/BleKey;

    sget-object v2, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    const/16 v6, 0x18

    const/4 v7, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v7}, Lcom/szabh/smable3/component/BaseBleConnector;->sendInt8$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;IZZILjava/lang/Object;)Z

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final mCalledByApp_delegate$lambda$0(Lcom/sma/smartv3/ui/device/CameraActivity;)Z
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg1()I

    move-result p0

    const/4 v0, 0x1

    if-ne p0, v0, :cond_0

    return v0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private static final onPause$lambda$0(Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 8

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "onPause -> camera exit"

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v1, Lcom/szabh/smable3/BleKey;->CAMERA:Lcom/szabh/smable3/BleKey;

    sget-object v2, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    const/16 v6, 0x18

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v7}, Lcom/szabh/smable3/component/BaseBleConnector;->sendInt8$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;IZZILjava/lang/Object;)Z

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onResume$lambda$0(Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 8

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "onResume -> camera enter"

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v1, Lcom/szabh/smable3/BleKey;->CAMERA:Lcom/szabh/smable3/BleKey;

    sget-object v2, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    const/16 v6, 0x18

    const/4 v7, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v7}, Lcom/szabh/smable3/component/BaseBleConnector;->sendInt8$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;IZZILjava/lang/Object;)Z

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private final permissionRemind()V
    .locals 4

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/CameraActivity;->mPermissionPopup:Lcom/android/mltcode/paycertificationapi/go0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/CameraActivity;->mPermissionPopup:Lcom/android/mltcode/paycertificationapi/go0;

    if-nez v0, :cond_1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/go0;

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, p0, v3, v1, v2}, Lcom/android/mltcode/paycertificationapi/go0;-><init>(Landroid/app/Activity;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v3}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->I0iXXO(Z)V

    const v1, 0x7f1410be

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/go0;->O1O(I)V

    const v1, 0x7f14027f

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/android/mltcode/paycertificationapi/XII0OXO;

    invoke-direct {v2, p0}, Lcom/android/mltcode/paycertificationapi/XII0OXO;-><init>(Lcom/sma/smartv3/ui/device/CameraActivity;)V

    invoke-virtual {v0, v1, v2}, Lcom/android/mltcode/paycertificationapi/go0;->iX1O1(Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/OI10I;

    invoke-direct {v1}, Lcom/android/mltcode/paycertificationapi/OI10I;-><init>()V

    const v2, 0x7f14122c

    invoke-virtual {v0, v2, v1}, Lcom/android/mltcode/paycertificationapi/go0;->X1IX(ILkotlin/jvm/functions/Function0;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/CameraActivity;->mPermissionPopup:Lcom/android/mltcode/paycertificationapi/go0;

    :cond_1
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/CameraActivity;->mPermissionPopup:Lcom/android/mltcode/paycertificationapi/go0;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    :cond_2
    return-void
.end method

.method private static final permissionRemind$lambda$0$0(Lcom/sma/smartv3/ui/device/CameraActivity;)Z
    .locals 4

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/device/CameraActivity;->mNeedSendExitCamera:Z

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/CameraActivity;->getCameraView()Lcom/google/android/cameraview/CameraView;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/XiiOi1i;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/XiiOi1i;-><init>(Lcom/sma/smartv3/ui/device/CameraActivity;)V

    const-wide/16 v2, 0x190

    invoke-virtual {v0, v1, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    move-result p0

    return p0
.end method

.method private static final permissionRemind$lambda$0$0$0(Lcom/sma/smartv3/ui/device/CameraActivity;)V
    .locals 0

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method private static final permissionRemind$lambda$0$1()Z
    .locals 1

    invoke-static {}, Lcom/blankj/utilcode/util/PermissionUtils;->launchAppDetailsSettings()V

    const/4 v0, 0x1

    return v0
.end method

.method private final start()V
    .locals 4

    const-string v0, "android.permission.CAMERA"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/PermissionUtils;->isGranted([Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "start -> camera start"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/device/CameraActivity;->mNeedSendExitCamera:Z

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/CameraActivity;->getCameraView()Lcom/google/android/cameraview/CameraView;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/I1OXIIIO0;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/I1OXIIIO0;-><init>(Lcom/sma/smartv3/ui/device/CameraActivity;)V

    const-wide/16 v2, 0x190

    invoke-virtual {v0, v1, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    return-void
.end method

.method private static final start$lambda$0(Lcom/sma/smartv3/ui/device/CameraActivity;)V
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/device/CameraActivity;->mVisible:Z

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/CameraActivity;->getCameraView()Lcom/google/android/cameraview/CameraView;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/android/cameraview/CameraView;->start()V

    :cond_0
    return-void
.end method


# virtual methods
.method public final capture(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "CAMERA"

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/PermissionUtils;->isGranted([Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/CameraActivity;->handleCapture()V

    return-void

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/CameraActivity;->applyPermission()V

    return-void
.end method

.method public final finishWithoutSendExitCamera()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/device/CameraActivity;->mNeedSendExitCamera:Z

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public final getBitmap(II[B)Landroid/graphics/Bitmap;
    .locals 10
    .param p3    # [B
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "data"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p3}, Lcom/android/mltcode/paycertificationapi/iO0O1OIIi;->XIi00iiXO([B)I

    move-result v0

    array-length v1, p3

    const/4 v2, 0x0

    invoke-static {p3, v2, v1}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    move-result-object v3

    new-instance v8, Landroid/graphics/Matrix;

    invoke-direct {v8}, Landroid/graphics/Matrix;-><init>()V

    const/4 p3, 0x1

    if-ne p1, p3, :cond_0

    rsub-int v1, v0, 0x168

    rem-int/lit16 v1, v1, 0x168

    add-int/2addr v1, p2

    neg-int v1, v1

    rem-int/lit16 v1, v1, 0x168

    goto :goto_0

    :cond_0
    add-int v1, p2, v0

    rem-int/lit16 v1, v1, 0x168

    :goto_0
    int-to-float v2, v1

    invoke-virtual {v8, v2}, Landroid/graphics/Matrix;->postRotate(F)Z

    if-ne p1, p3, :cond_1

    const/high16 p3, -0x40800000    # -1.0f

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v8, p3, v2}, Landroid/graphics/Matrix;->postScale(FF)Z

    :cond_1
    sget-object p3, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "camera getBitmap -> facing = "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " rotateDegree = "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " orientation = "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " result = "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v6

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v7

    const/4 v9, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v3 .. v9}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception v0

    move-object p1, v0

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    return-object v3
.end method

.method public final goBack(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public init(Landroid/os/Bundle;)V
    .locals 3
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    sget-object p1, Lcom/sma/smartv3/initializer/BleInitializer;->IO:Lcom/sma/smartv3/initializer/BleInitializer;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/initializer/BleInitializer;->i0101i(Z)V

    sget-object p1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/CameraActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/CameraActivity$XO0O10;

    invoke-virtual {p1, v1}, Lcom/szabh/smable3/component/BleConnector;->addHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/CameraActivity;->getMCalledByApp()Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Lcom/android/mltcode/paycertificationapi/XIXXi0XO;

    invoke-direct {p1}, Lcom/android/mltcode/paycertificationapi/XIXXi0XO;-><init>()V

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v2, p1, v0, v1}, Lcom/android/mltcode/paycertificationapi/X0IOiX1O;->XIi00iiXO(ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    :cond_0
    return-void
.end method

.method public initView()V
    .locals 2

    new-instance v0, Lcom/sma/smartv3/ui/device/CameraActivity$XIi00iiXO;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/device/CameraActivity$XIi00iiXO;-><init>(Lcom/sma/smartv3/ui/device/CameraActivity;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/CameraActivity;->mOrientationEventListener:Landroid/view/OrientationEventListener;

    const-string v1, "null cannot be cast to non-null type android.view.OrientationEventListener"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/view/OrientationEventListener;->canDetectOrientation()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/CameraActivity;->mOrientationEventListener:Landroid/view/OrientationEventListener;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/view/OrientationEventListener;->enable()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/CameraActivity;->mOrientationEventListener:Landroid/view/OrientationEventListener;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/view/OrientationEventListener;->disable()V

    :goto_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/CameraActivity;->getCameraView()Lcom/google/android/cameraview/CameraView;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/google/android/cameraview/CameraView;->setFlash(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/CameraActivity;->getCameraView()Lcom/google/android/cameraview/CameraView;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/ui/device/CameraActivity$iO;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/ui/device/CameraActivity$iO;-><init>(Lcom/sma/smartv3/ui/device/CameraActivity;)V

    invoke-virtual {v0, v1}, Lcom/google/android/cameraview/CameraView;->addCallback(Lcom/google/android/cameraview/CameraView$Callback;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/CameraActivity;->applyPermission()V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0041

    return v0
.end method

.method public onDestroy()V
    .locals 2

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/CameraActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/CameraActivity$XO0O10;

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/component/BleConnector;->removeHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    sget-object v0, Lcom/sma/smartv3/initializer/BleInitializer;->IO:Lcom/sma/smartv3/initializer/BleInitializer;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/initializer/BleInitializer;->i0101i(Z)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/CameraActivity;->mOrientationEventListener:Landroid/view/OrientationEventListener;

    const-string v1, "null cannot be cast to non-null type android.view.OrientationEventListener"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/view/OrientationEventListener;->disable()V

    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onDestroy()V

    return-void
.end method

.method public onHandleBackPressed()V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/CameraActivity;->mPermissionPopup:Lcom/android/mltcode/paycertificationapi/go0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onHandleBackPressed()V

    return-void
.end method

.method public onPause()V
    .locals 4

    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onPause()V

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/device/CameraActivity;->mVisible:Z

    iget-boolean v1, p0, Lcom/sma/smartv3/ui/device/CameraActivity;->mNeedSendExitCamera:Z

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onPause -> "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, " "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/device/CameraActivity;->mVisible:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/device/CameraActivity;->mNeedSendExitCamera:Z

    if-eqz v0, :cond_0

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iiIO11i1X;

    invoke-direct {v0}, Lcom/android/mltcode/paycertificationapi/iiIO11i1X;-><init>()V

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v1, v0, v2, v3}, Lcom/android/mltcode/paycertificationapi/X0IOiX1O;->XIi00iiXO(ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Z

    :cond_0
    iput-boolean v1, p0, Lcom/sma/smartv3/ui/device/CameraActivity;->mVisible:Z

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/CameraActivity;->getCameraView()Lcom/google/android/cameraview/CameraView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/cameraview/CameraView;->stop()V

    return-void
.end method

.method public onResume()V
    .locals 4

    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onResume()V

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/device/CameraActivity;->mVisible:Z

    const/4 v1, 0x1

    if-nez v0, :cond_0

    new-instance v0, Lcom/android/mltcode/paycertificationapi/O0iO;

    invoke-direct {v0}, Lcom/android/mltcode/paycertificationapi/O0iO;-><init>()V

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v3, v0, v1, v2}, Lcom/android/mltcode/paycertificationapi/X0IOiX1O;->XIi00iiXO(ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Z

    :cond_0
    iput-boolean v1, p0, Lcom/sma/smartv3/ui/device/CameraActivity;->mVisible:Z

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/CameraActivity;->start()V

    return-void
.end method

.method public final switchCamera(Landroid/view/View;)V
    .locals 2
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/CameraActivity;->getCameraView()Lcom/google/android/cameraview/CameraView;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/cameraview/CameraView;->getFacing()I

    move-result p1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/CameraActivity;->getCameraView()Lcom/google/android/cameraview/CameraView;

    move-result-object v0

    const/4 v1, 0x1

    if-ne p1, v1, :cond_0

    const/4 v1, 0x0

    :cond_0
    invoke-virtual {v0, v1}, Lcom/google/android/cameraview/CameraView;->setFacing(I)V

    return-void
.end method

.method public final toAlbum(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Landroid/content/Intent;

    const-class v0, Lcom/sma/smartv3/ui/device/AlbumActivity;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method
