.class public Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;
.super Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;
.source "SourceFile"


# instance fields
.field private final TAG:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private isNeedToDownloadFile:Z

.field private isSync:Z

.field private final loadTimeOut:I

.field private mDeleteTipPopup:Lcom/android/mltcode/paycertificationapi/go0;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
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

.field private final mFileObserver:Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment$XO0O10;
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

.field private mHandler111:Landroid/os/Handler;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mProgressPop:Lcom/android/mltcode/paycertificationapi/c72;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mSDCardBean:Lcom/jieli/jl_filebrowse/bean/SDCardBean;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private myTask:Ljava/lang/Runnable;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private onFileReceiverSize:I

.field private progress1111:I

.field private retryFrequency:I


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->mFiles:Ljava/util/List;

    const-string v0, "BaseJLFileManageActivity"

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->TAG:Ljava/lang/String;

    const/16 v0, 0xff

    iput v0, p0, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->loadTimeOut:I

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    new-instance v2, Lcom/android/mltcode/paycertificationapi/OOX1;

    invoke-direct {v2, p0}, Lcom/android/mltcode/paycertificationapi/OOX1;-><init>(Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;)V

    invoke-direct {v0, v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->mHandler:Landroid/os/Handler;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/X1iiOOi;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/X1iiOOi;-><init>(Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->mDeviceFileCallback$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment$XO0O10;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment$XO0O10;-><init>(Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->mFileObserver:Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment$XO0O10;

    new-instance v0, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment$O00;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment$O00;-><init>(Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->myTask:Ljava/lang/Runnable;

    return-void
.end method

.method public static synthetic I0IIOi(Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;Landroid/os/Message;)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->mHandler$lambda$0(Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;Landroid/os/Message;)Z

    move-result p0

    return p0
.end method

.method public static synthetic IiI10X(Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;)Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment$iO;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->mDeviceFileCallback_delegate$lambda$0(Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;)Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment$iO;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O00()Z
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->showErrorPop$lambda$0$0()Z

    move-result v0

    return v0
.end method

.method public static synthetic OIi0(Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;Lcom/android/mltcode/paycertificationapi/go0;)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->showErrorPop$lambda$0$1(Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;Lcom/android/mltcode/paycertificationapi/go0;)Z

    move-result p0

    return p0
.end method

.method public static synthetic XO0O10(Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;)Z
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->showDeleteTipPopup$lambda$0$1(Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;)Z

    move-result p0

    return p0
.end method

.method public static synthetic XOO0ii0()Z
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->showDeleteTipPopup$lambda$0$0()Z

    move-result v0

    return v0
.end method

.method public static final synthetic access$browToDir(Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;Lcom/jieli/jl_filebrowse/bean/SDCardBean;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->browToDir(Lcom/jieli/jl_filebrowse/bean/SDCardBean;Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic access$dismissLoadPopup(Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->dismissLoadPopup()V

    return-void
.end method

.method public static final synthetic access$getCurrentInfo(Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;Lcom/jieli/jl_filebrowse/bean/SDCardBean;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->getCurrentInfo(Lcom/jieli/jl_filebrowse/bean/SDCardBean;)V

    return-void
.end method

.method public static final synthetic access$getMHandler111$p(Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->mHandler111:Landroid/os/Handler;

    return-object p0
.end method

.method public static final synthetic access$getTAG$p(Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->TAG:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic access$loadMore(Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;Lcom/jieli/jl_filebrowse/bean/SDCardBean;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->loadMore(Lcom/jieli/jl_filebrowse/bean/SDCardBean;)V

    return-void
.end method

.method public static final synthetic access$refreshTaskPanel(Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->refreshTaskPanel(II)V

    return-void
.end method

.method private static final add$lambda$0(Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;)Lkotlin/Unit;
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->getFile()V

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

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->TAG:Ljava/lang/String;

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
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->mFiles:Ljava/util/List;

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

    invoke-direct {p0, p1, v3}, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->append(Lcom/jieli/jl_filebrowse/bean/SDCardBean;Lcom/jieli/jl_filebrowse/bean/FileStruct;)V

    return-void

    :cond_4
    invoke-virtual {v0, v2}, Lcom/jieli/jl_filebrowse/bean/Folder;->isLoadFinished(Z)Z

    move-result v0

    if-nez v0, :cond_5

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " -> browseToDir add simpleFileObserver"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    new-instance v0, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment$OXO1;

    invoke-direct {v0, p0, p1, p2}, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment$OXO1;-><init>(Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;Lcom/jieli/jl_filebrowse/bean/SDCardBean;Ljava/lang/String;)V

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

.method private final dismissLoadPopup()V
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_0
    return-void
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

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->TAG:Ljava/lang/String;

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

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->loadMore(Lcom/jieli/jl_filebrowse/bean/SDCardBean;)V

    return-void

    :cond_1
    invoke-virtual {v0, v1}, Lcom/jieli/jl_filebrowse/bean/Folder;->isLoadFinished(Z)Z

    return-void

    :cond_2
    invoke-direct {p0, p1, v2}, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->browToDir(Lcom/jieli/jl_filebrowse/bean/SDCardBean;Ljava/lang/String;)V

    return-void
.end method

.method private final getMDeviceFileCallback()Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment$iO;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->mDeviceFileCallback$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment$iO;

    return-object v0
.end method

.method public static synthetic iO(Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->add$lambda$0(Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private final loadMore(Lcom/jieli/jl_filebrowse/bean/SDCardBean;)V
    .locals 3

    invoke-static {}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->getInstance()Lcom/jieli/jl_filebrowse/FileBrowseManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->loadMore(Lcom/jieli/jl_filebrowse/bean/SDCardBean;)I

    move-result p1

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->TAG:Ljava/lang/String;

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

.method private static final mDeviceFileCallback_delegate$lambda$0(Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;)Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment$iO;
    .locals 1

    new-instance v0, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment$iO;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment$iO;-><init>(Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;)V

    return-object v0
.end method

.method private static final mHandler$lambda$0(Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;Landroid/os/Message;)Z
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget p1, p1, Landroid/os/Message;->what:I

    iget v0, p0, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->loadTimeOut:I

    if-ne p1, v0, :cond_1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->dismissLoadPopup()V

    sget-object p1, Lcom/sma/smartv3/ui/device/XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/XIi00iiXO;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/XIi00iiXO;->I1()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->showErrorPop()V

    :cond_0
    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->TAG:Ljava/lang/String;

    iget p0, p0, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->retryFrequency:I

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

.method private final refreshTaskPanel(II)V
    .locals 0

    return-void
.end method

.method public static synthetic showDeleteTipPopup$default(Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;IIIILjava/lang/Object;)V
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
    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->showDeleteTipPopup(III)V

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

.method private static final showDeleteTipPopup$lambda$0$1(Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;)Z
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->confirmDeleteFile()V

    const/4 p0, 0x1

    return p0
.end method

.method private final showErrorPop()V
    .locals 5

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->mErrorPopup:Lcom/android/mltcode/paycertificationapi/go0;

    if-nez v0, :cond_0

    new-instance v0, Lcom/android/mltcode/paycertificationapi/go0;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

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

    new-instance v2, Lcom/android/mltcode/paycertificationapi/IOII1i0;

    invoke-direct {v2}, Lcom/android/mltcode/paycertificationapi/IOII1i0;-><init>()V

    invoke-virtual {v0, v1, v2}, Lcom/android/mltcode/paycertificationapi/go0;->iX1O1(Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/O0I11X;

    invoke-direct {v1, p0, v0}, Lcom/android/mltcode/paycertificationapi/O0I11X;-><init>(Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;Lcom/android/mltcode/paycertificationapi/go0;)V

    const v2, 0x7f14034b

    invoke-virtual {v0, v2, v1}, Lcom/android/mltcode/paycertificationapi/go0;->X1IX(ILkotlin/jvm/functions/Function0;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->mErrorPopup:Lcom/android/mltcode/paycertificationapi/go0;

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->mErrorPopup:Lcom/android/mltcode/paycertificationapi/go0;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    return-void

    :cond_1
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->mErrorPopup:Lcom/android/mltcode/paycertificationapi/go0;

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

.method private static final showErrorPop$lambda$0$1(Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;Lcom/android/mltcode/paycertificationapi/go0;)Z
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {p0, v1, v2, v0}, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->showLoadPopup$default(Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;ZILjava/lang/Object;)V

    iget v0, p0, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->retryFrequency:I

    add-int/2addr v0, v2

    iput v0, p0, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->retryFrequency:I

    const/4 v3, 0x2

    if-le v0, v3, :cond_0

    iput v1, p0, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->retryFrequency:I

    invoke-static {}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->getInstance()Lcom/jieli/jl_filebrowse/FileBrowseManager;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->mFileObserver:Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment$XO0O10;

    invoke-virtual {v0, v1}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->removeFileObserver(Lcom/jieli/jl_filebrowse/interfaces/FileObserver;)V

    sget-object v0, Lcom/sma/smartv3/ui/device/XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/XIi00iiXO;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/XIi00iiXO;->XiOIO()V

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->XO0O10()Landroid/app/Activity;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object p1

    const-string v1, "getApplication(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/ui/device/XIi00iiXO;->OX(Landroid/app/Application;)V

    invoke-static {}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->getInstance()Lcom/jieli/jl_filebrowse/FileBrowseManager;

    move-result-object p1

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->mFileObserver:Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment$XO0O10;

    invoke-virtual {p1, p0}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->addFileObserver(Lcom/jieli/jl_filebrowse/interfaces/FileObserver;)V

    :cond_0
    sget-object p0, Lcom/sma/smartv3/ui/device/XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/XIi00iiXO;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/XIi00iiXO;->X0O()V

    return v2
.end method

.method public static synthetic showLoadPopup$default(Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;ZILjava/lang/Object;)V
    .locals 0

    if-nez p3, :cond_1

    const/4 p3, 0x1

    and-int/2addr p2, p3

    if-eqz p2, :cond_0

    move p1, p3

    :cond_0
    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->showLoadPopup(Z)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: showLoadPopup"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic syncFailed$default(Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;IILjava/lang/Object;)V
    .locals 0

    if-nez p3, :cond_1

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->syncFailed(I)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: syncFailed"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic syncProgress$default(Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;FFILjava/lang/Object;)V
    .locals 0

    if-nez p4, :cond_2

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    const/high16 p2, 0x42c80000    # 100.0f

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->syncProgress(FF)V

    return-void

    :cond_2
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: syncProgress"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final add()V
    .locals 1

    sget-object v0, Lcom/sma/smartv3/ui/device/XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/XIi00iiXO;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/XIi00iiXO;->I1()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->showErrorPop()V

    return-void

    :cond_0
    new-instance v0, Lcom/android/mltcode/paycertificationapi/XIi1i1XI1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/XIi1i1XI1;-><init>(Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->doTransfer(Lkotlin/jvm/functions/Function0;)Z

    return-void
.end method

.method public confirmDeleteFile()V
    .locals 0

    return-void
.end method

.method public final deleteFile(I)V
    .locals 6

    invoke-static {}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->getInstance()Lcom/jieli/jl_filebrowse/FileBrowseManager;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->mSDCardBean:Lcom/jieli/jl_filebrowse/bean/SDCardBean;

    const/4 v2, 0x1

    new-array v3, v2, [Lcom/jieli/jl_filebrowse/bean/FileStruct;

    iget-object v4, p0, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->mFiles:Ljava/util/List;

    invoke-interface {v4, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-static {v3}, Lkotlin/collections/CollectionsKt__CollectionsKt;->Ii1iii0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    iget-object v4, p0, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->mSDCardBean:Lcom/jieli/jl_filebrowse/bean/SDCardBean;

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
    new-instance v4, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment$XIi00iiXO;

    invoke-direct {v4, p0, p1}, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment$XIi00iiXO;-><init>(Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;I)V

    invoke-virtual {v0, v1, v3, v2, v4}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->deleteFile(Lcom/jieli/jl_filebrowse/bean/SDCardBean;Ljava/util/List;ZLcom/jieli/jl_filebrowse/interfaces/DeleteCallback;)I

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

    sget-object v0, Lcom/sma/smartv3/ui/device/XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/XIi00iiXO;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/XIi00iiXO;->X01IiOiIi()Z

    move-result v0

    if-eqz v0, :cond_0

    const p1, 0x7f1413a9

    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

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

.method public getFile()V
    .locals 0

    return-void
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

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->mFiles:Ljava/util/List;

    return-object v0
.end method

.method public final getMProgressPop()Lcom/android/mltcode/paycertificationapi/c72;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->mProgressPop:Lcom/android/mltcode/paycertificationapi/c72;

    return-object v0
.end method

.method public final getMSDCardBean()Lcom/jieli/jl_filebrowse/bean/SDCardBean;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->mSDCardBean:Lcom/jieli/jl_filebrowse/bean/SDCardBean;

    return-object v0
.end method

.method public final getMyTask()Ljava/lang/Runnable;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->myTask:Ljava/lang/Runnable;

    return-object v0
.end method

.method public final getOnFileReceiverSize()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->onFileReceiverSize:I

    return v0
.end method

.method public final getProgress1111()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->progress1111:I

    return v0
.end method

.method public final getRetryFrequency()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->retryFrequency:I

    return v0
.end method

.method public init(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    return-void
.end method

.method public initEvent()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final isNeedToDownloadFile()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->isNeedToDownloadFile:Z

    return v0
.end method

.method public final isSync()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->isSync:Z

    return v0
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0033

    return v0
.end method

.method public onDestroy()V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->mHandler:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    invoke-static {}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->getInstance()Lcom/jieli/jl_filebrowse/FileBrowseManager;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->mFileObserver:Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment$XO0O10;

    invoke-virtual {v0, v1}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->removeFileObserver(Lcom/jieli/jl_filebrowse/interfaces/FileObserver;)V

    sget-object v0, Lcom/sma/smartv3/ui/device/XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/XIi00iiXO;

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->getMDeviceFileCallback()Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment$iO;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/ui/device/XIi00iiXO;->iOO1ii1(Lcom/sma/smartv3/ui/device/XIi00iiXO$OXO1;)V

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/XIi00iiXO;->XiOIO()V

    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->onDestroy()V

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

.method public final setMProgressPop(Lcom/android/mltcode/paycertificationapi/c72;)V
    .locals 0
    .param p1    # Lcom/android/mltcode/paycertificationapi/c72;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->mProgressPop:Lcom/android/mltcode/paycertificationapi/c72;

    return-void
.end method

.method public final setMSDCardBean(Lcom/jieli/jl_filebrowse/bean/SDCardBean;)V
    .locals 0
    .param p1    # Lcom/jieli/jl_filebrowse/bean/SDCardBean;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->mSDCardBean:Lcom/jieli/jl_filebrowse/bean/SDCardBean;

    return-void
.end method

.method public final setMyTask(Ljava/lang/Runnable;)V
    .locals 1
    .param p1    # Ljava/lang/Runnable;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->myTask:Ljava/lang/Runnable;

    return-void
.end method

.method public final setNeedToDownloadFile(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->isNeedToDownloadFile:Z

    return-void
.end method

.method public final setOnFileReceiverSize(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->onFileReceiverSize:I

    return-void
.end method

.method public final setProgress1111(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->progress1111:I

    return-void
.end method

.method public final setRetryFrequency(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->retryFrequency:I

    return-void
.end method

.method public final setSync(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->isSync:Z

    return-void
.end method

.method public final showDeleteTipPopup(III)V
    .locals 5

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->mDeleteTipPopup:Lcom/android/mltcode/paycertificationapi/go0;

    if-nez v0, :cond_0

    new-instance v0, Lcom/android/mltcode/paycertificationapi/go0;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v0, v1, v4, v2, v3}, Lcom/android/mltcode/paycertificationapi/go0;-><init>(Landroid/app/Activity;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    new-instance p2, Lcom/android/mltcode/paycertificationapi/OX00XI;

    invoke-direct {p2}, Lcom/android/mltcode/paycertificationapi/OX00XI;-><init>()V

    invoke-virtual {v0, p1, p2}, Lcom/android/mltcode/paycertificationapi/go0;->iX1O1(Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;)V

    new-instance p1, Lcom/android/mltcode/paycertificationapi/XXiIO0;

    invoke-direct {p1, p0}, Lcom/android/mltcode/paycertificationapi/XXiIO0;-><init>(Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;)V

    invoke-virtual {v0, p3, p1}, Lcom/android/mltcode/paycertificationapi/go0;->X1IX(ILkotlin/jvm/functions/Function0;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->mDeleteTipPopup:Lcom/android/mltcode/paycertificationapi/go0;

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->mDeleteTipPopup:Lcom/android/mltcode/paycertificationapi/go0;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    :cond_1
    return-void
.end method

.method public final showInstallingPopup()V
    .locals 4

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->syncData()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->mHandler111:Landroid/os/Handler;

    if-nez v0, :cond_0

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->mHandler111:Landroid/os/Handler;

    :cond_0
    const/4 v0, 0x0

    iput v0, p0, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->progress1111:I

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->mHandler111:Landroid/os/Handler;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->myTask:Ljava/lang/Runnable;

    const-wide/16 v2, 0x32

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_1
    return-void
.end method

.method public showList()V
    .locals 5

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->mFiles:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->mFiles:Ljava/util/List;

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

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->mHandler:Landroid/os/Handler;

    iget v1, p0, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->loadTimeOut:I

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->dismissLoadPopup()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->mErrorPopup:Lcom/android/mltcode/paycertificationapi/go0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_0
    return-void
.end method

.method public final showLoadPopup(Z)V
    .locals 3

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    if-nez v0, :cond_0

    new-instance v0, Lcom/android/mltcode/paycertificationapi/uq;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/android/mltcode/paycertificationapi/uq;-><init>(Landroid/app/Activity;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    if-eqz v0, :cond_2

    if-eqz p1, :cond_1

    const p1, 0x7f140fc4

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/uq;->X01IiOiIi(I)V

    const p1, 0x7f140fc3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/uq;->I1(Ljava/lang/Integer;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->mHandler:Landroid/os/Handler;

    iget v0, p0, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->loadTimeOut:I

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
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    :cond_3
    return-void
.end method

.method public final syncData()V
    .locals 5

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->mProgressPop:Lcom/android/mltcode/paycertificationapi/c72;

    if-nez v0, :cond_1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/c72;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v1

    const-string v2, "requireActivity(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v0, v1, v3, v2, v4}, Lcom/android/mltcode/paycertificationapi/c72;-><init>(Landroid/app/Activity;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v1, 0x7f14014c

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/c72;->I1(I)V

    invoke-virtual {v0, v3}, Lcom/android/mltcode/paycertificationapi/c72;->OX(I)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->mProgressPop:Lcom/android/mltcode/paycertificationapi/c72;

    invoke-virtual {v0, v3}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->I0iXXO(Z)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->mProgressPop:Lcom/android/mltcode/paycertificationapi/c72;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    :cond_0
    const/4 v0, 0x3

    const/4 v1, 0x0

    invoke-static {p0, v1, v1, v0, v4}, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->syncProgress$default(Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;FFILjava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public final syncFailed(I)V
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->mProgressPop:Lcom/android/mltcode/paycertificationapi/c72;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->mProgressPop:Lcom/android/mltcode/paycertificationapi/c72;

    sget-object v0, Lcom/android/mltcode/paycertificationapi/OOX00;->OXO1:Lcom/android/mltcode/paycertificationapi/OOX00;

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/OOX00;->iO(I)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public final syncProgress(FF)V
    .locals 3

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->mProgressPop:Lcom/android/mltcode/paycertificationapi/c72;

    if-eqz v0, :cond_0

    div-float v1, p1, p2

    const/16 v2, 0x64

    int-to-float v2, v2

    mul-float/2addr v1, v2

    float-to-int v1, v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/c72;->OX(I)V

    :cond_0
    cmpg-float v0, p2, p1

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->mProgressPop:Lcom/android/mltcode/paycertificationapi/c72;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_1
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->mProgressPop:Lcom/android/mltcode/paycertificationapi/c72;

    sget-object v1, Lcom/sma/smartv3/initializer/BleInitializer;->IO:Lcom/sma/smartv3/initializer/BleInitializer;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/sma/smartv3/initializer/BleInitializer;->I1Ii(Z)V

    iput-boolean v2, p0, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->isSync:Z

    const/4 v1, 0x0

    cmpg-float p1, p1, v1

    const/4 v2, 0x2

    if-nez p1, :cond_2

    cmpg-float p1, p2, v1

    if-nez p1, :cond_2

    const-string p1, "add_app_store_error"

    invoke-static {p1, v0, v2, v0}, Lcom/android/mltcode/paycertificationapi/I01XX0;->XIi00iiXO(Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void

    :cond_2
    const-string p1, "add_app_store_success"

    invoke-static {p1, v0, v2, v0}, Lcom/android/mltcode/paycertificationapi/I01XX0;->XIi00iiXO(Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    :cond_3
    return-void
.end method

.method public taskProgress()V
    .locals 2

    iget v0, p0, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->progress1111:I

    int-to-float v0, v0

    const/high16 v1, 0x42c80000    # 100.0f

    invoke-virtual {p0, v0, v1}, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->syncProgress(FF)V

    iget v0, p0, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->progress1111:I

    const/16 v1, 0x64

    if-le v0, v1, :cond_2

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->mProgressPop:Lcom/android/mltcode/paycertificationapi/c72;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->mHandler111:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    :cond_1
    iput-object v1, p0, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->mHandler111:Landroid/os/Handler;

    :cond_2
    return-void
.end method
