.class public final Lcom/szabh/smable3/entity/BleWorkout4$WorkoutFlag;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/szabh/smable3/entity/BleWorkout4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "WorkoutFlag"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/entity/BleWorkout4$WorkoutFlag$Companion;
    }
.end annotation


# static fields
.field public static final AI_COACH_TYPE_GRADUAL_RUN:I = 0x5

.field public static final AI_COACH_TYPE_INTERVAL_RUN:I = 0x3

.field public static final AI_COACH_TYPE_LONG_RUN:I = 0x1

.field public static final AI_COACH_TYPE_PROGRESSION:I = 0x2

.field public static final AI_COACH_TYPE_RELAXED:I = 0x0

.field public static final AI_COACH_TYPE_STEADY_RUN:I = 0x4

.field public static final Companion:Lcom/szabh/smable3/entity/BleWorkout4$WorkoutFlag$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final FLAG_AI_COACH_ASSESS:I = 0x8

.field public static final FLAG_AI_COACH_SPORT:I = 0x10

.field public static final FLAG_LACTATE_THRESHOLD:I = 0x1

.field public static final FLAG_NONE:I = 0x0

.field public static final FLAG_PILOT:I = 0x4

.field public static final FLAG_VO2MAX:I = 0x2


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/szabh/smable3/entity/BleWorkout4$WorkoutFlag$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/szabh/smable3/entity/BleWorkout4$WorkoutFlag$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/szabh/smable3/entity/BleWorkout4$WorkoutFlag;->Companion:Lcom/szabh/smable3/entity/BleWorkout4$WorkoutFlag$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
