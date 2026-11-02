.class public final Lcom/szabh/smable3/entity/BleAICoachTime$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/szabh/smable3/entity/BleAICoachTime;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBleAICoachPlan.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleAICoachPlan.kt\ncom/szabh/smable3/entity/BleAICoachTime$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,337:1\n1#2:338\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBleAICoachPlan.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleAICoachPlan.kt\ncom/szabh/smable3/entity/BleAICoachTime$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,337:1\n1#2:338\n*E\n"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/szabh/smable3/entity/BleAICoachTime$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final getUtcTimeZone()Ljava/util/TimeZone;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "GMT+0"

    invoke-static {v0}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v0

    const-string v1, "getTimeZone(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final local()Lcom/szabh/smable3/entity/BleAICoachTime;
    .locals 3
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    new-instance v1, Lcom/szabh/smable3/entity/BleAICoachTime;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Lcom/szabh/smable3/entity/BleAICoachTime;-><init>(Ljava/util/Calendar;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public final ofLocal(J)Lcom/szabh/smable3/entity/BleAICoachTime;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Ljava/util/Calendar;->setTimeInMillis(J)V

    new-instance p1, Lcom/szabh/smable3/entity/BleAICoachTime;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    const/4 p2, 0x0

    invoke-direct {p1, v0, p2}, Lcom/szabh/smable3/entity/BleAICoachTime;-><init>(Ljava/util/Calendar;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1
.end method

.method public final utc()Lcom/szabh/smable3/entity/BleAICoachTime;
    .locals 3
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    sget-object v1, Lcom/szabh/smable3/entity/BleAICoachTime;->Companion:Lcom/szabh/smable3/entity/BleAICoachTime$Companion;

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleAICoachTime$Companion;->getUtcTimeZone()Ljava/util/TimeZone;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/Calendar;->setTimeZone(Ljava/util/TimeZone;)V

    new-instance v1, Lcom/szabh/smable3/entity/BleAICoachTime;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Lcom/szabh/smable3/entity/BleAICoachTime;-><init>(Ljava/util/Calendar;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method
