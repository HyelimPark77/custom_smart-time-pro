.class public final Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;
.super Lcom/sma/smartv3/ui/device/BaseListFunctionActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity$OXO1;
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
    value = "SMAP\nDeveloperBtNameStartActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeveloperBtNameStartActivity.kt\ncom/sma/smartv3/ui/me/DeveloperBtNameStartActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,344:1\n19#2:345\n15#2:346\n27#2,2:347\n*S KotlinDebug\n*F\n+ 1 DeveloperBtNameStartActivity.kt\ncom/sma/smartv3/ui/me/DeveloperBtNameStartActivity\n*L\n178#1:345\n178#1:346\n264#1:347,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nDeveloperBtNameStartActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeveloperBtNameStartActivity.kt\ncom/sma/smartv3/ui/me/DeveloperBtNameStartActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,344:1\n19#2:345\n15#2:346\n27#2,2:347\n*S KotlinDebug\n*F\n+ 1 DeveloperBtNameStartActivity.kt\ncom/sma/smartv3/ui/me/DeveloperBtNameStartActivity\n*L\n178#1:345\n178#1:346\n264#1:347,2\n*E\n"
    }
.end annotation


# instance fields
.field private final btStartBtName$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final btStopBtName$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private deviceAddress:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final etBtName$delegate:Lkotlin/Lazy;
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

.field private isAutoBtName:Z

.field private final mBleHandleCallback:Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity$XIi00iiXO;
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

