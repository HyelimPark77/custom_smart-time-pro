.class public final Lcom/szabh/smable3/component/WorkoutState;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final END:I = 0x4

.field public static final INSTANCE:Lcom/szabh/smable3/component/WorkoutState;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final ONGOING:I = 0x2

.field public static final PAUSE:I = 0x3

.field public static final RESUME:I = 0x5

.field public static final START:I = 0x1


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/szabh/smable3/component/WorkoutState;

    invoke-direct {v0}, Lcom/szabh/smable3/component/WorkoutState;-><init>()V

    sput-object v0, Lcom/szabh/smable3/component/WorkoutState;->INSTANCE:Lcom/szabh/smable3/component/WorkoutState;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getState(I)Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const/4 v0, 0x1

    if-eq p1, v0, :cond_4

    const/4 v0, 0x2

    if-eq p1, v0, :cond_3

    const/4 v0, 0x3

    if-eq p1, v0, :cond_2

    const/4 v0, 0x4

    if-eq p1, v0, :cond_1

    const/4 v0, 0x5

    if-eq p1, v0, :cond_0

    const-string p1, "Unknown"

    return-object p1

    :cond_0
    const-string p1, "Resume"

    return-object p1

    :cond_1
    const-string p1, "End"

    return-object p1

    :cond_2
    const-string p1, "Pause"

    return-object p1

    :cond_3
    const-string p1, "Ongoing"

    return-object p1

    :cond_4
    const-string p1, "Start"

    return-object p1
.end method
