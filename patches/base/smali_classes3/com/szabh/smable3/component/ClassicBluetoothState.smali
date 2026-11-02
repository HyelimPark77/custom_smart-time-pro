.class public final Lcom/szabh/smable3/component/ClassicBluetoothState;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final CLOSE:I = 0x0

.field public static final CLOSE_SUCCESSFULLY:I = 0x2

.field public static final INSTANCE:Lcom/szabh/smable3/component/ClassicBluetoothState;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final OPEN:I = 0x1

.field public static final OPEN_SUCCESSFULLY:I = 0x3


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/szabh/smable3/component/ClassicBluetoothState;

    invoke-direct {v0}, Lcom/szabh/smable3/component/ClassicBluetoothState;-><init>()V

    sput-object v0, Lcom/szabh/smable3/component/ClassicBluetoothState;->INSTANCE:Lcom/szabh/smable3/component/ClassicBluetoothState;

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

    if-eqz p1, :cond_3

    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-eq p1, v0, :cond_0

    const-string p1, "Unknown"

    return-object p1

    :cond_0
    const-string p1, "Open Successfully"

    return-object p1

    :cond_1
    const-string p1, "Close Successfully"

    return-object p1

    :cond_2
    const-string p1, "Open"

    return-object p1

    :cond_3
    const-string p1, "Close"

    return-object p1
.end method
