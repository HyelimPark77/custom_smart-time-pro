.class public final Lcom/sma/smartv3/biz/DeviceInfoChecker$getWatchFaceInfo$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/O1XIiIO;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/biz/DeviceInfoChecker;->I1()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/android/mltcode/paycertificationapi/O1XIiIO<",
        "Lorg/json/JSONObject;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDeviceInfoChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceInfoChecker.kt\ncom/sma/smartv3/biz/DeviceInfoChecker$getWatchFaceInfo$1\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,920:1\n97#2,3:921\n85#2,3:926\n85#2,3:931\n97#2,3:934\n97#2,3:937\n97#2,3:940\n37#3,2:924\n37#3,2:929\n*S KotlinDebug\n*F\n+ 1 DeviceInfoChecker.kt\ncom/sma/smartv3/biz/DeviceInfoChecker$getWatchFaceInfo$1\n*L\n375#1:921,3\n388#1:926,3\n405#1:931,3\n418#1:934,3\n430#1:937,3\n431#1:940,3\n388#1:924,2\n403#1:929,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nDeviceInfoChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceInfoChecker.kt\ncom/sma/smartv3/biz/DeviceInfoChecker$getWatchFaceInfo$1\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,920:1\n97#2,3:921\n85#2,3:926\n85#2,3:931\n97#2,3:934\n97#2,3:937\n97#2,3:940\n37#3,2:924\n37#3,2:929\n*S KotlinDebug\n*F\n+ 1 DeviceInfoChecker.kt\ncom/sma/smartv3/biz/DeviceInfoChecker$getWatchFaceInfo$1\n*L\n375#1:921,3\n388#1:926,3\n405#1:931,3\n418#1:934,3\n430#1:937,3\n431#1:940,3\n388#1:924,2\n403#1:929,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Lkotlin/jvm/internal/Ref$ObjectRef;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/Ref$ObjectRef;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/biz/DeviceInfoChecker$getWatchFaceInfo$1;->OXO1:Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Lorg/json/JSONObject;)V
    .locals 20

    move-object/from16 v1, p0

    const-string v0, "WATCHFACE_TIME"

    const-string v2, "."

    const-string v3, "/"

    const-string v4, "/category/"

    filled-new-array/range {p1 .. p1}, [Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    const-class v5, [Lcom/sma/smartv3/model/WatchFaceCategory;

    const-string v6, "WATCHFACE_CATEGORY"

    const-string v7, "WATCHFACE_TOTAL"

    const/16 v8, 0x5f

    const/4 v9, 0x0

    if-eqz p1, :cond_6

    :try_start_0
    new-instance v10, Lcom/google/gson/Gson;

    invoke-direct {v10}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual/range {p1 .. p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v11

    const-class v12, Lcom/sma/smartv3/model/OnlineWatchFace;

    invoke-virtual {v10, v11, v12}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/sma/smartv3/model/OnlineWatchFace;

    invoke-virtual {v10}, Lcom/sma/smartv3/model/OnlineWatchFace;->getCategorys()[Lcom/sma/smartv3/model/WatchFaceCategory;

    move-result-object v11

    const/4 v12, 0x1

    if-nez v11, :cond_1

    invoke-virtual {v10}, Lcom/sma/smartv3/model/OnlineWatchFace;->getTotal()I

    move-result v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "getWatchFace -> list="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    sget-object v2, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/a01;->iO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v3

    invoke-virtual {v10}, Lcom/sma/smartv3/model/OnlineWatchFace;->getTotal()I

    move-result v4

    invoke-virtual {v3, v7, v4}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;I)V

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/a01;->iO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3, v9}, Lcom/blankj/utilcode/util/SPUtils;->remove(Ljava/lang/String;Z)V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v10}, Lcom/sma/smartv3/model/OnlineWatchFace;->getTotal()I

    move-result v3

    if-gt v12, v3, :cond_0

    :goto_0
    add-int/lit8 v4, v12, 0x64

    iget-object v5, v1, Lcom/sma/smartv3/biz/DeviceInfoChecker$getWatchFaceInfo$1;->OXO1:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v5, v5, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, "/preview/"

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, ".png"

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    iget-object v6, v1, Lcom/sma/smartv3/biz/DeviceInfoChecker$getWatchFaceInfo$1;->OXO1:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v6, v6, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v6, "/bin/"

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, ".bin"

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    new-instance v7, Lcom/sma/smartv3/model/WatchFaceInfo;

    invoke-direct {v7, v4, v5, v6}, Lcom/sma/smartv3/model/WatchFaceInfo;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-eq v12, v3, :cond_0

    add-int/lit8 v12, v12, 0x1

    goto :goto_0

    :catch_0
    move-exception v0

    goto/16 :goto_6

    :cond_0
    sget-object v3, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v3}, Lcom/android/mltcode/paycertificationapi/a01;->iO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v3

    const-string v4, "WATCHFACE_LIST"

    new-array v5, v9, [Lcom/sma/smartv3/model/WatchFaceInfo;

    invoke-interface {v2, v5}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v2

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-class v4, [Lcom/sma/smartv3/model/WatchFaceInfo;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lcom/google/gson/Gson;

    invoke-direct {v5}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v5, v2}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v4, v2, v9}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v18, v10

    goto/16 :goto_5

    :cond_1
    const-string v13, "getWatchFace -> category"

    filled-new-array {v13}, [Ljava/lang/Object;

    move-result-object v13

    invoke-static {v13}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    sget-object v13, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v13}, Lcom/android/mltcode/paycertificationapi/a01;->iO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v13

    invoke-virtual {v13, v7}, Lcom/blankj/utilcode/util/SPUtils;->remove(Ljava/lang/String;)V

    array-length v7, v11

    move v13, v9

    :goto_1
    if-ge v13, v7, :cond_5

    aget-object v14, v11, v13

    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v14}, Lcom/sma/smartv3/model/WatchFaceCategory;->getTotal()I

    move-result v8

    if-gt v12, v8, :cond_4

    move v9, v12

    :goto_2
    invoke-virtual {v14}, Lcom/sma/smartv3/model/WatchFaceCategory;->getType()I

    move-result v12

    mul-int/lit16 v12, v12, 0x2710

    add-int/2addr v12, v9

    move-object/from16 v16, v5

    iget-object v5, v1, Lcom/sma/smartv3/biz/DeviceInfoChecker$getWatchFaceInfo$1;->OXO1:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v5, v5, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    move/from16 v17, v7

    invoke-virtual {v14}, Lcom/sma/smartv3/model/WatchFaceCategory;->getDir()Ljava/lang/String;

    move-result-object v7

    move-object/from16 v18, v10

    invoke-virtual {v14}, Lcom/sma/smartv3/model/WatchFaceCategory;->getType()I

    move-result v10

    move/from16 v19, v13

    const/4 v13, 0x1

    if-ne v10, v13, :cond_2

    const-string v10, "gif"

    goto :goto_3

    :cond_2
    const-string v10, "png"

    :goto_3
    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v13, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    iget-object v7, v1, Lcom/sma/smartv3/biz/DeviceInfoChecker$getWatchFaceInfo$1;->OXO1:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v7, v7, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    invoke-virtual {v14}, Lcom/sma/smartv3/model/WatchFaceCategory;->getDir()Ljava/lang/String;

    move-result-object v10

    sget-object v13, Lcom/sma/smartv3/model/WatchFaceInfo;->Companion:Lcom/sma/smartv3/model/WatchFaceInfo$Companion;

    invoke-virtual {v13}, Lcom/sma/smartv3/model/WatchFaceInfo$Companion;->getWatchFaceExt()Ljava/lang/String;

    move-result-object v13

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v7, Lcom/sma/smartv3/model/WatchFaceInfo;

    invoke-direct {v7, v12, v5, v1}, Lcom/sma/smartv3/model/WatchFaceInfo;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    invoke-interface {v15, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-eq v9, v8, :cond_3

    add-int/lit8 v9, v9, 0x1

    move-object/from16 v1, p0

    move-object/from16 v5, v16

    move/from16 v7, v17

    move-object/from16 v10, v18

    move/from16 v13, v19

    goto/16 :goto_2

    :cond_3
    const/4 v1, 0x0

    goto :goto_4

    :cond_4
    move-object/from16 v16, v5

    move/from16 v17, v7

    move-object/from16 v18, v10

    move/from16 v19, v13

    move v1, v9

    :goto_4
    new-array v5, v1, [Lcom/sma/smartv3/model/WatchFaceInfo;

    invoke-interface {v15, v5}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lcom/sma/smartv3/model/WatchFaceInfo;

    invoke-virtual {v14, v1}, Lcom/sma/smartv3/model/WatchFaceCategory;->setList([Lcom/sma/smartv3/model/WatchFaceInfo;)V

    add-int/lit8 v13, v19, 0x1

    move-object/from16 v1, p0

    move-object/from16 v5, v16

    move/from16 v7, v17

    move-object/from16 v10, v18

    const/16 v8, 0x5f

    const/4 v9, 0x0

    const/4 v12, 0x1

    goto/16 :goto_1

    :cond_5
    move-object/from16 v16, v5

    move-object/from16 v18, v10

    sget-object v1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/a01;->iO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0x5f

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/google/gson/Gson;

    invoke-direct {v3}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v3, v11}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v1, v2, v3, v4}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;Z)V

    :goto_5
    invoke-static {}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->XO0O10()Ljava/text/SimpleDateFormat;

    move-result-object v1

    invoke-virtual/range {v18 .. v18}, Lcom/sma/smartv3/model/OnlineWatchFace;->getTime()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    sget-object v3, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v3}, Lcom/android/mltcode/paycertificationapi/a01;->iO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v4

    const-wide/16 v5, 0x0

    invoke-virtual {v4, v0, v5, v6}, Lcom/blankj/utilcode/util/SPUtils;->getLong(Ljava/lang/String;J)J

    move-result-wide v4

    cmp-long v4, v4, v1

    if-gez v4, :cond_7

    const-string v4, "The watch face has been updated and is cleaning the cache..."

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    invoke-virtual {v3}, Lcom/android/mltcode/paycertificationapi/a01;->iO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v3

    invoke-virtual {v3, v0, v1, v2}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;J)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/uz0;->I0iXXO(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/FileUtils;->delete(Ljava/io/File;)Z

    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->getApp()Landroid/app/Application;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/FileUtils;->delete(Ljava/io/File;)Z

    return-void

    :cond_6
    move-object/from16 v16, v5

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->iO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    invoke-virtual {v1, v7}, Lcom/blankj/utilcode/util/SPUtils;->remove(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->iO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0x5f

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v4}, Lcom/blankj/utilcode/util/SPUtils;->remove(Ljava/lang/String;Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_6
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_7
    return-void
.end method

.method public handleError(Ljava/lang/String;)V
    .locals 4

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "test "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->iO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    const-string v1, "WATCHFACE_TOTAL"

    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/SPUtils;->remove(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->iO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "WATCHFACE_CATEGORY"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x5f

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-class v3, [Lcom/sma/smartv3/model/WatchFaceCategory;

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3}, Lcom/blankj/utilcode/util/SPUtils;->remove(Ljava/lang/String;Z)V

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->iO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "WATCHFACE_LIST"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-class v1, [Lcom/sma/smartv3/model/WatchFaceInfo;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0, v3}, Lcom/blankj/utilcode/util/SPUtils;->remove(Ljava/lang/String;Z)V

    return-void
.end method

.method public bridge synthetic handleResponse(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lorg/json/JSONObject;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/biz/DeviceInfoChecker$getWatchFaceInfo$1;->OXO1(Lorg/json/JSONObject;)V

    return-void
.end method
