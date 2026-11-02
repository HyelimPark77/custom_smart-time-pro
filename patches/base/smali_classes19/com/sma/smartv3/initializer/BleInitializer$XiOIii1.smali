.class public final Lcom/sma/smartv3/initializer/BleInitializer$XiOIii1;
.super Lcom/blankj/utilcode/util/ThreadUtils$SimpleTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/initializer/BleInitializer;->onReadRri(Ljava/util/List;)V
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
    value = "SMAP\nBleInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadRri$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2521:1\n1869#2,2:2522\n*S KotlinDebug\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadRri$1\n*L\n2059#1:2522,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBleInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadRri$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2521:1\n1869#2,2:2522\n*S KotlinDebug\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadRri$1\n*L\n2059#1:2522,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic I1:Ljava/util/Date;

.field public final synthetic IO:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleRri;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic X11iII1O1:Ljava/text/SimpleDateFormat;

.field public final synthetic XXX11i:Ljava/text/SimpleDateFormat;

.field public final synthetic iX1O1:J


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/util/Date;JLjava/text/SimpleDateFormat;Ljava/text/SimpleDateFormat;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleRri;",
            ">;",
            "Ljava/util/Date;",
            "J",
            "Ljava/text/SimpleDateFormat;",
            "Ljava/text/SimpleDateFormat;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/initializer/BleInitializer$XiOIii1;->IO:Ljava/util/List;

    iput-object p2, p0, Lcom/sma/smartv3/initializer/BleInitializer$XiOIii1;->I1:Ljava/util/Date;

    iput-wide p3, p0, Lcom/sma/smartv3/initializer/BleInitializer$XiOIii1;->iX1O1:J

    iput-object p5, p0, Lcom/sma/smartv3/initializer/BleInitializer$XiOIii1;->X11iII1O1:Ljava/text/SimpleDateFormat;

    iput-object p6, p0, Lcom/sma/smartv3/initializer/BleInitializer$XiOIii1;->XXX11i:Ljava/text/SimpleDateFormat;

    invoke-direct {p0}, Lcom/blankj/utilcode/util/ThreadUtils$SimpleTask;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic doInBackground()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/sma/smartv3/initializer/BleInitializer$XiOIii1;->doInBackground()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method public doInBackground()Ljava/lang/Void;
    .locals 15

    .line 2
    const-string v0, ","

    .line 3
    :try_start_0
    iget-object v1, p0, Lcom/sma/smartv3/initializer/BleInitializer$XiOIii1;->IO:Ljava/util/List;

    check-cast v1, Ljava/lang/Iterable;

    iget-object v2, p0, Lcom/sma/smartv3/initializer/BleInitializer$XiOIii1;->I1:Ljava/util/Date;

    iget-wide v3, p0, Lcom/sma/smartv3/initializer/BleInitializer$XiOIii1;->iX1O1:J

    iget-object v5, p0, Lcom/sma/smartv3/initializer/BleInitializer$XiOIii1;->X11iII1O1:Ljava/text/SimpleDateFormat;

    iget-object v6, p0, Lcom/sma/smartv3/initializer/BleInitializer$XiOIii1;->XXX11i:Ljava/text/SimpleDateFormat;

    .line 4
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/szabh/smable3/entity/BleRri;

    .line 5
    invoke-virtual {v7}, Lcom/szabh/smable3/entity/BleRri;->getMTime()I

    move-result v8

    int-to-long v8, v8

    const-wide/16 v10, 0x3e8

    mul-long/2addr v8, v10

    sub-long/2addr v8, v3

    const v12, 0x2932e00

    int-to-long v12, v12

    add-long/2addr v8, v12

    invoke-virtual {v2, v8, v9}, Ljava/util/Date;->setTime(J)V

    .line 6
    new-instance v8, Ljava/io/File;

    sget-object v9, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v9}, Lcom/android/mltcode/paycertificationapi/uz0;->XX1Oi(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v9

    invoke-virtual {v5, v2}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v12

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "rri_"

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v12, ".csv"

    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-direct {v8, v9, v12}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 7
    invoke-static {v8}, Lcom/blankj/utilcode/util/FileUtils;->isFileExists(Ljava/io/File;)Z

    move-result v9

    if-nez v9, :cond_0

    .line 8
    invoke-static {v8}, Lcom/blankj/utilcode/util/FileUtils;->createOrExistsFile(Ljava/io/File;)Z

    .line 9
    const-string v9, "timestamp,date,rri0,rri1\n"

    const/4 v12, 0x0

    .line 10
    invoke-static {v8, v9, v12}, Lcom/blankj/utilcode/util/FileIOUtils;->writeFileFromString(Ljava/io/File;Ljava/lang/String;Z)Z

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_2

    .line 11
    :cond_0
    :goto_1
    invoke-virtual {v7}, Lcom/szabh/smable3/entity/BleRri;->getMTime()I

    move-result v9

    int-to-long v12, v9

    mul-long/2addr v12, v10

    sub-long/2addr v12, v3

    .line 12
    invoke-virtual {v2, v12, v13}, Ljava/util/Date;->setTime(J)V

    .line 13
    invoke-virtual {v7}, Lcom/szabh/smable3/entity/BleRri;->getMTime()I

    move-result v9

    invoke-virtual {v6, v2}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v7}, Lcom/szabh/smable3/entity/BleRri;->getMRRI()I

    move-result v11

    invoke-virtual {v7}, Lcom/szabh/smable3/entity/BleRri;->getMRRI2()I

    move-result v7

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v7, "\n"

    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    const/4 v9, 0x1

    .line 14
    invoke-static {v8, v7, v9}, Lcom/blankj/utilcode/util/FileIOUtils;->writeFileFromString(Ljava/io/File;Ljava/lang/String;Z)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_0

    .line 15
    :goto_2
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/initializer/BleInitializer$XiOIii1;->onSuccess(Ljava/lang/Void;)V

    return-void
.end method

.method public onSuccess(Ljava/lang/Void;)V
    .locals 0

    .line 1
    return-void
.end method
