.class public Lcom/jieli/jl_rcsp/impl/NfcOpImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/nfc/INfcOp;


# static fields
.field public static final g:Ljava/lang/String; = "NfcOpImpl"


# instance fields
.field public final a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

.field public final b:Lcom/jieli/jl_rcsp/tool/NfcEventCbHelper;

.field public c:Lcom/jieli/jl_rcsp/task/ITask;

.field public d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/model/device/NfcMsg;",
            ">;"
        }
    .end annotation
.end field

.field public e:S

.field public final f:Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/jieli/jl_rcsp/tool/NfcEventCbHelper;

    invoke-direct {v0}, Lcom/jieli/jl_rcsp/tool/NfcEventCbHelper;-><init>()V

    iput-object v0, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl;->b:Lcom/jieli/jl_rcsp/tool/NfcEventCbHelper;

    const/16 v0, 0xff

    iput-short v0, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl;->e:S

    new-instance v0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$9;

    invoke-direct {v0, p0}, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$9;-><init>(Lcom/jieli/jl_rcsp/impl/NfcOpImpl;)V

    iput-object v0, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl;->f:Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->registerOnRcspCallback(Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "RcspOpImpl can not be null."

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/impl/NfcOpImpl;Lcom/jieli/jl_rcsp/task/ITask;)Lcom/jieli/jl_rcsp/task/ITask;
    .locals 0

    .line 8
    iput-object p1, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl;->c:Lcom/jieli/jl_rcsp/task/ITask;

    return-object p1
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/impl/NfcOpImpl;)Lcom/jieli/jl_rcsp/tool/NfcEventCbHelper;
    .locals 0

    .line 3
    iget-object p0, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl;->b:Lcom/jieli/jl_rcsp/tool/NfcEventCbHelper;

    return-object p0
.end method

.method public static synthetic a()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl;->g:Ljava/lang/String;

    return-object v0
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/impl/NfcOpImpl;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 9
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/impl/NfcOpImpl;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/impl/NfcOpImpl;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl;->d:Ljava/util/List;

    return-object p1
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/impl/NfcOpImpl;S)S
    .locals 0

    .line 7
    iput-short p1, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl;->e:S

    return p1
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/impl/NfcOpImpl;Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$ModifyMsgParam;)V
    .locals 0

    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/impl/NfcOpImpl;->a(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$ModifyMsgParam;)V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/impl/NfcOpImpl;Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;ILcom/jieli/jl_rcsp/task/TaskListener;)V
    .locals 0

    .line 4
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/jieli/jl_rcsp/impl/NfcOpImpl;->a(Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;ILcom/jieli/jl_rcsp/task/TaskListener;)V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/impl/NfcOpImpl;Landroid/bluetooth/BluetoothDevice;S)V
    .locals 0

    .line 6
    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/impl/NfcOpImpl;->a(Landroid/bluetooth/BluetoothDevice;S)V

    return-void
.end method

.method public static synthetic b(Lcom/jieli/jl_rcsp/impl/NfcOpImpl;)S
    .locals 0

    .line 1
    iget-short p0, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl;->e:S

    return p0
.end method

.method public static synthetic c(Lcom/jieli/jl_rcsp/impl/NfcOpImpl;)Lcom/jieli/jl_rcsp/task/ITask;
    .locals 0

    iget-object p0, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl;->c:Lcom/jieli/jl_rcsp/task/ITask;

    return-object p0
.end method

.method public static synthetic d(Lcom/jieli/jl_rcsp/impl/NfcOpImpl;)Lcom/jieli/jl_rcsp/impl/RcspOpImpl;
    .locals 0

    iget-object p0, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    return-object p0
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    const-string v0, ""

    if-nez p1, :cond_0

    return-object v0

    .line 20
    :cond_0
    const-string v1, "/"

    invoke-virtual {p1, v1}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_1

    return-object p1

    .line 21
    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    if-ne v1, v2, :cond_2

    return-object v0

    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 22
    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final a(Landroid/bluetooth/BluetoothDevice;ILcom/jieli/jl_rcsp/interfaces/nfc/OnSyncNfcMsgListener;)V
    .locals 2

    .line 23
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl;->c:Lcom/jieli/jl_rcsp/task/ITask;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/jieli/jl_rcsp/task/ITask;->isRun()Z

    move-result v0

    if-nez v0, :cond_1

    .line 24
    :cond_0
    new-instance v0, Lcom/jieli/jl_rcsp/task/nfc/NfcSyncTask;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-direct {v0, v1, p1, p2}, Lcom/jieli/jl_rcsp/task/nfc/NfcSyncTask;-><init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;Landroid/bluetooth/BluetoothDevice;I)V

    iput-object v0, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl;->c:Lcom/jieli/jl_rcsp/task/ITask;

    .line 25
    new-instance p1, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$8;

    invoke-direct {p1, p0, p3}, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$8;-><init>(Lcom/jieli/jl_rcsp/impl/NfcOpImpl;Lcom/jieli/jl_rcsp/interfaces/nfc/OnSyncNfcMsgListener;)V

    invoke-interface {v0, p1}, Lcom/jieli/jl_rcsp/task/ITask;->setListener(Lcom/jieli/jl_rcsp/task/TaskListener;)V

    .line 26
    :cond_1
    iget-object p1, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl;->c:Lcom/jieli/jl_rcsp/task/ITask;

    invoke-interface {p1}, Lcom/jieli/jl_rcsp/task/ITask;->start()V

    return-void
