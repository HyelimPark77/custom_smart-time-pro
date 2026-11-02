.class public final Lcom/sma/smartv3/ui/device/dial/AIGCFragment$findJob$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/O1XIiIO;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/dial/AIGCFragment;->findJob(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/android/mltcode/paycertificationapi/O1XIiIO<",
        "Lcom/sma/smartv3/model/JobDetail;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/device/dial/AIGCFragment;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/dial/AIGCFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/dial/AIGCFragment$findJob$1;->OXO1:Lcom/sma/smartv3/ui/device/dial/AIGCFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic OXO1(Lcom/sma/smartv3/ui/device/dial/AIGCFragment;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/dial/AIGCFragment$findJob$1;->iO(Lcom/sma/smartv3/ui/device/dial/AIGCFragment;)V

    return-void
.end method

.method public static final iO(Lcom/sma/smartv3/ui/device/dial/AIGCFragment;)V
    .locals 2

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dial/AIGCFragment;->getFindJobNumber()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/device/dial/AIGCFragment;->setFindJobNumber(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dial/AIGCFragment;->getFindJobNumber()I

    move-result v0

    const/16 v1, 0x14

    if-ge v0, v1, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dial/AIGCFragment;->getMJobId()Ljava/lang/String;

    move-result-object v0

    const-string v1, "<get-mJobId>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/device/dial/AIGCFragment;->findJob(Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-static {p0}, Lcom/sma/smartv3/ui/device/dial/AIGCFragment;->access$dismissLoadPopup(Lcom/sma/smartv3/ui/device/dial/AIGCFragment;)V

    const p0, 0x7f141196

    invoke-static {p0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    return-void
.end method


# virtual methods
.method public XIi00iiXO(Lcom/sma/smartv3/model/JobDetail;)V
    .locals 4

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dial/AIGCFragment$findJob$1;->OXO1:Lcom/sma/smartv3/ui/device/dial/AIGCFragment;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/dial/AIGCFragment;->getFindJobNumber()I

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "findJobNumber = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " findJob -> "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/sma/smartv3/model/JobDetail;->getJobStatus()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dial/AIGCFragment$findJob$1;->OXO1:Lcom/sma/smartv3/ui/device/dial/AIGCFragment;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/IOIi00;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/IOIi00;-><init>(Lcom/sma/smartv3/ui/device/dial/AIGCFragment;)V

    const-wide/16 v2, 0xbb8

    invoke-virtual {p1, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dial/AIGCFragment$findJob$1;->OXO1:Lcom/sma/smartv3/ui/device/dial/AIGCFragment;

    invoke-virtual {p1}, Lcom/sma/smartv3/model/JobDetail;->getImages()[Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/sma/smartv3/model/JobDetail;->getImageSign()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lcom/sma/smartv3/ui/device/dial/AIGCFragment;->showPics([Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dial/AIGCFragment$findJob$1;->OXO1:Lcom/sma/smartv3/ui/device/dial/AIGCFragment;

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/dial/AIGCFragment;->access$dismissLoadPopup(Lcom/sma/smartv3/ui/device/dial/AIGCFragment;)V

    invoke-virtual {p1}, Lcom/sma/smartv3/model/JobDetail;->getJobErrCode()I

    move-result v0

    invoke-virtual {p1}, Lcom/sma/smartv3/model/JobDetail;->getJobErrMsg()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " = "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_2
    return-void
.end method

.method public handleError(Ljava/lang/String;)V
    .locals 2

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "findJob -> error = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dial/AIGCFragment$findJob$1;->OXO1:Lcom/sma/smartv3/ui/device/dial/AIGCFragment;

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/dial/AIGCFragment;->access$dismissLoadPopup(Lcom/sma/smartv3/ui/device/dial/AIGCFragment;)V

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic handleResponse(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/sma/smartv3/model/JobDetail;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/dial/AIGCFragment$findJob$1;->XIi00iiXO(Lcom/sma/smartv3/model/JobDetail;)V

    return-void
.end method
