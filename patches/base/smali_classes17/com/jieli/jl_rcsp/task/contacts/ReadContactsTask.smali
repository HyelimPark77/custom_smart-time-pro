.class public Lcom/jieli/jl_rcsp/task/contacts/ReadContactsTask;
.super Lcom/jieli/jl_rcsp/task/TaskBase;
.source "SourceFile"


# instance fields
.field public final b:Ljava/lang/String;

.field public c:Lcom/jieli/jl_rcsp/task/ITask;

.field public d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/task/contacts/DeviceContacts;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;Landroid/content/Context;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 3
    invoke-direct {p0, p1}, Lcom/jieli/jl_rcsp/task/TaskBase;-><init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;)V

    if-nez p2, :cond_0

    .line 4
    const-string p1, ""

    iput-object p1, p0, Lcom/jieli/jl_rcsp/task/contacts/ReadContactsTask;->b:Ljava/lang/String;

    return-void

    .line 5
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2}, Landroid/content/Context;->getExternalCacheDir()Ljava/io/File;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    sget-object p2, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "read_call.txt"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/jieli/jl_rcsp/task/contacts/ReadContactsTask;->b:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/RuntimeException;
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lcom/jieli/jl_rcsp/task/TaskBase;-><init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;)V

    .line 2
    iput-object p2, p0, Lcom/jieli/jl_rcsp/task/contacts/ReadContactsTask;->b:Ljava/lang/String;

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/task/contacts/ReadContactsTask;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/jieli/jl_rcsp/task/contacts/ReadContactsTask;->d:Ljava/util/List;

    return-object p1
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/task/contacts/ReadContactsTask;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TaskBase;->callbackBegin()V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/task/contacts/ReadContactsTask;I)V
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/task/TaskBase;->callbackProgress(I)V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/task/contacts/ReadContactsTask;ILjava/lang/String;)V
    .locals 0

    .line 4
    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/task/TaskBase;->callbackError(ILjava/lang/String;)V

    return-void
.end method

.method public static synthetic b(Lcom/jieli/jl_rcsp/task/contacts/ReadContactsTask;)Lcom/jieli/jl_rcsp/task/ITask;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/jieli/jl_rcsp/task/contacts/ReadContactsTask;->c:Lcom/jieli/jl_rcsp/task/ITask;

    return-object p0
.end method

.method public static synthetic b(Lcom/jieli/jl_rcsp/task/contacts/ReadContactsTask;I)V
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/task/TaskBase;->callbackCancel(I)V

    return-void
.end method

.method public static synthetic c(Lcom/jieli/jl_rcsp/task/contacts/ReadContactsTask;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/jieli/jl_rcsp/task/contacts/ReadContactsTask;->b:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic d(Lcom/jieli/jl_rcsp/task/contacts/ReadContactsTask;)V
    .locals 0

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TaskBase;->callbackFinish()V

    return-void
.end method


# virtual methods
.method public cancel(B)V
    .locals 1

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/contacts/ReadContactsTask;->isRun()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/contacts/ReadContactsTask;->c:Lcom/jieli/jl_rcsp/task/ITask;

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/task/TaskBase;->callbackCancel(I)V

    return-void

    :cond_1
    invoke-interface {v0, p1}, Lcom/jieli/jl_rcsp/task/ITask;->cancel(B)V

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

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/contacts/ReadContactsTask;->d:Ljava/util/List;

    return-object v0
.end method

.method public isRun()Z
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/contacts/ReadContactsTask;->c:Lcom/jieli/jl_rcsp/task/ITask;

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

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->mRcspOp:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->getDeviceInfo()Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    move-result-object v0

    const-string v1, "start"

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->tag:Ljava/lang/String;

    const-string v2, "Device is disconnected."

    invoke-static {v0, v1, v2}, Lcom/jieli/jl_rcsp/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v0, 0x2000

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/task/TaskBase;->callbackError(I)V

    return-void

    :cond_0
    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->isContactsTransferBySmallFile()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->mRcspOp:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-direct {v0, v1}, Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask;-><init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;)V

    iput-object v0, p0, Lcom/jieli/jl_rcsp/task/contacts/ReadContactsTask;->c:Lcom/jieli/jl_rcsp/task/ITask;

    goto :goto_0

    :cond_1
    invoke-static {}, Lcom/jieli/jl_filebrowse/util/DeviceChoseUtil;->getTargetDevFlash2First()Lcom/jieli/jl_filebrowse/bean/SDCardBean;

    move-result-object v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->tag:Ljava/lang/String;

    const-string v2, "no target dev"

    invoke-static {v0, v1, v2}, Lcom/jieli/jl_rcsp/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v0, 0x4000

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/task/TaskBase;->callbackError(I)V

    return-void

    :cond_2
    new-instance v1, Lcom/jieli/jl_rcsp/task/GetFileByNameTask$Param;

    invoke-virtual {v0}, Lcom/jieli/jl_filebrowse/bean/SDCardBean;->getDevHandler()I

    move-result v0

    iget-object v2, p0, Lcom/jieli/jl_rcsp/task/contacts/ReadContactsTask;->b:Ljava/lang/String;

    const-string v3, "CALL.TXT"

    const/4 v4, 0x0

    invoke-direct {v1, v0, v3, v2, v4}, Lcom/jieli/jl_rcsp/task/GetFileByNameTask$Param;-><init>(ILjava/lang/String;Ljava/lang/String;Z)V

    new-instance v0, Lcom/jieli/jl_rcsp/task/GetFileByNameTask;

    iget-object v2, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->mRcspOp:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-direct {v0, v2, v1}, Lcom/jieli/jl_rcsp/task/GetFileByNameTask;-><init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;Lcom/jieli/jl_rcsp/task/GetFileByNameTask$Param;)V

    iput-object v0, p0, Lcom/jieli/jl_rcsp/task/contacts/ReadContactsTask;->c:Lcom/jieli/jl_rcsp/task/ITask;

    :goto_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/contacts/ReadContactsTask;->c:Lcom/jieli/jl_rcsp/task/ITask;

    new-instance v1, Lcom/jieli/jl_rcsp/task/contacts/ReadContactsTask$1;

    invoke-direct {v1, p0}, Lcom/jieli/jl_rcsp/task/contacts/ReadContactsTask$1;-><init>(Lcom/jieli/jl_rcsp/task/contacts/ReadContactsTask;)V

    invoke-interface {v0, v1}, Lcom/jieli/jl_rcsp/task/ITask;->setListener(Lcom/jieli/jl_rcsp/task/TaskListener;)V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/contacts/ReadContactsTask;->c:Lcom/jieli/jl_rcsp/task/ITask;

    invoke-interface {v0}, Lcom/jieli/jl_rcsp/task/ITask;->start()V

    return-void
.end method
