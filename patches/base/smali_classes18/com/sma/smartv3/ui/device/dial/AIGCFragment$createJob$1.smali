.class public final Lcom/sma/smartv3/ui/device/dial/AIGCFragment$createJob$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/O1XIiIO;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/dial/AIGCFragment;->createJob(Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/android/mltcode/paycertificationapi/O1XIiIO<",
        "Lcom/sma/smartv3/model/JobInfo;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/device/dial/AIGCFragment;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/dial/AIGCFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/dial/AIGCFragment$createJob$1;->OXO1:Lcom/sma/smartv3/ui/device/dial/AIGCFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Lcom/sma/smartv3/model/JobInfo;)V
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "createJob -> "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    if-eqz p1, :cond_1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dial/AIGCFragment$createJob$1;->OXO1:Lcom/sma/smartv3/ui/device/dial/AIGCFragment;

    invoke-virtual {p1}, Lcom/sma/smartv3/model/JobInfo;->getJobId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/ui/device/dial/AIGCFragment;->setMJobId(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/dial/AIGCFragment$createJob$1;->OXO1:Lcom/sma/smartv3/ui/device/dial/AIGCFragment;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/dial/AIGCFragment;->getMJobId()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/dial/AIGCFragment$createJob$1;->OXO1:Lcom/sma/smartv3/ui/device/dial/AIGCFragment;

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/device/dial/AIGCFragment;->getMJobId()Ljava/lang/String;

    move-result-object v1

    const-string v2, "AIGC_JOBID"

    invoke-virtual {p1, v2, v1}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/dial/AIGCFragment$createJob$1;->OXO1:Lcom/sma/smartv3/ui/device/dial/AIGCFragment;

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/ui/device/dial/AIGCFragment;->setFindJobNumber(I)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/dial/AIGCFragment$createJob$1;->OXO1:Lcom/sma/smartv3/ui/device/dial/AIGCFragment;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/dial/AIGCFragment;->getMJobId()Ljava/lang/String;

    move-result-object v0

    const-string v1, "<get-mJobId>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/ui/device/dial/AIGCFragment;->findJob(Ljava/lang/String;)V

    return-void

    :cond_0
    const-string p1, "createJob -> error: jobId = null "

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/dial/AIGCFragment$createJob$1;->OXO1:Lcom/sma/smartv3/ui/device/dial/AIGCFragment;

    invoke-static {p1}, Lcom/sma/smartv3/ui/device/dial/AIGCFragment;->access$dismissLoadPopup(Lcom/sma/smartv3/ui/device/dial/AIGCFragment;)V

    const-string p1, "error: jobId = null"

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public handleError(Ljava/lang/String;)V
    .locals 2

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "createJob -> error = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dial/AIGCFragment$createJob$1;->OXO1:Lcom/sma/smartv3/ui/device/dial/AIGCFragment;

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/dial/AIGCFragment;->access$dismissLoadPopup(Lcom/sma/smartv3/ui/device/dial/AIGCFragment;)V

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic handleResponse(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/sma/smartv3/model/JobInfo;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/dial/AIGCFragment$createJob$1;->OXO1(Lcom/sma/smartv3/model/JobInfo;)V

    return-void
.end method
