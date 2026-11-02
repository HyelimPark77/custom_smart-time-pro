.class public final Lcom/sma/smartv3/initializer/BleInitializer$IXXOO;
.super Lcom/blankj/utilcode/util/ThreadUtils$SimpleTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/initializer/BleInitializer;->onReceiveGSensorSHSY(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/blankj/utilcode/util/ThreadUtils$SimpleTask<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBleInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReceiveGSensorSHSY$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2521:1\n1878#2,3:2522\n*S KotlinDebug\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReceiveGSensorSHSY$1\n*L\n2155#1:2522,3\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBleInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReceiveGSensorSHSY$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2521:1\n1878#2,3:2522\n*S KotlinDebug\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReceiveGSensorSHSY$1\n*L\n2155#1:2522,3\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic I1:Ljava/util/Calendar;

.field public final synthetic IO:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleGSensorSHSY;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic X11iII1O1:Ljava/text/SimpleDateFormat;

.field public final synthetic iX1O1:Ljava/text/SimpleDateFormat;


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/util/Calendar;Ljava/text/SimpleDateFormat;Ljava/text/SimpleDateFormat;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleGSensorSHSY;",
            ">;",
            "Ljava/util/Calendar;",
            "Ljava/text/SimpleDateFormat;",
            "Ljava/text/SimpleDateFormat;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/initializer/BleInitializer$IXXOO;->IO:Ljava/util/List;

    iput-object p2, p0, Lcom/sma/smartv3/initializer/BleInitializer$IXXOO;->I1:Ljava/util/Calendar;

    iput-object p3, p0, Lcom/sma/smartv3/initializer/BleInitializer$IXXOO;->iX1O1:Ljava/text/SimpleDateFormat;

    iput-object p4, p0, Lcom/sma/smartv3/initializer/BleInitializer$IXXOO;->X11iII1O1:Ljava/text/SimpleDateFormat;

    invoke-direct {p0}, Lcom/blankj/utilcode/util/ThreadUtils$SimpleTask;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic doInBackground()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/sma/smartv3/initializer/BleInitializer$IXXOO;->doInBackground()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method public doInBackground()Ljava/lang/Void;
    .locals 21

    move-object/from16 v1, p0

    .line 2
    const-string v0, "%d"

    const-string v2, "%+.8f"

    const-string v3, "format(...)"

    const-string v4, ","

    .line 3
    :try_start_0
    iget-object v5, v1, Lcom/sma/smartv3/initializer/BleInitializer$IXXOO;->IO:Ljava/util/List;

    check-cast v5, Ljava/lang/Iterable;

    iget-object v6, v1, Lcom/sma/smartv3/initializer/BleInitializer$IXXOO;->I1:Ljava/util/Calendar;

    iget-object v7, v1, Lcom/sma/smartv3/initializer/BleInitializer$IXXOO;->iX1O1:Ljava/text/SimpleDateFormat;

    iget-object v8, v1, Lcom/sma/smartv3/initializer/BleInitializer$IXXOO;->X11iII1O1:Ljava/text/SimpleDateFormat;

    .line 4
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    const/4 v10, 0x0

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    add-int/lit8 v12, v10, 0x1

    if-gez v10, :cond_0

    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->XOX0O0()V

    goto :goto_1

    :catch_0
    move-exception v0

    goto/16 :goto_3

    :cond_0
    :goto_1
    check-cast v11, Lcom/szabh/smable3/entity/BleGSensorSHSY;

    .line 5
    invoke-virtual {v6}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v13

    invoke-virtual {v11}, Lcom/szabh/smable3/entity/BleGSensorSHSY;->getMTime()J

    move-result-wide v15

    add-long/2addr v13, v15

    if-nez v10, :cond_1

    .line 6
    sget-object v10, Lcom/sma/smartv3/initializer/BleInitializer;->IO:Lcom/sma/smartv3/initializer/BleInitializer;

    invoke-virtual {v10}, Lcom/sma/smartv3/initializer/BleInitializer;->XXiO0i()J

    move-result-wide v15

    const-wide/16 v17, 0x0

    cmp-long v15, v15, v17

    if-nez v15, :cond_1

    .line 7
    invoke-virtual {v10, v13, v14}, Lcom/sma/smartv3/initializer/BleInitializer;->I00(J)V

    .line 8
    :cond_1
    new-instance v10, Ljava/io/File;

    .line 9
    sget-object v15, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v15}, Lcom/android/mltcode/paycertificationapi/uz0;->X0i1O(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v15

    .line 10
    sget-object v16, Lcom/sma/smartv3/initializer/BleInitializer;->IO:Lcom/sma/smartv3/initializer/BleInitializer;

    invoke-virtual/range {v16 .. v16}, Lcom/sma/smartv3/initializer/BleInitializer;->XXiO0i()J

    move-result-wide v16

    invoke-static/range {v16 .. v17}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    invoke-virtual {v7, v9}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    sget-object v16, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    invoke-virtual/range {v16 .. v16}, Lcom/szabh/smable3/component/BaseBleCache;->getMBleAddress()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v16, v5

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v17, v6

    const-string v6, "gSensorSHSYs_"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "_"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ".csv"

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 11
    invoke-direct {v10, v15, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 12
    invoke-static {v10}, Lcom/blankj/utilcode/util/FileUtils;->isFileExists(Ljava/io/File;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 13
    invoke-static {v10}, Lcom/blankj/utilcode/util/FileUtils;->createOrExistsFile(Ljava/io/File;)Z

    .line 14
    const-string v1, "Timestamp,X,Y,Z,label,sleepParticularCase,steps,hr\n"

    const/4 v5, 0x0

    .line 15
    invoke-static {v10, v1, v5}, Lcom/blankj/utilcode/util/FileIOUtils;->writeFileFromString(Ljava/io/File;Ljava/lang/String;Z)Z

    goto :goto_2

    :cond_2
    const/4 v5, 0x0

    .line 16
    :goto_2
    new-instance v1, Ljava/util/Date;

    invoke-direct {v1, v13, v14}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v8, v1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    .line 17
    invoke-virtual {v11}, Lcom/szabh/smable3/entity/BleGSensorSHSY;->getMX()S

    move-result v6

    int-to-float v6, v6

    const/high16 v9, 0x44800000    # 1024.0f

    div-float/2addr v6, v9

    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    filled-new-array {v6}, [Ljava/lang/Object;

    move-result-object v6

    const/4 v13, 0x1

    invoke-static {v6, v13}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v6

    invoke-static {v2, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    invoke-virtual {v11}, Lcom/szabh/smable3/entity/BleGSensorSHSY;->getMY()S

    move-result v14

    int-to-float v14, v14

    div-float/2addr v14, v9

    invoke-static {v14}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v14

    filled-new-array {v14}, [Ljava/lang/Object;

    move-result-object v14

    invoke-static {v14, v13}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v14

    invoke-static {v2, v14}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v14

    invoke-static {v14, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    invoke-virtual {v11}, Lcom/szabh/smable3/entity/BleGSensorSHSY;->getMZ()S

    move-result v15

    int-to-float v15, v15

    div-float/2addr v15, v9

    invoke-static {v15}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v9

    filled-new-array {v9}, [Ljava/lang/Object;

    move-result-object v9

    invoke-static {v9, v13}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v9

    invoke-static {v2, v9}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    sget-object v15, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v11}, Lcom/szabh/smable3/entity/BleGSensorSHSY;->getMActivityMode()I

    move-result v5

    invoke-virtual {v15, v5}, Lcom/android/mltcode/paycertificationapi/q62;->i01OOiI(I)Ljava/lang/String;

    move-result-object v5

    .line 21
    invoke-virtual {v11}, Lcom/szabh/smable3/entity/BleGSensorSHSY;->getMSleepParticularCase()I

    move-result v15

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    filled-new-array {v15}, [Ljava/lang/Object;

    move-result-object v15

    invoke-static {v15, v13}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v15

    invoke-static {v0, v15}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v15

    invoke-static {v15, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    invoke-virtual {v11}, Lcom/szabh/smable3/entity/BleGSensorSHSY;->getMStep()I

    move-result v19

    invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v19

    move-object/from16 v20, v2

    filled-new-array/range {v19 .. v19}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2, v13}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v2

    invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    invoke-virtual {v11}, Lcom/szabh/smable3/entity/BleGSensorSHSY;->getMHr()I

    move-result v11

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    filled-new-array {v11}, [Ljava/lang/Object;

    move-result-object v11

    invoke-static {v11, v13}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v11

    invoke-static {v0, v11}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v13, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n"

    invoke-virtual {v13, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    .line 24
    invoke-static {v10, v1, v2}, Lcom/blankj/utilcode/util/FileIOUtils;->writeFileFromString(Ljava/io/File;Ljava/lang/String;Z)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object/from16 v1, p0

    move v10, v12

    move-object/from16 v5, v16

    move-object/from16 v6, v17

    move-object/from16 v2, v20

    goto/16 :goto_0

    .line 25
    :goto_3
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_3
    const/4 v0, 0x0

    return-object v0
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/initializer/BleInitializer$IXXOO;->onSuccess(Ljava/lang/Void;)V

    return-void
.end method

.method public onSuccess(Ljava/lang/Void;)V
    .locals 0

    .line 1
    return-void
.end method
