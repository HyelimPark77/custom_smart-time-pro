.class public final Lcom/sma/smartv3/ui/device/EBookManagerActivity;
.super Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nEBookManagerActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EBookManagerActivity.kt\ncom/sma/smartv3/ui/device/EBookManagerActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,687:1\n1#2:688\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nEBookManagerActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EBookManagerActivity.kt\ncom/sma/smartv3/ui/device/EBookManagerActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,687:1\n1#2:688\n*E\n"
    }
.end annotation


# instance fields
.field private final TAG:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private cacheFile:Ljava/io/File;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final loadTimeOut:I

.field private mBleHandleCallback:Lcom/sma/smartv3/ui/device/EBookManagerActivity$iO;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mDeviceFileCallback$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mErrorPopup:Lcom/android/mltcode/paycertificationapi/go0;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final mFileObserver:Lcom/sma/smartv3/ui/device/EBookManagerActivity$O00;
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

.field private mSDCardBean:Lcom/jieli/jl_filebrowse/bean/SDCardBean;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private onFileReceiverSize:I

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

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IXXI1011X;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/IXXI1011X;-><init>(Lcom/sma/smartv3/ui/device/EBookManagerActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->tvTotalProgress$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/i0XIiO1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/i0XIiO1;-><init>(Lcom/sma/smartv3/ui/device/EBookManagerActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->tvName$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/O1iIiI1X;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/O1iIiI1X;-><init>(Lcom/sma/smartv3/ui/device/EBookManagerActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->tvProgress$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ii11X0iiX;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/ii11X0iiX;-><init>(Lcom/sma/smartv3/ui/device/EBookManagerActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->tvProgressTip$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XOI0IIO1I;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/XOI0IIO1I;-><init>(Lcom/sma/smartv3/ui/device/EBookManagerActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->pbProgress$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IOIO001;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/IOIO001;-><init>(Lcom/sma/smartv3/ui/device/EBookManagerActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->taskPanel$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/Iii0X1I1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/Iii0X1I1;-><init>(Lcom/sma/smartv3/ui/device/EBookManagerActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->tvCancel$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IXIi0O01;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/IXIi0O01;-><init>(Lcom/sma/smartv3/ui/device/EBookManagerActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->tvRetry$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/X10X11Ii1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/X10X11Ii1;-><init>(Lcom/sma/smartv3/ui/device/EBookManagerActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->tvFreeSpace$delegate:Lkotlin/Lazy;

    const-string v0, "EBookManagerActivity"

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->TAG:Ljava/lang/String;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->mFiles:Ljava/util/List;

    const/16 v0, 0xff

    iput v0, p0, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->loadTimeOut:I

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    new-instance v2, Lcom/android/mltcode/paycertificationapi/O0110X;

    invoke-direct {v2, p0}, Lcom/android/mltcode/paycertificationapi/O0110X;-><init>(Lcom/sma/smartv3/ui/device/EBookManagerActivity;)V

    invoke-direct {v0, v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->mHandler:Landroid/os/Handler;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/O111Oi10;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/O111Oi10;-><init>(Lcom/sma/smartv3/ui/device/EBookManagerActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->mDeviceFileCallback$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/sma/smartv3/ui/device/EBookManagerActivity$O00;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/device/EBookManagerActivity$O00;-><init>(Lcom/sma/smartv3/ui/device/EBookManagerActivity;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->mFileObserver:Lcom/sma/smartv3/ui/device/EBookManagerActivity$O00;

    new-instance v0, Lcom/sma/smartv3/ui/device/EBookManagerActivity$iO;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/device/EBookManagerActivity$iO;-><init>(Lcom/sma/smartv3/ui/device/EBookManagerActivity;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/EBookManagerActivity$iO;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/jieli/jl_filebrowse/bean/FileStruct;Lcom/sma/smartv3/ui/device/EBookManagerActivity;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->showList$lambda$0$0$0(Lcom/jieli/jl_filebrowse/bean/FileStruct;Lcom/sma/smartv3/ui/device/EBookManagerActivity;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1(Lcom/jieli/jl_filebrowse/bean/FileStruct;Lcom/sma/smartv3/ui/device/EBookManagerActivity;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->showList$lambda$0$0(Lcom/jieli/jl_filebrowse/bean/FileStruct;Lcom/sma/smartv3/ui/device/EBookManagerActivity;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/ui/device/EBookManagerActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->tvProgress_delegate$lambda$0(Lcom/sma/smartv3/ui/device/EBookManagerActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic II1Xi0(Lcom/sma/smartv3/ui/device/EBookManagerActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->init$lambda$0(Lcom/sma/smartv3/ui/device/EBookManagerActivity;)V

    return-void
.end method

.method public static synthetic IIX1OXO(Lcom/sma/smartv3/ui/device/EBookManagerActivity;)Z
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->onCancel$lambda$0$1(Lcom/sma/smartv3/ui/device/EBookManagerActivity;)Z

    move-result p0

    return p0
.end method

.method public static synthetic IXXOO(Lcom/sma/smartv3/ui/device/EBookManagerActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->tvFreeSpace_delegate$lambda$0(Lcom/sma/smartv3/ui/device/EBookManagerActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/device/EBookManagerActivity;I)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->showList$lambda$0$0$0$0$0$0$1(Lcom/sma/smartv3/ui/device/EBookManagerActivity;I)Z

    move-result p0

    return p0
.end method

.method public static synthetic O1O()Z
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->showList$lambda$0$0$0$0$0$0$0()Z

    move-result v0

    return v0
.end method

.method public static synthetic OII(Lcom/sma/smartv3/ui/device/EBookManagerActivity;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->showList$lambda$0(Lcom/sma/smartv3/ui/device/EBookManagerActivity;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OX(Lcom/sma/smartv3/ui/device/EBookManagerActivity;)Lcom/sma/smartv3/ui/device/EBookManagerActivity$XO0O10;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->mDeviceFileCallback_delegate$lambda$0(Lcom/sma/smartv3/ui/device/EBookManagerActivity;)Lcom/sma/smartv3/ui/device/EBookManagerActivity$XO0O10;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OiIIX101O(Lcom/sma/smartv3/ui/device/EBookManagerActivity;)Z
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->showErrorPop$lambda$0$1(Lcom/sma/smartv3/ui/device/EBookManagerActivity;)Z

    move-result p0

    return p0
.end method

.method public static synthetic X01IiOiIi(Lcom/sma/smartv3/ui/device/EBookManagerActivity;I)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->showList$lambda$0$0$0$0$0(Lcom/sma/smartv3/ui/device/EBookManagerActivity;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/device/EBookManagerActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->tvRetry_delegate$lambda$0(Lcom/sma/smartv3/ui/device/EBookManagerActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/device/EBookManagerActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->tvProgressTip_delegate$lambda$0(Lcom/sma/smartv3/ui/device/EBookManagerActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XX0(Lcom/sma/smartv3/ui/device/EBookManagerActivity;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->onTitleLeftClick$lambda$0(Lcom/sma/smartv3/ui/device/EBookManagerActivity;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI()Z
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->onCancel$lambda$0$0()Z

    move-result v0

    return v0
.end method

.method public static synthetic XXIIO1i11(Lcom/sma/smartv3/ui/device/EBookManagerActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->tvTotalProgress_delegate$lambda$0(Lcom/sma/smartv3/ui/device/EBookManagerActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIO(Lcom/sma/smartv3/ui/device/EBookManagerActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->taskPanel_delegate$lambda$0(Lcom/sma/smartv3/ui/device/EBookManagerActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIii1(Lcom/sma/smartv3/ui/device/EBookManagerActivity;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->add$lambda$0(Lcom/sma/smartv3/ui/device/EBookManagerActivity;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$browToDir(Lcom/sma/smartv3/ui/device/EBookManagerActivity;Lcom/jieli/jl_filebrowse/bean/SDCardBean;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->browToDir(Lcom/jieli/jl_filebrowse/bean/SDCardBean;Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic access$dismissLoadPopup(Lcom/sma/smartv3/ui/device/EBookManagerActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->dismissLoadPopup()V

    return-void
.end method

.method public static final synthetic access$getCurrentInfo(Lcom/sma/smartv3/ui/device/EBookManagerActivity;Lcom/jieli/jl_filebrowse/bean/SDCardBean;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->getCurrentInfo(Lcom/jieli/jl_filebrowse/bean/SDCardBean;)V

    return-void
.end method

.method public static final synthetic access$getMFileObserver$p(Lcom/sma/smartv3/ui/device/EBookManagerActivity;)Lcom/sma/smartv3/ui/device/EBookManagerActivity$O00;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->mFileObserver:Lcom/sma/smartv3/ui/device/EBookManagerActivity$O00;

    return-object p0
.end method

.method public static final synthetic access$getPbProgress(Lcom/sma/smartv3/ui/device/EBookManagerActivity;)Landroid/widget/ProgressBar;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->getPbProgress()Landroid/widget/ProgressBar;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getSDCardInfo(Lcom/sma/smartv3/ui/device/EBookManagerActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->getSDCardInfo()V

    return-void
.end method

.method public static final synthetic access$getTAG$p(Lcom/sma/smartv3/ui/device/EBookManagerActivity;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->TAG:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic access$getTaskPanel(Lcom/sma/smartv3/ui/device/EBookManagerActivity;)Landroid/view/View;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->getTaskPanel()Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getTvCancel(Lcom/sma/smartv3/ui/device/EBookManagerActivity;)Landroid/view/View;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->getTvCancel()Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getTvProgressTip(Lcom/sma/smartv3/ui/device/EBookManagerActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->getTvProgressTip()Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getTvRetry(Lcom/sma/smartv3/ui/device/EBookManagerActivity;)Landroid/view/View;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->getTvRetry()Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$loadMore(Lcom/sma/smartv3/ui/device/EBookManagerActivity;Lcom/jieli/jl_filebrowse/bean/SDCardBean;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->loadMore(Lcom/jieli/jl_filebrowse/bean/SDCardBean;)V

    return-void
.end method

.method public static final synthetic access$refreshTaskPanel(Lcom/sma/smartv3/ui/device/EBookManagerActivity;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->refreshTaskPanel(II)V

    return-void
.end method

.method public static final synthetic access$showFreeSpace(Lcom/sma/smartv3/ui/device/EBookManagerActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->showFreeSpace()V

    return-void
.end method

.method public static final synthetic access$showList(Lcom/sma/smartv3/ui/device/EBookManagerActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->showList()V

    return-void
.end method

.method public static final synthetic access$showLoadPopup(Lcom/sma/smartv3/ui/device/EBookManagerActivity;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->showLoadPopup(Z)V

    return-void
.end method

.method private final add()V
    .locals 1

    sget-object v0, Lcom/sma/smartv3/ui/device/XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/XIi00iiXO;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/XIi00iiXO;->I1()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->showErrorPop()V

    return-void

    :cond_0
    new-instance v0, Lcom/android/mltcode/paycertificationapi/i1I1iiOii;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/i1I1iiOii;-><init>(Lcom/sma/smartv3/ui/device/EBookManagerActivity;)V

    invoke-direct {p0, v0}, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->doTransfer(Lkotlin/jvm/functions/Function0;)Z

    return-void
.end method

.method private static final add$lambda$0(Lcom/sma/smartv3/ui/device/EBookManagerActivity;)Lkotlin/Unit;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->pickFile()V

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

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->TAG:Ljava/lang/String;

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
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->mFiles:Ljava/util/List;

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

    invoke-direct {p0, p1, v3}, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->append(Lcom/jieli/jl_filebrowse/bean/SDCardBean;Lcom/jieli/jl_filebrowse/bean/FileStruct;)V

    return-void

    :cond_4
    invoke-virtual {v0, v2}, Lcom/jieli/jl_filebrowse/bean/Folder;->isLoadFinished(Z)Z

    move-result v0

    if-nez v0, :cond_5

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " -> browseToDir add simpleFileObserver"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    new-instance v0, Lcom/sma/smartv3/ui/device/EBookManagerActivity$OXO1;

    invoke-direct {v0, p0, p1, p2}, Lcom/sma/smartv3/ui/device/EBookManagerActivity$OXO1;-><init>(Lcom/sma/smartv3/ui/device/EBookManagerActivity;Lcom/jieli/jl_filebrowse/bean/SDCardBean;Ljava/lang/String;)V

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

.method private final copyCacheFile(Landroid/net/Uri;)Landroid/net/Uri;
    .locals 5

    sget-object v0, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/uz0;->IiI10X(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "/utf_8.txt"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->createNewFile()Z

    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object v0

    new-instance v2, Ljava/io/InputStreamReader;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->getFileCharsetSimple(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, v0, p1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    new-instance p1, Ljava/io/OutputStreamWriter;

    new-instance v3, Ljava/io/FileOutputStream;

    invoke-direct {v3, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    const-string v4, "UTF-8"

    invoke-direct {p1, v3, v4}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/lang/String;)V

    iput-object v1, p0, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->cacheFile:Ljava/io/File;

    new-instance v3, Ljava/io/BufferedReader;

    invoke-direct {v3, v2}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    new-instance v2, Ljava/io/BufferedWriter;

    invoke-direct {v2, p1}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V

    :goto_0
    invoke-virtual {v3}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "\n"

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v2}, Ljava/io/BufferedWriter;->flush()V

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    :cond_2
    invoke-virtual {v2}, Ljava/io/BufferedWriter;->close()V

    invoke-virtual {v3}, Ljava/io/BufferedReader;->close()V

    invoke-static {v1}, Lcom/blankj/utilcode/util/UriUtils;->file2Uri(Ljava/io/File;)Landroid/net/Uri;

    move-result-object p1

    const-string v0, "file2Uri(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final deleteFile(I)V
    .locals 6

    invoke-static {}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->getInstance()Lcom/jieli/jl_filebrowse/FileBrowseManager;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->mSDCardBean:Lcom/jieli/jl_filebrowse/bean/SDCardBean;

    const/4 v2, 0x1

    new-array v3, v2, [Lcom/jieli/jl_filebrowse/bean/FileStruct;

    iget-object v4, p0, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->mFiles:Ljava/util/List;

    invoke-interface {v4, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-static {v3}, Lkotlin/collections/CollectionsKt__CollectionsKt;->Ii1iii0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    iget-object v4, p0, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->mSDCardBean:Lcom/jieli/jl_filebrowse/bean/SDCardBean;

    if-eqz v4, :cond_0

    invoke-virtual {v4}, Lcom/jieli/jl_filebrowse/bean/SDCardBean;->getType()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-le v4, v2, :cond_1

    goto :goto_1

    :cond_1
    move v2, v5

    :goto_1
    new-instance v4, Lcom/sma/smartv3/ui/device/EBookManagerActivity$XIi00iiXO;

    invoke-direct {v4, p0, p1}, Lcom/sma/smartv3/ui/device/EBookManagerActivity$XIi00iiXO;-><init>(Lcom/sma/smartv3/ui/device/EBookManagerActivity;I)V

    invoke-virtual {v0, v1, v3, v2, v4}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->deleteFile(Lcom/jieli/jl_filebrowse/bean/SDCardBean;Ljava/util/List;ZLcom/jieli/jl_filebrowse/interfaces/DeleteCallback;)I

    return-void
.end method

.method private final dismissLoadPopup()V
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_0
    return-void
.end method

.method private final doTransfer(Lkotlin/jvm/functions/Function0;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)Z"
        }
    .end annotation

    sget-object v0, Lcom/sma/smartv3/ui/device/XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/XIi00iiXO;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/XIi00iiXO;->X01IiOiIi()Z

    move-result v0

    if-eqz v0, :cond_0

    const p1, 0x7f1413a9

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

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->TAG:Ljava/lang/String;

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

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->loadMore(Lcom/jieli/jl_filebrowse/bean/SDCardBean;)V

    return-void

    :cond_1
    invoke-virtual {v0, v1}, Lcom/jieli/jl_filebrowse/bean/Folder;->isLoadFinished(Z)Z

    return-void

    :cond_2
    invoke-direct {p0, p1, v2}, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->browToDir(Lcom/jieli/jl_filebrowse/bean/SDCardBean;Ljava/lang/String;)V

    return-void
.end method

.method private final getMDeviceFileCallback()Lcom/sma/smartv3/ui/device/EBookManagerActivity$XO0O10;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->mDeviceFileCallback$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/ui/device/EBookManagerActivity$XO0O10;

    return-object v0
.end method

.method private final getPbProgress()Landroid/widget/ProgressBar;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->pbProgress$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

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

.method private final getTaskPanel()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->taskPanel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final getTvCancel()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->tvCancel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final getTvFreeSpace()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->tvFreeSpace$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getTvName()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->tvName$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getTvProgress()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->tvProgress$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getTvProgressTip()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->tvProgressTip$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getTvRetry()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->tvRetry$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final getTvTotalProgress()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->tvTotalProgress$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method public static synthetic i010I()Lkotlin/Unit;
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->onHandleBackPressed$lambda$0()Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic iI(Lcom/sma/smartv3/ui/device/EBookManagerActivity;Landroid/os/Message;)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->mHandler$lambda$0(Lcom/sma/smartv3/ui/device/EBookManagerActivity;Landroid/os/Message;)Z

    move-result p0

    return p0
.end method

.method public static synthetic iIiiO()Z
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->showErrorPop$lambda$0$0()Z

    move-result v0

    return v0
.end method

.method public static synthetic iOO1ii1(Lcom/sma/smartv3/ui/device/EBookManagerActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->tvName_delegate$lambda$0(Lcom/sma/smartv3/ui/device/EBookManagerActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iOOX010X(Lcom/sma/smartv3/ui/device/EBookManagerActivity;)Landroid/widget/ProgressBar;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->pbProgress_delegate$lambda$0(Lcom/sma/smartv3/ui/device/EBookManagerActivity;)Landroid/widget/ProgressBar;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iX(Lcom/sma/smartv3/ui/device/EBookManagerActivity;ILandroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->showList$lambda$0$0$0$0(Lcom/sma/smartv3/ui/device/EBookManagerActivity;ILandroid/view/View;)V

    return-void
.end method

.method public static synthetic iX1O1(Lcom/sma/smartv3/ui/device/EBookManagerActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->tvCancel_delegate$lambda$0(Lcom/sma/smartv3/ui/device/EBookManagerActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final init$lambda$0(Lcom/sma/smartv3/ui/device/EBookManagerActivity;)V
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, v2, v0, v1}, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->showLoadPopup$default(Lcom/sma/smartv3/ui/device/EBookManagerActivity;ZILjava/lang/Object;)V

    return-void
.end method

.method private final loadMore(Lcom/jieli/jl_filebrowse/bean/SDCardBean;)V
    .locals 3

    invoke-static {}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->getInstance()Lcom/jieli/jl_filebrowse/FileBrowseManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->loadMore(Lcom/jieli/jl_filebrowse/bean/SDCardBean;)I

    move-result p1

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->TAG:Ljava/lang/String;

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

.method private static final mDeviceFileCallback_delegate$lambda$0(Lcom/sma/smartv3/ui/device/EBookManagerActivity;)Lcom/sma/smartv3/ui/device/EBookManagerActivity$XO0O10;
    .locals 1

    new-instance v0, Lcom/sma/smartv3/ui/device/EBookManagerActivity$XO0O10;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/device/EBookManagerActivity$XO0O10;-><init>(Lcom/sma/smartv3/ui/device/EBookManagerActivity;)V

    return-object v0
.end method

.method private static final mHandler$lambda$0(Lcom/sma/smartv3/ui/device/EBookManagerActivity;Landroid/os/Message;)Z
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget p1, p1, Landroid/os/Message;->what:I

    iget v0, p0, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->loadTimeOut:I

    if-ne p1, v0, :cond_1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->dismissLoadPopup()V

    sget-object p1, Lcom/sma/smartv3/ui/device/XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/XIi00iiXO;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/XIi00iiXO;->I1()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->showErrorPop()V

    :cond_0
    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->TAG:Ljava/lang/String;

    iget p0, p0, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->retryFrequency:I

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

.method private static final onCancel$lambda$0$0()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method private static final onCancel$lambda$0$1(Lcom/sma/smartv3/ui/device/EBookManagerActivity;)Z
    .locals 1

    sget-object v0, Lcom/sma/smartv3/ui/device/XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/XIi00iiXO;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/XIi00iiXO;->O001I()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->getTaskPanel()Landroid/view/View;

    move-result-object p0

    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    const/4 p0, 0x1

    return p0
.end method

.method private static final onHandleBackPressed$lambda$0()Lkotlin/Unit;
    .locals 1

    sget-object v0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object v0
.end method

.method private static final onTitleLeftClick$lambda$0(Lcom/sma/smartv3/ui/device/EBookManagerActivity;)Lkotlin/Unit;
    .locals 0

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final pbProgress_delegate$lambda$0(Lcom/sma/smartv3/ui/device/EBookManagerActivity;)Landroid/widget/ProgressBar;
    .locals 1

    const v0, 0x7f0a08ff

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ProgressBar;

    return-object p0
.end method

.method private final pickFile()V
    .locals 2

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "text/plain"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "android.intent.action.GET_CONTENT"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    const/16 v1, 0x3de

    invoke-virtual {p0, v0, v1}, Landroidx/activity/ComponentActivity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method

.method private final refreshTaskPanel(II)V
    .locals 3

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->getTvProgressTip()Landroid/widget/TextView;

    move-result-object v0

    const v1, 0x7f1404b6

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->getTvCancel()Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->getTvRetry()Landroid/view/View;

    move-result-object v0

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->getTaskPanel()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->getTvName()Landroid/widget/TextView;

    move-result-object v0

    sget-object v1, Lcom/sma/smartv3/ui/device/XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/XIi00iiXO;

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/device/XIi00iiXO;->OII()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/android/mltcode/paycertificationapi/bz5;

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/bz5;->IiI10X()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->getTvTotalProgress()Landroid/widget/TextView;

    move-result-object v0

    add-int/lit8 p1, p1, 0x1

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/device/XIi00iiXO;->OII()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "/"

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->getPbProgress()Landroid/widget/ProgressBar;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/widget/ProgressBar;->setProgress(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->getTvProgress()Landroid/widget/TextView;

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

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->mErrorPopup:Lcom/android/mltcode/paycertificationapi/go0;

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

    new-instance v2, Lcom/android/mltcode/paycertificationapi/OO0XIiO10;

    invoke-direct {v2}, Lcom/android/mltcode/paycertificationapi/OO0XIiO10;-><init>()V

    invoke-virtual {v0, v1, v2}, Lcom/android/mltcode/paycertificationapi/go0;->iX1O1(Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/IXO1I0;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/IXO1I0;-><init>(Lcom/sma/smartv3/ui/device/EBookManagerActivity;)V

    const v2, 0x7f14034b

    invoke-virtual {v0, v2, v1}, Lcom/android/mltcode/paycertificationapi/go0;->X1IX(ILkotlin/jvm/functions/Function0;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->mErrorPopup:Lcom/android/mltcode/paycertificationapi/go0;

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->mErrorPopup:Lcom/android/mltcode/paycertificationapi/go0;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    return-void

    :cond_1
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->mErrorPopup:Lcom/android/mltcode/paycertificationapi/go0;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    :cond_2
    return-void
.end method

.method private static final showErrorPop$lambda$0$0()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method private static final showErrorPop$lambda$0$1(Lcom/sma/smartv3/ui/device/EBookManagerActivity;)Z
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {p0, v1, v2, v0}, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->showLoadPopup$default(Lcom/sma/smartv3/ui/device/EBookManagerActivity;ZILjava/lang/Object;)V

    iget v0, p0, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->retryFrequency:I

    add-int/2addr v0, v2

    iput v0, p0, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->retryFrequency:I

    const/4 v3, 0x2

    if-le v0, v3, :cond_0

    iput v1, p0, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->retryFrequency:I

    invoke-static {}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->getInstance()Lcom/jieli/jl_filebrowse/FileBrowseManager;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->mFileObserver:Lcom/sma/smartv3/ui/device/EBookManagerActivity$O00;

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

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->mFileObserver:Lcom/sma/smartv3/ui/device/EBookManagerActivity$O00;

    invoke-virtual {v0, p0}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->addFileObserver(Lcom/jieli/jl_filebrowse/interfaces/FileObserver;)V

    :cond_0
    sget-object p0, Lcom/sma/smartv3/ui/device/XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/XIi00iiXO;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/XIi00iiXO;->X0O()V

    return v2
.end method

.method private final showFreeSpace()V
    .locals 9

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->getTvFreeSpace()Landroid/widget/TextView;

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

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->getTvFreeSpace()Landroid/widget/TextView;

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

.method private final showList()V
    .locals 5

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->mFiles:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->mFiles:Ljava/util/List;

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

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->mHandler:Landroid/os/Handler;

    iget v1, p0, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->loadTimeOut:I

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->dismissLoadPopup()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->mErrorPopup:Lcom/android/mltcode/paycertificationapi/go0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->mFiles:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    const v0, 0x7f0a035b

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_1
    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0, v1}, Lcom/angcyo/dsladapter/DslAdapter;->resetItem(Ljava/util/List;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iO1iX00;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/iO1iX00;-><init>(Lcom/sma/smartv3/ui/device/EBookManagerActivity;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->renderAdapter(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final showList$lambda$0(Lcom/sma/smartv3/ui/device/EBookManagerActivity;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 3

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

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->mFiles:Ljava/util/List;

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

    new-instance v2, Lcom/android/mltcode/paycertificationapi/XX11i0III;

    invoke-direct {v2, v0, p0}, Lcom/android/mltcode/paycertificationapi/XX11i0III;-><init>(Lcom/jieli/jl_filebrowse/bean/FileStruct;Lcom/sma/smartv3/ui/device/EBookManagerActivity;)V

    const v0, 0x7f0d0ef6

    invoke-static {v1, v0, v2}, Lcom/angcyo/dsladapter/DslAdapterExKt;->O10IXXX0X(Lcom/angcyo/dsladapter/DslAdapter;ILkotlin/jvm/functions/Function1;)Lcom/angcyo/dsladapter/DslAdapterItem;

    goto :goto_0

    :cond_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showList$lambda$0$0(Lcom/jieli/jl_filebrowse/bean/FileStruct;Lcom/sma/smartv3/ui/device/EBookManagerActivity;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$dslItem"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OIiXI1;

    invoke-direct {v0, p0, p1}, Lcom/android/mltcode/paycertificationapi/OIiXI1;-><init>(Lcom/jieli/jl_filebrowse/bean/FileStruct;Lcom/sma/smartv3/ui/device/EBookManagerActivity;)V

    invoke-virtual {p2, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemBindOverride(Lkotlin/jvm/functions/Function4;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showList$lambda$0$0$0(Lcom/jieli/jl_filebrowse/bean/FileStruct;Lcom/sma/smartv3/ui/device/EBookManagerActivity;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
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

    new-instance p2, Lcom/android/mltcode/paycertificationapi/X1O10i;

    invoke-direct {p2, p1, p3}, Lcom/android/mltcode/paycertificationapi/X1O10i;-><init>(Lcom/sma/smartv3/ui/device/EBookManagerActivity;I)V

    invoke-virtual {p0, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_1
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showList$lambda$0$0$0$0(Lcom/sma/smartv3/ui/device/EBookManagerActivity;ILandroid/view/View;)V
    .locals 0

    new-instance p2, Lcom/android/mltcode/paycertificationapi/OI101i0i;

    invoke-direct {p2, p0, p1}, Lcom/android/mltcode/paycertificationapi/OI101i0i;-><init>(Lcom/sma/smartv3/ui/device/EBookManagerActivity;I)V

    invoke-direct {p0, p2}, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->doTransfer(Lkotlin/jvm/functions/Function0;)Z

    return-void
.end method

.method private static final showList$lambda$0$0$0$0$0(Lcom/sma/smartv3/ui/device/EBookManagerActivity;I)Lkotlin/Unit;
    .locals 5

    new-instance v0, Lcom/android/mltcode/paycertificationapi/go0;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v0, v1, v4, v2, v3}, Lcom/android/mltcode/paycertificationapi/go0;-><init>(Landroid/app/Activity;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v1, 0x7f1414d7

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/go0;->O1O(I)V

    const v1, 0x7f14027f

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/android/mltcode/paycertificationapi/IXX110XI;

    invoke-direct {v2}, Lcom/android/mltcode/paycertificationapi/IXX110XI;-><init>()V

    invoke-virtual {v0, v1, v2}, Lcom/android/mltcode/paycertificationapi/go0;->iX1O1(Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/iOO1I1I;

    invoke-direct {v1, p0, p1}, Lcom/android/mltcode/paycertificationapi/iOO1I1I;-><init>(Lcom/sma/smartv3/ui/device/EBookManagerActivity;I)V

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

.method private static final showList$lambda$0$0$0$0$0$0$1(Lcom/sma/smartv3/ui/device/EBookManagerActivity;I)Z
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->showLoadPopup(Z)V

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->deleteFile(I)V

    const/4 p0, 0x1

    return p0
.end method

.method private final showLoadPopup(Z)V
    .locals 3

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    if-nez v0, :cond_0

    new-instance v0, Lcom/android/mltcode/paycertificationapi/uq;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/uq;-><init>(Landroid/app/Activity;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    if-eqz v0, :cond_2

    if-eqz p1, :cond_1

    const p1, 0x7f140fc4

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/uq;->X01IiOiIi(I)V

    const p1, 0x7f140fc3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/uq;->I1(Ljava/lang/Integer;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->mHandler:Landroid/os/Handler;

    iget v0, p0, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->loadTimeOut:I

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
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    :cond_3
    return-void
.end method

.method public static synthetic showLoadPopup$default(Lcom/sma/smartv3/ui/device/EBookManagerActivity;ZILjava/lang/Object;)V
    .locals 0

    const/4 p3, 0x1

    and-int/2addr p2, p3

    if-eqz p2, :cond_0

    move p1, p3

    :cond_0
    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->showLoadPopup(Z)V

    return-void
.end method

.method private static final taskPanel_delegate$lambda$0(Lcom/sma/smartv3/ui/device/EBookManagerActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a0b76

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final tvCancel_delegate$lambda$0(Lcom/sma/smartv3/ui/device/EBookManagerActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a0c4d

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final tvFreeSpace_delegate$lambda$0(Lcom/sma/smartv3/ui/device/EBookManagerActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0c82

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final tvName_delegate$lambda$0(Lcom/sma/smartv3/ui/device/EBookManagerActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0cc7

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final tvProgressTip_delegate$lambda$0(Lcom/sma/smartv3/ui/device/EBookManagerActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0cf1

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final tvProgress_delegate$lambda$0(Lcom/sma/smartv3/ui/device/EBookManagerActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0cef

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final tvRetry_delegate$lambda$0(Lcom/sma/smartv3/ui/device/EBookManagerActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a0cfc

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final tvTotalProgress_delegate$lambda$0(Lcom/sma/smartv3/ui/device/EBookManagerActivity;)Landroid/widget/TextView;
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

.method public final getCacheFile()Ljava/io/File;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->cacheFile:Ljava/io/File;

    return-object v0
.end method

.method public final getFileCharsetSimple(Landroid/net/Uri;)Ljava/lang/String;
    .locals 4
    .param p1    # Landroid/net/Uri;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "sourcePath"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    :try_start_1
    new-instance v1, Ljava/io/BufferedInputStream;

    invoke-direct {v1, p1}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-virtual {v1}, Ljava/io/BufferedInputStream;->read()I

    move-result v0

    shl-int/lit8 v0, v0, 0x8

    invoke-virtual {v1}, Ljava/io/BufferedInputStream;->read()I

    move-result v2
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    add-int/2addr v0, v2

    :try_start_3
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_4

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    goto :goto_4

    :catchall_0
    move-exception v0

    goto :goto_6

    :catch_1
    move-exception v0

    goto :goto_0

    :catchall_1
    move-exception v1

    move-object v3, v1

    move-object v1, v0

    move-object v0, v3

    goto :goto_6

    :catch_2
    move-exception v1

    move-object v3, v1

    move-object v1, v0

    move-object v0, v3

    goto :goto_0

    :catchall_2
    move-exception p1

    move-object v1, v0

    move-object v0, p1

    move-object p1, v1

    goto :goto_6

    :catch_3
    move-exception p1

    move-object v1, v0

    move-object v0, p1

    move-object p1, v1

    :goto_0
    :try_start_4
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-eqz v1, :cond_0

    :try_start_5
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    goto :goto_1

    :catch_4
    move-exception p1

    goto :goto_2

    :cond_0
    :goto_1
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4

    goto :goto_3

    :goto_2
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_1
    :goto_3
    const/4 v0, 0x0

    :cond_2
    :goto_4
    const p1, 0xfeff

    if-eq v0, p1, :cond_4

    const p1, 0xfffe

    if-eq v0, p1, :cond_3

    const-string p1, "GBK"

    goto :goto_5

    :cond_3
    const-string p1, "Unicode"

    goto :goto_5

    :cond_4
    const-string p1, "UTF-16BE"

    :goto_5
    return-object p1

    :goto_6
    if-eqz v1, :cond_5

    :try_start_6
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    goto :goto_7

    :catch_5
    move-exception p1

    goto :goto_8

    :cond_5
    :goto_7
    if-eqz p1, :cond_6

    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_5

    goto :goto_9

    :goto_8
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_6
    :goto_9
    throw v0
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

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->mFiles:Ljava/util/List;

    return-object v0
.end method

.method public final getMSDCardBean()Lcom/jieli/jl_filebrowse/bean/SDCardBean;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->mSDCardBean:Lcom/jieli/jl_filebrowse/bean/SDCardBean;

    return-object v0
.end method

.method public final getOnFileReceiverSize()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->onFileReceiverSize:I

    return v0
.end method

.method public final getRetryFrequency()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->retryFrequency:I

    return v0
.end method

.method public init(Landroid/os/Bundle;)V
    .locals 4
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    sget-object p1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/EBookManagerActivity$iO;

    invoke-virtual {p1, v0}, Lcom/szabh/smable3/component/BleConnector;->addHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    sget-object p1, Lcom/sma/smartv3/ui/device/XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/XIi00iiXO;

    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v0

    const-string v1, "getApplication(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/ui/device/XIi00iiXO;->OX(Landroid/app/Application;)V

    invoke-static {}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->getInstance()Lcom/jieli/jl_filebrowse/FileBrowseManager;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->mFileObserver:Lcom/sma/smartv3/ui/device/EBookManagerActivity$O00;

    invoke-virtual {v0, v1}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->addFileObserver(Lcom/jieli/jl_filebrowse/interfaces/FileObserver;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->getMDeviceFileCallback()Lcom/sma/smartv3/ui/device/EBookManagerActivity$XO0O10;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/ui/device/XIi00iiXO;->O10IXXX0X(Lcom/sma/smartv3/ui/device/XIi00iiXO$OXO1;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->mHandler:Landroid/os/Handler;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/I1OiXXXi;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/I1OiXXXi;-><init>(Lcom/sma/smartv3/ui/device/EBookManagerActivity;)V

    const-wide/16 v2, 0x258

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/XIi00iiXO;->X0O()V

    return-void
.end method

.method public initView()V
    .locals 2

    invoke-super {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->initView()V

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f1404b4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->getSDCardInfo()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->showFreeSpace()V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0091

    return v0
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 6
    .param p3    # Landroid/content/Intent;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/FragmentActivity;->onActivityResult(IILandroid/content/Intent;)V

    const/4 v0, -0x1

    if-ne p2, v0, :cond_7

    const/16 p2, 0x3de

    if-ne p1, p2, :cond_7

    const/4 p1, 0x0

    if-eqz p3, :cond_0

    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object p2

    move-object v1, p2

    goto :goto_0

    :cond_0
    move-object v1, p1

    :goto_0
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p2

    if-eqz p2, :cond_1

    invoke-interface {p2}, Landroid/database/Cursor;->moveToFirst()Z

    :cond_1
    new-instance p3, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {p3}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    if-eqz p2, :cond_2

    const-string p1, "_display_name"

    invoke-interface {p2, p1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result p1

    invoke-interface {p2, p1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p1

    :cond_2
    iput-object p1, p3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    if-eqz p2, :cond_3

    invoke-interface {p2}, Landroid/database/Cursor;->close()V

    :cond_3
    iget-object p1, p3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    const/4 p2, 0x4

    if-ge p1, p2, :cond_4

    iget-object p1, p3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "watch_"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    :cond_4
    iget-object p1, p3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    const/16 p2, 0x32

    if-le p1, p2, :cond_5

    iget-object p1, p3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    const-string p2, "substring(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ".txt"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    :cond_5
    invoke-static {v1}, Lcom/blankj/utilcode/util/UriUtils;->uri2File(Landroid/net/Uri;)Ljava/io/File;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/FileUtils;->isUtf8(Ljava/io/File;)Z

    move-result p1

    const-string p2, "ebook"

    if-eqz p1, :cond_6

    sget-object p1, Lcom/sma/smartv3/ui/device/XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/XIi00iiXO;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/bz5;

    invoke-virtual {v1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object p3, p3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    invoke-static {p3}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {v0, v2, v1, p2}, Lcom/android/mltcode/paycertificationapi/bz5;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/ui/device/XIi00iiXO;->X1IX(Lcom/android/mltcode/paycertificationapi/bz5;)V

    iget-object p2, p0, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->mSDCardBean:Lcom/jieli/jl_filebrowse/bean/SDCardBean;

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/ui/device/XIi00iiXO;->iIXi1iiXI(Lcom/jieli/jl_filebrowse/bean/SDCardBean;)V

    return-void

    :cond_6
    invoke-direct {p0, v1}, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->copyCacheFile(Landroid/net/Uri;)Landroid/net/Uri;

    move-result-object p1

    sget-object v0, Lcom/sma/smartv3/ui/device/XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/XIi00iiXO;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/bz5;

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object p3, p3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    invoke-static {p3}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {v1, v2, p1, p2}, Lcom/android/mltcode/paycertificationapi/bz5;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/ui/device/XIi00iiXO;->X1IX(Lcom/android/mltcode/paycertificationapi/bz5;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->mSDCardBean:Lcom/jieli/jl_filebrowse/bean/SDCardBean;

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/ui/device/XIi00iiXO;->iIXi1iiXI(Lcom/jieli/jl_filebrowse/bean/SDCardBean;)V

    :cond_7
    return-void
.end method

.method public final onBottomClick(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->add()V

    return-void
.end method

.method public final onCancel(Landroid/view/View;)V
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

    const v0, 0x7f140280

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/go0;->O1O(I)V

    const v0, 0x7f14027f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/XXO1i;

    invoke-direct {v1}, Lcom/android/mltcode/paycertificationapi/XXO1i;-><init>()V

    invoke-virtual {p1, v0, v1}, Lcom/android/mltcode/paycertificationapi/go0;->iX1O1(Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/X1OiO;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/X1OiO;-><init>(Lcom/sma/smartv3/ui/device/EBookManagerActivity;)V

    const v1, 0x7f14034b

    invoke-virtual {p1, v1, v0}, Lcom/android/mltcode/paycertificationapi/go0;->X1IX(ILkotlin/jvm/functions/Function0;)V

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    return-void
.end method

.method public onDestroy()V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->mHandler:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/EBookManagerActivity$iO;

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/component/BleConnector;->removeHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    invoke-static {}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->getInstance()Lcom/jieli/jl_filebrowse/FileBrowseManager;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->mFileObserver:Lcom/sma/smartv3/ui/device/EBookManagerActivity$O00;

    invoke-virtual {v0, v1}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->removeFileObserver(Lcom/jieli/jl_filebrowse/interfaces/FileObserver;)V

    sget-object v0, Lcom/sma/smartv3/ui/device/XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/XIi00iiXO;

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->getMDeviceFileCallback()Lcom/sma/smartv3/ui/device/EBookManagerActivity$XO0O10;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/ui/device/XIi00iiXO;->iOO1ii1(Lcom/sma/smartv3/ui/device/XIi00iiXO$OXO1;)V

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/XIi00iiXO;->XiOIO()V

    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onDestroy()V

    return-void
.end method

.method public onHandleBackPressed()V
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ii0XiXI1i;

    invoke-direct {v0}, Lcom/android/mltcode/paycertificationapi/ii0XiXI1i;-><init>()V

    invoke-direct {p0, v0}, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->doTransfer(Lkotlin/jvm/functions/Function0;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onHandleBackPressed()V

    :cond_0
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

    new-instance p1, Lcom/android/mltcode/paycertificationapi/OiIX00X;

    invoke-direct {p1, p0}, Lcom/android/mltcode/paycertificationapi/OiIX00X;-><init>(Lcom/sma/smartv3/ui/device/EBookManagerActivity;)V

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->doTransfer(Lkotlin/jvm/functions/Function0;)Z

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

.method public final setCacheFile(Ljava/io/File;)V
    .locals 0
    .param p1    # Ljava/io/File;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->cacheFile:Ljava/io/File;

    return-void
.end method

.method public final setMSDCardBean(Lcom/jieli/jl_filebrowse/bean/SDCardBean;)V
    .locals 0
    .param p1    # Lcom/jieli/jl_filebrowse/bean/SDCardBean;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->mSDCardBean:Lcom/jieli/jl_filebrowse/bean/SDCardBean;

    return-void
.end method

.method public final setOnFileReceiverSize(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->onFileReceiverSize:I

    return-void
.end method

.method public final setRetryFrequency(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/device/EBookManagerActivity;->retryFrequency:I

    return-void
.end method
