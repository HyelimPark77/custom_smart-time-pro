.class public Lcom/jieli/jl_rcsp/task/format/FormatTask;
.super Lcom/jieli/jl_rcsp/task/TaskBase;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jieli/jl_rcsp/task/format/FormatTask$NextListener;,
        Lcom/jieli/jl_rcsp/task/format/FormatTask$ErrorStopListener;,
        Lcom/jieli/jl_rcsp/task/format/FormatTask$AddTaskListener;
    }
.end annotation


# instance fields
.field public final b:Landroid/content/Context;

.field public final c:Lcom/jieli/jl_filebrowse/bean/SDCardBean;

.field public final d:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue<",
            "Lcom/jieli/jl_rcsp/task/ITask;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;Landroid/content/Context;Lcom/jieli/jl_filebrowse/bean/SDCardBean;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/RuntimeException;
        }
    .end annotation

    invoke-direct {p0, p1}, Lcom/jieli/jl_rcsp/task/TaskBase;-><init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;)V

    new-instance p1, Ljava/util/concurrent/ArrayBlockingQueue;

    const/4 v0, 0x6

    invoke-direct {p1, v0}, Ljava/util/concurrent/ArrayBlockingQueue;-><init>(I)V

    iput-object p1, p0, Lcom/jieli/jl_rcsp/task/format/FormatTask;->d:Ljava/util/Queue;

    if-eqz p2, :cond_1

    if-eqz p3, :cond_0

    iput-object p2, p0, Lcom/jieli/jl_rcsp/task/format/FormatTask;->b:Landroid/content/Context;

    iput-object p3, p0, Lcom/jieli/jl_rcsp/task/format/FormatTask;->c:Lcom/jieli/jl_filebrowse/bean/SDCardBean;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "Device storage can not be null."

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "Context can not be null."

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/task/format/FormatTask;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->tag:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/task/format/FormatTask;ILjava/lang/String;)V
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/task/TaskBase;->callbackError(ILjava/lang/String;)V

    return-void
.end method

.method public static synthetic b(Lcom/jieli/jl_rcsp/task/format/FormatTask;)Ljava/util/Queue;
    .locals 0

    iget-object p0, p0, Lcom/jieli/jl_rcsp/task/format/FormatTask;->d:Ljava/util/Queue;

    return-object p0
.end method

.method public static synthetic c(Lcom/jieli/jl_rcsp/task/format/FormatTask;)V
    .locals 0

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/format/FormatTask;->a()V

    return-void
.end method

