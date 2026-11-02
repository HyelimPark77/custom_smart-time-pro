.class public final Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;
.super Lcom/sma/smartv3/ui/device/BaseListFunctionActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$SearchType;
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
    value = "SMAP\nAddDeviceWithThirdPartyActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddDeviceWithThirdPartyActivity.kt\ncom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n*L\n1#1,730:1\n85#2,3:731\n97#2,3:734\n97#2,3:737\n85#2,3:740\n1#3:743\n1#3:751\n87#4,7:744\n94#4,3:752\n70#4,7:755\n97#4:762\n*S KotlinDebug\n*F\n+ 1 AddDeviceWithThirdPartyActivity.kt\ncom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity\n*L\n218#1:731,3\n245#1:734,3\n246#1:737,3\n338#1:740,3\n606#1:751\n606#1:744,7\n606#1:752,3\n606#1:755,7\n606#1:762\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nAddDeviceWithThirdPartyActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddDeviceWithThirdPartyActivity.kt\ncom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n*L\n1#1,730:1\n85#2,3:731\n97#2,3:734\n97#2,3:737\n85#2,3:740\n1#3:743\n1#3:751\n87#4,7:744\n94#4,3:752\n70#4,7:755\n97#4:762\n*S KotlinDebug\n*F\n+ 1 AddDeviceWithThirdPartyActivity.kt\ncom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity\n*L\n218#1:731,3\n245#1:734,3\n246#1:737,3\n338#1:740,3\n606#1:751\n606#1:744,7\n606#1:752,3\n606#1:755,7\n606#1:762\n*E\n"
    }
.end annotation


# instance fields
.field private connectPop:Lcom/android/mltcode/paycertificationapi/ml1;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private connectingDeviceAddress:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private connectingDeviceName:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final empty$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final ivScanBg$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mBleHandleCallback:Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$O00;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mCacheSortByList:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/bestmafen/baseble/scanner/BleDevice;",
            ">;"
        }
    .end annotation
.end field

.field private mConfirmPopup:Lcom/android/mltcode/paycertificationapi/ml1;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mOnlineDeviceList:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/DeviceOnlineInfo;",
            ">;"
        }
    .end annotation
.end field

