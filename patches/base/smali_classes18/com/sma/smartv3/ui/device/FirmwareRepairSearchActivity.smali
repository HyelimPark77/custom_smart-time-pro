.class public final Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;
.super Lcom/sma/smartv3/ui/device/BaseListFunctionActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/sma/smartv3/ui/device/BaseListFunctionActivity<",
        "Lcom/bestmafen/baseble/scanner/BleDevice;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nFirmwareRepairSearchActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FirmwareRepairSearchActivity.kt\ncom/sma/smartv3/ui/device/FirmwareRepairSearchActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,170:1\n18#2,2:171\n15#2:173\n15#2:174\n11#2,2:175\n87#3,7:177\n94#3,3:185\n70#3,7:188\n97#3:195\n87#3,7:196\n94#3,3:204\n70#3,7:207\n97#3:214\n1#4:184\n1#4:203\n*S KotlinDebug\n*F\n+ 1 FirmwareRepairSearchActivity.kt\ncom/sma/smartv3/ui/device/FirmwareRepairSearchActivity\n*L\n26#1:171,2\n26#1:173\n27#1:174\n96#1:175,2\n98#1:177,7\n98#1:185,3\n98#1:188,7\n98#1:195\n100#1:196,7\n100#1:204,3\n100#1:207,7\n100#1:214\n98#1:184\n100#1:203\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nFirmwareRepairSearchActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FirmwareRepairSearchActivity.kt\ncom/sma/smartv3/ui/device/FirmwareRepairSearchActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,170:1\n18#2,2:171\n15#2:173\n15#2:174\n11#2,2:175\n87#3,7:177\n94#3,3:185\n70#3,7:188\n97#3:195\n87#3,7:196\n94#3,3:204\n70#3,7:207\n97#3:214\n1#4:184\n1#4:203\n*S KotlinDebug\n*F\n+ 1 FirmwareRepairSearchActivity.kt\ncom/sma/smartv3/ui/device/FirmwareRepairSearchActivity\n*L\n26#1:171,2\n26#1:173\n27#1:174\n96#1:175,2\n98#1:177,7\n98#1:185,3\n98#1:188,7\n98#1:195\n100#1:196,7\n100#1:204,3\n100#1:207,7\n100#1:214\n98#1:184\n100#1:203\n*E\n"
    }
.end annotation


# instance fields
.field private final btnSearchAgain$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final llSearchAgain$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final llTryOrigin$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mDeviceInfo:Lcom/szabh/smable3/entity/BleDeviceInfo;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mLatestFirmware:Lcom/sma/smartv3/model/FirmwareVersion;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final mScanner$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mSearchTime:I

