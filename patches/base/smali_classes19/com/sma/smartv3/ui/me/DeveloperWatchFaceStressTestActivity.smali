.class public final Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;
.super Lcom/bestmafen/androidbase/list/BaseListActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/bestmafen/androidbase/list/BaseListActivity<",
        "Lcom/sma/smartv3/model/WatchFaceInfo;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDeveloperWatchFaceStressTestActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeveloperWatchFaceStressTestActivity.kt\ncom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,292:1\n50#2,3:293\n53#2:299\n55#2,2:301\n1563#3:296\n1634#3,2:297\n1636#3:300\n255#4:303\n257#4,2:304\n257#4,2:306\n257#4,2:308\n257#4,2:310\n*S KotlinDebug\n*F\n+ 1 DeveloperWatchFaceStressTestActivity.kt\ncom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity\n*L\n136#1:293,3\n136#1:299\n136#1:301,2\n136#1:296\n136#1:297,2\n136#1:300\n146#1:303\n279#1:304,2\n280#1:306,2\n282#1:308,2\n283#1:310,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nDeveloperWatchFaceStressTestActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeveloperWatchFaceStressTestActivity.kt\ncom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,292:1\n50#2,3:293\n53#2:299\n55#2,2:301\n1563#3:296\n1634#3,2:297\n1636#3:300\n255#4:303\n257#4,2:304\n257#4,2:306\n257#4,2:308\n257#4,2:310\n*S KotlinDebug\n*F\n+ 1 DeveloperWatchFaceStressTestActivity.kt\ncom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity\n*L\n136#1:293,3\n136#1:299\n136#1:301,2\n136#1:296\n136#1:297,2\n136#1:300\n146#1:303\n279#1:304,2\n280#1:306,2\n282#1:308,2\n283#1:310,2\n*E\n"
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

.field private dataList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/WatchFaceInfo;",
            ">;"
        }
    .end annotation
.end field

.field private isSkipFailed:Z

.field private final mBleHandleCallback:Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity$OXO1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mCurTestFailedTime:I

.field private mCurTestSuccessTime:I

.field private mCurTestTime:I

