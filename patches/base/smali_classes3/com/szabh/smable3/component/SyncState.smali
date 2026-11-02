.class public final Lcom/szabh/smable3/component/SyncState;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final COMPLETED:I = 0x0

.field public static final DISCONNECTED:I = -0x2

.field public static final INSTANCE:Lcom/szabh/smable3/component/SyncState;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final SYNCING:I = 0x1

.field public static final TIMEOUT:I = -0x1


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/szabh/smable3/component/SyncState;

    invoke-direct {v0}, Lcom/szabh/smable3/component/SyncState;-><init>()V

    sput-object v0, Lcom/szabh/smable3/component/SyncState;->INSTANCE:Lcom/szabh/smable3/component/SyncState;

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

    const/4 v0, -0x2

    if-eq p1, v0, :cond_3

    const/4 v0, -0x1

    if-eq p1, v0, :cond_2

    if-eqz p1, :cond_1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    const-string p1, "Unknown"

    return-object p1

    :cond_0
    const-string p1, "Syncing"

    return-object p1

    :cond_1
    const-string p1, "completed"

    return-object p1

    :cond_2
    const-string p1, "Timeout"

    return-object p1

    :cond_3
    const-string p1, "Disconnected"

    return-object p1
.end method