.end method

.method public final a(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$ModifyMsgParam;)V
    .locals 12

    .line 27
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl;->d:Ljava/util/List;

    if-eqz v0, :cond_5

    if-eqz p2, :cond_5

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$ModifyMsgParam;->getValue()[B

    move-result-object v0

    if-nez v0, :cond_0

    goto/16 :goto_4

    .line 28
    :cond_0
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$ModifyMsgParam;->getId()S

    move-result v0

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/impl/NfcOpImpl;->getNfcMsgByID(S)Lcom/jieli/jl_rcsp/model/device/NfcMsg;

    move-result-object v0

    if-nez v0, :cond_1

    goto/16 :goto_4

    .line 29
    :cond_1
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$ModifyMsgParam;->getMask()I

    move-result v1

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/jieli/jl_rcsp/util/RcspUtil;->checkMaskHasBit(IB)Z

    move-result v1

    .line 30
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$ModifyMsgParam;->getMask()I

    move-result v3

    const/4 v4, 0x1

    invoke-static {v3, v4}, Lcom/jieli/jl_rcsp/util/RcspUtil;->checkMaskHasBit(IB)Z

    move-result v3

    .line 31
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$ModifyMsgParam;->getValue()[B

    move-result-object p2

    .line 32
    sget-object v5, Lcom/jieli/jl_rcsp/impl/NfcOpImpl;->g:Ljava/lang/String;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "hasTime : "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v7, ", hasNickname = "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v7, ",  value : "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length v7, p2

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const-string v7, "modifyNfcMsg"

    invoke-static {v5, v7, v6}, Lcom/jieli/jl_rcsp/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v1, :cond_3

    .line 33
    array-length v1, p2

    const/4 v6, 0x4

    if-gt v6, v1, :cond_3

    .line 34
    invoke-static {p2, v2, v6}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([BII)I

    move-result v1

    .line 35
    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/RcspUtil;->intToTime(I)J

    move-result-wide v8

    .line 36
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "realTime : "

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v10, ", UpdateTime = "

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/device/NfcMsg;->getUpdateTime()J

    move-result-wide v10

    invoke-virtual {v1, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v5, v7, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/device/NfcMsg;->getUpdateTime()J

    move-result-wide v10

    cmp-long v1, v10, v8

    if-eqz v1, :cond_2

    .line 38
    invoke-virtual {v0, v8, v9}, Lcom/jieli/jl_rcsp/model/device/NfcMsg;->setUpdateTime(J)Lcom/jieli/jl_rcsp/model/device/NfcMsg;

    move v1, v4

    :goto_0
    move v2, v6

    goto :goto_1

    :cond_2
    move v1, v2

    goto :goto_0

    :cond_3
    move v1, v2

    :goto_1
    if-eqz v3, :cond_4

    add-int/lit8 v3, v2, 0x18

    .line 39
    array-length v5, p2

    if-gt v3, v5, :cond_4

    .line 40
    :try_start_0
    new-instance v3, Ljava/lang/String;

    const/16 v5, 0x18

    invoke-direct {v3, p2, v2, v5}, Ljava/lang/String;-><init>([BII)V

    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p2

    .line 41
    invoke-virtual {p2}, Ljava/lang/Throwable;->printStackTrace()V

    const/4 p2, 0x0

    .line 42
    :goto_2
    sget-object v2, Lcom/jieli/jl_rcsp/impl/NfcOpImpl;->g:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "name : "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, ", Nickname = "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/device/NfcMsg;->getNickname()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v7, v3}, Lcom/jieli/jl_rcsp/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p2, :cond_4

    .line 43
    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/device/NfcMsg;->getNickname()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_4

    .line 44
    invoke-virtual {v0, p2}, Lcom/jieli/jl_rcsp/model/device/NfcMsg;->setNickname(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/device/NfcMsg;

    goto :goto_3

    :cond_4
    move v4, v1

    :goto_3
    if-eqz v4, :cond_5

    .line 45
    sget-object p2, Lcom/jieli/jl_rcsp/impl/NfcOpImpl;->g:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "nfcMsg = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {p2, v7, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    iget-object p2, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl;->b:Lcom/jieli/jl_rcsp/tool/NfcEventCbHelper;

    invoke-virtual {p2, p1, v0}, Lcom/jieli/jl_rcsp/tool/NfcEventCbHelper;->onModifyNfcMsg(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/NfcMsg;)V

    .line 47
    iget-object p2, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl;->b:Lcom/jieli/jl_rcsp/tool/NfcEventCbHelper;

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl;->d:Ljava/util/List;

    invoke-virtual {p2, p1, v0}, Lcom/jieli/jl_rcsp/tool/NfcEventCbHelper;->onNfcMsgChange(Landroid/bluetooth/BluetoothDevice;Ljava/util/List;)V

    :cond_5
    :goto_4
    return-void
.end method

.method public final a(Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;ILcom/jieli/jl_rcsp/task/TaskListener;)V
    .locals 7

    .line 10
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl;->c:Lcom/jieli/jl_rcsp/task/ITask;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Lcom/jieli/jl_rcsp/task/ITask;->isRun()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 11
    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl;->c:Lcom/jieli/jl_rcsp/task/ITask;

    invoke-interface {v0}, Lcom/jieli/jl_rcsp/task/ITask;->isRun()Z

    move-result v0

    if-eqz v0, :cond_3

    if-eqz p4, :cond_1

    const/16 p1, 0x1100

    .line 12
    const-string p2, "Operation is in operation."

    invoke-interface {p4, p1, p2}, Lcom/jieli/jl_rcsp/task/TaskListener;->onError(ILjava/lang/String;)V

    :cond_1
    return-void

    .line 13
    :cond_2
    :goto_0
    new-instance v0, Lcom/jieli/jl_rcsp/task/TransferTask$Param;

    invoke-direct {v0}, Lcom/jieli/jl_rcsp/task/TransferTask$Param;-><init>()V

    .line 14
    iput p3, v0, Lcom/jieli/jl_rcsp/task/TransferTask$Param;->devHandler:I

    .line 15
    new-instance v1, Lcom/jieli/jl_rcsp/task/TransferTask;

    iget-object v2, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-direct {v1, v2, p2, v0}, Lcom/jieli/jl_rcsp/task/TransferTask;-><init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;Ljava/lang/String;Lcom/jieli/jl_rcsp/task/TransferTask$Param;)V

    iput-object v1, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl;->c:Lcom/jieli/jl_rcsp/task/ITask;

    .line 16
    :cond_3
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl;->c:Lcom/jieli/jl_rcsp/task/ITask;

    new-instance v1, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$7;

    move-object v2, p0

    move-object v4, p1

    move-object v6, p2

    move v5, p3

    move-object v3, p4

    invoke-direct/range {v1 .. v6}, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$7;-><init>(Lcom/jieli/jl_rcsp/impl/NfcOpImpl;Lcom/jieli/jl_rcsp/task/TaskListener;Landroid/bluetooth/BluetoothDevice;ILjava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/jieli/jl_rcsp/task/ITask;->setListener(Lcom/jieli/jl_rcsp/task/TaskListener;)V

    .line 17
    iget-object p1, v2, Lcom/jieli/jl_rcsp/impl/NfcOpImpl;->c:Lcom/jieli/jl_rcsp/task/ITask;

    check-cast p1, Lcom/jieli/jl_rcsp/task/TransferTask;

    invoke-virtual {p1, v6}, Lcom/jieli/jl_rcsp/task/TransferTask;->setPath(Ljava/lang/String;)V

    .line 18
    sget-object p1, Lcom/jieli/jl_rcsp/impl/NfcOpImpl;->g:Ljava/lang/String;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Task =  "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p3, v2, Lcom/jieli/jl_rcsp/impl/NfcOpImpl;->c:Lcom/jieli/jl_rcsp/task/ITask;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p3, " start"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string p3, "startTransferTask"

    invoke-static {p1, p3, p2}, Lcom/jieli/jl_rcsp/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    iget-object p1, v2, Lcom/jieli/jl_rcsp/impl/NfcOpImpl;->c:Lcom/jieli/jl_rcsp/task/ITask;

    invoke-interface {p1}, Lcom/jieli/jl_rcsp/task/ITask;->start()V

    return-void
.end method

.method public final a(Landroid/bluetooth/BluetoothDevice;S)V
    .locals 1

    .line 48
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl;->d:Ljava/util/List;

    if-nez v0, :cond_0

    goto :goto_0

    .line 49
    :cond_0
    invoke-virtual {p0, p2}, Lcom/jieli/jl_rcsp/impl/NfcOpImpl;->getNfcMsgByID(S)Lcom/jieli/jl_rcsp/model/device/NfcMsg;

    move-result-object p2

    if-nez p2, :cond_1

    goto :goto_0

    .line 50
    :cond_1
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl;->d:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    .line 51
    iget-object p2, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl;->b:Lcom/jieli/jl_rcsp/tool/NfcEventCbHelper;

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl;->d:Ljava/util/List;

    invoke-virtual {p2, p1, v0}, Lcom/jieli/jl_rcsp/tool/NfcEventCbHelper;->onNfcMsgChange(Landroid/bluetooth/BluetoothDevice;Ljava/util/List;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public addNfcFile(Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;ILcom/jieli/jl_rcsp/task/TaskListener;)V
    .locals 10

    sget-object v0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl;->g:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "path : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "addNfcFile"

    invoke-static {v0, v2, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    move-result v1

    if-nez v1, :cond_1

    :cond_0
    move-object v9, p4

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v3

    long-to-int v3, v3

    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {p3, v3, v0}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildInsertNfcFileCmd(IILjava/lang/String;)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object v0

    new-instance v3, Lcom/jieli/jl_rcsp/tool/BooleanNfcActionCallback;

    new-instance v4, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$2;

    move-object v5, p0

    move-object v6, p1

    move-object v7, p2

    move v8, p3

    move-object v9, p4

    invoke-direct/range {v4 .. v9}, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$2;-><init>(Lcom/jieli/jl_rcsp/impl/NfcOpImpl;Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;ILcom/jieli/jl_rcsp/task/TaskListener;)V

    invoke-direct {v3, v2, v4}, Lcom/jieli/jl_rcsp/tool/BooleanNfcActionCallback;-><init>(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V

    invoke-virtual {v1, v6, v0, v3}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    return-void

    :goto_0
    if-eqz v9, :cond_2

    const/4 p1, 0x4

    const-string p2, "File not found."

    invoke-interface {v9, p1, p2}, Lcom/jieli/jl_rcsp/task/TaskListener;->onError(ILjava/lang/String;)V

    :cond_2
    return-void
.end method

.method public addOnNfcEventCallback(Lcom/jieli/jl_rcsp/interfaces/nfc/OnNfcEventCallback;)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl;->b:Lcom/jieli/jl_rcsp/tool/NfcEventCbHelper;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;->registerCallback(Ljava/lang/Object;)V

    return-void
.end method

.method public final b()V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl;->c:Lcom/jieli/jl_rcsp/task/ITask;

    if-eqz v0, :cond_1

    .line 3
    invoke-interface {v0}, Lcom/jieli/jl_rcsp/task/ITask;->isRun()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl;->c:Lcom/jieli/jl_rcsp/task/ITask;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/jieli/jl_rcsp/task/ITask;->cancel(B)V

    :cond_0
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl;->c:Lcom/jieli/jl_rcsp/task/ITask;

    :cond_1
    return-void
.end method

.method public destroy()V
    .locals 2

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/impl/NfcOpImpl;->b()V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl;->f:Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->unregisterOnRcspCallback(Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;)V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl;->b:Lcom/jieli/jl_rcsp/tool/NfcEventCbHelper;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;->release()V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    const/16 v0, 0xff

    iput-short v0, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl;->e:S

    return-void
.end method

.method public getDefaultNfc(Landroid/bluetooth/BluetoothDevice;ILcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/bluetooth/BluetoothDevice;",
            "I",
            "Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback<",
            "Ljava/lang/Short;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-static {p2}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildGetDefaultNfcOpCmd(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p2

    new-instance v1, Lcom/jieli/jl_rcsp/tool/CustomRcspActionCallback;

    new-instance v2, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$5;

    invoke-direct {v2, p0}, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$5;-><init>(Lcom/jieli/jl_rcsp/impl/NfcOpImpl;)V

    const-string v3, "getDefaultNfc"

    invoke-direct {v1, v3, p3, v2}, Lcom/jieli/jl_rcsp/tool/CustomRcspActionCallback;-><init>(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;Lcom/jieli/jl_rcsp/interfaces/IHandleResult;)V

    invoke-virtual {v0, p1, p2, v1}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    return-void
.end method

.method public getDefaultNfcId()S
    .locals 1

    iget-short v0, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl;->e:S

    return v0
.end method

.method public getNfcMsgByID(S)Lcom/jieli/jl_rcsp/model/device/NfcMsg;
    .locals 4

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl;->d:Ljava/util/List;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/jieli/jl_rcsp/model/device/NfcMsg;

    invoke-virtual {v2}, Lcom/jieli/jl_rcsp/model/device/NfcMsg;->getId()S

    move-result v3

    if-ne v3, p1, :cond_1

    return-object v2

    :cond_2
    return-object v1
.end method

.method public getNfcMsgList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/model/device/NfcMsg;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl;->d:Ljava/util/List;

    return-object v0
.end method

.method public modifyNfcMsg(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$ModifyMsgParam;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/bluetooth/BluetoothDevice;",
            "Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$ModifyMsgParam;",
            "Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-static {p2}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildModifyNFCInfoCmd(Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$ModifyMsgParam;)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_rcsp/tool/BooleanNfcActionCallback;

    new-instance v3, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$3;

    invoke-direct {v3, p0, p1, p2, p3}, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$3;-><init>(Lcom/jieli/jl_rcsp/impl/NfcOpImpl;Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$ModifyMsgParam;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V

    const-string p2, "modifyNfcMsg"

    invoke-direct {v2, p2, v3}, Lcom/jieli/jl_rcsp/tool/BooleanNfcActionCallback;-><init>(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V

    invoke-virtual {v0, p1, v1, v2}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    return-void
.end method

.method public removeNfcMsg(Landroid/bluetooth/BluetoothDevice;ISLcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/bluetooth/BluetoothDevice;",
            "IS",
            "Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-static {p2, p3}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildDeleteNFCInfoSyncCmd(IS)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p2

    new-instance v1, Lcom/jieli/jl_rcsp/tool/BooleanNfcActionCallback;

    new-instance v2, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$4;

    invoke-direct {v2, p0, p1, p3, p4}, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$4;-><init>(Lcom/jieli/jl_rcsp/impl/NfcOpImpl;Landroid/bluetooth/BluetoothDevice;SLcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V

    const-string p3, "removeNfcMsg"

    invoke-direct {v1, p3, v2}, Lcom/jieli/jl_rcsp/tool/BooleanNfcActionCallback;-><init>(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V

    invoke-virtual {v0, p1, p2, v1}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    return-void
.end method

.method public removeOnNfcEventCallback(Lcom/jieli/jl_rcsp/interfaces/nfc/OnNfcEventCallback;)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl;->b:Lcom/jieli/jl_rcsp/tool/NfcEventCbHelper;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;->registerCallback(Ljava/lang/Object;)V

    return-void
.end method

.method public setDefaultNfc(Landroid/bluetooth/BluetoothDevice;ISLcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/bluetooth/BluetoothDevice;",
            "IS",
            "Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-static {p2, p3}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildSetDefaultNfcOpCmd(IS)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p2

    new-instance v1, Lcom/jieli/jl_rcsp/tool/BooleanNfcActionCallback;

    new-instance v2, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$6;

    invoke-direct {v2, p0, p3, p1, p4}, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$6;-><init>(Lcom/jieli/jl_rcsp/impl/NfcOpImpl;SLandroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V

    const-string p3, "setDefaultNfc"

    invoke-direct {v1, p3, v2}, Lcom/jieli/jl_rcsp/tool/BooleanNfcActionCallback;-><init>(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V

    invoke-virtual {v0, p1, p2, v1}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    return-void
.end method

.method public syncNfcMsg(Landroid/bluetooth/BluetoothDevice;ILcom/jieli/jl_rcsp/interfaces/nfc/OnSyncNfcMsgListener;)V
    .locals 1

    new-instance v0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$1;

    invoke-direct {v0, p0, p3, p1}, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$1;-><init>(Lcom/jieli/jl_rcsp/impl/NfcOpImpl;Lcom/jieli/jl_rcsp/interfaces/nfc/OnSyncNfcMsgListener;Landroid/bluetooth/BluetoothDevice;)V

    invoke-virtual {p0, p1, p2, v0}, Lcom/jieli/jl_rcsp/impl/NfcOpImpl;->a(Landroid/bluetooth/BluetoothDevice;ILcom/jieli/jl_rcsp/interfaces/nfc/OnSyncNfcMsgListener;)V

    return-void
.end method
