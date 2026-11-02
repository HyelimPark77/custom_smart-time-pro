.class public Lcom/jieli/jl_rcsp/task/smallfile/QueryFileTask;
.super Lcom/jieli/jl_rcsp/task/TaskBase;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jieli/jl_rcsp/task/smallfile/QueryFileTask$Param;,
        Lcom/jieli/jl_rcsp/task/smallfile/QueryFileTask$File;
    }
.end annotation


# static fields
.field public static final TYPE_BLOOD_OXYGEN:B = 0x4t

.field public static final TYPE_CALL_LOG:B = 0x8t

.field public static final TYPE_CONTACTS:B = 0x1t

.field public static final TYPE_HEART_RATE:B = 0x3t

.field public static final TYPE_MESSAGE_SYNC:B = 0x6t

.field public static final TYPE_SLEEP:B = 0x5t

.field public static final TYPE_SPORTS_RECORD:B = 0x2t

.field public static final TYPE_STEP:B = 0x9t

.field public static final TYPE_WEATHER:B = 0x7t


# instance fields
.field public final b:Lcom/jieli/jl_rcsp/task/smallfile/QueryFileTask$Param;

.field public c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/task/smallfile/QueryFileTask$File;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;Lcom/jieli/jl_rcsp/task/smallfile/QueryFileTask$Param;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/jieli/jl_rcsp/task/TaskBase;-><init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;)V

    if-eqz p2, :cond_0

    iput-object p2, p0, Lcom/jieli/jl_rcsp/task/smallfile/QueryFileTask;->b:Lcom/jieli/jl_rcsp/task/smallfile/QueryFileTask$Param;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "QueryFileTask.Param can not be null."

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/task/smallfile/QueryFileTask;II)Lcom/jieli/jl_rcsp/model/base/BaseError;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/task/TaskBase;->buildResponseBadState(II)Lcom/jieli/jl_rcsp/model/base/BaseError;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/task/smallfile/QueryFileTask;)Ljava/util/List;
    .locals 0

    .line 2
    iget-object p0, p0, Lcom/jieli/jl_rcsp/task/smallfile/QueryFileTask;->c:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/task/smallfile/QueryFileTask;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/jieli/jl_rcsp/task/smallfile/QueryFileTask;->c:Ljava/util/List;

    return-object p1
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/task/smallfile/QueryFileTask;ILjava/lang/String;)V
    .locals 0

    .line 4
    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/task/TaskBase;->callbackError(ILjava/lang/String;)V

    return-void
.end method

.method public static synthetic b(Lcom/jieli/jl_rcsp/task/smallfile/QueryFileTask;)V
    .locals 0

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TaskBase;->callbackFinish()V

    return-void
.end method


# virtual methods
.method public cancel(B)V
    .locals 0

    return-void
.end method

.method public getFiles()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/task/smallfile/QueryFileTask$File;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/smallfile/QueryFileTask;->c:Ljava/util/List;

    return-object v0
.end method

.method public start()V
    .locals 5

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TaskBase;->isRun()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->tag:Ljava/lang/String;

    const-string v1, "start"

    const-string v2, "Task is in progress."

    invoke-static {v0, v1, v2}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TaskBase;->callbackBegin()V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->mRcspOp:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TaskBase;->getConnectedDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd;

    new-instance v3, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$QueryParam;

    iget-object v4, p0, Lcom/jieli/jl_rcsp/task/smallfile/QueryFileTask;->b:Lcom/jieli/jl_rcsp/task/smallfile/QueryFileTask$Param;

    iget-byte v4, v4, Lcom/jieli/jl_rcsp/task/smallfile/QueryFileTask$Param;->type:B

    invoke-direct {v3, v4}, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$QueryParam;-><init>(B)V

    invoke-direct {v2, v3}, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd;-><init>(Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$Param;)V

    new-instance v3, Lcom/jieli/jl_rcsp/task/smallfile/QueryFileTask$1;

    invoke-direct {v3, p0}, Lcom/jieli/jl_rcsp/task/smallfile/QueryFileTask$1;-><init>(Lcom/jieli/jl_rcsp/task/smallfile/QueryFileTask;)V

    invoke-virtual {v0, v1, v2, v3}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    return-void
.end method
