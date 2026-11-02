.class public final Lcom/sma/smartv3/model/BGEMRangeAnalysisResult;
.super Lcom/sma/smartv3/model/JsonFieldContainer;
.source "SourceFile"


# instance fields
.field private measurementData:Lcom/sma/smartv3/model/BGEMMeasurementData;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private riskData:Lcom/sma/smartv3/model/BGEMRiskData;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x3

    invoke-direct {p0, v0, v0, v1, v0}, Lcom/sma/smartv3/model/BGEMRangeAnalysisResult;-><init>(Lcom/sma/smartv3/model/BGEMRiskData;Lcom/sma/smartv3/model/BGEMMeasurementData;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lcom/sma/smartv3/model/BGEMRiskData;Lcom/sma/smartv3/model/BGEMMeasurementData;)V
    .locals 0
    .param p1    # Lcom/sma/smartv3/model/BGEMRiskData;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p2    # Lcom/sma/smartv3/model/BGEMMeasurementData;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    .line 2
    invoke-direct {p0}, Lcom/sma/smartv3/model/JsonFieldContainer;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/sma/smartv3/model/BGEMRangeAnalysisResult;->riskData:Lcom/sma/smartv3/model/BGEMRiskData;

    .line 4
    iput-object p2, p0, Lcom/sma/smartv3/model/BGEMRangeAnalysisResult;->measurementData:Lcom/sma/smartv3/model/BGEMMeasurementData;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/sma/smartv3/model/BGEMRiskData;Lcom/sma/smartv3/model/BGEMMeasurementData;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p4, p3, 0x1

    const/4 v0, 0x0

    if-eqz p4, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    move-object p2, v0

    .line 5
    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/sma/smartv3/model/BGEMRangeAnalysisResult;-><init>(Lcom/sma/smartv3/model/BGEMRiskData;Lcom/sma/smartv3/model/BGEMMeasurementData;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/sma/smartv3/model/BGEMRangeAnalysisResult;Lcom/sma/smartv3/model/BGEMRiskData;Lcom/sma/smartv3/model/BGEMMeasurementData;ILjava/lang/Object;)Lcom/sma/smartv3/model/BGEMRangeAnalysisResult;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/model/BGEMRangeAnalysisResult;->riskData:Lcom/sma/smartv3/model/BGEMRiskData;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/sma/smartv3/model/BGEMRangeAnalysisResult;->measurementData:Lcom/sma/smartv3/model/BGEMMeasurementData;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/model/BGEMRangeAnalysisResult;->copy(Lcom/sma/smartv3/model/BGEMRiskData;Lcom/sma/smartv3/model/BGEMMeasurementData;)Lcom/sma/smartv3/model/BGEMRangeAnalysisResult;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/sma/smartv3/model/BGEMRiskData;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/BGEMRangeAnalysisResult;->riskData:Lcom/sma/smartv3/model/BGEMRiskData;

    return-object v0
.end method

.method public final component2()Lcom/sma/smartv3/model/BGEMMeasurementData;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/BGEMRangeAnalysisResult;->measurementData:Lcom/sma/smartv3/model/BGEMMeasurementData;

    return-object v0
.end method

