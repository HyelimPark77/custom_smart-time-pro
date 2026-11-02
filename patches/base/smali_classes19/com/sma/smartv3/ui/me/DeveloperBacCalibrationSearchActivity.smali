.class public final Lcom/sma/smartv3/ui/me/DeveloperBacCalibrationSearchActivity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDeveloperBacCalibrationSearchActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeveloperBacCalibrationSearchActivity.kt\ncom/sma/smartv3/ui/me/DeveloperBacCalibrationSearchActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,185:1\n69#2,3:186\n72#2,5:190\n140#2,5:195\n145#2,5:201\n87#2,7:206\n94#2,3:214\n70#2,7:217\n97#2:224\n1#3:189\n1#3:200\n1#3:213\n*S KotlinDebug\n*F\n+ 1 DeveloperBacCalibrationSearchActivity.kt\ncom/sma/smartv3/ui/me/DeveloperBacCalibrationSearchActivity\n*L\n99#1:186,3\n99#1:190,5\n124#1:195,5\n124#1:201,5\n135#1:206,7\n135#1:214,3\n135#1:217,7\n135#1:224\n99#1:189\n124#1:200\n135#1:213\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nDeveloperBacCalibrationSearchActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeveloperBacCalibrationSearchActivity.kt\ncom/sma/smartv3/ui/me/DeveloperBacCalibrationSearchActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,185:1\n69#2,3:186\n72#2,5:190\n140#2,5:195\n145#2,5:201\n87#2,7:206\n94#2,3:214\n70#2,7:217\n97#2:224\n1#3:189\n1#3:200\n1#3:213\n*S KotlinDebug\n*F\n+ 1 DeveloperBacCalibrationSearchActivity.kt\ncom/sma/smartv3/ui/me/DeveloperBacCalibrationSearchActivity\n*L\n99#1:186,3\n99#1:190,5\n124#1:195,5\n124#1:201,5\n135#1:206,7\n135#1:214,3\n135#1:217,7\n135#1:224\n99#1:189\n124#1:200\n135#1:213\n*E\n"
    }
.end annotation


# instance fields
.field private isBindDevice:Z

.field private isScanQrcode:Z

.field private final mBleHandleCallback:Lcom/sma/smartv3/ui/me/DeveloperBacCalibrationSearchActivity$XIi00iiXO;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mConfirmPopup:Lcom/android/mltcode/paycertificationapi/ml1;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mSelectPairPopup:Lcom/android/mltcode/paycertificationapi/m04;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final rootView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OOiIiIX;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/OOiIiIX;-><init>(Lcom/sma/smartv3/ui/me/DeveloperBacCalibrationSearchActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperBacCalibrationSearchActivity;->rootView$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/sma/smartv3/ui/me/DeveloperBacCalibrationSearchActivity$XIi00iiXO;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/me/DeveloperBacCalibrationSearchActivity$XIi00iiXO;-><init>(Lcom/sma/smartv3/ui/me/DeveloperBacCalibrationSearchActivity;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperBacCalibrationSearchActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/me/DeveloperBacCalibrationSearchActivity$XIi00iiXO;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/me/DeveloperBacCalibrationSearchActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperBacCalibrationSearchActivity;->onActivityResult$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperBacCalibrationSearchActivity;)V

    return-void
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/me/DeveloperBacCalibrationSearchActivity;Lcom/android/mltcode/paycertificationapi/ml1;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/me/DeveloperBacCalibrationSearchActivity;->conntectDevice$lambda$0$0(Lcom/sma/smartv3/ui/me/DeveloperBacCalibrationSearchActivity;Lcom/android/mltcode/paycertificationapi/ml1;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/me/DeveloperBacCalibrationSearchActivity;)Landroid/widget/RelativeLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperBacCalibrationSearchActivity;->rootView_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperBacCalibrationSearchActivity;)Landroid/widget/RelativeLayout;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getMConfirmPopup$p(Lcom/sma/smartv3/ui/me/DeveloperBacCalibrationSearchActivity;)Lcom/android/mltcode/paycertificationapi/ml1;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/me/DeveloperBacCalibrationSearchActivity;->mConfirmPopup:Lcom/android/mltcode/paycertificationapi/ml1;

    return-object p0
.end method