.field private mProgressPop:Lcom/android/mltcode/paycertificationapi/c72;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final tvStatus$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;-><init>()V

    const-string v0, "WatchFaceStressTest"

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;->TAG:Ljava/lang/String;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IO0X1I1X1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/IO0X1I1X1;-><init>(Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;->btStart$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iX10iI1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/iX10iI1;-><init>(Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;->btStop$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/I10IIOX0i;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/I10IIOX0i;-><init>(Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;->tvStatus$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iXXiX0OI;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/iXXiX0OI;-><init>(Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;->cbSkipCheckBox$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity$OXO1;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity$OXO1;-><init>(Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity$OXO1;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;->onStartTest$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;->tvStatus_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;->testFailed$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;)V

    return-void
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;)Landroidx/appcompat/widget/AppCompatButton;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;->btStart_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;)Landroidx/appcompat/widget/AppCompatButton;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;)Landroidx/appcompat/widget/AppCompatButton;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;->btStop_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;)Landroidx/appcompat/widget/AppCompatButton;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;)Landroid/widget/CheckBox;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;->cbSkipCheckBox_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;)Landroid/widget/CheckBox;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getBtStop(Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;)Landroidx/appcompat/widget/AppCompatButton;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;->getBtStop()Landroidx/appcompat/widget/AppCompatButton;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getMCurTestSuccessTime$p(Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;->mCurTestSuccessTime:I

    return p0
.end method

.method public static final synthetic access$getMCurTestTime$p(Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;->mCurTestTime:I

    return p0
.end method

.method public static final synthetic access$getMProgressPop$p(Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;)Lcom/android/mltcode/paycertificationapi/c72;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;->mProgressPop:Lcom/android/mltcode/paycertificationapi/c72;

    return-object p0
.end method

.method public static final synthetic access$getTAG$p(Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;->TAG:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic access$setMCurTestSuccessTime$p(Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;->mCurTestSuccessTime:I

    return-void
.end method

.method public static final synthetic access$setMCurTestTime$p(Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;->mCurTestTime:I

    return-void
.end method

.method public static final synthetic access$setMProgressPop$p(Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;Lcom/android/mltcode/paycertificationapi/c72;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;->mProgressPop:Lcom/android/mltcode/paycertificationapi/c72;

    return-void
.end method

.method public static final synthetic access$startNextTest(Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;->startNextTest()V

    return-void
.end method

.method public static final synthetic access$startTest(Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;->startTest()V

    return-void
.end method

.method public static final synthetic access$testFailed(Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;->testFailed(Ljava/lang/String;)V

    return-void
.end method

.method private static final btStart_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;)Landroidx/appcompat/widget/AppCompatButton;
    .locals 1

    const v0, 0x7f0a01a3

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroidx/appcompat/widget/AppCompatButton;

    return-object p0
.end method

.method private static final btStop_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;)Landroidx/appcompat/widget/AppCompatButton;
    .locals 1

    const v0, 0x7f0a01ab

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroidx/appcompat/widget/AppCompatButton;

    return-object p0
.end method

.method private static final cbSkipCheckBox_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;)Landroid/widget/CheckBox;
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

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;->getBtStart()Landroidx/appcompat/widget/AppCompatButton;

    move-result-object p1

    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;->getBtStop()Landroidx/appcompat/widget/AppCompatButton;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;->getBtStart()Landroidx/appcompat/widget/AppCompatButton;

    move-result-object p1

    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;->getBtStop()Landroidx/appcompat/widget/AppCompatButton;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private final changeStatus()V
    .locals 6

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;->getTvStatus()Landroid/widget/TextView;

    move-result-object v0

    iget v1, p0, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;->mCurTestTime:I

    iget v2, p0, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;->mCurTestSuccessTime:I

    iget v3, p0, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;->mCurTestFailedTime:I

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

.method private final getBtStart()Landroidx/appcompat/widget/AppCompatButton;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;->btStart$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/AppCompatButton;

    return-object v0
.end method

.method private final getBtStop()Landroidx/appcompat/widget/AppCompatButton;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;->btStop$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/AppCompatButton;

    return-object v0
.end method

.method private final getCbSkipCheckBox()Landroid/widget/CheckBox;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;->cbSkipCheckBox$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    return-object v0
.end method

.method private final getTvStatus()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;->tvStatus$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private static final onStartTest$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    iput p1, p0, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;->mCurTestTime:I

    iput p1, p0, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;->mCurTestSuccessTime:I

    iput p1, p0, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;->mCurTestFailedTime:I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;->changeBtn(Z)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;->startTest()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;->changeStatus()V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private final startNextTest()V
    .locals 3

    iget v0, p0, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;->mCurTestTime:I

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;->dataList:Ljava/util/List;

    if-nez v1, :cond_0

    const-string v1, "dataList"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v1, 0x0

    :cond_0
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lt v0, v1, :cond_1

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " -> Test done!"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;->changeBtn(Z)V

    const-string v1, "\u538b\u6d4b\u7ed3\u675f"

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {v1, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;->changeStatus()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;->getTvStatus()Landroid/widget/TextView;

    move-result-object v0

    const-string v1, "\n\u538b\u6d4b\u7ed3\u675f"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->append(Ljava/lang/CharSequence;)V

    return-void

    :cond_1
    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " -> startNextTest"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;->startTest()V

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;->changeBtn(Z)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;->changeStatus()V

    return-void
.end method

.method private final startTest()V
    .locals 6

    :try_start_0
    iget v0, p0, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;->mCurTestTime:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;->mCurTestTime:I

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;->getCbSkipCheckBox()Landroid/widget/CheckBox;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v0

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;->isSkipFailed:Z

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;->dataList:Ljava/util/List;

    if-nez v0, :cond_0

    const-string v0, "dataList"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    iget v1, p0, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;->mCurTestTime:I

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/model/WatchFaceInfo;

    sget-object v1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v2, p0, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;->TAG:Ljava/lang/String;

    iget-boolean v3, p0, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;->isSkipFailed:Z

    iget v4, p0, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;->mCurTestTime:I

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " startTest -> isSkipFailed:"

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ", mCurTestTime:"

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", "

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;->syncWatchFace(Lcom/sma/smartv3/model/WatchFaceInfo;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_1
    sget-object v1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v2, p0, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;->TAG:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " startTest Exception:"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->XIi00iiXO(Ljava/lang/String;)V

    return-void
.end method

.method private final syncWatchFace(Lcom/sma/smartv3/model/WatchFaceInfo;)V
    .locals 9

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;->mProgressPop:Lcom/android/mltcode/paycertificationapi/c72;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    new-instance v0, Lcom/android/mltcode/paycertificationapi/c72;

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-direct {v0, p0, v3, v2, v1}, Lcom/android/mltcode/paycertificationapi/c72;-><init>(Landroid/app/Activity;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v3}, Lcom/android/mltcode/paycertificationapi/c72;->OX(I)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;->mProgressPop:Lcom/android/mltcode/paycertificationapi/c72;

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;->mProgressPop:Lcom/android/mltcode/paycertificationapi/c72;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;->mProgressPop:Lcom/android/mltcode/paycertificationapi/c72;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    :cond_1
    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;->mProgressPop:Lcom/android/mltcode/paycertificationapi/c72;

    if-eqz v0, :cond_3

    iget v2, p0, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;->mCurTestTime:I

    iget-object v3, p0, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;->dataList:Ljava/util/List;

    if-nez v3, :cond_2

    const-string v3, "dataList"

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    move-object v1, v3

    :goto_0
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {p1}, Lcom/sma/smartv3/model/WatchFaceInfo;->getId()I

    move-result v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "/"

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " - "

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/c72;->iOOX010X(Ljava/lang/String;)V

    :cond_3
    sget-object v0, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    invoke-virtual {v0}, Lcom/szabh/smable3/component/BaseBleCache;->getMPrototype()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lcom/szabh/smable3/component/BaseBleCache;->getMBleName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/sma/smartv3/model/WatchFaceInfo;->getId()I

    move-result v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "_"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ".bin"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/io/File;

    sget-object v2, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v2}, Lcom/android/mltcode/paycertificationapi/uz0;->X01IiOiIi(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v3

    invoke-direct {v1, v3, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v3

    if-eqz v3, :cond_4

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v3, p0, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;->TAG:Ljava/lang/String;

    invoke-static {v1}, Lcom/blankj/utilcode/util/FileUtils;->getSize(Ljava/io/File;)Ljava/lang/String;

    move-result-object v1

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " syncWatchFace -> WatchFace try get from WatchFaceFile file = "

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " size:"

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v3, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v4, Lcom/szabh/smable3/BleKey;->WATCH_FACE:Lcom/szabh/smable3/BleKey;

    invoke-static {v2, v0}, Lcom/android/mltcode/paycertificationapi/uz0;->O00(Lcom/android/mltcode/paycertificationapi/sz0;Ljava/lang/String;)Ljava/io/File;

    move-result-object v5

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lcom/szabh/smable3/component/BaseBleConnector;->sendStream$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Ljava/io/File;IILjava/lang/Object;)Z

    return-void

    :cond_4
    sget-object v3, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    invoke-virtual {p1}, Lcom/sma/smartv3/model/WatchFaceInfo;->getBinPath()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2}, Lcom/android/mltcode/paycertificationapi/uz0;->X01IiOiIi(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v2

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    const-string v4, "getAbsolutePath(...)"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity$syncWatchFace$2;

    invoke-direct {v4, p0, v0, v1}, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity$syncWatchFace$2;-><init>(Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;Ljava/lang/String;Ljava/io/File;)V

    invoke-virtual {v3, p1, v2, v0, v4}, Lcom/sma/smartv3/network/NetWorkUtils;->download(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sma/androidnetworklib/method/HttpProgressCallback;)V

    return-void
.end method

.method private final testFailed(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;->mProgressPop:Lcom/android/mltcode/paycertificationapi/c72;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;->mProgressPop:Lcom/android/mltcode/paycertificationapi/c72;

    iget v0, p0, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;->mCurTestFailedTime:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;->mCurTestFailedTime:I

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;->TAG:Ljava/lang/String;

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

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;->changeStatus()V

    iget-boolean p1, p0, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;->isSkipFailed:Z

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;->TAG:Ljava/lang/String;

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

    new-instance v0, Lcom/android/mltcode/paycertificationapi/X111XX;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/X111XX;-><init>(Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;)V

    const-wide/16 v1, 0xbb8

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :cond_1
    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " -> Interrupt the stress test!"

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-direct {p0, v1}, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;->changeBtn(Z)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;->getTvStatus()Landroid/widget/TextView;

    move-result-object p1

    const-string v0, "\n\u538b\u6d4b\u5931\u8d25\uff0c\u4e2d\u65ad\u538b\u6d4b"

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->append(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private static final testFailed$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;->startNextTest()V

    return-void
.end method

.method private static final tvStatus_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;)Landroid/widget/TextView;
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

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity$OXO1;

    invoke-virtual {p1, v0}, Lcom/szabh/smable3/component/BleConnector;->addHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->XO0O10()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    const-string v0, "WATCHFACE_LIST"

    :try_start_0
    invoke-virtual {p1, v0}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/google/gson/JsonParser;->parseString(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/gson/JsonElement;->getAsJsonArray()Lcom/google/gson/JsonArray;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lkotlin/collections/CollectionsKt__IterablesKt;->X00XIX1(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/gson/JsonElement;

    new-instance v2, Lcom/google/gson/Gson;

    invoke-direct {v2}, Lcom/google/gson/Gson;-><init>()V

    const-class v3, Lcom/sma/smartv3/model/WatchFaceInfo;

    invoke-virtual {v2, v1, v3}, Lcom/google/gson/Gson;->fromJson(Lcom/google/gson/JsonElement;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iI()Ljava/util/List;

    move-result-object v0

    :cond_0
    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;->dataList:Ljava/util/List;

    return-void
.end method

.method public initItem(Lcom/android/mltcode/paycertificationapi/ug6;Lcom/sma/smartv3/model/WatchFaceInfo;I)V
    .locals 1
    .param p1    # Lcom/android/mltcode/paycertificationapi/ug6;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lcom/sma/smartv3/model/WatchFaceInfo;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string p3, "holder"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "item"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p2}, Lcom/sma/smartv3/model/WatchFaceInfo;->getId()I

    move-result p2

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

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
    check-cast p2, Lcom/sma/smartv3/model/WatchFaceInfo;

    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;->initItem(Lcom/android/mltcode/paycertificationapi/ug6;Lcom/sma/smartv3/model/WatchFaceInfo;I)V

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
            "Lcom/sma/smartv3/model/WatchFaceInfo;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;->dataList:Ljava/util/List;

    if-nez v0, :cond_0

    const-string v0, "dataList"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    check-cast v0, Ljava/util/Collection;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt___CollectionsKt;->OO0Oi10(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public initView()V
    .locals 1

    invoke-super {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->initView()V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;->changeBtn(Z)V

    return-void
.end method

.method public itemLayoutId()I
    .locals 1

    const v0, 0x1090003

    return v0
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d007e

    return v0
.end method

.method public onDestroy()V
    .locals 2

    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onDestroy()V

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity$OXO1;

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/component/BleConnector;->removeHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    invoke-virtual {v0}, Lcom/szabh/smable3/component/BaseBleConnector;->launch()V

    return-void
.end method

.method public onHandleBackPressed()V
    .locals 2

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;->getBtStop()Landroidx/appcompat/widget/AppCompatButton;

    move-result-object v0

    const-string v1, "<get-btStop>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "\u538b\u6d4b\u4e2d..."

    invoke-static {v1, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onHandleBackPressed()V

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

    new-instance p1, Lcom/android/mltcode/paycertificationapi/iIX10IO;

    invoke-direct {p1, p0}, Lcom/android/mltcode/paycertificationapi/iIX10IO;-><init>(Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;)V

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

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

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " -> Stop test!"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/me/DeveloperWatchFaceStressTestActivity;->changeBtn(Z)V

    return-void
.end method
