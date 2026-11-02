.class public final Lcom/sma/smartv3/ui/device/ActivityRecognitionSettingsActivity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"


# instance fields
.field private final itemActivityRecognition$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mBleHandleCallback:Lcom/sma/smartv3/ui/device/ActivityRecognitionSettingsActivity$OXO1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
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

    new-instance v0, Lcom/android/mltcode/paycertificationapi/O110i;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/O110i;-><init>(Lcom/sma/smartv3/ui/device/ActivityRecognitionSettingsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/ActivityRecognitionSettingsActivity;->rootView$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/i01;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/i01;-><init>(Lcom/sma/smartv3/ui/device/ActivityRecognitionSettingsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/ActivityRecognitionSettingsActivity;->itemActivityRecognition$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/sma/smartv3/ui/device/ActivityRecognitionSettingsActivity$OXO1;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/device/ActivityRecognitionSettingsActivity$OXO1;-><init>(Lcom/sma/smartv3/ui/device/ActivityRecognitionSettingsActivity;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/ActivityRecognitionSettingsActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/ActivityRecognitionSettingsActivity$OXO1;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/device/ActivityRecognitionSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsHeader;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/ActivityRecognitionSettingsActivity;->itemActivityRecognition_delegate$lambda$0(Lcom/sma/smartv3/ui/device/ActivityRecognitionSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsHeader;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X()V
    .locals 0

    invoke-static {}, Lcom/sma/smartv3/ui/device/ActivityRecognitionSettingsActivity;->updateUI$lambda$0$0$0$0()V

    return-void
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/device/ActivityRecognitionSettingsActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/ActivityRecognitionSettingsActivity;->rootView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/ActivityRecognitionSettingsActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(ZLcom/sma/smartv3/ui/device/ActivityRecognitionSettingsActivity;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/ActivityRecognitionSettingsActivity;->updateUI$lambda$0$0$0(ZLcom/sma/smartv3/ui/device/ActivityRecognitionSettingsActivity;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/device/ActivityRecognitionSettingsActivity;Z)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/ActivityRecognitionSettingsActivity;->updateUI$lambda$0$0(Lcom/sma/smartv3/ui/device/ActivityRecognitionSettingsActivity;Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$updateUI(Lcom/sma/smartv3/ui/device/ActivityRecognitionSettingsActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/ActivityRecognitionSettingsActivity;->updateUI()V

    return-void
.end method

.method private final getItemActivityRecognition()Lcom/sma/smartv3/view/AbhSettingsHeader;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ActivityRecognitionSettingsActivity;->itemActivityRecognition$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/AbhSettingsHeader;

    return-object v0
.end method

.method private final getRootView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ActivityRecognitionSettingsActivity;->rootView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private static final itemActivityRecognition_delegate$lambda$0(Lcom/sma/smartv3/ui/device/ActivityRecognitionSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsHeader;
    .locals 1

    const v0, 0x7f0a055e

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/AbhSettingsHeader;

    return-object p0
.end method

.method private static final rootView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/ActivityRecognitionSettingsActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a09af

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private final updateUI()V
    .locals 8

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/ActivityRecognitionSettingsActivity;->getItemActivityRecognition()Lcom/sma/smartv3/view/AbhSettingsHeader;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/AbhSettingsHeader;->setMListener(Lkotlin/jvm/functions/Function1;)V

    sget-object v2, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    sget-object v3, Lcom/szabh/smable3/BleKey;->ACTIVITY_RECOGNIYION:Lcom/szabh/smable3/BleKey;

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lcom/szabh/smable3/component/BaseBleCache;->getInt$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;ILcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/OiOX0i;->XIi00iiXO(I)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/AbhSettingsHeader;->setChecked(Z)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/i0IX1;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/i0IX1;-><init>(Lcom/sma/smartv3/ui/device/ActivityRecognitionSettingsActivity;)V

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/AbhSettingsHeader;->setMListener(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final updateUI$lambda$0$0(Lcom/sma/smartv3/ui/device/ActivityRecognitionSettingsActivity;Z)Lkotlin/Unit;
    .locals 4

    new-instance v0, Lcom/android/mltcode/paycertificationapi/I1X01IO;

    invoke-direct {v0, p1, p0}, Lcom/android/mltcode/paycertificationapi/I1X01IO;-><init>(ZLcom/sma/smartv3/ui/device/ActivityRecognitionSettingsActivity;)V

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v2, v0, v3, v1}, Lcom/android/mltcode/paycertificationapi/X0IOiX1O;->XIi00iiXO(ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/ActivityRecognitionSettingsActivity;->getItemActivityRecognition()Lcom/sma/smartv3/view/AbhSettingsHeader;

    move-result-object p0

    xor-int/2addr p1, v3

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/view/AbhSettingsHeader;->setChecked(Z)V

    :cond_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final updateUI$lambda$0$0$0(ZLcom/sma/smartv3/ui/device/ActivityRecognitionSettingsActivity;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 9

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lcom/szabh/smable3/BleKey;->ACTIVITY_RECOGNIYION:Lcom/szabh/smable3/BleKey;

    sget-object v3, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    invoke-static {p0}, Lcom/android/mltcode/paycertificationapi/OiOX0i;->iO(Z)I

    move-result v4

    const/16 v7, 0x18

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p2

    invoke-static/range {v1 .. v8}, Lcom/szabh/smable3/component/BaseBleConnector;->sendInt8$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;IZZILjava/lang/Object;)Z

    invoke-direct {p1}, Lcom/sma/smartv3/ui/device/ActivityRecognitionSettingsActivity;->updateUI()V

    new-instance p0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p1

    invoke-direct {p0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance p1, Lcom/android/mltcode/paycertificationapi/iiOO;

    invoke-direct {p1}, Lcom/android/mltcode/paycertificationapi/iiOO;-><init>()V

    const-wide/16 v0, 0x96

    invoke-virtual {p0, p1, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final updateUI$lambda$0$0$0$0()V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x2

    const-string v2, "activity_recognition_change"

    invoke-static {v2, v0, v1, v0}, Lcom/android/mltcode/paycertificationapi/I01XX0;->XIi00iiXO(Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public init(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    sget-object p1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ActivityRecognitionSettingsActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/ActivityRecognitionSettingsActivity$OXO1;

    invoke-virtual {p1, v0}, Lcom/szabh/smable3/component/BleConnector;->addHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    return-void
.end method

.method public initView()V
    .locals 2

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f14006d

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/ActivityRecognitionSettingsActivity;->updateUI()V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0020

    return v0
.end method

.method public onDestroy()V
    .locals 2

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/ActivityRecognitionSettingsActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/ActivityRecognitionSettingsActivity$OXO1;

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/component/BleConnector;->removeHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onDestroy()V

    return-void
.end method

.method public final onTitleLeftClick(Landroid/view/View;)V
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
