.class public Lcom/jieli/jl_rcsp/model/device/BatteryInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private battery:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/model/device/BatteryInfo;->setBattery(I)V

    return-void
.end method


# virtual methods
.method public getBattery()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/BatteryInfo;->battery:I

    return v0
.end method

.method public setBattery(I)V
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/BatteryInfo;->battery:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BatteryInfo{battery="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/BatteryInfo;->battery:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