.method public static synthetic d(Lcom/jieli/jl_rcsp/task/format/FormatTask;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->tag:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic e(Lcom/jieli/jl_rcsp/task/format/FormatTask;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->tag:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public final a()V
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/format/FormatTask;->d:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/jieli/jl_rcsp/task/ITask;

    if-eqz v0, :cond_0

    .line 4
    invoke-interface {v0}, Lcom/jieli/jl_rcsp/task/ITask;->start()V

    .line 5
    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/format/FormatTask;->d:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    return-void

    .line 6
    :cond_0
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TaskBase;->callbackFinish()V

    return-void
.end method

.method public cancel(B)V
    .locals 1

    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "can not cancel"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public start()V
    .locals 12

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TaskBase;->callbackBegin()V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/format/FormatTask;->c:Lcom/jieli/jl_filebrowse/bean/SDCardBean;

    invoke-virtual {v0}, Lcom/jieli/jl_filebrowse/bean/SDCardBean;->getDevHandler()I

    move-result v0

    new-instance v1, Lcom/jieli/jl_rcsp/task/format/FormatBatchCmdTask;

    iget-object v2, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->mRcspOp:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lcom/jieli/jl_rcsp/task/format/FormatBatchCmdTask;-><init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;B)V

    new-instance v2, Lcom/jieli/jl_rcsp/task/format/FormatBatchCmdTask;

    iget-object v4, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->mRcspOp:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    const/16 v5, -0x80

    invoke-direct {v2, v4, v5}, Lcom/jieli/jl_rcsp/task/format/FormatBatchCmdTask;-><init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;B)V

    new-instance v4, Lcom/jieli/jl_rcsp/task/format/FormatCmdTask;

    iget-object v6, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->mRcspOp:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-direct {v4, v6, v5, v0}, Lcom/jieli/jl_rcsp/task/format/FormatCmdTask;-><init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;BI)V

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v6, p0, Lcom/jieli/jl_rcsp/task/format/FormatTask;->b:Landroid/content/Context;

    invoke-virtual {v6}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    sget-object v6, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, "WMEM.BIN"

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    new-instance v8, Lcom/jieli/jl_rcsp/task/GetFileByNameTask;

    iget-object v9, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->mRcspOp:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    new-instance v10, Lcom/jieli/jl_rcsp/task/GetFileByNameTask$Param;

    invoke-direct {v10, v0, v7, v5, v3}, Lcom/jieli/jl_rcsp/task/GetFileByNameTask$Param;-><init>(ILjava/lang/String;Ljava/lang/String;Z)V

    invoke-direct {v8, v9, v10}, Lcom/jieli/jl_rcsp/task/GetFileByNameTask;-><init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;Lcom/jieli/jl_rcsp/task/GetFileByNameTask$Param;)V

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v9, p0, Lcom/jieli/jl_rcsp/task/format/FormatTask;->b:Landroid/content/Context;

    invoke-virtual {v9}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v9

    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "call.txt"

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    new-instance v9, Lcom/jieli/jl_rcsp/task/GetFileByNameTask;

    iget-object v10, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->mRcspOp:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    new-instance v11, Lcom/jieli/jl_rcsp/task/GetFileByNameTask$Param;

    invoke-direct {v11, v0, v6, v7, v3}, Lcom/jieli/jl_rcsp/task/GetFileByNameTask$Param;-><init>(ILjava/lang/String;Ljava/lang/String;Z)V

    invoke-direct {v9, v10, v11}, Lcom/jieli/jl_rcsp/task/GetFileByNameTask;-><init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;Lcom/jieli/jl_rcsp/task/GetFileByNameTask$Param;)V

    new-instance v6, Lcom/jieli/jl_rcsp/task/TransferTask$Param;

    invoke-direct {v6}, Lcom/jieli/jl_rcsp/task/TransferTask$Param;-><init>()V

    iput v0, v6, Lcom/jieli/jl_rcsp/task/TransferTask$Param;->devHandler:I

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/format/FormatTask;->c:Lcom/jieli/jl_filebrowse/bean/SDCardBean;

    invoke-virtual {v0}, Lcom/jieli/jl_filebrowse/bean/SDCardBean;->getType()I

    move-result v0

    const/4 v10, 0x2

    if-ne v0, v10, :cond_0

    const/4 v3, 0x1

    :cond_0
    iput-boolean v3, v6, Lcom/jieli/jl_rcsp/task/TransferTask$Param;->useFlash:Z

    new-instance v0, Lcom/jieli/jl_rcsp/task/TransferTask;

    iget-object v3, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->mRcspOp:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-direct {v0, v3, v5, v6}, Lcom/jieli/jl_rcsp/task/TransferTask;-><init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;Ljava/lang/String;Lcom/jieli/jl_rcsp/task/TransferTask$Param;)V

    new-instance v3, Lcom/jieli/jl_rcsp/task/format/FormatTask$NextListener;

    const-string v5, "wmenSave task"

    invoke-direct {v3, p0, v5}, Lcom/jieli/jl_rcsp/task/format/FormatTask$NextListener;-><init>(Lcom/jieli/jl_rcsp/task/format/FormatTask;Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Lcom/jieli/jl_rcsp/task/TaskBase;->setListener(Lcom/jieli/jl_rcsp/task/TaskListener;)V

    new-instance v3, Lcom/jieli/jl_rcsp/task/CallTransferTask;

    iget-object v5, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->mRcspOp:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-direct {v3, v5, v7, v6}, Lcom/jieli/jl_rcsp/task/CallTransferTask;-><init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;Ljava/lang/String;Lcom/jieli/jl_rcsp/task/TransferTask$Param;)V

    new-instance v5, Lcom/jieli/jl_rcsp/task/format/FormatTask$NextListener;

    const-string v6, "callSave task"

    invoke-direct {v5, p0, v6}, Lcom/jieli/jl_rcsp/task/format/FormatTask$NextListener;-><init>(Lcom/jieli/jl_rcsp/task/format/FormatTask;Ljava/lang/String;)V

    invoke-virtual {v3, v5}, Lcom/jieli/jl_rcsp/task/TaskBase;->setListener(Lcom/jieli/jl_rcsp/task/TaskListener;)V

    iget-object v5, p0, Lcom/jieli/jl_rcsp/task/format/FormatTask;->d:Ljava/util/Queue;

    invoke-interface {v5, v1}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    iget-object v5, p0, Lcom/jieli/jl_rcsp/task/format/FormatTask;->d:Ljava/util/Queue;

    invoke-interface {v5, v8}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    iget-object v5, p0, Lcom/jieli/jl_rcsp/task/format/FormatTask;->d:Ljava/util/Queue;

    invoke-interface {v5, v9}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    iget-object v5, p0, Lcom/jieli/jl_rcsp/task/format/FormatTask;->d:Ljava/util/Queue;

    invoke-interface {v5, v4}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    new-instance v5, Lcom/jieli/jl_rcsp/task/format/FormatTask$ErrorStopListener;

    const-string v6, "start format batch cmd task"

    invoke-direct {v5, p0, v6}, Lcom/jieli/jl_rcsp/task/format/FormatTask$ErrorStopListener;-><init>(Lcom/jieli/jl_rcsp/task/format/FormatTask;Ljava/lang/String;)V

    invoke-virtual {v1, v5}, Lcom/jieli/jl_rcsp/task/TaskBase;->setListener(Lcom/jieli/jl_rcsp/task/TaskListener;)V

    new-instance v1, Lcom/jieli/jl_rcsp/task/format/FormatTask$AddTaskListener;

    const-string v5, "wmen read task"

    invoke-direct {v1, p0, v0, v5}, Lcom/jieli/jl_rcsp/task/format/FormatTask$AddTaskListener;-><init>(Lcom/jieli/jl_rcsp/task/format/FormatTask;Lcom/jieli/jl_rcsp/task/ITask;Ljava/lang/String;)V

    invoke-virtual {v8, v1}, Lcom/jieli/jl_rcsp/task/TaskBase;->setListener(Lcom/jieli/jl_rcsp/task/TaskListener;)V

    new-instance v0, Lcom/jieli/jl_rcsp/task/format/FormatTask$AddTaskListener;

    const-string v1, "call read  task"

    invoke-direct {v0, p0, v3, v1}, Lcom/jieli/jl_rcsp/task/format/FormatTask$AddTaskListener;-><init>(Lcom/jieli/jl_rcsp/task/format/FormatTask;Lcom/jieli/jl_rcsp/task/ITask;Ljava/lang/String;)V

    invoke-virtual {v9, v0}, Lcom/jieli/jl_rcsp/task/TaskBase;->setListener(Lcom/jieli/jl_rcsp/task/TaskListener;)V

    new-instance v0, Lcom/jieli/jl_rcsp/task/format/FormatTask$AddTaskListener;

    const-string v1, "  format cmd task"

    invoke-direct {v0, p0, v2, v1}, Lcom/jieli/jl_rcsp/task/format/FormatTask$AddTaskListener;-><init>(Lcom/jieli/jl_rcsp/task/format/FormatTask;Lcom/jieli/jl_rcsp/task/ITask;Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Lcom/jieli/jl_rcsp/task/TaskBase;->setListener(Lcom/jieli/jl_rcsp/task/TaskListener;)V

    new-instance v0, Lcom/jieli/jl_rcsp/task/format/FormatTask$ErrorStopListener;

    const-string v1, "stop format batch cmd task"

    invoke-direct {v0, p0, v1}, Lcom/jieli/jl_rcsp/task/format/FormatTask$ErrorStopListener;-><init>(Lcom/jieli/jl_rcsp/task/format/FormatTask;Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Lcom/jieli/jl_rcsp/task/TaskBase;->setListener(Lcom/jieli/jl_rcsp/task/TaskListener;)V

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/format/FormatTask;->a()V

    return-void
.end method
