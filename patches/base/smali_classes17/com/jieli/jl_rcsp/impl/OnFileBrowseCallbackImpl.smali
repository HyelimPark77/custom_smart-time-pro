.class public Lcom/jieli/jl_rcsp/impl/OnFileBrowseCallbackImpl;
.super Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_filebrowse/interfaces/OnFileBrowseCallback;
.implements Lcom/jieli/jl_filebrowse/interfaces/lrc/OnLrcCallback;


# static fields
.field public static final d:Ljava/lang/String; = "OnFileBrowseCallbackImpl"


# instance fields
.field public final a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

.field public final b:Lcom/jieli/jl_filebrowse/interfaces/OnFileBrowseCallback;

.field public final c:Lcom/jieli/jl_filebrowse/interfaces/lrc/OnLrcCallback;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;Lcom/jieli/jl_filebrowse/interfaces/OnFileBrowseCallback;Lcom/jieli/jl_filebrowse/interfaces/lrc/OnLrcCallback;)V
    .locals 0

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;-><init>()V

    iput-object p1, p0, Lcom/jieli/jl_rcsp/impl/OnFileBrowseCallbackImpl;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    iput-object p2, p0, Lcom/jieli/jl_rcsp/impl/OnFileBrowseCallbackImpl;->b:Lcom/jieli/jl_filebrowse/interfaces/OnFileBrowseCallback;

    iput-object p3, p0, Lcom/jieli/jl_rcsp/impl/OnFileBrowseCallbackImpl;->c:Lcom/jieli/jl_filebrowse/interfaces/lrc/OnLrcCallback;

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/impl/OnFileBrowseCallbackImpl;[BLandroid/bluetooth/BluetoothDevice;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/impl/OnFileBrowseCallbackImpl;->a([BLandroid/bluetooth/BluetoothDevice;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public OnFlayCallback(Z)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/OnFileBrowseCallbackImpl;->b:Lcom/jieli/jl_filebrowse/interfaces/OnFileBrowseCallback;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/jieli/jl_filebrowse/interfaces/OnFileBrowseCallback;->OnFlayCallback(Z)V

    :cond_0
    return-void
.end method

.method public final a([BLandroid/bluetooth/BluetoothDevice;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B",
            "Landroid/bluetooth/BluetoothDevice;",
            ")",
            "Ljava/util/List<",
            "Lcom/jieli/jl_filebrowse/bean/SDCardBean;",
            ">;"
        }
    .end annotation

    .line 28
    new-instance v0, Lcom/jieli/jl_rcsp/model/device/DevStorageInfo;

    invoke-direct {v0}, Lcom/jieli/jl_rcsp/model/device/DevStorageInfo;-><init>()V

    .line 29
    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/model/device/DevStorageInfo;->parseData([B)V

    .line 30
    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/device/DevStorageInfo;->getStorageStates()Ljava/util/List;

    move-result-object p1

    .line 31
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 32
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/jieli/jl_rcsp/model/device/DevStorageState;

    .line 33
    invoke-virtual {v1}, Lcom/jieli/jl_rcsp/model/device/DevStorageState;->getIndex()I

    move-result v2

    .line 34
    new-instance v3, Lcom/jieli/jl_filebrowse/bean/SDCardBean;

    invoke-direct {v3}, Lcom/jieli/jl_filebrowse/bean/SDCardBean;-><init>()V

    .line 35
    invoke-virtual {v3, p2}, Lcom/jieli/jl_filebrowse/bean/SDCardBean;->setDevice(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_filebrowse/bean/SDCardBean;

    move-result-object v3

    .line 36
    invoke-virtual {v1}, Lcom/jieli/jl_rcsp/model/device/DevStorageState;->getIndex()I

    move-result v4

    invoke-virtual {v3, v4}, Lcom/jieli/jl_filebrowse/bean/SDCardBean;->setIndex(I)Lcom/jieli/jl_filebrowse/bean/SDCardBean;

    move-result-object v3

    .line 37
    invoke-virtual {v1}, Lcom/jieli/jl_rcsp/model/device/DevStorageState;->isOnline()Z

    move-result v4

    invoke-virtual {v3, v4}, Lcom/jieli/jl_filebrowse/bean/SDCardBean;->setOnline(Z)Lcom/jieli/jl_filebrowse/bean/SDCardBean;

    move-result-object v3

    .line 38
    invoke-virtual {v1}, Lcom/jieli/jl_rcsp/model/device/DevStorageState;->getHandle()I

    move-result v1

    invoke-virtual {v3, v1}, Lcom/jieli/jl_filebrowse/bean/SDCardBean;->setDevHandler(I)Lcom/jieli/jl_filebrowse/bean/SDCardBean;

    move-result-object v1

    .line 39
    invoke-static {v2}, Lcom/jieli/jl_filebrowse/FileBrowseUtil;->getDevName(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/jieli/jl_filebrowse/bean/SDCardBean;->setName(Ljava/lang/String;)Lcom/jieli/jl_filebrowse/bean/SDCardBean;

    move-result-object v1

    .line 40
    invoke-static {v2}, Lcom/jieli/jl_filebrowse/bean/SDCardBean;->getStorageType(I)I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/jieli/jl_filebrowse/bean/SDCardBean;->setType(I)Lcom/jieli/jl_filebrowse/bean/SDCardBean;

    move-result-object v1

    .line 41
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 42
    :cond_0
    iget-object p1, p0, Lcom/jieli/jl_rcsp/impl/OnFileBrowseCallbackImpl;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->getDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    move-result-object p1

    .line 43
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    if-nez p1, :cond_1

    .line 44
    new-instance p1, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    invoke-direct {p1}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;-><init>()V

    .line 45
    :cond_1
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/jieli/jl_filebrowse/bean/SDCardBean;

    .line 46
    sget-object v2, Lcom/jieli/jl_rcsp/impl/OnFileBrowseCallbackImpl;->d:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "sd--->"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Lcom/jieli/jl_filebrowse/bean/SDCardBean;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v4, "covert"

    invoke-static {v2, v4, v3}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    invoke-virtual {v1}, Lcom/jieli/jl_filebrowse/bean/SDCardBean;->getIndex()I

    move-result v2

    if-nez v2, :cond_2

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->isSupportUsb()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 48
    invoke-interface {p2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 49
    :cond_2
    invoke-virtual {v1}, Lcom/jieli/jl_filebrowse/bean/SDCardBean;->getIndex()I

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_3

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->isSupportSd0()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 50
    invoke-interface {p2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 51
    :cond_3
    invoke-virtual {v1}, Lcom/jieli/jl_filebrowse/bean/SDCardBean;->getIndex()I

    move-result v2

    const/4 v3, 0x2

    if-ne v2, v3, :cond_4

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->isSupportSd1()Z

    move-result v2

    if-eqz v2, :cond_4

    .line 52
    invoke-interface {p2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 53
    :cond_4
    invoke-interface {p2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_5
    return-object p2
.end method

.method public final a(Landroid/bluetooth/BluetoothDevice;)V
    .locals 3

    .line 25
    new-instance v0, Lcom/jieli/jl_rcsp/model/parameter/GetSysInfoParam;

    const/4 v1, -0x1

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/jieli/jl_rcsp/model/parameter/GetSysInfoParam;-><init>(BI)V

    .line 26
    new-instance v1, Lcom/jieli/jl_rcsp/model/command/sys/GetSysInfoCmd;

    invoke-direct {v1, v0}, Lcom/jieli/jl_rcsp/model/command/sys/GetSysInfoCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/GetSysInfoParam;)V

    .line 27
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/OnFileBrowseCallbackImpl;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    new-instance v2, Lcom/jieli/jl_rcsp/impl/OnFileBrowseCallbackImpl$1;

    invoke-direct {v2, p0}, Lcom/jieli/jl_rcsp/impl/OnFileBrowseCallbackImpl$1;-><init>(Lcom/jieli/jl_rcsp/impl/OnFileBrowseCallbackImpl;)V

    invoke-virtual {v0, p1, v1, v2}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    return-void
.end method

.method public final a(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;)V
    .locals 4

    if-nez p2, :cond_0

    goto/16 :goto_3

    .line 2
    :cond_0
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getId()I

    move-result v0

    const/16 v1, 0x9

    const/4 v2, 0x2

    if-eq v0, v1, :cond_9

    const/16 v1, 0xd

    const/4 v3, 0x0

    if-eq v0, v1, :cond_5

    const/16 v1, 0x10

    if-eq v0, v1, :cond_3

    const/16 p1, 0xf2

    if-eq v0, p1, :cond_1

    goto/16 :goto_3

    .line 3
    :cond_1
    check-cast p2, Lcom/jieli/jl_rcsp/model/command/file_op/NotifyFileStructureChangeCmd;

    .line 4
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getParam()Lcom/jieli/jl_rcsp/model/base/BaseParameter;

    move-result-object p1

    check-cast p1, Lcom/jieli/jl_rcsp/model/command/file_op/NotifyFileStructureChangeCmd$Param;

    if-nez p1, :cond_2

    goto/16 :goto_3

    .line 5
    :cond_2
    new-instance p2, Lcom/jieli/jl_filebrowse/bean/FileChangeInfo;

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/command/file_op/NotifyFileStructureChangeCmd$Param;->getDevHandle()I

    move-result v0

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/command/file_op/NotifyFileStructureChangeCmd$Param;->getOp()I

    move-result v1

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/command/file_op/NotifyFileStructureChangeCmd$Param;->getCluster()I

    move-result v2

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/command/file_op/NotifyFileStructureChangeCmd$Param;->getFilePath()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, v0, v1, v2, p1}, Lcom/jieli/jl_filebrowse/bean/FileChangeInfo;-><init>(IIILjava/lang/String;)V

    invoke-virtual {p0, p2}, Lcom/jieli/jl_rcsp/impl/OnFileBrowseCallbackImpl;->onFileStructureChange(Lcom/jieli/jl_filebrowse/bean/FileChangeInfo;)V

    return-void

    .line 6
    :cond_3
    check-cast p2, Lcom/jieli/jl_rcsp/model/command/file_op/StopLrcGetCmd;

    .line 7
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getStatus()I

    move-result v0

    if-eqz v0, :cond_4

    .line 8
    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/impl/OnFileBrowseCallbackImpl;->onLrcReadFailed(I)V

    .line 9
    :cond_4
    invoke-virtual {p2, v3}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    .line 10
    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/impl/OnFileBrowseCallbackImpl;->b(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;)V

    return-void

    .line 11
    :cond_5
    check-cast p2, Lcom/jieli/jl_rcsp/model/command/file_op/StopFileBrowseCmd;

    .line 12
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getParam()Lcom/jieli/jl_rcsp/model/base/BaseParameter;

    move-result-object v0

    check-cast v0, Lcom/jieli/jl_rcsp/model/parameter/StopFileBrowseParam;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/parameter/StopFileBrowseParam;->getReason()B

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_7

    if-eq v0, v1, :cond_7

    if-eq v0, v2, :cond_6

    .line 13
    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/impl/OnFileBrowseCallbackImpl;->onFileReadFailed(I)V

    goto :goto_1

    .line 14
    :cond_6
    invoke-virtual {p0, v1}, Lcom/jieli/jl_rcsp/impl/OnFileBrowseCallbackImpl;->OnFlayCallback(Z)V

    goto :goto_1

    :cond_7
    if-ne v0, v1, :cond_8

    goto :goto_0

    :cond_8
    move v1, v3

    .line 15
    :goto_0
    invoke-virtual {p0, v1}, Lcom/jieli/jl_rcsp/impl/OnFileBrowseCallbackImpl;->onFileReadStop(Z)V

    .line 16
    :goto_1
    invoke-virtual {p2, v3}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    .line 17
    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/impl/OnFileBrowseCallbackImpl;->b(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;)V

    return-void

    .line 18
    :cond_9
    check-cast p2, Lcom/jieli/jl_rcsp/model/command/sys/UpdateSysInfoCmd;

    .line 19
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getParam()Lcom/jieli/jl_rcsp/model/base/BaseParameter;

    move-result-object p2

    check-cast p2, Lcom/jieli/jl_rcsp/model/parameter/UpdateSysInfoParam;

    .line 20
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/parameter/UpdateSysInfoParam;->getFunction()B

    move-result v0

    const/16 v1, 0xff

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_b

    .line 21
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/parameter/UpdateSysInfoParam;->getAttrBeanList()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_a
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/jieli/jl_rcsp/model/device/AttrBean;

    .line 22
    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/device/AttrBean;->getType()B

    move-result v3

    and-int/2addr v3, v1

    if-ne v3, v2, :cond_a

    .line 23
    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/device/AttrBean;->getAttrData()[B

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lcom/jieli/jl_rcsp/impl/OnFileBrowseCallbackImpl;->a([BLandroid/bluetooth/BluetoothDevice;)Ljava/util/List;

    move-result-object v0

    .line 24
    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/impl/OnFileBrowseCallbackImpl;->onSdCardChange(Ljava/util/List;)V

    goto :goto_2

    :cond_b
    :goto_3
    return-void
.end method

.method public final b(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;)V
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/OnFileBrowseCallbackImpl;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, p2, v1}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendCommandResponse(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    return-void
.end method

.method public onBluetoothConnectionChange(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/OnFileBrowseCallbackImpl;->b:Lcom/jieli/jl_filebrowse/interfaces/OnFileBrowseCallback;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2}, Lcom/jieli/jl_filebrowse/interfaces/OnFileBrowseCallback;->onBluetoothConnectionChange(Landroid/bluetooth/BluetoothDevice;I)V

    :cond_0
    return-void
.end method

.method public onConnectStateChange(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 1

    invoke-super {p0, p1, p2}, Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;->onConnectStateChange(Landroid/bluetooth/BluetoothDevice;I)V

    if-nez p2, :cond_0

    invoke-static {}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->getInstance()Lcom/jieli/jl_filebrowse/FileBrowseManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->isInit()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->getInstance()Lcom/jieli/jl_filebrowse/FileBrowseManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->cleanCache(Landroid/bluetooth/BluetoothDevice;)V

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/impl/OnFileBrowseCallbackImpl;->onBluetoothConnectionChange(Landroid/bluetooth/BluetoothDevice;I)V

    return-void
.end method

.method public onFileDataReceive([B)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/OnFileBrowseCallbackImpl;->b:Lcom/jieli/jl_filebrowse/interfaces/OnFileBrowseCallback;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/jieli/jl_filebrowse/interfaces/OnFileBrowseCallback;->onFileDataReceive([B)V

    :cond_0
    return-void
.end method

.method public onFileReadFailed(I)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/OnFileBrowseCallbackImpl;->b:Lcom/jieli/jl_filebrowse/interfaces/OnFileBrowseCallback;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/jieli/jl_filebrowse/interfaces/OnFileBrowseCallback;->onFileReadFailed(I)V

    :cond_0
    return-void
.end method

.method public onFileReadStart()V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/OnFileBrowseCallbackImpl;->b:Lcom/jieli/jl_filebrowse/interfaces/OnFileBrowseCallback;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/jieli/jl_filebrowse/interfaces/OnFileBrowseCallback;->onFileReadStart()V

    :cond_0
    return-void
.end method

.method public onFileReadStop(Z)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/OnFileBrowseCallbackImpl;->b:Lcom/jieli/jl_filebrowse/interfaces/OnFileBrowseCallback;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/jieli/jl_filebrowse/interfaces/OnFileBrowseCallback;->onFileReadStop(Z)V

    :cond_0
    return-void
.end method

.method public onFileStructureChange(Lcom/jieli/jl_filebrowse/bean/FileChangeInfo;)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/OnFileBrowseCallbackImpl;->b:Lcom/jieli/jl_filebrowse/interfaces/OnFileBrowseCallback;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/jieli/jl_filebrowse/interfaces/OnFileBrowseCallback;->onFileStructureChange(Lcom/jieli/jl_filebrowse/bean/FileChangeInfo;)V

    :cond_0
    return-void
.end method

.method public onLrcDataReceive([B)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/OnFileBrowseCallbackImpl;->c:Lcom/jieli/jl_filebrowse/interfaces/lrc/OnLrcCallback;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/jieli/jl_filebrowse/interfaces/lrc/OnLrcCallback;->onLrcDataReceive([B)V

    :cond_0
    return-void
.end method

.method public onLrcReadFailed(I)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/OnFileBrowseCallbackImpl;->c:Lcom/jieli/jl_filebrowse/interfaces/lrc/OnLrcCallback;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/jieli/jl_filebrowse/interfaces/lrc/OnLrcCallback;->onLrcReadFailed(I)V

    :cond_0
    return-void
.end method

.method public onLrcReadStart()V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/OnFileBrowseCallbackImpl;->c:Lcom/jieli/jl_filebrowse/interfaces/lrc/OnLrcCallback;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/jieli/jl_filebrowse/interfaces/lrc/OnLrcCallback;->onLrcReadStart()V

    :cond_0
    return-void
.end method

.method public onLrcReadStop()V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/OnFileBrowseCallbackImpl;->c:Lcom/jieli/jl_filebrowse/interfaces/lrc/OnLrcCallback;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/jieli/jl_filebrowse/interfaces/lrc/OnLrcCallback;->onLrcReadStop()V

    :cond_0
    return-void
.end method

.method public onRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;)V
    .locals 2

    invoke-super {p0, p1, p2}, Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;->onRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getId()I

    move-result v0

    const/16 v1, 0x9

    if-eq v0, v1, :cond_0

    const/16 v1, 0xd

    if-eq v0, v1, :cond_0

    const/16 v1, 0x10

    if-eq v0, v1, :cond_0

    const/16 v1, 0xf2

    if-eq v0, v1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/impl/OnFileBrowseCallbackImpl;->a(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;)V

    return-void
.end method

.method public onRcspDataCmd(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;)V
    .locals 1

    invoke-super {p0, p1, p2}, Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;->onRcspDataCmd(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getId()I

    move-result p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    goto :goto_0

    :cond_0
    check-cast p2, Lcom/jieli/jl_rcsp/model/command/data/DataCmd;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getParam()Lcom/jieli/jl_rcsp/model/base/BaseParameter;

    move-result-object p1

    check-cast p1, Lcom/jieli/jl_rcsp/model/parameter/DataParam;

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/base/BaseParameter;->getXmOpCode()I

    move-result p2

    const/16 v0, 0xc

    if-eq p2, v0, :cond_2

    const/16 v0, 0xf

    if-eq p2, v0, :cond_1

    :goto_0
    return-void

    :cond_1
    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/parameter/DataParam;->getData()[B

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/impl/OnFileBrowseCallbackImpl;->onLrcDataReceive([B)V

    return-void

    :cond_2
    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/parameter/DataParam;->getData()[B

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/impl/OnFileBrowseCallbackImpl;->onFileDataReceive([B)V

    return-void
.end method

.method public onRcspInit(Landroid/bluetooth/BluetoothDevice;Z)V
    .locals 0

    if-eqz p2, :cond_0

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/impl/OnFileBrowseCallbackImpl;->a(Landroid/bluetooth/BluetoothDevice;)V

    :cond_0
    return-void
.end method

.method public onSdCardChange(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/jieli/jl_filebrowse/bean/SDCardBean;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/OnFileBrowseCallbackImpl;->b:Lcom/jieli/jl_filebrowse/interfaces/OnFileBrowseCallback;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/jieli/jl_filebrowse/interfaces/OnFileBrowseCallback;->onSdCardChange(Ljava/util/List;)V

    :cond_0
    return-void
.end method
