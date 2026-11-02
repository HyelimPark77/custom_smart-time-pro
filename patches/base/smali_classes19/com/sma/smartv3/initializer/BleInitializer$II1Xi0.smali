.class public final Lcom/sma/smartv3/initializer/BleInitializer$II1Xi0;
.super Lcom/blankj/utilcode/util/ThreadUtils$SimpleTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/initializer/BleInitializer;->onReadWorkout3(Ljava/util/List;)V
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
    value = "SMAP\nBleInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadWorkout3$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2521:1\n1563#2:2522\n1634#2,3:2523\n*S KotlinDebug\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadWorkout3$1\n*L\n1692#1:2522\n1692#1:2523,3\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBleInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadWorkout3$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2521:1\n1563#2:2522\n1634#2,3:2523\n*S KotlinDebug\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadWorkout3$1\n*L\n1692#1:2522\n1692#1:2523,3\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic I1:J

.field public final synthetic IO:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleWorkout3;",
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
            "Lcom/szabh/smable3/entity/BleWorkout3;",
            ">;J",
            "Ljava/util/Date;",
            "Ljava/text/SimpleDateFormat;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/initializer/BleInitializer$II1Xi0;->IO:Ljava/util/List;

    iput-wide p2, p0, Lcom/sma/smartv3/initializer/BleInitializer$II1Xi0;->I1:J

    iput-object p4, p0, Lcom/sma/smartv3/initializer/BleInitializer$II1Xi0;->iX1O1:Ljava/util/Date;

    iput-object p5, p0, Lcom/sma/smartv3/initializer/BleInitializer$II1Xi0;->X11iII1O1:Ljava/text/SimpleDateFormat;

    invoke-direct {p0}, Lcom/blankj/utilcode/util/ThreadUtils$SimpleTask;-><init>()V

    return-void
.end method

