.class public Lcom/jieli/jl_rcsp/model/device/health/SensorInfo$Sensor;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/model/device/health/SensorInfo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "Sensor"
.end annotation


# instance fields
.field private final enablePos:I

.field private final recordEnablePos:I

.field final synthetic this$0:Lcom/jieli/jl_rcsp/model/device/health/SensorInfo;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/model/device/health/SensorInfo;I)V
    .locals 1

    add-int/lit8 v0, p2, 0x1

    .line 1
    invoke-direct {p0, p1, p2, v0}, Lcom/jieli/jl_rcsp/model/device/health/SensorInfo$Sensor;-><init>(Lcom/jieli/jl_rcsp/model/device/health/SensorInfo;II)V

    return-void
.end method

.method public constructor <init>(Lcom/jieli/jl_rcsp/model/device/health/SensorInfo;II)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/device/health/SensorInfo$Sensor;->this$0:Lcom/jieli/jl_rcsp/model/device/health/SensorInfo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p2, p0, Lcom/jieli/jl_rcsp/model/device/health/SensorInfo$Sensor;->enablePos:I

    .line 4
    iput p3, p0, Lcom/jieli/jl_rcsp/model/device/health/SensorInfo$Sensor;->recordEnablePos:I

    return-void
.end method


# virtual methods
.method public isEnable()Z
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/health/SensorInfo$Sensor;->this$0:Lcom/jieli/jl_rcsp/model/device/health/SensorInfo;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/model/device/health/SensorInfo;->access$000(Lcom/jieli/jl_rcsp/model/device/health/SensorInfo;)I

    move-result v0

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/health/SensorInfo$Sensor;->enablePos:I

    shr-int/2addr v0, v1

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public isRecordEnable()Z
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/health/SensorInfo$Sensor;->this$0:Lcom/jieli/jl_rcsp/model/device/health/SensorInfo;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/model/device/health/SensorInfo;->access$000(Lcom/jieli/jl_rcsp/model/device/health/SensorInfo;)I

    move-result v0

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/health/SensorInfo$Sensor;->recordEnablePos:I

    shr-int/2addr v0, v1

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/device/health/SensorInfo$Sensor;->isEnable()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public setEnable(Z)V
    .locals 2

    const/4 v0, 0x1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/jieli/jl_rcsp/model/device/health/SensorInfo$Sensor;->this$0:Lcom/jieli/jl_rcsp/model/device/health/SensorInfo;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/health/SensorInfo$Sensor;->enablePos:I

    shl-int/2addr v0, v1

    invoke-static {p1, v0}, Lcom/jieli/jl_rcsp/model/device/health/SensorInfo;->access$076(Lcom/jieli/jl_rcsp/model/device/health/SensorInfo;I)I

    return-void

    :cond_0
    iget p1, p0, Lcom/jieli/jl_rcsp/model/device/health/SensorInfo$Sensor;->enablePos:I

    shl-int p1, v0, p1

    not-int p1, p1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/health/SensorInfo$Sensor;->this$0:Lcom/jieli/jl_rcsp/model/device/health/SensorInfo;

    invoke-static {v0, p1}, Lcom/jieli/jl_rcsp/model/device/health/SensorInfo;->access$072(Lcom/jieli/jl_rcsp/model/device/health/SensorInfo;I)I

    return-void
.end method

.method public setRecordEnable(Z)V
    .locals 2

    const/4 v0, 0x1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/jieli/jl_rcsp/model/device/health/SensorInfo$Sensor;->this$0:Lcom/jieli/jl_rcsp/model/device/health/SensorInfo;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/health/SensorInfo$Sensor;->recordEnablePos:I

    shl-int/2addr v0, v1

    invoke-static {p1, v0}, Lcom/jieli/jl_rcsp/model/device/health/SensorInfo;->access$076(Lcom/jieli/jl_rcsp/model/device/health/SensorInfo;I)I

    return-void

    :cond_0
    iget p1, p0, Lcom/jieli/jl_rcsp/model/device/health/SensorInfo$Sensor;->recordEnablePos:I

    shl-int p1, v0, p1

    not-int p1, p1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/health/SensorInfo$Sensor;->this$0:Lcom/jieli/jl_rcsp/model/device/health/SensorInfo;

    invoke-static {v0, p1}, Lcom/jieli/jl_rcsp/model/device/health/SensorInfo;->access$072(Lcom/jieli/jl_rcsp/model/device/health/SensorInfo;I)I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Sensor{enablePos="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/health/SensorInfo$Sensor;->enablePos:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", recordEnablePos="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/health/SensorInfo$Sensor;->recordEnablePos:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
