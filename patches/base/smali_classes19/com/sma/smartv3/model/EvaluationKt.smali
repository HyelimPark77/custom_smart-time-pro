.class public final Lcom/sma/smartv3/model/EvaluationKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nEvaluation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Evaluation.kt\ncom/sma/smartv3/model/EvaluationKt\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,95:1\n93#2,2:96\n90#2:98\n85#2,3:99\n*S KotlinDebug\n*F\n+ 1 Evaluation.kt\ncom/sma/smartv3/model/EvaluationKt\n*L\n19#1:96,2\n19#1:98\n41#1:99,3\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nEvaluation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Evaluation.kt\ncom/sma/smartv3/model/EvaluationKt\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,95:1\n93#2,2:96\n90#2:98\n85#2,3:99\n*S KotlinDebug\n*F\n+ 1 Evaluation.kt\ncom/sma/smartv3/model/EvaluationKt\n*L\n19#1:96,2\n19#1:98\n41#1:99,3\n*E\n"
    }
.end annotation


# direct methods
.method public static final isShowEvaluationDialog()Z
    .locals 25

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->OXO1()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    new-instance v2, Lcom/google/gson/Gson;

    invoke-direct {v2}, Lcom/google/gson/Gson;-><init>()V

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "EVALUATION_POP_UP_TIME"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v5, 0x5f

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-class v6, Lcom/sma/smartv3/model/EvaluationTimeData;

    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1, v6}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-virtual {v6}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v1

    :cond_0
    check-cast v1, Lcom/sma/smartv3/model/EvaluationTimeData;

    const-string v2, "CONNECTION_TIMEOUT_TIME"

    invoke-static {v2}, Lcom/sma/smartv3/model/EvaluationKt;->specialProcessingTime(Ljava/lang/String;)J

    move-result-wide v7

    const-string v3, "DIAL_SYNCHRONOUS_FAILURE_TIME"

    invoke-static {v3}, Lcom/sma/smartv3/model/EvaluationKt;->specialProcessingTime(Ljava/lang/String;)J

    move-result-wide v9

    const-string v11, "OTA_SYNCHRONOUS_FAILURE_TIME"

    invoke-static {v11}, Lcom/sma/smartv3/model/EvaluationKt;->specialProcessingTime(Ljava/lang/String;)J

    move-result-wide v12

    sget-object v14, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "isShowEvaluationDialog evaluationData "

    invoke-virtual {v15, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, " "

    invoke-virtual {v15, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v14, v15}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/sma/smartv3/model/EvaluationTimeData;->getNoShowPop()Z

    move-result v15

    move-object/from16 v16, v0

    const/4 v0, 0x0

    if-nez v15, :cond_4

    sget-object v15, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v15}, Lcom/android/mltcode/paycertificationapi/q62;->iOXiO1O1I()Z

    move-result v15

    if-eqz v15, :cond_1

    goto/16 :goto_0

    :cond_1
    invoke-virtual {v1}, Lcom/sma/smartv3/model/EvaluationTimeData;->getTime()J

    move-result-wide v17

    const-wide/16 v19, 0x0

    cmp-long v5, v17, v19

    if-nez v5, :cond_2

    invoke-virtual {v1}, Lcom/sma/smartv3/model/EvaluationTimeData;->getVersionCode()I

    move-result v5

    if-nez v5, :cond_2

    const/16 v5, 0xf

    invoke-static {v7, v8, v5}, Lcom/sma/smartv3/model/EvaluationKt;->timeGreaterThan(JI)Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-static {v9, v10, v5}, Lcom/sma/smartv3/model/EvaluationKt;->timeGreaterThan(JI)Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-static {v12, v13, v5}, Lcom/sma/smartv3/model/EvaluationKt;->timeGreaterThan(JI)Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-virtual/range {v16 .. v16}, Lcom/android/mltcode/paycertificationapi/a01;->OXO1()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    new-instance v16, Lcom/sma/smartv3/model/EvaluationTimeData;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v17

    invoke-static {}, Lcom/blankj/utilcode/util/AppUtils;->getAppVersionCode()I

    move-result v19

    const/16 v23, 0xc

    const/16 v24, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    invoke-direct/range {v16 .. v24}, Lcom/sma/smartv3/model/EvaluationTimeData;-><init>(JIJZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v2, v16

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v4, 0x5f

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lcom/google/gson/Gson;

    invoke-direct {v4}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v4, v2}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v3, v2, v0}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v0, "isShowEvaluationDialog   showTime"

    invoke-virtual {v14, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    const/4 v0, 0x1

    return v0

    :cond_2
    invoke-virtual {v1}, Lcom/sma/smartv3/model/EvaluationTimeData;->getVersionCode()I

    move-result v1

    invoke-static {}, Lcom/blankj/utilcode/util/AppUtils;->getAppVersionCode()I

    move-result v5

    if-ge v1, v5, :cond_3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    invoke-virtual/range {v16 .. v16}, Lcom/android/mltcode/paycertificationapi/a01;->OXO1()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    invoke-virtual {v1, v4}, Lcom/blankj/utilcode/util/SPUtils;->remove(Ljava/lang/String;)V

    invoke-virtual/range {v16 .. v16}, Lcom/android/mltcode/paycertificationapi/a01;->OXO1()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    invoke-virtual {v1, v2, v5, v6}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;J)V

    invoke-virtual/range {v16 .. v16}, Lcom/android/mltcode/paycertificationapi/a01;->OXO1()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    invoke-virtual {v1, v3, v5, v6}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;J)V

    invoke-virtual/range {v16 .. v16}, Lcom/android/mltcode/paycertificationapi/a01;->OXO1()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    invoke-virtual {v1, v11, v5, v6}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;J)V

    const-string v1, "isShowEvaluationDialog   replaceTime"

    invoke-virtual {v14, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    :cond_3
    return v0

    :cond_4
    :goto_0
    sget-object v6, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v6}, Lcom/android/mltcode/paycertificationapi/q62;->iOXiO1O1I()Z

    move-result v7

    if-eqz v7, :cond_5

    invoke-virtual/range {v16 .. v16}, Lcom/android/mltcode/paycertificationapi/a01;->OXO1()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v7

    invoke-virtual {v7, v4}, Lcom/blankj/utilcode/util/SPUtils;->remove(Ljava/lang/String;)V

    invoke-virtual/range {v16 .. v16}, Lcom/android/mltcode/paycertificationapi/a01;->OXO1()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v4

    invoke-virtual {v4, v2}, Lcom/blankj/utilcode/util/SPUtils;->remove(Ljava/lang/String;)V

    invoke-virtual/range {v16 .. v16}, Lcom/android/mltcode/paycertificationapi/a01;->OXO1()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v2

    invoke-virtual {v2, v3}, Lcom/blankj/utilcode/util/SPUtils;->remove(Ljava/lang/String;)V

    invoke-virtual/range {v16 .. v16}, Lcom/android/mltcode/paycertificationapi/a01;->OXO1()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v2

    invoke-virtual {v2, v11}, Lcom/blankj/utilcode/util/SPUtils;->remove(Ljava/lang/String;)V

    :cond_5
    invoke-virtual {v1}, Lcom/sma/smartv3/model/EvaluationTimeData;->getNoShowPop()Z

    move-result v1

    invoke-virtual {v6}, Lcom/android/mltcode/paycertificationapi/q62;->iOXiO1O1I()Z

    move-result v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "isShowEvaluationDialog  noShowPop  "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, " || "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v14, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    return v0
