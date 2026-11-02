.class public final Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;
.super Lcom/bestmafen/androidbase/list/BaseListActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/bestmafen/androidbase/list/BaseListActivity<",
        "Lcom/sma/smartv3/model/FirmwareVersion;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDeveloperOtaStressTestActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeveloperOtaStressTestActivity.kt\ncom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,288:1\n19#2:289\n15#2:290\n27#2,2:291\n11#2,2:293\n257#3,2:295\n257#3,2:297\n257#3,2:299\n257#3,2:301\n69#4,3:303\n72#4,5:307\n69#4,3:312\n72#4,5:316\n69#4,3:321\n72#4,5:325\n69#4,3:330\n72#4,5:334\n1#5:306\n1#5:315\n1#5:324\n1#5:333\n*S KotlinDebug\n*F\n+ 1 DeveloperOtaStressTestActivity.kt\ncom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity\n*L\n123#1:289\n123#1:290\n179#1:291,2\n180#1:293,2\n224#1:295,2\n225#1:297,2\n227#1:299,2\n228#1:301,2\n242#1:303,3\n242#1:307,5\n244#1:312,3\n244#1:316,5\n249#1:321,3\n249#1:325,5\n253#1:330,3\n253#1:334,5\n242#1:306\n244#1:315\n249#1:324\n253#1:333\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nDeveloperOtaStressTestActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeveloperOtaStressTestActivity.kt\ncom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,288:1\n19#2:289\n15#2:290\n27#2,2:291\n11#2,2:293\n257#3,2:295\n257#3,2:297\n257#3,2:299\n257#3,2:301\n69#4,3:303\n72#4,5:307\n69#4,3:312\n72#4,5:316\n69#4,3:321\n72#4,5:325\n69#4,3:330\n72#4,5:334\n1#5:306\n1#5:315\n1#5:324\n1#5:333\n*S KotlinDebug\n*F\n+ 1 DeveloperOtaStressTestActivity.kt\ncom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity\n*L\n123#1:289\n123#1:290\n179#1:291,2\n180#1:293,2\n224#1:295,2\n225#1:297,2\n227#1:299,2\n228#1:301,2\n242#1:303,3\n242#1:307,5\n244#1:312,3\n244#1:316,5\n249#1:321,3\n249#1:325,5\n253#1:330,3\n253#1:334,5\n242#1:306\n244#1:315\n249#1:324\n253#1:333\n*E\n"
    }
.end annotation


# instance fields
.field private final TAG:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final btStart$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final btStop$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final cbSkipCheckBox$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private dataList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/model/FirmwareVersion;",
            ">;"
        }
    .end annotation
.end field

.field private final etTestTime$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private isSkipFailed:Z

.field private final mBleHandleCallback:Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity$OXO1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mConnectedFailRunnable:Ljava/lang/Runnable;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mCurTestFailedTime:I

.field private mCurTestSuccessTime:I

.field private mCurTestTime:I

.field private final mHandler:Landroid/os/Handler;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mTestFirmwareList:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/FirmwareVersion;",
            ">;"
        }
    .end annotation
.end field

.field private mTotalTestTime:I

