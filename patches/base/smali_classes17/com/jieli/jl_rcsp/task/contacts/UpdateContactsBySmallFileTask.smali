.class public Lcom/jieli/jl_rcsp/task/contacts/UpdateContactsBySmallFileTask;
.super Lcom/jieli/jl_rcsp/task/TaskBase;
.source "SourceFile"


# instance fields
.field public b:Lcom/jieli/jl_rcsp/task/ITask;

.field public final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/task/contacts/DeviceContacts;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jieli/jl_rcsp/impl/RcspOpImpl;",
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/task/contacts/DeviceContacts;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/RuntimeException;
        }
    .end annotation

    invoke-direct {p0, p1}, Lcom/jieli/jl_rcsp/task/TaskBase;-><init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;)V

    if-eqz p2, :cond_0

    iput-object p2, p0, Lcom/jieli/jl_rcsp/task/contacts/UpdateContactsBySmallFileTask;->c:Ljava/util/List;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "contacts can not be null."

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/task/contacts/UpdateContactsBySmallFileTask;)V
    .locals 0

    .line 4
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TaskBase;->callbackFinish()V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/task/contacts/UpdateContactsBySmallFileTask;I)V
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/task/TaskBase;->callbackProgress(I)V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/task/contacts/UpdateContactsBySmallFileTask;ILjava/lang/String;)V
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/task/TaskBase;->callbackError(ILjava/lang/String;)V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/task/contacts/UpdateContactsBySmallFileTask;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/task/contacts/UpdateContactsBySmallFileTask;->a(Ljava/util/List;)V

    return-void
.end method