.end method

.method public static final putConnectionTimeoutTime()V
    .locals 4

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->OXO1()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    const-string v1, "CONNECTION_TIMEOUT_TIME"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;J)V

    return-void
.end method

.method public static final putDialFailureTime()V
    .locals 4

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->OXO1()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    const-string v1, "DIAL_SYNCHRONOUS_FAILURE_TIME"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;J)V

    return-void
.end method

.method public static final putOtaFailureTime()V
    .locals 4

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->OXO1()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    const-string v1, "OTA_SYNCHRONOUS_FAILURE_TIME"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;J)V

    return-void
.end method

.method public static final specialProcessingTime(Ljava/lang/String;)J
    .locals 6
    .param p0    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "key"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->OXO1()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    const-wide/16 v2, 0x0

    invoke-virtual {v1, p0, v2, v3}, Lcom/blankj/utilcode/util/SPUtils;->getLong(Ljava/lang/String;J)J

    move-result-wide v4

    cmp-long v1, v4, v2

    if-nez v1, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->OXO1()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    invoke-virtual {v0, p0, v1, v2}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;J)V

    return-wide v1

    :cond_0
    return-wide v4
.end method

.method private static final timeGreaterThan(JI)Z
    .locals 4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sub-long/2addr v0, p0

    const-wide/16 p0, 0x0

    cmp-long p0, v0, p0

    const/4 p1, 0x0

    if-gez p0, :cond_0

    return p1

    :cond_0
    const p0, 0x5265c00

    mul-int/2addr p2, p0

    int-to-long v2, p2

    cmp-long p0, v0, v2

    if-lez p0, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    return p1
.end method

.method public static synthetic timeGreaterThan$default(JIILjava/lang/Object;)Z
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x3

    :cond_0
    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/model/EvaluationKt;->timeGreaterThan(JI)Z

    move-result p0

    return p0
.end method
