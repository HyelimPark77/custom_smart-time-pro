.class public final Lcom/sma/smartv3/initializer/BleInitializer$iOO1ii1;
.super Lcom/blankj/utilcode/util/ThreadUtils$SimpleTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/initializer/BleInitializer;->onReceivePpgSHSY(Ljava/util/List;)V
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
    value = "SMAP\nBleInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReceivePpgSHSY$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2521:1\n1878#2,3:2522\n*S KotlinDebug\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReceivePpgSHSY$1\n*L\n2210#1:2522,3\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBleInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReceivePpgSHSY$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2521:1\n1878#2,3:2522\n*S KotlinDebug\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReceivePpgSHSY$1\n*L\n2210#1:2522,3\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic I1:Ljava/util/Calendar;

.field public final synthetic IO:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BlePpgSHSY;",
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
            "Lcom/szabh/smable3/entity/BlePpgSHSY;",
            ">;",
            "Ljava/util/Calendar;",
            "Ljava/text/SimpleDateFormat;",
            "Ljava/text/SimpleDateFormat;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/initializer/BleInitializer$iOO1ii1;->IO:Ljava/util/List;

    iput-object p2, p0, Lcom/sma/smartv3/initializer/BleInitializer$iOO1ii1;->I1:Ljava/util/Calendar;

    iput-object p3, p0, Lcom/sma/smartv3/initializer/BleInitializer$iOO1ii1;->iX1O1:Ljava/text/SimpleDateFormat;

    iput-object p4, p0, Lcom/sma/smartv3/initializer/BleInitializer$iOO1ii1;->X11iII1O1:Ljava/text/SimpleDateFormat;

    invoke-direct {p0}, Lcom/blankj/utilcode/util/ThreadUtils$SimpleTask;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic doInBackground()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/sma/smartv3/initializer/BleInitializer$iOO1ii1;->doInBackground()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method public doInBackground()Ljava/lang/Void;
    .locals 18

    move-object/from16 v1, p0

    .line 2
    const-string v0, ","

    const-string v2, "format(...)"

    const-string v3, "%d"

    .line 3
    :try_start_0
    iget-object v4, v1, Lcom/sma/smartv3/initializer/BleInitializer$iOO1ii1;->IO:Ljava/util/List;

    check-cast v4, Ljava/lang/Iterable;

    iget-object v5, v1, Lcom/sma/smartv3/initializer/BleInitializer$iOO1ii1;->I1:Ljava/util/Calendar;

    iget-object v6, v1, Lcom/sma/smartv3/initializer/BleInitializer$iOO1ii1;->iX1O1:Ljava/text/SimpleDateFormat;

    iget-object v7, v1, Lcom/sma/smartv3/initializer/BleInitializer$iOO1ii1;->X11iII1O1:Ljava/text/SimpleDateFormat;

    .line 4
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    const/4 v9, 0x0

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    add-int/lit8 v11, v9, 0x1

    if-gez v9, :cond_0

    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->XOX0O0()V

    goto :goto_1

    :catch_0
    move-exception v0

    goto/16 :goto_3

    :cond_0
    :goto_1
    check-cast v10, Lcom/szabh/smable3/entity/BlePpgSHSY;

    .line 5
    invoke-virtual {v5}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v12

    invoke-virtual {v10}, Lcom/szabh/smable3/entity/BlePpgSHSY;->getMTime()J

    move-result-wide v14

    add-long/2addr v12, v14

    if-nez v9, :cond_1

    .line 6
    sget-object v9, Lcom/sma/smartv3/initializer/BleInitializer;->IO:Lcom/sma/smartv3/initializer/BleInitializer;

    invoke-virtual {v9}, Lcom/sma/smartv3/initializer/BleInitializer;->IX1XiI()J

    move-result-wide v14

    const-wide/16 v16, 0x0

    cmp-long v14, v14, v16

    if-nez v14, :cond_1

    .line 7
    invoke-virtual {v9, v12, v13}, Lcom/sma/smartv3/initializer/BleInitializer;->I0OX(J)V

    .line 8
    :cond_1
    new-instance v9, Ljava/io/File;

    .line 9
    sget-object v14, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v14}, Lcom/android/mltcode/paycertificationapi/uz0;->X0i1O(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v14

    .line 10
    sget-object v15, Lcom/sma/smartv3/initializer/BleInitializer;->IO:Lcom/sma/smartv3/initializer/BleInitializer;

    invoke-virtual {v15}, Lcom/sma/smartv3/initializer/BleInitializer;->IX1XiI()J

    move-result-wide v15

    invoke-static/range {v15 .. v16}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v15

    invoke-virtual {v6, v15}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v15

    sget-object v16, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    invoke-virtual/range {v16 .. v16}, Lcom/szabh/smable3/component/BaseBleCache;->getMBleAddress()Ljava/lang/String;

    move-result-object v8

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v16, v4

    const-string v4, "ppgSHSYs_"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "_"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ".csv"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 11
    invoke-direct {v9, v14, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 12
    invoke-static {v9}, Lcom/blankj/utilcode/util/FileUtils;->isFileExists(Ljava/io/File;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 13
    invoke-static {v9}, Lcom/blankj/utilcode/util/FileUtils;->createOrExistsFile(Ljava/io/File;)Z

    .line 14
    const-string v1, "Timestamp,PPGRaw,PPG\n"

    const/4 v4, 0x0

    .line 15
    invoke-static {v9, v1, v4}, Lcom/blankj/utilcode/util/FileIOUtils;->writeFileFromString(Ljava/io/File;Ljava/lang/String;Z)Z

    goto :goto_2

    :cond_2
    const/4 v4, 0x0

    .line 16
    :goto_2
    new-instance v1, Ljava/util/Date;

    invoke-direct {v1, v12, v13}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v7, v1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    .line 17
    invoke-virtual {v10}, Lcom/szabh/smable3/entity/BlePpgSHSY;->getMPGGRaw()J

    move-result-wide v12

    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    filled-new-array {v8}, [Ljava/lang/Object;

    move-result-object v8

    const/4 v12, 0x1

    invoke-static {v8, v12}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v8

    invoke-static {v3, v8}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    invoke-virtual {v10}, Lcom/szabh/smable3/entity/BlePpgSHSY;->getMPGG()I

    move-result v10

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    filled-new-array {v10}, [Ljava/lang/Object;

    move-result-object v10

    invoke-static {v10, v12}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v10

    invoke-static {v3, v10}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v13, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n"

    invoke-virtual {v13, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 19
    invoke-static {v9, v1, v12}, Lcom/blankj/utilcode/util/FileIOUtils;->writeFileFromString(Ljava/io/File;Ljava/lang/String;Z)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object/from16 v1, p0

    move v9, v11

    move-object/from16 v4, v16

    goto/16 :goto_0

    .line 20
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

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/initializer/BleInitializer$iOO1ii1;->onSuccess(Ljava/lang/Void;)V

    return-void
.end method

.method public onSuccess(Ljava/lang/Void;)V
    .locals 0

    .line 1
    return-void
.end method
