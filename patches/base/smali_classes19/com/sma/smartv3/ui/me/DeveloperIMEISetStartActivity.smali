.class public final Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;
.super Lcom/sma/smartv3/ui/device/BaseListFunctionActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity$OXO1;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/sma/smartv3/ui/device/BaseListFunctionActivity<",
        "Lcom/bestmafen/baseble/scanner/BleDevice;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDeveloperIMEIStartActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeveloperIMEIStartActivity.kt\ncom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity\n+ 2 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 3 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,510:1\n176#2,11:511\n196#2:530\n252#3,7:522\n270#3:529\n1#4:531\n19#5:532\n15#5:533\n27#5,2:534\n*S KotlinDebug\n*F\n+ 1 DeveloperIMEIStartActivity.kt\ncom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity\n*L\n286#1:511,11\n286#1:530\n286#1:522,7\n286#1:529\n410#1:532\n410#1:533\n434#1:534,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nDeveloperIMEIStartActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeveloperIMEIStartActivity.kt\ncom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity\n+ 2 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 3 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,510:1\n176#2,11:511\n196#2:530\n252#3,7:522\n270#3:529\n1#4:531\n19#5:532\n15#5:533\n27#5,2:534\n*S KotlinDebug\n*F\n+ 1 DeveloperIMEIStartActivity.kt\ncom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity\n*L\n286#1:511,11\n286#1:530\n286#1:522,7\n286#1:529\n410#1:532\n410#1:533\n434#1:534,2\n*E\n"
    }
.end annotation


# instance fields
.field private final TAG:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final btStartSet$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final btStopSet$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private deviceAddress:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private deviceName:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final etId$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final etOldBleName$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final etSignal$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private filterName:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private isAutoSet:Z

.field private isReadAgain:Z

.field private isWriteAgain:Z

.field private final mBleHandleCallback:Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity$iO;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mConnectedFailMap:Ljava/util/HashMap;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final mConnectedFailRunnable:Ljava/lang/Runnable;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mCurIMEICheckAvailableData:Lcom/android/mltcode/paycertificationapi/IiXI010i;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final mHandler:Landroid/os/Handler;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final mScanner$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mWriteType:I

.field private rssi:I

