.class public abstract Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "Registered"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBaseFirmwareUpgradeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseFirmwareUpgradeActivity.kt\ncom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n*L\n1#1,173:1\n27#2,2:174\n235#3,11:176\n246#3:188\n256#3:198\n1#4:187\n278#5,8:189\n298#5:197\n*S KotlinDebug\n*F\n+ 1 BaseFirmwareUpgradeActivity.kt\ncom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity\n*L\n126#1:174,2\n155#1:176,11\n155#1:188\n155#1:198\n155#1:187\n155#1:189,8\n155#1:197\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBaseFirmwareUpgradeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseFirmwareUpgradeActivity.kt\ncom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n*L\n1#1,173:1\n27#2,2:174\n235#3,11:176\n246#3:188\n256#3:198\n1#4:187\n278#5,8:189\n298#5:197\n*S KotlinDebug\n*F\n+ 1 BaseFirmwareUpgradeActivity.kt\ncom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity\n*L\n126#1:174,2\n155#1:176,11\n155#1:188\n155#1:198\n155#1:187\n155#1:189,8\n155#1:197\n*E\n"
    }
.end annotation


# instance fields
.field private final devInfo$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private isAutoUpdate:Z

.field private mCurrentVersion:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mStarted:Z

.field private mTargetVersion:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final progressButton$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvAlreadyOta$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvCurrent$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvInfo$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvLatest$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvSpeed$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvStep$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvTip$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private tvTopTip:Landroid/widget/TextView;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final tvUpdateDesc$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XO01OX1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/XO01OX1;-><init>(Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->tvLatest$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/I10I0OO;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/I10I0OO;-><init>(Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->tvCurrent$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XOOXXOX1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/XOOXXOX1;-><init>(Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->tvStep$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OIXX0X;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/OIXX0X;-><init>(Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->progressButton$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IXXXXXi10;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/IXXXXXi10;-><init>(Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->devInfo$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/Ii0OX1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/Ii0OX1;-><init>(Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->tvAlreadyOta$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/I1O0iOX0i;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/I1O0iOX0i;-><init>(Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->tvSpeed$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XI00I;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/XI00I;-><init>(Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->tvInfo$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/i0I01;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/i0I01;-><init>(Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->tvTip$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/I1iOO;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/I1iOO;-><init>(Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->tvUpdateDesc$delegate:Lkotlin/Lazy;

    const-string v0, "0.0.0"

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->mCurrentVersion:Ljava/lang/String;

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->mTargetVersion:Ljava/lang/String;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->tvTip_delegate$lambda$0(Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->tvLatest_delegate$lambda$0(Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IIX1OXO(Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->tvUpdateDesc_delegate$lambda$0(Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;)Landroid/widget/LinearLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->devInfo_delegate$lambda$0(Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;)Landroid/widget/LinearLayout;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->tvStep_delegate$lambda$0(Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->tvAlreadyOta_delegate$lambda$0(Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->tvSpeed_delegate$lambda$0(Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;)Lcom/sma/smartv3/view/ProgressButton;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->progressButton_delegate$lambda$0(Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;)Lcom/sma/smartv3/view/ProgressButton;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIO(Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->tvCurrent_delegate$lambda$0(Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method private static final devInfo_delegate$lambda$0(Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;)Landroid/widget/LinearLayout;
    .locals 1

    const v0, 0x7f0a06e3

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/LinearLayout;

    return-object p0
.end method

.method public static synthetic iIiiO(Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->tvInfo_delegate$lambda$0(Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method private static final progressButton_delegate$lambda$0(Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;)Lcom/sma/smartv3/view/ProgressButton;
    .locals 1

    const v0, 0x7f0a01b9

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/ProgressButton;

    return-object p0
.end method

.method private static final tvAlreadyOta_delegate$lambda$0(Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0c2e

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final tvCurrent_delegate$lambda$0(Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0c5f

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final tvInfo_delegate$lambda$0(Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0c9c

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final tvLatest_delegate$lambda$0(Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0ca2

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final tvSpeed_delegate$lambda$0(Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0d0f

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final tvStep_delegate$lambda$0(Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0d19

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final tvTip_delegate$lambda$0(Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a188f

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final tvUpdateDesc_delegate$lambda$0(Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a18ad

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method public static synthetic uploadDownloadInfo$default(Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;Ljava/lang/String;Ljava/lang/String;IILjava/lang/Object;)V
    .locals 0

    if-nez p5, :cond_1

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, -0x1

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->uploadDownloadInfo(Ljava/lang/String;Ljava/lang/String;I)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: uploadDownloadInfo"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic uploadOtaRecord$default(Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V
    .locals 6

    if-nez p7, :cond_4

    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_0

    const/4 p2, 0x0

    :cond_0
    move-object v2, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_1

    const-string p3, "1"

    :cond_1
    move-object v3, p3

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_2

    iget-object p4, p0, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->mCurrentVersion:Ljava/lang/String;

    :cond_2
    move-object v4, p4

    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_3

    iget-object p5, p0, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->mTargetVersion:Ljava/lang/String;

    :cond_3
    move-object v0, p0

    move-object v1, p1

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->uploadOtaRecord(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_4
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: uploadOtaRecord"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final getDevInfo()Landroid/widget/LinearLayout;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->devInfo$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "getValue(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/widget/LinearLayout;

    return-object v0
.end method

.method public final getMCurrentVersion()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->mCurrentVersion:Ljava/lang/String;

    return-object v0
.end method

.method public final getMStarted()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->mStarted:Z

    return v0
.end method

.method public final getMTargetVersion()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->mTargetVersion:Ljava/lang/String;

    return-object v0
.end method

.method public final getProgressButton()Lcom/sma/smartv3/view/ProgressButton;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->progressButton$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "getValue(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/sma/smartv3/view/ProgressButton;

    return-object v0
.end method

.method public final getTvAlreadyOta()Landroid/widget/TextView;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->tvAlreadyOta$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "getValue(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method public final getTvCurrent()Landroid/widget/TextView;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->tvCurrent$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "getValue(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method public final getTvInfo()Landroid/widget/TextView;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->tvInfo$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "getValue(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method public final getTvLatest()Landroid/widget/TextView;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->tvLatest$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "getValue(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method public final getTvSpeed()Landroid/widget/TextView;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->tvSpeed$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "getValue(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method public final getTvStep()Landroid/widget/TextView;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->tvStep$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "getValue(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method public final getTvTip()Landroid/widget/TextView;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->tvTip$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "getValue(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method public final getTvTopTip()Landroid/widget/TextView;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->tvTopTip:Landroid/widget/TextView;

    return-object v0
.end method

.method public final getTvUpdateDesc()Landroid/widget/TextView;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->tvUpdateDesc$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "getValue(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method public initView()V
    .locals 5
    .annotation build Landroidx/annotation/CallSuper;
    .end annotation

    const v0, 0x7f0a0c81

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->tvTopTip:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "isAutoUpdate"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->isAutoUpdate:Z

    sget-object v0, Lcom/sma/smartv3/initializer/BleInitializer;->IO:Lcom/sma/smartv3/initializer/BleInitializer;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/initializer/BleInitializer;->i1iII1i1(Z)V

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f140bf0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getProgressButton()Lcom/sma/smartv3/view/ProgressButton;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v3, 0x0

    const v4, 0x7f14146b

    invoke-static {v0, v4, v2, v1, v3}, Lcom/sma/smartv3/view/ProgressButton;->O00(Lcom/sma/smartv3/view/ProgressButton;IZILjava/lang/Object;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getTvTip()Landroid/widget/TextView;

    move-result-object v0

    sget-object v1, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/q62;->iiOOI()Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/q62;->X0100I()Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/q62;->I0i1OXiI()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const v1, 0x7f140d57

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_1
    :goto_0
    const v1, 0x7f140d56

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    :goto_1
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final isAutoUpdate()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->isAutoUpdate:Z

    return v0
.end method

.method public isNeedLaunch()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d00a2

    return v0
.end method

.method public onDestroy()V
    .locals 4
    .annotation build Landroidx/annotation/CallSuper;
    .end annotation

    sget-object v0, Lcom/sma/smartv3/initializer/BleInitializer;->IO:Lcom/sma/smartv3/initializer/BleInitializer;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/initializer/BleInitializer;->i1iII1i1(Z)V

    sget-object v0, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    sget-object v1, Lcom/szabh/smable3/BleKey;->WEATHER_REALTIME:Lcom/szabh/smable3/BleKey;

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3, v2}, Lcom/szabh/smable3/component/BaseBleCache;->remove$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)V

    sget-object v1, Lcom/szabh/smable3/BleKey;->WEATHER_FORECAST:Lcom/szabh/smable3/BleKey;

    invoke-static {v0, v1, v2, v3, v2}, Lcom/szabh/smable3/component/BaseBleCache;->remove$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)V

    sget-object v1, Lcom/szabh/smable3/BleKey;->WEATHER_REALTIME2:Lcom/szabh/smable3/BleKey;

    invoke-static {v0, v1, v2, v3, v2}, Lcom/szabh/smable3/component/BaseBleCache;->remove$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)V

    sget-object v1, Lcom/szabh/smable3/BleKey;->WEATHER_FORECAST2:Lcom/szabh/smable3/BleKey;

    invoke-static {v0, v1, v2, v3, v2}, Lcom/szabh/smable3/component/BaseBleCache;->remove$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)V

    sget-object v1, Lcom/szabh/smable3/BleKey;->WEATHER_REALTIME3:Lcom/szabh/smable3/BleKey;

    invoke-static {v0, v1, v2, v3, v2}, Lcom/szabh/smable3/component/BaseBleCache;->remove$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)V

    sget-object v1, Lcom/szabh/smable3/BleKey;->WEATHER_FORECAST3:Lcom/szabh/smable3/BleKey;

    invoke-static {v0, v1, v2, v3, v2}, Lcom/szabh/smable3/component/BaseBleCache;->remove$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->isNeedLaunch()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {v0}, Lcom/szabh/smable3/component/BaseBleConnector;->launch()V

    :cond_0
    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onDestroy()V

    return-void
.end method

.method public onHandleBackPressed()V
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->mStarted:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onHandleBackPressed()V

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

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->onHandleBackPressed()V

    return-void
.end method

.method public final setAutoUpdate(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->isAutoUpdate:Z

    return-void
.end method

.method public final setMCurrentVersion(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->mCurrentVersion:Ljava/lang/String;

    return-void
.end method

.method public final setMStarted(Z)V
    .locals 2

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->mStarted:Z

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getProgressButton()Lcom/sma/smartv3/view/ProgressButton;

    move-result-object v0

    xor-int/lit8 v1, p1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->disableOrientation()V

    :cond_0
    return-void
.end method

.method public final setMTargetVersion(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->mTargetVersion:Ljava/lang/String;

    return-void
.end method

.method public final setTvTopTip(Landroid/widget/TextView;)V
    .locals 0
    .param p1    # Landroid/widget/TextView;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->tvTopTip:Landroid/widget/TextView;

    return-void
.end method

.method public final updateDeviceInfo(Ljava/lang/String;)V
    .locals 9
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "firmwareVersion"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    const-class v1, Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/SPUtils;->remove(Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    const-string v2, "firmware_version_changed"

    invoke-static {v2, v0, v1, v0}, Lcom/android/mltcode/paycertificationapi/I01XX0;->XIi00iiXO(Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    sget-object v3, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    sget-object v4, Lcom/szabh/smable3/BleKey;->FIRMWARE_VERSION:Lcom/szabh/smable3/BleKey;

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v5, p1

    invoke-static/range {v3 .. v8}, Lcom/szabh/smable3/component/BaseBleCache;->putString$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;Ljava/lang/String;Lcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)V

    sget-object p1, Lcom/sma/smartv3/network/RequestCommonMethod;->INSTANCE:Lcom/sma/smartv3/network/RequestCommonMethod;

    new-instance v0, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity$updateDeviceInfo$1;

    invoke-direct {v0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity$updateDeviceInfo$1;-><init>()V

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/network/RequestCommonMethod;->updateDeviceInfo(Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    return-void
.end method

.method public final uploadDownloadInfo(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "url"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fileName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lcom/sma/smartv3/biz/StatManager;->OXO1:Lcom/sma/smartv3/biz/StatManager;

    new-instance v0, Ljava/io/File;

    sget-object v2, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v2}, Lcom/android/mltcode/paycertificationapi/uz0;->XXI(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2, p2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/blankj/utilcode/util/FileUtils;->getLength(Ljava/io/File;)J

    move-result-wide v3

    const/4 v5, 0x0

    move-object v2, p1

    move v6, p3

    invoke-virtual/range {v1 .. v6}, Lcom/sma/smartv3/biz/StatManager;->XO0O10(Ljava/lang/String;JII)V

    return-void
.end method

.method public final uploadOtaRecord(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 6
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "successFlag"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "otaType"

    invoke-static {p3, v1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "currentVersion"

    invoke-static {p4, v2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "targetVersion"

    invoke-static {p5, v3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {v4, v2, p4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p4, "trargetVersion"

    invoke-virtual {v4, p4, p5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v4, v1, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v4, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-nez p2, :cond_0

    const-string p2, ""

    :cond_0
    const-string p1, "remark"

    invoke-virtual {v4, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p1, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity$uploadOtaRecord$2;

    invoke-direct {p1}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity$uploadOtaRecord$2;-><init>()V

    invoke-virtual {v3}, Lcom/sma/smartv3/network/NetWorkUtils;->getHeadersMap()Ljava/util/Map;

    move-result-object p2

    const/4 p3, 0x0

    invoke-virtual {v3, p3, p3}, Lcom/sma/smartv3/network/NetWorkUtils;->loadPopup(Landroid/app/Activity;Landroid/view/View;)Lcom/android/mltcode/paycertificationapi/uq;

    move-result-object p4

    sget-object p5, Lcom/sma/smartv3/network/Api;->INSTANCE:Lcom/sma/smartv3/network/Api;

    invoke-virtual {p5}, Lcom/sma/smartv3/network/Api;->getBASE_URL()Ljava/lang/String;

    move-result-object p5

    const-string v0, "/ble_device/addOtaRecord"

    invoke-virtual {v3, p5, v0}, Lcom/sma/smartv3/network/NetWorkUtils;->convertBaseUrl(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p5

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v4}, Lkotlin/collections/OXO1;->X111IO(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, p2}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    sget-object v5, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-virtual {v3, v1, v2}, Lcom/sma/smartv3/network/NetWorkUtils;->printParam(Ljava/lang/String;Ljava/util/Map;)V

    sget-object v1, Lcom/sma/androidnetworklib/method/NetWork;->OXO1:Lcom/sma/androidnetworklib/method/NetWork;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p5

    new-instance v0, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity$uploadOtaRecord$$inlined$postV2$default$1;

    invoke-direct {v0, p3, p1, p4}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity$uploadOtaRecord$$inlined$postV2$default$1;-><init>(Landroid/app/Activity;Lcom/android/mltcode/paycertificationapi/O1XIiIO;Lcom/android/mltcode/paycertificationapi/uq;)V

    invoke-static {p5}, Lcom/androidnetworking/AndroidNetworking;->post(Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->addHeaders(Ljava/util/Map;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    invoke-virtual {p1, v4}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->addBodyParameter(Ljava/util/Map;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    invoke-virtual {p1, p5}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setTag(Ljava/lang/Object;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    sget-object p2, Lcom/androidnetworking/common/Priority;->HIGH:Lcom/androidnetworking/common/Priority;

    invoke-virtual {p1, p2}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setPriority(Lcom/androidnetworking/common/Priority;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->build()Lcom/androidnetworking/common/ANRequest;

    move-result-object p1

    const/4 p2, 0x1

    new-array p2, p2, [Ljava/lang/reflect/Type;

    const-class p3, Ljava/lang/Object;

    const/4 p4, 0x0

    aput-object p3, p2, p4

    const-class p3, Lcom/sma/androidnetworklib/model/Response;

    invoke-static {p3, p2}, Lcom/google/gson/reflect/TypeToken;->getParameterized(Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    move-result-object p2

    new-instance p3, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity$uploadOtaRecord$$inlined$postV2$default$2;

    invoke-direct {p3, v0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity$uploadOtaRecord$$inlined$postV2$default$2;-><init>(Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    invoke-virtual {p1, p2, p3}, Lcom/androidnetworking/common/ANRequest;->getAsParsed(Lcom/google/gson/reflect/TypeToken;Lcom/androidnetworking/interfaces/ParsedRequestListener;)V

    return-void
.end method
