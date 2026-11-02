.class Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback<",
        "Lcom/jieli/jl_rcsp/model/command/ReadErrorMsgCmd$ReadErrorMsgResponse;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask$1;->a:Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailed(Lcom/jieli/jl_rcsp/model/base/BaseError;)V
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask$1;->a:Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/base/BaseError;->getSubCode()I

    move-result v1

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/base/BaseError;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, v1, p1}, Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;->a(Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;ILjava/lang/String;)V

    return-void
.end method

.method public onSuccess(Lcom/jieli/jl_rcsp/model/command/ReadErrorMsgCmd$ReadErrorMsgResponse;)V
    .locals 3

    if-nez p1, :cond_0

    .line 2
    new-instance p1, Lcom/jieli/jl_rcsp/model/base/BaseError;

    const/16 v0, 0x3001

    invoke-static {v0}, Lcom/jieli/jl_rcsp/constant/WatchError;->getErrorDesc(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Lcom/jieli/jl_rcsp/model/base/BaseError;-><init>(ILjava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask$1;->onFailed(Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    return-void

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask$1;->a:Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;

    invoke-static {v0, p1}, Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;->a(Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;Lcom/jieli/jl_rcsp/model/command/ReadErrorMsgCmd$ReadErrorMsgResponse;)V

    .line 4
    iget-object p1, p0, Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask$1;->a:Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;->a(Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;)Lcom/jieli/jl_rcsp/model/command/ReadErrorMsgCmd$ReadErrorMsgResponse;

    move-result-object p1

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/command/ReadErrorMsgCmd$ReadErrorMsgResponse;->getSize()I

    move-result p1

    if-gtz p1, :cond_1

    .line 5
    iget-object p1, p0, Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask$1;->a:Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;->b(Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Device has no abnormal information. file size = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask$1;->a:Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;

    invoke-static {v1}, Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;->a(Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;)Lcom/jieli/jl_rcsp/model/command/ReadErrorMsgCmd$ReadErrorMsgResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/jieli/jl_rcsp/model/command/ReadErrorMsgCmd$ReadErrorMsgResponse;->getSize()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "startReadLogcat"

    invoke-static {p1, v1, v0}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    iget-object p1, p0, Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask$1;->a:Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;->c(Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;)V

    return-void

    .line 7
    :cond_1
    iget-object p1, p0, Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask$1;->a:Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;->d(Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;)Landroid/os/Handler;

    move-result-object p1

    const/16 v0, 0x1016

    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeMessages(I)V

    .line 8
    iget-object p1, p0, Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask$1;->a:Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;->d(Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;)Landroid/os/Handler;

    move-result-object p1

    sget v1, Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;->WAIT_CMD_TIMEOUT:I

    int-to-long v1, v1

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/jieli/jl_rcsp/model/command/ReadErrorMsgCmd$ReadErrorMsgResponse;

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask$1;->onSuccess(Lcom/jieli/jl_rcsp/model/command/ReadErrorMsgCmd$ReadErrorMsgResponse;)V

    return-void
.end method