.field private final spinnerWriteType$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private toId:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvSearchNumber$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvValue$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/BaseListFunctionActivity;-><init>()V

    const-string v0, "IMEISet"

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->TAG:Ljava/lang/String;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/i0111;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/i0111;-><init>(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->etId$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XXOOX0O;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/XXOOX0O;-><init>(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->spinnerWriteType$delegate:Lkotlin/Lazy;

    const-string v0, ""

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->toId:Ljava/lang/String;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/iX100iI11;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/iX100iI11;-><init>(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->etOldBleName$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/IOIi0i;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/IOIi0i;-><init>(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->btStartSet$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/OI0OX;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/OI0OX;-><init>(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->btStopSet$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/IO11X00;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/IO11X00;-><init>(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->etSignal$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/OXXII;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/OXXII;-><init>(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->tvSearchNumber$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/I1I1OO;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/I1I1OO;-><init>(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->tvValue$delegate:Lkotlin/Lazy;

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->deviceAddress:Ljava/lang/String;

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->deviceName:Ljava/lang/String;

    const/16 v1, 0x64

    iput v1, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->rssi:I

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->filterName:Ljava/lang/String;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/X0XXXXXX;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/X0XXXXXX;-><init>(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->mScanner$delegate:Lkotlin/Lazy;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->mConnectedFailMap:Ljava/util/HashMap;

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->mHandler:Landroid/os/Handler;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XX1XiXO;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/XX1XiXO;-><init>(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->mConnectedFailRunnable:Ljava/lang/Runnable;

    new-instance v0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity$iO;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity$iO;-><init>(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity$iO;

    return-void
.end method

.method public static synthetic I1(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->tvSearchNumber_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->tvValue_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IIX1OXO(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->initView$lambda$1(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;Landroid/widget/AdapterView;Landroid/view/View;IJ)V

    return-void
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)Landroid/widget/Spinner;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->spinnerWriteType_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)Landroid/widget/Spinner;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OII(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)Landroidx/appcompat/widget/AppCompatButton;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->btStopSet_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)Landroidx/appcompat/widget/AppCompatButton;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OX(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->dismissLoadPopup$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)V

    return-void
.end method

.method public static synthetic OiIIX101O(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->mConnectedFailRunnable$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)V

    return-void
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)Z
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->permissionBackgroundLocationRemind$lambda$0$0(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)Z

    move-result p0

    return p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)Landroid/widget/EditText;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->etSignal_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)Landroid/widget/EditText;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XX0(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)Landroidx/appcompat/widget/AppCompatButton;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->btStartSet_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)Landroidx/appcompat/widget/AppCompatButton;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIO(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)Lcom/android/mltcode/paycertificationapi/OXOI0XII;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->mScanner_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)Lcom/android/mltcode/paycertificationapi/OXOI0XII;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIii1(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)Landroid/widget/EditText;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->etId_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)Landroid/widget/EditText;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getBtStartSet(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)Landroidx/appcompat/widget/AppCompatButton;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->getBtStartSet()Landroidx/appcompat/widget/AppCompatButton;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getBtStopSet(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)Landroidx/appcompat/widget/AppCompatButton;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->getBtStopSet()Landroidx/appcompat/widget/AppCompatButton;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getDeviceAddress$p(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->deviceAddress:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic access$getDeviceName$p(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->deviceName:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic access$getEtOldBleName(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)Landroid/widget/EditText;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->getEtOldBleName()Landroid/widget/EditText;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getFilterName$p(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->filterName:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic access$getMConnectedFailMap$p(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)Ljava/util/HashMap;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->mConnectedFailMap:Ljava/util/HashMap;

    return-object p0
.end method

.method public static final synthetic access$getMCurIMEICheckAvailableData$p(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)Lcom/android/mltcode/paycertificationapi/IiXI010i;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->mCurIMEICheckAvailableData:Lcom/android/mltcode/paycertificationapi/IiXI010i;

    return-object p0
.end method

.method public static final synthetic access$getMList(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)Ljava/util/List;
    .locals 0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getMListAdapter(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)Lcom/android/mltcode/paycertificationapi/XII0Oi10O;
    .locals 0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMListAdapter()Lcom/android/mltcode/paycertificationapi/XII0Oi10O;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getMWriteType$p(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->mWriteType:I

    return p0
.end method

.method public static final synthetic access$getRssi$p(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->rssi:I

    return p0
.end method

.method public static final synthetic access$getTAG$p(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->TAG:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic access$getToId$p(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->toId:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic access$getTvSearchNumber(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->getTvSearchNumber()Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getTvValue(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->getTvValue()Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$isAutoSet$p(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->isAutoSet:Z

    return p0
.end method

.method public static final synthetic access$isReadAgain$p(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->isReadAgain:Z

    return p0
.end method

.method public static final synthetic access$isWriteAgain$p(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->isWriteAgain:Z

    return p0
.end method

.method public static final synthetic access$reStart(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->reStart()V

    return-void
.end method

.method public static final synthetic access$sendIMEI(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->sendIMEI(Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic access$setMCurIMEICheckAvailableData$p(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;Lcom/android/mltcode/paycertificationapi/IiXI010i;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->mCurIMEICheckAvailableData:Lcom/android/mltcode/paycertificationapi/IiXI010i;

    return-void
.end method

.method public static final synthetic access$setMWriteType$p(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->mWriteType:I

    return-void
.end method

.method public static final synthetic access$setReadAgain$p(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->isReadAgain:Z

    return-void
.end method

.method public static final synthetic access$setWriteAgain$p(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->isWriteAgain:Z

    return-void
.end method

.method private static final btStartSet_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)Landroidx/appcompat/widget/AppCompatButton;
    .locals 1

    const v0, 0x7f0a01a8

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroidx/appcompat/widget/AppCompatButton;

    return-object p0
.end method

.method private static final btStopSet_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)Landroidx/appcompat/widget/AppCompatButton;
    .locals 1

    const v0, 0x7f0a01b0

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroidx/appcompat/widget/AppCompatButton;

    return-object p0
.end method

.method private final dismissLoadPopup()V
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IIOIiOOO;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/IIOIiOOO;-><init>(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)V

    invoke-virtual {p0, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method private static final dismissLoadPopup$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)V
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_0
    return-void
.end method

.method private static final etId_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)Landroid/widget/EditText;
    .locals 1

    const v0, 0x7f0a0375

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/EditText;

    return-object p0
.end method

.method private static final etOldBleName_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)Landroid/widget/EditText;
    .locals 1

    const v0, 0x7f0a0377

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/EditText;

    return-object p0
.end method

.method private static final etSignal_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)Landroid/widget/EditText;
    .locals 1

    const v0, 0x7f0a037d

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/EditText;

    return-object p0
.end method

.method private final getBtStartSet()Landroidx/appcompat/widget/AppCompatButton;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->btStartSet$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/AppCompatButton;

    return-object v0
.end method

.method private final getBtStopSet()Landroidx/appcompat/widget/AppCompatButton;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->btStopSet$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/AppCompatButton;

    return-object v0
.end method

.method private final getEtId()Landroid/widget/EditText;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->etId$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    return-object v0
.end method

.method private final getEtOldBleName()Landroid/widget/EditText;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->etOldBleName$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    return-object v0
.end method

.method private final getEtSignal()Landroid/widget/EditText;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->etSignal$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    return-object v0
.end method

.method private final getMScanner()Lcom/android/mltcode/paycertificationapi/OXOI0XII;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->mScanner$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/android/mltcode/paycertificationapi/OXOI0XII;

    return-object v0
.end method

.method private final getSpinnerWriteType()Landroid/widget/Spinner;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->spinnerWriteType$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/Spinner;

    return-object v0
.end method

.method private final getTvSearchNumber()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->tvSearchNumber$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getTvValue()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->tvValue$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method public static synthetic iIiiO(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;Lcom/bestmafen/androidbase/extension/PermissionStatus;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->requestLocationPermission$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;Lcom/bestmafen/androidbase/extension/PermissionStatus;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iOOX010X(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)Landroid/widget/EditText;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->etOldBleName_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)Landroid/widget/EditText;

    move-result-object p0

    return-object p0
.end method

.method private static final initView$lambda$1(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->getEtOldBleName()Landroid/widget/EditText;

    move-result-object p1

    sget-object p2, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object p4

    invoke-interface {p4, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/bestmafen/baseble/scanner/BleDevice;

    invoke-virtual {p3}, Lcom/bestmafen/baseble/scanner/BleDevice;->getMName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/android/mltcode/paycertificationapi/q62;->iOO1ii1(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->getEtOldBleName()Landroid/widget/EditText;

    move-result-object p1

    const-string p2, "<get-etOldBleName>(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->startSearch(Landroid/view/View;)V

    return-void
.end method

.method private static final mConnectedFailRunnable$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)V
    .locals 6

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->TAG:Ljava/lang/String;

    iget-object v2, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->deviceAddress:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " mConnectedFailRunnable "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_2

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->mConnectedFailMap:Ljava/util/HashMap;

    iget-object v3, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->deviceAddress:Ljava/lang/String;

    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_0

    const/4 v4, 0x0

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    :cond_0
    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    add-int/lit8 v4, v4, 0x8

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v1, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_1
    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->TAG:Ljava/lang/String;

    iget-object v3, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->deviceAddress:Ljava/lang/String;

    iget-object v4, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->mConnectedFailMap:Ljava/util/HashMap;

    invoke-virtual {v4, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ConnectedFailTime "

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " -> skip"

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {v0, v2}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->closeConnection(Z)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->getEtOldBleName()Landroid/widget/EditText;

    move-result-object v0

    const-string v1, "<get-etOldBleName>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->startSearch(Landroid/view/View;)V

    :cond_2
    return-void
.end method

.method private static final mScanner_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)Lcom/android/mltcode/paycertificationapi/OXOI0XII;
    .locals 4

    sget-object v0, Lcom/android/mltcode/paycertificationapi/ut3;->OXO1:Lcom/android/mltcode/paycertificationapi/ut3;

    sget-object v1, Lcom/bestmafen/baseble/scanner/ScanMode;->LOW_LATENCY:Lcom/bestmafen/baseble/scanner/ScanMode;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2, v3}, Lcom/android/mltcode/paycertificationapi/ut3;->XIi00iiXO(Lcom/android/mltcode/paycertificationapi/ut3;[Ljava/util/UUID;Lcom/bestmafen/baseble/scanner/ScanMode;ILjava/lang/Object;)Lcom/android/mltcode/paycertificationapi/OXOI0XII;

    move-result-object v0

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/OXOI0XII;->IIX1OXO(I)Lcom/android/mltcode/paycertificationapi/OXOI0XII;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity$XO0O10;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity$XO0O10;-><init>(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)V

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/OXOI0XII;->XiOIO(Lcom/android/mltcode/paycertificationapi/OOXIOIiOO;)Lcom/android/mltcode/paycertificationapi/OXOI0XII;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity$O00;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity$O00;-><init>(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)V

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/OXOI0XII;->X1ii(Lcom/android/mltcode/paycertificationapi/i1OIOOIiX;)Lcom/android/mltcode/paycertificationapi/OXOI0XII;

    move-result-object p0

    return-object p0
.end method

.method private final permissionBackgroundLocationRemind()V
    .locals 4
    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x1d
    .end annotation

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseListFunctionActivity;->getMPermissionBackgroundPopup()Lcom/android/mltcode/paycertificationapi/go0;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Lcom/android/mltcode/paycertificationapi/go0;

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-direct {v0, p0, v1, v2, v3}, Lcom/android/mltcode/paycertificationapi/go0;-><init>(Landroid/app/Activity;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v1, 0x7f1401a9

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/go0;->O1O(I)V

    const v1, 0x7f14027f

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1, v3, v2, v3}, Lcom/android/mltcode/paycertificationapi/go0;->X11iII1O1(Lcom/android/mltcode/paycertificationapi/go0;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/i00XO0X0;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/i00XO0X0;-><init>(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)V

    const v2, 0x7f14122c

    invoke-virtual {v0, v2, v1}, Lcom/android/mltcode/paycertificationapi/go0;->X1IX(ILkotlin/jvm/functions/Function0;)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/device/BaseListFunctionActivity;->setMPermissionBackgroundPopup(Lcom/android/mltcode/paycertificationapi/go0;)V

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseListFunctionActivity;->getMPermissionBackgroundPopup()Lcom/android/mltcode/paycertificationapi/go0;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseListFunctionActivity;->getRootView()Landroid/view/View;

    move-result-object v1

    const-string v2, "<get-rootView>(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/I0OIO1i;->I1XOi1(Landroid/view/View;)V

    :cond_1
    return-void
.end method

.method private static final permissionBackgroundLocationRemind$lambda$0$0(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)Z
    .locals 2

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object p0

    const-string v0, "android.permission.ACCESS_FINE_LOCATION"

    const-string v1, "android.permission.ACCESS_BACKGROUND_LOCATION"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {p0, v0, v1}, Landroid/app/Activity;->requestPermissions([Ljava/lang/String;I)V

    const/4 p0, 0x1

    return p0
.end method

.method private final reStart()V
    .locals 3

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->mCurIMEICheckAvailableData:Lcom/android/mltcode/paycertificationapi/IiXI010i;

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " reStart"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->dismissLoadPopup()V

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {v0}, Lcom/szabh/smable3/component/BleConnector;->unbind()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->getEtOldBleName()Landroid/widget/EditText;

    move-result-object v0

    const-string v1, "<get-etOldBleName>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->startSearch(Landroid/view/View;)V

    return-void
.end method

.method private final requestEnableBluetooth()V
    .locals 6

    const/4 v4, 0x4

    const/4 v5, 0x0

    const-string v1, "android.bluetooth.adapter.action.REQUEST_ENABLE"

    const/4 v2, 0x1

    const/4 v3, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Lcom/android/mltcode/paycertificationapi/X1OOO;->IIX1OXO(Landroid/app/Activity;Ljava/lang/String;IIILjava/lang/Object;)V

    return-void
.end method

.method private final requestLocationPermission()V
    .locals 7

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->permissionBackgroundLocationRemind()V

    return-void

    :cond_0
    const-string v0, "LOCATION"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/PermissionUtils;->permission([Ljava/lang/String;)Lcom/blankj/utilcode/util/PermissionUtils;

    move-result-object v1

    const-string v0, "permission(...)"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Lcom/android/mltcode/paycertificationapi/OIIXX;

    invoke-direct {v4, p0}, Lcom/android/mltcode/paycertificationapi/OIIXX;-><init>(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lcom/android/mltcode/paycertificationapi/ds1;->iO(Lcom/blankj/utilcode/util/PermissionUtils;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    return-void
.end method

.method private static final requestLocationPermission$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;Lcom/bestmafen/androidbase/extension/PermissionStatus;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity$OXO1;->OXO1:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseListFunctionActivity;->permissionRemind()V

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->requestLocationPermission()V

    goto :goto_0

    :cond_1
    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->getEtOldBleName()Landroid/widget/EditText;

    move-result-object p1

    const-string v0, "<get-etOldBleName>(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->startSearch(Landroid/view/View;)V

    :goto_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private final sendIMEI(Ljava/lang/String;)V
    .locals 10

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " sendIMEI -> "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    new-instance v5, Lcom/szabh/smable3/entity/BleDeviceUniqueDataSettings;

    iget v0, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->mWriteType:I

    sget-object v1, Lkotlin/text/Charsets;->IiI10X:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    const-string v1, "getBytes(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v5, v0, p1}, Lcom/szabh/smable3/entity/BleDeviceUniqueDataSettings;-><init>(I[B)V

    sget-object v2, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v3, Lcom/szabh/smable3/BleKey;->DEVICE_UNIQUE_DATA_SET:Lcom/szabh/smable3/BleKey;

    sget-object v4, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    const/16 v8, 0x18

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v2 .. v9}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZILjava/lang/Object;)Z

    return-void
.end method

.method private final showLoadPopup()V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    if-nez v0, :cond_0

    new-instance v0, Lcom/android/mltcode/paycertificationapi/uq;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/android/mltcode/paycertificationapi/uq;-><init>(Landroid/app/Activity;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    return-void

    :cond_1
    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    :cond_2
    return-void
.end method

.method private static final spinnerWriteType_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)Landroid/widget/Spinner;
    .locals 1

    const v0, 0x7f0a0a7b

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/Spinner;

    return-object p0
.end method

.method private static final tvSearchNumber_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0d05

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final tvValue_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a18b0

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method


# virtual methods
.method public final clearHistory(Landroid/view/View;)V
    .locals 2
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " clearHistory"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    const-class v0, Lcom/android/mltcode/paycertificationapi/iI00I1XI;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/blankj/utilcode/util/SPUtils;->remove(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->getTvValue()Landroid/widget/TextView;

    move-result-object p1

    const-string v0, "0"

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->getEtOldBleName()Landroid/widget/EditText;

    move-result-object p1

    const-string v0, "<get-etOldBleName>(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->startSearch(Landroid/view/View;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->mConnectedFailMap:Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/util/HashMap;->clear()V

    return-void
.end method

.method public final getIMEIInfo(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 11
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mac"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "imei"

    invoke-static {p3, v1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    const-string v4, "bleName"

    invoke-virtual {v3, v4, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v9, 0x4

    const/4 v10, 0x0

    const-string v6, ":"

    const-string v7, ""

    const/4 v8, 0x0

    move-object v5, p2

    invoke-static/range {v5 .. v10}, Lcom/android/mltcode/paycertificationapi/oe5;->IXO0OOi(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v3, v1, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget p1, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->mWriteType:I

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    const-string p2, "type"

    invoke-virtual {v3, p2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p1, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity$getIMEIInfo$2;

    invoke-direct {p1, p0, p3}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity$getIMEIInfo$2;-><init>(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;Ljava/lang/String;)V

    const/4 p2, 0x0

    invoke-virtual {v2, p2, p2}, Lcom/sma/smartv3/network/NetWorkUtils;->loadPopup(Landroid/app/Activity;Landroid/view/View;)Lcom/android/mltcode/paycertificationapi/uq;

    move-result-object p3

    sget-object v0, Lcom/sma/smartv3/network/Api;->INSTANCE:Lcom/sma/smartv3/network/Api;

    invoke-virtual {v0}, Lcom/sma/smartv3/network/Api;->getBASE_URL()Ljava/lang/String;

    move-result-object v0

    const-string v1, "/imei/checkAvailable"

    invoke-virtual {v2, v0, v1}, Lcom/sma/smartv3/network/NetWorkUtils;->convertBaseUrl(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4, v3}, Lcom/sma/smartv3/network/NetWorkUtils;->printParam(Ljava/lang/String;Ljava/util/Map;)V

    sget-object v2, Lcom/sma/androidnetworklib/method/NetWork;->OXO1:Lcom/sma/androidnetworklib/method/NetWork;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity$getIMEIInfo$$inlined$post$default$1;

    invoke-direct {v1, p2, p1, p3}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity$getIMEIInfo$$inlined$post$default$1;-><init>(Landroid/app/Activity;Lcom/android/mltcode/paycertificationapi/O1XIiIO;Lcom/android/mltcode/paycertificationapi/uq;)V

    invoke-static {v0}, Lcom/androidnetworking/AndroidNetworking;->post(Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    invoke-virtual {p1, v3}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->addBodyParameter(Ljava/util/Map;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setTag(Ljava/lang/Object;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    sget-object p2, Lcom/androidnetworking/common/Priority;->HIGH:Lcom/androidnetworking/common/Priority;

    invoke-virtual {p1, p2}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setPriority(Lcom/androidnetworking/common/Priority;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->build()Lcom/androidnetworking/common/ANRequest;

    move-result-object p1

    const/4 p2, 0x1

    new-array p2, p2, [Ljava/lang/reflect/Type;

    const-class p3, Lcom/android/mltcode/paycertificationapi/IiXI010i;

    const/4 v0, 0x0

    aput-object p3, p2, v0

    const-class p3, Lcom/sma/androidnetworklib/model/Response;

    invoke-static {p3, p2}, Lcom/google/gson/reflect/TypeToken;->getParameterized(Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    move-result-object p2

    new-instance p3, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity$getIMEIInfo$$inlined$post$default$2;

    invoke-direct {p3, v1}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity$getIMEIInfo$$inlined$post$default$2;-><init>(Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    invoke-virtual {p1, p2, p3}, Lcom/androidnetworking/common/ANRequest;->getAsParsed(Lcom/google/gson/reflect/TypeToken;Lcom/androidnetworking/interfaces/ParsedRequestListener;)V

    return-void
.end method

.method public init(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    sget-object p1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity$iO;

    invoke-virtual {p1, v0}, Lcom/szabh/smable3/component/BleConnector;->addHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    return-void
.end method

.method public initItem(Lcom/android/mltcode/paycertificationapi/ug6;Lcom/bestmafen/baseble/scanner/BleDevice;I)V
    .locals 1
    .param p1    # Lcom/android/mltcode/paycertificationapi/ug6;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lcom/bestmafen/baseble/scanner/BleDevice;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string p3, "holder"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "item"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p2}, Lcom/bestmafen/baseble/scanner/BleDevice;->getMName()Ljava/lang/String;

    move-result-object p3

    const v0, 0x7f0a0cc7

    invoke-virtual {p1, v0, p3}, Lcom/android/mltcode/paycertificationapi/ug6;->OII(ILjava/lang/String;)Lcom/android/mltcode/paycertificationapi/ug6;

    .line 3
    invoke-virtual {p2}, Lcom/bestmafen/baseble/scanner/BleDevice;->getMBluetoothDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p3

    invoke-virtual {p3}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object p3

    const v0, 0x7f0a0c24

    invoke-virtual {p1, v0, p3}, Lcom/android/mltcode/paycertificationapi/ug6;->OII(ILjava/lang/String;)Lcom/android/mltcode/paycertificationapi/ug6;

    const p3, 0x7f0a066a

    .line 4
    invoke-virtual {p1, p3}, Lcom/android/mltcode/paycertificationapi/ug6;->O00(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    invoke-virtual {p2}, Lcom/bestmafen/baseble/scanner/BleDevice;->getMRssi()I

    move-result p2

    neg-int p2, p2

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageLevel(I)V

    return-void
.end method

.method public bridge synthetic initItem(Lcom/android/mltcode/paycertificationapi/ug6;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    check-cast p2, Lcom/bestmafen/baseble/scanner/BleDevice;

    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->initItem(Lcom/android/mltcode/paycertificationapi/ug6;Lcom/bestmafen/baseble/scanner/BleDevice;I)V

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
            "Lcom/bestmafen/baseble/scanner/BleDevice;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0
.end method

.method public initView()V
    .locals 5

    invoke-super {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->initView()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->getBtStartSet()Landroidx/appcompat/widget/AppCompatButton;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->getBtStopSet()Landroidx/appcompat/widget/AppCompatButton;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->getSpinnerWriteType()Landroid/widget/Spinner;

    move-result-object v0

    new-instance v1, Landroid/widget/ArrayAdapter;

    const-string v2, "imei"

    const-string v3, "sn"

    const-string v4, "\u8bf7\u9009\u62e9\u5199\u5165\u7c7b\u578b"

    filled-new-array {v4, v2, v3}, [Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iXiX011([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const v3, 0x1090008

    invoke-direct {v1, p0, v3, v2}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    const v2, 0x1090009

    invoke-virtual {v1, v2}, Landroid/widget/ArrayAdapter;->setDropDownViewResource(I)V

    invoke-virtual {v0, v1}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->getSpinnerWriteType()Landroid/widget/Spinner;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity$XIi00iiXO;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity$XIi00iiXO;-><init>(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/AdapterView;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMListView()Landroid/widget/ListView;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/iiX11XIi;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/iiX11XIi;-><init>(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    return-void
.end method

.method public itemLayoutId()I
    .locals 1

    const v0, 0x7f0d0ed7

    return v0
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0071

    return v0
.end method

.method public onAttachedToWindow()V
    .locals 2

    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onAttachedToWindow()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->getEtOldBleName()Landroid/widget/EditText;

    move-result-object v0

    const-string v1, "<get-etOldBleName>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->startSearch(Landroid/view/View;)V

    return-void
.end method

.method public onDestroy()V
    .locals 2

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/component/BaseBleConnector;->setNeedBind(Z)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/component/BaseBleConnector;->setOtaMode(Z)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity$iO;

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/component/BleConnector;->removeHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onDestroy()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->getMScanner()Lcom/android/mltcode/paycertificationapi/OXOI0XII;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/OXOI0XII;->XIi00iiXO()V

    return-void
.end method

.method public final startSearch(Landroid/view/View;)V
    .locals 6
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->mHandler:Landroid/os/Handler;

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->mConnectedFailRunnable:Ljava/lang/Runnable;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    const-string p1, "android.permission.ACCESS_FINE_LOCATION"

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/PermissionUtils;->isGranted([Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->requestLocationPermission()V

    return-void

    :cond_0
    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object p1

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothAdapter;->isEnabled()Z

    move-result p1

    if-nez p1, :cond_1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->requestEnableBluetooth()V

    return-void

    :cond_1
    invoke-static {}, Lcom/sma/smartv3/util/UtilsKt;->X1()Z

    move-result p1

    if-nez p1, :cond_2

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseListFunctionActivity;->locationServerRemind()V

    return-void

    :cond_2
    const p1, 0x7f1411e0

    invoke-static {p1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->getEtSignal()Landroid/widget/EditText;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-nez p1, :cond_3

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->getEtSignal()Landroid/widget/EditText;

    move-result-object p1

    const-string v0, "100"

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_3
    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->getEtSignal()Landroid/widget/EditText;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->rssi:I

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->getEtOldBleName()Landroid/widget/EditText;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->filterName:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->clear()V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMListAdapter()Lcom/android/mltcode/paycertificationapi/XII0Oi10O;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->getTvSearchNumber()Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const v1, 0x7f1403fb

    invoke-virtual {p0, v1, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->getMScanner()Lcom/android/mltcode/paycertificationapi/OXOI0XII;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/OXOI0XII;->XXI(Z)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->TAG:Ljava/lang/String;

    iget-object v2, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->filterName:Ljava/lang/String;

    iget v3, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->rssi:I

    iget-boolean v4, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->isReadAgain:Z

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " start scan s: "

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->isReadAgain:Z

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->isWriteAgain:Z

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->getTvValue()Landroid/widget/TextView;

    move-result-object p1

    sget-object v1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    new-instance v2, Lcom/android/mltcode/paycertificationapi/iI00I1XI;

    const/4 v3, 0x0

    invoke-direct {v2, v3, v0, v3}, Lcom/android/mltcode/paycertificationapi/iI00I1XI;-><init>(Ljava/util/ArrayList;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    const-class v3, Lcom/android/mltcode/paycertificationapi/iI00I1XI;

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v3}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    move-object v2, v0

    :goto_0
    check-cast v2, Lcom/android/mltcode/paycertificationapi/iI00I1XI;

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/iI00I1XI;->XO0O10()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final startSet(Landroid/view/View;)V
    .locals 5
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->getEtId()Landroid/widget/EditText;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->toId:Ljava/lang/String;

    iget p1, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->mWriteType:I

    const/4 v0, 0x0

    if-nez p1, :cond_0

    const-string p1, "\u8bf7\u9009\u62e9\u5199\u5165\u7c7b\u578b"

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_1

    const-string p1, "No device!"

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_1
    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->showLoadPopup()V

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->mHandler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->mConnectedFailRunnable:Ljava/lang/Runnable;

    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v3, 0x1e

    invoke-virtual {v2, v3, v4}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v2

    invoke-virtual {p1, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->isAutoSet:Z

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/bestmafen/baseble/scanner/BleDevice;

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->getBtStopSet()Landroidx/appcompat/widget/AppCompatButton;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {v1}, Lcom/bestmafen/baseble/scanner/BleDevice;->getMBluetoothDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v2

    invoke-virtual {v2}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v2

    const-string v3, "getAddress(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v2, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->deviceAddress:Ljava/lang/String;

    invoke-virtual {v1}, Lcom/bestmafen/baseble/scanner/BleDevice;->getMName()Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->deviceName:Ljava/lang/String;

    sget-object v2, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {v2, v0}, Lcom/szabh/smable3/component/BaseBleConnector;->setNeedBind(Z)V

    invoke-virtual {v2, p1}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->setMConnectDirectly(Z)V

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-static {v2, v1, v0, v3, v4}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->setBleDevice$default(Lcom/bestmafen/baseble/connector/AbsBleConnector;Lcom/bestmafen/baseble/scanner/BleDevice;IILjava/lang/Object;)Lcom/bestmafen/baseble/connector/AbsBleConnector;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->connect(Z)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->TAG:Ljava/lang/String;

    iget-boolean v2, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->isAutoSet:Z

    invoke-virtual {v1}, Lcom/bestmafen/baseble/scanner/BleDevice;->getMName()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, " connect new device -> "

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    return-void
.end method

.method public final stopSet(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->isAutoSet:Z

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->getBtStopSet()Landroidx/appcompat/widget/AppCompatButton;

    move-result-object p1

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method
