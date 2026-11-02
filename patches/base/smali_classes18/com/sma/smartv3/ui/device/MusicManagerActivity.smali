.class public Lcom/sma/smartv3/ui/device/MusicManagerActivity;
.super Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nMusicManagerActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MusicManagerActivity.kt\ncom/sma/smartv3/ui/device/MusicManagerActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,670:1\n1563#2:671\n1634#2,3:672\n87#3,7:675\n94#3,3:683\n70#3,7:686\n97#3:693\n1#4:682\n*S KotlinDebug\n*F\n+ 1 MusicManagerActivity.kt\ncom/sma/smartv3/ui/device/MusicManagerActivity\n*L\n397#1:671\n397#1:672,3\n667#1:675,7\n667#1:683,3\n667#1:686,7\n667#1:693\n667#1:682\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nMusicManagerActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MusicManagerActivity.kt\ncom/sma/smartv3/ui/device/MusicManagerActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,670:1\n1563#2:671\n1634#2,3:672\n87#3,7:675\n94#3,3:683\n70#3,7:686\n97#3:693\n1#4:682\n*S KotlinDebug\n*F\n+ 1 MusicManagerActivity.kt\ncom/sma/smartv3/ui/device/MusicManagerActivity\n*L\n397#1:671\n397#1:672,3\n667#1:675,7\n667#1:683,3\n667#1:686,7\n667#1:693\n667#1:682\n*E\n"
    }
.end annotation


# instance fields
.field private final TAG:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final abhTitleRight$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private isTransferTip:I

.field private final loadTimeOut:I

.field private mBleHandleCallback:Lcom/sma/smartv3/ui/device/MusicManagerActivity$iO;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mDeviceFileCallback$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mDownSuccessSize:I

.field private mErrorPopup:Lcom/android/mltcode/paycertificationapi/go0;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final mFileObserver:Lcom/sma/smartv3/ui/device/MusicManagerActivity$O00;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mFiles:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/jieli/jl_filebrowse/bean/FileStruct;",
            ">;"
        }
    .end annotation
.end field

.field private mHandler:Landroid/os/Handler;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mMusicItemLayout:I

.field private mSDCardBean:Lcom/jieli/jl_filebrowse/bean/SDCardBean;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final pbProgress$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private retryFrequency:I