.field private final tvAlreadyBtName$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvSearchNumber$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/BaseListFunctionActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iOXX01XOI;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/iOXX01XOI;-><init>(Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;->etOldBleName$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IIOXiO0iO;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/IIOXiO0iO;-><init>(Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;->btStartBtName$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/O1iOO0;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/O1iOO0;-><init>(Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;->btStopBtName$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/i00IOI;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/i00IOI;-><init>(Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;->etSignal$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XiXX0;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/XiXX0;-><init>(Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;->tvSearchNumber$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OOOXO1X;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/OOOXO1X;-><init>(Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;->tvAlreadyBtName$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/i110X;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/i110X;-><init>(Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;->etBtName$delegate:Lkotlin/Lazy;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;->failedList:Ljava/util/List;

    const-string v0, ""

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;->deviceAddress:Ljava/lang/String;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/I1i0iIiI0;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/I1i0iIiI0;-><init>(Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;->mScanner$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity$XIi00iiXO;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity$XIi00iiXO;-><init>(Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity$XIi00iiXO;

    return-void
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;)Landroid/widget/EditText;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;->etOldBleName_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;)Landroid/widget/EditText;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IIX1OXO(Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;)Z
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;->permissionBackgroundLocationRemind$lambda$0$0(Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;)Z

    move-result p0

    return p0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;)Landroid/widget/EditText;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;->etBtName_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;)Landroid/widget/EditText;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OII(Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;)Landroidx/appcompat/widget/AppCompatButton;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;->btStartBtName_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;)Landroidx/appcompat/widget/AppCompatButton;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OiIIX101O(Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;->tvAlreadyBtName_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;)Lcom/android/mltcode/paycertificationapi/OXOI0XII;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;->mScanner_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;)Lcom/android/mltcode/paycertificationapi/OXOI0XII;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;)Landroid/widget/EditText;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;->etSignal_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;)Landroid/widget/EditText;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XX0(Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;Lcom/bestmafen/androidbase/extension/PermissionStatus;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;->requestLocationPermission$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;Lcom/bestmafen/androidbase/extension/PermissionStatus;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIO(Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;)Landroidx/appcompat/widget/AppCompatButton;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;->btStopBtName_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;)Landroidx/appcompat/widget/AppCompatButton;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIii1(Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;->initView$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;Landroid/widget/AdapterView;Landroid/view/View;IJ)V

    return-void
.end method

.method public static final synthetic access$getBtStartBtName(Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;)Landroidx/appcompat/widget/AppCompatButton;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;->getBtStartBtName()Landroidx/appcompat/widget/AppCompatButton;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getBtStopBtName(Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;)Landroidx/appcompat/widget/AppCompatButton;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;->getBtStopBtName()Landroidx/appcompat/widget/AppCompatButton;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getDeviceAddress$p(Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;->deviceAddress:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic access$getEtBtName(Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;)Landroid/widget/EditText;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;->getEtBtName()Landroid/widget/EditText;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getEtOldBleName(Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;)Landroid/widget/EditText;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;->getEtOldBleName()Landroid/widget/EditText;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getFailedList$p(Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;->failedList:Ljava/util/List;

    return-object p0
.end method

.method public static final synthetic access$getMList(Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;)Ljava/util/List;
    .locals 0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getMListAdapter(Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;)Lcom/android/mltcode/paycertificationapi/XII0Oi10O;
    .locals 0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMListAdapter()Lcom/android/mltcode/paycertificationapi/XII0Oi10O;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getMLoadingPopup$p(Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;)Lcom/android/mltcode/paycertificationapi/uq;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    return-object p0
.end method

.method public static final synthetic access$getTvAlreadyBtName(Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;->getTvAlreadyBtName()Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getTvSearchNumber(Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;->getTvSearchNumber()Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$isAutoBtName$p(Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;->isAutoBtName:Z

    return p0
.end method

.method private static final btStartBtName_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;)Landroidx/appcompat/widget/AppCompatButton;
    .locals 1

    const v0, 0x7f0a01a5

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroidx/appcompat/widget/AppCompatButton;

    return-object p0
.end method

.method private static final btStopBtName_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;)Landroidx/appcompat/widget/AppCompatButton;
    .locals 1

    const v0, 0x7f0a01ad

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroidx/appcompat/widget/AppCompatButton;

    return-object p0
.end method

.method private static final etBtName_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;)Landroid/widget/EditText;
    .locals 1

    const v0, 0x7f0a036e

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/EditText;

    return-object p0
.end method

.method private static final etOldBleName_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;)Landroid/widget/EditText;
    .locals 1

    const v0, 0x7f0a0377

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/EditText;

    return-object p0
.end method

.method private static final etSignal_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;)Landroid/widget/EditText;
    .locals 1

    const v0, 0x7f0a037d

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/EditText;

    return-object p0
.end method

.method private final getBtStartBtName()Landroidx/appcompat/widget/AppCompatButton;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;->btStartBtName$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/AppCompatButton;

    return-object v0
.end method

.method private final getBtStopBtName()Landroidx/appcompat/widget/AppCompatButton;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;->btStopBtName$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/AppCompatButton;

    return-object v0
.end method

.method private final getEtBtName()Landroid/widget/EditText;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;->etBtName$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    return-object v0
.end method

.method private final getEtOldBleName()Landroid/widget/EditText;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;->etOldBleName$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    return-object v0
.end method

.method private final getEtSignal()Landroid/widget/EditText;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;->etSignal$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    return-object v0
.end method

.method private final getMScanner()Lcom/android/mltcode/paycertificationapi/OXOI0XII;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;->mScanner$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/android/mltcode/paycertificationapi/OXOI0XII;

    return-object v0
.end method

.method private final getTvAlreadyBtName()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;->tvAlreadyBtName$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getTvSearchNumber()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;->tvSearchNumber$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method public static synthetic iIiiO(Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;->tvSearchNumber_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method private static final initView$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;->getEtOldBleName()Landroid/widget/EditText;

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

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;->getEtOldBleName()Landroid/widget/EditText;

    move-result-object p1

    const-string p2, "<get-etOldBleName>(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;->startSearch(Landroid/view/View;)V

    return-void
.end method

.method private static final mScanner_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;)Lcom/android/mltcode/paycertificationapi/OXOI0XII;
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

    new-instance v1, Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity$iO;

    invoke-direct {v1}, Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity$iO;-><init>()V

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/OXOI0XII;->XiOIO(Lcom/android/mltcode/paycertificationapi/OOXIOIiOO;)Lcom/android/mltcode/paycertificationapi/OXOI0XII;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity$XO0O10;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity$XO0O10;-><init>(Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;)V

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

    new-instance v1, Lcom/android/mltcode/paycertificationapi/O0IOI011;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/O0IOI011;-><init>(Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;)V

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

.method private static final permissionBackgroundLocationRemind$lambda$0$0(Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;)Z
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

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;->permissionBackgroundLocationRemind()V

    return-void

    :cond_0
    const-string v0, "LOCATION"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/PermissionUtils;->permission([Ljava/lang/String;)Lcom/blankj/utilcode/util/PermissionUtils;

    move-result-object v1

    const-string v0, "permission(...)"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Lcom/android/mltcode/paycertificationapi/I1iO1i1;

    invoke-direct {v4, p0}, Lcom/android/mltcode/paycertificationapi/I1iO1i1;-><init>(Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lcom/android/mltcode/paycertificationapi/ds1;->iO(Lcom/blankj/utilcode/util/PermissionUtils;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    return-void
.end method

.method private static final requestLocationPermission$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;Lcom/bestmafen/androidbase/extension/PermissionStatus;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity$OXO1;->OXO1:[I

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
    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;->requestLocationPermission()V

    goto :goto_0

    :cond_1
    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;->getTvAlreadyBtName()Landroid/widget/TextView;

    move-result-object p1

    const-string v0, "<get-tvAlreadyBtName>(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;->startSearch(Landroid/view/View;)V

    :goto_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final tvAlreadyBtName_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0c2d

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final tvSearchNumber_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0d05

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method


# virtual methods
.method public final clearBtNameHistory(Landroid/view/View;)V
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

    const-class v0, Lcom/android/mltcode/paycertificationapi/X01I1X;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/blankj/utilcode/util/SPUtils;->remove(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;->getTvAlreadyBtName()Landroid/widget/TextView;

    move-result-object p1

    const-string v0, "0"

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;->getEtOldBleName()Landroid/widget/EditText;

    move-result-object p1

    const-string v0, "<get-etOldBleName>(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;->startSearch(Landroid/view/View;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;->failedList:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    return-void
.end method

.method public init(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    sget-object p1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity$XIi00iiXO;

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

    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;->initItem(Lcom/android/mltcode/paycertificationapi/ug6;Lcom/bestmafen/baseble/scanner/BleDevice;I)V

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

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;->getBtStartBtName()Landroidx/appcompat/widget/AppCompatButton;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;->getBtStopBtName()Landroidx/appcompat/widget/AppCompatButton;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMListView()Landroid/widget/ListView;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/OI11Ii1O;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/OI11Ii1O;-><init>(Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;->getTvAlreadyBtName()Landroid/widget/TextView;

    move-result-object v0

    sget-object v1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    new-instance v2, Lcom/android/mltcode/paycertificationapi/X01I1X;

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-direct {v2, v3, v4, v3}, Lcom/android/mltcode/paycertificationapi/X01I1X;-><init>(Ljava/util/ArrayList;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Lcom/google/gson/Gson;

    invoke-direct {v3}, Lcom/google/gson/Gson;-><init>()V

    const-class v4, Lcom/android/mltcode/paycertificationapi/X01I1X;

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
    check-cast v2, Lcom/android/mltcode/paycertificationapi/X01I1X;

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/X01I1X;->XO0O10()Ljava/util/ArrayList;

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

    const v0, 0x7f0d006d

    return v0
.end method

.method public onAttachedToWindow()V
    .locals 2

    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onAttachedToWindow()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;->getEtOldBleName()Landroid/widget/EditText;

    move-result-object v0

    const-string v1, "<get-etOldBleName>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;->startSearch(Landroid/view/View;)V

    return-void
.end method

.method public onDestroy()V
    .locals 2

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/component/BaseBleConnector;->setNeedBind(Z)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/component/BaseBleConnector;->setOtaMode(Z)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity$XIi00iiXO;

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/component/BleConnector;->removeHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onDestroy()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;->getMScanner()Lcom/android/mltcode/paycertificationapi/OXOI0XII;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/OXOI0XII;->XIi00iiXO()V

    return-void
.end method

.method public final startBtName(Landroid/view/View;)V
    .locals 6
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;->failedList:Ljava/util/List;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "startTemperatureValue failedList="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;->getEtBtName()Landroid/widget/EditText;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    const-string p1, "Please enter the bt name"

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_1

    const p1, 0x7f140ffd

    invoke-static {p1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    return-void

    :cond_1
    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;->isAutoBtName:Z

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/bestmafen/baseble/scanner/BleDevice;

    iget-object v4, p0, Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;->failedList:Ljava/util/List;

    invoke-virtual {v2}, Lcom/bestmafen/baseble/scanner/BleDevice;->getMBluetoothDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v5

    invoke-virtual {v5}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    goto :goto_0

    :cond_3
    move-object v2, v3

    :goto_0
    if-nez v2, :cond_4

    const-string p1, "no device"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    const p1, 0x7f141003

    invoke-static {p1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;->isAutoBtName:Z

    return-void

    :cond_4
    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    if-nez v1, :cond_5

    new-instance v1, Lcom/android/mltcode/paycertificationapi/uq;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v4

    invoke-direct {v1, v4}, Lcom/android/mltcode/paycertificationapi/uq;-><init>(Landroid/app/Activity;)V

    iput-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    :cond_5
    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    if-eqz v1, :cond_6

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    :cond_6
    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;->getBtStopBtName()Landroidx/appcompat/widget/AppCompatButton;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {v2}, Lcom/bestmafen/baseble/scanner/BleDevice;->getMBluetoothDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v1

    const-string v4, "getAddress(...)"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;->deviceAddress:Ljava/lang/String;

    sget-object v1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {v1, v0}, Lcom/szabh/smable3/component/BaseBleConnector;->setNeedBind(Z)V

    const/4 v4, 0x2

    invoke-static {v1, v2, v0, v4, v3}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->setBleDevice$default(Lcom/bestmafen/baseble/connector/AbsBleConnector;Lcom/bestmafen/baseble/scanner/BleDevice;IILjava/lang/Object;)Lcom/bestmafen/baseble/connector/AbsBleConnector;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->connect(Z)V

    iget-boolean p1, p0, Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;->isAutoBtName:Z

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string p1, " connect new device -> "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

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

    const-string p1, "android.permission.ACCESS_FINE_LOCATION"

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/PermissionUtils;->isGranted([Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;->requestLocationPermission()V

    return-void

    :cond_0
    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object p1

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothAdapter;->isEnabled()Z

    move-result p1

    if-nez p1, :cond_1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;->requestEnableBluetooth()V

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

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;->getEtSignal()Landroid/widget/EditText;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-nez p1, :cond_3

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;->getEtSignal()Landroid/widget/EditText;

    move-result-object p1

    const-string v0, "60"

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_3
    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;->getEtSignal()Landroid/widget/EditText;

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

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;->getEtOldBleName()Landroid/widget/EditText;

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

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;->getTvSearchNumber()Landroid/widget/TextView;

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

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;->getMScanner()Lcom/android/mltcode/paycertificationapi/OXOI0XII;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/OXOI0XII;->XXI(Z)V

    return-void
.end method

.method public final stopBleName(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const p1, 0x7f1402ec

    invoke-static {p1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;->isAutoBtName:Z

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperBtNameStartActivity;->getBtStopBtName()Landroidx/appcompat/widget/AppCompatButton;

    move-result-object p1

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method
