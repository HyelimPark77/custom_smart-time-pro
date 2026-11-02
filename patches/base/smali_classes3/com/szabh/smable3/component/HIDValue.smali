.class public final Lcom/szabh/smable3/component/HIDValue;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final HOME:I = 0x5

.field public static final INSTANCE:Lcom/szabh/smable3/component/HIDValue;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final NEXT_TRACK:I = 0x0

.field public static final PLAY_OR_PAUSE:I = 0x2

.field public static final PREVIOUS_TRACK:I = 0x1

.field public static final VOLUME_DEC:I = 0x4

.field public static final VOLUME_INC:I = 0x3


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/szabh/smable3/component/HIDValue;

    invoke-direct {v0}, Lcom/szabh/smable3/component/HIDValue;-><init>()V

    sput-object v0, Lcom/szabh/smable3/component/HIDValue;->INSTANCE:Lcom/szabh/smable3/component/HIDValue;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getValue(I)Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    if-eqz p1, :cond_5

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
    const-string p1, "HOME"

    return-object p1

    :cond_1
    const-string p1, "VOLUME_DEC"

    return-object p1

    :cond_2
    const-string p1, "VOLUME_INC"

    return-object p1

    :cond_3
    const-string p1, "PLAY_OR_PAUSE"

    return-object p1

    :cond_4
    const-string p1, "PREVIOUS_TRACK"

    return-object p1

    :cond_5
    const-string p1, "NEXT_TRACK"

    return-object p1
.end method
