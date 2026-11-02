.class public final Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;
.super Lcom/sma/smartv3/ui/device/BaseListFunctionActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity$OXO1;
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
    value = "SMAP\nDeveloperTestInfoSetActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeveloperTestInfoSetActivity.kt\ncom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,392:1\n19#2:393\n15#2:394\n27#2,2:395\n1#3:397\n*S KotlinDebug\n*F\n+ 1 DeveloperTestInfoSetActivity.kt\ncom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity\n*L\n225#1:393\n225#1:394\n313#1:395,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nDeveloperTestInfoSetActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeveloperTestInfoSetActivity.kt\ncom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,392:1\n19#2:393\n15#2:394\n27#2,2:395\n1#3:397\n*S KotlinDebug\n*F\n+ 1 DeveloperTestInfoSetActivity.kt\ncom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity\n*L\n225#1:393\n225#1:394\n313#1:395,2\n*E\n"
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

.field private final etOldBleName$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final etSignal$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private failedList:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private isAutoSet:Z

.field private final mBleHandleCallback:Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity$XIi00iiXO;
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

.field private final mSettings:Lcom/szabh/smable3/entity/BleTestInfoSet;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvAlreadySet$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvSearchNumber$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvTestInfo$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 8

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/BaseListFunctionActivity;-><init>()V

    const-string v0, "TestInfoSet"

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->TAG:Ljava/lang/String;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iXiO00X;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/iXiO00X;-><init>(Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->etOldBleName$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/I0O01I00;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/I0O01I00;-><init>(Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->btStartSet$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IXX1X;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/IXX1X;-><init>(Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->btStopSet$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OiI0X1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/OiI0X1;-><init>(Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->etSignal$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IIIi10i;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/IIIi10i;-><init>(Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->tvSearchNumber$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IiiiIiX1O;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/IiiiIiX1O;-><init>(Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->tvAlreadySet$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/I0IX11i;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/I0IX11i;-><init>(Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->tvTestInfo$delegate:Lkotlin/Lazy;

    sget-object v1, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    sget-object v2, Lcom/szabh/smable3/BleKey;->TEST_INFO_SET:Lcom/szabh/smable3/BleKey;

    const/16 v6, 0xc

    const/4 v7, 0x0

    const-class v3, Lcom/szabh/smable3/entity/BleTestInfoSet;

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, Lcom/szabh/smable3/component/BaseBleCache;->getObjectNotNull$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;Ljava/lang/Class;Ljava/lang/Object;Lcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/szabh/smable3/entity/BleTestInfoSet;

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->mSettings:Lcom/szabh/smable3/entity/BleTestInfoSet;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->failedList:Ljava/util/List;

    const-string v0, ""

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->deviceAddress:Ljava/lang/String;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iOOi11;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/iOOi11;-><init>(Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->mScanner$delegate:Lkotlin/Lazy;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->mConnectedFailMap:Ljava/util/HashMap;

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->mHandler:Landroid/os/Handler;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/Oi0iIIi10;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/Oi0iIIi10;-><init>(Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->mConnectedFailRunnable:Ljava/lang/Runnable;

    new-instance v0, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity$XIi00iiXO;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity$XIi00iiXO;-><init>(Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity$XIi00iiXO;

    return-void
.end method

.method public static synthetic I1(Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;)Landroidx/appcompat/widget/AppCompatButton;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->btStopSet_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;)Landroidx/appcompat/widget/AppCompatButton;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->mConnectedFailRunnable$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;)V

    return-void
.end method

.method public static synthetic IIX1OXO(Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->tvTestInfo_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->initView$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;Landroid/widget/AdapterView;Landroid/view/View;IJ)V

    return-void
.end method

.method public static synthetic OII(Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;Lcom/bestmafen/androidbase/extension/PermissionStatus;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->requestLocationPermission$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;Lcom/bestmafen/androidbase/extension/PermissionStatus;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OX(Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;)Landroid/widget/EditText;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->etOldBleName_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;)Landroid/widget/EditText;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OiIIX101O(Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;)Z
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->permissionBackgroundLocationRemind$lambda$0$0(Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;)Z

    move-result p0

    return p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;)Landroidx/appcompat/widget/AppCompatButton;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->btStartSet_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;)Landroidx/appcompat/widget/AppCompatButton;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->tvSearchNumber_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XX0(Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;)Landroid/widget/EditText;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->etSignal_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;)Landroid/widget/EditText;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIO(Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->autoStart$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;)V

    return-void
.end method

.method public static synthetic XiOIii1(Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;)Lcom/android/mltcode/paycertificationapi/OXOI0XII;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->mScanner_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;)Lcom/android/mltcode/paycertificationapi/OXOI0XII;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$autoStart(Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->autoStart()V

    return-void
.end method

.method public static final synthetic access$getBtStartSet(Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;)Landroidx/appcompat/widget/AppCompatButton;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->getBtStartSet()Landroidx/appcompat/widget/AppCompatButton;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getBtStopSet(Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;)Landroidx/appcompat/widget/AppCompatButton;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->getBtStopSet()Landroidx/appcompat/widget/AppCompatButton;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getDeviceAddress$p(Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->deviceAddress:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic access$getEtOldBleName(Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;)Landroid/widget/EditText;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->getEtOldBleName()Landroid/widget/EditText;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getFailedList$p(Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->failedList:Ljava/util/List;

    return-object p0
.end method

.method public static final synthetic access$getMConnectedFailMap$p(Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;)Ljava/util/HashMap;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->mConnectedFailMap:Ljava/util/HashMap;

    return-object p0
.end method

.method public static final synthetic access$getMList(Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;)Ljava/util/List;
    .locals 0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getMListAdapter(Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;)Lcom/android/mltcode/paycertificationapi/XII0Oi10O;
    .locals 0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMListAdapter()Lcom/android/mltcode/paycertificationapi/XII0Oi10O;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getMLoadingPopup$p(Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;)Lcom/android/mltcode/paycertificationapi/uq;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    return-object p0
.end method

.method public static final synthetic access$getMSettings$p(Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;)Lcom/szabh/smable3/entity/BleTestInfoSet;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->mSettings:Lcom/szabh/smable3/entity/BleTestInfoSet;

    return-object p0
.end method

.method public static final synthetic access$getTAG$p(Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->TAG:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic access$getTvAlreadySet(Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->getTvAlreadySet()Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getTvSearchNumber(Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->getTvSearchNumber()Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$isAutoSet$p(Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->isAutoSet:Z

    return p0
.end method

.method private final autoStart()V
    .locals 4

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/i0i00;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/i0i00;-><init>(Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;)V

    const-wide/16 v2, 0xbb8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method private static final autoStart$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;)V
    .locals 3

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " list is empty! ConnectedFailMap clear"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->mConnectedFailMap:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->getEtOldBleName()Landroid/widget/EditText;

    move-result-object v0

    const-string v1, "<get-etOldBleName>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->startSearch(Landroid/view/View;)V

    return-void
.end method

.method private static final btStartSet_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;)Landroidx/appcompat/widget/AppCompatButton;
    .locals 1

    const v0, 0x7f0a01a8

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroidx/appcompat/widget/AppCompatButton;

    return-object p0
.end method

.method private static final btStopSet_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;)Landroidx/appcompat/widget/AppCompatButton;
    .locals 1

    const v0, 0x7f0a01b0

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroidx/appcompat/widget/AppCompatButton;

    return-object p0
.end method

.method private static final etOldBleName_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;)Landroid/widget/EditText;
    .locals 1

    const v0, 0x7f0a0377

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/EditText;

    return-object p0
.end method

.method private static final etSignal_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;)Landroid/widget/EditText;
    .locals 1

    const v0, 0x7f0a037d

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/EditText;

    return-object p0
.end method

.method private final getBtStartSet()Landroidx/appcompat/widget/AppCompatButton;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->btStartSet$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/AppCompatButton;

    return-object v0
.end method

.method private final getBtStopSet()Landroidx/appcompat/widget/AppCompatButton;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->btStopSet$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/AppCompatButton;

    return-object v0
.end method

.method private final getEtOldBleName()Landroid/widget/EditText;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->etOldBleName$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    return-object v0
.end method

.method private final getEtSignal()Landroid/widget/EditText;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->etSignal$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    return-object v0
.end method

.method private final getMScanner()Lcom/android/mltcode/paycertificationapi/OXOI0XII;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->mScanner$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/android/mltcode/paycertificationapi/OXOI0XII;

    return-object v0
.end method

.method private final getTvAlreadySet()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->tvAlreadySet$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getTvSearchNumber()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->tvSearchNumber$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getTvTestInfo()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->tvTestInfo$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method public static synthetic iIiiO(Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->tvAlreadySet_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method private static final initView$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->getEtOldBleName()Landroid/widget/EditText;

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

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->getEtOldBleName()Landroid/widget/EditText;

    move-result-object p1

    const-string p2, "<get-etOldBleName>(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->startSearch(Landroid/view/View;)V

    return-void
.end method

.method private static final mConnectedFailRunnable$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;)V
    .locals 6

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->TAG:Ljava/lang/String;

    iget-object v2, p0, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->deviceAddress:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " mConnectedFailRunnable "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_2

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->mConnectedFailMap:Ljava/util/HashMap;

    iget-object v3, p0, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->deviceAddress:Ljava/lang/String;

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

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_1
    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->TAG:Ljava/lang/String;

    iget-object v3, p0, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->deviceAddress:Ljava/lang/String;

    iget-object v4, p0, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->mConnectedFailMap:Ljava/util/HashMap;

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

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->getEtOldBleName()Landroid/widget/EditText;

    move-result-object v0

    const-string v1, "<get-etOldBleName>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->startSearch(Landroid/view/View;)V

    :cond_2
    return-void
.end method

.method private static final mScanner_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;)Lcom/android/mltcode/paycertificationapi/OXOI0XII;
    .locals 4

    sget-object v0, Lcom/android/mltcode/paycertificationapi/ut3;->OXO1:Lcom/android/mltcode/paycertificationapi/ut3;

    sget-object v1, Lcom/bestmafen/baseble/scanner/ScanMode;->LOW_LATENCY:Lcom/bestmafen/baseble/scanner/ScanMode;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2, v3}, Lcom/android/mltcode/paycertificationapi/ut3;->XIi00iiXO(Lcom/android/mltcode/paycertificationapi/ut3;[Ljava/util/UUID;Lcom/bestmafen/baseble/scanner/ScanMode;ILjava/lang/Object;)Lcom/android/mltcode/paycertificationapi/OXOI0XII;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/OXOI0XII;->IIX1OXO(I)Lcom/android/mltcode/paycertificationapi/OXOI0XII;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity$iO;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity$iO;-><init>(Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;)V

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/OXOI0XII;->XiOIO(Lcom/android/mltcode/paycertificationapi/OOXIOIiOO;)Lcom/android/mltcode/paycertificationapi/OXOI0XII;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity$XO0O10;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity$XO0O10;-><init>(Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;)V

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

    new-instance v1, Lcom/android/mltcode/paycertificationapi/XXXI0X0i;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/XXXI0X0i;-><init>(Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;)V

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

.method private static final permissionBackgroundLocationRemind$lambda$0$0(Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;)Z
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

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->permissionBackgroundLocationRemind()V

    return-void

    :cond_0
    const-string v0, "LOCATION"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/PermissionUtils;->permission([Ljava/lang/String;)Lcom/blankj/utilcode/util/PermissionUtils;

    move-result-object v1

    const-string v0, "permission(...)"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Lcom/android/mltcode/paycertificationapi/XX1OOI;

    invoke-direct {v4, p0}, Lcom/android/mltcode/paycertificationapi/XX1OOI;-><init>(Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lcom/android/mltcode/paycertificationapi/ds1;->iO(Lcom/blankj/utilcode/util/PermissionUtils;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    return-void
.end method

.method private static final requestLocationPermission$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;Lcom/bestmafen/androidbase/extension/PermissionStatus;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity$OXO1;->OXO1:[I

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
    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->requestLocationPermission()V

    goto :goto_0

    :cond_1
    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->getTvAlreadySet()Landroid/widget/TextView;

    move-result-object p1

    const-string v0, "<get-tvAlreadySet>(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->startSearch(Landroid/view/View;)V

    :goto_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final tvAlreadySet_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0c30

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final tvSearchNumber_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0d05

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final tvTestInfo_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0d22

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method


# virtual methods
.method public final clearHistory(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    const-class v0, Lcom/android/mltcode/paycertificationapi/OI11110i;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/blankj/utilcode/util/SPUtils;->remove(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->getTvAlreadySet()Landroid/widget/TextView;

    move-result-object p1

    const-string v0, "0"

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->getEtOldBleName()Landroid/widget/EditText;

    move-result-object p1

    const-string v0, "<get-etOldBleName>(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->startSearch(Landroid/view/View;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->failedList:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->mConnectedFailMap:Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/util/HashMap;->clear()V

    return-void
.end method

.method public init(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    sget-object p1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity$XIi00iiXO;

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

    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->initItem(Lcom/android/mltcode/paycertificationapi/ug6;Lcom/bestmafen/baseble/scanner/BleDevice;I)V

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
    .locals 6

    invoke-super {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->initView()V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->TAG:Ljava/lang/String;

    iget-object v2, p0, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->mSettings:Lcom/szabh/smable3/entity/BleTestInfoSet;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " Settings="

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->getTvTestInfo()Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->mSettings:Lcom/szabh/smable3/entity/BleTestInfoSet;

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleTestInfoSet;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->getBtStartSet()Landroidx/appcompat/widget/AppCompatButton;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->getBtStopSet()Landroidx/appcompat/widget/AppCompatButton;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMListView()Landroid/widget/ListView;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/IXIi0I10i;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/IXIi0I10i;-><init>(Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->getTvAlreadySet()Landroid/widget/TextView;

    move-result-object v0

    sget-object v1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    new-instance v2, Lcom/android/mltcode/paycertificationapi/OI11110i;

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-direct {v2, v3, v4, v3}, Lcom/android/mltcode/paycertificationapi/OI11110i;-><init>(Ljava/util/ArrayList;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Lcom/google/gson/Gson;

    invoke-direct {v3}, Lcom/google/gson/Gson;-><init>()V

    const-class v4, Lcom/android/mltcode/paycertificationapi/OI11110i;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1, v4}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    check-cast v2, Lcom/android/mltcode/paycertificationapi/OI11110i;

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/OI11110i;->XO0O10()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public itemLayoutId()I
    .locals 1

    const v0, 0x7f0d0ed7

    return v0
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0072

    return v0
.end method

.method public onAttachedToWindow()V
    .locals 2

    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onAttachedToWindow()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->getEtOldBleName()Landroid/widget/EditText;

    move-result-object v0

    const-string v1, "<get-etOldBleName>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->startSearch(Landroid/view/View;)V

    return-void
.end method

.method public onDestroy()V
    .locals 2

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/component/BaseBleConnector;->setNeedBind(Z)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/component/BaseBleConnector;->setOtaMode(Z)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity$XIi00iiXO;

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/component/BleConnector;->removeHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onDestroy()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->getMScanner()Lcom/android/mltcode/paycertificationapi/OXOI0XII;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/OXOI0XII;->XIi00iiXO()V

    return-void
.end method

.method public final startSearch(Landroid/view/View;)V
    .locals 3
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->mHandler:Landroid/os/Handler;

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->mConnectedFailRunnable:Ljava/lang/Runnable;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    const-string p1, "android.permission.ACCESS_FINE_LOCATION"

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/PermissionUtils;->isGranted([Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->requestLocationPermission()V

    return-void

    :cond_0
    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object p1

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothAdapter;->isEnabled()Z

    move-result p1

    if-nez p1, :cond_1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->requestEnableBluetooth()V

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

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->getEtSignal()Landroid/widget/EditText;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-nez p1, :cond_3

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->getEtSignal()Landroid/widget/EditText;

    move-result-object p1

    const-string v0, "100"

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_3
    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->getEtSignal()Landroid/widget/EditText;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    neg-int v1, v1

    const-string v2, "DEVELOPER_SIGNAL_VALUE"

    invoke-virtual {v0, v2, v1}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;I)V

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->getEtOldBleName()Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "DEVELOPER_UPDATE_BLE_NAME"

    invoke-virtual {p1, v1, v0}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->clear()V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMListAdapter()Lcom/android/mltcode/paycertificationapi/XII0Oi10O;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->getTvSearchNumber()Landroid/widget/TextView;

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

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->getMScanner()Lcom/android/mltcode/paycertificationapi/OXOI0XII;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/OXOI0XII;->XXI(Z)V

    return-void
.end method

.method public final startSet(Landroid/view/View;)V
    .locals 8
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {p1}, Lcom/szabh/smable3/component/BleConnector;->unbind()V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->TAG:Ljava/lang/String;

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->failedList:Ljava/util/List;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " startSet failedList="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->TAG:Ljava/lang/String;

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->mConnectedFailMap:Ljava/util/HashMap;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " startSet mConnectedFailMap="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    const-string p1, "\u6ca1\u6709\u641c\u7d22\u5230\u8bbe\u5907"

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->isAutoSet:Z

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/bestmafen/baseble/scanner/BleDevice;

    iget-object v4, p0, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->failedList:Ljava/util/List;

    invoke-virtual {v2}, Lcom/bestmafen/baseble/scanner/BleDevice;->getMBluetoothDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v5

    invoke-virtual {v5}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    goto :goto_0

    :cond_2
    move-object v2, v3

    :goto_0
    if-nez v2, :cond_3

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " no device"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    const-string p1, "\u6ca1\u6709\u53ef\u7528\u7684\u8bbe\u5907\uff0c\u8bf7\u68c0\u67e5\u4e00\u4e0b\u8be5\u8bbe\u5907\u662f\u5426\u652f\u6301\u6216\u8005\u662f\u5426\u5df2\u5347\u7ea7\u5230\u6700\u65b0\u56fa\u4ef6"

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->failedList:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->autoStart()V

    return-void

    :cond_3
    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    if-nez v1, :cond_4

    new-instance v1, Lcom/android/mltcode/paycertificationapi/uq;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v4

    invoke-direct {v1, v4}, Lcom/android/mltcode/paycertificationapi/uq;-><init>(Landroid/app/Activity;)V

    iput-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    :cond_4
    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    :cond_5
    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->mHandler:Landroid/os/Handler;

    iget-object v4, p0, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->mConnectedFailRunnable:Ljava/lang/Runnable;

    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v6, 0x1e

    invoke-virtual {v5, v6, v7}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v5

    invoke-virtual {v1, v4, v5, v6}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->getBtStopSet()Landroidx/appcompat/widget/AppCompatButton;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {v2}, Lcom/bestmafen/baseble/scanner/BleDevice;->getMBluetoothDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v1

    const-string v4, "getAddress(...)"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->deviceAddress:Ljava/lang/String;

    sget-object v1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {v1, v0}, Lcom/szabh/smable3/component/BaseBleConnector;->setNeedBind(Z)V

    invoke-virtual {v1, p1}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->setMConnectDirectly(Z)V

    const/4 v4, 0x2

    invoke-static {v1, v2, v0, v4, v3}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->setBleDevice$default(Lcom/bestmafen/baseble/connector/AbsBleConnector;Lcom/bestmafen/baseble/scanner/BleDevice;IILjava/lang/Object;)Lcom/bestmafen/baseble/connector/AbsBleConnector;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->connect(Z)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->TAG:Ljava/lang/String;

    iget-boolean v1, p0, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->isAutoSet:Z

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, " connect new device -> "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    return-void
.end method

.method public final stopSet(Landroid/view/View;)V
    .locals 2
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    new-array v0, p1, [Ljava/lang/Object;

    const-string v1, "\u5df2\u5173\u95ed\uff0c\u5982\u679c\u6b63\u5728\u641c\u7d22\u8bbe\u5907\u8bf7\u7b49\u5f85\u8bbe\u5907\u641c\u7d22\u5b8c\u6bd5"

    invoke-static {v1, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->isAutoSet:Z

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->getBtStopSet()Landroidx/appcompat/widget/AppCompatButton;

    move-result-object p1

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method
