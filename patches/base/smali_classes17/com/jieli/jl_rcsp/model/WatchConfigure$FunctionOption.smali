.class public Lcom/jieli/jl_rcsp/model/WatchConfigure$FunctionOption;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/model/WatchConfigure;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "FunctionOption"
.end annotation


# instance fields
.field private final data:[B

.field private isSupportAICloud:Z

.field private isSupportAIDial:Z

.field private isSupportAlarmSetting:Z

.field private isSupportContacts:Z

.field private isSupportDialExpandInfo:Z

.field private isSupportFileBrowse:Z

.field private isSupportMessageSync:Z

.field private isSupportMusicTransfer:Z

.field private isSupportNetworkModule:Z

.field private isSupportPlatformInfo:Z

.field private isSupportSearchDevice:Z

.field private isSupportWeatherSync:Z

.field private final version:I


# direct methods
.method public constructor <init>(I[B)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/RuntimeException;
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/jieli/jl_rcsp/model/WatchConfigure$FunctionOption;->version:I

    iput-object p2, p0, Lcom/jieli/jl_rcsp/model/WatchConfigure$FunctionOption;->data:[B

    invoke-direct {p0, p1, p2}, Lcom/jieli/jl_rcsp/model/WatchConfigure$FunctionOption;->parseData(I[B)V

    return-void
.end method

.method private parseData(I[B)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/RuntimeException;
        }
    .end annotation

    if-nez p1, :cond_2

    if-eqz p2, :cond_1

    array-length p1, p2

    const/4 v0, 0x1

    if-lt p1, v0, :cond_1

    const/4 p1, 0x0

    aget-byte v1, p2, p1

    invoke-static {v1, p1}, Lcom/jieli/jl_rcsp/util/CHexConver;->checkBitValue(BI)Z

    move-result v2

    iput-boolean v2, p0, Lcom/jieli/jl_rcsp/model/WatchConfigure$FunctionOption;->isSupportContacts:Z

    invoke-static {v1, v0}, Lcom/jieli/jl_rcsp/util/CHexConver;->checkBitValue(BI)Z

    move-result v2

    iput-boolean v2, p0, Lcom/jieli/jl_rcsp/model/WatchConfigure$FunctionOption;->isSupportFileBrowse:Z

    const/4 v2, 0x2

    invoke-static {v1, v2}, Lcom/jieli/jl_rcsp/util/CHexConver;->checkBitValue(BI)Z

    move-result v3

    iput-boolean v3, p0, Lcom/jieli/jl_rcsp/model/WatchConfigure$FunctionOption;->isSupportMusicTransfer:Z

    const/4 v3, 0x3

    invoke-static {v1, v3}, Lcom/jieli/jl_rcsp/util/CHexConver;->checkBitValue(BI)Z

    move-result v4

    iput-boolean v4, p0, Lcom/jieli/jl_rcsp/model/WatchConfigure$FunctionOption;->isSupportAlarmSetting:Z

    const/4 v4, 0x4

    invoke-static {v1, v4}, Lcom/jieli/jl_rcsp/util/CHexConver;->checkBitValue(BI)Z

    move-result v4

    iput-boolean v4, p0, Lcom/jieli/jl_rcsp/model/WatchConfigure$FunctionOption;->isSupportMessageSync:Z

    const/4 v4, 0x5

    invoke-static {v1, v4}, Lcom/jieli/jl_rcsp/util/CHexConver;->checkBitValue(BI)Z

    move-result v4

    iput-boolean v4, p0, Lcom/jieli/jl_rcsp/model/WatchConfigure$FunctionOption;->isSupportWeatherSync:Z

    const/4 v4, 0x6

    invoke-static {v1, v4}, Lcom/jieli/jl_rcsp/util/CHexConver;->checkBitValue(BI)Z

    move-result v4

    iput-boolean v4, p0, Lcom/jieli/jl_rcsp/model/WatchConfigure$FunctionOption;->isSupportSearchDevice:Z

    const/4 v4, 0x7

    invoke-static {v1, v4}, Lcom/jieli/jl_rcsp/util/CHexConver;->checkBitValue(BI)Z

    move-result v1

    iput-boolean v1, p0, Lcom/jieli/jl_rcsp/model/WatchConfigure$FunctionOption;->isSupportAICloud:Z

    array-length v1, p2

    if-gt v1, v0, :cond_0

    return-void

    :cond_0
    aget-byte p2, p2, v0

    invoke-static {p2, p1}, Lcom/jieli/jl_rcsp/util/CHexConver;->checkBitValue(BI)Z

    move-result p1

    iput-boolean p1, p0, Lcom/jieli/jl_rcsp/model/WatchConfigure$FunctionOption;->isSupportAIDial:Z

    invoke-static {p2, v0}, Lcom/jieli/jl_rcsp/util/CHexConver;->checkBitValue(BI)Z

    move-result p1

    iput-boolean p1, p0, Lcom/jieli/jl_rcsp/model/WatchConfigure$FunctionOption;->isSupportPlatformInfo:Z

    invoke-static {p2, v2}, Lcom/jieli/jl_rcsp/util/CHexConver;->checkBitValue(BI)Z

    move-result p1

    iput-boolean p1, p0, Lcom/jieli/jl_rcsp/model/WatchConfigure$FunctionOption;->isSupportNetworkModule:Z

    invoke-static {p2, v3}, Lcom/jieli/jl_rcsp/util/CHexConver;->checkBitValue(BI)Z

    move-result p1

    iput-boolean p1, p0, Lcom/jieli/jl_rcsp/model/WatchConfigure$FunctionOption;->isSupportDialExpandInfo:Z

    return-void

    :cond_1
    new-instance p1, Ljava/lang/RuntimeException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " : Data exception : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p2}, Lcom/jieli/jl_rcsp/util/CHexConver;->byte2HexStr([B)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p2, Ljava/lang/RuntimeException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unsupported version :  "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p2
.end method


# virtual methods
.method public getData()[B
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/WatchConfigure$FunctionOption;->data:[B

    return-object v0
.end method

.method public getVersion()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/WatchConfigure$FunctionOption;->version:I

    return v0
.end method

.method public isSupportAICloud()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/model/WatchConfigure$FunctionOption;->isSupportAICloud:Z

    return v0
.end method

.method public isSupportAIDial()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/model/WatchConfigure$FunctionOption;->isSupportAIDial:Z

    return v0
.end method

.method public isSupportAlarmSetting()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/model/WatchConfigure$FunctionOption;->isSupportAlarmSetting:Z

    return v0
.end method

.method public isSupportContacts()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/model/WatchConfigure$FunctionOption;->isSupportContacts:Z

    return v0
.end method

.method public isSupportDialExpandInfo()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/model/WatchConfigure$FunctionOption;->isSupportDialExpandInfo:Z

    return v0
.end method

.method public isSupportFileBrowse()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/model/WatchConfigure$FunctionOption;->isSupportFileBrowse:Z

    return v0
.end method

.method public isSupportMessageSync()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/model/WatchConfigure$FunctionOption;->isSupportMessageSync:Z

    return v0
.end method

.method public isSupportMusicTransfer()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/model/WatchConfigure$FunctionOption;->isSupportMusicTransfer:Z

    return v0
.end method

.method public isSupportNetworkModule()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/model/WatchConfigure$FunctionOption;->isSupportNetworkModule:Z

    return v0
.end method

.method public isSupportPlatformInfo()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/model/WatchConfigure$FunctionOption;->isSupportPlatformInfo:Z

    return v0
.end method

.method public isSupportSearchDevice()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/model/WatchConfigure$FunctionOption;->isSupportSearchDevice:Z

    return v0
.end method

.method public isSupportWeatherSync()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/model/WatchConfigure$FunctionOption;->isSupportWeatherSync:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "FunctionOption{isSupportContacts="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_rcsp/model/WatchConfigure$FunctionOption;->isSupportContacts:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", isSupportFileBrowse="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_rcsp/model/WatchConfigure$FunctionOption;->isSupportFileBrowse:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", isSupportMusicTransfer="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_rcsp/model/WatchConfigure$FunctionOption;->isSupportMusicTransfer:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", isSupportAlarmSetting="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_rcsp/model/WatchConfigure$FunctionOption;->isSupportAlarmSetting:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", isSupportMessageSync="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_rcsp/model/WatchConfigure$FunctionOption;->isSupportMessageSync:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", isSupportWeatherSync="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_rcsp/model/WatchConfigure$FunctionOption;->isSupportWeatherSync:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", isSupportSearchDevice="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_rcsp/model/WatchConfigure$FunctionOption;->isSupportSearchDevice:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", isSupportAICloud="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_rcsp/model/WatchConfigure$FunctionOption;->isSupportAICloud:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", isSupportAIDial="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_rcsp/model/WatchConfigure$FunctionOption;->isSupportAIDial:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", isSupportPlatformInfo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_rcsp/model/WatchConfigure$FunctionOption;->isSupportPlatformInfo:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", isSupportNetworkModule="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_rcsp/model/WatchConfigure$FunctionOption;->isSupportNetworkModule:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", isSupportDialExpandInfo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_rcsp/model/WatchConfigure$FunctionOption;->isSupportDialExpandInfo:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