.field private final taskPanel$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvCancel$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvFreeSpace$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvName$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvProgress$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvProgressTip$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvRetry$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvTotalProgress$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/kx0;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/kx0;-><init>(Lcom/sma/smartv3/ui/device/MusicManagerActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->abhTitleRight$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/nx0;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/nx0;-><init>(Lcom/sma/smartv3/ui/device/MusicManagerActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->tvTotalProgress$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/px0;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/px0;-><init>(Lcom/sma/smartv3/ui/device/MusicManagerActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->tvName$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/lw0;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/lw0;-><init>(Lcom/sma/smartv3/ui/device/MusicManagerActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->tvProgress$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/mw0;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/mw0;-><init>(Lcom/sma/smartv3/ui/device/MusicManagerActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->tvProgressTip$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/nw0;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/nw0;-><init>(Lcom/sma/smartv3/ui/device/MusicManagerActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->pbProgress$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ow0;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/ow0;-><init>(Lcom/sma/smartv3/ui/device/MusicManagerActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->taskPanel$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/pw0;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/pw0;-><init>(Lcom/sma/smartv3/ui/device/MusicManagerActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->tvCancel$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/qw0;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/qw0;-><init>(Lcom/sma/smartv3/ui/device/MusicManagerActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->tvRetry$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/rw0;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/rw0;-><init>(Lcom/sma/smartv3/ui/device/MusicManagerActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->tvFreeSpace$delegate:Lkotlin/Lazy;

    const v0, 0x7f0d0ef6

    iput v0, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->mMusicItemLayout:I

    const-string v0, "MusicManagerActivity"

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->TAG:Ljava/lang/String;

    const v0, 0x7f1413a9

    iput v0, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->isTransferTip:I

    const/16 v0, 0xff

    iput v0, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->loadTimeOut:I

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    new-instance v2, Lcom/android/mltcode/paycertificationapi/lx0;

    invoke-direct {v2, p0}, Lcom/android/mltcode/paycertificationapi/lx0;-><init>(Lcom/sma/smartv3/ui/device/MusicManagerActivity;)V

    invoke-direct {v0, v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->mHandler:Landroid/os/Handler;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->mFiles:Ljava/util/List;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/mx0;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/mx0;-><init>(Lcom/sma/smartv3/ui/device/MusicManagerActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->mDeviceFileCallback$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/sma/smartv3/ui/device/MusicManagerActivity$O00;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/device/MusicManagerActivity$O00;-><init>(Lcom/sma/smartv3/ui/device/MusicManagerActivity;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->mFileObserver:Lcom/sma/smartv3/ui/device/MusicManagerActivity$O00;

    new-instance v0, Lcom/sma/smartv3/ui/device/MusicManagerActivity$iO;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/device/MusicManagerActivity$iO;-><init>(Lcom/sma/smartv3/ui/device/MusicManagerActivity;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/MusicManagerActivity$iO;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/device/MusicManagerActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->getDeviceFileList$lambda$0(Lcom/sma/smartv3/ui/device/MusicManagerActivity;)V

    return-void
.end method

.method public static synthetic I1(Lcom/sma/smartv3/ui/device/MusicManagerActivity;I)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->showList$lambda$0$0$0$0$0$0$1(Lcom/sma/smartv3/ui/device/MusicManagerActivity;I)Z

    move-result p0

    return p0
.end method

.method public static synthetic I1XOi1()Z
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->showList$lambda$0$0$0$0$0$0$0()Z

    move-result v0

    return v0
.end method

.method public static synthetic II1Xi0(Lcom/sma/smartv3/ui/device/MusicManagerActivity;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->showList$lambda$0(Lcom/sma/smartv3/ui/device/MusicManagerActivity;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IIX1OXO(Lcom/sma/smartv3/ui/device/MusicManagerActivity;I)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->showList$lambda$0$0$0$0$0(Lcom/sma/smartv3/ui/device/MusicManagerActivity;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IXXOO(Lcom/sma/smartv3/ui/device/MusicManagerActivity;Landroid/os/Message;)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->mHandler$lambda$0(Lcom/sma/smartv3/ui/device/MusicManagerActivity;Landroid/os/Message;)Z

    move-result p0

    return p0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/device/MusicManagerActivity;)Z
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->showErrorPop$lambda$0$1(Lcom/sma/smartv3/ui/device/MusicManagerActivity;)Z

    move-result p0

    return p0
.end method

.method public static synthetic O1O(Lcom/sma/smartv3/ui/device/MusicManagerActivity;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->onTitleLeftClick$lambda$0(Lcom/sma/smartv3/ui/device/MusicManagerActivity;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OII(Lcom/sma/smartv3/ui/device/MusicManagerActivity;)Z
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->showErrorPop$lambda$0$0(Lcom/sma/smartv3/ui/device/MusicManagerActivity;)Z

    move-result p0

    return p0
.end method

.method public static synthetic OX(Lcom/sma/smartv3/ui/device/MusicManagerActivity;)Z
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->onCancel$lambda$0$1(Lcom/sma/smartv3/ui/device/MusicManagerActivity;)Z

    move-result p0

    return p0
.end method

.method public static synthetic OiIIX101O(Lcom/sma/smartv3/ui/device/MusicManagerActivity;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->add$lambda$0(Lcom/sma/smartv3/ui/device/MusicManagerActivity;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X01IiOiIi(Lcom/sma/smartv3/ui/device/MusicManagerActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->taskPanel_delegate$lambda$0(Lcom/sma/smartv3/ui/device/MusicManagerActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(Lcom/jieli/jl_filebrowse/bean/FileStruct;Lcom/sma/smartv3/ui/device/MusicManagerActivity;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->showList$lambda$0$0(Lcom/jieli/jl_filebrowse/bean/FileStruct;Lcom/sma/smartv3/ui/device/MusicManagerActivity;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0i1O()Z
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->onCancel$lambda$0$0()Z

    move-result v0

    return v0
.end method

.method public static synthetic X11iII1O1(Lcom/sma/smartv3/ui/device/MusicManagerActivity;ILandroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->showList$lambda$0$0$0$0(Lcom/sma/smartv3/ui/device/MusicManagerActivity;ILandroid/view/View;)V

    return-void
.end method

.method public static synthetic X1IX(Lcom/sma/smartv3/ui/device/MusicManagerActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->tvFreeSpace_delegate$lambda$0(Lcom/sma/smartv3/ui/device/MusicManagerActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/device/MusicManagerActivity;Lcom/bestmafen/androidbase/extension/PermissionStatus;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->onBottomClick$lambda$1(Lcom/sma/smartv3/ui/device/MusicManagerActivity;Lcom/bestmafen/androidbase/extension/PermissionStatus;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XX0(Lcom/sma/smartv3/ui/device/MusicManagerActivity;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->abhTitleRight_delegate$lambda$0(Lcom/sma/smartv3/ui/device/MusicManagerActivity;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/device/MusicManagerActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->tvTotalProgress_delegate$lambda$0(Lcom/sma/smartv3/ui/device/MusicManagerActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXIIO1i11(Lcom/sma/smartv3/ui/device/MusicManagerActivity;)Lcom/sma/smartv3/ui/device/MusicManagerActivity$XO0O10;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->mDeviceFileCallback_delegate$lambda$0(Lcom/sma/smartv3/ui/device/MusicManagerActivity;)Lcom/sma/smartv3/ui/device/MusicManagerActivity$XO0O10;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXX11i(Lcom/sma/smartv3/ui/device/MusicManagerActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->init$lambda$0(Lcom/sma/smartv3/ui/device/MusicManagerActivity;)V

    return-void
.end method

.method public static synthetic XiOIO(Lcom/sma/smartv3/ui/device/MusicManagerActivity;Lcom/bestmafen/androidbase/extension/PermissionStatus;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->onBottomClick$lambda$0(Lcom/sma/smartv3/ui/device/MusicManagerActivity;Lcom/bestmafen/androidbase/extension/PermissionStatus;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIii1(Lcom/sma/smartv3/ui/device/MusicManagerActivity;)Landroid/widget/ProgressBar;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->pbProgress_delegate$lambda$0(Lcom/sma/smartv3/ui/device/MusicManagerActivity;)Landroid/widget/ProgressBar;

    move-result-object p0

    return-object p0
.end method

.method private static final abhTitleRight_delegate$lambda$0(Lcom/sma/smartv3/ui/device/MusicManagerActivity;)Landroid/widget/ImageView;
    .locals 1

    const v0, 0x7f0a0026

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method public static final synthetic access$browToDir(Lcom/sma/smartv3/ui/device/MusicManagerActivity;Lcom/jieli/jl_filebrowse/bean/SDCardBean;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->browToDir(Lcom/jieli/jl_filebrowse/bean/SDCardBean;Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic access$getCurrentInfo(Lcom/sma/smartv3/ui/device/MusicManagerActivity;Lcom/jieli/jl_filebrowse/bean/SDCardBean;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->getCurrentInfo(Lcom/jieli/jl_filebrowse/bean/SDCardBean;)V

    return-void
.end method

.method public static final synthetic access$getSDCardInfo(Lcom/sma/smartv3/ui/device/MusicManagerActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->getSDCardInfo()V

    return-void
.end method

.method public static final synthetic access$loadMore(Lcom/sma/smartv3/ui/device/MusicManagerActivity;Lcom/jieli/jl_filebrowse/bean/SDCardBean;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->loadMore(Lcom/jieli/jl_filebrowse/bean/SDCardBean;)V

    return-void
.end method

.method public static final synthetic access$refreshTaskPanel(Lcom/sma/smartv3/ui/device/MusicManagerActivity;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->refreshTaskPanel(II)V

    return-void
.end method

.method public static final synthetic access$showList(Lcom/sma/smartv3/ui/device/MusicManagerActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->showList()V

    return-void
.end method

.method private final add()V
    .locals 1

    sget-object v0, Lcom/sma/smartv3/ui/device/XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/XIi00iiXO;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/XIi00iiXO;->I1()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->showErrorPop()V

    return-void

    :cond_0
    new-instance v0, Lcom/android/mltcode/paycertificationapi/dx0;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/dx0;-><init>(Lcom/sma/smartv3/ui/device/MusicManagerActivity;)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->doTransfer(Lkotlin/jvm/functions/Function0;)Z

    return-void
.end method

.method private static final add$lambda$0(Lcom/sma/smartv3/ui/device/MusicManagerActivity;)Lkotlin/Unit;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->pickFile()V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private final append(Lcom/jieli/jl_filebrowse/bean/SDCardBean;Lcom/jieli/jl_filebrowse/bean/FileStruct;)V
    .locals 2

    invoke-static {}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->getInstance()Lcom/jieli/jl_filebrowse/FileBrowseManager;

    move-result-object v0

    invoke-virtual {v0, p2, p1}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->appenBrowse(Lcom/jieli/jl_filebrowse/bean/FileStruct;Lcom/jieli/jl_filebrowse/bean/SDCardBean;)I

    move-result p1

    sget-object p2, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " -> appendToDir "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    if-eqz p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->mFiles:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    return-void
.end method

.method private final browToDir(Lcom/jieli/jl_filebrowse/bean/SDCardBean;Ljava/lang/String;)V
    .locals 6

    invoke-static {}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->getInstance()Lcom/jieli/jl_filebrowse/FileBrowseManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->getCurrentReadFile(Lcom/jieli/jl_filebrowse/bean/SDCardBean;)Lcom/jieli/jl_filebrowse/bean/Folder;

    move-result-object v0

    if-nez v0, :cond_0

    goto/16 :goto_2

    :cond_0
    :goto_0
    invoke-virtual {v0}, Lcom/jieli/jl_filebrowse/bean/File;->getParent()Lcom/jieli/jl_filebrowse/bean/Folder;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-static {}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->getInstance()Lcom/jieli/jl_filebrowse/FileBrowseManager;

    move-result-object v0

    invoke-virtual {v0, p1, v2}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->backBrowse(Lcom/jieli/jl_filebrowse/bean/SDCardBean;Z)I

    invoke-static {}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->getInstance()Lcom/jieli/jl_filebrowse/FileBrowseManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->getCurrentReadFile(Lcom/jieli/jl_filebrowse/bean/SDCardBean;)Lcom/jieli/jl_filebrowse/bean/Folder;

    move-result-object v0

    const-string v1, "getCurrentReadFile(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lcom/jieli/jl_filebrowse/bean/Folder;->getChildFileStructs()Ljava/util/List;

    move-result-object v1

    const-string v3, "getChildFileStructs(...)"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lcom/jieli/jl_filebrowse/bean/FileStruct;

    invoke-virtual {v4}, Lcom/jieli/jl_filebrowse/bean/FileStruct;->isFile()Z

    move-result v5

    if-nez v5, :cond_2

    invoke-virtual {v4}, Lcom/jieli/jl_filebrowse/bean/FileStruct;->getName()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x1

    invoke-static {v4, p2, v5}, Lcom/android/mltcode/paycertificationapi/oe5;->OX0X1O10X(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_1

    :cond_3
    const/4 v3, 0x0

    :goto_1
    check-cast v3, Lcom/jieli/jl_filebrowse/bean/FileStruct;

    if-eqz v3, :cond_4

    invoke-direct {p0, p1, v3}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->append(Lcom/jieli/jl_filebrowse/bean/SDCardBean;Lcom/jieli/jl_filebrowse/bean/FileStruct;)V

    return-void

    :cond_4
    invoke-virtual {v0, v2}, Lcom/jieli/jl_filebrowse/bean/Folder;->isLoadFinished(Z)Z

    move-result v0

    if-nez v0, :cond_5

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " -> browseToDir add simpleFileObserver"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    new-instance v0, Lcom/sma/smartv3/ui/device/MusicManagerActivity$OXO1;

    invoke-direct {v0, p0, p1, p2}, Lcom/sma/smartv3/ui/device/MusicManagerActivity$OXO1;-><init>(Lcom/sma/smartv3/ui/device/MusicManagerActivity;Lcom/jieli/jl_filebrowse/bean/SDCardBean;Ljava/lang/String;)V

    invoke-static {}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->getInstance()Lcom/jieli/jl_filebrowse/FileBrowseManager;

    move-result-object p2

    invoke-virtual {p2, v0}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->addFileObserver(Lcom/jieli/jl_filebrowse/interfaces/FileObserver;)V

    invoke-static {}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->getInstance()Lcom/jieli/jl_filebrowse/FileBrowseManager;

    move-result-object p2

    const/16 v1, 0x1e

    invoke-virtual {p2, v1}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->setPageSize(I)V

    invoke-static {}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->getInstance()Lcom/jieli/jl_filebrowse/FileBrowseManager;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->loadMore(Lcom/jieli/jl_filebrowse/bean/SDCardBean;)I

    move-result p1

    if-eqz p1, :cond_5

    invoke-static {}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->getInstance()Lcom/jieli/jl_filebrowse/FileBrowseManager;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->removeFileObserver(Lcom/jieli/jl_filebrowse/interfaces/FileObserver;)V

    :cond_5
    :goto_2
    return-void
.end method

.method private final canLoadMore(Lcom/jieli/jl_filebrowse/bean/SDCardBean;)Z
    .locals 1

    invoke-static {}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->getInstance()Lcom/jieli/jl_filebrowse/FileBrowseManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->getCurrentReadFile(Lcom/jieli/jl_filebrowse/bean/SDCardBean;)Lcom/jieli/jl_filebrowse/bean/Folder;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1, v0}, Lcom/jieli/jl_filebrowse/bean/Folder;->isLoadFinished(Z)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v0
.end method

.method private final deleteFile(I)V
    .locals 6

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->mFiles:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->showList()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->dismissLoadPopup()V

    const p1, 0x7f140bb2

    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    new-array v0, v1, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    invoke-static {}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->getInstance()Lcom/jieli/jl_filebrowse/FileBrowseManager;

    move-result-object v0

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->mSDCardBean:Lcom/jieli/jl_filebrowse/bean/SDCardBean;

    const/4 v3, 0x1

    new-array v4, v3, [Lcom/jieli/jl_filebrowse/bean/FileStruct;

    iget-object v5, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->mFiles:Ljava/util/List;

    invoke-interface {v5, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    aput-object v5, v4, v1

    invoke-static {v4}, Lkotlin/collections/CollectionsKt__CollectionsKt;->Ii1iii0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    iget-object v5, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->mSDCardBean:Lcom/jieli/jl_filebrowse/bean/SDCardBean;

    if-eqz v5, :cond_1

    invoke-virtual {v5}, Lcom/jieli/jl_filebrowse/bean/SDCardBean;->getType()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    goto :goto_0

    :cond_1
    const/4 v5, 0x0

    :goto_0
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    if-le v5, v3, :cond_2

    move v1, v3

    :cond_2
    new-instance v3, Lcom/sma/smartv3/ui/device/MusicManagerActivity$XIi00iiXO;

    invoke-direct {v3, p0, p1}, Lcom/sma/smartv3/ui/device/MusicManagerActivity$XIi00iiXO;-><init>(Lcom/sma/smartv3/ui/device/MusicManagerActivity;I)V

    invoke-virtual {v0, v2, v4, v1, v3}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->deleteFile(Lcom/jieli/jl_filebrowse/bean/SDCardBean;Ljava/util/List;ZLcom/jieli/jl_filebrowse/interfaces/DeleteCallback;)I

    return-void
.end method

.method private final getAbhTitleRight()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->abhTitleRight$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method private final getCurrentInfo(Lcom/jieli/jl_filebrowse/bean/SDCardBean;)V
    .locals 5

    invoke-static {}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->getInstance()Lcom/jieli/jl_filebrowse/FileBrowseManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->getCurrentReadFile(Lcom/jieli/jl_filebrowse/bean/SDCardBean;)Lcom/jieli/jl_filebrowse/bean/Folder;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    sget-object v1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->TAG:Ljava/lang/String;

    invoke-virtual {v0}, Lcom/jieli/jl_filebrowse/bean/FileStruct;->getName()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " -> getCurrentInfo folder "

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/jieli/jl_filebrowse/bean/FileStruct;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "music"

    const/4 v3, 0x1

    invoke-static {v1, v2, v3}, Lcom/android/mltcode/paycertificationapi/oe5;->OX0X1O10X(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Lcom/jieli/jl_filebrowse/bean/File;->getLevel()I

    move-result v1

    if-ne v1, v3, :cond_2

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/jieli/jl_filebrowse/bean/Folder;->isLoadFinished(Z)Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {v0}, Lcom/jieli/jl_filebrowse/bean/Folder;->getChildFileStructs()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v2, v3, :cond_1

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->loadMore(Lcom/jieli/jl_filebrowse/bean/SDCardBean;)V

    return-void

    :cond_1
    invoke-virtual {v0, v1}, Lcom/jieli/jl_filebrowse/bean/Folder;->isLoadFinished(Z)Z

    return-void

    :cond_2
    invoke-direct {p0, p1, v2}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->browToDir(Lcom/jieli/jl_filebrowse/bean/SDCardBean;Ljava/lang/String;)V

    return-void
.end method

.method private static final getDeviceFileList$lambda$0(Lcom/sma/smartv3/ui/device/MusicManagerActivity;)V
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->mFiles:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->browToDirDeviceFile()V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->mSDCardBean:Lcom/jieli/jl_filebrowse/bean/SDCardBean;

    invoke-direct {p0, v0}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->loadMore(Lcom/jieli/jl_filebrowse/bean/SDCardBean;)V

    return-void
.end method

.method private final getMDeviceFileCallback()Lcom/sma/smartv3/ui/device/MusicManagerActivity$XO0O10;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->mDeviceFileCallback$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/ui/device/MusicManagerActivity$XO0O10;

    return-object v0
.end method

.method private final getSDCardInfo()V
    .locals 9

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->XI1O1111i()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v2, Lcom/szabh/smable3/BleKey;->SDCARD_INFO:Lcom/szabh/smable3/BleKey;

    sget-object v3, Lcom/szabh/smable3/BleKeyFlag;->READ:Lcom/szabh/smable3/BleKeyFlag;

    const/16 v7, 0x1c

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v8}, Lcom/szabh/smable3/component/BaseBleConnector;->sendData$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;[BZZILjava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method private final getTvName()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->tvName$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getTvProgress()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->tvProgress$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method public static synthetic i010I(Lcom/sma/smartv3/ui/device/MusicManagerActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->tvRetry_delegate$lambda$0(Lcom/sma/smartv3/ui/device/MusicManagerActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iI(Lcom/jieli/jl_filebrowse/bean/FileStruct;Lcom/sma/smartv3/ui/device/MusicManagerActivity;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->showList$lambda$0$0$0(Lcom/jieli/jl_filebrowse/bean/FileStruct;Lcom/sma/smartv3/ui/device/MusicManagerActivity;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iIiiO(Lcom/sma/smartv3/ui/device/MusicManagerActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->tvProgressTip_delegate$lambda$0(Lcom/sma/smartv3/ui/device/MusicManagerActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iOO1ii1(Lcom/sma/smartv3/ui/device/MusicManagerActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->tvProgress_delegate$lambda$0(Lcom/sma/smartv3/ui/device/MusicManagerActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iOOX010X(Lcom/sma/smartv3/ui/device/MusicManagerActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->tvCancel_delegate$lambda$0(Lcom/sma/smartv3/ui/device/MusicManagerActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iX()Lkotlin/Unit;
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->onHandleBackPressed$lambda$0()Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic iX1O1(Lcom/sma/smartv3/ui/device/MusicManagerActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->tvName_delegate$lambda$0(Lcom/sma/smartv3/ui/device/MusicManagerActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method private static final init$lambda$0(Lcom/sma/smartv3/ui/device/MusicManagerActivity;)V
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, v2, v0, v1}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->showLoadPopup$default(Lcom/sma/smartv3/ui/device/MusicManagerActivity;ZILjava/lang/Object;)V

    return-void
.end method

.method private final loadMore(Lcom/jieli/jl_filebrowse/bean/SDCardBean;)V
    .locals 3

    invoke-static {}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->getInstance()Lcom/jieli/jl_filebrowse/FileBrowseManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->loadMore(Lcom/jieli/jl_filebrowse/bean/SDCardBean;)I

    move-result p1

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " -> loadMoreFile "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    return-void
.end method

.method private static final mDeviceFileCallback_delegate$lambda$0(Lcom/sma/smartv3/ui/device/MusicManagerActivity;)Lcom/sma/smartv3/ui/device/MusicManagerActivity$XO0O10;
    .locals 1

    new-instance v0, Lcom/sma/smartv3/ui/device/MusicManagerActivity$XO0O10;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/device/MusicManagerActivity$XO0O10;-><init>(Lcom/sma/smartv3/ui/device/MusicManagerActivity;)V

    return-object v0
.end method

.method private static final mHandler$lambda$0(Lcom/sma/smartv3/ui/device/MusicManagerActivity;Landroid/os/Message;)Z
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget p1, p1, Landroid/os/Message;->what:I

    iget v0, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->loadTimeOut:I

    if-ne p1, v0, :cond_1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->dismissLoadPopup()V

    sget-object p1, Lcom/sma/smartv3/ui/device/XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/XIi00iiXO;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/XIi00iiXO;->I1()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->showErrorPop()V

    :cond_0
    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->TAG:Ljava/lang/String;

    iget p0, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->retryFrequency:I

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " loadTimeOut retryFrequency="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method private static final onBottomClick$lambda$0(Lcom/sma/smartv3/ui/device/MusicManagerActivity;Lcom/bestmafen/androidbase/extension/PermissionStatus;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/bestmafen/androidbase/extension/PermissionStatus;->GRANTED:Lcom/bestmafen/androidbase/extension/PermissionStatus;

    if-ne p1, v0, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->add()V

    :cond_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onBottomClick$lambda$1(Lcom/sma/smartv3/ui/device/MusicManagerActivity;Lcom/bestmafen/androidbase/extension/PermissionStatus;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/bestmafen/androidbase/extension/PermissionStatus;->GRANTED:Lcom/bestmafen/androidbase/extension/PermissionStatus;

    if-ne p1, v0, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->add()V

    :cond_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onCancel$lambda$0$0()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method private static final onCancel$lambda$0$1(Lcom/sma/smartv3/ui/device/MusicManagerActivity;)Z
    .locals 2

    sget-object v0, Lcom/sma/smartv3/ui/device/XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/XIi00iiXO;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/XIi00iiXO;->O001I()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->getTaskPanel()Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->onMusicFileTransferStop()V

    const/4 p0, 0x1

    return p0
.end method

.method private static final onHandleBackPressed$lambda$0()Lkotlin/Unit;
    .locals 1

    sget-object v0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object v0
.end method

.method private static final onTitleLeftClick$lambda$0(Lcom/sma/smartv3/ui/device/MusicManagerActivity;)Lkotlin/Unit;
    .locals 0

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final pbProgress_delegate$lambda$0(Lcom/sma/smartv3/ui/device/MusicManagerActivity;)Landroid/widget/ProgressBar;
    .locals 1

    const v0, 0x7f0a08ff

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ProgressBar;

    return-object p0
.end method

.method private final pickFile()V
    .locals 5

    new-instance v0, Lcom/sma/smartv3/ui/musicpicker/MusicPicker$Builder;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/musicpicker/MusicPicker$Builder;-><init>(Landroid/app/Activity;)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/ui/musicpicker/MusicPicker$Builder;->hideScrollbar(Z)Lcom/sma/smartv3/ui/musicpicker/MusicPicker$Builder;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/ui/musicpicker/MusicPicker$Builder;->setMaxSelectCount(I)Lcom/sma/smartv3/ui/musicpicker/MusicPicker$Builder;

    move-result-object v0

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lcom/sma/smartv3/ui/musicpicker/MusicPicker$Builder;->showTrack(Z)Lcom/sma/smartv3/ui/musicpicker/MusicPicker$Builder;

    move-result-object v0

    const/4 v3, -0x1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/sma/smartv3/ui/musicpicker/MusicPicker$Builder;->searchIconColor(Ljava/lang/Integer;)Lcom/sma/smartv3/ui/musicpicker/MusicPicker$Builder;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/ui/musicpicker/MusicPicker$Builder;->setChoiceMode(I)Lcom/sma/smartv3/ui/musicpicker/MusicPicker$Builder;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/sma/smartv3/ui/musicpicker/MusicPicker$Builder;->bubbleTextColor(I)Lcom/sma/smartv3/ui/musicpicker/MusicPicker$Builder;

    move-result-object v0

    const v1, 0x7f1410d7

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/ui/musicpicker/MusicPicker$Builder;->setTitleText(Ljava/lang/String;)Lcom/sma/smartv3/ui/musicpicker/MusicPicker$Builder;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/sma/smartv3/ui/musicpicker/MusicPicker$Builder;->setLoadingType(I)Lcom/sma/smartv3/ui/musicpicker/MusicPicker$Builder;

    move-result-object v0

    const/16 v1, 0x3de

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/ui/musicpicker/MusicPicker$Builder;->showPickerForResult(I)V

    return-void
.end method

.method public static synthetic preventUse$default(Lcom/sma/smartv3/ui/device/MusicManagerActivity;ZILjava/lang/Object;)V
    .locals 0

    if-nez p3, :cond_1

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->preventUse(Z)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: preventUse"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final refreshTaskPanel(II)V
    .locals 3

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->getTvProgressTip()Landroid/widget/TextView;

    move-result-object v0

    const v1, 0x7f140fc6

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->getTvCancel()Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->getTvRetry()Landroid/view/View;

    move-result-object v0

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    sget-object v0, Lcom/sma/smartv3/ui/device/XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/XIi00iiXO;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/XIi00iiXO;->X01IiOiIi()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->getTaskPanel()Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->getTvName()Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/XIi00iiXO;->OII()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/android/mltcode/paycertificationapi/bz5;

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/bz5;->IiI10X()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->getTvTotalProgress()Landroid/widget/TextView;

    move-result-object v1

    add-int/lit8 p1, p1, 0x1

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/XIi00iiXO;->OII()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "/"

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->getPbProgress()Landroid/widget/ProgressBar;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/widget/ProgressBar;->setProgress(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->getTvProgress()Landroid/widget/TextView;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, "%"

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private final showErrorPop()V
    .locals 5

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->mErrorPopup:Lcom/android/mltcode/paycertificationapi/go0;

    if-nez v0, :cond_0

    new-instance v0, Lcom/android/mltcode/paycertificationapi/go0;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v0, v1, v4, v2, v3}, Lcom/android/mltcode/paycertificationapi/go0;-><init>(Landroid/app/Activity;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v1, 0x7f140252

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/go0;->O1O(I)V

    const v1, 0x7f14027f

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/android/mltcode/paycertificationapi/zw0;

    invoke-direct {v2, p0}, Lcom/android/mltcode/paycertificationapi/zw0;-><init>(Lcom/sma/smartv3/ui/device/MusicManagerActivity;)V

    invoke-virtual {v0, v1, v2}, Lcom/android/mltcode/paycertificationapi/go0;->iX1O1(Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/ax0;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/ax0;-><init>(Lcom/sma/smartv3/ui/device/MusicManagerActivity;)V

    const v2, 0x7f14034b

    invoke-virtual {v0, v2, v1}, Lcom/android/mltcode/paycertificationapi/go0;->X1IX(ILkotlin/jvm/functions/Function0;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->mErrorPopup:Lcom/android/mltcode/paycertificationapi/go0;

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->mErrorPopup:Lcom/android/mltcode/paycertificationapi/go0;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    return-void

    :cond_1
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->mErrorPopup:Lcom/android/mltcode/paycertificationapi/go0;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    :cond_2
    return-void
.end method

.method private static final showErrorPop$lambda$0$0(Lcom/sma/smartv3/ui/device/MusicManagerActivity;)Z
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->preventUse(Z)V

    return v0
.end method

.method private static final showErrorPop$lambda$0$1(Lcom/sma/smartv3/ui/device/MusicManagerActivity;)Z
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {p0, v1, v2, v0}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->showLoadPopup$default(Lcom/sma/smartv3/ui/device/MusicManagerActivity;ZILjava/lang/Object;)V

    iget v0, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->retryFrequency:I

    add-int/2addr v0, v2

    iput v0, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->retryFrequency:I

    const/4 v3, 0x2

    if-le v0, v3, :cond_0

    iput v1, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->retryFrequency:I

    invoke-static {}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->getInstance()Lcom/jieli/jl_filebrowse/FileBrowseManager;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->mFileObserver:Lcom/sma/smartv3/ui/device/MusicManagerActivity$O00;

    invoke-virtual {v0, v1}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->removeFileObserver(Lcom/jieli/jl_filebrowse/interfaces/FileObserver;)V

    sget-object v0, Lcom/sma/smartv3/ui/device/XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/XIi00iiXO;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/XIi00iiXO;->XiOIO()V

    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v1

    const-string v3, "getApplication(...)"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/ui/device/XIi00iiXO;->OX(Landroid/app/Application;)V

    invoke-static {}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->getInstance()Lcom/jieli/jl_filebrowse/FileBrowseManager;

    move-result-object v0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->mFileObserver:Lcom/sma/smartv3/ui/device/MusicManagerActivity$O00;

    invoke-virtual {v0, p0}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->addFileObserver(Lcom/jieli/jl_filebrowse/interfaces/FileObserver;)V

    :cond_0
    sget-object p0, Lcom/sma/smartv3/ui/device/XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/XIi00iiXO;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/XIi00iiXO;->X0O()V

    return v2
.end method

.method private final showList()V
    .locals 5

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->mFiles:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->mFiles:Ljava/util/List;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "showList -> size:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->preventUse(Z)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->mHandler:Landroid/os/Handler;

    iget v2, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->loadTimeOut:I

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeMessages(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->dismissLoadPopup()V

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->mErrorPopup:Lcom/android/mltcode/paycertificationapi/go0;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_0
    iget-object v1, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->mFiles:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v1

    const/4 v2, 0x4

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    const v1, 0x7f0a035b

    invoke-virtual {p0, v1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_1
    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0, v1}, Lcom/angcyo/dsladapter/DslAdapter;->resetItem(Ljava/util/List;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/bx0;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/bx0;-><init>(Lcom/sma/smartv3/ui/device/MusicManagerActivity;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->renderAdapter(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final showList$lambda$0(Lcom/sma/smartv3/ui/device/MusicManagerActivity;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 4

    const-string v0, "$this$renderAdapter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const p1, 0x7f0a035b

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->mFiles:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/jieli/jl_filebrowse/bean/FileStruct;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object v1

    iget v2, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->mMusicItemLayout:I

    new-instance v3, Lcom/android/mltcode/paycertificationapi/tw0;

    invoke-direct {v3, v0, p0}, Lcom/android/mltcode/paycertificationapi/tw0;-><init>(Lcom/jieli/jl_filebrowse/bean/FileStruct;Lcom/sma/smartv3/ui/device/MusicManagerActivity;)V

    invoke-static {v1, v2, v3}, Lcom/angcyo/dsladapter/DslAdapterExKt;->O10IXXX0X(Lcom/angcyo/dsladapter/DslAdapter;ILkotlin/jvm/functions/Function1;)Lcom/angcyo/dsladapter/DslAdapterItem;

    goto :goto_0

    :cond_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showList$lambda$0$0(Lcom/jieli/jl_filebrowse/bean/FileStruct;Lcom/sma/smartv3/ui/device/MusicManagerActivity;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$dslItem"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/sw0;

    invoke-direct {v0, p0, p1}, Lcom/android/mltcode/paycertificationapi/sw0;-><init>(Lcom/jieli/jl_filebrowse/bean/FileStruct;Lcom/sma/smartv3/ui/device/MusicManagerActivity;)V

    invoke-virtual {p2, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemBindOverride(Lkotlin/jvm/functions/Function4;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showList$lambda$0$0$0(Lcom/jieli/jl_filebrowse/bean/FileStruct;Lcom/sma/smartv3/ui/device/MusicManagerActivity;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 1

    const-string v0, "itemHolder"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "adapterItem"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p4, "<unused var>"

    invoke-static {p5, p4}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const p4, 0x7f0a0bf7

    invoke-virtual {p2, p4}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object p4

    if-eqz p4, :cond_0

    invoke-virtual {p0}, Lcom/jieli/jl_filebrowse/bean/FileStruct;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p4, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    const p0, 0x7f0a01c9

    invoke-virtual {p2, p0}, Lcom/angcyo/dsladapter/DslViewHolder;->img(I)Landroid/widget/ImageView;

    move-result-object p0

    if-eqz p0, :cond_1

    new-instance p2, Lcom/android/mltcode/paycertificationapi/uw0;

    invoke-direct {p2, p1, p3}, Lcom/android/mltcode/paycertificationapi/uw0;-><init>(Lcom/sma/smartv3/ui/device/MusicManagerActivity;I)V

    invoke-virtual {p0, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_1
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showList$lambda$0$0$0$0(Lcom/sma/smartv3/ui/device/MusicManagerActivity;ILandroid/view/View;)V
    .locals 0

    new-instance p2, Lcom/android/mltcode/paycertificationapi/cx0;

    invoke-direct {p2, p0, p1}, Lcom/android/mltcode/paycertificationapi/cx0;-><init>(Lcom/sma/smartv3/ui/device/MusicManagerActivity;I)V

    invoke-virtual {p0, p2}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->doTransfer(Lkotlin/jvm/functions/Function0;)Z

    return-void
.end method

.method private static final showList$lambda$0$0$0$0$0(Lcom/sma/smartv3/ui/device/MusicManagerActivity;I)Lkotlin/Unit;
    .locals 5

    new-instance v0, Lcom/android/mltcode/paycertificationapi/go0;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v0, v1, v4, v2, v3}, Lcom/android/mltcode/paycertificationapi/go0;-><init>(Landroid/app/Activity;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v1, 0x7f1403e9

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/go0;->O1O(I)V

    const v1, 0x7f1403ea

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/go0;->iX(Ljava/lang/Integer;)V

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/go0;->IXXOO(Ljava/lang/Integer;)V

    const v1, 0x7f14027f

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/android/mltcode/paycertificationapi/vw0;

    invoke-direct {v2}, Lcom/android/mltcode/paycertificationapi/vw0;-><init>()V

    invoke-virtual {v0, v1, v2}, Lcom/android/mltcode/paycertificationapi/go0;->iX1O1(Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/gx0;

    invoke-direct {v1, p0, p1}, Lcom/android/mltcode/paycertificationapi/gx0;-><init>(Lcom/sma/smartv3/ui/device/MusicManagerActivity;I)V

    const p0, 0x7f1403db

    invoke-virtual {v0, p0, v1}, Lcom/android/mltcode/paycertificationapi/go0;->X1IX(ILkotlin/jvm/functions/Function0;)V

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showList$lambda$0$0$0$0$0$0$0()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method private static final showList$lambda$0$0$0$0$0$0$1(Lcom/sma/smartv3/ui/device/MusicManagerActivity;I)Z
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->showLoadPopup(Z)V

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->deleteFile(I)V

    const/4 p0, 0x1

    return p0
.end method

.method public static synthetic showLoadPopup$default(Lcom/sma/smartv3/ui/device/MusicManagerActivity;ZILjava/lang/Object;)V
    .locals 0

    if-nez p3, :cond_1

    const/4 p3, 0x1

    and-int/2addr p2, p3

    if-eqz p2, :cond_0

    move p1, p3

    :cond_0
    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->showLoadPopup(Z)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: showLoadPopup"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static final taskPanel_delegate$lambda$0(Lcom/sma/smartv3/ui/device/MusicManagerActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a0b76

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final tvCancel_delegate$lambda$0(Lcom/sma/smartv3/ui/device/MusicManagerActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a0c4d

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final tvFreeSpace_delegate$lambda$0(Lcom/sma/smartv3/ui/device/MusicManagerActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0c82

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final tvName_delegate$lambda$0(Lcom/sma/smartv3/ui/device/MusicManagerActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0cc7

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final tvProgressTip_delegate$lambda$0(Lcom/sma/smartv3/ui/device/MusicManagerActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0cf1

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final tvProgress_delegate$lambda$0(Lcom/sma/smartv3/ui/device/MusicManagerActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0cef

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final tvRetry_delegate$lambda$0(Lcom/sma/smartv3/ui/device/MusicManagerActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a0cfc

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final tvTotalProgress_delegate$lambda$0(Lcom/sma/smartv3/ui/device/MusicManagerActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a18a6

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method


# virtual methods
.method public adapterStatusItem()Lcom/angcyo/dsladapter/DslAdapterStatusItem;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Lcom/sma/smartv3/dsl/AdapterStatusItem;

    invoke-direct {v0}, Lcom/sma/smartv3/dsl/AdapterStatusItem;-><init>()V

    invoke-virtual {p0, v0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->setAdapterStatus(Lcom/angcyo/dsladapter/DslAdapterStatusItem;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getAdapterStatus()Lcom/angcyo/dsladapter/DslAdapterStatusItem;

    move-result-object v0

    return-object v0
.end method

.method public final browToDirDeviceFile()V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->mFiles:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->mSDCardBean:Lcom/jieli/jl_filebrowse/bean/SDCardBean;

    invoke-direct {p0, v0}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->loadMore(Lcom/jieli/jl_filebrowse/bean/SDCardBean;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->mSDCardBean:Lcom/jieli/jl_filebrowse/bean/SDCardBean;

    const-string v1, "music"

    invoke-direct {p0, v0, v1}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->browToDir(Lcom/jieli/jl_filebrowse/bean/SDCardBean;Ljava/lang/String;)V

    return-void
.end method

.method public final dismissLoadPopup()V
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_0
    return-void
.end method

.method public doTransfer(Lkotlin/jvm/functions/Function0;)Z
    .locals 2
    .param p1    # Lkotlin/jvm/functions/Function0;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)Z"
        }
    .end annotation

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/sma/smartv3/ui/device/XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/XIi00iiXO;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/XIi00iiXO;->X01IiOiIi()Z

    move-result v0

    if-eqz v0, :cond_0

    iget p1, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->isTransferTip:I

    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    new-array v1, v0, [Ljava/lang/Object;

    invoke-static {p1, v1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    return v0

    :cond_0
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    const/4 p1, 0x1

    return p1
.end method

.method public getDeviceFileList()V
    .locals 4

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->mHandler:Landroid/os/Handler;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/yw0;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/yw0;-><init>(Lcom/sma/smartv3/ui/device/MusicManagerActivity;)V

    const-wide/16 v2, 0x12c

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public final getMDownSuccessSize()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->mDownSuccessSize:I

    return v0
.end method

.method public final getMFiles()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/jieli/jl_filebrowse/bean/FileStruct;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->mFiles:Ljava/util/List;

    return-object v0
.end method

.method public final getMMusicItemLayout()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->mMusicItemLayout:I

    return v0
.end method

.method public final getMSDCardBean()Lcom/jieli/jl_filebrowse/bean/SDCardBean;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->mSDCardBean:Lcom/jieli/jl_filebrowse/bean/SDCardBean;

    return-object v0
.end method

.method public final getPbProgress()Landroid/widget/ProgressBar;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->pbProgress$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    return-object v0
.end method

.method public final getRetryFrequency()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->retryFrequency:I

    return v0
.end method

.method public final getTAG()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->TAG:Ljava/lang/String;

    return-object v0
.end method

.method public final getTaskPanel()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->taskPanel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method public final getTvCancel()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->tvCancel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method public final getTvFreeSpace()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->tvFreeSpace$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method public final getTvProgressTip()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->tvProgressTip$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method public final getTvRetry()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->tvRetry$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method public final getTvTotalProgress()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->tvTotalProgress$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method public init(Landroid/os/Bundle;)V
    .locals 4
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    sget-object p1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/MusicManagerActivity$iO;

    invoke-virtual {p1, v0}, Lcom/szabh/smable3/component/BleConnector;->addHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    sget-object p1, Lcom/sma/smartv3/ui/device/XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/XIi00iiXO;

    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v0

    const-string v1, "getApplication(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/ui/device/XIi00iiXO;->OX(Landroid/app/Application;)V

    invoke-static {}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->getInstance()Lcom/jieli/jl_filebrowse/FileBrowseManager;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->mFileObserver:Lcom/sma/smartv3/ui/device/MusicManagerActivity$O00;

    invoke-virtual {v0, v1}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->addFileObserver(Lcom/jieli/jl_filebrowse/interfaces/FileObserver;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->getMDeviceFileCallback()Lcom/sma/smartv3/ui/device/MusicManagerActivity$XO0O10;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/ui/device/XIi00iiXO;->O10IXXX0X(Lcom/sma/smartv3/ui/device/XIi00iiXO$OXO1;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->mHandler:Landroid/os/Handler;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/hx0;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/hx0;-><init>(Lcom/sma/smartv3/ui/device/MusicManagerActivity;)V

    const-wide/16 v2, 0x258

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/XIi00iiXO;->X0O()V

    return-void
.end method

.method public initView()V
    .locals 2

    invoke-super {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->initView()V

    sget-object v0, Lcom/sma/smartv3/initializer/BleInitializer;->IO:Lcom/sma/smartv3/initializer/BleInitializer;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/initializer/BleInitializer;->i1iII1i1(Z)V

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f140fc2

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->showRightIcon()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->showFreeSpace()V

    return-void
.end method

.method public final isTransferTip()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->isTransferTip:I

    return v0
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d00cd

    return v0
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 4
    .param p3    # Landroid/content/Intent;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/FragmentActivity;->onActivityResult(IILandroid/content/Intent;)V

    const/4 v0, -0x1

    if-ne p2, v0, :cond_2

    const/16 p2, 0x3de

    if-ne p1, p2, :cond_2

    sget-object p1, Lcom/sma/smartv3/ui/device/XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/XIi00iiXO;

    invoke-static {p3}, Lcom/sma/smartv3/ui/musicpicker/MusicPicker;->XIi00iiXO(Landroid/content/Intent;)Ljava/util/ArrayList;

    move-result-object p2

    const-string p3, "obtainResult(...)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p3, Ljava/util/ArrayList;

    const/16 v0, 0xa

    invoke-static {p2, v0}, Lkotlin/collections/CollectionsKt__IterablesKt;->X00XIX1(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {p3, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/ui/musicpicker/MusicResult;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/musicpicker/MusicResult;->XXI()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v2, 0x32

    if-le v1, v2, :cond_0

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/musicpicker/MusicResult;->XXI()Ljava/lang/String;

    move-result-object v1

    const-string v3, "getTitle(...)"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    invoke-virtual {v1, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    const-string v2, "substring(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ".mp3"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_0
    invoke-virtual {v0}, Lcom/sma/smartv3/ui/musicpicker/MusicResult;->XXI()Ljava/lang/String;

    move-result-object v1

    :goto_1
    new-instance v2, Lcom/android/mltcode/paycertificationapi/bz5;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/musicpicker/MusicResult;->O10IXXX0X()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/musicpicker/MusicResult;->X1ii()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-direct {v2, v3, v0, v1}, Lcom/android/mltcode/paycertificationapi/bz5;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p3, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-virtual {p1, p3}, Lcom/sma/smartv3/ui/device/XIi00iiXO;->X0i1O(Ljava/util/List;)V

    sget-object p1, Lcom/sma/smartv3/ui/device/XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/XIi00iiXO;

    iget-object p2, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->mSDCardBean:Lcom/jieli/jl_filebrowse/bean/SDCardBean;

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/ui/device/XIi00iiXO;->iXiX011(Lcom/jieli/jl_filebrowse/bean/SDCardBean;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->onMusicFileTransferStart()V

    :cond_2
    return-void
.end method

.method public final onBottomClick(Landroid/view/View;)V
    .locals 8
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x21

    const-string v1, "permission(...)"

    if-lt p1, v0, :cond_0

    const-string p1, "android.permission.READ_MEDIA_AUDIO"

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/PermissionUtils;->permission([Ljava/lang/String;)Lcom/blankj/utilcode/util/PermissionUtils;

    move-result-object v2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v5, Lcom/android/mltcode/paycertificationapi/ww0;

    invoke-direct {v5, p0}, Lcom/android/mltcode/paycertificationapi/ww0;-><init>(Lcom/sma/smartv3/ui/device/MusicManagerActivity;)V

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Lcom/android/mltcode/paycertificationapi/ds1;->iO(Lcom/blankj/utilcode/util/PermissionUtils;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    return-void

    :cond_0
    const-string p1, "STORAGE"

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/PermissionUtils;->permission([Ljava/lang/String;)Lcom/blankj/utilcode/util/PermissionUtils;

    move-result-object v2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v5, Lcom/android/mltcode/paycertificationapi/xw0;

    invoke-direct {v5, p0}, Lcom/android/mltcode/paycertificationapi/xw0;-><init>(Lcom/sma/smartv3/ui/device/MusicManagerActivity;)V

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Lcom/android/mltcode/paycertificationapi/ds1;->iO(Lcom/blankj/utilcode/util/PermissionUtils;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    return-void
.end method

.method public onCancel(Landroid/view/View;)V
    .locals 4
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lcom/android/mltcode/paycertificationapi/go0;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {p1, v0, v3, v1, v2}, Lcom/android/mltcode/paycertificationapi/go0;-><init>(Landroid/app/Activity;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v0, 0x7f140282

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/go0;->O1O(I)V

    const v0, 0x7f140283

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/go0;->iX(Ljava/lang/Integer;)V

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/go0;->IXXOO(Ljava/lang/Integer;)V

    const v0, 0x7f14027f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/ex0;

    invoke-direct {v1}, Lcom/android/mltcode/paycertificationapi/ex0;-><init>()V

    invoke-virtual {p1, v0, v1}, Lcom/android/mltcode/paycertificationapi/go0;->iX1O1(Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/fx0;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/fx0;-><init>(Lcom/sma/smartv3/ui/device/MusicManagerActivity;)V

    const v1, 0x7f14034b

    invoke-virtual {p1, v1, v0}, Lcom/android/mltcode/paycertificationapi/go0;->X1IX(ILkotlin/jvm/functions/Function0;)V

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    return-void
.end method

.method public onDestroy()V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->mHandler:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/MusicManagerActivity$iO;

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/component/BleConnector;->removeHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    invoke-static {}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->getInstance()Lcom/jieli/jl_filebrowse/FileBrowseManager;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->mFileObserver:Lcom/sma/smartv3/ui/device/MusicManagerActivity$O00;

    invoke-virtual {v0, v1}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->removeFileObserver(Lcom/jieli/jl_filebrowse/interfaces/FileObserver;)V

    sget-object v0, Lcom/sma/smartv3/ui/device/XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/XIi00iiXO;

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->getMDeviceFileCallback()Lcom/sma/smartv3/ui/device/MusicManagerActivity$XO0O10;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/ui/device/XIi00iiXO;->iOO1ii1(Lcom/sma/smartv3/ui/device/XIi00iiXO$OXO1;)V

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/XIi00iiXO;->XiOIO()V

    sget-object v0, Lcom/sma/smartv3/initializer/BleInitializer;->IO:Lcom/sma/smartv3/initializer/BleInitializer;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/initializer/BleInitializer;->i1iII1i1(Z)V

    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onDestroy()V

    return-void
.end method

.method public onHandleBackPressed()V
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/jx0;

    invoke-direct {v0}, Lcom/android/mltcode/paycertificationapi/jx0;-><init>()V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->doTransfer(Lkotlin/jvm/functions/Function0;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onHandleBackPressed()V

    :cond_0
    return-void
.end method

.method public onMusicFileTransferStart()V
    .locals 0

    return-void
.end method

.method public onMusicFileTransferStop()V
    .locals 0

    return-void
.end method

.method public final onRetry(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/sma/smartv3/ui/device/XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/XIi00iiXO;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/XIi00iiXO;->O1O()V

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

    new-instance p1, Lcom/android/mltcode/paycertificationapi/kw0;

    invoke-direct {p1, p0}, Lcom/android/mltcode/paycertificationapi/kw0;-><init>(Lcom/sma/smartv3/ui/device/MusicManagerActivity;)V

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->doTransfer(Lkotlin/jvm/functions/Function0;)Z

    return-void
.end method

.method public final onTitleRightClick(Landroid/view/View;)V
    .locals 2
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    const-string v0, "mArg0"

    const-string v1, "https://api.iot-solution.net/web/help/help_music.html"

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "mArg1"

    const/4 v1, 0x2

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "mArg2"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string v0, "mArg3"

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/sma/smartv3/ui/me/WebViewActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, p1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    invoke-virtual {p0, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public preventUse(Z)V
    .locals 0

    return-void
.end method

.method public recyclerViewId()I
    .locals 1

    const v0, 0x7f0a09c1

    return v0
.end method

.method public refreshLayoutId()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final setMDownSuccessSize(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->mDownSuccessSize:I

    return-void
.end method

.method public final setMMusicItemLayout(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->mMusicItemLayout:I

    return-void
.end method

.method public final setMSDCardBean(Lcom/jieli/jl_filebrowse/bean/SDCardBean;)V
    .locals 0
    .param p1    # Lcom/jieli/jl_filebrowse/bean/SDCardBean;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->mSDCardBean:Lcom/jieli/jl_filebrowse/bean/SDCardBean;

    return-void
.end method

.method public final setRetryFrequency(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->retryFrequency:I

    return-void
.end method

.method public final setTransferTip(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->isTransferTip:I

    return-void
.end method

.method public showFreeSpace()V
    .locals 9

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->getTvFreeSpace()Landroid/widget/TextView;

    move-result-object v0

    sget-object v1, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/q62;->XI1O1111i()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    const/16 v1, 0x8

    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    sget-object v3, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    sget-object v4, Lcom/szabh/smable3/BleKey;->SDCARD_INFO:Lcom/szabh/smable3/BleKey;

    const/4 v7, 0x4

    const/4 v8, 0x0

    const-class v5, Lcom/szabh/smable3/entity/BleSDCardInfo;

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lcom/szabh/smable3/component/BaseBleCache;->getObject$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;Ljava/lang/Class;Lcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/szabh/smable3/entity/BleSDCardInfo;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->getTvFreeSpace()Landroid/widget/TextView;

    move-result-object v1

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-static {v0, v2, v3, v4}, Lcom/android/mltcode/paycertificationapi/cp5;->iiIOiX(Lcom/szabh/smable3/entity/BleSDCardInfo;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const v2, 0x7f1414c9

    invoke-virtual {p0, v2, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final showLoadPopup(Z)V
    .locals 3

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    if-nez v0, :cond_0

    new-instance v0, Lcom/android/mltcode/paycertificationapi/uq;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/uq;-><init>(Landroid/app/Activity;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    if-eqz v0, :cond_2

    if-eqz p1, :cond_1

    const p1, 0x7f140fc4

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/uq;->X01IiOiIi(I)V

    const p1, 0x7f140fc3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/uq;->I1(Ljava/lang/Integer;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->mHandler:Landroid/os/Handler;

    iget v0, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->loadTimeOut:I

    const-wide/16 v1, 0x61a8

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/uq;->X01IiOiIi(I)V

    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/uq;->I1(Ljava/lang/Integer;)V

    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    :cond_3
    return-void
.end method

.method public final showRightIcon()V
    .locals 2

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->getAbhTitleRight()Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->getAbhTitleRight()Landroid/widget/ImageView;

    move-result-object v0

    const v1, 0x7f081806

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->getAbhTitleRight()Landroid/widget/ImageView;

    move-result-object v0

    const v1, 0x7f06074b

    invoke-static {p0, v1}, Lcom/android/mltcode/paycertificationapi/gk4;->O00(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    return-void
.end method