.method private final conntectDevice(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "conntectDevice -> "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " , "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/q62;->XXOXI0(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    const-string v0, "mArg0"

    invoke-virtual {p1, v0, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p2, "mArg2"

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string p2, "mArg3"

    invoke-virtual {p1, p2, v0}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    new-instance p2, Landroid/content/Intent;

    const-class v0, Lcom/sma/smartv3/ui/device/AutoBindActivity;

    invoke-direct {p2, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p2, p1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    invoke-virtual {p0, p2}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return-void

    :cond_0
    sget-object v1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {v1, p2}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->setAddress(Ljava/lang/String;)Lcom/bestmafen/baseble/connector/AbsBleConnector;

    move-result-object p2

    const/4 v1, 0x1

    invoke-virtual {p2, v1}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->connect(Z)V

    new-instance p2, Lcom/android/mltcode/paycertificationapi/ml1;

    invoke-direct {p2, p0}, Lcom/android/mltcode/paycertificationapi/ml1;-><init>(Landroid/app/Activity;)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/i1I0X011O;

    invoke-direct {v1, p0, p2}, Lcom/android/mltcode/paycertificationapi/i1I0X011O;-><init>(Lcom/sma/smartv3/ui/me/DeveloperBacCalibrationSearchActivity;Lcom/android/mltcode/paycertificationapi/ml1;)V

    invoke-virtual {p2, v1}, Lcom/android/mltcode/paycertificationapi/ml1;->X01IiOiIi(Lkotlin/jvm/functions/Function0;)V

    invoke-virtual {p2}, Lcom/android/mltcode/paycertificationapi/ml1;->OX()Landroid/widget/ImageView;

    move-result-object v1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/q62;->XiOIii1(Ljava/lang/String;)I

    move-result p1

    invoke-virtual {v1, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    iput-object p2, p0, Lcom/sma/smartv3/ui/me/DeveloperBacCalibrationSearchActivity;->mConfirmPopup:Lcom/android/mltcode/paycertificationapi/ml1;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/me/DeveloperBacCalibrationSearchActivity;->getRootView()Landroid/widget/RelativeLayout;

    move-result-object p1

    const-string v0, "<get-rootView>(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Lcom/android/mltcode/paycertificationapi/I0OIO1i;->I1XOi1(Landroid/view/View;)V

    return-void
.end method

.method private static final conntectDevice$lambda$0$0(Lcom/sma/smartv3/ui/me/DeveloperBacCalibrationSearchActivity;Lcom/android/mltcode/paycertificationapi/ml1;)Lkotlin/Unit;
    .locals 9

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/me/DeveloperBacCalibrationSearchActivity;->isScanQrcode:Z

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V

    sget-object v1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v2, Lcom/szabh/smable3/BleKey;->IDENTITY:Lcom/szabh/smable3/BleKey;

    sget-object v3, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    const/16 v7, 0x18

    const/4 v8, 0x0

    const/16 v4, 0x10

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v8}, Lcom/szabh/smable3/component/BaseBleConnector;->sendInt8$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;IZZILjava/lang/Object;)Z

    new-instance p0, Ljava/util/Timer;

    invoke-direct {p0}, Ljava/util/Timer;-><init>()V

    new-instance p1, Lcom/sma/smartv3/ui/me/DeveloperBacCalibrationSearchActivity$OXO1;

    invoke-direct {p1}, Lcom/sma/smartv3/ui/me/DeveloperBacCalibrationSearchActivity$OXO1;-><init>()V

    const-wide/16 v0, 0xc8

    invoke-virtual {p0, p1, v0, v1}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onActivityResult$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperBacCalibrationSearchActivity;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/me/DeveloperBacCalibrationSearchActivity;->updatePairState(Z)V

    return-void
.end method

.method private static final rootView_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperBacCalibrationSearchActivity;)Landroid/widget/RelativeLayout;
    .locals 1

    const v0, 0x7f0a09b5

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/RelativeLayout;

    return-object p0
.end method

.method private final toAddDevice(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/me/DeveloperBacCalibrationSearchActivity;->isScanQrcode:Z

    iput-boolean v1, p0, Lcom/sma/smartv3/ui/me/DeveloperBacCalibrationSearchActivity;->isBindDevice:Z

    new-instance p1, Landroid/content/Intent;

    const-class p2, Lcom/sma/smartv3/ui/device/AddDeviceActivity;

    invoke-direct {p1, p0, p2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, p1, v1}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void

    :cond_0
    iput-boolean v1, p0, Lcom/sma/smartv3/ui/me/DeveloperBacCalibrationSearchActivity;->isScanQrcode:Z

    invoke-direct {p0, p1, p2}, Lcom/sma/smartv3/ui/me/DeveloperBacCalibrationSearchActivity;->conntectDevice(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic updatePairState$default(Lcom/sma/smartv3/ui/me/DeveloperBacCalibrationSearchActivity;ZILjava/lang/Object;)V
    .locals 0

    const/4 p3, 0x1

    and-int/2addr p2, p3

    if-eqz p2, :cond_0

    move p1, p3

    :cond_0
    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/me/DeveloperBacCalibrationSearchActivity;->updatePairState(Z)V

    return-void
.end method


# virtual methods
.method public getRootView()Landroid/widget/RelativeLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperBacCalibrationSearchActivity;->rootView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method public init(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    sget-object p1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperBacCalibrationSearchActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/me/DeveloperBacCalibrationSearchActivity$XIi00iiXO;

    invoke-virtual {p1, v0}, Lcom/szabh/smable3/component/BleConnector;->addHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    return-void
.end method

.method public initView()V
    .locals 0

    return-void
.end method

.method public final isBindDevice()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/me/DeveloperBacCalibrationSearchActivity;->isBindDevice:Z

    return v0
.end method

.method public final isScanQrcode()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/me/DeveloperBacCalibrationSearchActivity;->isScanQrcode:Z

    return v0
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0068

    return v0
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 2
    .param p3    # Landroid/content/Intent;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/FragmentActivity;->onActivityResult(IILandroid/content/Intent;)V

    const/4 p3, -0x1

    if-ne p2, p3, :cond_2

    const/4 p2, 0x1

    if-eq p1, p2, :cond_1

    const/4 p2, 0x2

    if-eq p1, p2, :cond_0

    const/4 p2, 0x3

    if-eq p1, p2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    new-instance p2, Lcom/android/mltcode/paycertificationapi/XIX1;

    invoke-direct {p2, p0}, Lcom/android/mltcode/paycertificationapi/XIX1;-><init>(Lcom/sma/smartv3/ui/me/DeveloperBacCalibrationSearchActivity;)V

    const-wide/16 v0, 0xc8

    invoke-virtual {p1, p2, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :cond_1
    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/me/DeveloperBacCalibrationSearchActivity;->isBindDevice:Z

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/me/DeveloperBacCalibrationSearchActivity;->onCodePairChange(Ljava/lang/Object;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public final onCodePairChange(Ljava/lang/Object;)V
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "code_pair_change"
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean p1, p0, Lcom/sma/smartv3/ui/me/DeveloperBacCalibrationSearchActivity;->isScanQrcode:Z

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onCodePairChange isScanQrcode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/me/DeveloperBacCalibrationSearchActivity;->isScanQrcode:Z

    sget-object v0, Lcom/sma/smartv3/network/RequestCommonMethod;->INSTANCE:Lcom/sma/smartv3/network/RequestCommonMethod;

    new-instance v1, Lcom/sma/smartv3/ui/me/DeveloperBacCalibrationSearchActivity$onCodePairChange$1;

    invoke-direct {v1}, Lcom/sma/smartv3/ui/me/DeveloperBacCalibrationSearchActivity$onCodePairChange$1;-><init>()V

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/network/RequestCommonMethod;->updateDeviceInfo(Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    sget-object v0, Lcom/sma/smartv3/biz/DeviceInfoChecker;->OXO1:Lcom/sma/smartv3/biz/DeviceInfoChecker;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/DeviceInfoChecker;->I1()V

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {p0, p1, v0, v1}, Lcom/sma/smartv3/ui/me/DeveloperBacCalibrationSearchActivity;->updatePairState$default(Lcom/sma/smartv3/ui/me/DeveloperBacCalibrationSearchActivity;ZILjava/lang/Object;)V

    new-instance p1, Landroid/content/Intent;

    const-class v0, Lcom/sma/smartv3/ui/me/DeveloperBacCalibrationActivity;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public onDestroy()V
    .locals 2

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/component/BaseBleConnector;->setNeedBind(Z)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperBacCalibrationSearchActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/me/DeveloperBacCalibrationSearchActivity$XIi00iiXO;

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/component/BleConnector;->removeHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onDestroy()V

    return-void
.end method

.method public final setBindDevice(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/me/DeveloperBacCalibrationSearchActivity;->isBindDevice:Z

    return-void
.end method

.method public final setScanQrcode(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/me/DeveloperBacCalibrationSearchActivity;->isScanQrcode:Z

    return-void
.end method

.method public final startSearch(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, ""

    invoke-direct {p0, p1, p1}, Lcom/sma/smartv3/ui/me/DeveloperBacCalibrationSearchActivity;->toAddDevice(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final updatePairState(Z)V
    .locals 2
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "bind_stage_change"
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "updatePairState "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    if-eqz p1, :cond_0

    const-string p1, "bind_stage_change"

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-static {p1, v1, v0, v1}, Lcom/android/mltcode/paycertificationapi/I01XX0;->XIi00iiXO(Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    :cond_0
    return-void
.end method