.method public final copy(Lcom/sma/smartv3/model/BGEMRiskData;Lcom/sma/smartv3/model/BGEMMeasurementData;)Lcom/sma/smartv3/model/BGEMRangeAnalysisResult;
    .locals 1
    .param p1    # Lcom/sma/smartv3/model/BGEMRiskData;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p2    # Lcom/sma/smartv3/model/BGEMMeasurementData;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Lcom/sma/smartv3/model/BGEMRangeAnalysisResult;

    invoke-direct {v0, p1, p2}, Lcom/sma/smartv3/model/BGEMRangeAnalysisResult;-><init>(Lcom/sma/smartv3/model/BGEMRiskData;Lcom/sma/smartv3/model/BGEMMeasurementData;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/sma/smartv3/model/BGEMRangeAnalysisResult;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/sma/smartv3/model/BGEMRangeAnalysisResult;

    iget-object v1, p0, Lcom/sma/smartv3/model/BGEMRangeAnalysisResult;->riskData:Lcom/sma/smartv3/model/BGEMRiskData;

    iget-object v3, p1, Lcom/sma/smartv3/model/BGEMRangeAnalysisResult;->riskData:Lcom/sma/smartv3/model/BGEMRiskData;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/sma/smartv3/model/BGEMRangeAnalysisResult;->measurementData:Lcom/sma/smartv3/model/BGEMMeasurementData;

    iget-object p1, p1, Lcom/sma/smartv3/model/BGEMRangeAnalysisResult;->measurementData:Lcom/sma/smartv3/model/BGEMMeasurementData;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getMeasurementData()Lcom/sma/smartv3/model/BGEMMeasurementData;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/BGEMRangeAnalysisResult;->measurementData:Lcom/sma/smartv3/model/BGEMMeasurementData;

    return-object v0
.end method

.method public final getRiskData()Lcom/sma/smartv3/model/BGEMRiskData;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/BGEMRangeAnalysisResult;->riskData:Lcom/sma/smartv3/model/BGEMRiskData;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/sma/smartv3/model/BGEMRangeAnalysisResult;->riskData:Lcom/sma/smartv3/model/BGEMRiskData;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/sma/smartv3/model/BGEMRiskData;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/sma/smartv3/model/BGEMRangeAnalysisResult;->measurementData:Lcom/sma/smartv3/model/BGEMMeasurementData;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/sma/smartv3/model/BGEMMeasurementData;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    return v0
.end method

.method public final setMeasurementData(Lcom/sma/smartv3/model/BGEMMeasurementData;)V
    .locals 0
    .param p1    # Lcom/sma/smartv3/model/BGEMMeasurementData;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/model/BGEMRangeAnalysisResult;->measurementData:Lcom/sma/smartv3/model/BGEMMeasurementData;

    return-void
.end method

.method public final setRiskData(Lcom/sma/smartv3/model/BGEMRiskData;)V
    .locals 0
    .param p1    # Lcom/sma/smartv3/model/BGEMRiskData;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/model/BGEMRangeAnalysisResult;->riskData:Lcom/sma/smartv3/model/BGEMRiskData;

    return-void
.end method

.method public final toBloodGlucose2()Lcom/sma/smartv3/db/entity/BloodGlucose2;
    .locals 29
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    move-object/from16 v1, p0

    const-string v0, "toJson(...)"

    iget-object v2, v1, Lcom/sma/smartv3/model/BGEMRangeAnalysisResult;->measurementData:Lcom/sma/smartv3/model/BGEMMeasurementData;

    if-eqz v2, :cond_0

    iget-object v2, v1, Lcom/sma/smartv3/model/BGEMRangeAnalysisResult;->riskData:Lcom/sma/smartv3/model/BGEMRiskData;

    if-eqz v2, :cond_0

    :try_start_0
    invoke-static {}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->IO0iXO0O()Ljava/text/SimpleDateFormat;

    move-result-object v2

    iget-object v3, v1, Lcom/sma/smartv3/model/BGEMRangeAnalysisResult;->measurementData:Lcom/sma/smartv3/model/BGEMMeasurementData;

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v3}, Lcom/sma/smartv3/model/BGEMMeasurementData;->getEnd_time()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v5

    iget-object v2, v1, Lcom/sma/smartv3/model/BGEMRangeAnalysisResult;->measurementData:Lcom/sma/smartv3/model/BGEMMeasurementData;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lcom/sma/smartv3/model/BGEMMeasurementData;->getMeasurement_id()Ljava/lang/String;

    move-result-object v7

    iget-object v2, v1, Lcom/sma/smartv3/model/BGEMRangeAnalysisResult;->measurementData:Lcom/sma/smartv3/model/BGEMMeasurementData;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lcom/sma/smartv3/model/BGEMMeasurementData;->getUser_id()Ljava/lang/String;

    move-result-object v8

    iget-object v2, v1, Lcom/sma/smartv3/model/BGEMRangeAnalysisResult;->measurementData:Lcom/sma/smartv3/model/BGEMMeasurementData;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lcom/sma/smartv3/model/BGEMMeasurementData;->getStart_time()Ljava/lang/String;

    move-result-object v9

    iget-object v2, v1, Lcom/sma/smartv3/model/BGEMRangeAnalysisResult;->measurementData:Lcom/sma/smartv3/model/BGEMMeasurementData;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lcom/sma/smartv3/model/BGEMMeasurementData;->getEnd_time()Ljava/lang/String;

    move-result-object v10

    iget-object v2, v1, Lcom/sma/smartv3/model/BGEMRangeAnalysisResult;->measurementData:Lcom/sma/smartv3/model/BGEMMeasurementData;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lcom/sma/smartv3/model/BGEMMeasurementData;->getModel_no()Ljava/lang/String;

    move-result-object v11

    iget-object v2, v1, Lcom/sma/smartv3/model/BGEMRangeAnalysisResult;->measurementData:Lcom/sma/smartv3/model/BGEMMeasurementData;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lcom/sma/smartv3/model/BGEMMeasurementData;->getLower_bound()D

    move-result-wide v12

    iget-object v2, v1, Lcom/sma/smartv3/model/BGEMRangeAnalysisResult;->measurementData:Lcom/sma/smartv3/model/BGEMMeasurementData;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lcom/sma/smartv3/model/BGEMMeasurementData;->getUpper_bound()D

    move-result-wide v14

    iget-object v2, v1, Lcom/sma/smartv3/model/BGEMRangeAnalysisResult;->measurementData:Lcom/sma/smartv3/model/BGEMMeasurementData;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lcom/sma/smartv3/model/BGEMMeasurementData;->getFasting()Z

    move-result v2

    invoke-static {v2}, Lcom/android/mltcode/paycertificationapi/OiOX0i;->iO(Z)I

    move-result v16

    iget-object v2, v1, Lcom/sma/smartv3/model/BGEMRangeAnalysisResult;->measurementData:Lcom/sma/smartv3/model/BGEMMeasurementData;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lcom/sma/smartv3/model/BGEMMeasurementData;->getWithin_2hrs_meal()Z

    move-result v2

    invoke-static {v2}, Lcom/android/mltcode/paycertificationapi/OiOX0i;->iO(Z)I

    move-result v17

    iget-object v2, v1, Lcom/sma/smartv3/model/BGEMRangeAnalysisResult;->measurementData:Lcom/sma/smartv3/model/BGEMMeasurementData;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lcom/sma/smartv3/model/BGEMMeasurementData;->getCompleted_progress()Z

    move-result v2

    invoke-static {v2}, Lcom/android/mltcode/paycertificationapi/OiOX0i;->iO(Z)I

    move-result v18

    iget-object v2, v1, Lcom/sma/smartv3/model/BGEMRangeAnalysisResult;->riskData:Lcom/sma/smartv3/model/BGEMRiskData;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lcom/sma/smartv3/model/BGEMRiskData;->getRisk_code()Ljava/lang/String;

    move-result-object v20

    iget-object v2, v1, Lcom/sma/smartv3/model/BGEMRangeAnalysisResult;->riskData:Lcom/sma/smartv3/model/BGEMRiskData;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lcom/sma/smartv3/model/BGEMRiskData;->getInsights()Ljava/lang/String;

    move-result-object v21

    new-instance v2, Lcom/google/gson/Gson;

    invoke-direct {v2}, Lcom/google/gson/Gson;-><init>()V

    iget-object v3, v1, Lcom/sma/smartv3/model/BGEMRangeAnalysisResult;->riskData:Lcom/sma/smartv3/model/BGEMRiskData;

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v3}, Lcom/sma/smartv3/model/BGEMRiskData;->getTips()[Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lcom/google/gson/Gson;

    invoke-direct {v3}, Lcom/google/gson/Gson;-><init>()V

    iget-object v4, v1, Lcom/sma/smartv3/model/BGEMRangeAnalysisResult;->riskData:Lcom/sma/smartv3/model/BGEMRiskData;

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v4}, Lcom/sma/smartv3/model/BGEMRiskData;->getLocale_insights()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Lcom/google/gson/Gson;

    invoke-direct {v4}, Lcom/google/gson/Gson;-><init>()V

    move-object/from16 v22, v2

    iget-object v2, v1, Lcom/sma/smartv3/model/BGEMRangeAnalysisResult;->riskData:Lcom/sma/smartv3/model/BGEMRiskData;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lcom/sma/smartv3/model/BGEMRiskData;->getLocale_tips()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v4, v2}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v1, Lcom/sma/smartv3/model/BGEMRangeAnalysisResult;->riskData:Lcom/sma/smartv3/model/BGEMRiskData;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/sma/smartv3/model/BGEMRiskData;->getCurrent_level()I

    move-result v19

    move-object/from16 v23, v3

    new-instance v3, Lcom/sma/smartv3/db/entity/BloodGlucose2;

    const v27, 0xc0001

    const/16 v28, 0x0

    const/4 v4, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    move-object/from16 v24, v2

    invoke-direct/range {v3 .. v28}, Lcom/sma/smartv3/db/entity/BloodGlucose2;-><init>(IJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDIIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v3

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/BGEMRangeAnalysisResult;->riskData:Lcom/sma/smartv3/model/BGEMRiskData;

    iget-object v1, p0, Lcom/sma/smartv3/model/BGEMRangeAnalysisResult;->measurementData:Lcom/sma/smartv3/model/BGEMMeasurementData;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "BGEMRangeAnalysisResult(riskData="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", measurementData="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