.field private final tvStatus$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;-><init>()V

    const-string v0, "OtaStressTest"

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->TAG:Ljava/lang/String;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/O1OOX11I;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/O1OOX11I;-><init>(Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->btStart$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iX1OXi;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/iX1OXi;-><init>(Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->btStop$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IX1i0I1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/IX1i0I1;-><init>(Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->etTestTime$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/i1X0iIXXi;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/i1X0iIXXi;-><init>(Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->tvStatus$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XI0II;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/XI0II;-><init>(Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->cbSkipCheckBox$delegate:Lkotlin/Lazy;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->mTestFirmwareList:Ljava/util/List;

    const/4 v0, 0x1

    iput v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->mTotalTestTime:I

    new-instance v0, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity$OXO1;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity$OXO1;-><init>(Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity$OXO1;

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->mHandler:Landroid/os/Handler;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XXiO1XO;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/XXiO1XO;-><init>(Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->mConnectedFailRunnable:Ljava/lang/Runnable;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->mConnectedFailRunnable$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;)V

    return-void
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;)Landroid/widget/EditText;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->etTestTime_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;)Landroid/widget/EditText;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IIX1OXO(Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;)Landroidx/appcompat/widget/AppCompatButton;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->btStart_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;)Landroidx/appcompat/widget/AppCompatButton;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->testFailed$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;)V

    return-void
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->onStartTest$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;)Landroid/widget/CheckBox;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->cbSkipCheckBox_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;)Landroid/widget/CheckBox;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->tvStatus_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;)Landroidx/appcompat/widget/AppCompatButton;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->btStop_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;)Landroidx/appcompat/widget/AppCompatButton;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getBtStop(Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;)Landroidx/appcompat/widget/AppCompatButton;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->getBtStop()Landroidx/appcompat/widget/AppCompatButton;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getMConnectedFailRunnable$p(Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;)Ljava/lang/Runnable;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->mConnectedFailRunnable:Ljava/lang/Runnable;

    return-object p0
.end method

