.class public Lcom/jieli/jl_rcsp/model/device/health/BloodOxygenMeasurementAlert;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/model/device/health/IHealthSettingToAttr;


# static fields
.field public static final MODE_SMART:I = 0x0

.field public static final MODE_TIMING:I = 0x1

.field public static final STATE_CLOSE:I = 0x0

.field public static final STATE_OPEN:I = 0x1


# instance fields
.field private limitingValue:I

.field private mode:I

.field private state:I


# direct methods
.method public constructor <init>([B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-direct {p0, p1}, Lcom/jieli/jl_rcsp/model/device/health/BloodOxygenMeasurementAlert;->parseData([B)V

    return-void
.end method

.method private parseData([B)V
    .locals 3

    if-eqz p1, :cond_2

    array-length v0, p1

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    aget-byte v0, p1, v0

    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v0

    iput v0, p0, Lcom/jieli/jl_rcsp/model/device/health/BloodOxygenMeasurementAlert;->state:I

    array-length v0, p1

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-le v0, v2, :cond_1

    aget-byte v0, p1, v2

    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v0

    iput v0, p0, Lcom/jieli/jl_rcsp/model/device/health/BloodOxygenMeasurementAlert;->mode:I

    move v2, v1

    :cond_1
    array-length v0, p1

    if-le v0, v1, :cond_2

    aget-byte p1, p1, v2

    invoke-static {p1}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result p1

    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/health/BloodOxygenMeasurementAlert;->limitingValue:I

    :cond_2
    :goto_0
    return-void
.end method

.method private toData()[B
    .locals 5

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/health/BloodOxygenMeasurementAlert;->state:I

    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/CHexConver;->intToByte(I)B

    move-result v0

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/health/BloodOxygenMeasurementAlert;->mode:I

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->intToByte(I)B

    move-result v1

    iget v2, p0, Lcom/jieli/jl_rcsp/model/device/health/BloodOxygenMeasurementAlert;->limitingValue:I

    invoke-static {v2}, Lcom/jieli/jl_rcsp/util/CHexConver;->intToByte(I)B

    move-result v2

    const/4 v3, 0x3

    new-array v3, v3, [B

    const/4 v4, 0x0

    aput-byte v0, v3, v4

    const/4 v0, 0x1

    aput-byte v1, v3, v0

    const/4 v0, 0x2

    aput-byte v2, v3, v0

    return-object v3
.end method


# virtual methods
.method public getLimitingValue()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/health/BloodOxygenMeasurementAlert;->limitingValue:I

    return v0
.end method

.method public getMode()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/health/BloodOxygenMeasurementAlert;->mode:I

    return v0
.end method

.method public getState()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/health/BloodOxygenMeasurementAlert;->state:I

    return v0
.end method

.method public getType()I
    .locals 1

    const/16 v0, 0xb

    return v0
.end method

.method public setLimitingValue(I)Lcom/jieli/jl_rcsp/model/device/health/BloodOxygenMeasurementAlert;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/health/BloodOxygenMeasurementAlert;->limitingValue:I

    return-object p0
.end method

.method public setMode(I)Lcom/jieli/jl_rcsp/model/device/health/BloodOxygenMeasurementAlert;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/health/BloodOxygenMeasurementAlert;->mode:I

    return-object p0
.end method

.method public setState(I)Lcom/jieli/jl_rcsp/model/device/health/BloodOxygenMeasurementAlert;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/health/BloodOxygenMeasurementAlert;->state:I

    return-object p0
.end method

.method public toAttr()Lcom/jieli/jl_rcsp/model/device/AttrBean;
    .locals 2

    new-instance v0, Lcom/jieli/jl_rcsp/model/device/AttrBean;

    invoke-direct {v0}, Lcom/jieli/jl_rcsp/model/device/AttrBean;-><init>()V

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/device/health/BloodOxygenMeasurementAlert;->getType()I

    move-result v1

    int-to-byte v1, v1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/AttrBean;->setType(B)Lcom/jieli/jl_rcsp/model/device/AttrBean;

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/device/health/BloodOxygenMeasurementAlert;->toData()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/AttrBean;->setAttrData([B)Lcom/jieli/jl_rcsp/model/device/AttrBean;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BloodOxygenMeasurementAlert{state="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/health/BloodOxygenMeasurementAlert;->state:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/health/BloodOxygenMeasurementAlert;->mode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", limitingValue="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/health/BloodOxygenMeasurementAlert;->limitingValue:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
