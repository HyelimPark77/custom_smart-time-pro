.class public Lcom/jieli/jl_rcsp/model/WatchConfigure$SystemSetup;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/model/WatchConfigure;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "SystemSetup"
.end annotation


# instance fields
.field private final data:[B

.field private isSupportBtDisconnectSetting:Z

.field private isSupportDNDMode:Z

.field private isSupportExerciseSetting:Z

.field private isSupportScreenSetting:Z

.field private isSupportVibrationSetting:Z

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

    iput p1, p0, Lcom/jieli/jl_rcsp/model/WatchConfigure$SystemSetup;->version:I

    iput-object p2, p0, Lcom/jieli/jl_rcsp/model/WatchConfigure$SystemSetup;->data:[B

    invoke-direct {p0, p1, p2}, Lcom/jieli/jl_rcsp/model/WatchConfigure$SystemSetup;->parseData(I[B)V

    return-void
.end method

.method private parseData(I[B)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/RuntimeException;
        }
    .end annotation

    if-nez p1, :cond_6

    if-eqz p2, :cond_5

    array-length p1, p2

    const/4 v0, 0x1

    if-lt p1, v0, :cond_5

    const/4 p1, 0x0

    aget-byte p2, p2, p1

    and-int/lit8 v1, p2, 0x1

    if-ne v1, v0, :cond_0

    move v1, v0

    goto :goto_0

    :cond_0
    move v1, p1

    :goto_0
    iput-boolean v1, p0, Lcom/jieli/jl_rcsp/model/WatchConfigure$SystemSetup;->isSupportScreenSetting:Z

    shr-int/lit8 v1, p2, 0x1

    and-int/2addr v1, v0

    if-ne v1, v0, :cond_1

    move v1, v0

    goto :goto_1

    :cond_1
    move v1, p1

    :goto_1
    iput-boolean v1, p0, Lcom/jieli/jl_rcsp/model/WatchConfigure$SystemSetup;->isSupportVibrationSetting:Z

    shr-int/lit8 v1, p2, 0x2

    and-int/2addr v1, v0

    if-ne v1, v0, :cond_2

    move v1, v0

    goto :goto_2

    :cond_2
    move v1, p1

    :goto_2
    iput-boolean v1, p0, Lcom/jieli/jl_rcsp/model/WatchConfigure$SystemSetup;->isSupportDNDMode:Z

    shr-int/lit8 v1, p2, 0x3

    and-int/2addr v1, v0

    if-ne v1, v0, :cond_3

    move v1, v0

    goto :goto_3

    :cond_3
    move v1, p1

    :goto_3
    iput-boolean v1, p0, Lcom/jieli/jl_rcsp/model/WatchConfigure$SystemSetup;->isSupportExerciseSetting:Z

    shr-int/lit8 p2, p2, 0x4

    and-int/2addr p2, v0

    if-ne p2, v0, :cond_4

    goto :goto_4

    :cond_4
    move v0, p1

    :goto_4
    iput-boolean v0, p0, Lcom/jieli/jl_rcsp/model/WatchConfigure$SystemSetup;->isSupportBtDisconnectSetting:Z

    return-void

    :cond_5
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

    :cond_6
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

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/WatchConfigure$SystemSetup;->data:[B

    return-object v0
.end method

.method public getVersion()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/WatchConfigure$SystemSetup;->version:I

    return v0
.end method

.method public isSupportBtDisconnectSetting()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/model/WatchConfigure$SystemSetup;->isSupportBtDisconnectSetting:Z

    return v0
.end method

.method public isSupportDNDMode()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/model/WatchConfigure$SystemSetup;->isSupportDNDMode:Z

    return v0
.end method

.method public isSupportExerciseSetting()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/model/WatchConfigure$SystemSetup;->isSupportExerciseSetting:Z

    return v0
.end method

.method public isSupportScreenSetting()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/model/WatchConfigure$SystemSetup;->isSupportScreenSetting:Z

    return v0
.end method

.method public isSupportVibrationSetting()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/model/WatchConfigure$SystemSetup;->isSupportVibrationSetting:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SystemSetup{isSupportScreenSetting="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_rcsp/model/WatchConfigure$SystemSetup;->isSupportScreenSetting:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", isSupportVibrationSetting="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_rcsp/model/WatchConfigure$SystemSetup;->isSupportVibrationSetting:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", isSupportDNDMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_rcsp/model/WatchConfigure$SystemSetup;->isSupportDNDMode:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", isSupportExerciseSetting="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_rcsp/model/WatchConfigure$SystemSetup;->isSupportExerciseSetting:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", isSupportBtDisconnectSetting="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_rcsp/model/WatchConfigure$SystemSetup;->isSupportBtDisconnectSetting:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
