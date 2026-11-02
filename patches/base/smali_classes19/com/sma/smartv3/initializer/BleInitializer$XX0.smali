.class public final Lcom/sma/smartv3/initializer/BleInitializer$XX0;
.super Lcom/blankj/utilcode/util/ThreadUtils$SimpleTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/initializer/BleInitializer;->onReadPressure(Ljava/util/List;)V
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
    value = "SMAP\nBleInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadPressure$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2521:1\n1563#2:2522\n1634#2,3:2523\n*S KotlinDebug\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadPressure$1\n*L\n1101#1:2522\n1101#1:2523,3\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBleInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadPressure$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2521:1\n1563#2:2522\n1634#2,3:2523\n*S KotlinDebug\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadPressure$1\n*L\n1101#1:2522\n1101#1:2523,3\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic I1:J

.field public final synthetic IO:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BlePressure;",
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
            "Lcom/szabh/smable3/entity/BlePressure;",
            ">;J",
            "Ljava/util/Date;",
            "Ljava/text/SimpleDateFormat;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/initializer/BleInitializer$XX0;->IO:Ljava/util/List;

    iput-wide p2, p0, Lcom/sma/smartv3/initializer/BleInitializer$XX0;->I1:J

    iput-object p4, p0, Lcom/sma/smartv3/initializer/BleInitializer$XX0;->iX1O1:Ljava/util/Date;

    iput-object p5, p0, Lcom/sma/smartv3/initializer/BleInitializer$XX0;->X11iII1O1:Ljava/text/SimpleDateFormat;

    invoke-direct {p0}, Lcom/blankj/utilcode/util/ThreadUtils$SimpleTask;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic doInBackground()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/sma/smartv3/initializer/BleInitializer$XX0;->doInBackground()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method public doInBackground()Ljava/lang/Void;
    .locals 11

    .line 2
    sget-object v0, Lcom/sma/smartv3/initializer/BleInitializer;->IO:Lcom/sma/smartv3/initializer/BleInitializer;

    invoke-static {v0}, Lcom/sma/smartv3/initializer/BleInitializer;->OX110i(Lcom/sma/smartv3/initializer/BleInitializer;)Lcom/sma/smartv3/db/dao/PressureDao;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/initializer/BleInitializer$XX0;->IO:Ljava/util/List;

    check-cast v1, Ljava/lang/Iterable;

    iget-wide v2, p0, Lcom/sma/smartv3/initializer/BleInitializer$XX0;->I1:J

    iget-object v4, p0, Lcom/sma/smartv3/initializer/BleInitializer$XX0;->iX1O1:Ljava/util/Date;

    iget-object v5, p0, Lcom/sma/smartv3/initializer/BleInitializer$XX0;->X11iII1O1:Ljava/text/SimpleDateFormat;

    .line 3
    new-instance v6, Ljava/util/ArrayList;

    const/16 v7, 0xa

    invoke-static {v1, v7}, Lkotlin/collections/CollectionsKt__IterablesKt;->X00XIX1(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 4
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .line 5
    check-cast v7, Lcom/szabh/smable3/entity/BlePressure;

    .line 6
    new-instance v8, Lcom/sma/smartv3/db/entity/Pressure;

    invoke-direct {v8, v7, v2, v3}, Lcom/sma/smartv3/db/entity/Pressure;-><init>(Lcom/szabh/smable3/entity/BlePressure;J)V

    .line 7
    invoke-virtual {v8}, Lcom/sma/smartv3/db/entity/Pressure;->getMTime()J

    move-result-wide v9

    invoke-virtual {v4, v9, v10}, Ljava/util/Date;->setTime(J)V

    .line 8
    invoke-virtual {v5, v4}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v7

    const-string v9, "format(...)"

    invoke-static {v7, v9}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v8, v7}, Lcom/sma/smartv3/db/entity/Pressure;->setMLocalTime(Ljava/lang/String;)V

    .line 9
    invoke-interface {v6, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 10
    :cond_0
    invoke-interface {v0, v6}, Lcom/sma/smartv3/db/dao/PressureDao;->insert(Ljava/util/List;)[J

    .line 11
    const-string v0, "pressure_change"

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {v0, v2, v1, v2}, Lcom/android/mltcode/paycertificationapi/I01XX0;->XIi00iiXO(Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-object v2
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/initializer/BleInitializer$XX0;->onSuccess(Ljava/lang/Void;)V

    return-void
.end method

.method public onSuccess(Ljava/lang/Void;)V
    .locals 0

    .line 1
    return-void
.end method
