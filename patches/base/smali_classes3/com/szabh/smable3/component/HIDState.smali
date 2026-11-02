.class public final Lcom/szabh/smable3/component/HIDState;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final CONNECTED:I = 0x1

.field public static final DISCONNECTED:I

.field public static final INSTANCE:Lcom/szabh/smable3/component/HIDState;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/szabh/smable3/component/HIDState;

    invoke-direct {v0}, Lcom/szabh/smable3/component/HIDState;-><init>()V

    sput-object v0, Lcom/szabh/smable3/component/HIDState;->INSTANCE:Lcom/szabh/smable3/component/HIDState;

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

    if-eqz p1, :cond_1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    const-string p1, "Unknown"

    return-object p1

    :cond_0
    const-string p1, "Connected"

    return-object p1

    :cond_1
    const-string p1, "Disconnected"

    return-object p1
.end method
