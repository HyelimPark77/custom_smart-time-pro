.class public Lcom/jieli/jl_rcsp/model/SportHealthConfigure;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jieli/jl_rcsp/model/SportHealthConfigure$GSensorFunc;,
        Lcom/jieli/jl_rcsp/model/SportHealthConfigure$RateFunc;,
        Lcom/jieli/jl_rcsp/model/SportHealthConfigure$BloodOxygenFunc;,
        Lcom/jieli/jl_rcsp/model/SportHealthConfigure$AltitudeFunc;,
        Lcom/jieli/jl_rcsp/model/SportHealthConfigure$GPSFunc;,
        Lcom/jieli/jl_rcsp/model/SportHealthConfigure$SportModeFunc;,
        Lcom/jieli/jl_rcsp/model/SportHealthConfigure$CombineFunc;,
        Lcom/jieli/jl_rcsp/model/SportHealthConfigure$BaseFunc;
    }
.end annotation


# static fields
.field public static final CONFIGURE_TYPE_ALTITUDE:I = 0x3

.field public static final CONFIGURE_TYPE_BLOOD_OXYGEN:I = 0x2

.field public static final CONFIGURE_TYPE_COMBINE_FUNC:I = 0xff

.field public static final CONFIGURE_TYPE_GPS:I = 0x4

.field public static final CONFIGURE_TYPE_GSENSOR:I = 0x0

.field public static final CONFIGURE_TYPE_RATE:I = 0x1

.field public static final CONFIGURE_TYPE_SPORT_MODE:I = 0xfe


# instance fields
.field private altitudeFunc:Lcom/jieli/jl_rcsp/model/SportHealthConfigure$AltitudeFunc;

.field private bloodOxygenFunc:Lcom/jieli/jl_rcsp/model/SportHealthConfigure$BloodOxygenFunc;

.field private combineFunc:Lcom/jieli/jl_rcsp/model/SportHealthConfigure$CombineFunc;

.field private gSensorFunc:Lcom/jieli/jl_rcsp/model/SportHealthConfigure$GSensorFunc;

.field private gpsFunc:Lcom/jieli/jl_rcsp/model/SportHealthConfigure$GPSFunc;

.field private rateFunc:Lcom/jieli/jl_rcsp/model/SportHealthConfigure$RateFunc;

.field private sportModeFunc:Lcom/jieli/jl_rcsp/model/SportHealthConfigure$SportModeFunc;