.method public static final synthetic access$getMCurTestSuccessTime$p(Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->mCurTestSuccessTime:I

    return p0
.end method

.method public static final synthetic access$getMHandler$p(Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->mHandler:Landroid/os/Handler;

    return-object p0
.end method

.method public static final synthetic access$setMCurTestSuccessTime$p(Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->mCurTestSuccessTime:I

    return-void
.end method

.method public static final synthetic access$startNextTest(Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->startNextTest()V

    return-void
.end method

.method public static final synthetic access$testFailed(Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->testFailed(Ljava/lang/String;)V

    return-void
.end method

.method private static final btStart_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;)Landroidx/appcompat/widget/AppCompatButton;
    .locals 1

    const v0, 0x7f0a01a3

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroidx/appcompat/widget/AppCompatButton;

    return-object p0
.end method

.method private static final btStop_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;)Landroidx/appcompat/widget/AppCompatButton;
    .locals 1

    const v0, 0x7f0a01ab

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroidx/appcompat/widget/AppCompatButton;

    return-object p0
.end method

.method private static final cbSkipCheckBox_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;)Landroid/widget/CheckBox;
    .locals 1

    const v0, 0x7f0a0214

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/CheckBox;

    return-object p0
.end method

.method private final changeBtn(Z)V
    .locals 4

    const/4 v0, 0x0

    const-string v1, "<get-btStop>(...)"

    const/16 v2, 0x8

    const-string v3, "<get-btStart>(...)"

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->getBtStart()Landroidx/appcompat/widget/AppCompatButton;

    move-result-object p1

    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->getBtStop()Landroidx/appcompat/widget/AppCompatButton;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->getBtStart()Landroidx/appcompat/widget/AppCompatButton;

    move-result-object p1

    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->getBtStop()Landroidx/appcompat/widget/AppCompatButton;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private final changeStatus()V
    .locals 6

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->getTvStatus()Landroid/widget/TextView;

    move-result-object v0

    iget v1, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->mCurTestTime:I

    iget v2, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->mCurTestSuccessTime:I

    iget v3, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->mCurTestFailedTime:I

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "\u5f53\u524d\u6d4b\u8bd5"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "\u6b21\uff0c\u6210\u529f"

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "\u6b21\uff0c\u5931\u8d25"

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "\u6b21"

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private static final etTestTime_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;)Landroid/widget/EditText;
    .locals 1

    const v0, 0x7f0a0381

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/EditText;

    return-object p0
.end method

.method private final getBtStart()Landroidx/appcompat/widget/AppCompatButton;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->btStart$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/AppCompatButton;

    return-object v0
.end method

.method private final getBtStop()Landroidx/appcompat/widget/AppCompatButton;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->btStop$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/AppCompatButton;

    return-object v0
.end method

.method private final getCbSkipCheckBox()Landroid/widget/CheckBox;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->cbSkipCheckBox$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    return-object v0
.end method

.method private final getEtTestTime()Landroid/widget/EditText;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->etTestTime$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    return-object v0
.end method

.method private final getTvStatus()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->tvStatus$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private static final mConnectedFailRunnable$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;)V
    .locals 3

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {v0}, Lcom/szabh/smable3/component/BleConnector;->isAvailable()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " testFailed -> The device connection is abnormal"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->mCurTestFailedTime:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->mCurTestFailedTime:I

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->changeBtn(Z)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->changeStatus()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->getTvStatus()Landroid/widget/TextView;

    move-result-object p0

    const-string v0, "\n\u8bbe\u5907\u8fde\u63a5\u5f02\u5e38"

    invoke-virtual {p0, v0}, Landroid/widget/TextView;->append(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method private static final onStartTest$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->getEtTestTime()Landroid/widget/EditText;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    const/4 v0, 0x1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    goto :goto_0

    :cond_0
    move p1, v0

    :goto_0
    iput p1, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->mTotalTestTime:I

    const/4 p1, 0x0

    iput p1, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->mCurTestTime:I

    iput p1, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->mCurTestSuccessTime:I

    iput p1, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->mCurTestFailedTime:I

    invoke-direct {p0, v0}, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->changeBtn(Z)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->mTestFirmwareList:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->mTestFirmwareList:Ljava/util/List;

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->dataList:Ljava/util/ArrayList;

    if-nez v0, :cond_1

    const-string v0, "dataList"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_1
    const/4 v1, 0x2

    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IO0OOi(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {p1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->startTest()V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private final startNextTest()V
    .locals 3

    iget v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->mCurTestTime:I

    iget v1, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->mTotalTestTime:I

    if-lt v0, v1, :cond_0

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " -> Test done!"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->changeBtn(Z)V

    const-string v1, "\u538b\u6d4b\u7ed3\u675f"

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {v1, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->changeStatus()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->getTvStatus()Landroid/widget/TextView;

    move-result-object v0

    const-string v1, "\n\u538b\u6d4b\u7ed3\u675f"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->append(Ljava/lang/CharSequence;)V

    return-void

    :cond_0
    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " -> startNextTest"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->startTest()V

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->changeBtn(Z)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->changeStatus()V

    return-void
.end method

.method private final startTest()V
    .locals 7

    sget-object v0, Lcom/sma/smartv3/initializer/BleInitializer;->IO:Lcom/sma/smartv3/initializer/BleInitializer;

    invoke-virtual {v0}, Lcom/sma/smartv3/initializer/BleInitializer;->OI()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " startTest -> Upgrading"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    return-void

    :cond_0
    iget v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->mCurTestTime:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->mCurTestTime:I

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->getCbSkipCheckBox()Landroid/widget/CheckBox;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v0

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->isSkipFailed:Z

    iget v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->mCurTestTime:I

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->mTestFirmwareList:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    rem-int/2addr v0, v1

    sget-object v1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v2

    const-class v3, Lcom/sma/smartv3/model/ExtraPackVersions;

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/blankj/utilcode/util/SPUtils;->remove(Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    iget-object v2, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->mTestFirmwareList:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    const-class v3, Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lcom/google/gson/Gson;

    invoke-direct {v4}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v4, v2}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v3, v2}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v2, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->TAG:Ljava/lang/String;

    iget-boolean v3, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->isSkipFailed:Z

    iget v4, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->mCurTestTime:I

    iget v5, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->mTotalTestTime:I

    iget-object v6, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->mTestFirmwareList:Ljava/util/List;

    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " startTest -> isSkipFailed:"

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ", mCurTestTime:"

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", mTotalTestTime:"

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", "

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->toFirmwareUpdate()V

    return-void
.end method

.method private final testFailed(Ljava/lang/String;)V
    .locals 3

    iget v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->mCurTestFailedTime:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->mCurTestFailedTime:I

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " testFailed -> reason: "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {p1, v2}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->changeStatus()V

    iget-boolean p1, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->isSkipFailed:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " -> The stress test failed, Skip to the next stress test!"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XOX1i1X;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/XOX1i1X;-><init>(Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;)V

    const-wide/16 v1, 0x7d0

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " -> Interrupt the stress test!"

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-direct {p0, v1}, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->changeBtn(Z)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->getTvStatus()Landroid/widget/TextView;

    move-result-object p1

    const-string v0, "\n\u538b\u6d4b\u5931\u8d25\uff0c\u4e2d\u65ad\u538b\u6d4b"

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->append(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private static final testFailed$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->startNextTest()V

    return-void
.end method

.method private final toFirmwareUpdate()V
    .locals 4

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "isAutoUpdate"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    sget-object v1, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    invoke-virtual {v1}, Lcom/szabh/smable3/component/BaseBleCache;->getMPlatform()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v3

    sparse-switch v3, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v1, "JL707Lite"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_0

    :sswitch_1
    const-string v3, "SIFLI"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v1}, Lcom/szabh/smable3/component/BaseBleCache;->getMPrototype()Ljava/lang/String;

    move-result-object v1

    const-string v2, "SF12"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Landroid/content/Intent;

    const-class v2, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;

    invoke-direct {v1, p0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v1, v0}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    invoke-virtual {p0, v1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return-void

    :cond_0
    new-instance v1, Landroid/content/Intent;

    const-class v2, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSActivity;

    invoke-direct {v1, p0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v1, v0}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    invoke-virtual {p0, v1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return-void

    :sswitch_2
    const-string v1, "JL707"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_0

    :sswitch_3
    const-string v1, "ATS"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    new-instance v1, Landroid/content/Intent;

    const-class v2, Lcom/sma/smartv3/ui/device/FirmwareUpgradeATSActivity;

    invoke-direct {v1, p0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v1, v0}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    invoke-virtual {p0, v1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return-void

    :sswitch_4
    const-string v1, "JL"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    :cond_2
    :goto_0
    return-void

    :cond_3
    new-instance v1, Landroid/content/Intent;

    const-class v2, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;

    invoke-direct {v1, p0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v1, v0}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    invoke-virtual {p0, v1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x942 -> :sswitch_4
        0xfe80 -> :sswitch_3
        0x4362bfc -> :sswitch_2
        0x4b3de2d -> :sswitch_1
        0x652bf2ca -> :sswitch_0
    .end sparse-switch
.end method

.method private static final tvStatus_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0d18

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method


# virtual methods
.method public init(Landroid/os/Bundle;)V
    .locals 4
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    sget-object p1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity$OXO1;

    invoke-virtual {p1, v0}, Lcom/szabh/smable3/component/BleConnector;->addHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    new-instance v0, Lcom/sma/smartv3/model/FirmwareVersionList;

    const/4 v1, 0x0

    const/4 v2, 0x3

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2, v1}, Lcom/sma/smartv3/model/FirmwareVersionList;-><init>(ILjava/util/ArrayList;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v1, Lcom/google/gson/Gson;

    invoke-direct {v1}, Lcom/google/gson/Gson;-><init>()V

    const-class v2, Lcom/sma/smartv3/model/FirmwareVersionList;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1, v2}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, p1

    :goto_0
    check-cast v0, Lcom/sma/smartv3/model/FirmwareVersionList;

    invoke-virtual {v0}, Lcom/sma/smartv3/model/FirmwareVersionList;->getData()Ljava/util/ArrayList;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->dataList:Ljava/util/ArrayList;

    return-void
.end method

.method public initEvent()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public initItem(Lcom/android/mltcode/paycertificationapi/ug6;Lcom/sma/smartv3/model/FirmwareVersion;I)V
    .locals 1
    .param p1    # Lcom/android/mltcode/paycertificationapi/ug6;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lcom/sma/smartv3/model/FirmwareVersion;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string p3, "holder"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "item"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p2}, Lcom/sma/smartv3/model/FirmwareVersion;->toString()Ljava/lang/String;

    move-result-object p2

    const p3, 0x1020014

    invoke-virtual {p1, p3, p2}, Lcom/android/mltcode/paycertificationapi/ug6;->OII(ILjava/lang/String;)Lcom/android/mltcode/paycertificationapi/ug6;

    .line 3
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const v0, 0x7f06024d

    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getColor(I)I

    move-result p2

    invoke-virtual {p1, p3, p2}, Lcom/android/mltcode/paycertificationapi/ug6;->OX(II)Lcom/android/mltcode/paycertificationapi/ug6;

    return-void
.end method

.method public bridge synthetic initItem(Lcom/android/mltcode/paycertificationapi/ug6;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    check-cast p2, Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->initItem(Lcom/android/mltcode/paycertificationapi/ug6;Lcom/sma/smartv3/model/FirmwareVersion;I)V

    return-void
.end method

.method public initList()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/FirmwareVersion;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->dataList:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    const-string v0, "dataList"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    return-object v0
.end method

.method public initView()V
    .locals 1

    invoke-super {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->initView()V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->changeBtn(Z)V

    return-void
.end method

.method public itemLayoutId()I
    .locals 1

    const v0, 0x1090003

    return v0
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0062

    return v0
.end method

.method public onDestroy()V
    .locals 2

    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onDestroy()V

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity$OXO1;

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/component/BleConnector;->removeHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    sget-object v0, Lcom/sma/smartv3/initializer/BleInitializer;->IO:Lcom/sma/smartv3/initializer/BleInitializer;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/initializer/BleInitializer;->i1iII1i1(Z)V

    return-void
.end method

.method public final onFirmwareUpgradeDone(Ljava/lang/String;)V
    .locals 4
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "FRIMWARE_UPGRADE_DONE"
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " onFirmwareUpgradeDone "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->changeStatus()V

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->mHandler:Landroid/os/Handler;

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->mConnectedFailRunnable:Ljava/lang/Runnable;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->mHandler:Landroid/os/Handler;

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->mConnectedFailRunnable:Ljava/lang/Runnable;

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    sget-object v2, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    invoke-virtual {v2}, Lcom/szabh/smable3/component/BaseBleCache;->getMPlatform()Ljava/lang/String;

    move-result-object v2

    const-string v3, "ATS"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const-wide/16 v2, 0x4

    goto :goto_0

    :cond_0
    const-wide/16 v2, 0x2

    :goto_0
    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v1

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public onResume()V
    .locals 0

    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onResume()V

    return-void
.end method

.method public final onStartTest(Landroid/view/View;)V
    .locals 3
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->dataList:Ljava/util/ArrayList;

    const-string v0, "dataList"

    if-nez p1, :cond_0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->dataList:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-nez p1, :cond_1

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object p1, v1

    :cond_1
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    const/4 v0, 0x2

    const/4 v2, 0x0

    if-ge p1, v0, :cond_2

    const-string p1, "ota\u9519\u8bef, \u8f6e\u8bad\u5347\u7ea7\u7684ota\u914d\u7f6e\u6587\u4ef6\u4e0d\u80fd\u5c11\u4e8e\u4e24\u4e2a\u7248\u672c\u4fe1\u606f"

    new-array v0, v2, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_2
    new-instance p1, Lcom/android/mltcode/paycertificationapi/XIiiXXO;

    invoke-direct {p1, p0}, Lcom/android/mltcode/paycertificationapi/XIiiXXO;-><init>(Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;)V

    const/4 v0, 0x1

    invoke-static {v2, p1, v0, v1}, Lcom/android/mltcode/paycertificationapi/X0IOiX1O;->XIi00iiXO(ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Z

    return-void
.end method

.method public final onStopTest(Landroid/view/View;)V
    .locals 2
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " -> Stop test!"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/me/DeveloperOtaStressTestActivity;->changeBtn(Z)V

    return-void
.end method