.method public static synthetic b(Lcom/jieli/jl_rcsp/task/contacts/UpdateContactsBySmallFileTask;I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/task/TaskBase;->callbackCancel(I)V

    return-void
.end method

.method public static synthetic b(Lcom/jieli/jl_rcsp/task/contacts/UpdateContactsBySmallFileTask;ILjava/lang/String;)V
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/task/TaskBase;->callbackError(ILjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 7

    .line 5
    new-instance v0, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$QueryParam;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$QueryParam;-><init>(B)V

    .line 6
    new-instance v1, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd;

    invoke-direct {v1, v0}, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd;-><init>(Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$Param;)V

    .line 7
    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->mRcspOp:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TaskBase;->getConnectedDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v2

    new-instance v3, Lcom/jieli/jl_rcsp/tool/CustomRcspActionCallback;

    new-instance v4, Lcom/jieli/jl_rcsp/task/contacts/UpdateContactsBySmallFileTask$1;

    invoke-direct {v4, p0}, Lcom/jieli/jl_rcsp/task/contacts/UpdateContactsBySmallFileTask$1;-><init>(Lcom/jieli/jl_rcsp/task/contacts/UpdateContactsBySmallFileTask;)V

    new-instance v5, Lcom/jieli/jl_rcsp/task/contacts/UpdateContactsBySmallFileTask$2;

    invoke-direct {v5, p0}, Lcom/jieli/jl_rcsp/task/contacts/UpdateContactsBySmallFileTask$2;-><init>(Lcom/jieli/jl_rcsp/task/contacts/UpdateContactsBySmallFileTask;)V

    const-string v6, "queryContactList"

    invoke-direct {v3, v6, v4, v5}, Lcom/jieli/jl_rcsp/tool/CustomRcspActionCallback;-><init>(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;Lcom/jieli/jl_rcsp/interfaces/IHandleResult;)V

    invoke-virtual {v0, v2, v1, v3}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    return-void
.end method

.method public final a(Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$QueryResponse$File;",
            ">;)V"
        }
    .end annotation

    .line 8
    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/contacts/UpdateContactsBySmallFileTask;->c:Ljava/util/List;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/task/contacts/DeviceContacts;->toData(Ljava/util/List;)[B

    move-result-object v0

    .line 9
    array-length v1, v0

    const-string v2, "updateByQuery"

    if-nez v1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 10
    iget-object p1, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->tag:Ljava/lang/String;

    const-string v0, "No contact data, no contact file, end."

    invoke-static {p1, v2, v0}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TaskBase;->callbackFinish()V

    return-void

    .line 12
    :cond_0
    array-length v1, v0

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-nez v1, :cond_1

    .line 13
    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->tag:Ljava/lang/String;

    const-string v1, "No contact data and contact files, delete the contact files."

    invoke-static {v0, v2, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    new-instance v0, Lcom/jieli/jl_rcsp/task/smallfile/DeleteFileTask$Param;

    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$QueryResponse$File;

    iget-short p1, p1, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$QueryResponse$File;->id:S

    invoke-direct {v0, v4, p1}, Lcom/jieli/jl_rcsp/task/smallfile/DeleteFileTask$Param;-><init>(BS)V

    .line 15
    new-instance p1, Lcom/jieli/jl_rcsp/task/smallfile/DeleteFileTask;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->mRcspOp:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-direct {p1, v1, v0}, Lcom/jieli/jl_rcsp/task/smallfile/DeleteFileTask;-><init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;Lcom/jieli/jl_rcsp/task/smallfile/DeleteFileTask$Param;)V

    iput-object p1, p0, Lcom/jieli/jl_rcsp/task/contacts/UpdateContactsBySmallFileTask;->b:Lcom/jieli/jl_rcsp/task/ITask;

    goto :goto_0

    .line 16
    :cond_1
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 17
    iget-object p1, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->tag:Ljava/lang/String;

    const-string v1, "There is contact data but no contact file, add the contact file."

    invoke-static {p1, v2, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 18
    new-instance p1, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$Param;

    invoke-direct {p1, v4, v0}, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$Param;-><init>(B[B)V

    .line 19
    new-instance v0, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->mRcspOp:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-direct {v0, v1, p1}, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask;-><init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$Param;)V

    iput-object v0, p0, Lcom/jieli/jl_rcsp/task/contacts/UpdateContactsBySmallFileTask;->b:Lcom/jieli/jl_rcsp/task/ITask;

    goto :goto_0

    .line 20
    :cond_2
    iget-object v1, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->tag:Ljava/lang/String;

    const-string v5, "There is contact data and contact file, update the contact file."

    invoke-static {v1, v2, v5}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    new-instance v1, Lcom/jieli/jl_rcsp/task/smallfile/UpdateFileTask$Param;

    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$QueryResponse$File;

    iget-short p1, p1, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$QueryResponse$File;->id:S

    invoke-direct {v1, v4, p1, v0}, Lcom/jieli/jl_rcsp/task/smallfile/UpdateFileTask$Param;-><init>(BS[B)V

    .line 22
    new-instance p1, Lcom/jieli/jl_rcsp/task/smallfile/UpdateFileTask;

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->mRcspOp:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-direct {p1, v0, v1}, Lcom/jieli/jl_rcsp/task/smallfile/UpdateFileTask;-><init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;Lcom/jieli/jl_rcsp/task/smallfile/UpdateFileTask$Param;)V

    iput-object p1, p0, Lcom/jieli/jl_rcsp/task/contacts/UpdateContactsBySmallFileTask;->b:Lcom/jieli/jl_rcsp/task/ITask;

    .line 23
    :goto_0
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/contacts/UpdateContactsBySmallFileTask;->b()V

    return-void
.end method

.method public final b()V
    .locals 2

    .line 3
    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/contacts/UpdateContactsBySmallFileTask;->b:Lcom/jieli/jl_rcsp/task/ITask;

    new-instance v1, Lcom/jieli/jl_rcsp/task/contacts/UpdateContactsBySmallFileTask$3;

    invoke-direct {v1, p0}, Lcom/jieli/jl_rcsp/task/contacts/UpdateContactsBySmallFileTask$3;-><init>(Lcom/jieli/jl_rcsp/task/contacts/UpdateContactsBySmallFileTask;)V

    invoke-interface {v0, v1}, Lcom/jieli/jl_rcsp/task/ITask;->setListener(Lcom/jieli/jl_rcsp/task/TaskListener;)V

    .line 4
    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/contacts/UpdateContactsBySmallFileTask;->b:Lcom/jieli/jl_rcsp/task/ITask;

    invoke-interface {v0}, Lcom/jieli/jl_rcsp/task/ITask;->start()V

    return-void
.end method

.method public cancel(B)V
    .locals 1

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TaskBase;->isRun()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/contacts/UpdateContactsBySmallFileTask;->b:Lcom/jieli/jl_rcsp/task/ITask;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Lcom/jieli/jl_rcsp/task/ITask;->cancel(B)V

    return-void

    :cond_1
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/task/TaskBase;->callbackCancel(I)V

    return-void
.end method

.method public start()V
    .locals 4

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TaskBase;->isRun()Z

    move-result v0

    const-string v1, "start"

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->tag:Ljava/lang/String;

    const-string v2, "Task is in progress."

    invoke-static {v0, v1, v2}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TaskBase;->callbackBegin()V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/contacts/UpdateContactsBySmallFileTask;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/contacts/UpdateContactsBySmallFileTask;->c:Ljava/util/List;

    const/4 v2, 0x0

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/jieli/jl_rcsp/task/contacts/DeviceContacts;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/task/contacts/DeviceContacts;->getFileId()S

    move-result v0

    if-lez v0, :cond_1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->tag:Ljava/lang/String;

    const-string v3, "Update"

    invoke-static {v0, v1, v3}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lcom/jieli/jl_rcsp/task/smallfile/UpdateFileTask$Param;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/task/contacts/UpdateContactsBySmallFileTask;->c:Ljava/util/List;

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/jieli/jl_rcsp/task/contacts/DeviceContacts;

    invoke-virtual {v1}, Lcom/jieli/jl_rcsp/task/contacts/DeviceContacts;->getFileId()S

    move-result v1

    iget-object v2, p0, Lcom/jieli/jl_rcsp/task/contacts/UpdateContactsBySmallFileTask;->c:Ljava/util/List;

    invoke-static {v2}, Lcom/jieli/jl_rcsp/task/contacts/DeviceContacts;->toData(Ljava/util/List;)[B

    move-result-object v2

    const/4 v3, 0x1

    invoke-direct {v0, v3, v1, v2}, Lcom/jieli/jl_rcsp/task/smallfile/UpdateFileTask$Param;-><init>(BS[B)V

    new-instance v1, Lcom/jieli/jl_rcsp/task/smallfile/UpdateFileTask;

    iget-object v2, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->mRcspOp:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-direct {v1, v2, v0}, Lcom/jieli/jl_rcsp/task/smallfile/UpdateFileTask;-><init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;Lcom/jieli/jl_rcsp/task/smallfile/UpdateFileTask$Param;)V

    iput-object v1, p0, Lcom/jieli/jl_rcsp/task/contacts/UpdateContactsBySmallFileTask;->b:Lcom/jieli/jl_rcsp/task/ITask;

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/contacts/UpdateContactsBySmallFileTask;->b()V

    return-void

    :cond_1
    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->tag:Ljava/lang/String;

    const-string v2, "Query first, then update"

    invoke-static {v0, v1, v2}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/contacts/UpdateContactsBySmallFileTask;->a()V

    return-void
.end method
