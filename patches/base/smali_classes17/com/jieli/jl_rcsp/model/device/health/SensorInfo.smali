.class public Lcom/jieli/jl_rcsp/model/device/health/SensorInfo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/model/device/health/IHealthSettingToAttr;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jieli/jl_rcsp/model/device/health/SensorInfo$Sensor;
    }
.end annotation


# instance fields
.field private final altitudePressure:Lcom/jieli/jl_rcsp/model/device/health/SensorInfo$Sensor;

.field private final bloodOxygen:Lcom/jieli/jl_rcsp/model/device/health/SensorInfo$Sensor;

.field private flag:I

.field private final heartRate:Lcom/jieli/jl_rcsp/model/device/health/SensorInfo$Sensor;

.field private final step:Lcom/jieli/jl_rcsp/model/device/health/SensorInfo$Sensor;


# direct methods
.method public constructor <init>(I)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/health/SensorInfo;->flag:I

    new-instance p1, Lcom/jieli/jl_rcsp/model/device/health/SensorInfo$Sensor;

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p1, p0, v0, v1}, Lcom/jieli/jl_rcsp/model/device/health/SensorInfo$Sensor;-><init>(Lcom/jieli/jl_rcsp/model/device/health/SensorInfo;II)V

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/device/health/SensorInfo;->step:Lcom/jieli/jl_rcsp/model/device/health/SensorInfo$Sensor;

    new-instance p1, Lcom/jieli/jl_rcsp/model/device/health/SensorInfo$Sensor;

    const/4 v0, 0x2

    const/4 v1, 0x3

    invoke-direct {p1, p0, v0, v1}, Lcom/jieli/jl_rcsp/model/device/health/SensorInfo$Sensor;-><init>(Lcom/jieli/jl_rcsp/model/device/health/SensorInfo;II)V

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/device/health/SensorInfo;->heartRate:Lcom/jieli/jl_rcsp/model/device/health/SensorInfo$Sensor;

    new-instance p1, Lcom/jieli/jl_rcsp/model/device/health/SensorInfo$Sensor;

    const/4 v0, 0x4

    const/4 v1, 0x5

    invoke-direct {p1, p0, v0, v1}, Lcom/jieli/jl_rcsp/model/device/health/SensorInfo$Sensor;-><init>(Lcom/jieli/jl_rcsp/model/device/health/SensorInfo;II)V

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/device/health/SensorInfo;->bloodOxygen:Lcom/jieli/jl_rcsp/model/device/health/SensorInfo$Sensor;

    new-instance p1, Lcom/jieli/jl_rcsp/model/device/health/SensorInfo$Sensor;

    const/4 v0, 0x6

    const/4 v1, 0x7

    invoke-direct {p1, p0, v0, v1}, Lcom/jieli/jl_rcsp/model/device/health/SensorInfo$Sensor;-><init>(Lcom/jieli/jl_rcsp/model/device/health/SensorInfo;II)V

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/device/health/SensorInfo;->altitudePressure:Lcom/jieli/jl_rcsp/model/device/health/SensorInfo$Sensor;

    return-void
.end method

.method public static synthetic access$000(Lcom/jieli/jl_rcsp/model/device/health/SensorInfo;)I
    .locals 0

    iget p0, p0, Lcom/jieli/jl_rcsp/model/device/health/SensorInfo;->flag:I

    return p0
.end method

.method public static synthetic access$072(Lcom/jieli/jl_rcsp/model/device/health/SensorInfo;I)I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/health/SensorInfo;->flag:I

    and-int/2addr p1, v0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/health/SensorInfo;->flag:I

    return p1
.end method

.method public static synthetic access$076(Lcom/jieli/jl_rcsp/model/device/health/SensorInfo;I)I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/health/SensorInfo;->flag:I

    or-int/2addr p1, v0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/health/SensorInfo;->flag:I

    return p1
.end method


# virtual methods
.method public copy()Lcom/jieli/jl_rcsp/model/device/health/SensorInfo;
    .locals 2

    new-instance v0, Lcom/jieli/jl_rcsp/model/device/health/SensorInfo;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/health/SensorInfo;->flag:I

    invoke-direct {v0, v1}, Lcom/jieli/jl_rcsp/model/device/health/SensorInfo;-><init>(I)V

    return-object v0
.end method

.method public getAltitudePressureSensor()Lcom/jieli/jl_rcsp/model/device/health/SensorInfo$Sensor;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/health/SensorInfo;->altitudePressure:Lcom/jieli/jl_rcsp/model/device/health/SensorInfo$Sensor;

    return-object v0
.end method

.method public getBloodOxygenSensor()Lcom/jieli/jl_rcsp/model/device/health/SensorInfo$Sensor;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/health/SensorInfo;->bloodOxygen:Lcom/jieli/jl_rcsp/model/device/health/SensorInfo$Sensor;

    return-object v0
.end method

.method public getHeartRateSensor()Lcom/jieli/jl_rcsp/model/device/health/SensorInfo$Sensor;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/health/SensorInfo;->heartRate:Lcom/jieli/jl_rcsp/model/device/health/SensorInfo$Sensor;

    return-object v0
.end method

.method public getStepSensor()Lcom/jieli/jl_rcsp/model/device/health/SensorInfo$Sensor;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/health/SensorInfo;->step:Lcom/jieli/jl_rcsp/model/device/health/SensorInfo$Sensor;

    return-object v0
.end method

.method public getType()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public toAttr()Lcom/jieli/jl_rcsp/model/device/AttrBean;
    .locals 2

    new-instance v0, Lcom/jieli/jl_rcsp/model/device/AttrBean;

    invoke-direct {v0}, Lcom/jieli/jl_rcsp/model/device/AttrBean;-><init>()V

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/device/health/SensorInfo;->getType()I

    move-result v1

    int-to-byte v1, v1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/AttrBean;->setType(B)Lcom/jieli/jl_rcsp/model/device/AttrBean;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/health/SensorInfo;->flag:I

    int-to-short v1, v1

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->shortToBigBytes(S)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/AttrBean;->setAttrData([B)Lcom/jieli/jl_rcsp/model/device/AttrBean;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SensorInfo{flag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/health/SensorInfo;->flag:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", step="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/health/SensorInfo;->step:Lcom/jieli/jl_rcsp/model/device/health/SensorInfo$Sensor;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", heartRate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/health/SensorInfo;->heartRate:Lcom/jieli/jl_rcsp/model/device/health/SensorInfo$Sensor;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", bloodOxygen="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/health/SensorInfo;->bloodOxygen:Lcom/jieli/jl_rcsp/model/device/health/SensorInfo$Sensor;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", altitudePressure="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/health/SensorInfo;->altitudePressure:Lcom/jieli/jl_rcsp/model/device/health/SensorInfo$Sensor;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