# direct methods
.method public constructor <init>(I[B)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/RuntimeException;
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-direct {p0, p1, p2}, Lcom/jieli/jl_rcsp/model/SportHealthConfigure;->parseData(I[B)V

    return-void
.end method

.method private parseData(I[B)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/RuntimeException;
        }
    .end annotation

    if-nez p1, :cond_9

    if-eqz p2, :cond_8

    array-length v0, p2

    const/4 v1, 0x2

    if-lt v0, v1, :cond_8

    invoke-static {p2}, Lcom/jieli/jl_rcsp/util/RcspUtil;->parseLTVData([B)Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/jieli/jl_rcsp/model/LtvBean;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/LtvBean;->getData()[B

    move-result-object v2

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/LtvBean;->getType()I

    move-result v0

    const/16 v3, 0xfe

    if-eq v0, v3, :cond_6

    const/16 v3, 0xff

    if-eq v0, v3, :cond_5

    if-eqz v0, :cond_4

    const/4 v3, 0x1

    if-eq v0, v3, :cond_3

    if-eq v0, v1, :cond_2

    const/4 v3, 0x3

    if-eq v0, v3, :cond_1

    const/4 v3, 0x4

    if-eq v0, v3, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/jieli/jl_rcsp/model/SportHealthConfigure$GPSFunc;

    invoke-direct {v0, p1, v2}, Lcom/jieli/jl_rcsp/model/SportHealthConfigure$GPSFunc;-><init>(I[B)V

    iput-object v0, p0, Lcom/jieli/jl_rcsp/model/SportHealthConfigure;->gpsFunc:Lcom/jieli/jl_rcsp/model/SportHealthConfigure$GPSFunc;

    goto :goto_0

    :cond_1
    new-instance v0, Lcom/jieli/jl_rcsp/model/SportHealthConfigure$AltitudeFunc;

    invoke-direct {v0, p1, v2}, Lcom/jieli/jl_rcsp/model/SportHealthConfigure$AltitudeFunc;-><init>(I[B)V

    iput-object v0, p0, Lcom/jieli/jl_rcsp/model/SportHealthConfigure;->altitudeFunc:Lcom/jieli/jl_rcsp/model/SportHealthConfigure$AltitudeFunc;

    goto :goto_0

    :cond_2
    new-instance v0, Lcom/jieli/jl_rcsp/model/SportHealthConfigure$BloodOxygenFunc;

    invoke-direct {v0, p1, v2}, Lcom/jieli/jl_rcsp/model/SportHealthConfigure$BloodOxygenFunc;-><init>(I[B)V

    iput-object v0, p0, Lcom/jieli/jl_rcsp/model/SportHealthConfigure;->bloodOxygenFunc:Lcom/jieli/jl_rcsp/model/SportHealthConfigure$BloodOxygenFunc;

    goto :goto_0

    :cond_3
    new-instance v0, Lcom/jieli/jl_rcsp/model/SportHealthConfigure$RateFunc;

    invoke-direct {v0, p1, v2}, Lcom/jieli/jl_rcsp/model/SportHealthConfigure$RateFunc;-><init>(I[B)V

    iput-object v0, p0, Lcom/jieli/jl_rcsp/model/SportHealthConfigure;->rateFunc:Lcom/jieli/jl_rcsp/model/SportHealthConfigure$RateFunc;

    goto :goto_0

    :cond_4
    new-instance v0, Lcom/jieli/jl_rcsp/model/SportHealthConfigure$GSensorFunc;

    invoke-direct {v0, p1, v2}, Lcom/jieli/jl_rcsp/model/SportHealthConfigure$GSensorFunc;-><init>(I[B)V

    iput-object v0, p0, Lcom/jieli/jl_rcsp/model/SportHealthConfigure;->gSensorFunc:Lcom/jieli/jl_rcsp/model/SportHealthConfigure$GSensorFunc;

    goto :goto_0

    :cond_5
    new-instance v0, Lcom/jieli/jl_rcsp/model/SportHealthConfigure$CombineFunc;

    invoke-direct {v0, p1, v2}, Lcom/jieli/jl_rcsp/model/SportHealthConfigure$CombineFunc;-><init>(I[B)V

    iput-object v0, p0, Lcom/jieli/jl_rcsp/model/SportHealthConfigure;->combineFunc:Lcom/jieli/jl_rcsp/model/SportHealthConfigure$CombineFunc;

    goto :goto_0

    :cond_6
    new-instance v0, Lcom/jieli/jl_rcsp/model/SportHealthConfigure$SportModeFunc;

    invoke-direct {v0, p1, v2}, Lcom/jieli/jl_rcsp/model/SportHealthConfigure$SportModeFunc;-><init>(I[B)V

    iput-object v0, p0, Lcom/jieli/jl_rcsp/model/SportHealthConfigure;->sportModeFunc:Lcom/jieli/jl_rcsp/model/SportHealthConfigure$SportModeFunc;

    goto :goto_0

    :cond_7
    return-void

    :cond_8
    new-instance p1, Ljava/lang/RuntimeException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Data exception : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p2}, Lcom/jieli/jl_rcsp/util/CHexConver;->byte2HexStr([B)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_9
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
.method public getAltitudeFunc()Lcom/jieli/jl_rcsp/model/SportHealthConfigure$AltitudeFunc;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/SportHealthConfigure;->altitudeFunc:Lcom/jieli/jl_rcsp/model/SportHealthConfigure$AltitudeFunc;

    return-object v0
.end method

.method public getBloodOxygenFunc()Lcom/jieli/jl_rcsp/model/SportHealthConfigure$BloodOxygenFunc;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/SportHealthConfigure;->bloodOxygenFunc:Lcom/jieli/jl_rcsp/model/SportHealthConfigure$BloodOxygenFunc;

    return-object v0
.end method

.method public getCombineFunc()Lcom/jieli/jl_rcsp/model/SportHealthConfigure$CombineFunc;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/SportHealthConfigure;->combineFunc:Lcom/jieli/jl_rcsp/model/SportHealthConfigure$CombineFunc;

    return-object v0
.end method

.method public getGSensorFunc()Lcom/jieli/jl_rcsp/model/SportHealthConfigure$GSensorFunc;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/SportHealthConfigure;->gSensorFunc:Lcom/jieli/jl_rcsp/model/SportHealthConfigure$GSensorFunc;

    return-object v0
.end method

.method public getGpsFunc()Lcom/jieli/jl_rcsp/model/SportHealthConfigure$GPSFunc;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/SportHealthConfigure;->gpsFunc:Lcom/jieli/jl_rcsp/model/SportHealthConfigure$GPSFunc;

    return-object v0
.end method

.method public getRateFunc()Lcom/jieli/jl_rcsp/model/SportHealthConfigure$RateFunc;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/SportHealthConfigure;->rateFunc:Lcom/jieli/jl_rcsp/model/SportHealthConfigure$RateFunc;

    return-object v0
.end method

.method public getSportModeFunc()Lcom/jieli/jl_rcsp/model/SportHealthConfigure$SportModeFunc;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/SportHealthConfigure;->sportModeFunc:Lcom/jieli/jl_rcsp/model/SportHealthConfigure$SportModeFunc;

    return-object v0
.end method

.method public isExistAltitude()Z
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/SportHealthConfigure;->altitudeFunc:Lcom/jieli/jl_rcsp/model/SportHealthConfigure$AltitudeFunc;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public isExistBloodOxygen()Z
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/SportHealthConfigure;->bloodOxygenFunc:Lcom/jieli/jl_rcsp/model/SportHealthConfigure$BloodOxygenFunc;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public isExistGSensor()Z
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/SportHealthConfigure;->gSensorFunc:Lcom/jieli/jl_rcsp/model/SportHealthConfigure$GSensorFunc;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public isExistGps()Z
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/SportHealthConfigure;->gpsFunc:Lcom/jieli/jl_rcsp/model/SportHealthConfigure$GPSFunc;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public isExistRate()Z
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/SportHealthConfigure;->rateFunc:Lcom/jieli/jl_rcsp/model/SportHealthConfigure$RateFunc;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SportHealthConfigure{gSensorFunc="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/SportHealthConfigure;->gSensorFunc:Lcom/jieli/jl_rcsp/model/SportHealthConfigure$GSensorFunc;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", rateFunc="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/SportHealthConfigure;->rateFunc:Lcom/jieli/jl_rcsp/model/SportHealthConfigure$RateFunc;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",bloodOxygenFunc="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/SportHealthConfigure;->bloodOxygenFunc:Lcom/jieli/jl_rcsp/model/SportHealthConfigure$BloodOxygenFunc;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",altitudeFunc="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/SportHealthConfigure;->altitudeFunc:Lcom/jieli/jl_rcsp/model/SportHealthConfigure$AltitudeFunc;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",gpsFunc="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/SportHealthConfigure;->gpsFunc:Lcom/jieli/jl_rcsp/model/SportHealthConfigure$GPSFunc;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",sportModeFunc="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/SportHealthConfigure;->sportModeFunc:Lcom/jieli/jl_rcsp/model/SportHealthConfigure$SportModeFunc;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",combineFunc="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/SportHealthConfigure;->combineFunc:Lcom/jieli/jl_rcsp/model/SportHealthConfigure$CombineFunc;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
