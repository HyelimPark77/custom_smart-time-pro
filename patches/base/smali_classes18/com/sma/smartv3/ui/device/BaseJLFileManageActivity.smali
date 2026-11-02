.class public Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;
.super Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;
.source "SourceFile"


# instance fields
.field private final TAG:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private deleteNum:I

.field private isAllSelect:Z

.field private isTransfer:Z

.field private final leftBtn$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mAudioBookItem:Lcom/sma/smartv3/model/AudioBookItem;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mBleHandleCallback:Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity$XIi00iiXO;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mCurListSize:I

.field private mDeleteTipPopup:Lcom/android/mltcode/paycertificationapi/go0;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
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

.field private mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mSDCardName:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mTotalListSize:I

.field private final openDeleteBtn$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private openDeleteType:Z

.field private final pbProgress$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final recyclerViewTitle$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final rightBtn$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

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
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;-><init>()V

    const-string v0, "music"

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->mSDCardName:Ljava/lang/String;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->mFiles:Ljava/util/List;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iiXO0IX;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/iiXO0IX;-><init>(Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->recyclerViewTitle$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IX11XI10I;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/IX11XI10I;-><init>(Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->openDeleteBtn$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/i1OiIIO;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/i1OiIIO;-><init>(Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->leftBtn$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/Xi0O1I1I;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/Xi0O1I1I;-><init>(Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->rightBtn$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/O0XIO10O0;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/O0XIO10O0;-><init>(Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->tvFreeSpace$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iOI1OIIO0;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/iOI1OIIO0;-><init>(Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->taskPanel$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IiO1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/IiO1;-><init>(Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->tvProgress$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iOiX1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/iOiX1;-><init>(Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->tvProgressTip$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XXiO0;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/XXiO0;-><init>(Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->pbProgress$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/X01i10;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/X01i10;-><init>(Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->tvCancel$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XO1iIX;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/XO1iIX;-><init>(Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->tvRetry$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/X0IOiIO;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/X0IOiIO;-><init>(Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->tvTotalProgress$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iIi1X0O1i;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/iIi1X0O1i;-><init>(Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->tvName$delegate:Lkotlin/Lazy;

    const-string v0, "BaseJLFileManageActivity"

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->TAG:Ljava/lang/String;

    new-instance v0, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity$XIi00iiXO;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity$XIi00iiXO;-><init>(Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity$XIi00iiXO;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->taskPanel_delegate$lambda$0(Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1(Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->tvRetry_delegate$lambda$0(Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1XOi1()Z
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->onCancel$lambda$0$0()Z

    move-result v0

    return v0
.end method

.method public static synthetic II1Xi0(Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->tvName_delegate$lambda$0(Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IIX1OXO(Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;)Z
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->onCancel$lambda$0$1(Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;)Z

    move-result p0

    return p0
.end method

.method public static synthetic IXXOO(Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->tvProgressTip_delegate$lambda$0(Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;)Landroid/widget/Button;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->leftBtn_delegate$lambda$0(Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;)Landroid/widget/Button;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O1O(Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->tvFreeSpace_delegate$lambda$0(Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OII(Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->add$lambda$0(Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OX(Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->initView$lambda$0(Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic OiIIX101O(Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->tvProgress_delegate$lambda$0(Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X01IiOiIi(Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->tvTotalProgress_delegate$lambda$0(Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;)Landroid/widget/ProgressBar;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->pbProgress_delegate$lambda$0(Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;)Landroid/widget/ProgressBar;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;)Z
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->showDeleteTipPopup$lambda$0$1(Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;)Z

    move-result p0

    return p0
.end method

.method public static synthetic XX0(Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;Z)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->showLoading$lambda$0(Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;Z)V

    return-void
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->dismissLoading$lambda$0(Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;)V

    return-void
.end method

.method public static synthetic XiOIO(Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;)Landroid/widget/Button;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->rightBtn_delegate$lambda$0(Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;)Landroid/widget/Button;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIii1(Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->tvCancel_delegate$lambda$0(Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$browToDir(Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;Lcom/jieli/jl_filebrowse/bean/SDCardBean;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->browToDir(Lcom/jieli/jl_filebrowse/bean/SDCardBean;Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic access$getTAG$p(Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->TAG:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic access$showFreeSpace(Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->showFreeSpace()V

    return-void
.end method

.method private static final add$lambda$0(Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;)Lkotlin/Unit;
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->getFile()V

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

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->TAG:Ljava/lang/String;

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
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->mFiles:Ljava/util/List;

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

    invoke-direct {p0, p1, v3}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->append(Lcom/jieli/jl_filebrowse/bean/SDCardBean;Lcom/jieli/jl_filebrowse/bean/FileStruct;)V

    return-void

    :cond_4
    invoke-virtual {v0, v2}, Lcom/jieli/jl_filebrowse/bean/Folder;->isLoadFinished(Z)Z

    move-result v0

    if-nez v0, :cond_5

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " -> browseToDir add simpleFileObserver"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    new-instance v0, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity$OXO1;

    invoke-direct {v0, p0, p1, p2}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity$OXO1;-><init>(Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;Lcom/jieli/jl_filebrowse/bean/SDCardBean;Ljava/lang/String;)V

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

.method public static synthetic changeDeleteBtnText$default(Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;IILjava/lang/Object;)V
    .locals 0

    if-nez p3, :cond_1

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->changeDeleteBtnText(I)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: changeDeleteBtnText"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static final dismissLoading$lambda$0(Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;)V
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_0
    return-void
.end method

.method private final getLeftBtn()Landroid/widget/Button;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->leftBtn$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

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

.method public static synthetic i010I()Lkotlin/Unit;
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->onHandleBackPressed$lambda$0()Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic iIiiO(Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->initView$lambda$1(Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic iOO1ii1(Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->openDeleteBtn_delegate$lambda$0(Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iOOX010X()Z
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->showDeleteTipPopup$lambda$0$0()Z

    move-result v0

    return v0
.end method

.method public static synthetic iX(Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->recyclerViewTitle_delegate$lambda$0(Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final initView$lambda$0(Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;Landroid/view/View;)V
    .locals 0

    iget-boolean p1, p0, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->openDeleteType:Z

    xor-int/lit8 p1, p1, 0x1

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->openDeleteType:Z

    const/4 p1, 0x0

    iput p1, p0, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->deleteNum:I

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->allSelect(Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->changeActivityState()V

    return-void
.end method

.method private static final initView$lambda$1(Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;Landroid/view/View;)V
    .locals 0

    iget-boolean p1, p0, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->isAllSelect:Z

    xor-int/lit8 p1, p1, 0x1

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->allSelect(Z)V

    return-void
.end method

.method private static final leftBtn_delegate$lambda$0(Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;)Landroid/widget/Button;
    .locals 1

    const v0, 0x7f0a00e7

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/Button;

    return-object p0
.end method

.method private final loadMore(Lcom/jieli/jl_filebrowse/bean/SDCardBean;)V
    .locals 3

    invoke-static {}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->getInstance()Lcom/jieli/jl_filebrowse/FileBrowseManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->loadMore(Lcom/jieli/jl_filebrowse/bean/SDCardBean;)I

    move-result p1

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->TAG:Ljava/lang/String;

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

.method private static final onCancel$lambda$0$0()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method private static final onCancel$lambda$0$1(Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;)Z
    .locals 2

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->getTaskPanel()Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    const/4 p0, 0x1

    return p0
.end method

.method private static final onHandleBackPressed$lambda$0()Lkotlin/Unit;
    .locals 1

    sget-object v0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object v0
.end method

.method private static final openDeleteBtn_delegate$lambda$0(Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    const v0, 0x7f0a00e8

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private static final pbProgress_delegate$lambda$0(Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;)Landroid/widget/ProgressBar;
    .locals 1

    const v0, 0x7f0a08ff

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ProgressBar;

    return-object p0
.end method

.method private static final recyclerViewTitle_delegate$lambda$0(Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a00e9

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final rightBtn_delegate$lambda$0(Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;)Landroid/widget/Button;
    .locals 1

    const v0, 0x7f0a00ea

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/Button;

    return-object p0
.end method

.method public static synthetic showDeleteTipPopup$default(Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;IIIILjava/lang/Object;)V
    .locals 0

    if-nez p5, :cond_3

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    const p1, 0x7f141348

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    const p2, 0x7f1402d2

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    const p3, 0x7f14034b

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->showDeleteTipPopup(III)V

    return-void

    :cond_3
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: showDeleteTipPopup"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static final showDeleteTipPopup$lambda$0$0()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method private static final showDeleteTipPopup$lambda$0$1(Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;)Z
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->confirmDeleteFile()V

    const/4 p0, 0x1

    return p0
.end method

.method private final showFreeSpace()V
    .locals 9

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->getTvFreeSpace()Landroid/widget/TextView;

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

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->getTvFreeSpace()Landroid/widget/TextView;

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

.method public static synthetic showLoading$default(Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;ZILjava/lang/Object;)V
    .locals 0

    if-nez p3, :cond_1

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->showLoading(Z)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: showLoading"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static final showLoading$lambda$0(Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;Z)V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    if-nez v0, :cond_1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/uq;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/android/mltcode/paycertificationapi/uq;-><init>(Landroid/app/Activity;)V

    if-eqz p1, :cond_0

    const p1, 0x7f1414b7

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/uq;->I1(Ljava/lang/Integer;)V

    :cond_0
    iput-object v0, p0, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    :cond_1
    iget-object p0, p0, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    :cond_2
    return-void
.end method

.method private static final taskPanel_delegate$lambda$0(Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a0b76

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final tvCancel_delegate$lambda$0(Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a0c4d

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final tvFreeSpace_delegate$lambda$0(Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0c82

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final tvName_delegate$lambda$0(Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0cc7

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final tvProgressTip_delegate$lambda$0(Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0cf1

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final tvProgress_delegate$lambda$0(Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0cef

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final tvRetry_delegate$lambda$0(Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a0cfc

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final tvTotalProgress_delegate$lambda$0(Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a18a6

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method


# virtual methods
.method public final add()V
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/Ii01X1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/Ii01X1;-><init>(Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->doTransfer(Lkotlin/jvm/functions/Function0;)Z

    return-void
.end method

.method public allSelect(Z)V
    .locals 1

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->isAllSelect:Z

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->getLeftBtn()Landroid/widget/Button;

    move-result-object p1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->isAllSelect:Z

    if-eqz v0, :cond_0

    const v0, 0x7f14027f

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const v0, 0x7f141327

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final changeActivityState()V
    .locals 3

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object v0

    invoke-virtual {v0}, Lcom/angcyo/dsladapter/DslAdapter;->notifyDataChanged()V

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, v2, v0, v1}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->changeDeleteBtnText$default(Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;IILjava/lang/Object;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->getLeftBtn()Landroid/widget/Button;

    move-result-object v0

    iget-boolean v1, p0, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->openDeleteType:Z

    if-eqz v1, :cond_0

    sget-object v1, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/i72;->XOIO11O()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg1()I

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->getRightBtn()Landroid/widget/Button;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    :cond_0
    sget-object v1, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/i72;->XOIO11O()Z

    move-result v1

    const/16 v2, 0x8

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg1()I

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->getRightBtn()Landroid/widget/Button;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    :cond_1
    :goto_0
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->getOpenDeleteBtn()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    iget-boolean v1, p0, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->openDeleteType:Z

    if-eqz v1, :cond_2

    const v1, 0x7f14027f

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_2
    const v1, 0x7f1403db

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    :goto_1
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final changeDeleteBtnText(I)V
    .locals 3

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->getRightBtn()Landroid/widget/Button;

    move-result-object v0

    iget-boolean v1, p0, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->openDeleteType:Z

    if-nez v1, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->getLeftBtn()Landroid/widget/Button;

    move-result-object p1

    const/16 v1, 0x8

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    const p1, 0x7f140177

    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const v1, 0x7f140d38

    if-lez p1, :cond_1

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "("

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ")"

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_1
    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    :goto_0
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public cleanListData()V
    .locals 0

    return-void
.end method

.method public confirmDeleteFile()V
    .locals 0

    return-void
.end method

.method public deleteFilePath(Z)V
    .locals 0

    return-void
.end method

.method public final dismissLoading()V
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iII11IX1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/iII11IX1;-><init>(Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;)V

    invoke-virtual {p0, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final doTransfer(Lkotlin/jvm/functions/Function0;)Z
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

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->isTransfer:Z

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

.method public final getDeleteNum()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->deleteNum:I

    return v0
.end method

.method public getFile()V
    .locals 0

    return-void
.end method

.method public final getMAudioBookItem()Lcom/sma/smartv3/model/AudioBookItem;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->mAudioBookItem:Lcom/sma/smartv3/model/AudioBookItem;

    return-object v0
.end method

.method public final getMCurListSize()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->mCurListSize:I

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

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->mFiles:Ljava/util/List;

    return-object v0
.end method

.method public final getMLoadingPopup()Lcom/android/mltcode/paycertificationapi/uq;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    return-object v0
.end method

.method public final getMSDCardName()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->mSDCardName:Ljava/lang/String;

    return-object v0
.end method

.method public final getMTotalListSize()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->mTotalListSize:I

    return v0
.end method

.method public final getOpenDeleteBtn()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->openDeleteBtn$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method public final getOpenDeleteType()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->openDeleteType:Z

    return v0
.end method

.method public final getPbProgress()Landroid/widget/ProgressBar;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->pbProgress$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    return-object v0
.end method

.method public final getRecyclerViewTitle()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->recyclerViewTitle$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method public final getRightBtn()Landroid/widget/Button;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->rightBtn$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    return-object v0
.end method

.method public final getTaskPanel()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->taskPanel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method public final getTvCancel()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->tvCancel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method public final getTvFreeSpace()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->tvFreeSpace$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method public final getTvName()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->tvName$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method public final getTvProgress()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->tvProgress$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method public final getTvProgressTip()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->tvProgressTip$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method public final getTvRetry()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->tvRetry$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method public final getTvTotalProgress()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->tvTotalProgress$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method public init(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    sget-object p1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity$XIi00iiXO;

    invoke-virtual {p1, v0}, Lcom/szabh/smable3/component/BleConnector;->addHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    return-void
.end method

.method public initView()V
    .locals 2

    invoke-super {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->initView()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->getSDCardInfo()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->showFreeSpace()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->getOpenDeleteBtn()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/IOOII;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/IOOII;-><init>(Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->getLeftBtn()Landroid/widget/Button;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/iXI10XO;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/iXI10XO;-><init>(Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->getPbProgress()Landroid/widget/ProgressBar;

    move-result-object v0

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setMax(I)V

    return-void
.end method

.method public final isAllSelect()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->isAllSelect:Z

    return v0
.end method

.method public final isTransfer()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->isTransfer:Z

    return v0
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0034

    return v0
.end method

.method public onAudioAppOpUpdate(Lcom/szabh/smable3/entity/BleAppOp;)V
    .locals 1
    .param p1    # Lcom/szabh/smable3/entity/BleAppOp;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "appOp"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/szabh/smable3/entity/BleAppOp;->getMStatus()I

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->getTaskPanel()Landroid/view/View;

    move-result-object p1

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->getRecyclerViewTitle()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->getRightBtn()Landroid/widget/Button;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->cleanListData()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->readListData()V

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->isTransfer:Z

    :cond_0
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

    const v0, 0x7f140282

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/go0;->O1O(I)V

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

    new-instance v1, Lcom/android/mltcode/paycertificationapi/XX1O1iOIi;

    invoke-direct {v1}, Lcom/android/mltcode/paycertificationapi/XX1O1iOIi;-><init>()V

    invoke-virtual {p1, v0, v1}, Lcom/android/mltcode/paycertificationapi/go0;->iX1O1(Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/X1I0Xi1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/X1I0Xi1;-><init>(Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;)V

    const v1, 0x7f14034b

    invoke-virtual {p1, v1, v0}, Lcom/android/mltcode/paycertificationapi/go0;->X1IX(ILkotlin/jvm/functions/Function0;)V

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    return-void
.end method

.method public onDestroy()V
    .locals 2

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity$XIi00iiXO;

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/component/BleConnector;->removeHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onDestroy()V

    return-void
.end method

.method public onHandleBackPressed()V
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OOIIiO;

    invoke-direct {v0}, Lcom/android/mltcode/paycertificationapi/OOIIiO;-><init>()V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->doTransfer(Lkotlin/jvm/functions/Function0;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onHandleBackPressed()V

    :cond_0
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

.method public readListData()V
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

.method public final setAllSelect(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->isAllSelect:Z

    return-void
.end method

.method public final setDeleteNum(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->deleteNum:I

    return-void
.end method

.method public final setMAudioBookItem(Lcom/sma/smartv3/model/AudioBookItem;)V
    .locals 0
    .param p1    # Lcom/sma/smartv3/model/AudioBookItem;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->mAudioBookItem:Lcom/sma/smartv3/model/AudioBookItem;

    return-void
.end method

.method public final setMCurListSize(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->mCurListSize:I

    return-void
.end method

.method public final setMLoadingPopup(Lcom/android/mltcode/paycertificationapi/uq;)V
    .locals 0
    .param p1    # Lcom/android/mltcode/paycertificationapi/uq;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    return-void
.end method

.method public final setMSDCardName(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->mSDCardName:Ljava/lang/String;

    return-void
.end method

.method public final setMTotalListSize(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->mTotalListSize:I

    return-void
.end method

.method public final setOpenDeleteType(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->openDeleteType:Z

    return-void
.end method

.method public final setTransfer(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->isTransfer:Z

    return-void
.end method

.method public final showDeleteTipPopup(III)V
    .locals 4

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->mDeleteTipPopup:Lcom/android/mltcode/paycertificationapi/go0;

    if-nez v0, :cond_0

    new-instance v0, Lcom/android/mltcode/paycertificationapi/go0;

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, p0, v3, v1, v2}, Lcom/android/mltcode/paycertificationapi/go0;-><init>(Landroid/app/Activity;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/go0;->O1O(I)V

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/go0;->iX(Ljava/lang/Integer;)V

    const/4 p1, 0x1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/go0;->IXXOO(Ljava/lang/Integer;)V

    const p1, 0x7f14027f

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    new-instance p2, Lcom/android/mltcode/paycertificationapi/OO1i00110;

    invoke-direct {p2}, Lcom/android/mltcode/paycertificationapi/OO1i00110;-><init>()V

    invoke-virtual {v0, p1, p2}, Lcom/android/mltcode/paycertificationapi/go0;->iX1O1(Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;)V

    new-instance p1, Lcom/android/mltcode/paycertificationapi/XiOXIi11I;

    invoke-direct {p1, p0}, Lcom/android/mltcode/paycertificationapi/XiOXIi11I;-><init>(Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;)V

    invoke-virtual {v0, p3, p1}, Lcom/android/mltcode/paycertificationapi/go0;->X1IX(ILkotlin/jvm/functions/Function0;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->mDeleteTipPopup:Lcom/android/mltcode/paycertificationapi/go0;

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->mDeleteTipPopup:Lcom/android/mltcode/paycertificationapi/go0;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    :cond_1
    return-void
.end method

.method public showList()V
    .locals 0

    return-void
.end method

.method public final showLoading(Z)V
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IOi10i;

    invoke-direct {v0, p0, p1}, Lcom/android/mltcode/paycertificationapi/IOi10i;-><init>(Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;Z)V

    invoke-virtual {p0, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public upListData(Lcom/szabh/smable3/entity/BleAppAudioBookList;)V
    .locals 1
    .param p1    # Lcom/szabh/smable3/entity/BleAppAudioBookList;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "filePath"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
