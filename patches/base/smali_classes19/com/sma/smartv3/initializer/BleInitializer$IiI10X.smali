.class public final Lcom/sma/smartv3/initializer/BleInitializer$IiI10X;
.super Lcom/blankj/utilcode/util/ThreadUtils$SimpleTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/initializer/BleInitializer;->onReadAlipayBindInfo(Ljava/util/List;)V
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
    value = "SMAP\nBleInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadAlipayBindInfo$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2521:1\n1563#2:2522\n1634#2,3:2523\n*S KotlinDebug\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadAlipayBindInfo$1\n*L\n2021#1:2522\n2021#1:2523,3\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBleInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadAlipayBindInfo$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2521:1\n1563#2:2522\n1634#2,3:2523\n*S KotlinDebug\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadAlipayBindInfo$1\n*L\n2021#1:2522\n2021#1:2523,3\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic I1:J

.field public final synthetic IO:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleAlipayBindInfo;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic X11iII1O1:Ljava/text/SimpleDateFormat;

.field public final synthetic iX1O1:Ljava/util/Date;


# direct methods
.method public constructor <init>(Ljava/util/List;JLjava/util/Date;Ljava/text/SimpleDateFormat;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleAlipayBindInfo;",
            ">;J",
            "Ljava/util/Date;",
            "Ljava/text/SimpleDateFormat;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/initializer/BleInitializer$IiI10X;->IO:Ljava/util/List;

    iput-wide p2, p0, Lcom/sma/smartv3/initializer/BleInitializer$IiI10X;->I1:J

    iput-object p4, p0, Lcom/sma/smartv3/initializer/BleInitializer$IiI10X;->iX1O1:Ljava/util/Date;

    iput-object p5, p0, Lcom/sma/smartv3/initializer/BleInitializer$IiI10X;->X11iII1O1:Ljava/text/SimpleDateFormat;

    invoke-direct {p0}, Lcom/blankj/utilcode/util/ThreadUtils$SimpleTask;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic doInBackground()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/sma/smartv3/initializer/BleInitializer$IiI10X;->doInBackground()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method public doInBackground()Ljava/lang/Void;
    .locals 18

    move-object/from16 v0, p0

    .line 2
    sget-object v1, Lcom/sma/smartv3/initializer/BleInitializer;->IO:Lcom/sma/smartv3/initializer/BleInitializer;

    invoke-static {v1}, Lcom/sma/smartv3/initializer/BleInitializer;->XXX11i(Lcom/sma/smartv3/initializer/BleInitializer;)Lcom/sma/smartv3/db/dao/AlipayBindInfoDao;

    move-result-object v1

    iget-object v2, v0, Lcom/sma/smartv3/initializer/BleInitializer$IiI10X;->IO:Ljava/util/List;

    check-cast v2, Ljava/lang/Iterable;

    iget-wide v3, v0, Lcom/sma/smartv3/initializer/BleInitializer$IiI10X;->I1:J

    iget-object v5, v0, Lcom/sma/smartv3/initializer/BleInitializer$IiI10X;->iX1O1:Ljava/util/Date;

    iget-object v6, v0, Lcom/sma/smartv3/initializer/BleInitializer$IiI10X;->X11iII1O1:Ljava/text/SimpleDateFormat;

    .line 3
    new-instance v7, Ljava/util/ArrayList;

    const/16 v8, 0xa

    invoke-static {v2, v8}, Lkotlin/collections/CollectionsKt__IterablesKt;->X00XIX1(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 4
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    .line 5
    check-cast v8, Lcom/szabh/smable3/entity/BleAlipayBindInfo;

    .line 6
    new-instance v9, Lcom/sma/smartv3/db/entity/AlipayBindInfo;

    invoke-direct {v9, v8, v3, v4}, Lcom/sma/smartv3/db/entity/AlipayBindInfo;-><init>(Lcom/szabh/smable3/entity/BleAlipayBindInfo;J)V

    .line 7
    invoke-virtual {v9}, Lcom/sma/smartv3/db/entity/AlipayBindInfo;->getMTime()J

    move-result-wide v10

    invoke-virtual {v5, v10, v11}, Ljava/util/Date;->setTime(J)V

    .line 8
    invoke-virtual {v6, v5}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v8

    const-string v10, "format(...)"

    invoke-static {v8, v10}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v9, v8}, Lcom/sma/smartv3/db/entity/AlipayBindInfo;->setMLocalTime(Ljava/lang/String;)V

    .line 9
    sget-object v11, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    invoke-virtual {v11}, Lcom/szabh/smable3/component/BaseBleCache;->getMBleName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v9, v8}, Lcom/sma/smartv3/db/entity/AlipayBindInfo;->setMBleName(Ljava/lang/String;)V

    .line 10
    invoke-virtual {v11}, Lcom/szabh/smable3/component/BaseBleCache;->getMFirmwareFlag()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v9, v8}, Lcom/sma/smartv3/db/entity/AlipayBindInfo;->setMFirmwareFlag(Ljava/lang/String;)V

    .line 11
    sget-object v12, Lcom/szabh/smable3/BleKey;->FIRMWARE_VERSION:Lcom/szabh/smable3/BleKey;

    const/4 v15, 0x4

    const/16 v16, 0x0

    const-string v13, "0.0.0"

    const/4 v14, 0x0

    invoke-static/range {v11 .. v16}, Lcom/szabh/smable3/component/BaseBleCache;->getString$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;Ljava/lang/String;Lcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v9, v8}, Lcom/sma/smartv3/db/entity/AlipayBindInfo;->setMFirmwareVersion(Ljava/lang/String;)V

    .line 12
    invoke-virtual {v11}, Lcom/szabh/smable3/component/BaseBleCache;->getMBleAddress()Ljava/lang/String;

    move-result-object v12

    const/16 v16, 0x4

    const/16 v17, 0x0

    const-string v13, ":"

    const-string v14, ""

    const/4 v15, 0x0

    invoke-static/range {v12 .. v17}, Lcom/android/mltcode/paycertificationapi/oe5;->IXO0OOi(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v9, v8}, Lcom/sma/smartv3/db/entity/AlipayBindInfo;->setMMacAddress(Ljava/lang/String;)V

    .line 13
    invoke-static {}, Lcom/blankj/utilcode/util/AppUtils;->getAppVersionName()Ljava/lang/String;

    move-result-object v8

    const-string v10, "getAppVersionName(...)"

    invoke-static {v8, v10}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v9, v8}, Lcom/sma/smartv3/db/entity/AlipayBindInfo;->setMAppVersion(Ljava/lang/String;)V

    .line 14
    invoke-interface {v7, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 15
    :cond_0
    invoke-interface {v1, v7}, Lcom/sma/smartv3/db/dao/AlipayBindInfoDao;->insert(Ljava/util/List;)[J

    .line 16
    const-string v1, "alipaybindinfo_change"

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v1, v3, v2, v3}, Lcom/android/mltcode/paycertificationapi/I01XX0;->XIi00iiXO(Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-object v3
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/initializer/BleInitializer$IiI10X;->onSuccess(Ljava/lang/Void;)V

    return-void
.end method

.method public onSuccess(Ljava/lang/Void;)V
    .locals 0

    .line 1
    return-void
.end method
