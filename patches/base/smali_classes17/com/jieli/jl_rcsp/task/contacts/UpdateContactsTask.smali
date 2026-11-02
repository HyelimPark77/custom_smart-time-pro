.class public Lcom/jieli/jl_rcsp/task/contacts/UpdateContactsTask;
.super Lcom/jieli/jl_rcsp/task/TaskBase;
.source "SourceFile"


# instance fields
.field public final b:Ljava/lang/String;

.field public final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/task/contacts/DeviceContacts;",
            ">;"
        }
    .end annotation
.end field

.field public d:Lcom/jieli/jl_rcsp/task/ITask;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;Landroid/content/Context;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jieli/jl_rcsp/impl/RcspOpImpl;",
            "Landroid/content/Context;",
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

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 5
    invoke-direct {p0, p1}, Lcom/jieli/jl_rcsp/task/TaskBase;-><init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;)V

    if-eqz p3, :cond_1

    if-nez p2, :cond_0

    const/4 p1, 0x0

    .line 6
    iput-object p1, p0, Lcom/jieli/jl_rcsp/task/contacts/UpdateContactsTask;->b:Ljava/lang/String;

    goto :goto_0

    .line 7
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2}, Landroid/content/Context;->getExternalCacheDir()Ljava/io/File;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    sget-object p2, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "CALL.TXT"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/jieli/jl_rcsp/task/contacts/UpdateContactsTask;->b:Ljava/lang/String;

    .line 8
    :goto_0
    iput-object p3, p0, Lcom/jieli/jl_rcsp/task/contacts/UpdateContactsTask;->c:Ljava/util/List;

    return-void

    .line 9
    :cond_1
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "contacts can not be null."

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;Ljava/lang/String;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jieli/jl_rcsp/impl/RcspOpImpl;",
            "Ljava/lang/String;",
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

    .line 1
    invoke-direct {p0, p1}, Lcom/jieli/jl_rcsp/task/TaskBase;-><init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;)V

    if-eqz p3, :cond_0

    .line 2
    iput-object p2, p0, Lcom/jieli/jl_rcsp/task/contacts/UpdateContactsTask;->b:Ljava/lang/String;

    .line 3
    iput-object p3, p0, Lcom/jieli/jl_rcsp/task/contacts/UpdateContactsTask;->c:Ljava/util/List;

    return-void

    .line 4
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "contacts can not be null."

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public cancel(B)V
    .locals 1

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/contacts/UpdateContactsTask;->isRun()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/contacts/UpdateContactsTask;->d:Lcom/jieli/jl_rcsp/task/ITask;

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/task/TaskBase;->callbackCancel(I)V

    return-void

    :cond_1
    invoke-interface {v0, p1}, Lcom/jieli/jl_rcsp/task/ITask;->cancel(B)V

    return-void
.end method

.method public isRun()Z
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/contacts/UpdateContactsTask;->d:Lcom/jieli/jl_rcsp/task/ITask;

    if-nez v0, :cond_0

    invoke-super {p0}, Lcom/jieli/jl_rcsp/task/TaskBase;->isRun()Z

    move-result v0

    return v0

    :cond_0
    invoke-interface {v0}, Lcom/jieli/jl_rcsp/task/ITask;->isRun()Z

    move-result v0

    return v0
.end method