.field private final mScanner$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final pagerIndicator$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final pillTabView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private searchType:Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$SearchType;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final thirdPartyUtil:Lcom/sma/smartv3/util/ClassicBluetoothUtil;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tv1$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tv2$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvBottom2$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final viewModel:Lcom/sma/smartv3/ui/device/model/AddDeviceViewModel;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/BaseListFunctionActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/I01X1i1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/I01X1i1;-><init>(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->pagerIndicator$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ii01;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/ii01;-><init>(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->tv1$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XO1X00;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/XO1X00;-><init>(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->tv2$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XIOO0OI0;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/XIOO0OI0;-><init>(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->tvBottom2$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/X0OO100;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/X0OO100;-><init>(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->empty$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/I10XI1OOO;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/I10XI1OOO;-><init>(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->ivScanBg$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iiXiX1i;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/iiXiX1i;-><init>(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->pillTabView$delegate:Lkotlin/Lazy;

    new-instance v0, Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;

    invoke-direct {v0}, Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;-><init>()V

    const-class v1, Lcom/sma/smartv3/ui/device/model/AddDeviceViewModel;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;->create(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/ui/device/model/AddDeviceViewModel;

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->viewModel:Lcom/sma/smartv3/ui/device/model/AddDeviceViewModel;

    const-string v0, ""

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->connectingDeviceName:Ljava/lang/String;

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->connectingDeviceAddress:Ljava/lang/String;

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->OXI0Xi()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->mOnlineDeviceList:Ljava/util/List;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/O11;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/O11;-><init>(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->mScanner$delegate:Lkotlin/Lazy;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->mCacheSortByList:Ljava/util/List;

    new-instance v0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$O00;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$O00;-><init>(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$O00;

    sget-object v0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$SearchType;->SELF_STUDY:Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$SearchType;

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->searchType:Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$SearchType;

    sget-object v0, Lcom/sma/smartv3/util/ClassicBluetoothUtil;->OXO1:Lcom/sma/smartv3/util/ClassicBluetoothUtil;

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->thirdPartyUtil:Lcom/sma/smartv3/util/ClassicBluetoothUtil;

    return-void
.end method

.method public static synthetic I1(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->empty_delegate$lambda$0(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->tvBottom2_delegate$lambda$0(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic II1Xi0(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;)Lcom/sma/smartv3/view/PagerIndicator;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->pagerIndicator_delegate$lambda$0(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;)Lcom/sma/smartv3/view/PagerIndicator;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IIX1OXO(Lcom/android/mltcode/paycertificationapi/ml1;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->connectItem$lambda$1$0(Lcom/android/mltcode/paycertificationapi/ml1;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IXXOO(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->ivScanBg_delegate$lambda$0(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;)Lcom/sma/smartv3/view/PillTabView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->pillTabView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;)Lcom/sma/smartv3/view/PillTabView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OII(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->initView$lambda$1(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;Landroid/widget/AdapterView;Landroid/view/View;IJ)V

    return-void
.end method

.method public static synthetic OX(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;Lcom/bestmafen/androidbase/extension/PermissionStatus;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->onTitleRightClick$lambda$0(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;Lcom/bestmafen/androidbase/extension/PermissionStatus;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OiIIX101O(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;Z)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->scanDevices$lambda$0(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X01IiOiIi(Lcom/android/mltcode/paycertificationapi/ml1;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->conntectDevice$lambda$1$0(Lcom/android/mltcode/paycertificationapi/ml1;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;Z)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->requestLocationPermission$lambda$0(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;Z)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->initView$lambda$2(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XX0(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;)Z
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->conntectDevice$lambda$0$0(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;)Z

    move-result p0

    return p0
.end method

.method public static synthetic XiOIO(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;Z)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->init$lambda$0(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIii1(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->tv2_delegate$lambda$0(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$bindDone(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->bindDone()V

    return-void
.end method

.method public static final synthetic access$bindThirdDevice(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;Lcom/sma/smartv3/util/BluetoothConnectionReceiver$A2DPInfo;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->bindThirdDevice(Lcom/sma/smartv3/util/BluetoothConnectionReceiver$A2DPInfo;)V

    return-void
.end method

.method public static final synthetic access$getConnectPop$p(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;)Lcom/android/mltcode/paycertificationapi/ml1;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->connectPop:Lcom/android/mltcode/paycertificationapi/ml1;

    return-object p0
.end method

.method public static final synthetic access$getConnectingDeviceAddress$p(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->connectingDeviceAddress:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic access$getConnectingDeviceName$p(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->connectingDeviceName:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic access$getEmpty(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->getEmpty()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getMCacheSortByList$p(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->mCacheSortByList:Ljava/util/List;

    return-object p0
.end method

.method public static final synthetic access$getMConfirmPopup$p(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;)Lcom/android/mltcode/paycertificationapi/ml1;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->mConfirmPopup:Lcom/android/mltcode/paycertificationapi/ml1;

    return-object p0
.end method

.method public static final synthetic access$getMList(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;)Ljava/util/List;
    .locals 0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getMListAdapter(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;)Lcom/android/mltcode/paycertificationapi/XII0Oi10O;
    .locals 0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMListAdapter()Lcom/android/mltcode/paycertificationapi/XII0Oi10O;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getMListView(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;)Landroid/widget/ListView;
    .locals 0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMListView()Landroid/widget/ListView;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getMOnlineDeviceList$p(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->mOnlineDeviceList:Ljava/util/List;

    return-object p0
.end method

.method public static final synthetic access$getThirdPartyUtil$p(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;)Lcom/sma/smartv3/util/ClassicBluetoothUtil;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->thirdPartyUtil:Lcom/sma/smartv3/util/ClassicBluetoothUtil;

    return-object p0
.end method

.method public static final synthetic access$getViewModel$p(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;)Lcom/sma/smartv3/ui/device/model/AddDeviceViewModel;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->viewModel:Lcom/sma/smartv3/ui/device/model/AddDeviceViewModel;

    return-object p0
.end method

.method public static final synthetic access$onScanStarted(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->onScanStarted()V

    return-void
.end method

.method public static final synthetic access$onScanStopped(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->onScanStopped()V

    return-void
.end method

.method private final bindDone()V
    .locals 12

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v1, "AddDeviceActivity bindDone"

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v1, Lcom/sma/smartv3/db/entity/BleDeviceCache;->INSTANCE:Lcom/sma/smartv3/db/entity/BleDeviceCache;

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/BleDeviceCache;->getActiveDeviceInfo()Lcom/sma/smartv3/db/entity/RecordDeviceInfo;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    invoke-virtual {v1, v2}, Lcom/sma/smartv3/db/entity/BleDeviceCache;->removeDeviceInfo(Lcom/sma/smartv3/db/entity/RecordDeviceInfo;)V

    invoke-virtual {v1, v3}, Lcom/sma/smartv3/db/entity/BleDeviceCache;->setMDeviceInfo(Lcom/sma/smartv3/db/entity/RecordDeviceInfo;)V

    :cond_0
    sget-object v1, Lcom/sma/smartv3/dto/OXO1;->I0iXXO:Lcom/sma/smartv3/dto/OXO1$OXO1;

    invoke-virtual {v1}, Lcom/sma/smartv3/dto/OXO1$OXO1;->IO()V

    sget-object v1, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/q62;->i0I0O111I()Z

    move-result v2

    const/4 v4, 0x0

    if-eqz v2, :cond_1

    sget-object v2, Lcom/sma/smartv3/initializer/AGPSInitializer;->IO:Lcom/sma/smartv3/initializer/AGPSInitializer;

    const/4 v5, 0x2

    invoke-static {v2, v4, v3, v5, v3}, Lcom/sma/smartv3/initializer/AGPSInitializer;->I1(Lcom/sma/smartv3/initializer/AGPSInitializer;ZLcom/android/mltcode/paycertificationapi/c72;ILjava/lang/Object;)V

    :cond_1
    sget-object v2, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/a01;->OXO1()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v3

    new-instance v5, Lcom/sma/smartv3/model/DeviceLaseRecord;

    const/16 v10, 0xf

    const/4 v11, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v5 .. v11}, Lcom/sma/smartv3/model/DeviceLaseRecord;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v6, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    invoke-virtual {v6}, Lcom/szabh/smable3/component/BaseBleCache;->getMBleName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Lcom/sma/smartv3/model/DeviceLaseRecord;->setBleName(Ljava/lang/String;)V

    invoke-virtual {v6}, Lcom/szabh/smable3/component/BaseBleCache;->getMFirmwareFlag()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Lcom/sma/smartv3/model/DeviceLaseRecord;->setFlag(Ljava/lang/String;)V

    sget-object v7, Lcom/szabh/smable3/BleKey;->FIRMWARE_VERSION:Lcom/szabh/smable3/BleKey;

    const/4 v10, 0x6

    invoke-static/range {v6 .. v11}, Lcom/szabh/smable3/component/BaseBleCache;->getString$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;Ljava/lang/String;Lcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Lcom/sma/smartv3/model/DeviceLaseRecord;->setBleVersion(Ljava/lang/String;)V

    invoke-virtual {v6}, Lcom/szabh/smable3/component/BaseBleCache;->getMBleAddress()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/sma/smartv3/model/DeviceLaseRecord;->setMac(Ljava/lang/String;)V

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "LAST_BIND_DEVICE_DATA"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v7, 0x5f

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-class v8, Lcom/sma/smartv3/model/DeviceLaseRecord;

    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    new-instance v8, Lcom/google/gson/Gson;

    invoke-direct {v8}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v8, v5}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v6, v5, v4}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/q62;->O0i0()Z

    move-result v3

    if-nez v3, :cond_3

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/q62;->IiO0()Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Landroid/app/Activity;->setResult(I)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    goto :goto_1

    :cond_3
    :goto_0
    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/q62;->O0i0()Z

    move-result v3

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/q62;->IiO0()Z

    move-result v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "addDeviceActivity "

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v3, " "

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    new-instance v3, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$OXO1;

    invoke-direct {v3}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$OXO1;-><init>()V

    const-wide/16 v5, 0x3e8

    invoke-virtual {v0, v3, v5, v6}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    new-instance v3, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$XIi00iiXO;

    invoke-direct {v3, p0}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$XIi00iiXO;-><init>(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;)V

    const-wide/16 v5, 0x12c

    invoke-virtual {v0, v3, v5, v6}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    :goto_1
    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/a01;->iO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "AI_TRANSLATION_LEFT_LANGUAGE"

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-class v5, Lcom/sma/smartv3/model/LanguageTranslationData;

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3, v4}, Lcom/blankj/utilcode/util/SPUtils;->remove(Ljava/lang/String;Z)V

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/a01;->iO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "AI_TRANSLATION_RIGHT_LANGUAGE"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, v4}, Lcom/blankj/utilcode/util/SPUtils;->remove(Ljava/lang/String;Z)V

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/q62;->O00OXOXO()Z

    move-result v0

    if-eqz v0, :cond_4

    const-string v0, "android.permission.ACCESS_FINE_LOCATION"

    invoke-static {p0, v0}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_4

    sget-object v0, Lcom/sma/smartv3/biz/OXO1;->XOO0ii0:Lcom/sma/smartv3/biz/OXO1$OXO1;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/OXO1$OXO1;->OXO1()Lcom/sma/smartv3/biz/OXO1;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/biz/OXO1;->I0iXXO()V

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/OXO1$OXO1;->OXO1()Lcom/sma/smartv3/biz/OXO1;

    move-result-object v2

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lcom/sma/smartv3/biz/OXO1;->I1XOi1(Lcom/sma/smartv3/biz/OXO1;IILjava/lang/String;ILjava/lang/Object;)V

    :cond_4
    return-void
.end method

.method private final bindThirdDevice(Lcom/sma/smartv3/util/BluetoothConnectionReceiver$A2DPInfo;)V
    .locals 6

    invoke-virtual {p1}, Lcom/sma/smartv3/util/BluetoothConnectionReceiver$A2DPInfo;->getAddress()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->connectingDeviceAddress:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->connectingDeviceName:Ljava/lang/String;

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->connectingDeviceAddress:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "bindThirdDevice :"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/sma/smartv3/util/BluetoothConnectionReceiver$A2DPInfo;->getOnline()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    move-result-object v0

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/IXOX0Xiii;->iO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v1

    new-instance v3, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$bindThirdDevice$1;

    const/4 p1, 0x0

    invoke-direct {v3, p0, p1}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$bindThirdDevice$1;-><init>(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    return-void

    :cond_1
    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Object;

    const-string v0, "\u8fde\u63a5\u5931\u8d25"

    invoke-static {v0, p1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method private final collectThirdPartyData()V
    .locals 7

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->thirdPartyUtil:Lcom/sma/smartv3/util/ClassicBluetoothUtil;

    invoke-virtual {v0}, Lcom/sma/smartv3/util/ClassicBluetoothUtil;->I0IIOi()Lcom/android/mltcode/paycertificationapi/l94;

    move-result-object v2

    new-instance v4, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$collectThirdPartyData$1;

    const/4 v0, 0x0

    invoke-direct {v4, p0, v0}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$collectThirdPartyData$1;-><init>(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v6}, Lcom/sma/smartv3/util/ActivityUtilKt;->XIi00iiXO(Landroidx/lifecycle/LifecycleOwner;Lcom/android/mltcode/paycertificationapi/ii0iIIX0;Landroidx/lifecycle/Lifecycle$State;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    return-void
.end method

.method private final connectItem(I)V
    .locals 9

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->searchType:Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$SearchType;

    sget-object v1, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$SearchType;->SELF_STUDY:Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$SearchType;

    if-ne v0, v1, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->getMScanner()Lcom/android/mltcode/paycertificationapi/OXOI0XII;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/OXOI0XII;->XXI(Z)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->OXO1()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    new-instance v2, Lcom/sma/smartv3/model/DeviceLaseRecord;

    const/16 v7, 0xf

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v8}, Lcom/sma/smartv3/model/DeviceLaseRecord;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/bestmafen/baseble/scanner/BleDevice;

    invoke-virtual {v3}, Lcom/bestmafen/baseble/scanner/BleDevice;->getMName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/sma/smartv3/model/DeviceLaseRecord;->setBleName(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/bestmafen/baseble/scanner/BleDevice;

    invoke-virtual {v3}, Lcom/bestmafen/baseble/scanner/BleDevice;->getMBluetoothDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v3

    invoke-virtual {v3}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v3

    const-string v4, "getAddress(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Lcom/sma/smartv3/model/DeviceLaseRecord;->setMac(Ljava/lang/String;)V

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "LAST_CLICK_DEVICE_DATA"

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v5, 0x5f

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-class v5, Lcom/sma/smartv3/model/DeviceLaseRecord;

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-instance v5, Lcom/google/gson/Gson;

    invoke-direct {v5}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v5, v2}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v3, v2, v1}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bestmafen/baseble/scanner/BleDevice;

    invoke-virtual {v0}, Lcom/bestmafen/baseble/scanner/BleDevice;->getMName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/bestmafen/baseble/scanner/BleDevice;

    invoke-virtual {p1}, Lcom/bestmafen/baseble/scanner/BleDevice;->getMBluetoothDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p1

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v0, p1}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->conntectDevice(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    new-instance v0, Lcom/android/mltcode/paycertificationapi/ml1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/ml1;-><init>(Landroid/app/Activity;)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/X0OIIXX;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/X0OIIXX;-><init>(Lcom/android/mltcode/paycertificationapi/ml1;)V

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/ml1;->X01IiOiIi(Lkotlin/jvm/functions/Function0;)V

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/ml1;->OX()Landroid/widget/ImageView;

    move-result-object v1

    const v2, 0x7f08155a

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/ml1;->OX()Landroid/widget/ImageView;

    move-result-object v1

    const v2, 0x7f06074b

    invoke-static {p0, v2}, Lcom/android/mltcode/paycertificationapi/gk4;->O00(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/ml1;->OX()Landroid/widget/ImageView;

    move-result-object v1

    new-instance v2, Landroid/view/animation/RotateAnimation;

    const/4 v7, 0x1

    const/high16 v8, 0x3f000000    # 0.5f

    const/high16 v3, 0x43b40000    # 360.0f

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/high16 v6, 0x3f000000    # 0.5f

    invoke-direct/range {v2 .. v8}, Landroid/view/animation/RotateAnimation;-><init>(FFIFIF)V

    const/4 v3, -0x1

    invoke-virtual {v2, v3}, Landroid/view/animation/Animation;->setRepeatCount(I)V

    const-wide/16 v3, 0x708

    invoke-virtual {v2, v3, v4}, Landroid/view/animation/Animation;->setDuration(J)V

    new-instance v3, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v3}, Landroid/view/animation/LinearInterpolator;-><init>()V

    invoke-virtual {v2, v3}, Landroid/view/animation/Animation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->connectPop:Lcom/android/mltcode/paycertificationapi/ml1;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseListFunctionActivity;->getRootView()Landroid/view/View;

    move-result-object v1

    const-string v2, "<get-rootView>(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/I0OIO1i;->I1XOi1(Landroid/view/View;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/bestmafen/baseble/scanner/BleDevice;

    invoke-virtual {p1}, Lcom/bestmafen/baseble/scanner/BleDevice;->getMName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->connectingDeviceName:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/bestmafen/baseble/scanner/BleDevice;->getMAddress()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->connectingDeviceAddress:Ljava/lang/String;

    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    move-result-object v1

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/IXOX0Xiii;->iO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v2

    new-instance v4, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$connectItem$3;

    const/4 v0, 0x0

    invoke-direct {v4, p0, p1, v0}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$connectItem$3;-><init>(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;Lcom/bestmafen/baseble/scanner/BleDevice;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    return-void
.end method

.method private static final connectItem$lambda$1$0(Lcom/android/mltcode/paycertificationapi/ml1;)Lkotlin/Unit;
    .locals 3

    invoke-virtual {p0}, Landroid/widget/PopupWindow;->dismiss()V

    new-instance p0, Ljava/util/Timer;

    invoke-direct {p0}, Ljava/util/Timer;-><init>()V

    new-instance v0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$iO;

    invoke-direct {v0}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$iO;-><init>()V

    const-wide/16 v1, 0xc8

    invoke-virtual {p0, v0, v1, v2}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private final conntectDevice(Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "connectDevice -> "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/i72;->iXOII(Ljava/lang/String;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    new-instance p2, Lcom/android/mltcode/paycertificationapi/go0;

    const/4 v1, 0x0

    const/4 v3, 0x2

    invoke-direct {p2, p0, v1, v3, v2}, Lcom/android/mltcode/paycertificationapi/go0;-><init>(Landroid/app/Activity;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p2, v1}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->I0iXXO(Z)V

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p2, p1}, Lcom/android/mltcode/paycertificationapi/go0;->iI(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->iX()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/android/mltcode/paycertificationapi/go0;->iX(Ljava/lang/Integer;)V

    const p1, 0x7f14027f

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p2, p1, v2, v3, v2}, Lcom/android/mltcode/paycertificationapi/go0;->X11iII1O1(Lcom/android/mltcode/paycertificationapi/go0;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    new-instance p1, Lcom/android/mltcode/paycertificationapi/IOXi0X;

    invoke-direct {p1, p0}, Lcom/android/mltcode/paycertificationapi/IOXi0X;-><init>(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;)V

    const v0, 0x7f14034b

    invoke-virtual {p2, v0, p1}, Lcom/android/mltcode/paycertificationapi/go0;->X1IX(ILkotlin/jvm/functions/Function0;)V

    invoke-virtual {p2}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    return-void

    :cond_0
    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->XIIIO()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/component/BaseBleConnector;->setRefreshDeviceInfo(Z)V

    :cond_1
    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/q62;->XXOXI0(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    const-string v0, "mArg0"

    invoke-virtual {p1, v0, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p2, "mArg2"

    invoke-virtual {p1, p2, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string p2, "mArg3"

    invoke-virtual {p1, p2, v2}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    new-instance p2, Landroid/content/Intent;

    const-class v0, Lcom/sma/smartv3/ui/device/AutoBindActivity;

    invoke-direct {p2, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p2, p1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    invoke-virtual {p0, p2}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return-void

    :cond_2
    sget-object v3, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {v3, p2}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->setAddress(Ljava/lang/String;)Lcom/bestmafen/baseble/connector/AbsBleConnector;

    move-result-object p2

    invoke-virtual {p2, v1}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->connect(Z)V

    new-instance p2, Lcom/android/mltcode/paycertificationapi/ml1;

    invoke-direct {p2, p0}, Lcom/android/mltcode/paycertificationapi/ml1;-><init>(Landroid/app/Activity;)V

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->i010I()Ljava/util/ArrayList;

    move-result-object v3

    invoke-static {v3, p1}, Lkotlin/collections/CollectionsKt___CollectionsKt;->i01OOiI(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {p2, v3}, Lcom/android/mltcode/paycertificationapi/ml1;->II1Xi0(Z)V

    new-instance v3, Lcom/android/mltcode/paycertificationapi/Ii1OIOX00;

    invoke-direct {v3, p2}, Lcom/android/mltcode/paycertificationapi/Ii1OIOX00;-><init>(Lcom/android/mltcode/paycertificationapi/ml1;)V

    invoke-virtual {p2, v3}, Lcom/android/mltcode/paycertificationapi/ml1;->X01IiOiIi(Lkotlin/jvm/functions/Function0;)V

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->i0iIXiI()Ljava/util/Collection;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-static {v3, p1}, Lkotlin/collections/CollectionsKt___CollectionsKt;->i01OOiI(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-static {v0, v2, v1, v2}, Lcom/android/mltcode/paycertificationapi/q62;->OiO0IOX(Lcom/android/mltcode/paycertificationapi/q62;Lcom/szabh/smable3/entity/BleDeviceInfo;ILjava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->X0100I()Z

    move-result v1

    if-nez v1, :cond_3

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->I0i1OXiI()Z

    move-result v1

    if-nez v1, :cond_3

    invoke-virtual {p2}, Lcom/android/mltcode/paycertificationapi/ml1;->OX()Landroid/widget/ImageView;

    move-result-object v1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/q62;->XiOIii1(Ljava/lang/String;)I

    move-result p1

    invoke-virtual {v1, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    :cond_3
    invoke-virtual {p2}, Lcom/android/mltcode/paycertificationapi/ml1;->OX()Landroid/widget/ImageView;

    move-result-object p1

    const v0, 0x7f08155a

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-virtual {p2}, Lcom/android/mltcode/paycertificationapi/ml1;->OX()Landroid/widget/ImageView;

    move-result-object p1

    const v0, 0x7f06074b

    invoke-static {p0, v0}, Lcom/android/mltcode/paycertificationapi/gk4;->O00(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    invoke-virtual {p2}, Lcom/android/mltcode/paycertificationapi/ml1;->OX()Landroid/widget/ImageView;

    move-result-object p1

    new-instance v0, Landroid/view/animation/RotateAnimation;

    const/4 v5, 0x1

    const/high16 v6, 0x3f000000    # 0.5f

    const/high16 v1, 0x43b40000    # 360.0f

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/high16 v4, 0x3f000000    # 0.5f

    invoke-direct/range {v0 .. v6}, Landroid/view/animation/RotateAnimation;-><init>(FFIFIF)V

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setRepeatCount(I)V

    const-wide/16 v1, 0x708

    invoke-virtual {v0, v1, v2}, Landroid/view/animation/Animation;->setDuration(J)V

    new-instance v1, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v1}, Landroid/view/animation/LinearInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    :goto_0
    iput-object p2, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->mConfirmPopup:Lcom/android/mltcode/paycertificationapi/ml1;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseListFunctionActivity;->getRootView()Landroid/view/View;

    move-result-object p1

    const-string v0, "<get-rootView>(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Lcom/android/mltcode/paycertificationapi/I0OIO1i;->I1XOi1(Landroid/view/View;)V

    return-void
.end method

.method private static final conntectDevice$lambda$0$0(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;)Z
    .locals 1

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v0, p0}, Lcom/android/mltcode/paycertificationapi/i72;->XXXiXXOI(Landroid/app/Activity;)V

    const/4 p0, 0x1

    return p0
.end method

.method private static final conntectDevice$lambda$1$0(Lcom/android/mltcode/paycertificationapi/ml1;)Lkotlin/Unit;
    .locals 8

    invoke-virtual {p0}, Landroid/widget/PopupWindow;->dismiss()V

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v1, Lcom/szabh/smable3/BleKey;->IDENTITY:Lcom/szabh/smable3/BleKey;

    sget-object v2, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    const/16 v6, 0x18

    const/4 v7, 0x0

    const/16 v3, 0x10

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v7}, Lcom/szabh/smable3/component/BaseBleConnector;->sendInt8$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;IZZILjava/lang/Object;)Z

    new-instance p0, Ljava/util/Timer;

    invoke-direct {p0}, Ljava/util/Timer;-><init>()V

    new-instance v0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$XO0O10;

    invoke-direct {v0}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$XO0O10;-><init>()V

    const-wide/16 v1, 0xc8

    invoke-virtual {p0, v0, v1, v2}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private final doScanResult(Ljava/lang/String;)V
    .locals 5

    const/4 v0, 0x1

    const v1, 0x7f141147

    :try_start_0
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    const-string v2, "name"

    invoke-virtual {p1, v2}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "mac"

    invoke-virtual {p1, v3}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_0

    const-string v3, "MAC"

    invoke-virtual {p1, v3}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "doScanResult -> "

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " , "

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {p0, v1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    return-void

    :cond_1
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-direct {p0, v2, v3}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->conntectDevice(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    invoke-static {p0, v1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    return-void
.end method

.method private static final empty_delegate$lambda$0(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    const v0, 0x7f0a035b

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private final getEmpty()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->empty$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method private final getIvScanBg()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->ivScanBg$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method private final getMScanner()Lcom/android/mltcode/paycertificationapi/OXOI0XII;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->mScanner$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/android/mltcode/paycertificationapi/OXOI0XII;

    return-object v0
.end method

.method private final getPagerIndicator()Lcom/sma/smartv3/view/PagerIndicator;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->pagerIndicator$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/PagerIndicator;

    return-object v0
.end method

.method private final getPillTabView()Lcom/sma/smartv3/view/PillTabView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->pillTabView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/PillTabView;

    return-object v0
.end method

.method private final getTv1()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->tv1$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getTv2()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->tv2$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getTvBottom2()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->tvBottom2$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method public static synthetic i010I(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->onTitleRightClick$lambda$0$0(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iIiiO(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->tv1_delegate$lambda$0(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iOOX010X(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;Z)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->init$lambda$1(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iX(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;)Lcom/android/mltcode/paycertificationapi/OXOI0XII;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->mScanner_delegate$lambda$0(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;)Lcom/android/mltcode/paycertificationapi/OXOI0XII;

    move-result-object p0

    return-object p0
.end method

.method private static final init$lambda$0(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;Z)Lkotlin/Unit;
    .locals 0

    if-eqz p1, :cond_0

    sget-object p1, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/q62;->OXI0Xi()Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->mOnlineDeviceList:Ljava/util/List;

    :cond_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final init$lambda$1(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;Z)Lkotlin/Unit;
    .locals 0

    if-eqz p1, :cond_0

    sget-object p1, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/q62;->OXI0Xi()Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->mOnlineDeviceList:Ljava/util/List;

    :cond_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final initView$lambda$1(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0

    invoke-direct {p0, p3}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->connectItem(I)V

    return-void
.end method

.method private static final initView$lambda$2(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;Z)Lkotlin/Unit;
    .locals 0

    if-eqz p1, :cond_0

    sget-object p1, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$SearchType;->SELF_STUDY:Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$SearchType;

    goto :goto_0

    :cond_0
    sget-object p1, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$SearchType;->THIRD_PARTY:Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$SearchType;

    :goto_0
    iput-object p1, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->searchType:Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$SearchType;

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->scanDevices()V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final ivScanBg_delegate$lambda$0(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;)Landroid/widget/ImageView;
    .locals 1

    const v0, 0x7f0a066b

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method private static final mScanner_delegate$lambda$0(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;)Lcom/android/mltcode/paycertificationapi/OXOI0XII;
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

    new-instance v1, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$IiI10X;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$IiI10X;-><init>(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;)V

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/OXOI0XII;->XiOIO(Lcom/android/mltcode/paycertificationapi/OOXIOIiOO;)Lcom/android/mltcode/paycertificationapi/OXOI0XII;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$XOO0ii0;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$XOO0ii0;-><init>(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;)V

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/OXOI0XII;->X1ii(Lcom/android/mltcode/paycertificationapi/i1OIOOIiX;)Lcom/android/mltcode/paycertificationapi/OXOI0XII;

    move-result-object p0

    return-object p0
.end method

.method private final onPermissionScan()V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    const-string v0, "LOCATION"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/PermissionUtils;->isGranted([Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->IOIi00()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->requestLocationPermission()V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->viewModel:Lcom/sma/smartv3/ui/device/model/AddDeviceViewModel;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/model/AddDeviceViewModel;->getThirdPartyDevices()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->scanDevices()V

    return-void
.end method

.method private final onScanStarted()V
    .locals 2

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->getPagerIndicator()Lcom/sma/smartv3/view/PagerIndicator;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/PagerIndicator;->XO0O10(Z)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->getTv1()Landroid/widget/TextView;

    move-result-object v0

    const v1, 0x7f1411e9

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->getTv2()Landroid/widget/TextView;

    move-result-object v0

    const v1, 0x7f1402f1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->getTvBottom2()Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->getEmpty()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMListView()Landroid/widget/ListView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->getIvScanBg()Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    instance-of v1, v0, Lcom/bumptech/glide/load/resource/gif/GifDrawable;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/bumptech/glide/load/resource/gif/GifDrawable;

    invoke-virtual {v0}, Lcom/bumptech/glide/load/resource/gif/GifDrawable;->start()V

    :cond_0
    return-void
.end method

.method private final onScanStopped()V
    .locals 3

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->getPagerIndicator()Lcom/sma/smartv3/view/PagerIndicator;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/PagerIndicator;->XO0O10(Z)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->getTv1()Landroid/widget/TextView;

    move-result-object v0

    const v2, 0x7f1411de

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->getTv2()Landroid/widget/TextView;

    move-result-object v0

    const-string v2, ""

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->getTvBottom2()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->getEmpty()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMListView()Landroid/widget/ListView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->getIvScanBg()Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    instance-of v1, v0, Lcom/bumptech/glide/load/resource/gif/GifDrawable;

    if-eqz v1, :cond_1

    check-cast v0, Lcom/bumptech/glide/load/resource/gif/GifDrawable;

    invoke-virtual {v0}, Lcom/bumptech/glide/load/resource/gif/GifDrawable;->isRunning()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lcom/bumptech/glide/load/resource/gif/GifDrawable;->stop()V

    :cond_1
    return-void
.end method

.method private static final onTitleRightClick$lambda$0(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;Lcom/bestmafen/androidbase/extension/PermissionStatus;)Lkotlin/Unit;
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/bestmafen/androidbase/extension/PermissionStatus;->GRANTED:Lcom/bestmafen/androidbase/extension/PermissionStatus;

    if-ne p1, v0, :cond_0

    sget-object p1, Lcom/android/mltcode/paycertificationapi/ta2;->OXO1:Lcom/android/mltcode/paycertificationapi/ta2;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/I10i1IO10;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/I10i1IO10;-><init>(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;)V

    const/4 v1, 0x0

    invoke-virtual {p1, p0, v1, v0}, Lcom/android/mltcode/paycertificationapi/ta2;->IO(Landroid/content/Context;ZLkotlin/jvm/functions/Function1;)V

    :cond_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onTitleRightClick$lambda$0$0(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    if-eqz p1, :cond_0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->doScanResult(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const p0, 0x7f141147

    invoke-static {p0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    :goto_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final pagerIndicator_delegate$lambda$0(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;)Lcom/sma/smartv3/view/PagerIndicator;
    .locals 1

    const v0, 0x7f0a08ed

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/PagerIndicator;

    return-object p0
.end method

.method private static final pillTabView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;)Lcom/sma/smartv3/view/PillTabView;
    .locals 1

    const v0, 0x7f0a0914

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/PillTabView;

    return-object p0
.end method

.method private final requestEnableBluetooth()V
    .locals 7

    :try_start_0
    const-string v2, "android.bluetooth.adapter.action.REQUEST_ENABLE"

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v6}, Lcom/android/mltcode/paycertificationapi/X1OOO;->IIX1OXO(Landroid/app/Activity;Ljava/lang/String;IIILjava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Please turn on bluetooth"

    invoke-static {v2, v1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object v1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "requestEnableBluetooth -> "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->XIi00iiXO(Ljava/lang/String;)V

    return-void
.end method

.method private final requestLocationPermission()V
    .locals 6

    sget-object v0, Lcom/android/mltcode/paycertificationapi/hr1;->OXO1:Lcom/android/mltcode/paycertificationapi/hr1;

    new-instance v3, Lcom/android/mltcode/paycertificationapi/O1I0iIX0;

    invoke-direct {v3, p0}, Lcom/android/mltcode/paycertificationapi/O1I0iIX0;-><init>(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;)V

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v2, 0x0

    move-object v1, p0

    invoke-static/range {v0 .. v5}, Lcom/android/mltcode/paycertificationapi/hr1;->XXIIO1i11(Lcom/android/mltcode/paycertificationapi/hr1;Landroid/content/Context;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    return-void
.end method

.method private static final requestLocationPermission$lambda$0(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;Z)Lkotlin/Unit;
    .locals 0

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->scanDevices()V

    :cond_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private final scan()V
    .locals 9

    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->getBondedDevices()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Landroid/bluetooth/BluetoothDevice;

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Landroid/bluetooth/BluetoothDevice;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    new-instance v2, Lcom/bestmafen/baseble/scanner/BleDevice;

    invoke-virtual {v3}, Landroid/bluetooth/BluetoothDevice;->getName()Ljava/lang/String;

    move-result-object v6

    const-string v1, "getName(...)"

    invoke-static {v6, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Landroid/bluetooth/BluetoothDevice;->getType()I

    move-result v7

    invoke-virtual {v3}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v8

    const-string v1, "getAddress(...)"

    invoke-static {v8, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v8}, Lcom/bestmafen/baseble/scanner/BleDevice;-><init>(Landroid/bluetooth/BluetoothDevice;I[BLjava/lang/String;ILjava/lang/String;)V

    sget-object v1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "onDeviceFound -> from system bonded "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v1, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/q62;->i0iIXiI()Ljava/util/Collection;

    move-result-object v1

    invoke-virtual {v2}, Lcom/bestmafen/baseble/scanner/BleDevice;->getMName()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->mOnlineDeviceList:Ljava/util/List;

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lcom/sma/smartv3/model/DeviceOnlineInfo;

    invoke-virtual {v4}, Lcom/sma/smartv3/model/DeviceOnlineInfo;->getBleName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2}, Lcom/bestmafen/baseble/scanner/BleDevice;->getMName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_1

    :cond_2
    const/4 v3, 0x0

    :goto_1
    if-eqz v3, :cond_0

    :cond_3
    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_4
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->mCacheSortByList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMListAdapter()Lcom/android/mltcode/paycertificationapi/XII0Oi10O;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->getMScanner()Lcom/android/mltcode/paycertificationapi/OXOI0XII;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/OXOI0XII;->XXI(Z)V

    return-void
.end method

.method private final scanDevices()V
    .locals 2

    const-string v0, "LOCATION"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/PermissionUtils;->isGranted([Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->requestLocationPermission()V

    return-void

    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_1

    sget-object v0, Lcom/android/mltcode/paycertificationapi/hr1;->OXO1:Lcom/android/mltcode/paycertificationapi/hr1;

    invoke-virtual {v0, p0}, Lcom/android/mltcode/paycertificationapi/hr1;->i11I(Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_1

    new-instance v1, Lcom/android/mltcode/paycertificationapi/I11iO0X;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/I11iO0X;-><init>(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;)V

    invoke-virtual {v0, p0, v1}, Lcom/android/mltcode/paycertificationapi/hr1;->OX(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V

    return-void

    :cond_1
    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->isEnabled()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->requestEnableBluetooth()V

    return-void

    :cond_2
    invoke-static {}, Lcom/sma/smartv3/util/UtilsKt;->X1()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseListFunctionActivity;->locationServerRemind()V

    return-void

    :cond_3
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->getMScanner()Lcom/android/mltcode/paycertificationapi/OXOI0XII;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/OXOI0XII;->XXI(Z)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->mCacheSortByList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMListAdapter()Lcom/android/mltcode/paycertificationapi/XII0Oi10O;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->searchType:Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$SearchType;

    sget-object v1, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$SearchType;->SELF_STUDY:Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$SearchType;

    if-ne v0, v1, :cond_4

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->scan()V

    return-void

    :cond_4
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->thirdPartyUtil:Lcom/sma/smartv3/util/ClassicBluetoothUtil;

    invoke-virtual {v0}, Lcom/sma/smartv3/util/ClassicBluetoothUtil;->O10IXXX0X()V

    return-void
.end method

.method private static final scanDevices$lambda$0(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;Z)Lkotlin/Unit;
    .locals 0

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->scan()V

    :cond_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final tv1_delegate$lambda$0(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0cc1

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final tv2_delegate$lambda$0(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0bfa

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final tvBottom2_delegate$lambda$0(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0c47

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method


# virtual methods
.method public final helpBindClick(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/i72;->iXX0OOiXX(Landroid/app/Activity;)V

    return-void
.end method

.method public init(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    sget-object p1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$O00;

    invoke-virtual {p1, v0}, Lcom/szabh/smable3/component/BleConnector;->addHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/i72;->i0X1iIO()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->viewModel:Lcom/sma/smartv3/ui/device/model/AddDeviceViewModel;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/O1iii11i;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/O1iii11i;-><init>(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;)V

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/ui/device/model/AddDeviceViewModel;->getNewDeviceListObject(Lkotlin/jvm/functions/Function1;)V

    return-void

    :cond_0
    sget-object p1, Lcom/sma/smartv3/biz/DeviceInfoChecker;->OXO1:Lcom/sma/smartv3/biz/DeviceInfoChecker;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IO0IXXXI;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/IO0IXXXI;-><init>(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;)V

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/biz/DeviceInfoChecker;->I1XOi1(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public initEvent()Z
    .locals 1

    const/4 v0, 0x1

    return v0
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

    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->initItem(Lcom/android/mltcode/paycertificationapi/ug6;Lcom/bestmafen/baseble/scanner/BleDevice;I)V

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

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f140081

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    const v0, 0x7f0a0026

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    const v1, 0x7f08105f

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    sget-object v1, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/i72;->OiO0IOX()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const/16 v1, 0x8

    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    const v1, 0x7f06074b

    invoke-static {p0, v1}, Lcom/android/mltcode/paycertificationapi/gk4;->O00(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/iiXI0;->OXO1:Lcom/android/mltcode/paycertificationapi/iiXI0;

    invoke-virtual {v0, p0}, Lcom/android/mltcode/paycertificationapi/iiXI0;->XIi00iiXO(Landroid/content/Context;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMListView()Landroid/widget/ListView;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/i0X010I;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/i0X010I;-><init>(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->thirdPartyUtil:Lcom/sma/smartv3/util/ClassicBluetoothUtil;

    invoke-virtual {v0, p0}, Lcom/sma/smartv3/util/ClassicBluetoothUtil;->OIi0(Landroid/content/Context;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->getPillTabView()Lcom/sma/smartv3/view/PillTabView;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/XiO;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/XiO;-><init>(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;)V

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/PillTabView;->setOnTabSelected(Lkotlin/jvm/functions/Function1;)V

    invoke-static {p0}, Lcom/bumptech/glide/Glide;->with(Landroidx/fragment/app/FragmentActivity;)Lcom/bumptech/glide/RequestManager;

    move-result-object v0

    const v1, 0x7f08074b

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/RequestManager;->load(Ljava/lang/Integer;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/request/BaseRequestOptions;->skipMemoryCache(Z)Lcom/bumptech/glide/request/BaseRequestOptions;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/RequestBuilder;

    sget-object v1, Lcom/bumptech/glide/load/engine/DiskCacheStrategy;->NONE:Lcom/bumptech/glide/load/engine/DiskCacheStrategy;

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/request/BaseRequestOptions;->diskCacheStrategy(Lcom/bumptech/glide/load/engine/DiskCacheStrategy;)Lcom/bumptech/glide/request/BaseRequestOptions;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/RequestBuilder;

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->getIvScanBg()Landroid/widget/ImageView;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/RequestBuilder;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->collectThirdPartyData()V

    return-void
.end method

.method public itemLayoutId()I
    .locals 1

    const v0, 0x7f0d0ed7

    return v0
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0022

    return v0
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 0
    .param p3    # Landroid/content/Intent;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/FragmentActivity;->onActivityResult(IILandroid/content/Intent;)V

    const/4 p3, 0x1

    if-ne p1, p3, :cond_0

    const/4 p1, -0x1

    if-ne p2, p1, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->scanDevices()V

    :cond_0
    return-void
.end method

.method public onAttachedToWindow()V
    .locals 0

    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onAttachedToWindow()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->onPermissionScan()V

    return-void
.end method

.method public final onBottomLeftClick(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/app/Activity;->setResult(I)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public final onBottomRightClick(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->scanDevices()V

    return-void
.end method

.method public onDestroy()V
    .locals 2

    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onDestroy()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->mConfirmPopup:Lcom/android/mltcode/paycertificationapi/ml1;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->getMScanner()Lcom/android/mltcode/paycertificationapi/OXOI0XII;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/OXOI0XII;->XIi00iiXO()V

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$O00;

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/component/BleConnector;->removeHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->thirdPartyUtil:Lcom/sma/smartv3/util/ClassicBluetoothUtil;

    invoke-virtual {v0, p0}, Lcom/sma/smartv3/util/ClassicBluetoothUtil;->XO0O10(Landroid/content/Context;)V

    return-void
.end method

.method public onHandleBackPressed()V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->mConfirmPopup:Lcom/android/mltcode/paycertificationapi/ml1;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->mConfirmPopup:Lcom/android/mltcode/paycertificationapi/ml1;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/ml1;->OII()V

    :cond_0
    return-void

    :cond_1
    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onHandleBackPressed()V

    return-void
.end method

.method public onResume()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onResume()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->viewModel:Lcom/sma/smartv3/ui/device/model/AddDeviceViewModel;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/model/AddDeviceViewModel;->getThirdPartyDevices()V

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

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/app/Activity;->setResult(I)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public final onTitleRightClick(Landroid/view/View;)V
    .locals 3
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "CAMERA"

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/PermissionUtils;->permission([Ljava/lang/String;)Lcom/blankj/utilcode/util/PermissionUtils;

    move-result-object p1

    const-string v0, "permission(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7f140278

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "getString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const v2, 0x7f140277

    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/IIOiXXi;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/IIOiXXi;-><init>(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;)V

    invoke-static {p1, v0, v2, v1}, Lcom/android/mltcode/paycertificationapi/ds1;->XIi00iiXO(Lcom/blankj/utilcode/util/PermissionUtils;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final refreshDeviceState(Lcom/sma/smartv3/util/BluetoothConnectionReceiver$A2DPInfo;)V
    .locals 4
    .param p1    # Lcom/sma/smartv3/util/BluetoothConnectionReceiver$A2DPInfo;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "THIRD_PARTY_DEVICE_STATE_CHANGE"
    .end annotation

    const-string v0, "a2dp"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/sma/smartv3/dto/OXO1;->I0iXXO:Lcom/sma/smartv3/dto/OXO1$OXO1;

    invoke-virtual {v0}, Lcom/sma/smartv3/dto/OXO1$OXO1;->XIi00iiXO()Lcom/sma/smartv3/dto/OXO1;

    move-result-object v0

    sget-object v1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "AddDeviceWithThirdDeviceInfo:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->bindThirdDevice(Lcom/sma/smartv3/util/BluetoothConnectionReceiver$A2DPInfo;)V

    return-void
.end method
