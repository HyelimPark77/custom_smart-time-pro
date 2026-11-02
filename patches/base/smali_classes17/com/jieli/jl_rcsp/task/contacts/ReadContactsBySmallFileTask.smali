.class Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask;
.super Lcom/jieli/jl_rcsp/task/TaskBase;
.source "SourceFile"


# instance fields
.field public b:Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask;

.field public c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/task/contacts/DeviceContacts;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/RuntimeException;
        }
    .end annotation

    invoke-direct {p0, p1}, Lcom/jieli/jl_rcsp/task/TaskBase;-><init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;)V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask;->c:Ljava/util/List;

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask;Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask;)Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask;
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask;->b:Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask;

    return-object p1
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask;)V
    .locals 0

    .line 2
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TaskBase;->callbackFinish()V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask;I)V
    .locals 0

    .line 4
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/task/TaskBase;->callbackProgress(I)V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask;ILjava/lang/String;)V
    .locals 0

    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/task/TaskBase;->callbackError(ILjava/lang/String;)V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask;S[B)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask;->a(S[B)V

    return-void
.end method

.method public static synthetic b(Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask;)Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask;->b:Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask;

    return-object p0
.end method

.method public static synthetic b(Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask;I)V
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/task/TaskBase;->callbackCancel(I)V

    return-void
.end method

.method public static synthetic b(Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask;ILjava/lang/String;)V
    .locals 0

    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/task/TaskBase;->callbackError(ILjava/lang/String;)V

    return-void
.end method

.method public static synthetic c(Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask;)Lcom/jieli/jl_rcsp/impl/RcspOpImpl;
    .locals 0

    iget-object p0, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->mRcspOp:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    return-object p0
.end method

.method public static synthetic d(Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask;)V
    .locals 0

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TaskBase;->callbackFinish()V

    return-void
.end method


# virtual methods
.method public final a(S[B)V
    .locals 0

    .line 6
    invoke-static {p1, p2}, Lcom/jieli/jl_rcsp/task/contacts/DeviceContacts;->fromData(S[B)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask;->c:Ljava/util/List;

    return-void
.end method

.method public cancel(B)V
    .locals 1

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TaskBase;->isRun()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask;->b:Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask;->cancel(B)V

    return-void

    :cond_1
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/task/TaskBase;->callbackCancel(I)V

    return-void
.end method

.method public getContacts()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/task/contacts/DeviceContacts;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask;->c:Ljava/util/List;

    return-object v0
.end method

.method public start()V
    .locals 7

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

    new-instance v0, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$QueryParam;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$QueryParam;-><init>(B)V

    new-instance v1, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd;

    invoke-direct {v1, v0}, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd;-><init>(Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$Param;)V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->mRcspOp:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TaskBase;->getConnectedDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v2

    new-instance v3, Lcom/jieli/jl_rcsp/tool/CustomRcspActionCallback;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->tag:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "#SmallFileTransfer"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask$1;

    invoke-direct {v5, p0}, Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask$1;-><init>(Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask;)V

    new-instance v6, Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask$2;

    invoke-direct {v6, p0}, Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask$2;-><init>(Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask;)V

    invoke-direct {v3, v4, v5, v6}, Lcom/jieli/jl_rcsp/tool/CustomRcspActionCallback;-><init>(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;Lcom/jieli/jl_rcsp/interfaces/IHandleResult;)V

    invoke-virtual {v0, v2, v1, v3}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    return-void
.end method