.method public static synthetic OXO1(Lcom/sma/smartv3/db/entity/WorkoutIndex;Z)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/initializer/BleInitializer$II1Xi0;->XIi00iiXO(Lcom/sma/smartv3/db/entity/WorkoutIndex;Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private static final XIi00iiXO(Lcom/sma/smartv3/db/entity/WorkoutIndex;Z)Lkotlin/Unit;
    .locals 0

    if-nez p1, :cond_0

    sget-object p1, Lcom/sma/smartv3/initializer/BleInitializer;->IO:Lcom/sma/smartv3/initializer/BleInitializer;

    invoke-static {p1}, Lcom/sma/smartv3/initializer/BleInitializer;->i11I(Lcom/sma/smartv3/initializer/BleInitializer;)Lcom/sma/smartv3/db/dao/WorkoutIndexDao;

    move-result-object p1

    invoke-interface {p1, p0}, Lcom/sma/smartv3/db/dao/WorkoutIndexDao;->insert(Lcom/sma/smartv3/db/entity/WorkoutIndex;)J

    :cond_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic doInBackground()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/sma/smartv3/initializer/BleInitializer$II1Xi0;->doInBackground()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method public doInBackground()Ljava/lang/Void;
    .locals 19

    move-object/from16 v0, p0

    .line 2
    sget-object v1, Lcom/sma/smartv3/initializer/BleInitializer;->IO:Lcom/sma/smartv3/initializer/BleInitializer;

    invoke-static {v1}, Lcom/sma/smartv3/initializer/BleInitializer;->i0X000X0O(Lcom/sma/smartv3/initializer/BleInitializer;)Lcom/sma/smartv3/db/dao/WorkoutDao;

    move-result-object v1

    iget-object v2, v0, Lcom/sma/smartv3/initializer/BleInitializer$II1Xi0;->IO:Ljava/util/List;

    check-cast v2, Ljava/lang/Iterable;

    iget-wide v3, v0, Lcom/sma/smartv3/initializer/BleInitializer$II1Xi0;->I1:J

    iget-object v5, v0, Lcom/sma/smartv3/initializer/BleInitializer$II1Xi0;->iX1O1:Ljava/util/Date;

    iget-object v6, v0, Lcom/sma/smartv3/initializer/BleInitializer$II1Xi0;->X11iII1O1:Ljava/text/SimpleDateFormat;

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

    if-eqz v8, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    .line 5
    check-cast v8, Lcom/szabh/smable3/entity/BleWorkout3;

    .line 6
    new-instance v9, Lcom/sma/smartv3/db/entity/Workout;

    invoke-direct {v9, v8, v3, v4}, Lcom/sma/smartv3/db/entity/Workout;-><init>(Lcom/szabh/smable3/entity/BleWorkout3;J)V

    .line 7
    invoke-virtual {v9}, Lcom/sma/smartv3/db/entity/Workout;->getMStart()J

    move-result-wide v10

    invoke-virtual {v5, v10, v11}, Ljava/util/Date;->setTime(J)V

    .line 8
    invoke-virtual {v6, v5}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v8

    const-string v10, "format(...)"

    invoke-static {v8, v10}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v9, v8}, Lcom/sma/smartv3/db/entity/Workout;->setMLocalTime(Ljava/lang/String;)V

    .line 9
    sget-object v8, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    invoke-virtual {v8}, Lcom/szabh/smable3/component/BaseBleCache;->getMBleName()Ljava/lang/String;

    move-result-object v10

    invoke-interface {v10}, Ljava/lang/CharSequence;->length()I

    move-result v10

    if-lez v10, :cond_0

    .line 10
    invoke-virtual {v8}, Lcom/szabh/smable3/component/BaseBleCache;->getMFirmwareFlag()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Lcom/sma/smartv3/db/entity/Workout;->setMFirmwareFlag(Ljava/lang/String;)V

    .line 11
    invoke-virtual {v8}, Lcom/szabh/smable3/component/BaseBleCache;->getMPrototype()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Lcom/sma/smartv3/db/entity/Workout;->setMPrototype(Ljava/lang/String;)V

    .line 12
    invoke-virtual {v8}, Lcom/szabh/smable3/component/BaseBleCache;->getMBleName()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Lcom/sma/smartv3/db/entity/Workout;->setMBleName(Ljava/lang/String;)V

    .line 13
    invoke-virtual {v8}, Lcom/szabh/smable3/component/BaseBleCache;->getMPlatform()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Lcom/sma/smartv3/db/entity/Workout;->setMPlatform(Ljava/lang/String;)V

    .line 14
    invoke-virtual {v8}, Lcom/szabh/smable3/component/BaseBleCache;->getMAGpsType()I

    move-result v8

    invoke-virtual {v9, v8}, Lcom/sma/smartv3/db/entity/Workout;->setMAGpsType(I)V

    .line 15
    :cond_0
    invoke-virtual {v9}, Lcom/sma/smartv3/db/entity/Workout;->getMMode()I

    move-result v15

    .line 16
    invoke-virtual {v9}, Lcom/sma/smartv3/db/entity/Workout;->getMEnd()J

    move-result-wide v13

    .line 17
    new-instance v10, Lcom/sma/smartv3/db/entity/WorkoutIndex;

    const/16 v17, 0x11

    const/16 v18, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x2

    const/16 v16, 0x0

    invoke-direct/range {v10 .. v18}, Lcom/sma/smartv3/db/entity/WorkoutIndex;-><init>(IIJIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 18
    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->getApp()Landroid/app/Application;

    move-result-object v8

    const-string v11, "getApp(...)"

    invoke-static {v8, v11}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v11, Lcom/android/mltcode/paycertificationapi/I0ii0iI;

    invoke-direct {v11, v10}, Lcom/android/mltcode/paycertificationapi/I0ii0iI;-><init>(Lcom/sma/smartv3/db/entity/WorkoutIndex;)V

    invoke-static {v8, v10, v11}, Lcom/android/mltcode/paycertificationapi/XXI0Xi;->XOO0ii0(Landroid/content/Context;Lcom/sma/smartv3/db/entity/WorkoutIndex;Lkotlin/jvm/functions/Function1;)V

    .line 19
    invoke-interface {v7, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 20
    :cond_1
    invoke-interface {v1, v7}, Lcom/sma/smartv3/db/dao/WorkoutDao;->insert(Ljava/util/List;)[J

    .line 21
    const-string v1, "workout_change"

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v1, v3, v2, v3}, Lcom/android/mltcode/paycertificationapi/I01XX0;->XIi00iiXO(Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-object v3
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/initializer/BleInitializer$II1Xi0;->onSuccess(Ljava/lang/Void;)V

    return-void
.end method

.method public onSuccess(Ljava/lang/Void;)V
    .locals 0

    .line 1
    return-void
.end method