.field private final tvSearchTip$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 5

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/BaseListFunctionActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OXi1I0X0;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/OXi1I0X0;-><init>(Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;->btnSearchAgain$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/O0OXOI;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/O0OXOI;-><init>(Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;->llSearchAgain$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/O0OIIO11I;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/O0OIIO11I;-><init>(Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;->llTryOrigin$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XI0X1OIIi;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/XI0X1OIIi;-><init>(Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;->tvSearchTip$delegate:Lkotlin/Lazy;

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->XO0O10()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    new-instance v2, Lcom/google/gson/Gson;

    invoke-direct {v2}, Lcom/google/gson/Gson;-><init>()V

    const-class v3, Lcom/szabh/smable3/entity/BleDeviceInfo;

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1, v3}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-virtual {v3}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v1

    :cond_0
    check-cast v1, Lcom/szabh/smable3/entity/BleDeviceInfo;

    iput-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;->mDeviceInfo:Lcom/szabh/smable3/entity/BleDeviceInfo;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    new-instance v1, Lcom/google/gson/Gson;

    invoke-direct {v1}, Lcom/google/gson/Gson;-><init>()V

    const-class v2, Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0, v2}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/model/FirmwareVersion;

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;->mLatestFirmware:Lcom/sma/smartv3/model/FirmwareVersion;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/X1I00iiXI;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/X1I00iiXI;-><init>(Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;->mScanner$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;->llTryOrigin_delegate$lambda$0(Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IIX1OXO(Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;->llSearchAgain_delegate$lambda$0(Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;->initView$lambda$1(Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;)Landroid/widget/Button;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;->btnSearchAgain_delegate$lambda$0(Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;)Landroid/widget/Button;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;->tvSearchTip_delegate$lambda$0(Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XX0(Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;)Lcom/android/mltcode/paycertificationapi/OXOI0XII;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;->mScanner_delegate$lambda$0(Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;)Lcom/android/mltcode/paycertificationapi/OXOI0XII;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIO(Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;Lcom/bestmafen/baseble/scanner/BleDevice;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;->onScanStopped$lambda$0(Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;Lcom/bestmafen/baseble/scanner/BleDevice;Landroid/view/View;)V

    return-void
.end method

.method public static final synthetic access$getLlSearchAgain(Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;)Landroid/view/View;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;->getLlSearchAgain()Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getMDeviceInfo$p(Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;)Lcom/szabh/smable3/entity/BleDeviceInfo;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;->mDeviceInfo:Lcom/szabh/smable3/entity/BleDeviceInfo;

    return-object p0
.end method

.method public static final synthetic access$getMList(Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;)Ljava/util/List;
    .locals 0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getMListAdapter(Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;)Lcom/android/mltcode/paycertificationapi/XII0Oi10O;
    .locals 0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMListAdapter()Lcom/android/mltcode/paycertificationapi/XII0Oi10O;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getMListView(Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;)Landroid/widget/ListView;
    .locals 0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMListView()Landroid/widget/ListView;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getTvSearchTip(Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;->getTvSearchTip()Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$onScanStarted(Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;->onScanStarted()V

    return-void
.end method

.method public static final synthetic access$onScanStopped(Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;->onScanStopped()V

    return-void
.end method

.method private static final btnSearchAgain_delegate$lambda$0(Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;)Landroid/widget/Button;
    .locals 1

    const v0, 0x7f0a01e6

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/Button;

    return-object p0
.end method

.method private final getBtnSearchAgain()Landroid/widget/Button;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;->btnSearchAgain$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    return-object v0
.end method

.method private final getLlSearchAgain()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;->llSearchAgain$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final getLlTryOrigin()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;->llTryOrigin$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final getMScanner()Lcom/android/mltcode/paycertificationapi/OXOI0XII;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;->mScanner$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/android/mltcode/paycertificationapi/OXOI0XII;

    return-object v0
.end method

.method private final getTvSearchTip()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;->tvSearchTip$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method public static synthetic iIiiO(Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;->initView$lambda$0(Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;Landroid/widget/AdapterView;Landroid/view/View;IJ)V

    return-void
.end method

.method private static final initView$lambda$0(Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0

    invoke-static {p3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    new-array p4, p2, [Ljava/lang/Object;

    invoke-static {p1, p4}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;->getMScanner()Lcom/android/mltcode/paycertificationapi/OXOI0XII;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/android/mltcode/paycertificationapi/OXOI0XII;->XXI(Z)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/bestmafen/baseble/scanner/BleDevice;

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;->toRepair(Lcom/bestmafen/baseble/scanner/BleDevice;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method private static final initView$lambda$1(Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;->scan()V

    return-void
.end method

.method private static final llSearchAgain_delegate$lambda$0(Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a0721

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final llTryOrigin_delegate$lambda$0(Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a072c

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final mScanner_delegate$lambda$0(Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;)Lcom/android/mltcode/paycertificationapi/OXOI0XII;
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

    new-instance v1, Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity$OXO1;

    invoke-direct {v1}, Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity$OXO1;-><init>()V

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/OXOI0XII;->XiOIO(Lcom/android/mltcode/paycertificationapi/OOXIOIiOO;)Lcom/android/mltcode/paycertificationapi/OXOI0XII;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity$XIi00iiXO;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity$XIi00iiXO;-><init>(Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;)V

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/OXOI0XII;->X1ii(Lcom/android/mltcode/paycertificationapi/i1OIOOIiX;)Lcom/android/mltcode/paycertificationapi/OXOI0XII;

    move-result-object p0

    return-object p0
.end method

.method private final onScanStarted()V
    .locals 3

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMListView()Landroid/widget/ListView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;->getTvSearchTip()Landroid/widget/TextView;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;->getLlSearchAgain()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private final onScanStopped()V
    .locals 10

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;->getTvSearchTip()Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMListView()Landroid/widget/ListView;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;->getLlSearchAgain()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {v0}, Lcom/szabh/smable3/component/BleConnector;->isAvailable()Z

    move-result v0

    if-nez v0, :cond_0

    iget v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;->mSearchTime:I

    const/4 v1, 0x2

    if-lt v0, v1, :cond_0

    :try_start_0
    new-instance v3, Lcom/bestmafen/baseble/scanner/BleDevice;

    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;->mDeviceInfo:Lcom/szabh/smable3/entity/BleDeviceInfo;

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleDeviceInfo;->getMBleAddress()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/sma/smartv3/util/UtilsKt;->I1(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/bluetooth/BluetoothAdapter;->getRemoteDevice(Ljava/lang/String;)Landroid/bluetooth/BluetoothDevice;

    move-result-object v4

    const-string v0, "getRemoteDevice(...)"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;->mDeviceInfo:Lcom/szabh/smable3/entity/BleDeviceInfo;

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleDeviceInfo;->getMBleName()Ljava/lang/String;

    move-result-object v7

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;->mDeviceInfo:Lcom/szabh/smable3/entity/BleDeviceInfo;

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleDeviceInfo;->getMBleAddress()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/sma/smartv3/util/UtilsKt;->I1(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v3 .. v9}, Lcom/bestmafen/baseble/scanner/BleDevice;-><init>(Landroid/bluetooth/BluetoothDevice;I[BLjava/lang/String;ILjava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;->getLlTryOrigin()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;->getLlTryOrigin()Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/O0Ii0;

    invoke-direct {v1, p0, v3}, Lcom/android/mltcode/paycertificationapi/O0Ii0;-><init>(Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;Lcom/bestmafen/baseble/scanner/BleDevice;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f0a0cc7

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v3}, Lcom/bestmafen/baseble/scanner/BleDevice;->getMName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v0, 0x7f0a0c24

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v3}, Lcom/bestmafen/baseble/scanner/BleDevice;->getMAddress()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v0, 0x7f0a066a

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    invoke-virtual {v3}, Lcom/bestmafen/baseble/scanner/BleDevice;->getMRssi()I

    move-result v1

    neg-int v1, v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageLevel(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_0
    return-void

    :cond_1
    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMListView()Landroid/widget/ListView;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;->getLlSearchAgain()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private static final onScanStopped$lambda$0(Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;Lcom/bestmafen/baseble/scanner/BleDevice;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;->toRepair(Lcom/bestmafen/baseble/scanner/BleDevice;)V

    return-void
.end method

.method private final scan()V
    .locals 2

    iget v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;->mSearchTime:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;->mSearchTime:I

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;->getMScanner()Lcom/android/mltcode/paycertificationapi/OXOI0XII;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/OXOI0XII;->XXI(Z)V

    return-void
.end method

.method private final toRepair(Lcom/bestmafen/baseble/scanner/BleDevice;)V
    .locals 5

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;->mDeviceInfo:Lcom/szabh/smable3/entity/BleDeviceInfo;

    invoke-static {p1}, Lcom/sma/smartv3/util/UtilsKt;->IXXOO(Lcom/bestmafen/baseble/scanner/BleDevice;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/entity/BleDeviceInfo;->setMBleAddress(Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->XO0O10()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;->mDeviceInfo:Lcom/szabh/smable3/entity/BleDeviceInfo;

    const-class v2, Lcom/szabh/smable3/entity/BleDeviceInfo;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/google/gson/Gson;

    invoke-direct {v3}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v3, v1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;->mLatestFirmware:Lcom/sma/smartv3/model/FirmwareVersion;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileUrl2()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const-string v2, "mArg3"

    const-string v3, "mArg2"

    const-string v4, "mArg0"

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lcom/bestmafen/baseble/scanner/BleDevice;->getMAddress()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v0, v4, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v3, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    new-instance p1, Landroid/content/Intent;

    const-class v1, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;

    invoke-direct {p1, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1, v0}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    invoke-virtual {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return-void

    :cond_1
    invoke-virtual {p1}, Lcom/bestmafen/baseble/scanner/BleDevice;->getMAddress()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v0, v4, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v3, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    new-instance p1, Landroid/content/Intent;

    const-class v1, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;

    invoke-direct {p1, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1, v0}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    invoke-virtual {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method private static final tvSearchTip_delegate$lambda$0(Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0d06

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method


# virtual methods
.method public init(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

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

    const p3, 0x7f0a0c24

    .line 3
    invoke-virtual {p2}, Lcom/bestmafen/baseble/scanner/BleDevice;->getMAddress()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, p3, v0}, Lcom/android/mltcode/paycertificationapi/ug6;->OII(ILjava/lang/String;)Lcom/android/mltcode/paycertificationapi/ug6;

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

    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;->initItem(Lcom/android/mltcode/paycertificationapi/ug6;Lcom/bestmafen/baseble/scanner/BleDevice;I)V

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
    .locals 2

    invoke-super {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->initView()V

    sget-object v0, Lcom/sma/smartv3/initializer/BleInitializer;->IO:Lcom/sma/smartv3/initializer/BleInitializer;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/initializer/BleInitializer;->i1iII1i1(Z)V

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f140be6

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMListView()Landroid/widget/ListView;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/OI1X1iIXX;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/OI1X1iIXX;-><init>(Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;->getBtnSearchAgain()Landroid/widget/Button;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/OOXXXiIIX;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/OOXXXiIIX;-><init>(Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;->scan()V

    return-void
.end method

.method public itemLayoutId()I
    .locals 1

    const v0, 0x7f0d0ed7

    return v0
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d00a1

    return v0
.end method

.method public onDestroy()V
    .locals 2

    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onDestroy()V

    sget-object v0, Lcom/sma/smartv3/initializer/BleInitializer;->IO:Lcom/sma/smartv3/initializer/BleInitializer;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/initializer/BleInitializer;->i1iII1i1(Z)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;->getMScanner()Lcom/android/mltcode/paycertificationapi/OXOI0XII;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/OXOI0XII;->XIi00iiXO()V

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