.method public start()V
    .locals 5

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/contacts/UpdateContactsTask;->isRun()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->tag:Ljava/lang/String;

    const-string v1, "start"

    const-string v2, "Task is in progress."

    invoke-static {v0, v1, v2}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->mRcspOp:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->getDeviceInfo()Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    move-result-object v0

    if-nez v0, :cond_1

    const/16 v0, 0x2000

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/task/TaskBase;->callbackError(I)V

    return-void

    :cond_1
    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->isContactsTransferBySmallFile()Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v0, Lcom/jieli/jl_rcsp/task/contacts/UpdateContactsBySmallFileTask;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->mRcspOp:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    iget-object v2, p0, Lcom/jieli/jl_rcsp/task/contacts/UpdateContactsTask;->c:Ljava/util/List;

    invoke-direct {v0, v1, v2}, Lcom/jieli/jl_rcsp/task/contacts/UpdateContactsBySmallFileTask;-><init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;Ljava/util/List;)V

    iput-object v0, p0, Lcom/jieli/jl_rcsp/task/contacts/UpdateContactsTask;->d:Lcom/jieli/jl_rcsp/task/ITask;

    goto/16 :goto_6

    :cond_2
    invoke-static {}, Lcom/jieli/jl_filebrowse/util/DeviceChoseUtil;->getTargetDevFlash2First()Lcom/jieli/jl_filebrowse/bean/SDCardBean;

    move-result-object v0

    if-nez v0, :cond_3

    const/16 v0, 0x4000

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/task/TaskBase;->callbackError(I)V

    return-void

    :cond_3
    new-instance v1, Lcom/jieli/jl_rcsp/task/TransferTask$Param;

    invoke-direct {v1}, Lcom/jieli/jl_rcsp/task/TransferTask$Param;-><init>()V

    invoke-virtual {v0}, Lcom/jieli/jl_filebrowse/bean/SDCardBean;->getDevHandler()I

    move-result v2

    iput v2, v1, Lcom/jieli/jl_rcsp/task/TransferTask$Param;->devHandler:I

    invoke-virtual {v0}, Lcom/jieli/jl_filebrowse/bean/SDCardBean;->getType()I

    move-result v0

    const/4 v2, 0x2

    if-ne v0, v2, :cond_4

    const/4 v0, 0x1

    goto :goto_0

    :cond_4
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, v1, Lcom/jieli/jl_rcsp/task/TransferTask$Param;->useFlash:Z

    const/4 v0, 0x0

    :try_start_0
    new-instance v2, Ljava/io/FileOutputStream;

    iget-object v3, p0, Lcom/jieli/jl_rcsp/task/contacts/UpdateContactsTask;->b:Ljava/lang/String;

    invoke-direct {v2, v3}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/contacts/UpdateContactsTask;->c:Ljava/util/List;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/task/contacts/DeviceContacts;->toData(Ljava/util/List;)[B

    move-result-object v0

    array-length v3, v0

    if-nez v3, :cond_5

    const/16 v0, 0x14

    new-array v0, v0, [B

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :catch_0
    move-exception v0

    goto :goto_3

    :cond_5
    :goto_1
    invoke-virtual {v2, v0}, Ljava/io/FileOutputStream;->write([B)V

    new-instance v0, Lcom/jieli/jl_rcsp/task/CallTransferTask;

    iget-object v3, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->mRcspOp:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    iget-object v4, p0, Lcom/jieli/jl_rcsp/task/contacts/UpdateContactsTask;->b:Ljava/lang/String;

    invoke-direct {v0, v3, v4, v1}, Lcom/jieli/jl_rcsp/task/CallTransferTask;-><init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;Ljava/lang/String;Lcom/jieli/jl_rcsp/task/TransferTask$Param;)V

    iput-object v0, p0, Lcom/jieli/jl_rcsp/task/contacts/UpdateContactsTask;->d:Lcom/jieli/jl_rcsp/task/ITask;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_6

    :catch_1
    move-exception v0

    goto :goto_5

    :goto_2
    move-object v1, v0

    move-object v0, v2

    goto :goto_7

    :goto_3
    move-object v1, v0

    move-object v0, v2

    goto :goto_4

    :catchall_1
    move-exception v1

    goto :goto_7

    :catch_2
    move-exception v1

    :goto_4
    :try_start_3
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "IO Exception = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x4005

    invoke-virtual {p0, v2, v1}, Lcom/jieli/jl_rcsp/task/TaskBase;->callbackError(ILjava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-eqz v0, :cond_6

    :try_start_4
    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1

    goto :goto_6

    :goto_5
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_6
    :goto_6
    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/contacts/UpdateContactsTask;->d:Lcom/jieli/jl_rcsp/task/ITask;

    if-eqz v0, :cond_7

    iget-object v1, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->listener:Lcom/jieli/jl_rcsp/task/TaskListener;

    invoke-interface {v0, v1}, Lcom/jieli/jl_rcsp/task/ITask;->setListener(Lcom/jieli/jl_rcsp/task/TaskListener;)V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/contacts/UpdateContactsTask;->d:Lcom/jieli/jl_rcsp/task/ITask;

    invoke-interface {v0}, Lcom/jieli/jl_rcsp/task/ITask;->start()V

    :cond_7
    return-void

    :goto_7
    if-eqz v0, :cond_8

    :try_start_5
    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3

    goto :goto_8

    :catch_3
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_8
    :goto_8
    throw v1
.end method
