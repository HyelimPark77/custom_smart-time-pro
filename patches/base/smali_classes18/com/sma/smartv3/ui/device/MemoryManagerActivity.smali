.class public final Lcom/sma/smartv3/ui/device/MemoryManagerActivity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"


# instance fields
.field private final mAllMemory$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mBleHandleCallback:Lcom/sma/smartv3/ui/device/MemoryManagerActivity$OXO1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mFreeMemory$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mProgressBar$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mUsedMemory$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/wm0;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/wm0;-><init>(Lcom/sma/smartv3/ui/device/MemoryManagerActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/MemoryManagerActivity;->mProgressBar$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/xm0;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/xm0;-><init>(Lcom/sma/smartv3/ui/device/MemoryManagerActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/MemoryManagerActivity;->mAllMemory$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ym0;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/ym0;-><init>(Lcom/sma/smartv3/ui/device/MemoryManagerActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/MemoryManagerActivity;->mUsedMemory$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/zm0;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/zm0;-><init>(Lcom/sma/smartv3/ui/device/MemoryManagerActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/MemoryManagerActivity;->mFreeMemory$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/sma/smartv3/ui/device/MemoryManagerActivity$OXO1;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/device/MemoryManagerActivity$OXO1;-><init>(Lcom/sma/smartv3/ui/device/MemoryManagerActivity;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/MemoryManagerActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/MemoryManagerActivity$OXO1;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/device/MemoryManagerActivity;)Landroid/widget/ProgressBar;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/MemoryManagerActivity;->mProgressBar_delegate$lambda$0(Lcom/sma/smartv3/ui/device/MemoryManagerActivity;)Landroid/widget/ProgressBar;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/device/MemoryManagerActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/MemoryManagerActivity;->mUsedMemory_delegate$lambda$0(Lcom/sma/smartv3/ui/device/MemoryManagerActivity;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/device/MemoryManagerActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/MemoryManagerActivity;->mAllMemory_delegate$lambda$0(Lcom/sma/smartv3/ui/device/MemoryManagerActivity;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/device/MemoryManagerActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/MemoryManagerActivity;->mFreeMemory_delegate$lambda$0(Lcom/sma/smartv3/ui/device/MemoryManagerActivity;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$showFreeSpace(Lcom/sma/smartv3/ui/device/MemoryManagerActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/MemoryManagerActivity;->showFreeSpace()V

    return-void
.end method

.method private static final mAllMemory_delegate$lambda$0(Lcom/sma/smartv3/ui/device/MemoryManagerActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    const v0, 0x7f0a082f

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private static final mFreeMemory_delegate$lambda$0(Lcom/sma/smartv3/ui/device/MemoryManagerActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    const v0, 0x7f0a00f7

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private static final mProgressBar_delegate$lambda$0(Lcom/sma/smartv3/ui/device/MemoryManagerActivity;)Landroid/widget/ProgressBar;
    .locals 1

    const v0, 0x7f0a0830

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ProgressBar;

    return-object p0
.end method

.method private static final mUsedMemory_delegate$lambda$0(Lcom/sma/smartv3/ui/device/MemoryManagerActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    const v0, 0x7f0a18db

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private final showFreeSpace()V
    .locals 13

    sget-object v0, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    sget-object v1, Lcom/szabh/smable3/BleKey;->SDCARD_INFO:Lcom/szabh/smable3/BleKey;

    const/4 v4, 0x4

    const/4 v5, 0x0

    const-class v2, Lcom/szabh/smable3/entity/BleSDCardInfo;

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lcom/szabh/smable3/component/BaseBleCache;->getObject$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;Ljava/lang/Class;Lcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/szabh/smable3/entity/BleSDCardInfo;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/MemoryManagerActivity;->getMProgressBar()Landroid/widget/ProgressBar;

    move-result-object v1

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleSDCardInfo;->getMTotalSize()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/ProgressBar;->setMax(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/MemoryManagerActivity;->getMProgressBar()Landroid/widget/ProgressBar;

    move-result-object v1

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleSDCardInfo;->getMTotalSize()I

    move-result v2

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleSDCardInfo;->getMFreeSize()I

    move-result v3

    sub-int/2addr v2, v3

    invoke-virtual {v1, v2}, Landroid/widget/ProgressBar;->setProgress(I)V

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleSDCardInfo;->getMTotalSize()I

    move-result v1

    int-to-long v1, v1

    const-wide/16 v3, 0x400

    mul-long/2addr v1, v3

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleSDCardInfo;->getMFreeSize()I

    move-result v0

    int-to-long v5, v0

    mul-long/2addr v5, v3

    const-wide/32 v3, 0x20000000

    cmp-long v0, v1, v3

    const/high16 v3, 0x40000000    # 2.0f

    if-gtz v0, :cond_1

    const-wide/high16 v0, 0x3fe0000000000000L    # 0.5

    goto :goto_1

    :cond_1
    const-wide/32 v7, 0x40000000

    cmp-long v0, v1, v7

    if-gtz v0, :cond_2

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    goto :goto_1

    :cond_2
    int-to-long v7, v3

    rem-long v9, v1, v7

    const-wide/16 v11, 0x0

    cmp-long v0, v9, v11

    if-nez v0, :cond_3

    div-long/2addr v1, v7

    :goto_0
    long-to-double v0, v1

    goto :goto_1

    :cond_3
    div-long/2addr v1, v7

    const-wide/16 v7, 0x1

    add-long/2addr v1, v7

    goto :goto_0

    :goto_1
    int-to-double v2, v3

    mul-double/2addr v2, v0

    long-to-double v7, v5

    sub-double v7, v2, v7

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/MemoryManagerActivity;->getMAllMemory()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v4

    double-to-long v2, v2

    const/4 v9, 0x0

    invoke-static {v2, v3, v9}, Lcom/blankj/utilcode/util/ConvertUtils;->byte2FitMemorySize(JI)Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lkotlin/jvm/internal/StringCompanionObject;->OXO1:Lkotlin/jvm/internal/StringCompanionObject;

    const/16 v3, 0x8

    int-to-double v10, v3

    mul-double/2addr v0, v10

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    const-string v1, "(%.0fGb)"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "format(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/MemoryManagerActivity;->getMFreeMemory()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    invoke-static {v5, v6, v9}, Lcom/blankj/utilcode/util/ConvertUtils;->byte2FitMemorySize(JI)Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    const v2, 0x7f14018c

    invoke-virtual {p0, v2, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/MemoryManagerActivity;->getMUsedMemory()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    double-to-long v1, v7

    invoke-static {v1, v2, v9}, Lcom/blankj/utilcode/util/ConvertUtils;->byte2FitMemorySize(JI)Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    const v2, 0x7f14147c

    invoke-virtual {p0, v2, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method


# virtual methods
.method public final getMAllMemory()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/MemoryManagerActivity;->mAllMemory$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method public final getMFreeMemory()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/MemoryManagerActivity;->mFreeMemory$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method public final getMProgressBar()Landroid/widget/ProgressBar;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/MemoryManagerActivity;->mProgressBar$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    return-object v0
.end method

.method public final getMUsedMemory()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/MemoryManagerActivity;->mUsedMemory$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method public init(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    sget-object p1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/MemoryManagerActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/MemoryManagerActivity$OXO1;

    invoke-virtual {p1, v0}, Lcom/szabh/smable3/component/BleConnector;->addHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    return-void
.end method

.method public initView()V
    .locals 10

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f140e26

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    sget-object v2, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v3, Lcom/szabh/smable3/BleKey;->SDCARD_INFO:Lcom/szabh/smable3/BleKey;

    sget-object v4, Lcom/szabh/smable3/BleKeyFlag;->READ:Lcom/szabh/smable3/BleKeyFlag;

    const/16 v8, 0x1c

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v2 .. v9}, Lcom/szabh/smable3/component/BaseBleConnector;->sendData$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;[BZZILjava/lang/Object;)Z

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/MemoryManagerActivity;->showFreeSpace()V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d00cb

    return v0
.end method

.method public onDestroy()V
    .locals 2

    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onDestroy()V

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/MemoryManagerActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/MemoryManagerActivity$OXO1;

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/component/BleConnector;->removeHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

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
